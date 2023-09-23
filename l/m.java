package l;

import java.io.EOFException;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: GzipSource.java */
/* loaded from: classes2.dex */
public final class m implements y {

    /* renamed from: g  reason: collision with root package name */
    public final h f9240g;

    /* renamed from: h  reason: collision with root package name */
    public final Inflater f9241h;

    /* renamed from: i  reason: collision with root package name */
    public final n f9242i;

    /* renamed from: f  reason: collision with root package name */
    public int f9239f = 0;

    /* renamed from: j  reason: collision with root package name */
    public final CRC32 f9243j = new CRC32();

    public m(y yVar) {
        if (yVar != null) {
            Inflater inflater = new Inflater(true);
            this.f9241h = inflater;
            Logger logger = o.a;
            t tVar = new t(yVar);
            this.f9240g = tVar;
            this.f9242i = new n(tVar, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final void a(String str, int i2, int i3) {
        if (i3 != i2) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    @Override // l.y
    public long a0(f fVar, long j2) {
        long j3;
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 >= 0) {
            if (i2 == 0) {
                return 0L;
            }
            if (this.f9239f == 0) {
                this.f9240g.j0(10L);
                byte l2 = this.f9240g.b().l(3L);
                boolean z = ((l2 >> 1) & 1) == 1;
                if (z) {
                    f(this.f9240g.b(), 0L, 10L);
                }
                a("ID1ID2", 8075, this.f9240g.readShort());
                this.f9240g.e(8L);
                if (((l2 >> 2) & 1) == 1) {
                    this.f9240g.j0(2L);
                    if (z) {
                        f(this.f9240g.b(), 0L, 2L);
                    }
                    long Y = this.f9240g.b().Y();
                    this.f9240g.j0(Y);
                    if (z) {
                        j3 = Y;
                        f(this.f9240g.b(), 0L, Y);
                    } else {
                        j3 = Y;
                    }
                    this.f9240g.e(j3);
                }
                if (((l2 >> 3) & 1) == 1) {
                    long l0 = this.f9240g.l0((byte) 0);
                    if (l0 != -1) {
                        if (z) {
                            f(this.f9240g.b(), 0L, l0 + 1);
                        }
                        this.f9240g.e(l0 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((l2 >> 4) & 1) == 1) {
                    long l02 = this.f9240g.l0((byte) 0);
                    if (l02 != -1) {
                        if (z) {
                            f(this.f9240g.b(), 0L, l02 + 1);
                        }
                        this.f9240g.e(l02 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z) {
                    a("FHCRC", this.f9240g.Y(), (short) this.f9243j.getValue());
                    this.f9243j.reset();
                }
                this.f9239f = 1;
            }
            if (this.f9239f == 1) {
                long j4 = fVar.f9230g;
                long a0 = this.f9242i.a0(fVar, j2);
                if (a0 != -1) {
                    f(fVar, j4, a0);
                    return a0;
                }
                this.f9239f = 2;
            }
            if (this.f9239f == 2) {
                a("CRC", this.f9240g.R(), (int) this.f9243j.getValue());
                a("ISIZE", this.f9240g.R(), (int) this.f9241h.getBytesWritten());
                this.f9239f = 3;
                if (!this.f9240g.s()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(f.a.b.a.a.l("byteCount < 0: ", j2));
    }

    @Override // l.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9242i.close();
    }

    @Override // l.y
    public z d() {
        return this.f9240g.d();
    }

    public final void f(f fVar, long j2, long j3) {
        int i2;
        u uVar = fVar.f9229f;
        while (true) {
            int i3 = uVar.c;
            int i4 = uVar.b;
            if (j2 < i3 - i4) {
                break;
            }
            j2 -= i3 - i4;
            uVar = uVar.f9262f;
        }
        while (j3 > 0) {
            int min = (int) Math.min(uVar.c - i2, j3);
            this.f9243j.update(uVar.a, (int) (uVar.b + j2), min);
            j3 -= min;
            uVar = uVar.f9262f;
            j2 = 0;
        }
    }
}
