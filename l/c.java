package l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: AsyncTimeout.java */
/* loaded from: classes2.dex */
public class c extends z {

    /* renamed from: h  reason: collision with root package name */
    public static final long f9221h;

    /* renamed from: i  reason: collision with root package name */
    public static final long f9222i;

    /* renamed from: j  reason: collision with root package name */
    public static c f9223j;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9224e;

    /* renamed from: f  reason: collision with root package name */
    public c f9225f;

    /* renamed from: g  reason: collision with root package name */
    public long f9226g;

    /* compiled from: AsyncTimeout.java */
    /* loaded from: classes2.dex */
    public static final class a extends Thread {
        public a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
            r1.m();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<l.c> r0 = l.c.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                l.c r1 = l.c.h()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                l.c r2 = l.c.f9223j     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                l.c.f9223j = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.m()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: l.c.a.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f9221h = millis;
        f9222i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static c h() {
        c cVar = f9223j.f9225f;
        if (cVar == null) {
            long nanoTime = System.nanoTime();
            c.class.wait(f9221h);
            if (f9223j.f9225f != null || System.nanoTime() - nanoTime < f9222i) {
                return null;
            }
            return f9223j;
        }
        long nanoTime2 = cVar.f9226g - System.nanoTime();
        if (nanoTime2 > 0) {
            long j2 = nanoTime2 / 1000000;
            c.class.wait(j2, (int) (nanoTime2 - (1000000 * j2)));
            return null;
        }
        f9223j.f9225f = cVar.f9225f;
        cVar.f9225f = null;
        return cVar;
    }

    public final void i() {
        c cVar;
        if (!this.f9224e) {
            long j2 = this.c;
            boolean z = this.a;
            int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i2 != 0 || z) {
                this.f9224e = true;
                synchronized (c.class) {
                    if (f9223j == null) {
                        f9223j = new c();
                        new a().start();
                    }
                    long nanoTime = System.nanoTime();
                    if (i2 != 0 && z) {
                        this.f9226g = Math.min(j2, c() - nanoTime) + nanoTime;
                    } else if (i2 != 0) {
                        this.f9226g = j2 + nanoTime;
                    } else if (z) {
                        this.f9226g = c();
                    } else {
                        throw new AssertionError();
                    }
                    long j3 = this.f9226g - nanoTime;
                    c cVar2 = f9223j;
                    while (true) {
                        cVar = cVar2.f9225f;
                        if (cVar == null || j3 < cVar.f9226g - nanoTime) {
                            break;
                        }
                        cVar2 = cVar;
                    }
                    this.f9225f = cVar;
                    cVar2.f9225f = this;
                    if (cVar2 == f9223j) {
                        c.class.notify();
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    public final void j(boolean z) {
        if (k() && z) {
            throw l(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        r2.f9225f = r4.f9225f;
        r4.f9225f = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k() {
        /*
            r4 = this;
            boolean r0 = r4.f9224e
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r4.f9224e = r1
            java.lang.Class<l.c> r0 = l.c.class
            monitor-enter(r0)
            l.c r2 = l.c.f9223j     // Catch: java.lang.Throwable -> L21
        Ld:
            if (r2 == 0) goto L1e
            l.c r3 = r2.f9225f     // Catch: java.lang.Throwable -> L21
            if (r3 != r4) goto L1c
            l.c r3 = r4.f9225f     // Catch: java.lang.Throwable -> L21
            r2.f9225f = r3     // Catch: java.lang.Throwable -> L21
            r2 = 0
            r4.f9225f = r2     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)
            goto L20
        L1c:
            r2 = r3
            goto Ld
        L1e:
            r1 = 1
            monitor-exit(r0)
        L20:
            return r1
        L21:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.c.k():boolean");
    }

    public IOException l(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void m() {
    }
}
