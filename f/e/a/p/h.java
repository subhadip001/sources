package f.e.a.p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestCoordinator;
import f.e.a.c;
import f.e.a.l.q.l;
import f.e.a.l.q.v;
import f.e.a.r.m.d;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: SingleRequest.java */
/* loaded from: classes.dex */
public final class h<R> implements d, f.e.a.p.j.g, g {
    public static final boolean E = Log.isLoggable("GlideRequest", 2);
    public int A;
    public int B;
    public boolean C;
    public RuntimeException D;
    public int a;
    public final String b;
    public final f.e.a.r.m.d c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f3571d;

    /* renamed from: e  reason: collision with root package name */
    public final e<R> f3572e;

    /* renamed from: f  reason: collision with root package name */
    public final RequestCoordinator f3573f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f3574g;

    /* renamed from: h  reason: collision with root package name */
    public final f.e.a.d f3575h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f3576i;

    /* renamed from: j  reason: collision with root package name */
    public final Class<R> f3577j;

    /* renamed from: k  reason: collision with root package name */
    public final f.e.a.p.a<?> f3578k;

    /* renamed from: l  reason: collision with root package name */
    public final int f3579l;

    /* renamed from: m  reason: collision with root package name */
    public final int f3580m;
    public final Priority n;
    public final f.e.a.p.j.h<R> o;
    public final List<e<R>> p;
    public final f.e.a.p.k.c<? super R> q;
    public final Executor r;
    public v<R> s;
    public l.d t;
    public long u;
    public volatile l v;
    public a w;
    public Drawable x;
    public Drawable y;
    public Drawable z;

