package l;

import java.util.zip.Inflater;

/* compiled from: InflaterSource.java */
/* loaded from: classes2.dex */
public final class n implements y {

    /* renamed from: f  reason: collision with root package name */
    public final h f9244f;

    /* renamed from: g  reason: collision with root package name */
    public final Inflater f9245g;

    /* renamed from: h  reason: collision with root package name */
    public int f9246h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f9247i;

    public n(h hVar, Inflater inflater) {
        this.f9244f = hVar;
        this.f9245g = inflater;
    }

    public final void a() {
        int i2 = this.f9246h;
        if (i2 == 0) {
            return;
        }
        int remaining = i2 - this.f9245g.getRemaining();
        this.f9246h -= remaining;
        this.f9244f.e(remaining);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
        a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
        if (r0.b != r0.c) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
        r7.f9229f = r0.a();
        l.v.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        return -1;
     */
    @Override // l.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long a0(l.f r7, long r8) {
        /*
            r6 = this;
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto Lb1
            boolean r3 = r6.f9247i
            if (r3 != 0) goto La9
            if (r2 != 0) goto Ld
            return r0
        Ld:
            java.util.zip.Inflater r0 = r6.f9245g
            boolean r0 = r0.needsInput()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L18
            goto L43
        L18:
            r6.a()
            java.util.zip.Inflater r0 = r6.f9245g
            int r0 = r0.getRemaining()
            if (r0 != 0) goto La1
            l.h r0 = r6.f9244f
            boolean r0 = r0.s()
            if (r0 == 0) goto L2d
            r1 = 1
            goto L43
        L2d:
            l.h r0 = r6.f9244f
            l.f r0 = r0.b()
            l.u r0 = r0.f9229f
            int r3 = r0.c
            int r4 = r0.b
            int r3 = r3 - r4
            r6.f9246h = r3
            java.util.zip.Inflater r5 = r6.f9245g
            byte[] r0 = r0.a
            r5.setInput(r0, r4, r3)
        L43:
            l.u r0 = r7.W(r2)     // Catch: java.util.zip.DataFormatException -> L9a
            int r2 = r0.c     // Catch: java.util.zip.DataFormatException -> L9a
            int r2 = 8192 - r2
            long r2 = (long) r2     // Catch: java.util.zip.DataFormatException -> L9a
            long r2 = java.lang.Math.min(r8, r2)     // Catch: java.util.zip.DataFormatException -> L9a
            int r3 = (int) r2     // Catch: java.util.zip.DataFormatException -> L9a
            java.util.zip.Inflater r2 = r6.f9245g     // Catch: java.util.zip.DataFormatException -> L9a
            byte[] r4 = r0.a     // Catch: java.util.zip.DataFormatException -> L9a
            int r5 = r0.c     // Catch: java.util.zip.DataFormatException -> L9a
            int r2 = r2.inflate(r4, r5, r3)     // Catch: java.util.zip.DataFormatException -> L9a
            if (r2 <= 0) goto L69
            int r8 = r0.c     // Catch: java.util.zip.DataFormatException -> L9a
            int r8 = r8 + r2
            r0.c = r8     // Catch: java.util.zip.DataFormatException -> L9a
            long r8 = r7.f9230g     // Catch: java.util.zip.DataFormatException -> L9a
            long r0 = (long) r2     // Catch: java.util.zip.DataFormatException -> L9a
            long r8 = r8 + r0
            r7.f9230g = r8     // Catch: java.util.zip.DataFormatException -> L9a
            return r0
        L69:
            java.util.zip.Inflater r2 = r6.f9245g     // Catch: java.util.zip.DataFormatException -> L9a
            boolean r2 = r2.finished()     // Catch: java.util.zip.DataFormatException -> L9a
            if (r2 != 0) goto L85
            java.util.zip.Inflater r2 = r6.f9245g     // Catch: java.util.zip.DataFormatException -> L9a
            boolean r2 = r2.needsDictionary()     // Catch: java.util.zip.DataFormatException -> L9a
            if (r2 == 0) goto L7a
            goto L85
        L7a:
            if (r1 != 0) goto L7d
            goto Ld
        L7d:
            java.io.EOFException r7 = new java.io.EOFException     // Catch: java.util.zip.DataFormatException -> L9a
            java.lang.String r8 = "source exhausted prematurely"
            r7.<init>(r8)     // Catch: java.util.zip.DataFormatException -> L9a
            throw r7     // Catch: java.util.zip.DataFormatException -> L9a
        L85:
            r6.a()     // Catch: java.util.zip.DataFormatException -> L9a
            int r8 = r0.b     // Catch: java.util.zip.DataFormatException -> L9a
            int r9 = r0.c     // Catch: java.util.zip.DataFormatException -> L9a
            if (r8 != r9) goto L97
            l.u r8 = r0.a()     // Catch: java.util.zip.DataFormatException -> L9a
            r7.f9229f = r8     // Catch: java.util.zip.DataFormatException -> L9a
            l.v.a(r0)     // Catch: java.util.zip.DataFormatException -> L9a
        L97:
            r7 = -1
            return r7
        L9a:
            r7 = move-exception
            java.io.IOException r8 = new java.io.IOException
            r8.<init>(r7)
            throw r8
        La1:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "?"
            r7.<init>(r8)
            throw r7
        La9:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "closed"
            r7.<init>(r8)
            throw r7
        Lb1:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "byteCount < 0: "
            java.lang.String r8 = f.a.b.a.a.l(r0, r8)
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.n.a0(l.f, long):long");
    }

    @Override // l.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f9247i) {
            return;
        }
        this.f9245g.end();
        this.f9247i = true;
        this.f9244f.close();
    }

    @Override // l.y
    public z d() {
        return this.f9244f.d();
    }
}
