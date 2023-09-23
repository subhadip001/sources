package j.a;

import j.a.q0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: DefaultExecutor.kt */
/* loaded from: classes2.dex */
public final class f0 extends q0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: m  reason: collision with root package name */
    public static final f0 f8741m;
    public static final long n;

    static {
        Long l2;
        f0 f0Var = new f0();
        f8741m = f0Var;
        f0Var.r0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        n = timeUnit.toNanos(l2.longValue());
    }

    public final synchronized void D0() {
        if (E0()) {
            debugStatus = 3;
            B0();
            notifyAll();
        }
    }

    public final boolean E0() {
        int i2 = debugStatus;
        return i2 == 2 || i2 == 3;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        boolean A0;
        s1 s1Var = s1.a;
        s1.b.set(this);
        try {
            synchronized (this) {
                if (E0()) {
                    z = false;
                } else {
                    z = true;
                    debugStatus = 1;
                    notifyAll();
                }
            }
            if (!z) {
                if (A0) {
                    return;
                }
                return;
            }
            long j2 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long t0 = t0();
                if (t0 == Long.MAX_VALUE) {
                    long nanoTime = System.nanoTime();
                    if (j2 == Long.MAX_VALUE) {
                        j2 = n + nanoTime;
                    }
                    long j3 = j2 - nanoTime;
                    if (j3 <= 0) {
                        _thread = null;
                        D0();
                        if (A0()) {
                            return;
                        }
                        v0();
                        return;
                    } else if (t0 > j3) {
                        t0 = j3;
                    }
                } else {
                    j2 = Long.MAX_VALUE;
                }
                if (t0 > 0) {
                    if (E0()) {
                        _thread = null;
                        D0();
                        if (A0()) {
                            return;
                        }
                        v0();
                        return;
                    }
                    LockSupport.parkNanos(this, t0);
                }
            }
        } finally {
            _thread = null;
            D0();
            if (!A0()) {
                v0();
            }
        }
    }

    @Override // j.a.q0, j.a.p0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // j.a.r0
    public Thread v0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // j.a.r0
    public void w0(long j2, q0.b bVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // j.a.q0
    public void y0(Runnable runnable) {
        if (!(debugStatus == 4)) {
            super.y0(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }
}
