package f.e.a.l.q;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.DataSource;
import f.e.a.l.q.g;
import f.e.a.l.r.n;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* compiled from: SourceGenerator.java */
/* loaded from: classes.dex */
public class a0 implements g, g.a {

    /* renamed from: f  reason: collision with root package name */
    public final h<?> f3268f;

    /* renamed from: g  reason: collision with root package name */
    public final g.a f3269g;

    /* renamed from: h  reason: collision with root package name */
    public volatile int f3270h;

    /* renamed from: i  reason: collision with root package name */
    public volatile d f3271i;

    /* renamed from: j  reason: collision with root package name */
    public volatile Object f3272j;

    /* renamed from: k  reason: collision with root package name */
    public volatile n.a<?> f3273k;

    /* renamed from: l  reason: collision with root package name */
    public volatile e f3274l;

    public a0(h<?> hVar, g.a aVar) {
        this.f3268f = hVar;
        this.f3269g = aVar;
    }

    @Override // f.e.a.l.q.g.a
    public void a(f.e.a.l.j jVar, Exception exc, f.e.a.l.p.d<?> dVar, DataSource dataSource) {
        this.f3269g.a(jVar, exc, dVar, this.f3273k.c.d());
    }

    @Override // f.e.a.l.q.g
    public boolean b() {
        if (this.f3272j != null) {
            Object obj = this.f3272j;
            this.f3272j = null;
            try {
                if (!c(obj)) {
                    return true;
                }
            } catch (IOException e2) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e2);
                }
            }
        }
        if (this.f3271i == null || !this.f3271i.b()) {
            this.f3271i = null;
            this.f3273k = null;
            boolean z = false;
            while (!z) {
                if (!(this.f3270h < this.f3268f.c().size())) {
                    break;
                }
                List<n.a<?>> c = this.f3268f.c();
                int i2 = this.f3270h;
                this.f3270h = i2 + 1;
                this.f3273k = c.get(i2);
                if (this.f3273k != null && (this.f3268f.p.c(this.f3273k.c.d()) || this.f3268f.h(this.f3273k.c.a()))) {
                    this.f3273k.c.e(this.f3268f.o, new z(this, this.f3273k));
                    z = true;
                }
            }
            return z;
        }
        return true;
    }

    public final boolean c(Object obj) {
        int i2 = f.e.a.r.h.b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            f.e.a.l.p.e g2 = this.f3268f.c.a().g(obj);
            Object a = g2.a();
            f.e.a.l.a<X> f2 = this.f3268f.f(a);
            f fVar = new f(f2, a, this.f3268f.f3323i);
            f.e.a.l.j jVar = this.f3273k.a;
            h<?> hVar = this.f3268f;
            e eVar = new e(jVar, hVar.n);
            f.e.a.l.q.c0.a b = hVar.b();
            b.a(eVar, fVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + eVar + ", data: " + obj + ", encoder: " + f2 + ", duration: " + f.e.a.r.h.a(elapsedRealtimeNanos));
            }
            if (b.b(eVar) != null) {
                this.f3274l = eVar;
                this.f3271i = new d(Collections.singletonList(this.f3273k.a), this.f3268f, this);
                this.f3273k.c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f3274l + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f3269g.f(this.f3273k.a, g2.a(), this.f3273k.c, this.f3273k.c.d(), this.f3273k.a);
                return false;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    this.f3273k.c.b();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // f.e.a.l.q.g
    public void cancel() {
        n.a<?> aVar = this.f3273k;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // f.e.a.l.q.g.a
    public void d() {
        throw new UnsupportedOperationException();
    }

    @Override // f.e.a.l.q.g.a
    public void f(f.e.a.l.j jVar, Object obj, f.e.a.l.p.d<?> dVar, DataSource dataSource, f.e.a.l.j jVar2) {
        this.f3269g.f(jVar, obj, dVar, this.f3273k.c.d(), jVar);
    }
}
