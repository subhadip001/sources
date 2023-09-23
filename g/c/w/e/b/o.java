package g.c.w.e.b;

import java.util.Objects;

/* compiled from: FlowableMap.java */
/* loaded from: classes2.dex */
public final class o<T, U> extends g.c.w.e.b.a<T, U> {

    /* renamed from: h  reason: collision with root package name */
    public final g.c.v.d<? super T, ? extends U> f8289h;

    /* compiled from: FlowableMap.java */
    /* loaded from: classes2.dex */
    public static final class a<T, U> extends g.c.w.h.a<T, U> {

        /* renamed from: k  reason: collision with root package name */
        public final g.c.v.d<? super T, ? extends U> f8290k;

        public a(g.c.w.c.a<? super U> aVar, g.c.v.d<? super T, ? extends U> dVar) {
            super(aVar);
            this.f8290k = dVar;
        }

        @Override // g.c.w.c.a
        public boolean a(T t) {
            if (this.f8555i) {
                return false;
            }
            try {
                U apply = this.f8290k.apply(t);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                return this.f8552f.a(apply);
            } catch (Throwable th) {
                b(th);
                return true;
            }
        }

        @Override // m.c.b
        public void onNext(T t) {
            if (this.f8555i) {
                return;
            }
            if (this.f8556j != 0) {
                this.f8552f.onNext(null);
                return;
            }
            try {
                U apply = this.f8290k.apply(t);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                this.f8552f.onNext(apply);
            } catch (Throwable th) {
                b(th);
            }
        }

        @Override // g.c.w.c.j
        public U poll() {
            T poll = this.f8554h.poll();
            if (poll != null) {
                U apply = this.f8290k.apply(poll);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                return apply;
            }
            return null;
        }

        @Override // g.c.w.c.f
        public int requestFusion(int i2) {
            return c(i2);
        }
    }

    /* compiled from: FlowableMap.java */
    /* loaded from: classes2.dex */
    public static final class b<T, U> extends g.c.w.h.b<T, U> {

        /* renamed from: k  reason: collision with root package name */
        public final g.c.v.d<? super T, ? extends U> f8291k;

        public b(m.c.b<? super U> bVar, g.c.v.d<? super T, ? extends U> dVar) {
            super(bVar);
            this.f8291k = dVar;
        }

        @Override // m.c.b
        public void onNext(T t) {
            if (this.f8560i) {
                return;
            }
            if (this.f8561j != 0) {
                this.f8557f.onNext(null);
                return;
            }
            try {
                U apply = this.f8291k.apply(t);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                this.f8557f.onNext(apply);
            } catch (Throwable th) {
                b(th);
            }
        }

        @Override // g.c.w.c.j
        public U poll() {
            T poll = this.f8559h.poll();
            if (poll != null) {
                U apply = this.f8291k.apply(poll);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                return apply;
            }
            return null;
        }

        @Override // g.c.w.c.f
        public int requestFusion(int i2) {
            return c(i2);
        }
    }

    public o(g.c.d<T> dVar, g.c.v.d<? super T, ? extends U> dVar2) {
        super(dVar);
        this.f8289h = dVar2;
    }

    @Override // g.c.d
    public void e(m.c.b<? super U> bVar) {
        if (bVar instanceof g.c.w.c.a) {
            this.f8174g.d(new a((g.c.w.c.a) bVar, this.f8289h));
        } else {
            this.f8174g.d(new b(bVar, this.f8289h));
        }
    }
}
