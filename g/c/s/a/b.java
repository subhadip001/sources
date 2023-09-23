package g.c.s.a;

import android.os.Handler;
import android.os.Message;
import f.n.a.n.i;
import g.c.o;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: HandlerScheduler.java */
/* loaded from: classes2.dex */
public final class b extends o {
    public final Handler a;

    /* compiled from: HandlerScheduler.java */
    /* loaded from: classes2.dex */
    public static final class a extends o.b {

        /* renamed from: f  reason: collision with root package name */
        public final Handler f8132f;

        /* renamed from: g  reason: collision with root package name */
        public volatile boolean f8133g;

        public a(Handler handler) {
            this.f8132f = handler;
        }

        @Override // g.c.o.b
        public g.c.t.b c(Runnable runnable, long j2, TimeUnit timeUnit) {
            Objects.requireNonNull(runnable, "run == null");
            Objects.requireNonNull(timeUnit, "unit == null");
            if (this.f8133g) {
                return EmptyDisposable.INSTANCE;
            }
            Handler handler = this.f8132f;
            RunnableC0205b runnableC0205b = new RunnableC0205b(handler, runnable);
            Message obtain = Message.obtain(handler, runnableC0205b);
            obtain.obj = this;
            this.f8132f.sendMessageDelayed(obtain, timeUnit.toMillis(j2));
            if (this.f8133g) {
                this.f8132f.removeCallbacks(runnableC0205b);
                return EmptyDisposable.INSTANCE;
            }
            return runnableC0205b;
        }

        @Override // g.c.t.b
        public void dispose() {
            this.f8133g = true;
            this.f8132f.removeCallbacksAndMessages(this);
        }
    }

    /* compiled from: HandlerScheduler.java */
    /* renamed from: g.c.s.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class RunnableC0205b implements Runnable, g.c.t.b {

        /* renamed from: f  reason: collision with root package name */
        public final Handler f8134f;

        /* renamed from: g  reason: collision with root package name */
        public final Runnable f8135g;

        /* renamed from: h  reason: collision with root package name */
        public volatile boolean f8136h;

        public RunnableC0205b(Handler handler, Runnable runnable) {
            this.f8134f = handler;
            this.f8135g = runnable;
        }

        @Override // g.c.t.b
        public void dispose() {
            this.f8136h = true;
            this.f8134f.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f8135g.run();
            } catch (Throwable th) {
                i.L(th);
            }
        }
    }

    public b(Handler handler) {
        this.a = handler;
    }

    @Override // g.c.o
    public o.b a() {
        return new a(this.a);
    }

    @Override // g.c.o
    public g.c.t.b c(Runnable runnable, long j2, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run == null");
        Objects.requireNonNull(timeUnit, "unit == null");
        Handler handler = this.a;
        RunnableC0205b runnableC0205b = new RunnableC0205b(handler, runnable);
        handler.postDelayed(runnableC0205b, timeUnit.toMillis(j2));
        return runnableC0205b;
    }
}
