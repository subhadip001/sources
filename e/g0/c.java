package e.g0;

import android.os.Build;
import androidx.work.NetworkType;

/* compiled from: Constraints.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: i  reason: collision with root package name */
    public static final c f2195i = new a().a();
    public NetworkType a;
    public boolean b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2196d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2197e;

    /* renamed from: f  reason: collision with root package name */
    public long f2198f;

    /* renamed from: g  reason: collision with root package name */
    public long f2199g;

    /* renamed from: h  reason: collision with root package name */
    public d f2200h;

    /* compiled from: Constraints.java */
    /* loaded from: classes.dex */
    public static final class a {
        public NetworkType a = NetworkType.NOT_REQUIRED;
        public long b = -1;
        public long c = -1;

        /* renamed from: d  reason: collision with root package name */
        public d f2201d = new d();

        public c a() {
            return new c(this);
        }
    }

    public c() {
        this.a = NetworkType.NOT_REQUIRED;
        this.f2198f = -1L;
        this.f2199g = -1L;
        this.f2200h = new d();
    }

    public boolean a() {
        return this.f2200h.a() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.b == cVar.b && this.c == cVar.c && this.f2196d == cVar.f2196d && this.f2197e == cVar.f2197e && this.f2198f == cVar.f2198f && this.f2199g == cVar.f2199g && this.a == cVar.a) {
            return this.f2200h.equals(cVar.f2200h);
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f2198f;
        long j3 = this.f2199g;
        return this.f2200h.hashCode() + (((((((((((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.f2196d ? 1 : 0)) * 31) + (this.f2197e ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }

    public c(a aVar) {
        this.a = NetworkType.NOT_REQUIRED;
        this.f2198f = -1L;
        this.f2199g = -1L;
        this.f2200h = new d();
        this.b = false;
        int i2 = Build.VERSION.SDK_INT;
        this.c = false;
        this.a = aVar.a;
        this.f2196d = false;
        this.f2197e = false;
        if (i2 >= 24) {
            this.f2200h = aVar.f2201d;
            this.f2198f = aVar.b;
            this.f2199g = aVar.c;
        }
    }

    public c(c cVar) {
        this.a = NetworkType.NOT_REQUIRED;
        this.f2198f = -1L;
        this.f2199g = -1L;
        this.f2200h = new d();
        this.b = cVar.b;
        this.c = cVar.c;
        this.a = cVar.a;
        this.f2196d = cVar.f2196d;
        this.f2197e = cVar.f2197e;
        this.f2200h = cVar.f2200h;
    }
}
