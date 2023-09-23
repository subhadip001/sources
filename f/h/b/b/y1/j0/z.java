package f.h.b.b.y1.j0;

import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay;
import f.h.b.b.y1.a;

/* compiled from: PsBinarySearchSeeker.java */
/* loaded from: classes.dex */
public final class z extends f.h.b.b.y1.a {

    /* compiled from: PsBinarySearchSeeker.java */
    /* loaded from: classes.dex */
    public static final class b implements a.f {
        public final f.h.b.b.g2.a0 a;
        public final f.h.b.b.g2.t b = new f.h.b.b.g2.t();

        public b(f.h.b.b.g2.a0 a0Var, a aVar) {
            this.a = a0Var;
        }

        @Override // f.h.b.b.y1.a.f
        public void a() {
            this.b.z(f.h.b.b.g2.b0.f4270f);
        }

        @Override // f.h.b.b.y1.a.f
        public a.e b(f.h.b.b.y1.i iVar, long j2) {
            int g2;
            long position = iVar.getPosition();
            int min = (int) Math.min((long) FirebaseInAppMessagingDisplay.DISMISS_THRESHOLD_MILLIS, iVar.a() - position);
            this.b.y(min);
            iVar.o(this.b.a, 0, min);
            f.h.b.b.g2.t tVar = this.b;
            int i2 = -1;
            long j3 = -9223372036854775807L;
            int i3 = -1;
            while (tVar.a() >= 4) {
                if (z.g(tVar.a, tVar.b) != 442) {
                    tVar.D(1);
                } else {
                    tVar.D(4);
                    long c = a0.c(tVar);
                    if (c != -9223372036854775807L) {
                        long b = this.a.b(c);
                        if (b > j2) {
                            if (j3 == -9223372036854775807L) {
                                return a.e.a(b, position);
                            }
                            return a.e.b(position + i3);
                        } else if (100000 + b > j2) {
                            return a.e.b(position + tVar.b);
                        } else {
                            i3 = tVar.b;
                            j3 = b;
                        }
                    }
                    int i4 = tVar.c;
                    if (tVar.a() < 10) {
                        tVar.C(i4);
                    } else {
                        tVar.D(9);
                        int r = tVar.r() & 7;
                        if (tVar.a() < r) {
                            tVar.C(i4);
                        } else {
                            tVar.D(r);
                            if (tVar.a() < 4) {
                                tVar.C(i4);
                            } else {
                                if (z.g(tVar.a, tVar.b) == 443) {
                                    tVar.D(4);
                                    int w = tVar.w();
                                    if (tVar.a() < w) {
                                        tVar.C(i4);
                                    } else {
                                        tVar.D(w);
                                    }
                                }
                                while (true) {
                                    if (tVar.a() < 4 || (g2 = z.g(tVar.a, tVar.b)) == 442 || g2 == 441 || (g2 >>> 8) != 1) {
                                        break;
                                    }
                                    tVar.D(4);
                                    if (tVar.a() < 2) {
                                        tVar.C(i4);
                                        break;
                                    }
                                    tVar.C(Math.min(tVar.c, tVar.b + tVar.w()));
                                }
                            }
                        }
                    }
                    i2 = tVar.b;
                }
            }
            if (j3 != -9223372036854775807L) {
                return a.e.c(j3, position + i2);
            }
            return a.e.f4680d;
        }
    }

    public z(f.h.b.b.g2.a0 a0Var, long j2, long j3) {
        super(new a.b(), new b(a0Var, null), j2, 0L, j2 + 1, 0L, j3, 188L, 1000);
    }

    public static int g(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }
}
