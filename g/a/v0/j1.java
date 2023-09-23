package g.a.v0;

import androidx.core.app.NotificationCompat;
import g.a.v0.w;
import io.grpc.Status;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: KeepAliveManager.java */
/* loaded from: classes2.dex */
public class j1 {
    public final ScheduledExecutorService a;
    public final f.h.c.a.o b;
    public final d c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f7802d;

    /* renamed from: e  reason: collision with root package name */
    public e f7803e;

    /* renamed from: f  reason: collision with root package name */
    public ScheduledFuture<?> f7804f;

    /* renamed from: g  reason: collision with root package name */
    public ScheduledFuture<?> f7805g;

    /* renamed from: h  reason: collision with root package name */
    public final Runnable f7806h;

    /* renamed from: i  reason: collision with root package name */
    public final Runnable f7807i;

    /* renamed from: j  reason: collision with root package name */
    public final long f7808j;

    /* renamed from: k  reason: collision with root package name */
    public final long f7809k;

    /* compiled from: KeepAliveManager.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j1 j1Var;
            boolean z;
            synchronized (j1.this) {
                j1Var = j1.this;
                e eVar = j1Var.f7803e;
                e eVar2 = e.DISCONNECTED;
                if (eVar != eVar2) {
                    j1Var.f7803e = eVar2;
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                j1Var.c.a();
            }
        }
    }

    /* compiled from: KeepAliveManager.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            synchronized (j1.this) {
                j1 j1Var = j1.this;
                j1Var.f7805g = null;
                e eVar = j1Var.f7803e;
                e eVar2 = e.PING_SCHEDULED;
                if (eVar == eVar2) {
                    z = true;
                    j1Var.f7803e = e.PING_SENT;
                    j1Var.f7804f = j1Var.a.schedule(j1Var.f7806h, j1Var.f7809k, TimeUnit.NANOSECONDS);
                } else {
                    if (eVar == e.PING_DELAYED) {
                        ScheduledExecutorService scheduledExecutorService = j1Var.a;
                        Runnable runnable = j1Var.f7807i;
                        long j2 = j1Var.f7808j;
                        f.h.c.a.o oVar = j1Var.b;
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        j1Var.f7805g = scheduledExecutorService.schedule(runnable, j2 - oVar.a(timeUnit), timeUnit);
                        j1.this.f7803e = eVar2;
                    }
                    z = false;
                }
            }
            if (z) {
                j1.this.c.b();
            }
        }
    }

    /* compiled from: KeepAliveManager.java */
    /* loaded from: classes2.dex */
    public static final class c implements d {
        public final z a;

        /* compiled from: KeepAliveManager.java */
        /* loaded from: classes2.dex */
        public class a implements w.a {
            public a() {
            }

            @Override // g.a.v0.w.a
            public void a(Throwable th) {
                c.this.a.c(Status.n.h("Keepalive failed. The connection is likely gone"));
            }

            @Override // g.a.v0.w.a
            public void b(long j2) {
            }
        }

        public c(z zVar) {
            this.a = zVar;
        }

        @Override // g.a.v0.j1.d
        public void a() {
            this.a.c(Status.n.h("Keepalive failed. The connection is likely gone"));
        }

        @Override // g.a.v0.j1.d
        public void b() {
            this.a.f(new a(), f.h.c.g.a.b.INSTANCE);
        }
    }

    /* compiled from: KeepAliveManager.java */
    /* loaded from: classes2.dex */
    public interface d {
        void a();

        void b();
    }

    /* compiled from: KeepAliveManager.java */
    /* loaded from: classes2.dex */
    public enum e {
        IDLE,
        PING_SCHEDULED,
        PING_DELAYED,
        PING_SENT,
        IDLE_AND_PING_SENT,
        DISCONNECTED
    }

    static {
        TimeUnit.SECONDS.toNanos(10L);
        TimeUnit.MILLISECONDS.toNanos(10L);
    }

    public j1(d dVar, ScheduledExecutorService scheduledExecutorService, long j2, long j3, boolean z) {
        f.h.c.a.o oVar = new f.h.c.a.o();
        this.f7803e = e.IDLE;
        this.f7806h = new k1(new a());
        this.f7807i = new k1(new b());
        f.h.b.c.a.x(dVar, "keepAlivePinger");
        this.c = dVar;
        f.h.b.c.a.x(scheduledExecutorService, "scheduler");
        this.a = scheduledExecutorService;
        f.h.b.c.a.x(oVar, NotificationCompat.CATEGORY_STOPWATCH);
        this.b = oVar;
        this.f7808j = j2;
        this.f7809k = j3;
        this.f7802d = z;
        oVar.b();
        oVar.c();
    }

    public synchronized void a() {
        e eVar = e.IDLE_AND_PING_SENT;
        synchronized (this) {
            f.h.c.a.o oVar = this.b;
            oVar.b();
            oVar.c();
            e eVar2 = this.f7803e;
            e eVar3 = e.PING_SCHEDULED;
            if (eVar2 == eVar3) {
                this.f7803e = e.PING_DELAYED;
            } else if (eVar2 == e.PING_SENT || eVar2 == eVar) {
                ScheduledFuture<?> scheduledFuture = this.f7804f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.f7803e == eVar) {
                    this.f7803e = e.IDLE;
                    return;
                }
                this.f7803e = eVar3;
                f.h.b.c.a.C(this.f7805g == null, "There should be no outstanding pingFuture");
                this.f7805g = this.a.schedule(this.f7807i, this.f7808j, TimeUnit.NANOSECONDS);
            }
        }
    }

    public synchronized void b() {
        e eVar = this.f7803e;
        if (eVar == e.IDLE) {
            this.f7803e = e.PING_SCHEDULED;
            if (this.f7805g == null) {
                ScheduledExecutorService scheduledExecutorService = this.a;
                Runnable runnable = this.f7807i;
                long j2 = this.f7808j;
                f.h.c.a.o oVar = this.b;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                this.f7805g = scheduledExecutorService.schedule(runnable, j2 - oVar.a(timeUnit), timeUnit);
            }
        } else if (eVar == e.IDLE_AND_PING_SENT) {
            this.f7803e = e.PING_SENT;
        }
    }
}
