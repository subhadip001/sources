package f.h.b.d.a.b;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class b1 extends OutputStream {

    /* renamed from: f  reason: collision with root package name */
    public final c2 f5571f = new c2();

    /* renamed from: g  reason: collision with root package name */
    public final File f5572g;

    /* renamed from: h  reason: collision with root package name */
    public final x2 f5573h;

    /* renamed from: i  reason: collision with root package name */
    public long f5574i;

    /* renamed from: j  reason: collision with root package name */
    public long f5575j;

    /* renamed from: k  reason: collision with root package name */
    public FileOutputStream f5576k;

    /* renamed from: l  reason: collision with root package name */
    public d3 f5577l;

    public b1(File file, x2 x2Var) {
        this.f5572g = file;
        this.f5573h = x2Var;
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
        write(new byte[]{(byte) i2}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        int min;
        while (i3 > 0) {
            if (this.f5574i == 0 && this.f5575j == 0) {
                int a = this.f5571f.a(bArr, i2, i3);
                if (a == -1) {
                    return;
                }
                i2 += a;
                i3 -= a;
                d3 b = this.f5571f.b();
                this.f5577l = b;
                if (b.d()) {
                    this.f5574i = 0L;
                    this.f5573h.k(this.f5577l.f(), 0, this.f5577l.f().length);
                    this.f5575j = this.f5577l.f().length;
                } else if (this.f5577l.h() && !this.f5577l.g()) {
                    this.f5573h.i(this.f5577l.f());
                    File file = new File(this.f5572g, this.f5577l.c());
                    file.getParentFile().mkdirs();
                    this.f5574i = this.f5577l.b();
                    this.f5576k = new FileOutputStream(file);
                } else {
                    byte[] f2 = this.f5577l.f();
                    this.f5573h.k(f2, 0, f2.length);
                    this.f5574i = this.f5577l.b();
                }
            }
            if (!this.f5577l.g()) {
                if (this.f5577l.d()) {
                    this.f5573h.d(this.f5575j, bArr, i2, i3);
                    this.f5575j += i3;
                    min = i3;
                } else if (this.f5577l.h()) {
                    min = (int) Math.min(i3, this.f5574i);
                    this.f5576k.write(bArr, i2, min);
                    long j2 = this.f5574i - min;
                    this.f5574i = j2;
                    if (j2 == 0) {
                        this.f5576k.close();
                    }
                } else {
                    min = (int) Math.min(i3, this.f5574i);
                    this.f5573h.d((this.f5577l.f().length + this.f5577l.b()) - this.f5574i, bArr, i2, min);
                    this.f5574i -= min;
                }
                i2 += min;
                i3 -= min;
            }
        }
    }
}
