package f.h.b.b.y1.h0;

import f.h.b.b.y1.w;

/* compiled from: TrackEncryptionBox.java */
/* loaded from: classes.dex */
public final class n {
    public final boolean a;
    public final String b;
    public final w.a c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4831d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f4832e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
        if (r6.equals("cbc1") == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n(boolean r5, java.lang.String r6, int r7, byte[] r8, int r9, int r10, byte[] r11) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            if (r11 != 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            r2 = r2 ^ r3
            f.h.b.b.e2.j.c(r2)
            r4.a = r5
            r4.b = r6
            r4.f4831d = r7
            r4.f4832e = r11
            f.h.b.b.y1.w$a r5 = new f.h.b.b.y1.w$a
            r7 = 2
            if (r6 != 0) goto L21
            goto L7f
        L21:
            int r11 = r6.hashCode()
            r2 = 3
            switch(r11) {
                case 3046605: goto L4b;
                case 3046671: goto L40;
                case 3049879: goto L35;
                case 3049895: goto L2a;
                default: goto L29;
            }
        L29:
            goto L53
        L2a:
            java.lang.String r11 = "cens"
            boolean r11 = r6.equals(r11)
            if (r11 != 0) goto L33
            goto L53
        L33:
            r0 = 3
            goto L54
        L35:
            java.lang.String r11 = "cenc"
            boolean r11 = r6.equals(r11)
            if (r11 != 0) goto L3e
            goto L53
        L3e:
            r0 = 2
            goto L54
        L40:
            java.lang.String r11 = "cbcs"
            boolean r11 = r6.equals(r11)
            if (r11 != 0) goto L49
            goto L53
        L49:
            r0 = 1
            goto L54
        L4b:
            java.lang.String r11 = "cbc1"
            boolean r11 = r6.equals(r11)
            if (r11 != 0) goto L54
        L53:
            r0 = -1
        L54:
            if (r0 == 0) goto L7e
            if (r0 == r1) goto L7e
            if (r0 == r7) goto L7f
            if (r0 == r2) goto L7f
            int r7 = r6.length()
            int r7 = r7 + 68
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r7)
            java.lang.String r7 = "Unsupported protection scheme type '"
            r11.append(r7)
            r11.append(r6)
            java.lang.String r6 = "'. Assuming AES-CTR crypto mode."
            r11.append(r6)
            java.lang.String r6 = r11.toString()
            java.lang.String r7 = "TrackEncryptionBox"
            android.util.Log.w(r7, r6)
            goto L7f
        L7e:
            r1 = 2
        L7f:
            r5.<init>(r1, r8, r9, r10)
            r4.c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.h0.n.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }
}
