package com.google.android.gms.internal.ads;

import android.net.Uri;
import f.a.b.a.a;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfe extends zzek implements zzfo {
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzfn zzf;
    private final zzfn zzg;
    private zzew zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;

    @Deprecated
    public zzfe() {
        this(null, 8000, 8000, false, null, null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.net.HttpURLConnection zzk(java.net.URL r3, int r4, byte[] r5, long r6, long r8, boolean r10, boolean r11, java.util.Map r12) {
        /*
            r2 = this;
            java.net.URLConnection r3 = r3.openConnection()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            int r4 = r2.zzc
            r3.setConnectTimeout(r4)
            int r4 = r2.zzd
            r3.setReadTimeout(r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.google.android.gms.internal.ads.zzfn r5 = r2.zzf
            java.util.Map r5 = r5.zza()
            r4.putAll(r5)
            com.google.android.gms.internal.ads.zzfn r5 = r2.zzg
            java.util.Map r5 = r5.zza()
            r4.putAll(r5)
            r4.putAll(r12)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r12 = r5.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            r3.setRequestProperty(r12, r5)
            goto L32
        L4e:
            r4 = 0
            r0 = -1
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 != 0) goto L5d
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 != 0) goto L5c
            r4 = 0
            goto L7c
        L5c:
            r6 = r4
        L5d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "bytes="
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = "-"
            r4.append(r5)
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 == 0) goto L78
            long r6 = r6 + r8
            long r6 = r6 + r0
            r4.append(r6)
        L78:
            java.lang.String r4 = r4.toString()
        L7c:
            if (r4 == 0) goto L83
            java.lang.String r5 = "Range"
            r3.setRequestProperty(r5, r4)
        L83:
            java.lang.String r4 = r2.zze
            if (r4 == 0) goto L8c
            java.lang.String r5 = "User-Agent"
            r3.setRequestProperty(r5, r4)
        L8c:
            r4 = 1
            if (r4 == r10) goto L92
            java.lang.String r5 = "identity"
            goto L94
        L92:
            java.lang.String r5 = "gzip"
        L94:
            java.lang.String r6 = "Accept-Encoding"
            r3.setRequestProperty(r6, r5)
            r3.setInstanceFollowRedirects(r11)
            r5 = 0
            r3.setDoOutput(r5)
            java.lang.String r4 = com.google.android.gms.internal.ads.zzew.zza(r4)
            r3.setRequestMethod(r4)
            r3.connect()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfe.zzk(java.net.URL, int, byte[], long, long, boolean, boolean, java.util.Map):java.net.HttpURLConnection");
    }

    private final URL zzl(URL url, String str, zzew zzewVar) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new zzfk("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzewVar, 2001, 1);
                }
                if (this.zzb || protocol.equals(url.getProtocol())) {
                    return url2;
                }
                throw new zzfk(a.s("Disallowed cross-protocol redirect (", url.getProtocol(), " to ", protocol, ")"), zzewVar, 2001, 1);
            } catch (MalformedURLException e2) {
                throw new zzfk(e2, zzewVar, 2001, 1);
            }
        }
        throw new zzfk("Null location redirect", zzewVar, 2001, 1);
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                zzdn.zza("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        try {
            long j2 = this.zzm;
            if (j2 != -1) {
                long j3 = j2 - this.zzn;
                if (j3 == 0) {
                    return -1;
                }
                i3 = (int) Math.min(i3, j3);
            }
            InputStream inputStream = this.zzj;
            int i4 = zzeg.zza;
            int read = inputStream.read(bArr, i2, i3);
            if (read == -1) {
                return -1;
            }
            this.zzn += read;
            zzg(read);
            return read;
        } catch (IOException e2) {
            zzew zzewVar = this.zzh;
            int i5 = zzeg.zza;
            throw zzfk.zza(e2, zzewVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ca, code lost:
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ec, code lost:
        throw new com.google.android.gms.internal.ads.zzfk(new java.net.NoRouteToHostException("Too many redirects: " + r6), r25, 2001, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
        if (r8 != 0) goto L15;
     */
    @Override // com.google.android.gms.internal.ads.zzer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzew r25) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfe.zzb(com.google.android.gms.internal.ads.zzew):long");
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
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
                long j2 = this.zzm;
                long j3 = j2 == -1 ? -1L : j2 - this.zzn;
                HttpURLConnection httpURLConnection = this.zzi;
                try {
                    if (httpURLConnection != null) {
                        if (zzeg.zza <= 20) {
                            try {
                                InputStream inputStream2 = httpURLConnection.getInputStream();
                                if (j3 == -1) {
                                    if (inputStream2.read() != -1) {
                                    }
                                } else if (j3 <= 2048) {
                                }
                                String name = inputStream2.getClass().getName();
                                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                                    Class<? super Object> superclass = inputStream2.getClass().getSuperclass();
                                    Objects.requireNonNull(superclass);
                                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                    declaredMethod.setAccessible(true);
                                    declaredMethod.invoke(inputStream2, new Object[0]);
                                }
                            } catch (Exception unused) {
                            }
                        }
                        inputStream.close();
                    }
                    inputStream.close();
                } catch (IOException e2) {
                    zzew zzewVar = this.zzh;
                    int i2 = zzeg.zza;
                    throw new zzfk(e2, zzewVar, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzm();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzek, com.google.android.gms.internal.ads.zzer, com.google.android.gms.internal.ads.zzfo
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzi;
        return httpURLConnection == null ? zzfrk.zzd() : new zzfc(httpURLConnection.getHeaderFields());
    }

    private zzfe(String str, int i2, int i3, boolean z, zzfn zzfnVar, zzfot zzfotVar, boolean z2) {
        super(true);
        this.zze = str;
        this.zzc = i2;
        this.zzd = i3;
        this.zzb = z;
        this.zzf = zzfnVar;
        this.zzg = new zzfn();
    }
}
