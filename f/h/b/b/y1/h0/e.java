package f.h.b.b.y1.h0;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.t;
import f.h.b.b.y1.h0.d;

/* compiled from: AtomParsers.java */
/* loaded from: classes.dex */
public final class e {
    public static final byte[] a = b0.v("OpusHead");

    /* compiled from: AtomParsers.java */
    /* loaded from: classes.dex */
    public interface a {
        int a();

        int b();

        int c();
    }

    /* compiled from: AtomParsers.java */
    /* loaded from: classes.dex */
    public static final class b implements a {
        public final int a;
        public final int b;
        public final t c;

        public b(d.b bVar, Format format) {
            t tVar = bVar.b;
            this.c = tVar;
            tVar.C(12);
            int u = tVar.u();
            if ("audio/raw".equals(format.q)) {
                int r = b0.r(format.F, format.D);
                if (u == 0 || u % r != 0) {
                    Log.w("AtomParsers", f.a.b.a.a.e(88, "Audio sample size mismatch. stsd sample size: ", r, ", stsz sample size: ", u));
                    u = r;
                }
            }
            this.a = u == 0 ? -1 : u;
            this.b = tVar.u();
        }

        @Override // f.h.b.b.y1.h0.e.a
        public int a() {
            return this.a;
        }

        @Override // f.h.b.b.y1.h0.e.a
        public int b() {
            return this.b;
        }

        @Override // f.h.b.b.y1.h0.e.a
        public int c() {
            int i2 = this.a;
            return i2 == -1 ? this.c.u() : i2;
        }
    }

    /* compiled from: AtomParsers.java */
    /* loaded from: classes.dex */
    public static final class c implements a {
        public final t a;
        public final int b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public int f4788d;

        /* renamed from: e  reason: collision with root package name */
        public int f4789e;

        public c(d.b bVar) {
            t tVar = bVar.b;
            this.a = tVar;
            tVar.C(12);
            this.c = tVar.u() & 255;
            this.b = tVar.u();
        }

        @Override // f.h.b.b.y1.h0.e.a
        public int a() {
            return -1;
        }

        @Override // f.h.b.b.y1.h0.e.a
        public int b() {
            return this.b;
        }

        @Override // f.h.b.b.y1.h0.e.a
        public int c() {
            int i2 = this.c;
            if (i2 == 8) {
                return this.a.r();
            }
            if (i2 == 16) {
                return this.a.w();
            }
            int i3 = this.f4788d;
            this.f4788d = i3 + 1;
            if (i3 % 2 == 0) {
                int r = this.a.r();
                this.f4789e = r;
                return (r & 240) >> 4;
            }
            return this.f4789e & 15;
        }
    }

    public static Pair<String, byte[]> a(t tVar, int i2) {
        tVar.C(i2 + 8 + 4);
        tVar.D(1);
        b(tVar);
        tVar.D(2);
        int r = tVar.r();
        if ((r & 128) != 0) {
            tVar.D(2);
        }
        if ((r & 64) != 0) {
            tVar.D(tVar.w());
        }
        if ((r & 32) != 0) {
            tVar.D(2);
        }
        tVar.D(1);
        b(tVar);
        String d2 = f.h.b.b.g2.p.d(tVar.r());
        if (!"audio/mpeg".equals(d2) && !"audio/vnd.dts".equals(d2) && !"audio/vnd.dts.hd".equals(d2)) {
            tVar.D(12);
            tVar.D(1);
            int b2 = b(tVar);
            byte[] bArr = new byte[b2];
            System.arraycopy(tVar.a, tVar.b, bArr, 0, b2);
            tVar.b += b2;
            return Pair.create(d2, bArr);
        }
        return Pair.create(d2, null);
    }

    public static int b(t tVar) {
        int r = tVar.r();
        int i2 = r & 127;
        while ((r & 128) == 128) {
            r = tVar.r();
            i2 = (i2 << 7) | (r & 127);
        }
        return i2;
    }

