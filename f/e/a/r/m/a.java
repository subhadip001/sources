package f.e.a.r.m;

import android.util.Log;
import f.e.a.r.m.d;

/* compiled from: FactoryPools.java */
/* loaded from: classes.dex */
public final class a {
    public static final e<Object> a = new C0093a();

    /* compiled from: FactoryPools.java */
    /* renamed from: f.e.a.r.m.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0093a implements e<Object> {
        @Override // f.e.a.r.m.a.e
        public void a(Object obj) {
        }
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: classes.dex */
    public interface b<T> {
        T a();
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: classes.dex */
    public static final class c<T> implements e.i.i.c<T> {
        public final b<T> a;
        public final e<T> b;
        public final e.i.i.c<T> c;

        public c(e.i.i.c<T> cVar, b<T> bVar, e<T> eVar) {
            this.c = cVar;
            this.a = bVar;
            this.b = eVar;
        }

        @Override // e.i.i.c
        public boolean a(T t) {
            if (t instanceof d) {
                ((d.b) ((d) t).g()).a = true;
            }
            this.b.a(t);
            return this.c.a(t);
        }

        @Override // e.i.i.c
        public T b() {
            T b = this.c.b();
            if (b == null) {
                b = this.a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder A = f.a.b.a.a.A("Created new ");
                    A.append(b.getClass());
                    Log.v("FactoryPools", A.toString());
                }
            }
            if (b instanceof d) {
                ((d.b) ((d) b).g()).a = false;
            }
            return b;
        }
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: classes.dex */
    public interface d {
        f.e.a.r.m.d g();
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: classes.dex */
    public interface e<T> {
        void a(T t);
    }

    public static <T extends d> e.i.i.c<T> a(int i2, b<T> bVar) {
        return new c(new e.i.i.e(i2), bVar, a);
    }
}
