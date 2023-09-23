package f.e.a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import f.e.a.c;
import f.e.a.l.j;
import f.e.a.l.q.k;
import f.e.a.m.c;
import f.e.a.m.l;
import f.e.a.m.m;
import f.e.a.m.o;
import f.e.a.m.r;
import f.e.a.m.s;
import f.e.a.m.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: RequestManager.java */
/* loaded from: classes.dex */
public class h implements ComponentCallbacks2, m {
    public static final f.e.a.p.f p;

    /* renamed from: f  reason: collision with root package name */
    public final f.e.a.b f3179f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f3180g;

    /* renamed from: h  reason: collision with root package name */
    public final l f3181h;

    /* renamed from: i  reason: collision with root package name */
    public final s f3182i;

    /* renamed from: j  reason: collision with root package name */
    public final r f3183j;

    /* renamed from: k  reason: collision with root package name */
    public final y f3184k;

    /* renamed from: l  reason: collision with root package name */
    public final Runnable f3185l;

    /* renamed from: m  reason: collision with root package name */
    public final f.e.a.m.c f3186m;
    public final CopyOnWriteArrayList<f.e.a.p.e<Object>> n;
    public f.e.a.p.f o;

    /* compiled from: RequestManager.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.f3181h.c(hVar);
        }
    }

    /* compiled from: RequestManager.java */
    /* loaded from: classes.dex */
    public class b implements c.a {
        public final s a;

        public b(s sVar) {
            this.a = sVar;
        }

