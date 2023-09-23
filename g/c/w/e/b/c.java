package g.c.w.e.b;

import io.reactivex.BackpressureStrategy;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableCreate.java */
/* loaded from: classes2.dex */
public final class c<T> extends g.c.d<T> {

    /* renamed from: g  reason: collision with root package name */
    public final g.c.f<T> f8190g;

    /* renamed from: h  reason: collision with root package name */
    public final BackpressureStrategy f8191h;

    /* compiled from: FlowableCreate.java */
    /* loaded from: classes2.dex */
    public static abstract class a<T> extends AtomicLong implements g.c.e<T>, m.c.c {

        /* renamed from: f  reason: collision with root package name */
        public final m.c.b<? super T> f8192f;

        /* renamed from: g  reason: collision with root package name */
        public final g.c.w.a.c f8193g = new g.c.w.a.c();

        public a(m.c.b<? super T> bVar) {
            this.f8192f = bVar;
        }

        public void a() {
            if (c()) {
                return;
            }
            try {
                this.f8192f.onComplete();
            } finally {
                g.c.w.a.c cVar = this.f8193g;
                Objects.requireNonNull(cVar);
                DisposableHelper.dispose(cVar);
            }
        }

        public boolean b(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (c()) {
                return false;
            }
            try {
                this.f8192f.onError(th);
                g.c.w.a.c cVar = this.f8193g;
                Objects.requireNonNull(cVar);
                DisposableHelper.dispose(cVar);
                return true;
            } catch (Throwable th2) {
                g.c.w.a.c cVar2 = this.f8193g;
                Objects.requireNonNull(cVar2);
                DisposableHelper.dispose(cVar2);
                throw th2;
            }
        }

        public final boolean c() {
            return this.f8193g.a();
        }

        @Override // m.c.c
        public final void cancel() {
            g.c.w.a.c cVar = this.f8193g;
            Objects.requireNonNull(cVar);
            DisposableHelper.dispose(cVar);
            e();
        }

        public void d() {
        }

        public void e() {
        }

        public boolean f(Throwable th) {
            return b(th);
        }

