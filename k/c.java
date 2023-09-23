package k;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import k.c0.e.e;
import k.q;
import okhttp3.Protocol;
import okhttp3.TlsVersion;

/* compiled from: Cache.java */
/* loaded from: classes2.dex */
public final class c implements Closeable, Flushable {

    /* renamed from: f  reason: collision with root package name */
    public final k.c0.e.g f8854f;

    /* renamed from: g  reason: collision with root package name */
    public final k.c0.e.e f8855g;

    /* renamed from: h  reason: collision with root package name */
    public int f8856h;

    /* renamed from: i  reason: collision with root package name */
    public int f8857i;

    /* renamed from: j  reason: collision with root package name */
    public int f8858j;

    /* renamed from: k  reason: collision with root package name */
    public int f8859k;

    /* renamed from: l  reason: collision with root package name */
    public int f8860l;

    /* compiled from: Cache.java */
    /* loaded from: classes2.dex */
    public class a implements k.c0.e.g {
        public a() {
        }
    }

    /* compiled from: Cache.java */
    /* loaded from: classes2.dex */
    public final class b implements k.c0.e.c {
        public final e.c a;
        public l.x b;
        public l.x c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f8861d;

        /* compiled from: Cache.java */
        /* loaded from: classes2.dex */
        public class a extends l.j {

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ e.c f8863g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l.x xVar, c cVar, e.c cVar2) {
                super(xVar);
                this.f8863g = cVar2;
            }

