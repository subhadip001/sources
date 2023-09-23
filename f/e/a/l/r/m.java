package f.e.a.l.r;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

/* compiled from: ModelCache.java */
/* loaded from: classes.dex */
public class m<A, B> {
    public final f.e.a.r.i<b<A>, B> a;

    /* compiled from: ModelCache.java */
    /* loaded from: classes.dex */
    public class a extends f.e.a.r.i<b<A>, B> {
        public a(m mVar, long j2) {
            super(j2);
        }

        @Override // f.e.a.r.i
        public void c(Object obj, Object obj2) {
            b<?> bVar = (b) obj;
            Objects.requireNonNull(bVar);
            Queue<b<?>> queue = b.f3428d;
            synchronized (queue) {
                queue.offer(bVar);
            }
        }
    }

    /* compiled from: ModelCache.java */
    /* loaded from: classes.dex */
    public static final class b<A> {

        /* renamed from: d  reason: collision with root package name */
        public static final Queue<b<?>> f3428d;
        public int a;
        public int b;
        public A c;

        static {
            char[] cArr = f.e.a.r.l.a;
            f3428d = new ArrayDeque(0);
        }

        public static <A> b<A> a(A a, int i2, int i3) {
            b<A> bVar;
            Queue<b<?>> queue = f3428d;
            synchronized (queue) {
                bVar = (b<A>) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.c = a;
            bVar.b = i2;
            bVar.a = i3;
            return bVar;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.b == bVar.b && this.a == bVar.a && this.c.equals(bVar.c);
            }
            return false;
        }

        public int hashCode() {
            return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
        }
    }

    public m(long j2) {
        this.a = new a(this, j2);
    }
}
