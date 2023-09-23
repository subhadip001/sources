package f.h.b.b.y1.i0;

import com.google.android.exoplayer2.ParserException;
import f.h.b.b.g2.t;
import java.io.EOFException;

/* compiled from: OggPageHeader.java */
/* loaded from: classes.dex */
public final class f {
    public int a;
    public int b;
    public long c;

    /* renamed from: d  reason: collision with root package name */
    public int f4860d;

    /* renamed from: e  reason: collision with root package name */
    public int f4861e;

    /* renamed from: f  reason: collision with root package name */
    public int f4862f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f4863g = new int[255];

    /* renamed from: h  reason: collision with root package name */
    public final t f4864h = new t(255);

    public boolean a(f.h.b.b.y1.i iVar, boolean z) {
        boolean z2;
        int i2;
        b();
        this.f4864h.y(27);
        try {
            z2 = iVar.e(this.f4864h.a, 0, 27, z);
        } catch (EOFException e2) {
            if (!z) {
                throw e2;
            }
            z2 = false;
        }
        if (z2 && this.f4864h.s() == 1332176723) {
            int r = this.f4864h.r();
            this.a = r;
            if (r != 0) {
                if (z) {
                    return false;
                }
                throw new ParserException("unsupported bit stream revision");
            }
            this.b = this.f4864h.r();
            t tVar = this.f4864h;
            byte[] bArr = tVar.a;
            int i3 = tVar.b + 1;
            tVar.b = i3;
            int i4 = i3 + 1;
            tVar.b = i4;
            int i5 = i4 + 1;
            tVar.b = i5;
            int i6 = i5 + 1;
            tVar.b = i6;
            int i7 = i6 + 1;
            tVar.b = i7;
            int i8 = i7 + 1;
            tVar.b = i8;
            int i9 = i8 + 1;
            tVar.b = i9;
            tVar.b = i9 + 1;
            this.c = ((bArr[i9] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i3] & 255) << 8) | ((bArr[i4] & 255) << 16) | ((bArr[i5] & 255) << 24) | ((bArr[i6] & 255) << 32) | ((bArr[i7] & 255) << 40) | ((bArr[i8] & 255) << 48);
            tVar.i();
            this.f4864h.i();
            this.f4864h.i();
            int r2 = this.f4864h.r();
            this.f4860d = r2;
            this.f4861e = r2 + 27;
            this.f4864h.y(r2);
            iVar.o(this.f4864h.a, 0, this.f4860d);
            for (int i10 = 0; i10 < this.f4860d; i10++) {
                this.f4863g[i10] = this.f4864h.r();
                this.f4862f += this.f4863g[i10];
            }
            return true;
        }
        return false;
    }

    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0L;
        this.f4860d = 0;
        this.f4861e = 0;
        this.f4862f = 0;
    }

    public boolean c(f.h.b.b.y1.i iVar, long j2) {
        int i2;
        boolean z;
        f.h.b.b.e2.j.c(iVar.getPosition() == iVar.f());
        this.f4864h.y(4);
        while (true) {
            i2 = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
            if (i2 != 0 && iVar.getPosition() + 4 >= j2) {
                break;
            }
            try {
                z = iVar.e(this.f4864h.a, 0, 4, true);
            } catch (EOFException unused) {
                z = false;
            }
            if (!z) {
                break;
            }
            this.f4864h.C(0);
            if (this.f4864h.s() == 1332176723) {
                iVar.l();
                return true;
            }
            iVar.m(1);
        }
        do {
            if (i2 != 0 && iVar.getPosition() >= j2) {
                break;
            }
        } while (iVar.h(1) != -1);
        return false;
    }
}
