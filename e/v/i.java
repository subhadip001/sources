package e.v;

import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import e.v.f;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: RoomTrackingLiveData.java */
/* loaded from: classes.dex */
public class i<T> extends LiveData<T> {

    /* renamed from: l  reason: collision with root package name */
    public final RoomDatabase f2965l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f2966m;
    public final Callable<T> n;
    public final e o;
    public final f.c p;
    public final AtomicBoolean q = new AtomicBoolean(true);
    public final AtomicBoolean r = new AtomicBoolean(false);
    public final AtomicBoolean s = new AtomicBoolean(false);
    public final Runnable t = new a();
    public final Runnable u = new b();

    /* compiled from: RoomTrackingLiveData.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            if (i.this.s.compareAndSet(false, true)) {
                i iVar = i.this;
                f fVar = iVar.f2965l.f558e;
                f.c cVar = iVar.p;
                Objects.requireNonNull(fVar);
                fVar.a(new f.e(fVar, cVar));
            }
            do {
                if (i.this.r.compareAndSet(false, true)) {
                    T t = null;
                    z = false;
                    while (i.this.q.compareAndSet(true, false)) {
                        try {
                            try {
                                t = i.this.n.call();
                                z = true;
                            } catch (Exception e2) {
                                throw new RuntimeException("Exception while computing database live data.", e2);
                            }
                        } finally {
                            i.this.r.set(false);
                        }
                    }
                    if (z) {
                        i.this.i(t);
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    return;
                }
            } while (i.this.q.get());
        }
    }

    /* compiled from: RoomTrackingLiveData.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor executor;
            i iVar = i.this;
            boolean z = iVar.c > 0;
            if (iVar.q.compareAndSet(false, true) && z) {
                i iVar2 = i.this;
                if (iVar2.f2966m) {
                    executor = iVar2.f2965l.c;
                } else {
                    executor = iVar2.f2965l.b;
                }
                executor.execute(iVar2.t);
            }
        }
    }

    /* compiled from: RoomTrackingLiveData.java */
    /* loaded from: classes.dex */
    public class c extends f.c {
        public c(String[] strArr) {
            super(strArr);
        }

        @Override // e.v.f.c
        public void a(Set<String> set) {
            e.c.a.a.a d2 = e.c.a.a.a.d();
            Runnable runnable = i.this.u;
            if (d2.b()) {
                runnable.run();
            } else {
                d2.c(runnable);
            }
        }
    }

    public i(RoomDatabase roomDatabase, e eVar, boolean z, Callable<T> callable, String[] strArr) {
        this.f2965l = roomDatabase;
        this.f2966m = z;
        this.n = callable;
        this.o = eVar;
        this.p = new c(strArr);
    }

    @Override // androidx.lifecycle.LiveData
    public void g() {
        Executor executor;
        this.o.a.add(this);
        if (this.f2966m) {
            executor = this.f2965l.c;
        } else {
            executor = this.f2965l.b;
        }
        executor.execute(this.t);
    }

    @Override // androidx.lifecycle.LiveData
    public void h() {
        this.o.a.remove(this);
    }
}
