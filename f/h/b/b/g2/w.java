package f.h.b.b.g2;

import f.h.b.b.c1;
import f.h.b.b.h0;

/* compiled from: StandaloneMediaClock.java */
/* loaded from: classes.dex */
public final class w implements o {

    /* renamed from: f  reason: collision with root package name */
    public final f f4307f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4308g;

    /* renamed from: h  reason: collision with root package name */
    public long f4309h;

    /* renamed from: i  reason: collision with root package name */
    public long f4310i;

    /* renamed from: j  reason: collision with root package name */
    public c1 f4311j = c1.f3917d;

    public w(f fVar) {
        this.f4307f = fVar;
    }

    public void a(long j2) {
        this.f4309h = j2;
        if (this.f4308g) {
            this.f4310i = this.f4307f.elapsedRealtime();
        }
    }

    public void b() {
        if (this.f4308g) {
            return;
        }
        this.f4310i = this.f4307f.elapsedRealtime();
        this.f4308g = true;
    }

    @Override // f.h.b.b.g2.o
    public c1 c() {
        return this.f4311j;
    }

    @Override // f.h.b.b.g2.o
    public void h(c1 c1Var) {
        if (this.f4308g) {
            a(m());
        }
        this.f4311j = c1Var;
    }

    @Override // f.h.b.b.g2.o
    public long m() {
        long j2 = this.f4309h;
        if (this.f4308g) {
            long elapsedRealtime = this.f4307f.elapsedRealtime() - this.f4310i;
            c1 c1Var = this.f4311j;
            if (c1Var.a == 1.0f) {
                return j2 + h0.a(elapsedRealtime);
            }
            return j2 + (elapsedRealtime * c1Var.c);
        }
        return j2;
    }
}
