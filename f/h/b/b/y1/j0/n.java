package f.h.b.b.y1.j0;

import com.google.android.exoplayer2.Format;
import f.h.b.b.y1.j0.i0;
import java.util.Collections;
import java.util.List;

/* compiled from: DvbSubtitleReader.java */
/* loaded from: classes.dex */
public final class n implements o {
    public final List<i0.a> a;
    public final f.h.b.b.y1.w[] b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public int f4963d;

    /* renamed from: e  reason: collision with root package name */
    public int f4964e;

    /* renamed from: f  reason: collision with root package name */
    public long f4965f;

    public n(List<i0.a> list) {
        this.a = list;
        this.b = new f.h.b.b.y1.w[list.size()];
    }

    public final boolean a(f.h.b.b.g2.t tVar, int i2) {
        if (tVar.a() == 0) {
            return false;
        }
        if (tVar.r() != i2) {
            this.c = false;
        }
        this.f4963d--;
        return this.c;
    }

    @Override // f.h.b.b.y1.j0.o
    public void b(f.h.b.b.g2.t tVar) {
        f.h.b.b.y1.w[] wVarArr;
        if (this.c) {
            if (this.f4963d != 2 || a(tVar, 32)) {
                if (this.f4963d != 1 || a(tVar, 0)) {
                    int i2 = tVar.b;
                    int a = tVar.a();
                    for (f.h.b.b.y1.w wVar : this.b) {
                        tVar.C(i2);
                        wVar.c(tVar, a);
                    }
                    this.f4964e += a;
                }
            }
        }
    }

    @Override // f.h.b.b.y1.j0.o
    public void c() {
        this.c = false;
    }

    @Override // f.h.b.b.y1.j0.o
    public void d() {
        if (this.c) {
            for (f.h.b.b.y1.w wVar : this.b) {
                wVar.d(this.f4965f, 1, this.f4964e, 0, null);
            }
            this.c = false;
        }
    }

    @Override // f.h.b.b.y1.j0.o
    public void e(f.h.b.b.y1.j jVar, i0.d dVar) {
        for (int i2 = 0; i2 < this.b.length; i2++) {
            i0.a aVar = this.a.get(i2);
            dVar.a();
            f.h.b.b.y1.w p = jVar.p(dVar.c(), 3);
            Format.b bVar = new Format.b();
            bVar.a = dVar.b();
            bVar.f722k = "application/dvbsubs";
            bVar.f724m = Collections.singletonList(aVar.b);
            bVar.c = aVar.a;
            p.e(bVar.a());
            this.b[i2] = p;
        }
    }

    @Override // f.h.b.b.y1.j0.o
    public void f(long j2, int i2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.c = true;
        this.f4965f = j2;
        this.f4964e = 0;
        this.f4963d = 2;
    }
}
