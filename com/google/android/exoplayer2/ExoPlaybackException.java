package com.google.android.exoplayer2;

import f.h.b.b.b2.x;

/* loaded from: classes.dex */
public final class ExoPlaybackException extends Exception {

    /* renamed from: f  reason: collision with root package name */
    public final int f699f;

    /* renamed from: g  reason: collision with root package name */
    public final String f700g;

    /* renamed from: h  reason: collision with root package name */
    public final int f701h;

    /* renamed from: i  reason: collision with root package name */
    public final Format f702i;

    /* renamed from: j  reason: collision with root package name */
    public final int f703j;

    /* renamed from: k  reason: collision with root package name */
    public final long f704k;

    /* renamed from: l  reason: collision with root package name */
    public final x f705l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f706m;
    public final Throwable n;

    public ExoPlaybackException(int i2, Throwable th) {
        this(i2, th, null, null, -1, null, 4, false);
    }

    public static ExoPlaybackException b(Exception exc) {
        return new ExoPlaybackException(1, exc, null, null, -1, null, 4, false);
    }

    public ExoPlaybackException a(x xVar) {
        return new ExoPlaybackException(getMessage(), this.n, this.f699f, this.f700g, this.f701h, this.f702i, this.f703j, xVar, this.f704k, this.f706m);
    }

    public ExoPlaybackException(String str, Throwable th, int i2, String str2, int i3, Format format, int i4, x xVar, long j2, boolean z) {
        super(str, th);
        this.f699f = i2;
        this.n = th;
        this.f700g = str2;
        this.f701h = i3;
        this.f702i = format;
        this.f703j = i4;
        this.f705l = xVar;
        this.f704k = j2;
        this.f706m = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ExoPlaybackException(int r13, java.lang.Throwable r14, java.lang.String r15, java.lang.String r16, int r17, com.google.android.exoplayer2.Format r18, int r19, boolean r20) {
        /*
            r12 = this;
            r3 = r13
            r4 = r16
            r7 = r19
            r0 = 2
            if (r3 == 0) goto L69
            r1 = 3
            r2 = 1
            if (r3 == r2) goto L16
            if (r3 == r1) goto L11
            java.lang.String r1 = "Unexpected runtime error"
            goto L13
        L11:
            java.lang.String r1 = "Remote error"
        L13:
            r8 = r17
            goto L6d
        L16:
            java.lang.String r5 = java.lang.String.valueOf(r18)
            java.util.UUID r6 = f.h.b.b.h0.a
            if (r7 == 0) goto L39
            if (r7 == r2) goto L36
            if (r7 == r0) goto L33
            if (r7 == r1) goto L30
            r1 = 4
            if (r7 != r1) goto L2a
            java.lang.String r1 = "YES"
            goto L3b
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L30:
            java.lang.String r1 = "NO_EXCEEDS_CAPABILITIES"
            goto L3b
        L33:
            java.lang.String r1 = "NO_UNSUPPORTED_DRM"
            goto L3b
        L36:
            java.lang.String r1 = "NO_UNSUPPORTED_TYPE"
            goto L3b
        L39:
            java.lang.String r1 = "NO"
        L3b:
            r2 = 53
            int r2 = f.a.b.a.a.x(r4, r2)
            int r6 = r5.length()
            int r6 = r6 + r2
            int r2 = r1.length()
            int r2 = r2 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r2)
            r6.append(r4)
            java.lang.String r2 = " error, index="
            r6.append(r2)
            r8 = r17
            r6.append(r8)
            java.lang.String r2 = ", format="
            r6.append(r2)
            java.lang.String r2 = ", format_supported="
            java.lang.String r1 = f.a.b.a.a.v(r6, r5, r2, r1)
            goto L6d
        L69:
            r8 = r17
            java.lang.String r1 = "Source error"
        L6d:
            r2 = 0
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L8b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r5 = r1.length()
            int r5 = r5 + r0
            java.lang.String r0 = "null"
            int r0 = r0.length()
            int r0 = r0 + r5
            java.lang.String r5 = ": "
            java.lang.String r0 = f.a.b.a.a.g(r0, r1, r5, r2)
            r1 = r0
        L8b:
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r12
            r2 = r14
            r3 = r13
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r9
            r9 = r10
            r11 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlaybackException.<init>(int, java.lang.Throwable, java.lang.String, java.lang.String, int, com.google.android.exoplayer2.Format, int, boolean):void");
    }
}
