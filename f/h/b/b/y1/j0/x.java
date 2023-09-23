package f.h.b.b.y1.j0;

import com.google.android.exoplayer2.Format;
import f.h.b.b.y1.j0.i0;

/* compiled from: PassthroughSectionPayloadReader.java */
/* loaded from: classes.dex */
public final class x implements c0 {
    public Format a;
    public f.h.b.b.g2.a0 b;
    public f.h.b.b.y1.w c;

    public x(String str) {
        Format.b bVar = new Format.b();
        bVar.f722k = str;
        this.a = bVar.a();
    }

    @Override // f.h.b.b.y1.j0.c0
    public void a(f.h.b.b.g2.a0 a0Var, f.h.b.b.y1.j jVar, i0.d dVar) {
        this.b = a0Var;
        dVar.a();
        f.h.b.b.y1.w p = jVar.p(dVar.c(), 5);
        this.c = p;
        p.e(this.a);
    }

    @Override // f.h.b.b.y1.j0.c0
    public void b(f.h.b.b.g2.t tVar) {
        long j2;
        f.h.b.b.e2.j.i(this.b);
        int i2 = f.h.b.b.g2.b0.a;
        long c = this.b.c();
        long j3 = -9223372036854775807L;
        if (c == -9223372036854775807L) {
            return;
        }
        Format format = this.a;
        if (c != format.u) {
            Format.b b = format.b();
            b.o = c;
            Format a = b.a();
            this.a = a;
            this.c.e(a);
        }
        int a2 = tVar.a();
        this.c.c(tVar, a2);
        f.h.b.b.y1.w wVar = this.c;
        f.h.b.b.g2.a0 a0Var = this.b;
        if (a0Var.c != -9223372036854775807L) {
            j3 = a0Var.b + a0Var.c;
        } else {
            long j4 = a0Var.a;
            if (j4 != Long.MAX_VALUE) {
                j2 = j4;
                wVar.d(j2, 1, a2, 0, null);
            }
        }
        j2 = j3;
        wVar.d(j2, 1, a2, 0, null);
    }
}
