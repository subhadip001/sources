package f.h.b.b.z1;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

/* compiled from: BatchBuffer.java */
/* loaded from: classes.dex */
public final class p extends DecoderInputBuffer {
    public long n;
    public int o;
    public int p;

    public p() {
        super(2);
        this.p = 32;
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderInputBuffer
    public void o() {
        super.o();
        this.o = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        if ((r0.remaining() + r3.position()) > 3072000) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean t(com.google.android.exoplayer2.decoder.DecoderInputBuffer r5) {
        /*
            r4 = this;
            boolean r0 = r5.s()
            r1 = 1
            r0 = r0 ^ r1
            f.h.b.b.e2.j.c(r0)
            boolean r0 = r5.k()
            r0 = r0 ^ r1
            f.h.b.b.e2.j.c(r0)
            boolean r0 = r5.m()
            r0 = r0 ^ r1
            f.h.b.b.e2.j.c(r0)
            boolean r0 = r4.u()
            r2 = 0
            if (r0 != 0) goto L22
        L20:
            r0 = 1
            goto L4c
        L22:
            int r0 = r4.o
            int r3 = r4.p
            if (r0 < r3) goto L2a
        L28:
            r0 = 0
            goto L4c
        L2a:
            boolean r0 = r5.l()
            boolean r3 = r4.l()
            if (r0 == r3) goto L35
            goto L28
        L35:
            java.nio.ByteBuffer r0 = r5.f752h
            if (r0 == 0) goto L20
            java.nio.ByteBuffer r3 = r4.f752h
            if (r3 == 0) goto L20
            int r3 = r3.position()
            int r0 = r0.remaining()
            int r0 = r0 + r3
            r3 = 3072000(0x2ee000, float:4.304789E-39)
            if (r0 <= r3) goto L20
            goto L28
        L4c:
            if (r0 != 0) goto L4f
            return r2
        L4f:
            int r0 = r4.o
            int r2 = r0 + 1
            r4.o = r2
            if (r0 != 0) goto L63
            long r2 = r5.f754j
            r4.f754j = r2
            boolean r0 = r5.n()
            if (r0 == 0) goto L63
            r4.f4610f = r1
        L63:
            boolean r0 = r5.l()
            if (r0 == 0) goto L6d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.f4610f = r0
        L6d:
            java.nio.ByteBuffer r0 = r5.f752h
            if (r0 == 0) goto L7d
            int r2 = r0.remaining()
            r4.q(r2)
            java.nio.ByteBuffer r2 = r4.f752h
            r2.put(r0)
        L7d:
            long r2 = r5.f754j
            r4.n = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.z1.p.t(com.google.android.exoplayer2.decoder.DecoderInputBuffer):boolean");
    }

    public boolean u() {
        return this.o > 0;
    }
}
