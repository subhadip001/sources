package f.e.a.l.q;

import com.bumptech.glide.load.DataSource;
import f.e.a.l.p.d;
import f.e.a.l.q.g;
import f.e.a.l.r.n;
import java.io.File;
import java.util.List;

/* compiled from: DataCacheGenerator.java */
/* loaded from: classes.dex */
public class d implements g, d.a<Object> {

    /* renamed from: f  reason: collision with root package name */
    public final List<f.e.a.l.j> f3300f;

    /* renamed from: g  reason: collision with root package name */
    public final h<?> f3301g;

    /* renamed from: h  reason: collision with root package name */
    public final g.a f3302h;

    /* renamed from: i  reason: collision with root package name */
    public int f3303i;

    /* renamed from: j  reason: collision with root package name */
    public f.e.a.l.j f3304j;

    /* renamed from: k  reason: collision with root package name */
    public List<f.e.a.l.r.n<File, ?>> f3305k;

    /* renamed from: l  reason: collision with root package name */
    public int f3306l;

    /* renamed from: m  reason: collision with root package name */
    public volatile n.a<?> f3307m;
    public File n;

    public d(h<?> hVar, g.a aVar) {
        List<f.e.a.l.j> a = hVar.a();
        this.f3303i = -1;
        this.f3300f = a;
        this.f3301g = hVar;
        this.f3302h = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
        r8.f3307m = null;
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r0 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
        if (r8.f3306l >= r8.f3305k.size()) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        if (r3 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
        r3 = r8.f3305k;
        r4 = r8.f3306l;
        r8.f3306l = r4 + 1;
        r4 = r8.n;
        r5 = r8.f3301g;
        r8.f3307m = r3.get(r4).b(r4, r5.f3319e, r5.f3320f, r5.f3323i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r8.f3307m == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (r8.f3301g.h(r8.f3307m.c.a()) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
        r8.f3307m.c.e(r8.f3301g.o, r8);
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
        return r0;
     */
    @Override // f.e.a.l.q.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b() {
        /*
            r8 = this;
        L0:
            java.util.List<f.e.a.l.r.n<java.io.File, ?>> r0 = r8.f3305k     // Catch: java.lang.Throwable -> Laa
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L69
            int r3 = r8.f3306l     // Catch: java.lang.Throwable -> Laa
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Laa
            if (r3 >= r0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 != 0) goto L14
            goto L69
        L14:
            r0 = 0
            r8.f3307m = r0     // Catch: java.lang.Throwable -> Laa
            r0 = 0
        L18:
            if (r0 != 0) goto L68
            int r3 = r8.f3306l     // Catch: java.lang.Throwable -> Laa
            java.util.List<f.e.a.l.r.n<java.io.File, ?>> r4 = r8.f3305k     // Catch: java.lang.Throwable -> Laa
            int r4 = r4.size()     // Catch: java.lang.Throwable -> Laa
            if (r3 >= r4) goto L26
            r3 = 1
            goto L27
        L26:
            r3 = 0
        L27:
            if (r3 == 0) goto L68
            java.util.List<f.e.a.l.r.n<java.io.File, ?>> r3 = r8.f3305k     // Catch: java.lang.Throwable -> Laa
            int r4 = r8.f3306l     // Catch: java.lang.Throwable -> Laa
            int r5 = r4 + 1
            r8.f3306l = r5     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> Laa
            f.e.a.l.r.n r3 = (f.e.a.l.r.n) r3     // Catch: java.lang.Throwable -> Laa
            java.io.File r4 = r8.n     // Catch: java.lang.Throwable -> Laa
            f.e.a.l.q.h<?> r5 = r8.f3301g     // Catch: java.lang.Throwable -> Laa
            int r6 = r5.f3319e     // Catch: java.lang.Throwable -> Laa
            int r7 = r5.f3320f     // Catch: java.lang.Throwable -> Laa
            f.e.a.l.l r5 = r5.f3323i     // Catch: java.lang.Throwable -> Laa
            f.e.a.l.r.n$a r3 = r3.b(r4, r6, r7, r5)     // Catch: java.lang.Throwable -> Laa
            r8.f3307m = r3     // Catch: java.lang.Throwable -> Laa
            f.e.a.l.r.n$a<?> r3 = r8.f3307m     // Catch: java.lang.Throwable -> Laa
            if (r3 == 0) goto L18
            f.e.a.l.q.h<?> r3 = r8.f3301g     // Catch: java.lang.Throwable -> Laa
            f.e.a.l.r.n$a<?> r4 = r8.f3307m     // Catch: java.lang.Throwable -> Laa
            f.e.a.l.p.d<Data> r4 = r4.c     // Catch: java.lang.Throwable -> Laa
            java.lang.Class r4 = r4.a()     // Catch: java.lang.Throwable -> Laa
            boolean r3 = r3.h(r4)     // Catch: java.lang.Throwable -> Laa
            if (r3 == 0) goto L18
            f.e.a.l.r.n$a<?> r0 = r8.f3307m     // Catch: java.lang.Throwable -> Laa
            f.e.a.l.p.d<Data> r0 = r0.c     // Catch: java.lang.Throwable -> Laa
            f.e.a.l.q.h<?> r3 = r8.f3301g     // Catch: java.lang.Throwable -> Laa
            com.bumptech.glide.Priority r3 = r3.o     // Catch: java.lang.Throwable -> Laa
            r0.e(r3, r8)     // Catch: java.lang.Throwable -> Laa
            r0 = 1
            goto L18
        L68:
            return r0
        L69:
            int r0 = r8.f3303i     // Catch: java.lang.Throwable -> Laa
            int r0 = r0 + r2
            r8.f3303i = r0     // Catch: java.lang.Throwable -> Laa
            java.util.List<f.e.a.l.j> r2 = r8.f3300f     // Catch: java.lang.Throwable -> Laa
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Laa
            if (r0 < r2) goto L77
            return r1
        L77:
            java.util.List<f.e.a.l.j> r0 = r8.f3300f     // Catch: java.lang.Throwable -> Laa
            int r2 = r8.f3303i     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> Laa
            f.e.a.l.j r0 = (f.e.a.l.j) r0     // Catch: java.lang.Throwable -> Laa
            f.e.a.l.q.e r2 = new f.e.a.l.q.e     // Catch: java.lang.Throwable -> Laa
            f.e.a.l.q.h<?> r3 = r8.f3301g     // Catch: java.lang.Throwable -> Laa
            f.e.a.l.j r4 = r3.n     // Catch: java.lang.Throwable -> Laa
            r2.<init>(r0, r4)     // Catch: java.lang.Throwable -> Laa
            f.e.a.l.q.c0.a r3 = r3.b()     // Catch: java.lang.Throwable -> Laa
            java.io.File r2 = r3.b(r2)     // Catch: java.lang.Throwable -> Laa
            r8.n = r2     // Catch: java.lang.Throwable -> Laa
            if (r2 == 0) goto L0
            r8.f3304j = r0     // Catch: java.lang.Throwable -> Laa
            f.e.a.l.q.h<?> r0 = r8.f3301g     // Catch: java.lang.Throwable -> Laa
            f.e.a.d r0 = r0.c     // Catch: java.lang.Throwable -> Laa
            com.bumptech.glide.Registry r0 = r0.a()     // Catch: java.lang.Throwable -> Laa
            java.util.List r0 = r0.f(r2)     // Catch: java.lang.Throwable -> Laa
            r8.f3305k = r0     // Catch: java.lang.Throwable -> Laa
            r8.f3306l = r1     // Catch: java.lang.Throwable -> Laa
            goto L0
        Laa:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.a.l.q.d.b():boolean");
    }

    @Override // f.e.a.l.p.d.a
    public void c(Exception exc) {
        this.f3302h.a(this.f3304j, exc, this.f3307m.c, DataSource.DATA_DISK_CACHE);
    }

    @Override // f.e.a.l.q.g
    public void cancel() {
        n.a<?> aVar = this.f3307m;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // f.e.a.l.p.d.a
    public void f(Object obj) {
        this.f3302h.f(this.f3304j, obj, this.f3307m.c, DataSource.DATA_DISK_CACHE, this.f3304j);
    }

    public d(List<f.e.a.l.j> list, h<?> hVar, g.a aVar) {
        this.f3303i = -1;
        this.f3300f = list;
        this.f3301g = hVar;
        this.f3302h = aVar;
    }
}
