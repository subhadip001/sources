package f.h.b.b.y1.j0;

import java.util.Arrays;

/* compiled from: NalUnitTargetBuffer.java */
/* loaded from: classes.dex */
public final class w {
    public final int a;
    public boolean b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f5067d;

    /* renamed from: e  reason: collision with root package name */
    public int f5068e;

    public w(int i2, int i3) {
        this.a = i2;
        byte[] bArr = new byte[i3 + 3];
        this.f5067d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i2, int i3) {
        if (this.b) {
            int i4 = i3 - i2;
            byte[] bArr2 = this.f5067d;
            int length = bArr2.length;
            int i5 = this.f5068e;
            if (length < i5 + i4) {
                this.f5067d = Arrays.copyOf(bArr2, (i5 + i4) * 2);
            }
            System.arraycopy(bArr, i2, this.f5067d, this.f5068e, i4);
            this.f5068e += i4;
        }
    }

    public boolean b(int i2) {
        if (this.b) {
            this.f5068e -= i2;
            this.b = false;
            this.c = true;
            return true;
        }
        return false;
    }

    public void c() {
        this.b = false;
        this.c = false;
    }

    public void d(int i2) {
        f.h.b.b.e2.j.g(!this.b);
        boolean z = i2 == this.a;
        this.b = z;
        if (z) {
            this.f5068e = 3;
            this.c = false;
        }
    }
}
