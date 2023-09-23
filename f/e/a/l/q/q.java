package f.e.a.l.q;

import java.util.Objects;

/* compiled from: EngineResource.java */
/* loaded from: classes.dex */
public class q<Z> implements v<Z> {

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3380f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3381g;

    /* renamed from: h  reason: collision with root package name */
    public final v<Z> f3382h;

    /* renamed from: i  reason: collision with root package name */
    public final a f3383i;

    /* renamed from: j  reason: collision with root package name */
    public final f.e.a.l.j f3384j;

    /* renamed from: k  reason: collision with root package name */
    public int f3385k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3386l;

    /* compiled from: EngineResource.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(f.e.a.l.j jVar, q<?> qVar);
    }

    public q(v<Z> vVar, boolean z, boolean z2, f.e.a.l.j jVar, a aVar) {
        Objects.requireNonNull(vVar, "Argument must not be null");
        this.f3382h = vVar;
        this.f3380f = z;
        this.f3381g = z2;
        this.f3384j = jVar;
        Objects.requireNonNull(aVar, "Argument must not be null");
        this.f3383i = aVar;
    }

    @Override // f.e.a.l.q.v
    public synchronized void a() {
        if (this.f3385k <= 0) {
            if (!this.f3386l) {
                this.f3386l = true;
                if (this.f3381g) {
                    this.f3382h.a();
                }
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    @Override // f.e.a.l.q.v
    public int b() {
        return this.f3382h.b();
    }

    @Override // f.e.a.l.q.v
    public Class<Z> c() {
        return this.f3382h.c();
    }

    public synchronized void d() {
        if (!this.f3386l) {
            this.f3385k++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    public void e() {
        boolean z;
        synchronized (this) {
            int i2 = this.f3385k;
            if (i2 > 0) {
                z = true;
                int i3 = i2 - 1;
                this.f3385k = i3;
                if (i3 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f3383i.a(this.f3384j, this);
        }
    }

    @Override // f.e.a.l.q.v
    public Z get() {
        return this.f3382h.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f3380f + ", listener=" + this.f3383i + ", key=" + this.f3384j + ", acquired=" + this.f3385k + ", isRecycled=" + this.f3386l + ", resource=" + this.f3382h + '}';
    }
}
