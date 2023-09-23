package f.h.b.b.y1.j0;

import android.util.Log;
import com.google.android.exoplayer2.Format;
import f.h.b.b.y1.j0.i0;

/* compiled from: Id3Reader.java */
/* loaded from: classes.dex */
public final class t implements o {
    public final f.h.b.b.g2.t a = new f.h.b.b.g2.t(10);
    public f.h.b.b.y1.w b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public long f5045d;

    /* renamed from: e  reason: collision with root package name */
    public int f5046e;

    /* renamed from: f  reason: collision with root package name */
    public int f5047f;

    @Override // f.h.b.b.y1.j0.o
    public void b(f.h.b.b.g2.t tVar) {
        f.h.b.b.e2.j.i(this.b);
        if (this.c) {
            int a = tVar.a();
            int i2 = this.f5047f;
            if (i2 < 10) {
                int min = Math.min(a, 10 - i2);
                System.arraycopy(tVar.a, tVar.b, this.a.a, this.f5047f, min);
                if (this.f5047f + min == 10) {
                    this.a.C(0);
                    if (73 == this.a.r() && 68 == this.a.r() && 51 == this.a.r()) {
                        this.a.D(3);
                        this.f5046e = this.a.q() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a, this.f5046e - this.f5047f);
            this.b.c(tVar, min2);
            this.f5047f += min2;
        }
    }

    @Override // f.h.b.b.y1.j0.o
    public void c() {
        this.c = false;
    }

    @Override // f.h.b.b.y1.j0.o
    public void d() {
        int i2;
        f.h.b.b.e2.j.i(this.b);
        if (this.c && (i2 = this.f5046e) != 0 && this.f5047f == i2) {
            this.b.d(this.f5045d, 1, i2, 0, null);
            this.c = false;
        }
    }

    @Override // f.h.b.b.y1.j0.o
    public void e(f.h.b.b.y1.j jVar, i0.d dVar) {
        dVar.a();
        f.h.b.b.y1.w p = jVar.p(dVar.c(), 5);
        this.b = p;
        Format.b bVar = new Format.b();
        bVar.a = dVar.b();
        bVar.f722k = "application/id3";
        p.e(bVar.a());
    }

    @Override // f.h.b.b.y1.j0.o
    public void f(long j2, int i2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.c = true;
        this.f5045d = j2;
        this.f5046e = 0;
        this.f5047f = 0;
    }
}
