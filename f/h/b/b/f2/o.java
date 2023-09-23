package f.h.b.b.f2;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException;
import com.google.firebase.crashlytics.internal.settings.DefaultSettingsSpiCall;
import f.h.b.b.f2.i;
import f.h.b.b.g2.b0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

/* compiled from: DefaultHttpDataSource.java */
/* loaded from: classes.dex */
public class o extends e implements i {
    public static final Pattern v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: e  reason: collision with root package name */
    public final boolean f4237e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4238f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4239g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4240h;

    /* renamed from: i  reason: collision with root package name */
    public final q f4241i;

    /* renamed from: j  reason: collision with root package name */
    public final q f4242j;

    /* renamed from: k  reason: collision with root package name */
    public f.h.c.a.k<String> f4243k;

    /* renamed from: l  reason: collision with root package name */
    public j f4244l;

    /* renamed from: m  reason: collision with root package name */
    public HttpURLConnection f4245m;
    public InputStream n;
    public byte[] o;
    public boolean p;
    public int q;
    public long r;
    public long s;
    public long t;
    public long u;

    /* compiled from: DefaultHttpDataSource.java */
    /* loaded from: classes.dex */
    public static final class b implements i.a {
        public String b;
        public final q a = new q();
        public int c = 8000;

        /* renamed from: d  reason: collision with root package name */
        public int f4246d = 8000;

        @Override // f.h.b.b.f2.i.a
        public i a() {
            return new o(this.b, this.c, this.f4246d, false, this.a, null, null);
        }
    }

    public o(String str, int i2, int i3, boolean z, q qVar, f.h.c.a.k kVar, a aVar) {
        super(true);
        this.f4240h = str;
        this.f4238f = i2;
        this.f4239g = i3;
        this.f4237e = z;
        this.f4241i = qVar;
        this.f4243k = null;
        this.f4242j = new q();
    }

