package f.h.b.d.a.b;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class m0 extends FilterInputStream {

    /* renamed from: f  reason: collision with root package name */
    public final c2 f5662f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f5663g;

    /* renamed from: h  reason: collision with root package name */
    public long f5664h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5665i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5666j;

    public m0(InputStream inputStream) {
        super(inputStream);
        this.f5662f = new c2();
        this.f5663g = new byte[4096];
        this.f5665i = false;
        this.f5666j = false;
    }

    public final d3 a() {
        byte[] bArr;
        if (this.f5664h <= 0) {
            if (this.f5665i) {
            }
            return new j0(null, -1L, -1, false, false, null);
        }
        do {
            bArr = this.f5663g;
        } while (read(bArr, 0, bArr.length) != -1);
        if (this.f5665i && !this.f5666j) {
            if (!g(30)) {
                this.f5665i = true;
                return this.f5662f.b();
            }
            d3 b = this.f5662f.b();
            j0 j0Var = (j0) b;
            if (j0Var.f5647e) {
                this.f5666j = true;
                return b;
            } else if (j0Var.b != 4294967295L) {
                int i2 = this.f5662f.f5585f - 30;
                long j2 = i2;
                int length = this.f5663g.length;
                if (j2 > length) {
                    do {
                        length += length;
                    } while (length < j2);
                    this.f5663g = Arrays.copyOf(this.f5663g, length);
                }
                if (!g(i2)) {
                    this.f5665i = true;
                    return this.f5662f.b();
                }
                d3 b2 = this.f5662f.b();
                this.f5664h = ((j0) b2).b;
                return b2;
            } else {
                throw new y0("Files bigger than 4GiB are not supported.");
            }
        }
        return new j0(null, -1L, -1, false, false, null);
    }

    public final int f(byte[] bArr, int i2, int i3) {
        return Math.max(0, super.read(bArr, i2, i3));
    }

    public final boolean g(int i2) {
        int f2 = f(this.f5663g, 0, i2);
        if (f2 != i2) {
            int i3 = i2 - f2;
            if (f(this.f5663g, f2, i3) != i3) {
                this.f5662f.a(this.f5663g, 0, f2);
                return false;
            }
        }
        this.f5662f.a(this.f5663g, 0, i2);
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        long j2 = this.f5664h;
        if (j2 <= 0 || this.f5665i) {
            return -1;
        }
        int max = Math.max(0, super.read(bArr, i2, (int) Math.min(j2, i3)));
        this.f5664h -= max;
        if (max == 0) {
            this.f5665i = true;
            return 0;
        }
        return max;
    }
}
