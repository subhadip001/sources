package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaym implements zzayr {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzc = new AtomicReference();
    private final int zzd;
    private final int zze;
    private final String zzf;
    private final zzayq zzg;
    private final zzayx zzh;
    private zzayk zzi;
    private HttpURLConnection zzj;
    private InputStream zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;

    public zzaym(String str, zzazi zzaziVar, zzayx zzayxVar, int i2, int i3, boolean z, zzayq zzayqVar) {
        zzayy.zzb(str);
        this.zzf = str;
        this.zzh = zzayxVar;
        this.zzg = new zzayq();
        this.zzd = i2;
        this.zze = i3;
    }

    private final void zzf() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.zzj = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final int zza(byte[] bArr, int i2, int i3) {
        try {
            if (this.zzo != this.zzm) {
                byte[] bArr2 = (byte[]) zzc.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j2 = this.zzo;
                    long j3 = this.zzm;
                    if (j2 != j3) {
                        int read = this.zzk.read(bArr2, 0, (int) Math.min(j3 - j2, bArr2.length));
                        if (Thread.interrupted()) {
                            throw new InterruptedIOException();
                        }
                        if (read != -1) {
                            this.zzo += read;
                            zzayx zzayxVar = this.zzh;
                            if (zzayxVar != null) {
                                zzayxVar.zzj(this, read);
                            }
                        } else {
                            throw new EOFException();
                        }
                    } else {
                        zzc.set(bArr2);
                        break;
                    }
                }
            }
            if (i3 == 0) {
                return 0;
            }
            long j4 = this.zzn;
            if (j4 != -1) {
                long j5 = j4 - this.zzp;
                if (j5 != 0) {
                    i3 = (int) Math.min(i3, j5);
                }
                return -1;
            }
            int read2 = this.zzk.read(bArr, i2, i3);
            if (read2 == -1) {
                if (this.zzn == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzp += read2;
            zzayx zzayxVar2 = this.zzh;
            if (zzayxVar2 != null) {
                zzayxVar2.zzj(this, read2);
                return read2;
            }
            return read2;
        } catch (IOException e2) {
            throw new zzayo(e2, this.zzi, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ef, code lost:
        if (r3 != 0) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0213 A[Catch: IOException -> 0x0262, TryCatch #3 {IOException -> 0x0262, blocks: (B:3:0x000e, B:4:0x001e, B:6:0x0024, B:7:0x0042, B:9:0x0048, B:16:0x006c, B:18:0x0086, B:19:0x0097, B:20:0x009c, B:33:0x00d2, B:89:0x0208, B:91:0x0213, B:93:0x0224, B:96:0x022d, B:97:0x023c, B:99:0x0243, B:100:0x024a, B:101:0x024b, B:102:0x0261), top: B:112:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzayi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzayk r20) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaym.zzb(com.google.android.gms.internal.ads.zzayk):long");
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zzd() {
        try {
            if (this.zzk != null) {
                HttpURLConnection httpURLConnection = this.zzj;
                long j2 = this.zzn;
                if (j2 != -1) {
                    j2 -= this.zzp;
                }
                int i2 = zzazn.zza;
                if (i2 == 19 || i2 == 20) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (j2 == -1) {
                            if (inputStream.read() != -1) {
                            }
                        } else if (j2 <= 2048) {
                        }
                        String name = inputStream.getClass().getName();
                        if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                            Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(inputStream, new Object[0]);
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    this.zzk.close();
                } catch (IOException e2) {
                    throw new zzayo(e2, this.zzi, 3);
                }
            }
        } finally {
            this.zzk = null;
            zzf();
            if (this.zzl) {
                this.zzl = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayr
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
