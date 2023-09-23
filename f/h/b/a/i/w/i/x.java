package f.h.b.a.i.w.i;

/* compiled from: AutoValue_EventStoreConfig.java */
/* loaded from: classes.dex */
public final class x extends b0 {
    public final long b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3769d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3770e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3771f;

    public x(long j2, int i2, int i3, long j3, int i4, a aVar) {
        this.b = j2;
        this.c = i2;
        this.f3769d = i3;
        this.f3770e = j3;
        this.f3771f = i4;
    }

    @Override // f.h.b.a.i.w.i.b0
    public int a() {
        return this.f3769d;
    }

    @Override // f.h.b.a.i.w.i.b0
    public long b() {
        return this.f3770e;
    }

    @Override // f.h.b.a.i.w.i.b0
    public int c() {
        return this.c;
    }

    @Override // f.h.b.a.i.w.i.b0
    public int d() {
        return this.f3771f;
    }

    @Override // f.h.b.a.i.w.i.b0
    public long e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            return this.b == b0Var.e() && this.c == b0Var.c() && this.f3769d == b0Var.a() && this.f3770e == b0Var.b() && this.f3771f == b0Var.d();
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.b;
        long j3 = this.f3770e;
        return this.f3771f ^ ((((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.f3769d) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("EventStoreConfig{maxStorageSizeInBytes=");
        A.append(this.b);
        A.append(", loadBatchSize=");
        A.append(this.c);
        A.append(", criticalSectionEnterTimeoutMs=");
        A.append(this.f3769d);
        A.append(", eventCleanUpAge=");
        A.append(this.f3770e);
        A.append(", maxBlobByteSizePerRow=");
        return f.a.b.a.a.t(A, this.f3771f, "}");
    }
}
