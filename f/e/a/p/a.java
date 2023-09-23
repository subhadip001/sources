package f.e.a.p;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import f.e.a.l.j;
import f.e.a.l.l;
import f.e.a.l.o;
import f.e.a.l.q.k;
import f.e.a.l.s.c.m;
import f.e.a.p.a;
import java.util.Map;
import java.util.Objects;

/* compiled from: BaseRequestOptions.java */
/* loaded from: classes.dex */
public abstract class a<T extends a<T>> implements Cloneable {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;

    /* renamed from: f  reason: collision with root package name */
    public int f3560f;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f3564j;

    /* renamed from: k  reason: collision with root package name */
    public int f3565k;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f3566l;

    /* renamed from: m  reason: collision with root package name */
    public int f3567m;
    public j q;
    public boolean r;
    public boolean s;
    public Drawable t;
    public int u;
    public l v;
    public Map<Class<?>, o<?>> w;
    public Class<?> x;
    public boolean y;
    public Resources.Theme z;

    /* renamed from: g  reason: collision with root package name */
    public float f3561g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    public k f3562h = k.f3349d;

    /* renamed from: i  reason: collision with root package name */
    public Priority f3563i = Priority.NORMAL;
    public boolean n = true;
    public int o = -1;
    public int p = -1;

    public a() {
        f.e.a.q.c cVar = f.e.a.q.c.b;
        this.q = f.e.a.q.c.b;
        this.s = true;
        this.v = new l();
        this.w = new f.e.a.r.b();
        this.x = Object.class;
        this.D = true;
    }

