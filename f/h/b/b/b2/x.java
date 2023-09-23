package f.h.b.b.b2;

/* compiled from: MediaPeriodId.java */
/* loaded from: classes.dex */
public class x {
    public final Object a;
    public final int b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3914d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3915e;

    public x(x xVar) {
        this.a = xVar.a;
        this.b = xVar.b;
        this.c = xVar.c;
        this.f3914d = xVar.f3914d;
        this.f3915e = xVar.f3915e;
    }

    public boolean a() {
        return this.b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return this.a.equals(xVar.a) && this.b == xVar.b && this.c == xVar.c && this.f3914d == xVar.f3914d && this.f3915e == xVar.f3915e;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.f3914d)) * 31) + this.f3915e;
    }

    public x(Object obj) {
        this.a = obj;
        this.b = -1;
        this.c = -1;
        this.f3914d = -1L;
        this.f3915e = -1;
    }

    public x(Object obj, int i2, int i3, long j2) {
        this.a = obj;
        this.b = i2;
        this.c = i3;
        this.f3914d = j2;
        this.f3915e = -1;
    }

    public x(Object obj, int i2, int i3, long j2, int i4) {
        this.a = obj;
        this.b = i2;
        this.c = i3;
        this.f3914d = j2;
        this.f3915e = i4;
    }

    public x(Object obj, long j2, int i2) {
        this.a = obj;
        this.b = -1;
        this.c = -1;
        this.f3914d = j2;
        this.f3915e = i2;
    }
}
