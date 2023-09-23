package f.h.b.d.a.b;

import java.util.Arrays;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class c2 {
    public byte[] a = new byte[4096];
    public int b;
    public long c;

    /* renamed from: d  reason: collision with root package name */
    public long f5583d;

    /* renamed from: e  reason: collision with root package name */
    public int f5584e;

    /* renamed from: f  reason: collision with root package name */
    public int f5585f;

    /* renamed from: g  reason: collision with root package name */
    public int f5586g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5587h;

    /* renamed from: i  reason: collision with root package name */
    public String f5588i;

    public c2() {
        c();
    }

    public final int a(byte[] bArr, int i2, int i3) {
        int d2 = d(30, bArr, i2, i3);
        if (d2 != -1) {
            if (this.c == -1) {
                long q1 = f.h.b.c.a.q1(this.a, 0);
                this.c = q1;
                if (q1 == 67324752) {
                    this.f5587h = false;
                    this.f5583d = f.h.b.c.a.q1(this.a, 18);
                    this.f5586g = f.h.b.c.a.f1(this.a, 8);
                    this.f5584e = f.h.b.c.a.f1(this.a, 26);
                    int f1 = this.f5584e + 30 + f.h.b.c.a.f1(this.a, 28);
                    this.f5585f = f1;
                    int length = this.a.length;
                    if (length < f1) {
                        do {
                            length += length;
                        } while (length < f1);
                        this.a = Arrays.copyOf(this.a, length);
                    }
                } else {
                    this.f5587h = true;
                }
            }
            int d3 = d(this.f5585f, bArr, i2 + d2, i3 - d2);
            if (d3 == -1) {
                return -1;
            }
            int i4 = d2 + d3;
            if (!this.f5587h && this.f5588i == null) {
                this.f5588i = new String(this.a, 30, this.f5584e);
            }
            return i4;
        }
        return -1;
    }

    public final d3 b() {
        int i2 = this.b;
        int i3 = this.f5585f;
        if (i2 < i3) {
            return new j0(this.f5588i, this.f5583d, this.f5586g, true, this.f5587h, Arrays.copyOf(this.a, i2));
        }
        j0 j0Var = new j0(this.f5588i, this.f5583d, this.f5586g, false, this.f5587h, Arrays.copyOf(this.a, i3));
        c();
        return j0Var;
    }

    public final void c() {
        this.b = 0;
        this.f5584e = -1;
        this.c = -1L;
        this.f5587h = false;
        this.f5585f = 30;
        this.f5583d = -1L;
        this.f5586g = -1;
        this.f5588i = null;
    }

    public final int d(int i2, byte[] bArr, int i3, int i4) {
        int i5 = this.b;
        if (i5 < i2) {
            int min = Math.min(i4, i2 - i5);
            System.arraycopy(bArr, i3, this.a, this.b, min);
            int i6 = this.b + min;
            this.b = i6;
            if (i6 < i2) {
                return -1;
            }
            return min;
        }
        return 0;
    }
}
