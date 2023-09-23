package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.arthenica.ffmpegkit.AbstractSession;
import com.google.android.exoplayer2.drm.DrmSession;
import f.h.b.b.b2.c0;
import f.h.b.b.b2.f0;
import f.h.b.b.b2.k;
import f.h.b.b.e2.j;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.m;
import f.h.b.b.y1.h;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class Loader {

    /* renamed from: d  reason: collision with root package name */
    public static final c f995d = new c(2, -9223372036854775807L, null);

    /* renamed from: e  reason: collision with root package name */
    public static final c f996e = new c(3, -9223372036854775807L, null);
    public final ExecutorService a;
    public d<? extends e> b;
    public IOException c;

    /* loaded from: classes.dex */
    public static final class UnexpectedLoaderException extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public UnexpectedLoaderException(java.lang.Throwable r5) {
            /*
                r4 = this;
                java.lang.Class r0 = r5.getClass()
                java.lang.String r0 = r0.getSimpleName()
                java.lang.String r1 = r5.getMessage()
                int r2 = r0.length()
                int r2 = r2 + 13
                java.lang.String r3 = java.lang.String.valueOf(r1)
                int r3 = r3.length()
                int r3 = r3 + r2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r3)
                java.lang.String r3 = "Unexpected "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = ": "
                r2.append(r0)
                r2.append(r1)
                java.lang.String r0 = r2.toString()
                r4.<init>(r0, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.Loader.UnexpectedLoaderException.<init>(java.lang.Throwable):void");
        }
    }

    /* loaded from: classes.dex */
    public interface b<T extends e> {
        void b(T t, long j2, long j3, boolean z);

        void d(T t, long j2, long j3);

        c o(T t, long j2, long j3, IOException iOException, int i2);
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final int a;
        public final long b;

        public c(int i2, long j2, a aVar) {
            this.a = i2;
            this.b = j2;
        }
    }

    /* loaded from: classes.dex */
    public final class d<T extends e> extends Handler implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final int f997f;

        /* renamed from: g  reason: collision with root package name */
        public final T f998g;

        /* renamed from: h  reason: collision with root package name */
        public final long f999h;

        /* renamed from: i  reason: collision with root package name */
        public b<T> f1000i;

        /* renamed from: j  reason: collision with root package name */
        public IOException f1001j;

        /* renamed from: k  reason: collision with root package name */
        public int f1002k;

        /* renamed from: l  reason: collision with root package name */
        public Thread f1003l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f1004m;
        public volatile boolean n;

        public d(Looper looper, T t, b<T> bVar, int i2, long j2) {
            super(looper);
            this.f998g = t;
            this.f1000i = bVar;
            this.f997f = i2;
            this.f999h = j2;
        }

        public void a(boolean z) {
            this.n = z;
            this.f1001j = null;
            if (hasMessages(0)) {
                this.f1004m = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f1004m = true;
                    this.f998g.b();
                    Thread thread = this.f1003l;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                Loader.this.b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                b<T> bVar = this.f1000i;
                Objects.requireNonNull(bVar);
                bVar.b(this.f998g, elapsedRealtime, elapsedRealtime - this.f999h, true);
                this.f1000i = null;
            }
        }

        public void b(long j2) {
            j.g(Loader.this.b == null);
            Loader loader = Loader.this;
            loader.b = this;
            if (j2 > 0) {
                sendEmptyMessageDelayed(0, j2);
                return;
            }
            this.f1001j = null;
            loader.a.execute(this);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.n) {
                return;
            }
            int i2 = message.what;
            if (i2 == 0) {
                this.f1001j = null;
                Loader loader = Loader.this;
                ExecutorService executorService = loader.a;
                d<? extends e> dVar = loader.b;
                Objects.requireNonNull(dVar);
                executorService.execute(dVar);
            } else if (i2 != 3) {
                Loader.this.b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = elapsedRealtime - this.f999h;
                b<T> bVar = this.f1000i;
                Objects.requireNonNull(bVar);
                if (this.f1004m) {
                    bVar.b(this.f998g, elapsedRealtime, j2, false);
                    return;
                }
                int i3 = message.what;
                if (i3 == 1) {
                    try {
                        bVar.d(this.f998g, elapsedRealtime, j2);
                    } catch (RuntimeException e2) {
                        m.b("LoadTask", "Unexpected exception handling load completed", e2);
                        Loader.this.c = new UnexpectedLoaderException(e2);
                    }
                } else if (i3 != 2) {
                } else {
                    IOException iOException = (IOException) message.obj;
                    this.f1001j = iOException;
                    int i4 = this.f1002k + 1;
                    this.f1002k = i4;
                    c o = bVar.o(this.f998g, elapsedRealtime, j2, iOException, i4);
                    int i5 = o.a;
                    if (i5 == 3) {
                        Loader.this.c = this.f1001j;
                    } else if (i5 != 2) {
                        if (i5 == 1) {
                            this.f1002k = 1;
                        }
                        long j3 = o.b;
                        if (j3 == -9223372036854775807L) {
                            j3 = Math.min((this.f1002k - 1) * 1000, (int) AbstractSession.DEFAULT_TIMEOUT_FOR_ASYNCHRONOUS_MESSAGES_IN_TRANSMIT);
                        }
                        b(j3);
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = !this.f1004m;
                    this.f1003l = Thread.currentThread();
                }
                if (z) {
                    String simpleName = this.f998g.getClass().getSimpleName();
                    j.b(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                    try {
                        this.f998g.a();
                        j.m();
                    } catch (Throwable th) {
                        j.m();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f1003l = null;
                    Thread.interrupted();
                }
                if (this.n) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e2) {
                if (this.n) {
                    return;
                }
                obtainMessage(2, e2).sendToTarget();
            } catch (Exception e3) {
                m.b("LoadTask", "Unexpected exception loading stream", e3);
                if (this.n) {
                    return;
                }
                obtainMessage(2, new UnexpectedLoaderException(e3)).sendToTarget();
            } catch (OutOfMemoryError e4) {
                m.b("LoadTask", "OutOfMemory error loading stream", e4);
                if (this.n) {
                    return;
                }
                obtainMessage(2, new UnexpectedLoaderException(e4)).sendToTarget();
            } catch (Error e5) {
                m.b("LoadTask", "Unexpected error loading stream", e5);
                if (!this.n) {
                    obtainMessage(3, e5).sendToTarget();
                }
                throw e5;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    public interface f {
    }

    /* loaded from: classes.dex */
    public static final class g implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final f f1005f;

        public g(f fVar) {
            this.f1005f = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            f0[] f0VarArr;
            c0 c0Var = (c0) this.f1005f;
            for (f0 f0Var : c0Var.x) {
                f0Var.q(true);
                DrmSession drmSession = f0Var.f3858h;
                if (drmSession != null) {
                    f.h.b.b.x1.d dVar = (f.h.b.b.x1.d) drmSession;
                    f0Var.f3858h = null;
                    f0Var.f3857g = null;
                }
            }
            k kVar = c0Var.q;
            h hVar = kVar.b;
            if (hVar != null) {
                hVar.release();
                kVar.b = null;
            }
            kVar.c = null;
        }
    }

    public Loader(final String str) {
        int i2 = b0.a;
        this.a = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: f.h.b.b.g2.e
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, str);
            }
        });
    }

    public static c a(boolean z, long j2) {
        return new c(z ? 1 : 0, j2, null);
    }

    public boolean b() {
        return this.b != null;
    }

    public <T extends e> long c(T t, b<T> bVar, int i2) {
        Looper myLooper = Looper.myLooper();
        j.i(myLooper);
        this.c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d(myLooper, t, bVar, i2, elapsedRealtime).b(0L);
        return elapsedRealtime;
    }
}
