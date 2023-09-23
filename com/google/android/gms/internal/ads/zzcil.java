package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcil implements zzayr {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzc = new AtomicReference();
    private final int zze;
    private final int zzf;
    private final String zzg;
    private final zzayq zzh;
    private final zzayx zzi;
    private zzayk zzj;
    private HttpURLConnection zzk;
    private InputStream zzl;
    private boolean zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private int zzr;
    private final SSLSocketFactory zzd = new zzcik(this);
    private final Set zzs = new HashSet();

    public zzcil(String str, zzayx zzayxVar, int i2, int i3, int i4) {
        zzayy.zzb(str);
        this.zzg = str;
        this.zzi = zzayxVar;
        this.zzh = new zzayq();
        this.zze = i2;
        this.zzf = i3;
        this.zzr = i4;
    }

    private final void zzi() {
        HttpURLConnection httpURLConnection = this.zzk;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                zzcfi.zzh("Unexpected error while disconnecting", e2);
            }
            this.zzk = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final int zza(byte[] bArr, int i2, int i3) {
        try {
            if (this.zzp != this.zzn) {
                byte[] bArr2 = (byte[]) zzc.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j2 = this.zzp;
                    long j3 = this.zzn;
                    if (j2 != j3) {
                        int read = this.zzl.read(bArr2, 0, (int) Math.min(j3 - j2, bArr2.length));
                        if (Thread.interrupted()) {
                            throw new InterruptedIOException();
                        }
                        if (read != -1) {
                            this.zzp += read;
                            zzayx zzayxVar = this.zzi;
                            if (zzayxVar != null) {
                                ((zzciz) zzayxVar).zzW(this, read);
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
            long j4 = this.zzo;
            if (j4 != -1) {
                long j5 = j4 - this.zzq;
                if (j5 != 0) {
                    i3 = (int) Math.min(i3, j5);
                }
                return -1;
            }
            int read2 = this.zzl.read(bArr, i2, i3);
            if (read2 == -1) {
                if (this.zzo == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzq += read2;
            zzayx zzayxVar2 = this.zzi;
            if (zzayxVar2 != null) {
                ((zzciz) zzayxVar2).zzW(this, read2);
                return read2;
            }
            return read2;
        } catch (IOException e2) {
            throw new zzayo(e2, this.zzj, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f6, code lost:
        if (r3 != 0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x024a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021a A[Catch: IOException -> 0x0269, TryCatch #0 {IOException -> 0x0269, blocks: (B:3:0x000e, B:4:0x001e, B:6:0x0024, B:8:0x002e, B:9:0x0036, B:10:0x004e, B:12:0x0054, B:19:0x0078, B:21:0x0092, B:22:0x00a3, B:23:0x00a8, B:36:0x00de, B:91:0x020f, B:93:0x021a, B:95:0x022b, B:98:0x0234, B:99:0x0243, B:101:0x024a, B:102:0x0251, B:103:0x0252, B:104:0x0268), top: B:108:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzayi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzayk r20) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcil.zzb(com.google.android.gms.internal.ads.zzayk):long");
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzk;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zzd() {
        try {
            if (this.zzl != null) {
                HttpURLConnection httpURLConnection = this.zzk;
                long j2 = this.zzo;
                if (j2 != -1) {
                    j2 -= this.zzq;
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
                    this.zzl.close();
                } catch (IOException e2) {
                    throw new zzayo(e2, this.zzj, 3);
                }
            }
        } finally {
            this.zzl = null;
            zzi();
            if (this.zzm) {
                this.zzm = false;
            }
            this.zzs.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayr
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzk;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final void zzh(int i2) {
        this.zzr = i2;
        for (Socket socket : this.zzs) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzr);
                } catch (SocketException e2) {
                    zzcfi.zzk("Failed to update receive buffer size.", e2);
                }
            }
        }
    }
}
