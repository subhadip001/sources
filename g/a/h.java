package g.a;

/* compiled from: ClientStreamTracer.java */
/* loaded from: classes2.dex */
public abstract class h extends s0 {

    /* compiled from: ClientStreamTracer.java */
    /* loaded from: classes2.dex */
    public static abstract class a {
        public h a(b bVar, i0 i0Var) {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    /* compiled from: ClientStreamTracer.java */
    /* loaded from: classes2.dex */
    public static final class b {
        public final g.a.b a;
        public final int b;
        public final boolean c;

        /* compiled from: ClientStreamTracer.java */
        /* loaded from: classes2.dex */
        public static final class a {
            public g.a.b a = g.a.b.f7526j;
        }

        public b(g.a.b bVar, int i2, boolean z) {
            f.h.b.c.a.x(bVar, "callOptions");
            this.a = bVar;
            this.b = i2;
            this.c = z;
        }

        public String toString() {
            f.h.c.a.i c1 = f.h.b.c.a.c1(this);
            c1.c("callOptions", this.a);
            c1.a("previousAttempts", this.b);
            c1.d("isTransparentRetry", this.c);
            return c1.toString();
        }
    }
}
