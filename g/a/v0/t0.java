package g.a.v0;

import g.a.v0.y;
import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;

/* compiled from: GzipInflatingBuffer.java */
/* loaded from: classes2.dex */
public class t0 implements Closeable {

    /* renamed from: j  reason: collision with root package name */
    public int f7915j;

    /* renamed from: k  reason: collision with root package name */
    public int f7916k;

    /* renamed from: l  reason: collision with root package name */
    public Inflater f7917l;
    public int o;
    public int p;
    public long q;

    /* renamed from: f  reason: collision with root package name */
    public final y f7911f = new y();

    /* renamed from: g  reason: collision with root package name */
    public final CRC32 f7912g = new CRC32();

    /* renamed from: h  reason: collision with root package name */
    public final b f7913h = new b(null);

    /* renamed from: i  reason: collision with root package name */
    public final byte[] f7914i = new byte[512];

    /* renamed from: m  reason: collision with root package name */
    public c f7918m = c.HEADER;
    public boolean n = false;
    public int r = 0;
    public int s = 0;
    public boolean t = true;

    /* compiled from: GzipInflatingBuffer.java */
    /* loaded from: classes2.dex */
    public class b {
        public b(a aVar) {
        }

        public static void a(b bVar, int i2) {
            int i3;
            t0 t0Var = t0.this;
            int i4 = t0Var.f7916k - t0Var.f7915j;
            if (i4 > 0) {
                int min = Math.min(i4, i2);
                t0 t0Var2 = t0.this;
                t0Var2.f7912g.update(t0Var2.f7914i, t0Var2.f7915j, min);
                t0.this.f7915j += min;
                i3 = i2 - min;
            } else {
                i3 = i2;
            }
            if (i3 > 0) {
                byte[] bArr = new byte[512];
                int i5 = 0;
                while (i5 < i3) {
                    int min2 = Math.min(i3 - i5, 512);
                    y yVar = t0.this.f7911f;
                    yVar.l(new y.b(yVar, 0, bArr), min2);
                    t0.this.f7912g.update(bArr, 0, min2);
                    i5 += min2;
                }
            }
            t0.this.r += i2;
        }

        public static boolean b(b bVar) {
            do {
                t0 t0Var = t0.this;
                if ((t0Var.f7916k - t0Var.f7915j) + t0Var.f7911f.f7977f <= 0) {
                    return false;
                }
            } while (bVar.d() != 0);
            return true;
        }

        public static int c(b bVar) {
            t0 t0Var = t0.this;
            return (t0Var.f7916k - t0Var.f7915j) + t0Var.f7911f.f7977f;
        }

        public final int d() {
            int readUnsignedByte;
            t0 t0Var = t0.this;
            int i2 = t0Var.f7916k;
            int i3 = t0Var.f7915j;
            if (i2 - i3 > 0) {
                readUnsignedByte = t0Var.f7914i[i3] & 255;
                t0Var.f7915j = i3 + 1;
            } else {
                readUnsignedByte = t0Var.f7911f.readUnsignedByte();
            }
            t0.this.f7912g.update(readUnsignedByte);
            t0.this.r++;
            return readUnsignedByte;
        }

        public final int e() {
            return d() | (d() << 8);
        }
    }

    /* compiled from: GzipInflatingBuffer.java */
    /* loaded from: classes2.dex */
    public enum c {
        HEADER,
        HEADER_EXTRA_LEN,
        HEADER_EXTRA,
        HEADER_NAME,
        HEADER_COMMENT,
        HEADER_CRC,
        INITIALIZE_INFLATER,
        INFLATING,
        INFLATER_NEEDS_INPUT,
        TRAILER
    }

