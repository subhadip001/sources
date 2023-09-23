package f.h.b.b.z1;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import f.h.b.b.g2.b0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
/* loaded from: classes.dex */
public class n {

    /* renamed from: h  reason: collision with root package name */
    public static final ArrayDeque<a> f5121h = new ArrayDeque<>();

    /* renamed from: i  reason: collision with root package name */
    public static final Object f5122i = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public Handler c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<RuntimeException> f5123d;

    /* renamed from: e  reason: collision with root package name */
    public final f.h.b.b.g2.i f5124e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5125f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5126g;

    /* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public final MediaCodec.CryptoInfo f5127d = new MediaCodec.CryptoInfo();

        /* renamed from: e  reason: collision with root package name */
        public long f5128e;

        /* renamed from: f  reason: collision with root package name */
        public int f5129f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        if ((r4.contains("samsung") || r4.contains("motorola")) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n(android.media.MediaCodec r2, android.os.HandlerThread r3, boolean r4) {
        /*
            r1 = this;
            f.h.b.b.g2.i r0 = new f.h.b.b.g2.i
            r0.<init>()
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.f5124e = r0
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            r1.f5123d = r2
            r2 = 0
            r3 = 1
            if (r4 != 0) goto L35
            java.lang.String r4 = f.h.b.b.g2.b0.c
            java.lang.String r4 = f.h.b.b.g2.b0.I(r4)
            java.lang.String r0 = "samsung"
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L32
            java.lang.String r0 = "motorola"
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L30
            goto L32
        L30:
            r4 = 0
            goto L33
        L32:
            r4 = 1
        L33:
            if (r4 == 0) goto L36
        L35:
            r2 = 1
        L36:
            r1.f5125f = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.z1.n.<init>(android.media.MediaCodec, android.os.HandlerThread, boolean):void");
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= bArr.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public static int[] c(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null && iArr2.length >= iArr.length) {
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    public static a e() {
        ArrayDeque<a> arrayDeque = f5121h;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new a();
            }
            return arrayDeque.removeFirst();
        }
    }

    public final void a() {
        this.f5124e.a();
        Handler handler = this.c;
        int i2 = b0.a;
        handler.obtainMessage(2).sendToTarget();
        f.h.b.b.g2.i iVar = this.f5124e;
        synchronized (iVar) {
            while (!iVar.b) {
                iVar.wait();
            }
        }
    }

    public void d() {
        if (this.f5126g) {
            try {
                Handler handler = this.c;
                int i2 = b0.a;
                handler.removeCallbacksAndMessages(null);
                a();
                f();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }

    public final void f() {
        RuntimeException andSet = this.f5123d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }
}
