package f.e.a.l.q;

import f.e.a.r.m.a;
import f.e.a.r.m.d;
import java.util.Objects;

/* compiled from: LockedResource.java */
/* loaded from: classes.dex */
public final class u<Z> implements v<Z>, a.d {

    /* renamed from: j  reason: collision with root package name */
    public static final e.i.i.c<u<?>> f3387j = f.e.a.r.m.a.a(20, new a());

    /* renamed from: f  reason: collision with root package name */
    public final f.e.a.r.m.d f3388f = new d.b();

    /* renamed from: g  reason: collision with root package name */
    public v<Z> f3389g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3390h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3391i;

    /* compiled from: LockedResource.java */
    /* loaded from: classes.dex */
    public class a implements a.b<u<?>> {
        @Override // f.e.a.r.m.a.b
        public u<?> a() {
            return new u<>();
        }
    }

    public static <Z> u<Z> d(v<Z> vVar) {
        u<Z> uVar = (u<Z>) f3387j.b();
        Objects.requireNonNull(uVar, "Argument must not be null");
        uVar.f3391i = false;
        uVar.f3390h = true;
        uVar.f3389g = vVar;
        return uVar;
    }

    @Override // f.e.a.l.q.v
    public synchronized void a() {
        this.f3388f.a();
        this.f3391i = true;
        if (!this.f3390h) {
            this.f3389g.a();
            this.f3389g = null;
            f3387j.a(this);
        }
    }

    @Override // f.e.a.l.q.v
    public int b() {
        return this.f3389g.b();
    }

    @Override // f.e.a.l.q.v
    public Class<Z> c() {
        return this.f3389g.c();
    }

    public synchronized void e() {
        this.f3388f.a();
        if (this.f3390h) {
            this.f3390h = false;
            if (this.f3391i) {
                a();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @Override // f.e.a.r.m.a.d
    public f.e.a.r.m.d g() {
        return this.f3388f;
    }

    @Override // f.e.a.l.q.v
    public Z get() {
        return this.f3389g.get();
    }
}
