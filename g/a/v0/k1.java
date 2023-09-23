package g.a.v0;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: LogExceptionRunnable.java */
/* loaded from: classes2.dex */
public final class k1 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    public static final Logger f7824g = Logger.getLogger(k1.class.getName());

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f7825f;

    public k1(Runnable runnable) {
        f.h.b.c.a.x(runnable, "task");
        this.f7825f = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f7825f.run();
        } catch (Throwable th) {
            Logger logger = f7824g;
            Level level = Level.SEVERE;
            StringBuilder A = f.a.b.a.a.A("Exception while executing runnable ");
            A.append(this.f7825f);
            logger.log(level, A.toString(), th);
            f.h.c.a.q.b(th);
            throw new AssertionError(th);
        }
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("LogExceptionRunnable(");
        A.append(this.f7825f);
        A.append(")");
        return A.toString();
    }
}