    public static boolean f(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    public T a(a<?> aVar) {
        if (this.A) {
            return (T) clone().a(aVar);
        }
        if (f(aVar.f3560f, 2)) {
            this.f3561g = aVar.f3561g;
        }
        if (f(aVar.f3560f, 262144)) {
            this.B = aVar.B;
        }
        if (f(aVar.f3560f, CommonUtils.BYTES_IN_A_MEGABYTE)) {
            this.E = aVar.E;
        }
        if (f(aVar.f3560f, 4)) {
            this.f3562h = aVar.f3562h;
        }
        if (f(aVar.f3560f, 8)) {
            this.f3563i = aVar.f3563i;
        }
        if (f(aVar.f3560f, 16)) {
            this.f3564j = aVar.f3564j;
            this.f3565k = 0;
            this.f3560f &= -33;
        }
        if (f(aVar.f3560f, 32)) {
            this.f3565k = aVar.f3565k;
            this.f3564j = null;
            this.f3560f &= -17;
        }
        if (f(aVar.f3560f, 64)) {
            this.f3566l = aVar.f3566l;
            this.f3567m = 0;
            this.f3560f &= -129;
        }
        if (f(aVar.f3560f, 128)) {
            this.f3567m = aVar.f3567m;
            this.f3566l = null;
            this.f3560f &= -65;
        }
        if (f(aVar.f3560f, 256)) {
            this.n = aVar.n;
        }
        if (f(aVar.f3560f, 512)) {
            this.p = aVar.p;
            this.o = aVar.o;
        }
        if (f(aVar.f3560f, 1024)) {
            this.q = aVar.q;
        }
        if (f(aVar.f3560f, 4096)) {
            this.x = aVar.x;
        }
        if (f(aVar.f3560f, 8192)) {
            this.t = aVar.t;
            this.u = 0;
            this.f3560f &= -16385;
        }
        if (f(aVar.f3560f, 16384)) {
            this.u = aVar.u;
            this.t = null;
            this.f3560f &= -8193;
        }
        if (f(aVar.f3560f, 32768)) {
            this.z = aVar.z;
        }
        if (f(aVar.f3560f, LogFileManager.MAX_LOG_SIZE)) {
            this.s = aVar.s;
        }
        if (f(aVar.f3560f, 131072)) {
            this.r = aVar.r;
        }
        if (f(aVar.f3560f, RecyclerView.a0.FLAG_MOVED)) {
            this.w.putAll(aVar.w);
            this.D = aVar.D;
        }
        if (f(aVar.f3560f, 524288)) {
            this.C = aVar.C;
        }
        if (!this.s) {
            this.w.clear();
            int i2 = this.f3560f & (-2049);
            this.f3560f = i2;
            this.r = false;
            this.f3560f = i2 & (-131073);
            this.D = true;
        }
        this.f3560f |= aVar.f3560f;
        this.v.d(aVar.v);
        k();
        return this;
    }

    @Override // 
    /* renamed from: b */
    public T clone() {
        try {
            T t = (T) super.clone();
            l lVar = new l();
            t.v = lVar;
            lVar.d(this.v);
            f.e.a.r.b bVar = new f.e.a.r.b();
            t.w = bVar;
            bVar.putAll(this.w);
            t.y = false;
            t.A = false;
            return t;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public T c(Class<?> cls) {
        if (this.A) {
            return (T) clone().c(cls);
        }
        Objects.requireNonNull(cls, "Argument must not be null");
        this.x = cls;
        this.f3560f |= 4096;
        k();
        return this;
    }

    public T d(k kVar) {
        if (this.A) {
            return (T) clone().d(kVar);
        }
        Objects.requireNonNull(kVar, "Argument must not be null");
        this.f3562h = kVar;
        this.f3560f |= 4;
        k();
        return this;
    }

    public T e() {
        T p = p(DownsampleStrategy.a, new f.e.a.l.s.c.o());
        p.D = true;
        return p;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return Float.compare(aVar.f3561g, this.f3561g) == 0 && this.f3565k == aVar.f3565k && f.e.a.r.l.b(this.f3564j, aVar.f3564j) && this.f3567m == aVar.f3567m && f.e.a.r.l.b(this.f3566l, aVar.f3566l) && this.u == aVar.u && f.e.a.r.l.b(this.t, aVar.t) && this.n == aVar.n && this.o == aVar.o && this.p == aVar.p && this.r == aVar.r && this.s == aVar.s && this.B == aVar.B && this.C == aVar.C && this.f3562h.equals(aVar.f3562h) && this.f3563i == aVar.f3563i && this.v.equals(aVar.v) && this.w.equals(aVar.w) && this.x.equals(aVar.x) && f.e.a.r.l.b(this.q, aVar.q) && f.e.a.r.l.b(this.z, aVar.z);
        }
        return false;
    }

    public final T g(DownsampleStrategy downsampleStrategy, o<Bitmap> oVar) {
        if (this.A) {
            return (T) clone().g(downsampleStrategy, oVar);
        }
        f.e.a.l.k kVar = DownsampleStrategy.f692f;
        Objects.requireNonNull(downsampleStrategy, "Argument must not be null");
        l(kVar, downsampleStrategy);
        return o(oVar, false);
    }

    public T h(int i2, int i3) {
        if (this.A) {
            return (T) clone().h(i2, i3);
        }
        this.p = i2;
        this.o = i3;
        this.f3560f |= 512;
        k();
        return this;
    }

    public int hashCode() {
        float f2 = this.f3561g;
        char[] cArr = f.e.a.r.l.a;
        return f.e.a.r.l.g(this.z, f.e.a.r.l.g(this.q, f.e.a.r.l.g(this.x, f.e.a.r.l.g(this.w, f.e.a.r.l.g(this.v, f.e.a.r.l.g(this.f3563i, f.e.a.r.l.g(this.f3562h, (((((((((((((f.e.a.r.l.g(this.t, (f.e.a.r.l.g(this.f3566l, (f.e.a.r.l.g(this.f3564j, ((Float.floatToIntBits(f2) + 527) * 31) + this.f3565k) * 31) + this.f3567m) * 31) + this.u) * 31) + (this.n ? 1 : 0)) * 31) + this.o) * 31) + this.p) * 31) + (this.r ? 1 : 0)) * 31) + (this.s ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0))))))));
    }

    public T i(int i2) {
        if (this.A) {
            return (T) clone().i(i2);
        }
        this.f3567m = i2;
        int i3 = this.f3560f | 128;
        this.f3560f = i3;
        this.f3566l = null;
        this.f3560f = i3 & (-65);
        k();
        return this;
    }

    public T j(Priority priority) {
        if (this.A) {
            return (T) clone().j(priority);
        }
        Objects.requireNonNull(priority, "Argument must not be null");
        this.f3563i = priority;
        this.f3560f |= 8;
        k();
        return this;
    }

    public final T k() {
        if (this.y) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return this;
    }

    public <Y> T l(f.e.a.l.k<Y> kVar, Y y) {
        if (this.A) {
            return (T) clone().l(kVar, y);
        }
        Objects.requireNonNull(kVar, "Argument must not be null");
        Objects.requireNonNull(y, "Argument must not be null");
        this.v.b.put(kVar, y);
        k();
        return this;
    }

    public T m(j jVar) {
        if (this.A) {
            return (T) clone().m(jVar);
        }
        Objects.requireNonNull(jVar, "Argument must not be null");
        this.q = jVar;
        this.f3560f |= 1024;
        k();
        return this;
    }

    public T n(boolean z) {
        if (this.A) {
            return (T) clone().n(true);
        }
        this.n = !z;
        this.f3560f |= 256;
        k();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T o(o<Bitmap> oVar, boolean z) {
        if (this.A) {
            return (T) clone().o(oVar, z);
        }
        m mVar = new m(oVar, z);
        q(Bitmap.class, oVar, z);
        q(Drawable.class, mVar, z);
        q(BitmapDrawable.class, mVar, z);
        q(f.e.a.l.s.g.c.class, new f.e.a.l.s.g.f(oVar), z);
        k();
        return this;
    }

    public final T p(DownsampleStrategy downsampleStrategy, o<Bitmap> oVar) {
        if (this.A) {
            return (T) clone().p(downsampleStrategy, oVar);
        }
        f.e.a.l.k kVar = DownsampleStrategy.f692f;
        Objects.requireNonNull(downsampleStrategy, "Argument must not be null");
        l(kVar, downsampleStrategy);
        return o(oVar, true);
    }

    public <Y> T q(Class<Y> cls, o<Y> oVar, boolean z) {
        if (this.A) {
            return (T) clone().q(cls, oVar, z);
        }
        Objects.requireNonNull(cls, "Argument must not be null");
        Objects.requireNonNull(oVar, "Argument must not be null");
        this.w.put(cls, oVar);
        int i2 = this.f3560f | RecyclerView.a0.FLAG_MOVED;
        this.f3560f = i2;
        this.s = true;
        int i3 = i2 | LogFileManager.MAX_LOG_SIZE;
        this.f3560f = i3;
        this.D = false;
        if (z) {
            this.f3560f = i3 | 131072;
            this.r = true;
        }
        k();
        return this;
    }

    public T r(boolean z) {
        if (this.A) {
            return (T) clone().r(z);
        }
        this.E = z;
        this.f3560f |= CommonUtils.BYTES_IN_A_MEGABYTE;
        k();
        return this;
    }
}