    public static Pair<Integer, n> c(t tVar, int i2, int i3) {
        Integer num;
        n nVar;
        Pair<Integer, n> create;
        int i4;
        int i5;
        byte[] bArr;
        int i6 = tVar.b;
        while (i6 - i2 < i3) {
            tVar.C(i6);
            int f2 = tVar.f();
            f.h.b.b.e2.j.h(f2 > 0, "childAtomSize should be positive");
            if (tVar.f() == 1936289382) {
                int i7 = i6 + 8;
                int i8 = -1;
                int i9 = 0;
                String str = null;
                Integer num2 = null;
                while (i7 - i6 < f2) {
                    tVar.C(i7);
                    int f3 = tVar.f();
                    int f4 = tVar.f();
                    if (f4 == 1718775137) {
                        num2 = Integer.valueOf(tVar.f());
                    } else if (f4 == 1935894637) {
                        tVar.D(4);
                        str = tVar.o(4);
                    } else if (f4 == 1935894633) {
                        i8 = i7;
                        i9 = f3;
                    }
                    i7 += f3;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    f.h.b.b.e2.j.j(num2, "frma atom is mandatory");
                    f.h.b.b.e2.j.h(i8 != -1, "schi atom is mandatory");
                    int i10 = i8 + 8;
                    while (true) {
                        if (i10 - i8 >= i9) {
                            num = num2;
                            nVar = null;
                            break;
                        }
                        tVar.C(i10);
                        int f5 = tVar.f();
                        if (tVar.f() == 1952804451) {
                            int f6 = (tVar.f() >> 24) & 255;
                            tVar.D(1);
                            if (f6 == 0) {
                                tVar.D(1);
                                i4 = 0;
                                i5 = 0;
                            } else {
                                int r = tVar.r();
                                i4 = r & 15;
                                i5 = (r & 240) >> 4;
                            }
                            boolean z = tVar.r() == 1;
                            int r2 = tVar.r();
                            byte[] bArr2 = new byte[16];
                            System.arraycopy(tVar.a, tVar.b, bArr2, 0, 16);
                            tVar.b += 16;
                            if (z && r2 == 0) {
                                int r3 = tVar.r();
                                byte[] bArr3 = new byte[r3];
                                System.arraycopy(tVar.a, tVar.b, bArr3, 0, r3);
                                tVar.b += r3;
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            nVar = new n(z, str, r2, bArr2, i5, i4, bArr);
                        } else {
                            i10 += f5;
                        }
                    }
                    f.h.b.b.e2.j.j(nVar, "tenc atom is mandatory");
                    create = Pair.create(num, nVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i6 += f2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static f.h.b.b.y1.h0.p d(f.h.b.b.y1.h0.m r43, f.h.b.b.y1.h0.d.a r44, f.h.b.b.y1.p r45) {
        /*
            Method dump skipped, instructions count: 1582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.h0.e.d(f.h.b.b.y1.h0.m, f.h.b.b.y1.h0.d$a, f.h.b.b.y1.p):f.h.b.b.y1.h0.p");
    }

    /* JADX WARN: Removed duplicated region for block: B:302:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0a0d  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0a92  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0a9e  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0ac7  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0acc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<f.h.b.b.y1.h0.p> e(f.h.b.b.y1.h0.d.a r43, f.h.b.b.y1.p r44, long r45, com.google.android.exoplayer2.drm.DrmInitData r47, boolean r48, boolean r49, f.h.c.a.f<f.h.b.b.y1.h0.m, f.h.b.b.y1.h0.m> r50) {
        /*
            Method dump skipped, instructions count: 2815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.h0.e.e(f.h.b.b.y1.h0.d$a, f.h.b.b.y1.p, long, com.google.android.exoplayer2.drm.DrmInitData, boolean, boolean, f.h.c.a.f):java.util.List");
    }
}
