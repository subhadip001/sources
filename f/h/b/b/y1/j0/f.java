package f.h.b.b.y1.j0;

import android.net.Uri;
import f.h.b.b.y1.j0.i0;
import f.h.b.b.y1.t;
import java.util.Map;

/* compiled from: Ac3Extractor.java */
/* loaded from: classes.dex */
public final class f implements f.h.b.b.y1.h {
    public final g a = new g(null);
    public final f.h.b.b.g2.t b = new f.h.b.b.g2.t(2786);
    public boolean c;

    static {
        a aVar = new f.h.b.b.y1.l() { // from class: f.h.b.b.y1.j0.a
            @Override // f.h.b.b.y1.l
            public final f.h.b.b.y1.h[] a() {
                return new f.h.b.b.y1.h[]{new f()};
            }

            @Override // f.h.b.b.y1.l
            public /* synthetic */ f.h.b.b.y1.h[] b(Uri uri, Map map) {
                return f.h.b.b.y1.k.a(this, uri, map);
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
        if ((r5 - r3) < 8192) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
        r14.l();
        r5 = r5 + 1;
     */
    @Override // f.h.b.b.y1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(f.h.b.b.y1.i r14) {
        /*
            r13 = this;
            f.h.b.b.g2.t r0 = new f.h.b.b.g2.t
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.a
            r14.o(r4, r2, r1)
            r0.C(r2)
            int r4 = r0.t()
            r5 = 4801587(0x494433, float:6.728456E-39)
            r6 = 3
            if (r4 == r5) goto L85
            r14.l()
            r14.g(r3)
            r5 = r3
        L22:
            r4 = 0
        L23:
            byte[] r7 = r0.a
            r8 = 6
            r14.o(r7, r2, r8)
            r0.C(r2)
            int r7 = r0.w()
            r9 = 2935(0xb77, float:4.113E-42)
            if (r7 == r9) goto L44
            r14.l()
            int r5 = r5 + 1
            int r4 = r5 - r3
            r7 = 8192(0x2000, float:1.148E-41)
            if (r4 < r7) goto L40
            return r2
        L40:
            r14.g(r5)
            goto L22
        L44:
            r7 = 1
            int r4 = r4 + r7
            r9 = 4
            if (r4 < r9) goto L4a
            return r7
        L4a:
            byte[] r10 = r0.a
            int r11 = r10.length
            r12 = -1
            if (r11 >= r8) goto L52
            r9 = -1
            goto L7c
        L52:
            r11 = 5
            r11 = r10[r11]
            r11 = r11 & 248(0xf8, float:3.48E-43)
            int r11 = r11 >> r6
            if (r11 <= r1) goto L5c
            r11 = 1
            goto L5d
        L5c:
            r11 = 0
        L5d:
            if (r11 == 0) goto L6f
            r8 = 2
            r9 = r10[r8]
            r9 = r9 & 7
            int r9 = r9 << 8
            r10 = r10[r6]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r9 = r9 | r10
            int r9 = r9 + r7
            int r9 = r9 * 2
            goto L7c
        L6f:
            r7 = r10[r9]
            r7 = r7 & 192(0xc0, float:2.69E-43)
            int r7 = r7 >> r8
            r8 = r10[r9]
            r8 = r8 & 63
            int r9 = f.h.b.b.u1.l.a(r7, r8)
        L7c:
            if (r9 != r12) goto L7f
            return r2
        L7f:
            int r9 = r9 + (-6)
            r14.g(r9)
            goto L23
        L85:
            r0.D(r6)
            int r4 = r0.q()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r14.g(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.j0.f.b(f.h.b.b.y1.i):boolean");
    }

    @Override // f.h.b.b.y1.h
    public int e(f.h.b.b.y1.i iVar, f.h.b.b.y1.s sVar) {
        int b = iVar.b(this.b.a, 0, 2786);
        if (b == -1) {
            return -1;
        }
        this.b.C(0);
        this.b.B(b);
        if (!this.c) {
            this.a.f4906l = 0L;
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