            @Override // l.j, l.x, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                synchronized (c.this) {
                    b bVar = b.this;
                    if (bVar.f8861d) {
                        return;
                    }
                    bVar.f8861d = true;
                    c.this.f8856h++;
                    this.f9236f.close();
                    this.f8863g.b();
                }
            }
        }

        public b(e.c cVar) {
            this.a = cVar;
            l.x d2 = cVar.d(1);
            this.b = d2;
            this.c = new a(d2, c.this, cVar);
        }

        public void a() {
            synchronized (c.this) {
                if (this.f8861d) {
                    return;
                }
                this.f8861d = true;
                c.this.f8857i++;
                k.c0.c.d(this.b);
                try {
                    this.a.a();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* compiled from: Cache.java */
    /* renamed from: k.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0229c extends a0 {

        /* renamed from: f  reason: collision with root package name */
        public final e.C0230e f8865f;

        /* renamed from: g  reason: collision with root package name */
        public final l.h f8866g;

        /* renamed from: h  reason: collision with root package name */
        public final String f8867h;

        /* compiled from: Cache.java */
        /* renamed from: k.c$c$a */
        /* loaded from: classes2.dex */
        public class a extends l.k {

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ e.C0230e f8868g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0229c c0229c, l.y yVar, e.C0230e c0230e) {
                super(yVar);
                this.f8868g = c0230e;
            }

            @Override // l.k, l.y, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.f8868g.close();
                this.f9237f.close();
            }
        }

        public C0229c(e.C0230e c0230e, String str, String str2) {
            this.f8865f = c0230e;
            this.f8867h = str2;
            a aVar = new a(this, c0230e.f8908h[1], c0230e);
            Logger logger = l.o.a;
            this.f8866g = new l.t(aVar);
        }

        @Override // k.a0
        public long a() {
            try {
                String str = this.f8867h;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1L;
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // k.a0
        public l.h f() {
            return this.f8866g;
        }
    }

    public c(File file, long j2) {
        k.c0.j.a aVar = k.c0.j.a.a;
        this.f8854f = new a();
        Pattern pattern = k.c0.e.e.z;
        if (j2 > 0) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            byte[] bArr = k.c0.c.a;
            this.f8855g = new k.c0.e.e(aVar, file, 201105, 2, j2, new ThreadPoolExecutor(0, 1, 60L, timeUnit, linkedBlockingQueue, new k.c0.d("OkHttp DiskLruCache", true)));
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static String a(r rVar) {
        return l.i.j(rVar.f9139i).i("MD5").l();
    }

    public static int f(l.h hVar) {
        try {
            long z = hVar.z();
            String Q = hVar.Q();
            if (z < 0 || z > 2147483647L || !Q.isEmpty()) {
                throw new IOException("expected an int but was \"" + z + Q + "\"");
            }
            return (int) z;
        } catch (NumberFormatException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8855g.close();
    }

    @Override // java.io.Flushable
    public void flush() {
        this.f8855g.flush();
    }

    public void g(v vVar) {
        k.c0.e.e eVar = this.f8855g;
        String a2 = a(vVar.a);
        synchronized (eVar) {
            eVar.p();
            eVar.a();
            eVar.W(a2);
            e.d dVar = eVar.p.get(a2);
            if (dVar == null) {
                return;
            }
            eVar.O(dVar);
            if (eVar.n <= eVar.f8895l) {
                eVar.u = false;
            }
        }
    }

    /* compiled from: Cache.java */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: k  reason: collision with root package name */
        public static final String f8869k;

        /* renamed from: l  reason: collision with root package name */
        public static final String f8870l;
        public final String a;
        public final q b;
        public final String c;

        /* renamed from: d  reason: collision with root package name */
        public final Protocol f8871d;

        /* renamed from: e  reason: collision with root package name */
        public final int f8872e;

        /* renamed from: f  reason: collision with root package name */
        public final String f8873f;

        /* renamed from: g  reason: collision with root package name */
        public final q f8874g;

        /* renamed from: h  reason: collision with root package name */
        public final p f8875h;

        /* renamed from: i  reason: collision with root package name */
        public final long f8876i;

        /* renamed from: j  reason: collision with root package name */
        public final long f8877j;

        static {
            k.c0.k.f fVar = k.c0.k.f.a;
            Objects.requireNonNull(fVar);
            f8869k = "OkHttp-Sent-Millis";
            Objects.requireNonNull(fVar);
            f8870l = "OkHttp-Received-Millis";
        }

        public d(l.y yVar) {
            TlsVersion tlsVersion;
            try {
                Logger logger = l.o.a;
                l.t tVar = new l.t(yVar);
                this.a = tVar.Q();
                this.c = tVar.Q();
                q.a aVar = new q.a();
                int f2 = c.f(tVar);
                for (int i2 = 0; i2 < f2; i2++) {
                    aVar.a(tVar.Q());
                }
                this.b = new q(aVar);
                k.c0.g.i a = k.c0.g.i.a(tVar.Q());
                this.f8871d = a.a;
                this.f8872e = a.b;
                this.f8873f = a.c;
                q.a aVar2 = new q.a();
                int f3 = c.f(tVar);
                for (int i3 = 0; i3 < f3; i3++) {
                    aVar2.a(tVar.Q());
                }
                String str = f8869k;
                String d2 = aVar2.d(str);
                String str2 = f8870l;
                String d3 = aVar2.d(str2);
                aVar2.e(str);
                aVar2.e(str2);
                this.f8876i = d2 != null ? Long.parseLong(d2) : 0L;
                this.f8877j = d3 != null ? Long.parseLong(d3) : 0L;
                this.f8874g = new q(aVar2);
                if (this.a.startsWith("https://")) {
                    String Q = tVar.Q();
                    if (Q.length() <= 0) {
                        g a2 = g.a(tVar.Q());
                        List<Certificate> a3 = a(tVar);
                        List<Certificate> a4 = a(tVar);
                        if (!tVar.s()) {
                            tlsVersion = TlsVersion.forJavaName(tVar.Q());
                        } else {
                            tlsVersion = TlsVersion.SSL_3_0;
                        }
                        Objects.requireNonNull(tlsVersion, "tlsVersion == null");
                        this.f8875h = new p(tlsVersion, a2, k.c0.c.n(a3), k.c0.c.n(a4));
                    } else {
                        throw new IOException("expected \"\" but was \"" + Q + "\"");
                    }
                } else {
                    this.f8875h = null;
                }
            } finally {
                yVar.close();
            }
        }

        public final List<Certificate> a(l.h hVar) {
            int f2 = c.f(hVar);
            if (f2 == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(f2);
                for (int i2 = 0; i2 < f2; i2++) {
                    String Q = ((l.t) hVar).Q();
                    l.f fVar = new l.f();
                    fVar.X(l.i.d(Q));
                    arrayList.add(certificateFactory.generateCertificate(new l.e(fVar)));
                }
                return arrayList;
            } catch (CertificateException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        public final void b(l.g gVar, List<Certificate> list) {
            try {
                l.r rVar = (l.r) gVar;
                rVar.k0(list.size());
                rVar.t(10);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    rVar.D(l.i.m(list.get(i2).getEncoded()).a());
                    rVar.t(10);
                }
            } catch (CertificateEncodingException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        public void c(e.c cVar) {
            l.x d2 = cVar.d(0);
            Logger logger = l.o.a;
            l.r rVar = new l.r(d2);
            rVar.D(this.a);
            rVar.t(10);
            rVar.D(this.c);
            rVar.t(10);
            rVar.k0(this.b.d());
            rVar.t(10);
            int d3 = this.b.d();
            for (int i2 = 0; i2 < d3; i2++) {
                rVar.D(this.b.b(i2));
                rVar.D(": ");
                rVar.D(this.b.e(i2));
                rVar.t(10);
            }
            rVar.D(new k.c0.g.i(this.f8871d, this.f8872e, this.f8873f).toString());
            rVar.t(10);
            rVar.k0(this.f8874g.d() + 2);
            rVar.t(10);
            int d4 = this.f8874g.d();
            for (int i3 = 0; i3 < d4; i3++) {
                rVar.D(this.f8874g.b(i3));
                rVar.D(": ");
                rVar.D(this.f8874g.e(i3));
                rVar.t(10);
            }
            rVar.D(f8869k);
            rVar.D(": ");
            rVar.k0(this.f8876i);
            rVar.t(10);
            rVar.D(f8870l);
            rVar.D(": ");
            rVar.k0(this.f8877j);
            rVar.t(10);
            if (this.a.startsWith("https://")) {
                rVar.t(10);
                rVar.D(this.f8875h.b.a);
                rVar.t(10);
                b(rVar, this.f8875h.c);
                b(rVar, this.f8875h.f9132d);
                rVar.D(this.f8875h.a.javaName());
                rVar.t(10);
            }
            rVar.close();
        }

        public d(y yVar) {
            q qVar;
            this.a = yVar.f9180f.a.f9139i;
            int i2 = k.c0.g.e.a;
            q qVar2 = yVar.f9187m.f9180f.c;
            Set<String> f2 = k.c0.g.e.f(yVar.f9185k);
            if (f2.isEmpty()) {
                qVar = new q(new q.a());
            } else {
                q.a aVar = new q.a();
                int d2 = qVar2.d();
                for (int i3 = 0; i3 < d2; i3++) {
                    String b = qVar2.b(i3);
                    if (f2.contains(b)) {
                        String e2 = qVar2.e(i3);
                        aVar.c(b, e2);
                        aVar.a.add(b);
                        aVar.a.add(e2.trim());
                    }
                }
                qVar = new q(aVar);
            }
            this.b = qVar;
            this.c = yVar.f9180f.b;
            this.f8871d = yVar.f9181g;
            this.f8872e = yVar.f9182h;
            this.f8873f = yVar.f9183i;
            this.f8874g = yVar.f9185k;
            this.f8875h = yVar.f9184j;
            this.f8876i = yVar.p;
            this.f8877j = yVar.q;
        }
    }
}
