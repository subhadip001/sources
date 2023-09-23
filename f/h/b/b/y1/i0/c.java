package f.h.b.b.y1.i0;

import f.h.b.b.g2.b0;
import f.h.b.b.y1.i0.i;
import f.h.b.b.y1.m;
import f.h.b.b.y1.n;
import f.h.b.b.y1.o;
import f.h.b.b.y1.t;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: FlacReader.java */
/* loaded from: classes.dex */
public final class c extends i {
    public o n;
    public a o;

    /* compiled from: FlacReader.java */
    /* loaded from: classes.dex */
    public static final class a implements g {
        public o a;
        public o.a b;
        public long c = -1;

        /* renamed from: d  reason: collision with root package name */
        public long f4857d = -1;

        public a(o oVar, o.a aVar) {
            this.a = oVar;
            this.b = aVar;
        }

        @Override // f.h.b.b.y1.i0.g
        public t a() {
            f.h.b.b.e2.j.g(this.c != -1);
            return new n(this.a, this.c);
        }

        @Override // f.h.b.b.y1.i0.g
        public long b(f.h.b.b.y1.i iVar) {
            long j2 = this.f4857d;
            if (j2 >= 0) {
                long j3 = -(j2 + 2);
                this.f4857d = -1L;
                return j3;
            }
            return -1L;
        }

        @Override // f.h.b.b.y1.i0.g
        public void c(long j2) {
            long[] jArr = this.b.a;
            this.f4857d = jArr[b0.e(jArr, j2, true, true)];
        }
    }

    @Override // f.h.b.b.y1.i0.i
    public long c(f.h.b.b.g2.t tVar) {
        byte[] bArr = tVar.a;
        if (bArr[0] == -1) {
            int i2 = (bArr[2] & 255) >> 4;
            if (i2 == 6 || i2 == 7) {
                tVar.D(4);
                tVar.x();
            }
            int c = m.c(tVar, i2);
            tVar.C(0);
            return c;
        }
        return -1L;
    }

    @Override // f.h.b.b.y1.i0.i
    public boolean d(f.h.b.b.g2.t tVar, long j2, i.b bVar) {
        byte[] bArr = tVar.a;
        o oVar = this.n;
        if (oVar == null) {
            o oVar2 = new o(bArr, 17);
            this.n = oVar2;
            bVar.a = oVar2.e(Arrays.copyOfRange(bArr, 9, tVar.c), null);
            return true;
        } else if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            o.a D = f.c.a.a.i.D(tVar);
            o b = oVar.b(D);
            this.n = b;
            this.o = new a(b, D);
            return true;
        } else {
            if (bArr[0] == -1) {
                a aVar = this.o;
                if (aVar != null) {
                    aVar.c = j2;
                    bVar.b = aVar;
                }
                Objects.requireNonNull(bVar.a);
                return false;
            }
            return true;
        }
    }

    @Override // f.h.b.b.y1.i0.i
    public void e(boolean z) {
        super.e(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