        @Override // m.c.c
        public final void request(long j2) {
            if (SubscriptionHelper.validate(j2)) {
                f.n.a.n.i.b(this, j2);
                d();
            }
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: classes2.dex */
    public static final class b<T> extends a<T> {

        /* renamed from: h  reason: collision with root package name */
        public final g.c.w.f.b<T> f8194h;

        /* renamed from: i  reason: collision with root package name */
        public Throwable f8195i;

        /* renamed from: j  reason: collision with root package name */
        public volatile boolean f8196j;

        /* renamed from: k  reason: collision with root package name */
        public final AtomicInteger f8197k;

        public b(m.c.b<? super T> bVar, int i2) {
            super(bVar);
            this.f8194h = new g.c.w.f.b<>(i2);
            this.f8197k = new AtomicInteger();
        }

        @Override // g.c.w.e.b.c.a
        public void d() {
            g();
        }

        @Override // g.c.w.e.b.c.a
        public void e() {
            if (this.f8197k.getAndIncrement() == 0) {
                this.f8194h.clear();
            }
        }

        @Override // g.c.w.e.b.c.a
        public boolean f(Throwable th) {
            if (this.f8196j || c()) {
                return false;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f8195i = th;
            this.f8196j = true;
            g();
            return true;
        }

        public void g() {
            int i2;
            if (this.f8197k.getAndIncrement() != 0) {
                return;
            }
            m.c.b<? super T> bVar = this.f8192f;
            g.c.w.f.b<T> bVar2 = this.f8194h;
            int i3 = 1;
            do {
                long j2 = get();
                long j3 = 0;
                while (true) {
                    i2 = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
                    if (i2 == 0) {
                        break;
                    } else if (c()) {
                        bVar2.clear();
                        return;
                    } else {
                        boolean z = this.f8196j;
                        Object obj = (T) bVar2.poll();
                        boolean z2 = obj == null;
                        if (z && z2) {
                            Throwable th = this.f8195i;
                            if (th != null) {
                                b(th);
                                return;
                            } else {
                                a();
                                return;
                            }
                        } else if (z2) {
                            break;
                        } else {
                            bVar.onNext(obj);
                            j3++;
                        }
                    }
                }
                if (i2 == 0) {
                    if (c()) {
                        bVar2.clear();
                        return;
                    }
                    boolean z3 = this.f8196j;
                    boolean isEmpty = bVar2.isEmpty();
                    if (z3 && isEmpty) {
                        Throwable th2 = this.f8195i;
                        if (th2 != null) {
                            b(th2);
                            return;
                        } else {
                            a();
                            return;
                        }
                    }
                }
                if (j3 != 0) {
                    f.n.a.n.i.O(this, j3);
                }
                i3 = this.f8197k.addAndGet(-i3);
            } while (i3 != 0);
        }

        @Override // g.c.e
        public void onNext(T t) {
            if (this.f8196j || c()) {
                return;
            }
            if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                if (f(nullPointerException)) {
                    return;
                }
                f.n.a.n.i.L(nullPointerException);
                return;
            }
            this.f8194h.offer(t);
            g();
        }
    }

    /* compiled from: FlowableCreate.java */
    /* renamed from: g.c.w.e.b.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0210c<T> extends g<T> {
        public C0210c(m.c.b<? super T> bVar) {
            super(bVar);
        }

        @Override // g.c.w.e.b.c.g
        public void g() {
        }
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: classes2.dex */
    public static final class d<T> extends g<T> {
        public d(m.c.b<? super T> bVar) {
            super(bVar);
        }

        @Override // g.c.w.e.b.c.g
        public void g() {
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("create: could not emit value due to lack of requests");
            if (f(missingBackpressureException)) {
                return;
            }
            f.n.a.n.i.L(missingBackpressureException);
        }
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: classes2.dex */
    public static final class e<T> extends a<T> {

        /* renamed from: h  reason: collision with root package name */
        public final AtomicReference<T> f8198h;

        /* renamed from: i  reason: collision with root package name */
        public Throwable f8199i;

        /* renamed from: j  reason: collision with root package name */
        public volatile boolean f8200j;

        /* renamed from: k  reason: collision with root package name */
        public final AtomicInteger f8201k;

        public e(m.c.b<? super T> bVar) {
            super(bVar);
            this.f8198h = new AtomicReference<>();
            this.f8201k = new AtomicInteger();
        }

        @Override // g.c.w.e.b.c.a
        public void d() {
            g();
        }

        @Override // g.c.w.e.b.c.a
        public void e() {
            if (this.f8201k.getAndIncrement() == 0) {
                this.f8198h.lazySet(null);
            }
        }

        @Override // g.c.w.e.b.c.a
        public boolean f(Throwable th) {
            if (this.f8200j || c()) {
                return false;
            }
            if (th == null) {
                NullPointerException nullPointerException = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                if (!f(nullPointerException)) {
                    f.n.a.n.i.L(nullPointerException);
                }
            }
            this.f8199i = th;
            this.f8200j = true;
            g();
            return true;
        }

        public void g() {
            int i2;
            if (this.f8201k.getAndIncrement() != 0) {
                return;
            }
            m.c.b<? super T> bVar = this.f8192f;
            AtomicReference<T> atomicReference = this.f8198h;
            int i3 = 1;
            do {
                long j2 = get();
                long j3 = 0;
                while (true) {
                    i2 = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
                    if (i2 == 0) {
                        break;
                    } else if (c()) {
                        atomicReference.lazySet(null);
                        return;
                    } else {
                        boolean z = this.f8200j;
                        Object obj = (T) atomicReference.getAndSet(null);
                        boolean z2 = obj == null;
                        if (z && z2) {
                            Throwable th = this.f8199i;
                            if (th != null) {
                                b(th);
                                return;
                            } else {
                                a();
                                return;
                            }
                        } else if (z2) {
                            break;
                        } else {
                            bVar.onNext(obj);
                            j3++;
                        }
                    }
                }
                if (i2 == 0) {
                    if (c()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z3 = this.f8200j;
                    boolean z4 = atomicReference.get() == null;
                    if (z3 && z4) {
                        Throwable th2 = this.f8199i;
                        if (th2 != null) {
                            b(th2);
                            return;
                        } else {
                            a();
                            return;
                        }
                    }
                }
                if (j3 != 0) {
                    f.n.a.n.i.O(this, j3);
                }
                i3 = this.f8201k.addAndGet(-i3);
            } while (i3 != 0);
        }

        @Override // g.c.e
        public void onNext(T t) {
            if (this.f8200j || c()) {
                return;
            }
            if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                if (f(nullPointerException)) {
                    return;
                }
                f.n.a.n.i.L(nullPointerException);
                return;
            }
            this.f8198h.set(t);
            g();
        }
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: classes2.dex */
    public static final class f<T> extends a<T> {
        public f(m.c.b<? super T> bVar) {
            super(bVar);
        }

        @Override // g.c.e
        public void onNext(T t) {
            long j2;
            if (c()) {
                return;
            }
            if (t != null) {
                this.f8192f.onNext(t);
                do {
                    j2 = get();
                    if (j2 == 0) {
                        return;
                    }
                } while (!compareAndSet(j2, j2 - 1));
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            if (b(nullPointerException)) {
                return;
            }
            f.n.a.n.i.L(nullPointerException);
        }
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: classes2.dex */
    public static abstract class g<T> extends a<T> {
        public g(m.c.b<? super T> bVar) {
            super(bVar);
        }

        public abstract void g();

        @Override // g.c.e
        public final void onNext(T t) {
            if (c()) {
                return;
            }
            if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                if (b(nullPointerException)) {
                    return;
                }
                f.n.a.n.i.L(nullPointerException);
            } else if (get() != 0) {
                this.f8192f.onNext(t);
                f.n.a.n.i.O(this, 1L);
            } else {
                g();
            }
        }
    }

    public c(g.c.f<T> fVar, BackpressureStrategy backpressureStrategy) {
        this.f8190g = fVar;
        this.f8191h = backpressureStrategy;
    }

    @Override // g.c.d
    public void e(m.c.b<? super T> bVar) {
        a fVar;
        int ordinal = this.f8191h.ordinal();
        if (ordinal == 0) {
            fVar = new f(bVar);
        } else if (ordinal == 1) {
            fVar = new d(bVar);
        } else if (ordinal == 3) {
            fVar = new C0210c(bVar);
        } else if (ordinal != 4) {
            fVar = new b(bVar, g.c.d.f8128f);
        } else {
            fVar = new e(bVar);
        }
        bVar.onSubscribe(fVar);
        try {
            this.f8190g.subscribe(fVar);
        } catch (Throwable th) {
            f.n.a.n.i.d0(th);
            if (fVar.f(th)) {
                return;
            }
            f.n.a.n.i.L(th);
        }
    }
}
