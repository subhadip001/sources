package g.a.v0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: SerializeReentrantCallsDirectExecutor.java */
/* loaded from: classes2.dex */
public class j2 implements Executor {

    /* renamed from: h  reason: collision with root package name */
    public static final Logger f7819h = Logger.getLogger(j2.class.getName());

    /* renamed from: f  reason: collision with root package name */
    public boolean f7820f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayDeque<Runnable> f7821g;

    public final void a() {
        while (true) {
            Runnable poll = this.f7821g.poll();
            if (poll == null) {
                return;
            }
            try {
                poll.run();
            } catch (Throwable th) {
                Logger logger = f7819h;
                Level level = Level.SEVERE;
                logger.log(level, "Exception while executing runnable " + poll, th);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r6.f7821g == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void execute(java.lang.Runnable r7) {
        /*
            r6 = this;
            java.lang.String r0 = "'task' must not be null."
            f.h.b.c.a.x(r7, r0)
            boolean r0 = r6.f7820f
            if (r0 != 0) goto L43
            r0 = 1
            r6.f7820f = r0
            r0 = 0
            r7.run()     // Catch: java.lang.Throwable -> L1a
            java.util.ArrayDeque<java.lang.Runnable> r7 = r6.f7821g
            if (r7 == 0) goto L17
        L14:
            r6.a()
        L17:
            r6.f7820f = r0
            goto L54
        L1a:
            r1 = move-exception
            java.util.logging.Logger r2 = g.a.v0.j2.f7819h     // Catch: java.lang.Throwable -> L38
            java.util.logging.Level r3 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r4.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r5 = "Exception while executing runnable "
            r4.append(r5)     // Catch: java.lang.Throwable -> L38
            r4.append(r7)     // Catch: java.lang.Throwable -> L38
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L38
            r2.log(r3, r7, r1)     // Catch: java.lang.Throwable -> L38
            java.util.ArrayDeque<java.lang.Runnable> r7 = r6.f7821g
            if (r7 == 0) goto L17
            goto L14
        L38:
            r7 = move-exception
            java.util.ArrayDeque<java.lang.Runnable> r1 = r6.f7821g
            if (r1 == 0) goto L40
            r6.a()
        L40:
            r6.f7820f = r0
            throw r7
        L43:
            java.util.ArrayDeque<java.lang.Runnable> r0 = r6.f7821g
            if (r0 != 0) goto L4f
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 4
            r0.<init>(r1)
            r6.f7821g = r0
        L4f:
            java.util.ArrayDeque<java.lang.Runnable> r0 = r6.f7821g
            r0.add(r7)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.v0.j2.execute(java.lang.Runnable):void");
    }
}
