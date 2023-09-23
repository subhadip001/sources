package f.h.b.b.y1.i0;

import f.h.b.b.g2.t;

/* compiled from: OggPacket.java */
/* loaded from: classes.dex */
public final class e {
    public final f a = new f();
    public final t b = new t(new byte[65025], 0);
    public int c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f4858d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4859e;

    public final int a(int i2) {
        int i3;
        int i4 = 0;
        this.f4858d = 0;
        do {
            int i5 = this.f4858d;
            int i6 = i2 + i5;
            f fVar = this.a;
            if (i6 >= fVar.f4860d) {
                break;
            }
            int[] iArr = fVar.f4863g;
            this.f4858d = i5 + 1;
            i3 = iArr[i5 + i2];
            i4 += i3;
        } while (i3 == 255);
        return i4;
    }

    public boolean b(f.h.b.b.y1.i iVar) {
        int i2;
        f.h.b.b.e2.j.g(iVar != null);
        if (this.f4859e) {
            this.f4859e = false;
            this.b.y(0);
        }
        while (!this.f4859e) {
            if (this.c < 0) {
                if (!this.a.c(iVar, -1L) || !this.a.a(iVar, true)) {
                    return false;
                }
                f fVar = this.a;
                int i3 = fVar.f4861e;
                if ((fVar.b & 1) == 1 && this.b.c == 0) {
                    i3 += a(0);
                    i2 = this.f4858d + 0;
                } else {
                    i2 = 0;
                }
                iVar.m(i3);
                this.c = i2;
            }
            int a = a(this.c);
            int i4 = this.c + this.f4858d;
            if (a > 0) {
                t tVar = this.b;
                tVar.b(tVar.c + a);
                t tVar2 = this.b;
                iVar.readFully(tVar2.a, tVar2.c, a);
                t tVar3 = this.b;
                tVar3.B(tVar3.c + a);
                this.f4859e = this.a.f4863g[i4 + (-1)] != 255;
            }
            if (i4 == this.a.f4860d) {
                i4 = -1;
            }
            this.c = i4;
        }
        return true;
    }
}
