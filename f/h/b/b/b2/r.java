package f.h.b.b.b2;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: IcyDataSource.java */
/* loaded from: classes.dex */
public final class r implements f.h.b.b.f2.i {
    public final f.h.b.b.f2.i a;
    public final int b;
    public final a c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f3895d;

    /* renamed from: e  reason: collision with root package name */
    public int f3896e;

    /* compiled from: IcyDataSource.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public r(f.h.b.b.f2.i iVar, int i2, a aVar) {
        f.h.b.b.e2.j.c(i2 > 0);
        this.a = iVar;
        this.b = i2;
        this.c = aVar;
        this.f3895d = new byte[1];
        this.f3896e = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078 A[RETURN] */
    @Override // f.h.b.b.f2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int b(byte[] r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.f3896e
            r2 = -1
            if (r1 != 0) goto L79
            f.h.b.b.f2.i r1 = r0.a
            byte[] r3 = r0.f3895d
            r4 = 1
            r5 = 0
            int r1 = r1.b(r3, r5, r4)
            if (r1 != r2) goto L15
        L13:
            r4 = 0
            goto L71
        L15:
            byte[] r1 = r0.f3895d
            r1 = r1[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 4
            if (r1 != 0) goto L20
            goto L71
        L20:
            byte[] r3 = new byte[r1]
            r6 = r1
            r7 = 0
        L24:
            if (r6 <= 0) goto L32
            f.h.b.b.f2.i r8 = r0.a
            int r8 = r8.b(r3, r7, r6)
            if (r8 != r2) goto L2f
            goto L13
        L2f:
            int r7 = r7 + r8
            int r6 = r6 - r8
            goto L24
        L32:
            if (r1 <= 0) goto L3c
            int r5 = r1 + (-1)
            r6 = r3[r5]
            if (r6 != 0) goto L3c
            r1 = r5
            goto L32
        L3c:
            if (r1 <= 0) goto L71
            f.h.b.b.b2.r$a r5 = r0.c
            f.h.b.b.g2.t r6 = new f.h.b.b.g2.t
            r6.<init>(r3, r1)
            f.h.b.b.b2.c0$a r5 = (f.h.b.b.b2.c0.a) r5
            boolean r1 = r5.n
            if (r1 != 0) goto L4e
            long r7 = r5.f3825j
            goto L5c
        L4e:
            f.h.b.b.b2.c0 r1 = f.h.b.b.b2.c0.this
            java.util.Map<java.lang.String, java.lang.String> r3 = f.h.b.b.b2.c0.R
            long r7 = r1.v()
            long r9 = r5.f3825j
            long r7 = java.lang.Math.max(r7, r9)
        L5c:
            r10 = r7
            int r13 = r6.a()
            f.h.b.b.y1.w r9 = r5.f3828m
            java.util.Objects.requireNonNull(r9)
            r9.c(r6, r13)
            r12 = 1
            r14 = 0
            r15 = 0
            r9.d(r10, r12, r13, r14, r15)
            r5.n = r4
        L71:
            if (r4 == 0) goto L78
            int r1 = r0.b
            r0.f3896e = r1
            goto L79
        L78:
            return r2
        L79:
            f.h.b.b.f2.i r1 = r0.a
            int r3 = r0.f3896e
            r4 = r19
            int r3 = java.lang.Math.min(r3, r4)
            r4 = r17
            r5 = r18
            int r1 = r1.b(r4, r5, r3)
            if (r1 == r2) goto L92
            int r2 = r0.f3896e
            int r2 = r2 - r1
            r0.f3896e = r2
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.b2.r.b(byte[], int, int):int");
    }

    @Override // f.h.b.b.f2.i
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // f.h.b.b.f2.i
    public void d(f.h.b.b.f2.t tVar) {
        Objects.requireNonNull(tVar);
        this.a.d(tVar);
    }

    @Override // f.h.b.b.f2.i
    public long i(f.h.b.b.f2.j jVar) {
        throw new UnsupportedOperationException();
    }

    @Override // f.h.b.b.f2.i
    public Map<String, List<String>> k() {
        return this.a.k();
    }

    @Override // f.h.b.b.f2.i
    public Uri n() {
        return this.a.n();
    }
}
