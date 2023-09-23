package f.h.b.b.g2;

import java.util.NoSuchElementException;

/* compiled from: IntArrayQueue.java */
/* loaded from: classes.dex */
public final class k {
    public int a = 0;
    public int b = -1;
    public int c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int[] f4281d;

    /* renamed from: e  reason: collision with root package name */
    public int f4282e;

    public k() {
        int[] iArr = new int[16];
        this.f4281d = iArr;
        this.f4282e = iArr.length - 1;
    }

    public void a(int i2) {
        int i3 = this.c;
        int[] iArr = this.f4281d;
        if (i3 == iArr.length) {
            int length = iArr.length << 1;
            if (length >= 0) {
                int[] iArr2 = new int[length];
                int length2 = iArr.length;
                int i4 = this.a;
                int i5 = length2 - i4;
                System.arraycopy(iArr, i4, iArr2, 0, i5);
                System.arraycopy(this.f4281d, 0, iArr2, i5, i4);
                this.a = 0;
                this.b = this.c - 1;
                this.f4281d = iArr2;
                this.f4282e = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i6 = (this.b + 1) & this.f4282e;
        this.b = i6;
        this.f4281d[i6] = i2;
        this.c++;
    }

    public int b() {
        int i2 = this.c;
        if (i2 != 0) {
            int[] iArr = this.f4281d;
            int i3 = this.a;
            int i4 = iArr[i3];
            this.a = (i3 + 1) & this.f4282e;
            this.c = i2 - 1;
            return i4;
        }
        throw new NoSuchElementException();
    }
}
