package f.h.b.b.y1.e0;

import f.h.b.b.e2.j;
import f.h.b.b.y1.i;

/* compiled from: StartOffsetExtractorInput.java */
/* loaded from: classes.dex */
public final class c implements i {
    public final i a;
    public final long b;

    public c(i iVar, long j2) {
        this.a = iVar;
        j.c(iVar.getPosition() >= j2);
        this.b = j2;
    }

    @Override // f.h.b.b.y1.i
    public long a() {
        return this.a.a() - this.b;
    }

    @Override // f.h.b.b.y1.i, f.h.b.b.f2.f
    public int b(byte[] bArr, int i2, int i3) {
        return this.a.b(bArr, i2, i3);
    }

    @Override // f.h.b.b.y1.i
    public boolean c(byte[] bArr, int i2, int i3, boolean z) {
        return this.a.c(bArr, i2, i3, z);
    }

    @Override // f.h.b.b.y1.i
    public boolean e(byte[] bArr, int i2, int i3, boolean z) {
        return this.a.e(bArr, i2, i3, z);
    }

    @Override // f.h.b.b.y1.i
    public long f() {
        return this.a.f() - this.b;
    }

    @Override // f.h.b.b.y1.i
    public void g(int i2) {
        this.a.g(i2);
    }

    @Override // f.h.b.b.y1.i
    public long getPosition() {
        return this.a.getPosition() - this.b;
    }

    @Override // f.h.b.b.y1.i
    public int h(int i2) {
        return this.a.h(i2);
    }

    @Override // f.h.b.b.y1.i
    public int j(byte[] bArr, int i2, int i3) {
        return this.a.j(bArr, i2, i3);
    }

    @Override // f.h.b.b.y1.i
    public void l() {
        this.a.l();
    }

    @Override // f.h.b.b.y1.i
    public void m(int i2) {
        this.a.m(i2);
    }

    @Override // f.h.b.b.y1.i
    public void o(byte[] bArr, int i2, int i3) {
        this.a.o(bArr, i2, i3);
    }

    @Override // f.h.b.b.y1.i
    public void readFully(byte[] bArr, int i2, int i3) {
        this.a.readFully(bArr, i2, i3);
    }
}
