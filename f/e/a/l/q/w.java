package f.e.a.l.q;

import com.bumptech.glide.load.DataSource;
import f.e.a.l.p.d;
import f.e.a.l.q.g;
import f.e.a.l.r.n;
import java.io.File;
import java.util.List;

/* compiled from: ResourceCacheGenerator.java */
/* loaded from: classes.dex */
public class w implements g, d.a<Object> {

    /* renamed from: f  reason: collision with root package name */
    public final g.a f3392f;

    /* renamed from: g  reason: collision with root package name */
    public final h<?> f3393g;

    /* renamed from: h  reason: collision with root package name */
    public int f3394h;

    /* renamed from: i  reason: collision with root package name */
    public int f3395i = -1;

    /* renamed from: j  reason: collision with root package name */
    public f.e.a.l.j f3396j;

    /* renamed from: k  reason: collision with root package name */
    public List<f.e.a.l.r.n<File, ?>> f3397k;

    /* renamed from: l  reason: collision with root package name */
    public int f3398l;

    /* renamed from: m  reason: collision with root package name */
    public volatile n.a<?> f3399m;
    public File n;
    public x o;

    public w(h<?> hVar, g.a aVar) {
        this.f3393g = hVar;
        this.f3392f = aVar;
    }

    @Override // f.e.a.l.q.g
    public boolean b() {
        List<f.e.a.l.j> a = this.f3393g.a();
        if (a.isEmpty()) {
            return false;
        }
        List<Class<?>> e2 = this.f3393g.e();
        if (e2.isEmpty()) {
            if (File.class.equals(this.f3393g.f3325k)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f3393g.f3318d.getClass() + " to " + this.f3393g.f3325k);
        }
        while (true) {
            List<f.e.a.l.r.n<File, ?>> list = this.f3397k;
            if (list != null) {
                if (this.f3398l < list.size()) {
                    this.f3399m = null;
                    boolean z = false;
                    while (!z) {
                        if (!(this.f3398l < this.f3397k.size())) {
                            break;
                        }
                        List<f.e.a.l.r.n<File, ?>> list2 = this.f3397k;
                        int i2 = this.f3398l;
                        this.f3398l = i2 + 1;
                        File file = this.n;
                        h<?> hVar = this.f3393g;
                        this.f3399m = list2.get(i2).b(file, hVar.f3319e, hVar.f3320f, hVar.f3323i);
                        if (this.f3399m != null && this.f3393g.h(this.f3399m.c.a())) {
                            this.f3399m.c.e(this.f3393g.o, this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
            int i3 = this.f3395i + 1;
            this.f3395i = i3;
            if (i3 >= e2.size()) {
                int i4 = this.f3394h + 1;
                this.f3394h = i4;
                if (i4 >= a.size()) {
                    return false;
                }
                this.f3395i = 0;
            }
            f.e.a.l.j jVar = a.get(this.f3394h);
            Class<?> cls = e2.get(this.f3395i);
            f.e.a.l.o<Z> g2 = this.f3393g.g(cls);
            h<?> hVar2 = this.f3393g;
            this.o = new x(hVar2.c.a, jVar, hVar2.n, hVar2.f3319e, hVar2.f3320f, g2, cls, hVar2.f3323i);
            File b = hVar2.b().b(this.o);
            this.n = b;
            if (b != null) {
                this.f3396j = jVar;
                this.f3397k = this.f3393g.c.a().f(b);
                this.f3398l = 0;
            }
        }
    }

    @Override // f.e.a.l.p.d.a
    public void c(Exception exc) {
        this.f3392f.a(this.o, exc, this.f3399m.c, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override // f.e.a.l.q.g
    public void cancel() {
        n.a<?> aVar = this.f3399m;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // f.e.a.l.p.d.a
    public void f(Object obj) {
        this.f3392f.f(this.f3396j, obj, this.f3399m.c, DataSource.RESOURCE_DISK_CACHE, this.o);
    }
}
