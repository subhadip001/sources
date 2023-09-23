package l;

import java.util.Arrays;

/* compiled from: SegmentedByteString.java */
/* loaded from: classes2.dex */
public final class w extends i {

    /* renamed from: k  reason: collision with root package name */
    public final transient byte[][] f9264k;

    /* renamed from: l  reason: collision with root package name */
    public final transient int[] f9265l;

    public w(f fVar, int i2) {
        super(null);
        a0.b(fVar.f9230g, 0L, i2);
        u uVar = fVar.f9229f;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = uVar.c;
            int i7 = uVar.b;
            if (i6 != i7) {
                i4 += i6 - i7;
                i5++;
                uVar = uVar.f9262f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f9264k = new byte[i5];
        this.f9265l = new int[i5 * 2];
        u uVar2 = fVar.f9229f;
        int i8 = 0;
        while (i3 < i2) {
            byte[][] bArr = this.f9264k;
            bArr[i8] = uVar2.a;
            int i9 = uVar2.c;
            int i10 = uVar2.b;
            int i11 = (i9 - i10) + i3;
            i3 = i11 > i2 ? i2 : i11;
            int[] iArr = this.f9265l;
            iArr[i8] = i3;
            iArr[bArr.length + i8] = i10;
            uVar2.f9260d = true;
            i8++;
            uVar2 = uVar2.f9262f;
        }
    }

    @Override // l.i
    public String a() {
        return w().a();
    }

    @Override // l.i
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.p() == p() && n(0, iVar, 0, p())) {
                return true;
            }
        }
        return false;
    }

    @Override // l.i
    public int hashCode() {
        int i2 = this.f9234g;
        if (i2 != 0) {
            return i2;
        }
        int length = this.f9264k.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i3 < length) {
            byte[] bArr = this.f9264k[i3];
            int[] iArr = this.f9265l;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            int i8 = (i7 - i4) + i6;
            while (i6 < i8) {
                i5 = (i5 * 31) + bArr[i6];
                i6++;
            }
            i3++;
            i4 = i7;
        }
        this.f9234g = i5;
        return i5;
    }

    @Override // l.i
    public byte k(int i2) {
        a0.b(this.f9265l[this.f9264k.length - 1], i2, 1L);
        int v = v(i2);
        int i3 = v == 0 ? 0 : this.f9265l[v - 1];
        int[] iArr = this.f9265l;
        byte[][] bArr = this.f9264k;
        return bArr[v][(i2 - i3) + iArr[bArr.length + v]];
    }

    @Override // l.i
    public String l() {
        return w().l();
    }

    @Override // l.i
    public boolean n(int i2, i iVar, int i3, int i4) {
        if (i2 < 0 || i2 > p() - i4) {
            return false;
        }
        int v = v(i2);
        while (i4 > 0) {
            int i5 = v == 0 ? 0 : this.f9265l[v - 1];
            int min = Math.min(i4, ((this.f9265l[v] - i5) + i5) - i2);
            int[] iArr = this.f9265l;
            byte[][] bArr = this.f9264k;
            if (!iVar.o(i3, bArr[v], (i2 - i5) + iArr[bArr.length + v], min)) {
                return false;
            }
            i2 += min;
            i3 += min;
            i4 -= min;
            v++;
        }
        return true;
    }

    @Override // l.i
    public boolean o(int i2, byte[] bArr, int i3, int i4) {
        if (i2 < 0 || i2 > p() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int v = v(i2);
        while (i4 > 0) {
            int i5 = v == 0 ? 0 : this.f9265l[v - 1];
            int min = Math.min(i4, ((this.f9265l[v] - i5) + i5) - i2);
            int[] iArr = this.f9265l;
            byte[][] bArr2 = this.f9264k;
            if (!a0.a(bArr2[v], (i2 - i5) + iArr[bArr2.length + v], bArr, i3, min)) {
                return false;
            }
            i2 += min;
            i3 += min;
            i4 -= min;
            v++;
        }
        return true;
    }

    @Override // l.i
    public int p() {
        return this.f9265l[this.f9264k.length - 1];
    }

    @Override // l.i
    public i q(int i2, int i3) {
        return w().q(i2, i3);
    }

    @Override // l.i
    public i r() {
        return w().r();
    }

    @Override // l.i
    public byte[] s() {
        int[] iArr = this.f9265l;
        byte[][] bArr = this.f9264k;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr2 = this.f9265l;
            int i4 = iArr2[length + i2];
            int i5 = iArr2[i2];
            System.arraycopy(this.f9264k[i2], i4, bArr2, i3, i5 - i3);
            i2++;
            i3 = i5;
        }
        return bArr2;
    }

    @Override // l.i
    public String t() {
        return w().t();
    }

    @Override // l.i
    public String toString() {
        return w().toString();
    }

    @Override // l.i
    public void u(f fVar) {
        int length = this.f9264k.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr = this.f9265l;
            int i4 = iArr[length + i2];
            int i5 = iArr[i2];
            u uVar = new u(this.f9264k[i2], i4, (i4 + i5) - i3, true, false);
            u uVar2 = fVar.f9229f;
            if (uVar2 == null) {
                uVar.f9263g = uVar;
                uVar.f9262f = uVar;
                fVar.f9229f = uVar;
            } else {
                uVar2.f9263g.b(uVar);
            }
            i2++;
            i3 = i5;
        }
        fVar.f9230g += i3;
    }

    public final int v(int i2) {
        int binarySearch = Arrays.binarySearch(this.f9265l, 0, this.f9264k.length, i2 + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    public final i w() {
        return new i(s());
    }
}
