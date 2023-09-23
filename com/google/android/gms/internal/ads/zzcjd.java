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
public final class zzcjd implements zzayr {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzayq zzf;
    private final zzayx zzg;
    private zzayk zzh;
    private HttpURLConnection zzi;
    private final Queue zzj;
    private InputStream zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private final long zzr;
    private final long zzs;

    public zzcjd(String str, zzayx zzayxVar, int i2, int i3, long j2, long j3) {
        zzayy.zzb(str);
        this.zze = str;
        this.zzg = zzayxVar;
        this.zzf = new zzayq();
        this.zzc = i2;
        this.zzd = i3;
        this.zzj = new ArrayDeque();
        this.zzr = j2;
        this.zzs = j3;
    }

    private final void zzg() {
        while (!this.zzj.isEmpty()) {
            try {
                ((HttpURLConnection) this.zzj.remove()).disconnect();
            } catch (Exception e2) {
                zzcfi.zzh("Unexpected error while disconnecting", e2);
            }
        }
        this.zzi = null;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
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
                    zzf(j7, min, 2);
                    this.zzq = min;
                    j6 = min;
                }
            }
            int read = this.zzk.read(bArr, i2, (int) Math.min(j4, ((j6 + 1) - this.zzo) - this.zzn));
            if (read != -1) {
                this.zzn += read;
                zzayx zzayxVar = this.zzg;
                if (zzayxVar != null) {
                    ((zzciz) zzayxVar).zzW(this, read);
                }
                return read;
            }
            throw new EOFException();
        } catch (IOException e2) {
            throw new zzayo(e2, this.zzh, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final long zzb(zzayk zzaykVar) {
        this.zzh = zzaykVar;
        this.zzn = 0L;
        long j2 = zzaykVar.zzc;
        long j3 = zzaykVar.zzd;
        long min = j3 == -1 ? this.zzr : Math.min(this.zzr, j3);
        this.zzo = j2;
        HttpURLConnection zzf = zzf(j2, (min + j2) - 1, 1);
        this.zzi = zzf;
        String headerField = zzf.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zzb.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j4 = zzaykVar.zzd;
                    if (j4 != -1) {
                        this.zzm = j4;
                        this.zzp = Math.max(parseLong, (this.zzo + j4) - 1);
                    } else {
                        this.zzm = parseLong2 - this.zzo;
                        this.zzp = parseLong2 - 1;
                    }
                    this.zzq = parseLong;
                    this.zzl = true;
                    zzayx zzayxVar = this.zzg;
                    if (zzayxVar != null) {
                        ((zzciz) zzayxVar).zzk(this, zzaykVar);
                    }
                    return this.zzm;
                } catch (NumberFormatException unused) {
                    zzcfi.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new zzcjb(headerField, zzaykVar);
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zzd() {
        try {
            InputStream inputStream = this.zzk;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    throw new zzayo(e2, this.zzh, 3);
                }
            }
        } finally {
            this.zzk = null;
            zzg();
            if (this.zzl) {
                this.zzl = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayr
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @VisibleForTesting
    public final HttpURLConnection zzf(long j2, long j3, int i2) {
        String uri = this.zzh.zza.toString();
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
            this.zzj.add(httpURLConnection);
            String uri2 = this.zzh.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode >= 200 && responseCode <= 299) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (this.zzk != null) {
                            inputStream = new SequenceInputStream(this.zzk, inputStream);
                        }
                        this.zzk = inputStream;
                        return httpURLConnection;
                    } catch (IOException e2) {
                        zzg();
                        throw new zzayo(e2, this.zzh, i2);
                    }
                }
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                zzg();
                throw new zzcjc(responseCode, headerFields, this.zzh, i2);
            } catch (IOException e3) {
                zzg();
                throw new zzayo("Unable to connect to ".concat(String.valueOf(uri2)), e3, this.zzh, i2);
            }
        } catch (IOException e4) {
            throw new zzayo("Unable to connect to ".concat(String.valueOf(uri)), e4, this.zzh, i2);
        }
    }
}
