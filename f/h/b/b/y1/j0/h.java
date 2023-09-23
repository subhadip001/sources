package f.h.b.b.y1.j0;

import android.net.Uri;
import f.h.b.b.y1.j0.i0;
import f.h.b.b.y1.t;
import java.util.Map;

/* compiled from: Ac4Extractor.java */
/* loaded from: classes.dex */
public final class h implements f.h.b.b.y1.h {
    public final i a = new i(null);
    public final f.h.b.b.g2.t b = new f.h.b.b.g2.t(16384);
    public boolean c;

    static {
        b bVar = new f.h.b.b.y1.l() { // from class: f.h.b.b.y1.j0.b
            @Override // f.h.b.b.y1.l
            public final f.h.b.b.y1.h[] a() {
                return new f.h.b.b.y1.h[]{new h()};
            }

            @Override // f.h.b.b.y1.l
            public /* synthetic */ f.h.b.b.y1.h[] b(Uri uri, Map map) {
                return f.h.b.b.y1.k.a(this, uri, map);
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
        r15.l();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
        if ((r4 - r3) < 8192) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
        return false;
     */
    @Override // f.h.b.b.y1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(f.h.b.b.y1.i r15) {
        /*
            r14 = this;
            f.h.b.b.g2.t r0 = new f.h.b.b.g2.t
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.a
            r15.o(r4, r2, r1)
            r0.C(r2)
            int r4 = r0.t()
            r5 = 4801587(0x494433, float:6.728456E-39)
            r6 = 3
            if (r4 == r5) goto L8e
            r15.l()
            r15.g(r3)
            r4 = r3
        L22:
            r1 = 0
        L23:
            byte[] r5 = r0.a
            r7 = 7
            r15.o(r5, r2, r7)
            r0.C(r2)
            int r5 = r0.w()
            r8 = 44096(0xac40, float:6.1792E-41)
            r9 = 44097(0xac41, float:6.1793E-41)
            if (r5 == r8) goto L4a
            if (r5 == r9) goto L4a
            r15.l()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.148E-41)
            if (r1 < r5) goto L46
            return r2
        L46:
            r15.g(r4)
            goto L22
        L4a:
            r8 = 1
            int r1 = r1 + r8
            r10 = 4
            if (r1 < r10) goto L50
            return r8
        L50:
            byte[] r8 = r0.a
            int r11 = r8.length
            r12 = -1
            if (r11 >= r7) goto L58
            r11 = -1
            goto L85
        L58:
            r11 = 2
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r13 = r8[r6]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r11 != r13) goto L7f
            r10 = r8[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            r11 = 5
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r10 = r10 | r11
            r11 = 6
            r8 = r8[r11]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r11 = r10 | r8
            goto L80
        L7f:
            r7 = 4
        L80:
            if (r5 != r9) goto L84
            int r7 = r7 + 2
        L84:
            int r11 = r11 + r7
        L85:
            if (r11 != r12) goto L88
            return r2
        L88:
            int r11 = r11 + (-7)
            r15.g(r11)
            goto L23
        L8e:
            r0.D(r6)
            int r4 = r0.q()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r15.g(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.j0.h.b(f.h.b.b.y1.i):boolean");
    }

    @Override // f.h.b.b.y1.h
    public int e(f.h.b.b.y1.i iVar, f.h.b.b.y1.s sVar) {
        int b = iVar.b(this.b.a, 0, 16384);
        if (b == -1) {
            return -1;
        }
        this.b.C(0);
        this.b.B(b);
        if (!this.c) {
            this.a.f4934m = 0L;
            this.c = true;
        }
        this.a.b(this.b);
        return 0;
    }

    @Override // f.h.b.b.y1.h
    public void f(f.h.b.b.y1.j jVar) {
        this.a.e(jVar, new i0.d(Integer.MIN_VALUE, 0, 1));
        jVar.j();
        jVar.a(new t.b(-9223372036854775807L, 0L));
    }

    @Override // f.h.b.b.y1.h
    public void g(long j2, long j3) {
        this.c = false;
        this.a.c();
    }

    @Override // f.h.b.b.y1.h
    public void release() {
    }
}
