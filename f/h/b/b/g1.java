package f.h.b.b;

import android.os.Looper;
import android.util.Log;
import java.util.concurrent.TimeoutException;

/* compiled from: PlayerMessage.java */
/* loaded from: classes.dex */
public final class g1 {
    public final b a;
    public final a b;
    public final f.h.b.b.g2.f c;

    /* renamed from: d  reason: collision with root package name */
    public final q1 f4256d;

    /* renamed from: e  reason: collision with root package name */
    public int f4257e;

    /* renamed from: f  reason: collision with root package name */
    public Object f4258f;

    /* renamed from: g  reason: collision with root package name */
    public Looper f4259g;

    /* renamed from: h  reason: collision with root package name */
    public int f4260h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4261i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4262j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4263k;

    /* compiled from: PlayerMessage.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: PlayerMessage.java */
    /* loaded from: classes.dex */
    public interface b {
        void r(int i2, Object obj);
    }

    public g1(a aVar, b bVar, q1 q1Var, int i2, f.h.b.b.g2.f fVar, Looper looper) {
        this.b = aVar;
        this.a = bVar;
        this.f4256d = q1Var;
        this.f4259g = looper;
        this.c = fVar;
        this.f4260h = i2;
    }

    public synchronized boolean a(long j2) {
        boolean z;
        f.h.b.b.e2.j.g(this.f4261i);
        f.h.b.b.e2.j.g(this.f4259g.getThread() != Thread.currentThread());
        long elapsedRealtime = this.c.elapsedRealtime() + j2;
        while (true) {
            z = this.f4263k;
            if (z || j2 <= 0) {
                break;
            }
            wait(j2);
            j2 = elapsedRealtime - this.c.elapsedRealtime();
        }
        if (!z) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.f4262j;
    }

    public synchronized boolean b() {
        return false;
    }

    public synchronized void c(boolean z) {
        this.f4262j = z | this.f4262j;
        this.f4263k = true;
        notifyAll();
    }

    public g1 d() {
        f.h.b.b.e2.j.g(!this.f4261i);
        f.h.b.b.e2.j.c(true);
        this.f4261i = true;
        q0 q0Var = (q0) this.b;
        synchronized (q0Var) {
            if (!q0Var.D && q0Var.f4452m.isAlive()) {
                q0Var.f4451l.c(14, this).sendToTarget();
            }
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            c(false);
        }
        return this;
    }
}
