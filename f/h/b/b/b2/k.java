package f.h.b.b.b2;

/* compiled from: BundledExtractorsAdapter.java */
/* loaded from: classes.dex */
public final class k {
    public final f.h.b.b.y1.l a;
    public f.h.b.b.y1.h b;
    public f.h.b.b.y1.i c;

    public k(f.h.b.b.y1.l lVar) {
        this.a = lVar;
    }

    public long a() {
        f.h.b.b.y1.i iVar = this.c;
        if (iVar != null) {
            return iVar.getPosition();
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (r6.f4728d != r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
        if (r6.f4728d != r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(f.h.b.b.f2.f r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, f.h.b.b.y1.j r15) {
        /*
            r7 = this;
            f.h.b.b.y1.e r6 = new f.h.b.b.y1.e
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.c = r6
            f.h.b.b.y1.h r8 = r7.b
            if (r8 == 0) goto L10
            return
        L10:
            f.h.b.b.y1.l r8 = r7.a
            f.h.b.b.y1.h[] r8 = r8.b(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L21
            r8 = r8[r13]
            r7.b = r8
            goto Lbb
        L21:
            int r10 = r8.length
            r0 = 0
        L23:
            if (r0 >= r10) goto L6a
            r1 = r8[r0]
            boolean r2 = r1.b(r6)     // Catch: java.lang.Throwable -> L40 java.io.EOFException -> L53
            if (r2 == 0) goto L35
            r7.b = r1     // Catch: java.lang.Throwable -> L40 java.io.EOFException -> L53
            f.h.b.b.e2.j.g(r14)
            r6.f4730f = r13
            goto L6a
        L35:
            f.h.b.b.y1.h r1 = r7.b
            if (r1 != 0) goto L61
            long r1 = r6.f4728d
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L5f
            goto L61
        L40:
            r8 = move-exception
            f.h.b.b.y1.h r9 = r7.b
            if (r9 != 0) goto L4d
            long r9 = r6.f4728d
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L4c
            goto L4d
        L4c:
            r14 = 0
        L4d:
            f.h.b.b.e2.j.g(r14)
            r6.f4730f = r13
            throw r8
        L53:
            f.h.b.b.y1.h r1 = r7.b
            if (r1 != 0) goto L61
            long r1 = r6.f4728d
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L5f
            goto L61
        L5f:
            r1 = 0
            goto L62
        L61:
            r1 = 1
        L62:
            f.h.b.b.e2.j.g(r1)
            r6.f4730f = r13
            int r0 = r0 + 1
            goto L23
        L6a:
            f.h.b.b.y1.h r10 = r7.b
            if (r10 != 0) goto Lbb
            com.google.android.exoplayer2.source.UnrecognizedInputFormatException r10 = new com.google.android.exoplayer2.source.UnrecognizedInputFormatException
            int r11 = f.h.b.b.g2.b0.a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
        L77:
            int r12 = r8.length
            if (r13 >= r12) goto L94
            r12 = r8[r13]
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getSimpleName()
            r11.append(r12)
            int r12 = r8.length
            int r12 = r12 + (-1)
            if (r13 >= r12) goto L91
            java.lang.String r12 = ", "
            r11.append(r12)
        L91:
            int r13 = r13 + 1
            goto L77
        L94:
            java.lang.String r8 = r11.toString()
            r11 = 58
            int r11 = f.a.b.a.a.x(r8, r11)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r11)
            java.lang.String r11 = "None of the available extractors ("
            r12.append(r11)
            r12.append(r8)
            java.lang.String r8 = ") could read the stream."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            java.util.Objects.requireNonNull(r9)
            r10.<init>(r8, r9)
            throw r10
        Lbb:
            f.h.b.b.y1.h r8 = r7.b
            r8.f(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.b2.k.b(f.h.b.b.f2.f, android.net.Uri, java.util.Map, long, long, f.h.b.b.y1.j):void");
    }
}