        @Override // f.e.a.m.c.a
        public void a(boolean z) {
            if (z) {
                synchronized (h.this) {
                    s sVar = this.a;
                    Iterator it = ((ArrayList) f.e.a.r.l.e(sVar.a)).iterator();
                    while (it.hasNext()) {
                        f.e.a.p.d dVar = (f.e.a.p.d) it.next();
                        if (!dVar.k() && !dVar.g()) {
                            dVar.clear();
                            if (!sVar.c) {
                                dVar.i();
                            } else {
                                sVar.b.add(dVar);
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        f.e.a.p.f c = new f.e.a.p.f().c(Bitmap.class);
        c.y = true;
        p = c;
        new f.e.a.p.f().c(f.e.a.l.s.g.c.class).y = true;
        new f.e.a.p.f().d(k.b).j(Priority.LOW).n(true);
    }

    public h(f.e.a.b bVar, l lVar, r rVar, Context context) {
        f.e.a.m.c oVar;
        f.e.a.p.f fVar;
        s sVar = new s();
        f.e.a.m.d dVar = bVar.f3158k;
        this.f3184k = new y();
        a aVar = new a();
        this.f3185l = aVar;
        this.f3179f = bVar;
        this.f3181h = lVar;
        this.f3183j = rVar;
        this.f3182i = sVar;
        this.f3180g = context;
        Context applicationContext = context.getApplicationContext();
        b bVar2 = new b(sVar);
        Objects.requireNonNull((f.e.a.m.f) dVar);
        boolean z = e.i.c.a.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        if (z) {
            oVar = new f.e.a.m.e(applicationContext, bVar2);
        } else {
            oVar = new o();
        }
        this.f3186m = oVar;
        if (f.e.a.r.l.h()) {
            f.e.a.r.l.k(aVar);
        } else {
            lVar.c(this);
        }
        lVar.c(oVar);
        this.n = new CopyOnWriteArrayList<>(bVar.f3155h.f3172e);
        d dVar2 = bVar.f3155h;
        synchronized (dVar2) {
            if (dVar2.f3177j == null) {
                Objects.requireNonNull((c.a) dVar2.f3171d);
                f.e.a.p.f fVar2 = new f.e.a.p.f();
                fVar2.y = true;
                dVar2.f3177j = fVar2;
            }
            fVar = dVar2.f3177j;
        }
        synchronized (this) {
            f.e.a.p.f clone = fVar.clone();
            if (clone.y && !clone.A) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            clone.A = true;
            clone.y = true;
            this.o = clone;
        }
        synchronized (bVar.f3159l) {
            if (!bVar.f3159l.contains(this)) {
                bVar.f3159l.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public g<Drawable> a() {
        return new g<>(this.f3179f, this, Drawable.class, this.f3180g);
    }

    public void b(f.e.a.p.j.h<?> hVar) {
        boolean z;
        if (hVar == null) {
            return;
        }
        boolean h2 = h(hVar);
        f.e.a.p.d request = hVar.getRequest();
        if (h2) {
            return;
        }
        f.e.a.b bVar = this.f3179f;
        synchronized (bVar.f3159l) {
            Iterator<h> it = bVar.f3159l.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (it.next().h(hVar)) {
                    z = true;
                    break;
                }
            }
        }
        if (z || request == null) {
            return;
        }
        hVar.setRequest(null);
        request.clear();
    }

    public g<Drawable> c(Uri uri) {
        return a().z(uri);
    }

    public g<Drawable> d(Integer num) {
        PackageInfo packageInfo;
        String uuid;
        g<Drawable> a2 = a();
        g<Drawable> z = a2.z(num);
        Context context = a2.F;
        int i2 = f.e.a.q.a.f3597d;
        ConcurrentMap<String, j> concurrentMap = f.e.a.q.b.a;
        String packageName = context.getPackageName();
        j jVar = f.e.a.q.b.a.get(packageName);
        if (jVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e2) {
                StringBuilder A = f.a.b.a.a.A("Cannot resolve info for");
                A.append(context.getPackageName());
                Log.e("AppVersionSignature", A.toString(), e2);
                packageInfo = null;
            }
            if (packageInfo != null) {
                uuid = String.valueOf(packageInfo.versionCode);
            } else {
                uuid = UUID.randomUUID().toString();
            }
            f.e.a.q.d dVar = new f.e.a.q.d(uuid);
            jVar = f.e.a.q.b.a.putIfAbsent(packageName, dVar);
            if (jVar == null) {
                jVar = dVar;
            }
        }
        return z.a(new f.e.a.p.f().m(new f.e.a.q.a(context.getResources().getConfiguration().uiMode & 48, jVar)));
    }

    public g<Drawable> e(String str) {
        return a().z(str);
    }

    public synchronized void f() {
        s sVar = this.f3182i;
        sVar.c = true;
        Iterator it = ((ArrayList) f.e.a.r.l.e(sVar.a)).iterator();
        while (it.hasNext()) {
            f.e.a.p.d dVar = (f.e.a.p.d) it.next();
            if (dVar.isRunning()) {
                dVar.e();
                sVar.b.add(dVar);
            }
        }
    }

    public synchronized void g() {
        s sVar = this.f3182i;
        sVar.c = false;
        Iterator it = ((ArrayList) f.e.a.r.l.e(sVar.a)).iterator();
        while (it.hasNext()) {
            f.e.a.p.d dVar = (f.e.a.p.d) it.next();
            if (!dVar.k() && !dVar.isRunning()) {
                dVar.i();
            }
        }
        sVar.b.clear();
    }

    public synchronized boolean h(f.e.a.p.j.h<?> hVar) {
        f.e.a.p.d request = hVar.getRequest();
        if (request == null) {
            return true;
        }
        if (this.f3182i.a(request)) {
            this.f3184k.f3559f.remove(hVar);
            hVar.setRequest(null);
            return true;
        }
        return false;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // f.e.a.m.m
    public synchronized void onDestroy() {
        this.f3184k.onDestroy();
        for (f.e.a.p.j.h<?> hVar : f.e.a.r.l.e(this.f3184k.f3559f)) {
            b(hVar);
        }
        this.f3184k.f3559f.clear();
        s sVar = this.f3182i;
        Iterator it = ((ArrayList) f.e.a.r.l.e(sVar.a)).iterator();
        while (it.hasNext()) {
            sVar.a((f.e.a.p.d) it.next());
        }
        sVar.b.clear();
        this.f3181h.f(this);
        this.f3181h.f(this.f3186m);
        f.e.a.r.l.f().removeCallbacks(this.f3185l);
        f.e.a.b bVar = this.f3179f;
        synchronized (bVar.f3159l) {
            if (bVar.f3159l.contains(this)) {
                bVar.f3159l.remove(this);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // f.e.a.m.m
    public synchronized void onStart() {
        g();
        this.f3184k.onStart();
    }

    @Override // f.e.a.m.m
    public synchronized void onStop() {
        f();
        this.f3184k.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f3182i + ", treeNode=" + this.f3183j + "}";
    }
}
