package l;

/* compiled from: Segment.java */
/* loaded from: classes2.dex */
public final class u {
    public final byte[] a;
    public int b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9260d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9261e;

    /* renamed from: f  reason: collision with root package name */
    public u f9262f;

    /* renamed from: g  reason: collision with root package name */
    public u f9263g;

    public u() {
        this.a = new byte[8192];
        this.f9261e = true;
        this.f9260d = false;
    }

    public u a() {
        u uVar = this.f9262f;
        u uVar2 = uVar != this ? uVar : null;
        u uVar3 = this.f9263g;
        uVar3.f9262f = uVar;
        this.f9262f.f9263g = uVar3;
        this.f9262f = null;
        this.f9263g = null;
        return uVar2;
    }

    public u b(u uVar) {
        uVar.f9263g = this;
        uVar.f9262f = this.f9262f;
        this.f9262f.f9263g = uVar;
        this.f9262f = uVar;
        return uVar;
    }

    public u c() {
        this.f9260d = true;
        return new u(this.a, this.b, this.c, true, false);
    }

    public void d(u uVar, int i2) {
        if (uVar.f9261e) {
            int i3 = uVar.c;
            if (i3 + i2 > 8192) {
                if (!uVar.f9260d) {
                    int i4 = uVar.b;
                    if ((i3 + i2) - i4 <= 8192) {
                        byte[] bArr = uVar.a;
                        System.arraycopy(bArr, i4, bArr, 0, i3 - i4);
                        uVar.c -= uVar.b;
                        uVar.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.a, this.b, uVar.a, uVar.c, i2);
            uVar.c += i2;
            this.b += i2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public u(byte[] bArr, int i2, int i3, boolean z, boolean z2) {
        this.a = bArr;
        this.b = i2;
        this.c = i3;
        this.f9260d = z;
        this.f9261e = z2;
    }
}
