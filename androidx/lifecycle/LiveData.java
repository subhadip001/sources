package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import e.s.k;
import e.s.m;
import e.s.n;
import e.s.t;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f432k = new Object();
    public final Object a;
    public e.c.a.b.b<t<? super T>, LiveData<T>.c> b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f433d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f434e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f435f;

    /* renamed from: g  reason: collision with root package name */
    public int f436g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f437h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f438i;

    /* renamed from: j  reason: collision with root package name */
    public final Runnable f439j;

    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.c implements k {

        /* renamed from: j  reason: collision with root package name */
        public final m f440j;

        public LifecycleBoundObserver(m mVar, t<? super T> tVar) {
            super(tVar);
            this.f440j = mVar;
        }

        @Override // e.s.k
        public void d(m mVar, Lifecycle.Event event) {
            Lifecycle.State state = ((n) this.f440j.getLifecycle()).b;
            if (state == Lifecycle.State.DESTROYED) {
                LiveData.this.j(this.f443f);
                return;
            }
            Lifecycle.State state2 = null;
            while (state2 != state) {
                c(((n) this.f440j.getLifecycle()).b.isAtLeast(Lifecycle.State.STARTED));
                state2 = state;
                state = ((n) this.f440j.getLifecycle()).b;
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        public void f() {
            n nVar = (n) this.f440j.getLifecycle();
            nVar.d("removeObserver");
            nVar.a.e(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean g(m mVar) {
            return this.f440j == mVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean h() {
            return ((n) this.f440j.getLifecycle()).b.isAtLeast(Lifecycle.State.STARTED);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.a) {
                obj = LiveData.this.f435f;
                LiveData.this.f435f = LiveData.f432k;
            }
            LiveData.this.k(obj);
        }
    }

    /* loaded from: classes.dex */
    public class b extends LiveData<T>.c {
        public b(LiveData liveData, t<? super T> tVar) {
            super(tVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean h() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public abstract class c {

        /* renamed from: f  reason: collision with root package name */
        public final t<? super T> f443f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f444g;

        /* renamed from: h  reason: collision with root package name */
        public int f445h = -1;

        public c(t<? super T> tVar) {
            this.f443f = tVar;
        }

        public void c(boolean z) {
            if (z == this.f444g) {
                return;
            }
            this.f444g = z;
            LiveData liveData = LiveData.this;
            int i2 = z ? 1 : -1;
            int i3 = liveData.c;
            liveData.c = i2 + i3;
            if (!liveData.f433d) {
                liveData.f433d = true;
                while (true) {
                    try {
                        int i4 = liveData.c;
                        if (i3 == i4) {
                            break;
                        }
                        boolean z2 = i3 == 0 && i4 > 0;
                        boolean z3 = i3 > 0 && i4 == 0;
                        if (z2) {
                            liveData.g();
                        } else if (z3) {
                            liveData.h();
                        }
                        i3 = i4;
                    } finally {
                        liveData.f433d = false;
                    }
                }
            }
            if (this.f444g) {
                LiveData.this.c(this);
            }
        }

        public void f() {
        }

        public boolean g(m mVar) {
            return false;
        }

        public abstract boolean h();
    }

    public LiveData(T t) {
        this.a = new Object();
        this.b = new e.c.a.b.b<>();
        this.c = 0;
        this.f435f = f432k;
        this.f439j = new a();
        this.f434e = t;
        this.f436g = 0;
    }

    public static void a(String str) {
        if (!e.c.a.a.a.d().b()) {
            throw new IllegalStateException(f.a.b.a.a.q("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(LiveData<T>.c cVar) {
        if (cVar.f444g) {
            if (!cVar.h()) {
                cVar.c(false);
                return;
            }
            int i2 = cVar.f445h;
            int i3 = this.f436g;
            if (i2 >= i3) {
                return;
            }
            cVar.f445h = i3;
            cVar.f443f.a((Object) this.f434e);
        }
    }

    public void c(LiveData<T>.c cVar) {
        if (this.f437h) {
            this.f438i = true;
            return;
        }
        this.f437h = true;
        do {
            this.f438i = false;
            if (cVar != null) {
                b(cVar);
                cVar = null;
            } else {
                e.c.a.b.b<t<? super T>, LiveData<T>.c>.d b2 = this.b.b();
                while (b2.hasNext()) {
                    b((c) ((Map.Entry) b2.next()).getValue());
                    if (this.f438i) {
                        break;
                    }
                }
            }
        } while (this.f438i);
        this.f437h = false;
    }

    public T d() {
        T t = (T) this.f434e;
        if (t != f432k) {
            return t;
        }
        return null;
    }

    public void e(m mVar, t<? super T> tVar) {
        a("observe");
        if (((n) mVar.getLifecycle()).b == Lifecycle.State.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(mVar, tVar);
        LiveData<T>.c d2 = this.b.d(tVar, lifecycleBoundObserver);
        if (d2 != null && !d2.g(mVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (d2 != null) {
            return;
        }
        mVar.getLifecycle().a(lifecycleBoundObserver);
    }

    public void f(t<? super T> tVar) {
        a("observeForever");
        b bVar = new b(this, tVar);
        LiveData<T>.c d2 = this.b.d(tVar, bVar);
        if (d2 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (d2 != null) {
            return;
        }
        bVar.c(true);
    }

    public void g() {
    }

    public void h() {
    }

    public void i(T t) {
        boolean z;
        synchronized (this.a) {
            z = this.f435f == f432k;
            this.f435f = t;
        }
        if (z) {
            e.c.a.a.a.d().a.c(this.f439j);
        }
    }

    public void j(t<? super T> tVar) {
        a("removeObserver");
        LiveData<T>.c e2 = this.b.e(tVar);
        if (e2 == null) {
            return;
        }
        e2.f();
        e2.c(false);
    }

    public void k(T t) {
        a("setValue");
        this.f436g++;
        this.f434e = t;
        c(null);
    }

    public LiveData() {
        this.a = new Object();
        this.b = new e.c.a.b.b<>();
        this.c = 0;
        Object obj = f432k;
        this.f435f = obj;
        this.f439j = new a();
        this.f434e = obj;
        this.f436g = -1;
    }
}
