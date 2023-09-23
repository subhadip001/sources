package g.c.w.b;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: Functions.java */
/* loaded from: classes2.dex */
public final class a {
    public static final g.c.v.d<Object, Object> a = new f();
    public static final Runnable b = new d();
    public static final g.c.v.a c = new b();

    /* renamed from: d  reason: collision with root package name */
    public static final g.c.v.c<Object> f8141d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final g.c.v.c<Throwable> f8142e = new i();

    /* renamed from: f  reason: collision with root package name */
    public static final g.c.v.e<Object> f8143f = new j();

    /* compiled from: Functions.java */
    /* renamed from: g.c.w.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0206a<T1, T2, R> implements g.c.v.d<Object[], R> {

        /* renamed from: f  reason: collision with root package name */
        public final g.c.v.b<? super T1, ? super T2, ? extends R> f8144f;

        public C0206a(g.c.v.b<? super T1, ? super T2, ? extends R> bVar) {
            this.f8144f = bVar;
        }

        @Override // g.c.v.d
        public Object apply(Object[] objArr) {
            Object[] objArr2 = objArr;
            if (objArr2.length == 2) {
                return this.f8144f.apply(objArr2[0], objArr2[1]);
            }
            StringBuilder A = f.a.b.a.a.A("Array of size 2 expected but got ");
            A.append(objArr2.length);
            throw new IllegalArgumentException(A.toString());
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes2.dex */
    public static final class b implements g.c.v.a {
        @Override // g.c.v.a
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes2.dex */
    public static final class c implements g.c.v.c<Object> {
        @Override // g.c.v.c
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes2.dex */
    public static final class d implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes2.dex */
    public static final class e<T> implements g.c.v.e<T> {

        /* renamed from: f  reason: collision with root package name */
        public final T f8145f;

        public e(T t) {
            this.f8145f = t;
        }

        @Override // g.c.v.e
        public boolean a(T t) {
            T t2 = this.f8145f;
            return t == t2 || (t != null && t.equals(t2));
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes2.dex */
    public static final class f implements g.c.v.d<Object, Object> {
        @Override // g.c.v.d
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes2.dex */
    public static final class g<T, U> implements Callable<U>, g.c.v.d<T, U> {

        /* renamed from: f  reason: collision with root package name */
        public final U f8146f;

        public g(U u) {
            this.f8146f = u;
        }

        @Override // g.c.v.d
        public U apply(T t) {
            return this.f8146f;
        }

        @Override // java.util.concurrent.Callable
        public U call() {
            return this.f8146f;
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes2.dex */
    public static final class h<T> implements g.c.v.d<List<T>, List<T>> {

        /* renamed from: f  reason: collision with root package name */
        public final Comparator<? super T> f8147f;

        public h(Comparator<? super T> comparator) {
            this.f8147f = comparator;
        }

        @Override // g.c.v.d
        public Object apply(Object obj) {
            List list = (List) obj;
            Collections.sort(list, this.f8147f);
            return list;
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes2.dex */
    public static final class i implements g.c.v.c<Throwable> {
        @Override // g.c.v.c
        public void accept(Throwable th) {
            f.n.a.n.i.L(new OnErrorNotImplementedException(th));
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes2.dex */
    public static final class j implements g.c.v.e<Object> {
        @Override // g.c.v.e
        public boolean a(Object obj) {
            return true;
        }
    }
}