    public static URL u(URL url, String str) {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if ("https".equals(protocol) || "http".equals(protocol)) {
                return url2;
            }
            String valueOf = String.valueOf(protocol);
            throw new ProtocolException(valueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf) : new String("Unsupported protocol redirect: "));
        }
        throw new ProtocolException("Null location redirect");
    }

    public static void x(HttpURLConnection httpURLConnection, long j2) {
        int i2;
        if (httpURLConnection != null && (i2 = b0.a) >= 19 && i2 <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j2 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j2 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (!"com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) && !"com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    return;
                }
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                Objects.requireNonNull(superclass);
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    @Override // f.h.b.b.f2.f
    public int b(byte[] bArr, int i2, int i3) {
        try {
            y();
            if (i3 == 0) {
                return 0;
            }
            long j2 = this.s;
            if (j2 != -1) {
                long j3 = j2 - this.u;
                if (j3 != 0) {
                    i3 = (int) Math.min(i3, j3);
                }
                return -1;
            }
            InputStream inputStream = this.n;
            int i4 = b0.a;
            int read = inputStream.read(bArr, i2, i3);
            if (read == -1) {
                if (this.s == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.u += read;
            p(read);
            return read;
        } catch (IOException e2) {
            j jVar = this.f4244l;
            int i5 = b0.a;
            throw new HttpDataSource$HttpDataSourceException(e2, jVar, 2);
        }
    }

    @Override // f.h.b.b.f2.i
    public void close() {
        try {
            InputStream inputStream = this.n;
            if (inputStream != null) {
                HttpURLConnection httpURLConnection = this.f4245m;
                long j2 = this.s;
                if (j2 != -1) {
                    j2 -= this.u;
                }
                x(httpURLConnection, j2);
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    j jVar = this.f4244l;
                    int i2 = b0.a;
                    throw new HttpDataSource$HttpDataSourceException(e2, jVar, 3);
                }
            }
        } finally {
            this.n = null;
            t();
            if (this.p) {
                this.p = false;
                q();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
        if (r7 != 0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0147  */
    @Override // f.h.b.b.f2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long i(f.h.b.b.f2.j r20) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.f2.o.i(f.h.b.b.f2.j):long");
    }

    @Override // f.h.b.b.f2.e, f.h.b.b.f2.i
    public Map<String, List<String>> k() {
        HttpURLConnection httpURLConnection = this.f4245m;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    @Override // f.h.b.b.f2.i
    public Uri n() {
        HttpURLConnection httpURLConnection = this.f4245m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final void t() {
        HttpURLConnection httpURLConnection = this.f4245m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                f.h.b.b.g2.m.b("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.f4245m = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.net.HttpURLConnection v(f.h.b.b.f2.j r25) {
        /*
            r24 = this;
            r0 = r25
            java.net.URL r1 = new java.net.URL
            android.net.Uri r2 = r0.a
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            int r2 = r0.b
            byte[] r3 = r0.c
            long r14 = r0.f4211e
            long r12 = r0.f4212f
            int r4 = r0.f4214h
            r5 = 1
            r4 = r4 & r5
            r6 = 0
            if (r4 != r5) goto L20
            r4 = 1
            r16 = 1
            goto L23
        L20:
            r4 = 0
            r16 = 0
        L23:
            r11 = r24
            boolean r4 = r11.f4237e
            if (r4 != 0) goto L37
            r9 = 1
            java.util.Map<java.lang.String, java.lang.String> r10 = r0.f4210d
            r0 = r24
            r4 = r14
            r6 = r12
            r8 = r16
            java.net.HttpURLConnection r0 = r0.w(r1, r2, r3, r4, r6, r8, r9, r10)
            return r0
        L37:
            int r10 = r6 + 1
            r4 = 20
            if (r6 > r4) goto Lae
            r17 = 0
            java.util.Map<java.lang.String, java.lang.String> r8 = r0.f4210d
            r9 = 1
            r4 = r24
            r5 = r1
            r6 = r2
            r7 = r3
            r18 = r8
            r0 = 1
            r8 = r14
            r19 = r10
            r10 = r12
            r20 = r12
            r12 = r16
            r13 = r17
            r22 = r14
            r14 = r18
            java.net.HttpURLConnection r4 = r4.w(r5, r6, r7, r8, r10, r12, r13, r14)
            int r5 = r4.getResponseCode()
            java.lang.String r6 = "Location"
            java.lang.String r6 = r4.getHeaderField(r6)
            r7 = 303(0x12f, float:4.25E-43)
            r8 = 302(0x12e, float:4.23E-43)
            r9 = 301(0x12d, float:4.22E-43)
            r10 = 300(0x12c, float:4.2E-43)
            if (r2 == r0) goto L73
            r0 = 3
            if (r2 != r0) goto L84
        L73:
            if (r5 == r10) goto L9b
            if (r5 == r9) goto L9b
            if (r5 == r8) goto L9b
            if (r5 == r7) goto L9b
            r0 = 307(0x133, float:4.3E-43)
            if (r5 == r0) goto L9b
            r0 = 308(0x134, float:4.32E-43)
            if (r5 != r0) goto L84
            goto L9b
        L84:
            r0 = 2
            if (r2 != r0) goto L9a
            if (r5 == r10) goto L8f
            if (r5 == r9) goto L8f
            if (r5 == r8) goto L8f
            if (r5 != r7) goto L9a
        L8f:
            r4.disconnect()
            r0 = 0
            java.net.URL r1 = u(r1, r6)
            r2 = 1
            r3 = r0
            goto La3
        L9a:
            return r4
        L9b:
            r4.disconnect()
            java.net.URL r0 = u(r1, r6)
            r1 = r0
        La3:
            r11 = r24
            r0 = r25
            r6 = r19
            r12 = r20
            r14 = r22
            goto L37
        Lae:
            r19 = r10
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException
            r1 = 31
            java.lang.String r2 = "Too many redirects: "
            r6 = r19
            java.lang.String r1 = f.a.b.a.a.d(r1, r2, r6)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.f2.o.v(f.h.b.b.f2.j):java.net.HttpURLConnection");
    }

    public final HttpURLConnection w(URL url, int i2, byte[] bArr, long j2, long j3, boolean z, boolean z2, Map<String, String> map) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f4238f);
        httpURLConnection.setReadTimeout(this.f4239g);
        HashMap hashMap = new HashMap();
        q qVar = this.f4241i;
        if (qVar != null) {
            hashMap.putAll(qVar.a());
        }
        hashMap.putAll(this.f4242j.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j2 != 0 || j3 != -1) {
            String f2 = f.a.b.a.a.f(27, "bytes=", j2, "-");
            if (j3 != -1) {
                String valueOf = String.valueOf(f2);
                StringBuilder sb = new StringBuilder(valueOf.length() + 20);
                sb.append(valueOf);
                sb.append((j2 + j3) - 1);
                f2 = sb.toString();
            }
            httpURLConnection.setRequestProperty("Range", f2);
        }
        String str = this.f4240h;
        if (str != null) {
            httpURLConnection.setRequestProperty(DefaultSettingsSpiCall.HEADER_USER_AGENT, str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(j.a(i2));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final void y() {
        if (this.t == this.r) {
            return;
        }
        if (this.o == null) {
            this.o = new byte[4096];
        }
        while (true) {
            long j2 = this.t;
            long j3 = this.r;
            if (j2 == j3) {
                return;
            }
            int min = (int) Math.min(j3 - j2, this.o.length);
            InputStream inputStream = this.n;
            int i2 = b0.a;
            int read = inputStream.read(this.o, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException();
            }
            if (read != -1) {
                this.t += read;
                p(read);
            } else {
                throw new EOFException();
            }
        }
    }
}
