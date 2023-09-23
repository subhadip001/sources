package f.h.b.b.y1.j0;

/* compiled from: PsDurationReader.java */
/* loaded from: classes.dex */
public final class a0 {
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4876d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4877e;
    public final f.h.b.b.g2.a0 a = new f.h.b.b.g2.a0(0);

    /* renamed from: f  reason: collision with root package name */
    public long f4878f = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    public long f4879g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    public long f4880h = -9223372036854775807L;
    public final f.h.b.b.g2.t b = new f.h.b.b.g2.t();

    public static long c(f.h.b.b.g2.t tVar) {
        int i2 = tVar.b;
        if (tVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        System.arraycopy(tVar.a, tVar.b, bArr, 0, 9);
        tVar.b += 9;
        tVar.C(i2);
        if ((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            return (((bArr[0] & 56) >> 3) << 30) | ((bArr[0] & 3) << 28) | ((bArr[1] & 255) << 20) | (((bArr[2] & 248) >> 3) << 15) | ((bArr[2] & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
        }
        return -9223372036854775807L;
    }

    public final int a(f.h.b.b.y1.i iVar) {
        this.b.z(f.h.b.b.g2.b0.f4270f);
        this.c = true;
        iVar.l();
        return 0;
    }

    public final int b(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }
}
