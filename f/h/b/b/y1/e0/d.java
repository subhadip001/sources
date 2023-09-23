package f.h.b.b.y1.e0;

import f.h.b.b.y1.j;
import f.h.b.b.y1.t;
import f.h.b.b.y1.u;
import f.h.b.b.y1.w;

/* compiled from: StartOffsetExtractorOutput.java */
/* loaded from: classes.dex */
public final class d implements j {

    /* renamed from: f  reason: collision with root package name */
    public final long f4739f;

    /* renamed from: g  reason: collision with root package name */
    public final j f4740g;

    /* compiled from: StartOffsetExtractorOutput.java */
    /* loaded from: classes.dex */
    public class a implements t {
        public final /* synthetic */ t a;

        public a(t tVar) {
            this.a = tVar;
        }

        @Override // f.h.b.b.y1.t
        public boolean c() {
            return this.a.c();
        }

        @Override // f.h.b.b.y1.t
        public t.a h(long j2) {
            t.a h2 = this.a.h(j2);
            u uVar = h2.a;
            long j3 = uVar.a;
            long j4 = uVar.b;
            long j5 = d.this.f4739f;
            u uVar2 = new u(j3, j4 + j5);
            u uVar3 = h2.b;
            return new t.a(uVar2, new u(uVar3.a, uVar3.b + j5));
        }

        @Override // f.h.b.b.y1.t
        public long i() {
            return this.a.i();
        }
    }

    public d(long j2, j jVar) {
        this.f4739f = j2;
        this.f4740g = jVar;
    }

    @Override // f.h.b.b.y1.j
    public void a(t tVar) {
        this.f4740g.a(new a(tVar));
    }

    @Override // f.h.b.b.y1.j
    public void j() {
        this.f4740g.j();
    }

    @Override // f.h.b.b.y1.j
    public w p(int i2, int i3) {
        return this.f4740g.p(i2, i3);
    }
}
