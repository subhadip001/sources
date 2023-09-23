package f.h.c.b;

import java.util.Comparator;

/* compiled from: ComparisonChain.java */
/* loaded from: classes.dex */
public abstract class m {
    public static final m a = new a();
    public static final m b = new b(-1);
    public static final m c = new b(1);

    /* compiled from: ComparisonChain.java */
    /* loaded from: classes.dex */
    public class a extends m {
        public a() {
            super(null);
        }

        @Override // f.h.c.b.m
        public m a(int i2, int i3) {
            return f(i2 < i3 ? -1 : i2 > i3 ? 1 : 0);
        }

        @Override // f.h.c.b.m
        public <T> m b(T t, T t2, Comparator<T> comparator) {
            return f(comparator.compare(t, t2));
        }

        @Override // f.h.c.b.m
        public m c(boolean z, boolean z2) {
            return f(z == z2 ? 0 : z ? 1 : -1);
        }

        @Override // f.h.c.b.m
        public m d(boolean z, boolean z2) {
            return f(z2 == z ? 0 : z2 ? 1 : -1);
        }

        @Override // f.h.c.b.m
        public int e() {
            return 0;
        }

        public m f(int i2) {
            if (i2 < 0) {
                return m.b;
            }
            return i2 > 0 ? m.c : m.a;
        }
    }

    /* compiled from: ComparisonChain.java */
    /* loaded from: classes.dex */
    public static final class b extends m {

        /* renamed from: d  reason: collision with root package name */
        public final int f5953d;

        public b(int i2) {
            super(null);
            this.f5953d = i2;
        }

        @Override // f.h.c.b.m
        public m a(int i2, int i3) {
            return this;
        }

        @Override // f.h.c.b.m
        public <T> m b(T t, T t2, Comparator<T> comparator) {
            return this;
        }

        @Override // f.h.c.b.m
        public m c(boolean z, boolean z2) {
            return this;
        }

        @Override // f.h.c.b.m
        public m d(boolean z, boolean z2) {
            return this;
        }

        @Override // f.h.c.b.m
        public int e() {
            return this.f5953d;
        }
    }

    public m(a aVar) {
    }

    public abstract m a(int i2, int i3);

    public abstract <T> m b(T t, T t2, Comparator<T> comparator);

    public abstract m c(boolean z, boolean z2);

    public abstract m d(boolean z, boolean z2);

    public abstract int e();
}
