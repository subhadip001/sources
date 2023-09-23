package f.h.b.b;

import android.net.Uri;
import java.util.List;

/* compiled from: MediaItem.java */
/* loaded from: classes.dex */
public final class u0 {
    public final String a;
    public final f b;
    public final e c;

    /* renamed from: d  reason: collision with root package name */
    public final v0 f4507d;

    /* renamed from: e  reason: collision with root package name */
    public final c f4508e;

    /* compiled from: MediaItem.java */
    /* loaded from: classes.dex */
    public static final class b {
        public int hashCode() {
            throw null;
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes.dex */
    public static final class c {
        public final long a;
        public final long b;
        public final boolean c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f4509d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f4510e;

        public c(long j2, long j3, boolean z, boolean z2, boolean z3, a aVar) {
            this.a = j2;
            this.b = j3;
            this.c = z;
            this.f4509d = z2;
            this.f4510e = z3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && this.f4509d == cVar.f4509d && this.f4510e == cVar.f4510e;
            }
            return false;
        }

        public int hashCode() {
            long j2 = this.a;
            long j3 = this.b;
            return (((((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.c ? 1 : 0)) * 31) + (this.f4509d ? 1 : 0)) * 31) + (this.f4510e ? 1 : 0);
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes.dex */
    public static final class d {
        public int hashCode() {
            throw null;
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes.dex */
    public static final class e {
        public final long a;
        public final long b;
        public final long c;

        /* renamed from: d  reason: collision with root package name */
        public final float f4511d;

        /* renamed from: e  reason: collision with root package name */
        public final float f4512e;

        public e(long j2, long j3, long j4, float f2, float f3) {
            this.a = j2;
            this.b = j3;
            this.c = j4;
            this.f4511d = f2;
            this.f4512e = f3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.f4511d == eVar.f4511d && this.f4512e == eVar.f4512e;
            }
            return false;
        }

        public int hashCode() {
            long j2 = this.a;
            long j3 = this.b;
            long j4 = this.c;
            int i2 = ((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            float f2 = this.f4511d;
            int floatToIntBits = (i2 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.f4512e;
            return floatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes.dex */
    public static final class f {
        public final Uri a;
        public final String b = null;
        public final d c = null;

        /* renamed from: d  reason: collision with root package name */
        public final b f4513d = null;

        /* renamed from: e  reason: collision with root package name */
        public final List<Object> f4514e;

        /* renamed from: f  reason: collision with root package name */
        public final String f4515f;

        /* renamed from: g  reason: collision with root package name */
        public final List<Object> f4516g;

        /* renamed from: h  reason: collision with root package name */
        public final Object f4517h;

        public f(Uri uri, String str, d dVar, b bVar, List list, String str2, List list2, Object obj, a aVar) {
            this.a = uri;
            this.f4514e = list;
            this.f4515f = str2;
            this.f4516g = list2;
            this.f4517h = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return this.a.equals(fVar.a) && f.h.b.b.g2.b0.a(this.b, fVar.b) && f.h.b.b.g2.b0.a(this.c, fVar.c) && f.h.b.b.g2.b0.a(this.f4513d, fVar.f4513d) && this.f4514e.equals(fVar.f4514e) && f.h.b.b.g2.b0.a(this.f4515f, fVar.f4515f) && this.f4516g.equals(fVar.f4516g) && f.h.b.b.g2.b0.a(this.f4517h, fVar.f4517h);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            d dVar = this.c;
            int hashCode3 = (hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            b bVar = this.f4513d;
            int hashCode4 = (this.f4514e.hashCode() + ((hashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
            String str2 = this.f4515f;
            int hashCode5 = (this.f4516g.hashCode() + ((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Object obj = this.f4517h;
            return hashCode5 + (obj != null ? obj.hashCode() : 0);
        }
    }

    public u0(String str, c cVar, f fVar, e eVar, v0 v0Var, a aVar) {
        this.a = str;
        this.b = fVar;
        this.c = eVar;
        this.f4507d = v0Var;
        this.f4508e = cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u0) {
            u0 u0Var = (u0) obj;
            return f.h.b.b.g2.b0.a(this.a, u0Var.a) && this.f4508e.equals(u0Var.f4508e) && f.h.b.b.g2.b0.a(this.b, u0Var.b) && f.h.b.b.g2.b0.a(this.c, u0Var.c) && f.h.b.b.g2.b0.a(this.f4507d, u0Var.f4507d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        f fVar = this.b;
        int hashCode2 = fVar != null ? fVar.hashCode() : 0;
        int hashCode3 = this.c.hashCode();
        return this.f4507d.hashCode() + ((this.f4508e.hashCode() + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31);
    }
}
