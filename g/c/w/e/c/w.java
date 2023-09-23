package g.c.w.e.c;

import g.c.w.e.c.n;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeZipArray.java */
/* loaded from: classes2.dex */
public final class w<T, R> extends g.c.h<R> {

    /* renamed from: f  reason: collision with root package name */
    public final g.c.k<? extends T>[] f8402f;

    /* renamed from: g  reason: collision with root package name */
    public final g.c.v.d<? super Object[], ? extends R> f8403g;

    /* compiled from: MaybeZipArray.java */
    /* loaded from: classes2.dex */
    public final class a implements g.c.v.d<T, R> {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.lang.Object] */
        @Override // g.c.v.d
        public R apply(T t) {
            R apply = w.this.f8403g.apply(new Object[]{t});
            Objects.requireNonNull(apply, "The zipper returned a null value");
            return apply;
        }
    }

    /* compiled from: MaybeZipArray.java */
    /* loaded from: classes2.dex */
    public static final class b<T, R> extends AtomicInteger implements g.c.t.b {

        /* renamed from: f  reason: collision with root package name */
        public final g.c.j<? super R> f8405f;

        /* renamed from: g  reason: collision with root package name */
        public final g.c.v.d<? super Object[], ? extends R> f8406g;

        /* renamed from: h  reason: collision with root package name */
        public final c<T>[] f8407h;

        /* renamed from: i  reason: collision with root package name */
        public final Object[] f8408i;

        public b(g.c.j<? super R> jVar, int i2, g.c.v.d<? super Object[], ? extends R> dVar) {
            super(i2);
            this.f8405f = jVar;
            this.f8406g = dVar;
            c<T>[] cVarArr = new c[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                cVarArr[i3] = new c<>(this, i3);
            }
            this.f8407h = cVarArr;
            this.f8408i = new Object[i2];
        }

        public void a(int i2) {
            c<T>[] cVarArr = this.f8407h;
            int length = cVarArr.length;
            for (int i3 = 0; i3 < i2; i3++) {
                c<T> cVar = cVarArr[i3];
                Objects.requireNonNull(cVar);
                DisposableHelper.dispose(cVar);
            }
            while (true) {
                i2++;
                if (i2 >= length) {
                    return;
                }
                c<T> cVar2 = cVarArr[i2];
                Objects.requireNonNull(cVar2);
                DisposableHelper.dispose(cVar2);
            }
        }

        public boolean b() {
            return get() <= 0;
        }

        @Override // g.c.t.b
        public void dispose() {
            c<T>[] cVarArr;
            if (getAndSet(0) > 0) {
                for (c<T> cVar : this.f8407h) {
                    Objects.requireNonNull(cVar);
                    DisposableHelper.dispose(cVar);
                }
            }
        }
    }

    /* compiled from: MaybeZipArray.java */
    /* loaded from: classes2.dex */
    public static final class c<T> extends AtomicReference<g.c.t.b> implements g.c.j<T> {

        /* renamed from: f  reason: collision with root package name */
        public final b<T, ?> f8409f;

        /* renamed from: g  reason: collision with root package name */
        public final int f8410g;

        public c(b<T, ?> bVar, int i2) {
            this.f8409f = bVar;
            this.f8410g = i2;
        }

        @Override // g.c.j
        public void onComplete() {
            b<T, ?> bVar = this.f8409f;
            int i2 = this.f8410g;
            if (bVar.getAndSet(0) > 0) {
                bVar.a(i2);
                bVar.f8405f.onComplete();
            }
        }

        @Override // g.c.j
        public void onError(Throwable th) {
            b<T, ?> bVar = this.f8409f;
            int i2 = this.f8410g;
            if (bVar.getAndSet(0) > 0) {
                bVar.a(i2);
                bVar.f8405f.onError(th);
                return;
            }
            f.n.a.n.i.L(th);
        }

        @Override // g.c.j
        public void onSubscribe(g.c.t.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // g.c.j
        public void onSuccess(T t) {
            b<T, ?> bVar = this.f8409f;
            bVar.f8408i[this.f8410g] = t;
            if (bVar.decrementAndGet() == 0) {
                try {
                    Object apply = bVar.f8406g.apply(bVar.f8408i);
                    Objects.requireNonNull(apply, "The zipper returned a null value");
                    bVar.f8405f.onSuccess(apply);
                } catch (Throwable th) {
                    f.n.a.n.i.d0(th);
                    bVar.f8405f.onError(th);
                }
            }
        }
    }

    public w(g.c.k<? extends T>[] kVarArr, g.c.v.d<? super Object[], ? extends R> dVar) {
        this.f8402f = kVarArr;
        this.f8403g = dVar;
    }

    @Override // g.c.h
    public void l(g.c.j<? super R> jVar) {
        g.c.k<? extends T>[] kVarArr = this.f8402f;
        int length = kVarArr.length;
        if (length == 1) {
            kVarArr[0].a(new n.a(jVar, new a()));
            return;
        }
        b bVar = new b(jVar, length, this.f8403g);
        jVar.onSubscribe(bVar);
        for (int i2 = 0; i2 < length && !bVar.b(); i2++) {
            g.c.k<? extends T> kVar = kVarArr[i2];
            if (kVar == null) {
                NullPointerException nullPointerException = new NullPointerException("One of the sources is null");
                if (bVar.getAndSet(0) > 0) {
                    bVar.a(i2);
                    bVar.f8405f.onError(nullPointerException);
                    return;
                }
                f.n.a.n.i.L(nullPointerException);
                return;
            }
            kVar.a(bVar.f8407h[i2]);
        }
    }
}
