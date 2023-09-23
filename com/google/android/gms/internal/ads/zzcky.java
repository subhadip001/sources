package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.crashlytics.internal.settings.DefaultSettingsSpiCall;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcky extends zzek implements zzfo {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzfn zzf;
    private zzew zzg;
    private HttpURLConnection zzh;
    private final Queue zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private final long zzr;
    private final long zzs;

    public zzcky(String str, zzft zzftVar, int i2, int i3, long j2, long j3) {
        super(true);
        zzcw.zzc(str);
        this.zze = str;
        this.zzf = new zzfn();
        this.zzc = i2;
        this.zzd = i3;
        this.zzi = new ArrayDeque();
        this.zzr = j2;
        this.zzs = j3;
        if (zzftVar != null) {
            zzf(zzftVar);
        }
    }

    private final void zzl() {
        while (!this.zzi.isEmpty()) {
            try {
                ((HttpURLConnection) this.zzi.remove()).disconnect();
            } catch (Exception e2) {
                zzcfi.zzh("Unexpected error while disconnecting", e2);
            }
        }
        this.zzh = null;
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        try {
            long j2 = this.zzm;
            long j3 = this.zzn;
            if (j2 - j3 == 0) {
                return -1;
            }
            long j4 = i3;
            long j5 = this.zzs;
            long j6 = this.zzq;
            long j7 = j6 + 1;
            if (this.zzo + j3 + j4 + j5 > j7) {
                long j8 = this.zzp;
                if (j6 < j8) {
                    long min = Math.min(j8, Math.max(((this.zzr + j7) - j5) - 1, (-1) + j7 + j4));
                    zzk(j7, min, 2);
                    this.zzq = min;
                    j6 = min;
                }
            }
            int read = this.zzj.read(bArr, i2, (int) Math.min(j4, ((j6 + 1) - this.zzo) - this.zzn));
            if (read != -1) {
                this.zzn += read;
                zzg(read);
                return read;
            }
            throw new EOFException();
        } catch (IOException e2) {
            throw new zzfk(e2, this.zzg, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final long zzb(zzew zzewVar) {
        this.zzg = zzewVar;
        this.zzn = 0L;
        long j2 = zzewVar.zzf;
        long j3 = zzewVar.zzg;
        long min = j3 == -1 ? this.zzr : Math.min(this.zzr, j3);
        this.zzo = j2;
        HttpURLConnection zzk = zzk(j2, (min + j2) - 1, 1);
        this.zzh = zzk;
        String headerField = zzk.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zzb.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j4 = zzewVar.zzg;
                    if (j4 != -1) {
                        this.zzm = j4;
                        this.zzp = Math.max(parseLong, (this.zzo + j4) - 1);
                    } else {
                        this.zzm = parseLong2 - this.zzo;
                        this.zzp = parseLong2 - 1;
                    }
                    this.zzq = parseLong;
                    this.zzk = true;
                    zzj(zzewVar);
                    return this.zzm;
                } catch (NumberFormatException unused) {
                    zzcfi.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new zzckw(headerField, zzewVar);
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final void zzd() {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    throw new zzfk(e2, this.zzg, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzl();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzek, com.google.android.gms.internal.ads.zzer, com.google.android.gms.internal.ads.zzfo
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @VisibleForTesting
    public final HttpURLConnection zzk(long j2, long j3, int i2) {
        String uri = this.zzg.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.zzc);
            httpURLConnection.setReadTimeout(this.zzd);
            for (Map.Entry entry : this.zzf.zza().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j2 + "-" + j3);
            httpURLConnection.setRequestProperty(DefaultSettingsSpiCall.HEADER_USER_AGENT, this.zze);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzi.add(httpURLConnection);
            String uri2 = this.zzg.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.zzl = responseCode;
                if (responseCode >= 200 && responseCode <= 299) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (this.zzj != null) {
                            inputStream = new SequenceInputStream(this.zzj, inputStream);
                        }
                        this.zzj = inputStream;
                        return httpURLConnection;
                    } catch (IOException e2) {
                        zzl();
                        throw new zzfk(e2, this.zzg, 2000, i2);
                    }
                }
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                zzl();
                throw new zzckx(this.zzl, headerFields, this.zzg, i2);
            } catch (IOException e3) {
                zzl();
                throw new zzfk("Unable to connect to ".concat(String.valueOf(uri2)), e3, this.zzg, 2000, i2);
            }
        } catch (IOException e4) {
            throw new zzfk("Unable to connect to ".concat(String.valueOf(uri)), e4, this.zzg, 2000, i2);
        }
    }
}
