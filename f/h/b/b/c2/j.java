package f.h.b.b.c2;

import java.util.List;
import java.util.Objects;

/* compiled from: SubtitleOutputBuffer.java */
/* loaded from: classes.dex */
public abstract class j extends f.h.b.b.v1.f implements f {

    /* renamed from: h  reason: collision with root package name */
    public f f3943h;

    /* renamed from: i  reason: collision with root package name */
    public long f3944i;

    @Override // f.h.b.b.c2.f
    public int a(long j2) {
        f fVar = this.f3943h;
        Objects.requireNonNull(fVar);
        return fVar.a(j2 - this.f3944i);
    }

    @Override // f.h.b.b.c2.f
    public long d(int i2) {
        f fVar = this.f3943h;
        Objects.requireNonNull(fVar);
        return fVar.d(i2) + this.f3944i;
    }

    @Override // f.h.b.b.c2.f
    public List<c> f(long j2) {
        f fVar = this.f3943h;
        Objects.requireNonNull(fVar);
        return fVar.f(j2 - this.f3944i);
    }

    @Override // f.h.b.b.c2.f
    public int g() {
        f fVar = this.f3943h;
        Objects.requireNonNull(fVar);
        return fVar.g();
    }

    public void p() {
        this.f4610f = 0;
        this.f3943h = null;
    }

    public void q(long j2, f fVar, long j3) {
        this.f4628g = j2;
        this.f3943h = fVar;
        if (j3 != Long.MAX_VALUE) {
            j2 = j3;
        }
        this.f3944i = j2;
    }
}
