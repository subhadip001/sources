package f.h.b.b.y1.c0;

import f.h.b.b.g2.t;
import f.h.b.b.y1.a;
import f.h.b.b.y1.i;
import f.h.b.b.y1.m;
import f.h.b.b.y1.o;

/* compiled from: FlacBinarySearchSeeker.java */
/* loaded from: classes.dex */
public final class c extends f.h.b.b.y1.a {

    /* compiled from: FlacBinarySearchSeeker.java */
    /* loaded from: classes.dex */
    public static final class b implements a.f {
        public final o a;
        public final int b;
        public final m.a c = new m.a();

        public b(o oVar, int i2, a aVar) {
            this.a = oVar;
            this.b = i2;
        }

        @Override // f.h.b.b.y1.a.f
        public /* synthetic */ void a() {
            f.h.b.b.y1.b.a(this);
        }

        @Override // f.h.b.b.y1.a.f
        public a.e b(i iVar, long j2) {
            long position = iVar.getPosition();
            long c = c(iVar);
            long f2 = iVar.f();
            iVar.g(Math.max(6, this.a.c));
            long c2 = c(iVar);
            long f3 = iVar.f();
            if (c > j2 || c2 <= j2) {
                if (c2 <= j2) {
                    return a.e.c(c2, f3);
                }
                return a.e.a(c, position);
            }
            return a.e.b(f2);
        }

        public final long c(i iVar) {
            while (iVar.f() < iVar.a() - 6) {
                o oVar = this.a;
                int i2 = this.b;
                m.a aVar = this.c;
                long f2 = iVar.f();
                byte[] bArr = new byte[2];
                boolean z = false;
                iVar.o(bArr, 0, 2);
                if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i2) {
                    iVar.l();
                    iVar.g((int) (f2 - iVar.getPosition()));
                } else {
                    t tVar = new t(16);
                    System.arraycopy(bArr, 0, tVar.a, 0, 2);
                    tVar.B(f.c.a.a.i.A(iVar, tVar.a, 2, 14));
                    iVar.l();
                    iVar.g((int) (f2 - iVar.getPosition()));
                    z = m.b(tVar, oVar, i2, aVar);
                }
                if (z) {
                    break;
                }
                iVar.g(1);
            }
            if (iVar.f() >= iVar.a() - 6) {
                iVar.g((int) (iVar.a() - iVar.f()));
                return this.a.f5106j;
            }
            return this.c.a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(final f.h.b.b.y1.o r17, int r18, long r19, long r21) {
        /*
            r16 = this;
            r0 = r17
            java.util.Objects.requireNonNull(r17)
            f.h.b.b.y1.c0.b r1 = new f.h.b.b.y1.c0.b
            r1.<init>()
            f.h.b.b.y1.c0.c$b r2 = new f.h.b.b.y1.c0.c$b
            r3 = 0
            r4 = r18
            r2.<init>(r0, r4, r3)
            long r3 = r17.d()
            long r7 = r0.f5106j
            int r5 = r0.f5100d
            if (r5 <= 0) goto L27
            long r5 = (long) r5
            int r9 = r0.c
            long r9 = (long) r9
            long r5 = r5 + r9
            r9 = 2
            long r5 = r5 / r9
            r9 = 1
            goto L42
        L27:
            int r5 = r0.a
            int r6 = r0.b
            if (r5 != r6) goto L31
            if (r5 <= 0) goto L31
            long r5 = (long) r5
            goto L33
        L31:
            r5 = 4096(0x1000, double:2.0237E-320)
        L33:
            int r9 = r0.f5103g
            long r9 = (long) r9
            long r5 = r5 * r9
            int r9 = r0.f5104h
            long r9 = (long) r9
            long r5 = r5 * r9
            r9 = 8
            long r5 = r5 / r9
            r9 = 64
        L42:
            long r13 = r5 + r9
            r5 = 6
            int r0 = r0.c
            int r15 = java.lang.Math.max(r5, r0)
            r5 = 0
            r0 = r16
            r9 = r19
            r11 = r21
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.c0.c.<init>(f.h.b.b.y1.o, int, long, long):void");
    }
}
