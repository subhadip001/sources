package g.a.w0;

import g.a.v0.y2;

/* compiled from: OkHttpWritableBuffer.java */
/* loaded from: classes2.dex */
public class l implements y2 {
    public final l.f a;
    public int b;
    public int c;

    public l(l.f fVar, int i2) {
        this.a = fVar;
        this.b = i2;
    }

    @Override // g.a.v0.y2
    public void a(byte[] bArr, int i2, int i3) {
        this.a.g0(bArr, i2, i3);
        this.b -= i3;
        this.c += i3;
    }

    @Override // g.a.v0.y2
    public int b() {
        return this.b;
    }

    @Override // g.a.v0.y2
    public int c() {
        return this.c;
    }

    @Override // g.a.v0.y2
    public void d(byte b) {
        this.a.m0(b);
        this.b--;
        this.c++;
    }

    @Override // g.a.v0.y2
    public void release() {
    }
}
