package k;

import java.io.Closeable;
import k.q;
import okhttp3.Protocol;

/* compiled from: Response.java */
/* loaded from: classes2.dex */
public final class y implements Closeable {

    /* renamed from: f  reason: collision with root package name */
    public final v f9180f;

    /* renamed from: g  reason: collision with root package name */
    public final Protocol f9181g;

    /* renamed from: h  reason: collision with root package name */
    public final int f9182h;

    /* renamed from: i  reason: collision with root package name */
    public final String f9183i;

    /* renamed from: j  reason: collision with root package name */
    public final p f9184j;

    /* renamed from: k  reason: collision with root package name */
    public final q f9185k;

    /* renamed from: l  reason: collision with root package name */
    public final a0 f9186l;

    /* renamed from: m  reason: collision with root package name */
    public final y f9187m;
    public final y n;
    public final y o;
    public final long p;
    public final long q;
    public volatile d r;

    public y(a aVar) {
        this.f9180f = aVar.a;
        this.f9181g = aVar.b;
        this.f9182h = aVar.c;
        this.f9183i = aVar.f9188d;
        this.f9184j = aVar.f9189e;
        this.f9185k = new q(aVar.f9190f);
        this.f9186l = aVar.f9191g;
        this.f9187m = aVar.f9192h;
        this.n = aVar.f9193i;
        this.o = aVar.f9194j;
        this.p = aVar.f9195k;
        this.q = aVar.f9196l;
    }

    public d a() {
        d dVar = this.r;
        if (dVar != null) {
            return dVar;
        }
        d a2 = d.a(this.f9185k);
        this.r = a2;
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a0 a0Var = this.f9186l;
        if (a0Var != null) {
            a0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("Response{protocol=");
        A.append(this.f9181g);
        A.append(", code=");
        A.append(this.f9182h);
        A.append(", message=");
        A.append(this.f9183i);
        A.append(", url=");
        A.append(this.f9180f.a);
        A.append('}');
        return A.toString();
    }

    /* compiled from: Response.java */
    /* loaded from: classes2.dex */
    public static class a {
        public v a;
        public Protocol b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public String f9188d;

        /* renamed from: e  reason: collision with root package name */
        public p f9189e;

        /* renamed from: f  reason: collision with root package name */
        public q.a f9190f;

        /* renamed from: g  reason: collision with root package name */
        public a0 f9191g;

        /* renamed from: h  reason: collision with root package name */
        public y f9192h;

        /* renamed from: i  reason: collision with root package name */
        public y f9193i;

        /* renamed from: j  reason: collision with root package name */
        public y f9194j;

        /* renamed from: k  reason: collision with root package name */
        public long f9195k;

        /* renamed from: l  reason: collision with root package name */
        public long f9196l;

        public a() {
            this.c = -1;
            this.f9190f = new q.a();
        }

        public y a() {
            if (this.a != null) {
                if (this.b != null) {
                    if (this.c >= 0) {
                        if (this.f9188d != null) {
                            return new y(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    StringBuilder A = f.a.b.a.a.A("code < 0: ");
                    A.append(this.c);
                    throw new IllegalStateException(A.toString());
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }

        public a b(y yVar) {
            if (yVar != null) {
                c("cacheResponse", yVar);
            }
            this.f9193i = yVar;
            return this;
        }

        public final void c(String str, y yVar) {
            if (yVar.f9186l == null) {
                if (yVar.f9187m == null) {
                    if (yVar.n == null) {
                        if (yVar.o != null) {
                            throw new IllegalArgumentException(f.a.b.a.a.p(str, ".priorResponse != null"));
                        }
                        return;
                    }
                    throw new IllegalArgumentException(f.a.b.a.a.p(str, ".cacheResponse != null"));
                }
                throw new IllegalArgumentException(f.a.b.a.a.p(str, ".networkResponse != null"));
            }
            throw new IllegalArgumentException(f.a.b.a.a.p(str, ".body != null"));
        }

        public a d(q qVar) {
            this.f9190f = qVar.c();
            return this;
        }

        public a(y yVar) {
            this.c = -1;
            this.a = yVar.f9180f;
            this.b = yVar.f9181g;
            this.c = yVar.f9182h;
            this.f9188d = yVar.f9183i;
            this.f9189e = yVar.f9184j;
            this.f9190f = yVar.f9185k.c();
            this.f9191g = yVar.f9186l;
            this.f9192h = yVar.f9187m;
            this.f9193i = yVar.n;
            this.f9194j = yVar.o;
            this.f9195k = yVar.p;
            this.f9196l = yVar.q;
        }
    }
}
