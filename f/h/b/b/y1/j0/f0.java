package f.h.b.b.y1.j0;

import f.h.b.b.y1.a;

/* compiled from: TsBinarySearchSeeker.java */
/* loaded from: classes.dex */
public final class f0 extends f.h.b.b.y1.a {

    /* compiled from: TsBinarySearchSeeker.java */
    /* loaded from: classes.dex */
    public static final class a implements a.f {
        public final f.h.b.b.g2.a0 a;
        public final f.h.b.b.g2.t b = new f.h.b.b.g2.t();
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f4897d;

        public a(int i2, f.h.b.b.g2.a0 a0Var, int i3) {
            this.c = i2;
            this.a = a0Var;
            this.f4897d = i3;
        }

        @Override // f.h.b.b.y1.a.f
        public void a() {
            this.b.z(f.h.b.b.g2.b0.f4270f);
        }

        @Override // f.h.b.b.y1.a.f
        public a.e b(f.h.b.b.y1.i iVar, long j2) {
            long position = iVar.getPosition();
            int min = (int) Math.min(this.f4897d, iVar.a() - position);
            this.b.y(min);
            iVar.o(this.b.a, 0, min);
            f.h.b.b.g2.t tVar = this.b;
            int i2 = tVar.c;
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (tVar.a() >= 188) {
                byte[] bArr = tVar.a;
                int i3 = tVar.b;
                while (i3 < i2 && bArr[i3] != 71) {
                    i3++;
                }
                int i4 = i3 + 188;
                if (i4 > i2) {
                    break;
                }
                long C = f.c.a.a.i.C(tVar, i3, this.c);
                if (C != -9223372036854775807L) {
                    long b = this.a.b(C);
                    if (b > j2) {
                        if (j5 == -9223372036854775807L) {
                            return a.e.a(b, position);
                        }
                        return a.e.b(position + j4);
                    } else if (100000 + b > j2) {
                        return a.e.b(position + i3);
                    } else {
                        j5 = b;
                        j4 = i3;
                    }
                }
                tVar.C(i4);
                j3 = i4;
            }
            if (j5 != -9223372036854775807L) {
                return a.e.c(j5, position + j3);
            }
            return a.e.f4680d;
        }
    }

    public f0(f.h.b.b.g2.a0 a0Var, long j2, long j3, int i2, int i3) {
        super(new a.b(), new a(i2, a0Var, i3), j2, 0L, j2 + 1, 0L, j3, 188L, 940);
    }
}
