package f.h.b.b.y1.g0;

import f.h.b.b.g2.b0;
import f.h.b.b.g2.n;
import f.h.b.b.y1.t;
import f.h.b.b.y1.u;

/* compiled from: IndexSeeker.java */
/* loaded from: classes.dex */
public final class d implements g {
    public final long a;
    public final n b;
    public final n c;

    /* renamed from: d  reason: collision with root package name */
    public long f4770d;

    public d(long j2, long j3, long j4) {
        this.f4770d = j2;
        this.a = j4;
        n nVar = new n();
        this.b = nVar;
        n nVar2 = new n();
        this.c = nVar2;
        nVar.a(0L);
        nVar2.a(j3);
    }

    @Override // f.h.b.b.y1.g0.g
    public long a() {
        return this.a;
    }

    public boolean b(long j2) {
        n nVar = this.b;
        return j2 - nVar.b(nVar.a - 1) < 100000;
    }

    @Override // f.h.b.b.y1.t
    public boolean c() {
        return true;
    }

    @Override // f.h.b.b.y1.g0.g
    public long d(long j2) {
        return this.b.b(b0.c(this.c, j2, true, true));
    }

    @Override // f.h.b.b.y1.t
    public t.a h(long j2) {
        int c = b0.c(this.b, j2, true, true);
        long b = this.b.b(c);
        u uVar = new u(b, this.c.b(c));
        if (b != j2) {
            n nVar = this.b;
            if (c != nVar.a - 1) {
                int i2 = c + 1;
                return new t.a(uVar, new u(nVar.b(i2), this.c.b(i2)));
            }
        }
        return new t.a(uVar);
    }

    @Override // f.h.b.b.y1.t
    public long i() {
        return this.f4770d;
    }
}
