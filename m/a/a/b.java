package m.a.a;

import java.util.logging.Level;

/* compiled from: BackgroundPoster.java */
/* loaded from: classes2.dex */
public final class b implements Runnable, k {

    /* renamed from: f  reason: collision with root package name */
    public final j f9269f = new j();

    /* renamed from: g  reason: collision with root package name */
    public final c f9270g;

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f9271h;

    public b(c cVar) {
        this.f9270g = cVar;
    }

    @Override // m.a.a.k
    public void a(p pVar, Object obj) {
        i a = i.a(pVar, obj);
        synchronized (this) {
            this.f9269f.a(a);
            if (!this.f9271h) {
                this.f9271h = true;
                this.f9270g.f9278j.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        i b;
        while (true) {
            try {
                j jVar = this.f9269f;
                synchronized (jVar) {
                    if (jVar.a == null) {
                        jVar.wait(1000);
                    }
                    b = jVar.b();
                }
                if (b == null) {
                    synchronized (this) {
                        b = this.f9269f.b();
                        if (b == null) {
                            return;
                        }
                    }
                }
                this.f9270g.c(b);
            } catch (InterruptedException e2) {
                f fVar = this.f9270g.p;
                Level level = Level.WARNING;
                fVar.b(level, Thread.currentThread().getName() + " was interruppted", e2);
                return;
            } finally {
                this.f9271h = false;
            }
        }
    }
}