    public int a(byte[] bArr, int i2, int i3) {
        int i4;
        c cVar = c.TRAILER;
        c cVar2 = c.INFLATING;
        c cVar3 = c.INFLATER_NEEDS_INPUT;
        c cVar4 = c.HEADER_NAME;
        boolean z = true;
        f.h.b.c.a.C(!this.n, "GzipInflatingBuffer is closed");
        boolean z2 = true;
        int i5 = 0;
        while (z2 && (i4 = i3 - i5) > 0) {
            switch (this.f7918m.ordinal()) {
                case 0:
                    if (b.c(this.f7913h) < 10) {
                        z2 = false;
                        break;
                    } else if (this.f7913h.e() == 35615) {
                        if (this.f7913h.d() == 8) {
                            this.o = this.f7913h.d();
                            b.a(this.f7913h, 6);
                            this.f7918m = c.HEADER_EXTRA_LEN;
                            z2 = true;
                            break;
                        } else {
                            throw new ZipException("Unsupported compression method");
                        }
                    } else {
                        throw new ZipException("Not in GZIP format");
                    }
                case 1:
                    if ((this.o & 4) != 4) {
                        this.f7918m = cVar4;
                    } else if (b.c(this.f7913h) < 2) {
                        z2 = false;
                        break;
                    } else {
                        this.p = this.f7913h.e();
                        this.f7918m = c.HEADER_EXTRA;
                    }
                    z2 = true;
                    break;
                case 2:
                    int c2 = b.c(this.f7913h);
                    int i6 = this.p;
                    if (c2 >= i6) {
                        b.a(this.f7913h, i6);
                        this.f7918m = cVar4;
                        z2 = true;
                        break;
                    } else {
                        z2 = false;
                        break;
                    }
                case 3:
                    c cVar5 = c.HEADER_COMMENT;
                    if ((this.o & 8) != 8) {
                        this.f7918m = cVar5;
                    } else if (!b.b(this.f7913h)) {
                        z2 = false;
                        break;
                    } else {
                        this.f7918m = cVar5;
                    }
                    z2 = true;
                    break;
                case 4:
                    c cVar6 = c.HEADER_CRC;
                    if ((this.o & 16) != 16) {
                        this.f7918m = cVar6;
                    } else if (!b.b(this.f7913h)) {
                        z2 = false;
                        break;
                    } else {
                        this.f7918m = cVar6;
                    }
                    z2 = true;
                    break;
                case 5:
                    c cVar7 = c.INITIALIZE_INFLATER;
                    if ((this.o & 2) != 2) {
                        this.f7918m = cVar7;
                    } else if (b.c(this.f7913h) < 2) {
                        z2 = false;
                        break;
                    } else if ((65535 & ((int) this.f7912g.getValue())) == this.f7913h.e()) {
                        this.f7918m = cVar7;
                    } else {
                        throw new ZipException("Corrupt GZIP header");
                    }
                    z2 = true;
                    break;
                case 6:
                    Inflater inflater = this.f7917l;
                    if (inflater == null) {
                        this.f7917l = new Inflater(true);
                    } else {
                        inflater.reset();
                    }
                    this.f7912g.reset();
                    int i7 = this.f7916k;
                    int i8 = this.f7915j;
                    int i9 = i7 - i8;
                    if (i9 > 0) {
                        this.f7917l.setInput(this.f7914i, i8, i9);
                        this.f7918m = cVar2;
                    } else {
                        this.f7918m = cVar3;
                    }
                    z2 = true;
                    break;
                case 7:
                    int i10 = i2 + i5;
                    f.h.b.c.a.C(this.f7917l != null, "inflater is null");
                    try {
                        int totalIn = this.f7917l.getTotalIn();
                        int inflate = this.f7917l.inflate(bArr, i10, i4);
                        int totalIn2 = this.f7917l.getTotalIn() - totalIn;
                        this.r += totalIn2;
                        this.s += totalIn2;
                        this.f7915j += totalIn2;
                        this.f7912g.update(bArr, i10, inflate);
                        if (this.f7917l.finished()) {
                            this.q = this.f7917l.getBytesWritten() & 4294967295L;
                            this.f7918m = cVar;
                        } else if (this.f7917l.needsInput()) {
                            this.f7918m = cVar3;
                        }
                        i5 += inflate;
                        if (this.f7918m != cVar) {
                            z2 = true;
                            break;
                        } else {
                            z2 = f();
                            break;
                        }
                    } catch (DataFormatException e2) {
                        StringBuilder A = f.a.b.a.a.A("Inflater data format exception: ");
                        A.append(e2.getMessage());
                        throw new DataFormatException(A.toString());
                    }
                case 8:
                    f.h.b.c.a.C(this.f7917l != null, "inflater is null");
                    f.h.b.c.a.C(this.f7915j == this.f7916k, "inflaterInput has unconsumed bytes");
                    int min = Math.min(this.f7911f.f7977f, 512);
                    if (min != 0) {
                        this.f7915j = 0;
                        this.f7916k = min;
                        this.f7911f.G(this.f7914i, 0, min);
                        this.f7917l.setInput(this.f7914i, this.f7915j, min);
                        this.f7918m = cVar2;
                        z2 = true;
                        break;
                    } else {
                        z2 = false;
                        break;
                    }
                case 9:
                    z2 = f();
                    break;
                default:
                    StringBuilder A2 = f.a.b.a.a.A("Invalid state: ");
                    A2.append(this.f7918m);
                    throw new AssertionError(A2.toString());
            }
        }
        if (z2 && (this.f7918m != c.HEADER || b.c(this.f7913h) >= 10)) {
            z = false;
        }
        this.t = z;
        return i5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.n) {
            return;
        }
        this.n = true;
        this.f7911f.close();
        Inflater inflater = this.f7917l;
        if (inflater != null) {
            inflater.end();
            this.f7917l = null;
        }
    }

    public final boolean f() {
        if (this.f7917l != null && b.c(this.f7913h) <= 18) {
            this.f7917l.end();
            this.f7917l = null;
        }
        if (b.c(this.f7913h) < 8) {
            return false;
        }
        long value = this.f7912g.getValue();
        b bVar = this.f7913h;
        if (value == (bVar.e() | (bVar.e() << 16))) {
            long j2 = this.q;
            b bVar2 = this.f7913h;
            if (j2 == ((bVar2.e() << 16) | bVar2.e())) {
                this.f7912g.reset();
                this.f7918m = c.HEADER;
                return true;
            }
        }
        throw new ZipException("Corrupt GZIP trailer");
    }
}
