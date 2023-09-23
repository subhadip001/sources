package f.h.b.b.y1.j0;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import f.h.b.b.y1.j0.i0;
import f.h.b.b.y1.t;
import java.util.Map;

/* compiled from: AdtsExtractor.java */
/* loaded from: classes.dex */
public final class j implements f.h.b.b.y1.h {
    public final f.h.b.b.g2.t c;

    /* renamed from: d  reason: collision with root package name */
    public final f.h.b.b.g2.s f4938d;

    /* renamed from: e  reason: collision with root package name */
    public f.h.b.b.y1.j f4939e;

    /* renamed from: f  reason: collision with root package name */
    public long f4940f;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4943i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4944j;
    public final k a = new k(true, null);
    public final f.h.b.b.g2.t b = new f.h.b.b.g2.t((int) RecyclerView.a0.FLAG_MOVED);

    /* renamed from: h  reason: collision with root package name */
    public int f4942h = -1;

    /* renamed from: g  reason: collision with root package name */
    public long f4941g = -1;

    static {
        c cVar = new f.h.b.b.y1.l() { // from class: f.h.b.b.y1.j0.c
            @Override // f.h.b.b.y1.l
            public final f.h.b.b.y1.h[] a() {
                return new f.h.b.b.y1.h[]{new j(0)};
            }

            @Override // f.h.b.b.y1.l
            public /* synthetic */ f.h.b.b.y1.h[] b(Uri uri, Map map) {
                return f.h.b.b.y1.k.a(this, uri, map);
            }
        };
    }

    public j(int i2) {
        f.h.b.b.g2.t tVar = new f.h.b.b.g2.t(10);
        this.c = tVar;
        this.f4938d = new f.h.b.b.g2.s(tVar.a);
    }

    public final int a(f.h.b.b.y1.i iVar) {
        int i2 = 0;
        while (true) {
            iVar.o(this.c.a, 0, 10);
            this.c.C(0);
            if (this.c.t() != 4801587) {
                break;
            }
            this.c.D(3);
            int q = this.c.q();
            i2 += q + 10;
            iVar.g(q);
        }
        iVar.l();
        iVar.g(i2);
        if (this.f4941g == -1) {
            this.f4941g = i2;
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
        r9.l();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
        if ((r3 - r0) < 8192) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
        return false;
     */
    @Override // f.h.b.b.y1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(f.h.b.b.y1.i r9) {
        /*
            r8 = this;
            int r0 = r8.a(r9)
            r1 = 0
            r3 = r0
        L6:
            r2 = 0
            r4 = 0
        L8:
            f.h.b.b.g2.t r5 = r8.c
            byte[] r5 = r5.a
            r6 = 2
            r9.o(r5, r1, r6)
            f.h.b.b.g2.t r5 = r8.c
            r5.C(r1)
            f.h.b.b.g2.t r5 = r8.c
            int r5 = r5.w()
            boolean r5 = f.h.b.b.y1.j0.k.g(r5)
            if (r5 != 0) goto L31
            r9.l()
            int r3 = r3 + 1
            int r2 = r3 - r0
            r4 = 8192(0x2000, float:1.148E-41)
            if (r2 < r4) goto L2d
            return r1
        L2d:
            r9.g(r3)
            goto L6
        L31:
            r5 = 1
            int r2 = r2 + r5
            r6 = 4
            if (r2 < r6) goto L3b
            r7 = 188(0xbc, float:2.63E-43)
            if (r4 <= r7) goto L3b
            return r5
        L3b:
            f.h.b.b.g2.t r5 = r8.c
            byte[] r5 = r5.a
            r9.o(r5, r1, r6)
            f.h.b.b.g2.s r5 = r8.f4938d
            r6 = 14
            r5.k(r6)
            f.h.b.b.g2.s r5 = r8.f4938d
            r6 = 13
            int r5 = r5.g(r6)
            r6 = 6
            if (r5 > r6) goto L55
            return r1
        L55:
            int r6 = r5 + (-6)
            r9.g(r6)
            int r4 = r4 + r5
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.j0.j.b(f.h.b.b.y1.i):boolean");
    }

    @Override // f.h.b.b.y1.h
    public int e(f.h.b.b.y1.i iVar, f.h.b.b.y1.s sVar) {
        f.h.b.b.e2.j.i(this.f4939e);
        iVar.a();
        int b = iVar.b(this.b.a, 0, RecyclerView.a0.FLAG_MOVED);
        boolean z = b == -1;
        if (!this.f4944j) {
            this.f4939e.a(new t.b(-9223372036854775807L, 0L));
            this.f4944j = true;
        }
        if (z) {
            return -1;
        }
        this.b.C(0);
        this.b.B(b);
        if (!this.f4943i) {
            this.a.s = this.f4940f;
            this.f4943i = true;
        }
        this.a.b(this.b);
        return 0;
    }

    @Override // f.h.b.b.y1.h
    public void f(f.h.b.b.y1.j jVar) {
        this.f4939e = jVar;
        this.a.e(jVar, new i0.d(Integer.MIN_VALUE, 0, 1));
        jVar.j();
    }

    @Override // f.h.b.b.y1.h
    public void g(long j2, long j3) {
        this.f4943i = false;
        this.a.c();
        this.f4940f = j3;
    }

    @Override // f.h.b.b.y1.h
    public void release() {
    }
}
