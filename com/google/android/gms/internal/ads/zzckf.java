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
public final class zzckf extends zzek implements zzfo {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzc = new AtomicReference();
    private final SSLSocketFactory zzd;
    private final int zze;
    private final int zzf;
    private final String zzg;
    private final zzfn zzh;
    private zzew zzi;
    private HttpURLConnection zzj;
    private InputStream zzk;
    private boolean zzl;
    private int zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private int zzr;
    private final Set zzs;

    public zzckf(String str, zzft zzftVar, int i2, int i3, int i4) {
        super(true);
        this.zzd = new zzcke(this);
        this.zzs = new HashSet();
        zzcw.zzc(str);
        this.zzg = str;
        this.zzh = new zzfn();
        this.zze = i2;
        this.zzf = i3;
        this.zzr = i4;
        if (zzftVar != null) {
            zzf(zzftVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                zzcfi.zzh("Unexpected error while disconnecting", e2);
            }
            this.zzj = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzp
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
                        int read = this.zzk.read(bArr2, 0, (int) Math.min(j3 - j2, bArr2.length));
                        if (Thread.interrupted()) {
                            throw new InterruptedIOException();
                        }
                        if (read != -1) {
                            this.zzp += read;
                            zzg(read);
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
            int read2 = this.zzk.read(bArr, i2, i3);
            if (read2 == -1) {
                if (this.zzo == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzq += read2;
            zzg(read2);
            return read2;
        } catch (IOException e2) {
            throw new zzfk(e2, this.zzi, 2000, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0100, code lost:
        if (r2 != 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7 A[Catch: IOException -> 0x0291, TryCatch #3 {IOException -> 0x0291, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x003b, B:10:0x0053, B:12:0x0059, B:19:0x007d, B:21:0x0097, B:22:0x00a9, B:23:0x00ae, B:25:0x00b7, B:26:0x00be, B:39:0x00e6, B:94:0x0236, B:96:0x0241, B:98:0x0252, B:101:0x025b, B:102:0x026a, B:104:0x0272, B:105:0x0279, B:106:0x027a, B:107:0x0290), top: B:117:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0241 A[Catch: IOException -> 0x0291, TryCatch #3 {IOException -> 0x0291, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x003b, B:10:0x0053, B:12:0x0059, B:19:0x007d, B:21:0x0097, B:22:0x00a9, B:23:0x00ae, B:25:0x00b7, B:26:0x00be, B:39:0x00e6, B:94:0x0236, B:96:0x0241, B:98:0x0252, B:101:0x025b, B:102:0x026a, B:104:0x0272, B:105:0x0279, B:106:0x027a, B:107:0x0290), top: B:117:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzew r21) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzckf.zzb(com.google.android.gms.internal.ads.zzew):long");
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final void zzd() {
        try {
            if (this.zzk != null) {
                HttpURLConnection httpURLConnection = this.zzj;
                long j2 = this.zzo;
                if (j2 != -1) {
                    j2 -= this.zzq;
                }
                int i2 = zzeg.zza;
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
                    throw new zzfk(e2, this.zzi, 2000, 3);
                }
            }
        } finally {
            this.zzk = null;
            zzn();
            if (this.zzl) {
                this.zzl = false;
                zzh();
            }
            this.zzs.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzek, com.google.android.gms.internal.ads.zzer, com.google.android.gms.internal.ads.zzfo
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final void zzm(int i2) {
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