    /* compiled from: SingleRequest.java */
    /* loaded from: classes.dex */
    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public h(Context context, f.e.a.d dVar, Object obj, Object obj2, Class<R> cls, f.e.a.p.a<?> aVar, int i2, int i3, Priority priority, f.e.a.p.j.h<R> hVar, e<R> eVar, List<e<R>> list, RequestCoordinator requestCoordinator, l lVar, f.e.a.p.k.c<? super R> cVar, Executor executor) {
        this.b = E ? String.valueOf(hashCode()) : null;
        this.c = new d.b();
        this.f3571d = obj;
        this.f3574g = context;
        this.f3575h = dVar;
        this.f3576i = obj2;
        this.f3577j = cls;
        this.f3578k = aVar;
        this.f3579l = i2;
        this.f3580m = i3;
        this.n = priority;
        this.o = hVar;
        this.f3572e = eVar;
        this.p = list;
        this.f3573f = requestCoordinator;
        this.v = lVar;
        this.q = cVar;
        this.r = executor;
        this.w = a.PENDING;
        if (this.D == null && dVar.f3175h.a.containsKey(c.C0067c.class)) {
            this.D = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // f.e.a.p.d
    public boolean a() {
        boolean z;
        synchronized (this.f3571d) {
            z = this.w == a.COMPLETE;
        }
        return z;
    }

    @Override // f.e.a.p.j.g
    public void b(int i2, int i3) {
        Object obj;
        int i4 = i2;
        this.c.a();
        Object obj2 = this.f3571d;
        synchronized (obj2) {
            try {
                boolean z = E;
                if (z) {
                    n("Got onSizeReady in " + f.e.a.r.h.a(this.u));
                }
                if (this.w == a.WAITING_FOR_SIZE) {
                    a aVar = a.RUNNING;
                    this.w = aVar;
                    float f2 = this.f3578k.f3561g;
                    if (i4 != Integer.MIN_VALUE) {
                        i4 = Math.round(i4 * f2);
                    }
                    this.A = i4;
                    this.B = i3 == Integer.MIN_VALUE ? i3 : Math.round(f2 * i3);
                    if (z) {
                        n("finished setup for calling load in " + f.e.a.r.h.a(this.u));
                    }
                    l lVar = this.v;
                    f.e.a.d dVar = this.f3575h;
                    Object obj3 = this.f3576i;
                    f.e.a.p.a<?> aVar2 = this.f3578k;
                    try {
                        obj = obj2;
                        try {
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj2;
                    }
                    try {
                        this.t = lVar.b(dVar, obj3, aVar2.q, this.A, this.B, aVar2.x, this.f3577j, this.n, aVar2.f3562h, aVar2.w, aVar2.r, aVar2.D, aVar2.v, aVar2.n, aVar2.B, aVar2.E, aVar2.C, this, this.r);
                        if (this.w != aVar) {
                            this.t = null;
                        }
                        if (z) {
                            n("finished onSizeReady in " + f.e.a.r.h.a(this.u));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            try {
                                break;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
            }
        }
    }

    public final void c() {
        if (this.C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f A[Catch: all -> 0x0043, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0011, B:8:0x0013, B:10:0x001b, B:12:0x001f, B:14:0x0023, B:20:0x002f, B:21:0x0038, B:22:0x003a), top: B:29:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // f.e.a.p.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f3571d
            monitor-enter(r0)
            r5.c()     // Catch: java.lang.Throwable -> L43
            f.e.a.r.m.d r1 = r5.c     // Catch: java.lang.Throwable -> L43
            r1.a()     // Catch: java.lang.Throwable -> L43
            f.e.a.p.h$a r1 = r5.w     // Catch: java.lang.Throwable -> L43
            f.e.a.p.h$a r2 = f.e.a.p.h.a.CLEARED     // Catch: java.lang.Throwable -> L43
            if (r1 != r2) goto L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            return
        L13:
            r5.d()     // Catch: java.lang.Throwable -> L43
            f.e.a.l.q.v<R> r1 = r5.s     // Catch: java.lang.Throwable -> L43
            r3 = 0
            if (r1 == 0) goto L1e
            r5.s = r3     // Catch: java.lang.Throwable -> L43
            goto L1f
        L1e:
            r1 = r3
        L1f:
            com.bumptech.glide.request.RequestCoordinator r3 = r5.f3573f     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L2c
            boolean r3 = r3.l(r5)     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L2a
            goto L2c
        L2a:
            r3 = 0
            goto L2d
        L2c:
            r3 = 1
        L2d:
            if (r3 == 0) goto L38
            f.e.a.p.j.h<R> r3 = r5.o     // Catch: java.lang.Throwable -> L43
            android.graphics.drawable.Drawable r4 = r5.j()     // Catch: java.lang.Throwable -> L43
            r3.onLoadCleared(r4)     // Catch: java.lang.Throwable -> L43
        L38:
            r5.w = r2     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L42
            f.e.a.l.q.l r0 = r5.v
            r0.f(r1)
        L42:
            return
        L43:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.a.p.h.clear():void");
    }

    public final void d() {
        c();
        this.c.a();
        this.o.removeCallback(this);
        l.d dVar = this.t;
        if (dVar != null) {
            synchronized (l.this) {
                dVar.a.h(dVar.b);
            }
            this.t = null;
        }
    }

    @Override // f.e.a.p.d
    public void e() {
        synchronized (this.f3571d) {
            if (isRunning()) {
                clear();
            }
        }
    }

    @Override // f.e.a.p.d
    public boolean f(d dVar) {
        int i2;
        int i3;
        Object obj;
        Class<R> cls;
        f.e.a.p.a<?> aVar;
        Priority priority;
        int size;
        int i4;
        int i5;
        Object obj2;
        Class<R> cls2;
        f.e.a.p.a<?> aVar2;
        Priority priority2;
        int size2;
        boolean equals;
        if (dVar instanceof h) {
            synchronized (this.f3571d) {
                i2 = this.f3579l;
                i3 = this.f3580m;
                obj = this.f3576i;
                cls = this.f3577j;
                aVar = this.f3578k;
                priority = this.n;
                List<e<R>> list = this.p;
                size = list != null ? list.size() : 0;
            }
            h hVar = (h) dVar;
            synchronized (hVar.f3571d) {
                i4 = hVar.f3579l;
                i5 = hVar.f3580m;
                obj2 = hVar.f3576i;
                cls2 = hVar.f3577j;
                aVar2 = hVar.f3578k;
                priority2 = hVar.n;
                List<e<R>> list2 = hVar.p;
                size2 = list2 != null ? list2.size() : 0;
            }
            if (i2 == i4 && i3 == i5) {
                char[] cArr = f.e.a.r.l.a;
                if (obj == null) {
                    equals = obj2 == null;
                } else if (obj instanceof f.e.a.l.r.l) {
                    equals = ((f.e.a.l.r.l) obj).a(obj2);
                } else {
                    equals = obj.equals(obj2);
                }
                if (equals && cls.equals(cls2) && aVar.equals(aVar2) && priority == priority2 && size == size2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // f.e.a.p.d
    public boolean g() {
        boolean z;
        synchronized (this.f3571d) {
            z = this.w == a.CLEARED;
        }
        return z;
    }

    public final Drawable h() {
        int i2;
        if (this.z == null) {
            f.e.a.p.a<?> aVar = this.f3578k;
            Drawable drawable = aVar.t;
            this.z = drawable;
            if (drawable == null && (i2 = aVar.u) > 0) {
                this.z = m(i2);
            }
        }
        return this.z;
    }

    @Override // f.e.a.p.d
    public void i() {
        a aVar = a.RUNNING;
        synchronized (this.f3571d) {
            c();
            this.c.a();
            int i2 = f.e.a.r.h.b;
            this.u = SystemClock.elapsedRealtimeNanos();
            if (this.f3576i == null) {
                if (f.e.a.r.l.j(this.f3579l, this.f3580m)) {
                    this.A = this.f3579l;
                    this.B = this.f3580m;
                }
                o(new GlideException("Received null model"), h() == null ? 5 : 3);
                return;
            }
            a aVar2 = this.w;
            if (aVar2 != aVar) {
                boolean z = false;
                if (aVar2 == a.COMPLETE) {
                    p(this.s, DataSource.MEMORY_CACHE, false);
                    return;
                }
                List<e<R>> list = this.p;
                if (list != null) {
                    for (e<R> eVar : list) {
                        if (eVar instanceof c) {
                            Objects.requireNonNull((c) eVar);
                        }
                    }
                }
                this.a = -1;
                a aVar3 = a.WAITING_FOR_SIZE;
                this.w = aVar3;
                if (f.e.a.r.l.j(this.f3579l, this.f3580m)) {
                    b(this.f3579l, this.f3580m);
                } else {
                    this.o.getSize(this);
                }
                a aVar4 = this.w;
                if (aVar4 == aVar || aVar4 == aVar3) {
                    RequestCoordinator requestCoordinator = this.f3573f;
                    if ((requestCoordinator == null || requestCoordinator.d(this)) ? true : true) {
                        this.o.onLoadStarted(j());
                    }
                }
                if (E) {
                    n("finished run method in " + f.e.a.r.h.a(this.u));
                }
                return;
            }
            throw new IllegalArgumentException("Cannot restart a running request");
        }
    }

    @Override // f.e.a.p.d
    public boolean isRunning() {
        boolean z;
        synchronized (this.f3571d) {
            a aVar = this.w;
            z = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
        }
        return z;
    }

    public final Drawable j() {
        int i2;
        if (this.y == null) {
            f.e.a.p.a<?> aVar = this.f3578k;
            Drawable drawable = aVar.f3566l;
            this.y = drawable;
            if (drawable == null && (i2 = aVar.f3567m) > 0) {
                this.y = m(i2);
            }
        }
        return this.y;
    }

    @Override // f.e.a.p.d
    public boolean k() {
        boolean z;
        synchronized (this.f3571d) {
            z = this.w == a.COMPLETE;
        }
        return z;
    }

    public final boolean l() {
        RequestCoordinator requestCoordinator = this.f3573f;
        return requestCoordinator == null || !requestCoordinator.b().a();
    }

    public final Drawable m(int i2) {
        Resources.Theme theme = this.f3578k.z;
        if (theme == null) {
            theme = this.f3574g.getTheme();
        }
        f.e.a.d dVar = this.f3575h;
        return f.e.a.l.s.e.b.a(dVar, dVar, i2, theme);
    }

    public final void n(String str) {
        StringBuilder D = f.a.b.a.a.D(str, " this: ");
        D.append(this.b);
        Log.v("GlideRequest", D.toString());
    }

    public final void o(GlideException glideException, int i2) {
        boolean z;
        this.c.a();
        synchronized (this.f3571d) {
            Objects.requireNonNull(glideException);
            int i3 = this.f3575h.f3176i;
            if (i3 <= i2) {
                Log.w("Glide", "Load failed for [" + this.f3576i + "] with dimensions [" + this.A + "x" + this.B + "]", glideException);
                if (i3 <= 4) {
                    glideException.e("Glide");
                }
            }
            this.t = null;
            this.w = a.FAILED;
            RequestCoordinator requestCoordinator = this.f3573f;
            if (requestCoordinator != null) {
                requestCoordinator.c(this);
            }
            boolean z2 = true;
            this.C = true;
            List<e<R>> list = this.p;
            if (list != null) {
                z = false;
                for (e<R> eVar : list) {
                    z |= eVar.onLoadFailed(glideException, this.f3576i, this.o, l());
                }
            } else {
                z = false;
            }
            e<R> eVar2 = this.f3572e;
            if (eVar2 == null || !eVar2.onLoadFailed(glideException, this.f3576i, this.o, l())) {
                z2 = false;
            }
            if (!(z | z2)) {
                r();
            }
            this.C = false;
        }
    }

    public void p(v<?> vVar, DataSource dataSource, boolean z) {
        this.c.a();
        v<?> vVar2 = null;
        try {
            synchronized (this.f3571d) {
                try {
                    this.t = null;
                    if (vVar == null) {
                        o(new GlideException("Expected to receive a Resource<R> with an object of " + this.f3577j + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = vVar.get();
                    try {
                        if (obj != null && this.f3577j.isAssignableFrom(obj.getClass())) {
                            RequestCoordinator requestCoordinator = this.f3573f;
                            if (!(requestCoordinator == null || requestCoordinator.h(this))) {
                                this.s = null;
                                this.w = a.COMPLETE;
                                this.v.f(vVar);
                                return;
                            }
                            q(vVar, obj, dataSource);
                            return;
                        }
                        this.s = null;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected to receive an object of ");
                        sb.append(this.f3577j);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(vVar);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        o(new GlideException(sb.toString()), 5);
                        this.v.f(vVar);
                    } catch (Throwable th) {
                        vVar2 = vVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (vVar2 != null) {
                this.v.f(vVar2);
            }
            throw th3;
        }
    }

    public final void q(v vVar, Object obj, DataSource dataSource) {
        boolean z;
        boolean l2 = l();
        this.w = a.COMPLETE;
        this.s = vVar;
        if (this.f3575h.f3176i <= 3) {
            StringBuilder A = f.a.b.a.a.A("Finished loading ");
            A.append(obj.getClass().getSimpleName());
            A.append(" from ");
            A.append(dataSource);
            A.append(" for ");
            A.append(this.f3576i);
            A.append(" with size [");
            A.append(this.A);
            A.append("x");
            A.append(this.B);
            A.append("] in ");
            A.append(f.e.a.r.h.a(this.u));
            A.append(" ms");
            Log.d("Glide", A.toString());
        }
        RequestCoordinator requestCoordinator = this.f3573f;
        if (requestCoordinator != null) {
            requestCoordinator.j(this);
        }
        boolean z2 = true;
        this.C = true;
        try {
            List<e<R>> list = this.p;
            if (list != null) {
                z = false;
                for (e<R> eVar : list) {
                    z |= eVar.onResourceReady(obj, this.f3576i, this.o, dataSource, l2);
                }
            } else {
                z = false;
            }
            e<R> eVar2 = this.f3572e;
            if (eVar2 == null || !eVar2.onResourceReady(obj, this.f3576i, this.o, dataSource, l2)) {
                z2 = false;
            }
            if (!(z2 | z)) {
                Objects.requireNonNull(this.q);
                this.o.onResourceReady(obj, f.e.a.p.k.a.a);
            }
        } finally {
            this.C = false;
        }
    }

    public final void r() {
        int i2;
        RequestCoordinator requestCoordinator = this.f3573f;
        if (requestCoordinator == null || requestCoordinator.d(this)) {
            Drawable h2 = this.f3576i == null ? h() : null;
            if (h2 == null) {
                if (this.x == null) {
                    f.e.a.p.a<?> aVar = this.f3578k;
                    Drawable drawable = aVar.f3564j;
                    this.x = drawable;
                    if (drawable == null && (i2 = aVar.f3565k) > 0) {
                        this.x = m(i2);
                    }
                }
                h2 = this.x;
            }
            if (h2 == null) {
                h2 = j();
            }
            this.o.onLoadFailed(h2);
        }
    }

    public String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f3571d) {
            obj = this.f3576i;
            cls = this.f3577j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
