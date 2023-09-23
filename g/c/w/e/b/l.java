package g.c.w.e.b;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;

/* compiled from: FlowableFromArray.java */
/* loaded from: classes2.dex */
public final class l<T> extends g.c.d<T> {

    /* renamed from: g  reason: collision with root package name */
    public final T[] f8274g;

    /* compiled from: FlowableFromArray.java */
    /* loaded from: classes2.dex */
    public static final class a<T> extends c<T> {

        /* renamed from: i  reason: collision with root package name */
        public final g.c.w.c.a<? super T> f8275i;

        public a(g.c.w.c.a<? super T> aVar, T[] tArr) {
            super(tArr);
            this.f8275i = aVar;
        }

        @Override // g.c.w.e.b.l.c
        public void a() {
            T[] tArr = this.f8277f;
            int length = tArr.length;
            g.c.w.c.a<? super T> aVar = this.f8275i;
            for (int i2 = this.f8278g; i2 != length; i2++) {
                if (this.f8279h) {
                    return;
                }
                T t = tArr[i2];
                if (t == null) {
                    aVar.onError(new NullPointerException("array element is null"));
                    return;
                }
                aVar.a(t);
            }
            if (this.f8279h) {
                return;
            }
            aVar.onComplete();
        }

        @Override // g.c.w.e.b.l.c
        public void b(long j2) {
            T[] tArr = this.f8277f;
            int length = tArr.length;
            int i2 = this.f8278g;
            g.c.w.c.a<? super T> aVar = this.f8275i;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2 || i2 == length) {
                        if (i2 == length) {
                            if (this.f8279h) {
                                return;
                            }
                            aVar.onComplete();
                            return;
                        }
                        j2 = get();
                        if (j3 == j2) {
                            this.f8278g = i2;
                            j2 = addAndGet(-j3);
                        }
                    } else if (this.f8279h) {
                        return;
                    } else {
                        T t = tArr[i2];
                        if (t == null) {
                            aVar.onError(new NullPointerException("array element is null"));
                            return;
                        }
                        if (aVar.a(t)) {
                            j3++;
                        }
                        i2++;
                    }
                }
            } while (j2 != 0);
        }
    }

    /* compiled from: FlowableFromArray.java */
    /* loaded from: classes2.dex */
    public static final class b<T> extends c<T> {

        /* renamed from: i  reason: collision with root package name */
        public final m.c.b<? super T> f8276i;

        public b(m.c.b<? super T> bVar, T[] tArr) {
            super(tArr);
            this.f8276i = bVar;
        }

        @Override // g.c.w.e.b.l.c
        public void a() {
            T[] tArr = this.f8277f;
            int length = tArr.length;
            m.c.b<? super T> bVar = this.f8276i;
            for (int i2 = this.f8278g; i2 != length; i2++) {
                if (this.f8279h) {
                    return;
                }
                T t = tArr[i2];
                if (t == null) {
                    bVar.onError(new NullPointerException("array element is null"));
                    return;
                }
                bVar.onNext(t);
            }
            if (this.f8279h) {
                return;
            }
            bVar.onComplete();
        }

        @Override // g.c.w.e.b.l.c
        public void b(long j2) {
            T[] tArr = this.f8277f;
            int length = tArr.length;
            int i2 = this.f8278g;
            m.c.b<? super T> bVar = this.f8276i;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2 || i2 == length) {
                        if (i2 == length) {
                            if (this.f8279h) {
                                return;
                            }
                            bVar.onComplete();
                            return;
                        }
                        j2 = get();
                        if (j3 == j2) {
                            this.f8278g = i2;
                            j2 = addAndGet(-j3);
                        }
                    } else if (this.f8279h) {
                        return;
                    } else {
                        T t = tArr[i2];
                        if (t == null) {
                            bVar.onError(new NullPointerException("array element is null"));
                            return;
                        }
                        bVar.onNext(t);
                        j3++;
                        i2++;
                    }
                }
            } while (j2 != 0);
        }
    }

    /* compiled from: FlowableFromArray.java */
    /* loaded from: classes2.dex */
    public static abstract class c<T> extends g.c.w.i.b<T> {

        /* renamed from: f  reason: collision with root package name */
        public final T[] f8277f;

        /* renamed from: g  reason: collision with root package name */
        public int f8278g;

        /* renamed from: h  reason: collision with root package name */
        public volatile boolean f8279h;

        public c(T[] tArr) {
            this.f8277f = tArr;
        }

        public abstract void a();

        public abstract void b(long j2);

        @Override // m.c.c
        public final void cancel() {
            this.f8279h = true;
        }

        @Override // g.c.w.c.j
        public final void clear() {
            this.f8278g = this.f8277f.length;
        }

        @Override // g.c.w.c.j
        public final boolean isEmpty() {
            return this.f8278g == this.f8277f.length;
        }

        @Override // g.c.w.c.j
        public final T poll() {
            int i2 = this.f8278g;
            T[] tArr = this.f8277f;
            if (i2 == tArr.length) {
                return null;
            }
            this.f8278g = i2 + 1;
            T t = tArr[i2];
            Objects.requireNonNull(t, "array element is null");
            return t;
        }

        @Override // m.c.c
        public final void request(long j2) {
            if (SubscriptionHelper.validate(j2) && f.n.a.n.i.b(this, j2) == 0) {
                if (j2 == Long.MAX_VALUE) {
                    a();
                } else {
                    b(j2);
                }
            }
        }

        @Override // g.c.w.c.f
        public final int requestFusion(int i2) {
            return i2 & 1;
        }
    }

    public l(T[] tArr) {
        this.f8274g = tArr;
    }

    @Override // g.c.d
    public void e(m.c.b<? super T> bVar) {
        if (bVar instanceof g.c.w.c.a) {
            bVar.onSubscribe(new a((g.c.w.c.a) bVar, this.f8274g));
        } else {
            bVar.onSubscribe(new b(bVar, this.f8274g));
        }
    }
}
