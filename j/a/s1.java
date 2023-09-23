package j.a;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes2.dex */
public final class s1 {
    public static final s1 a = null;
    public static final ThreadLocal<p0> b = new ThreadLocal<>();

    public static final p0 a() {
        ThreadLocal<p0> threadLocal = b;
        p0 p0Var = threadLocal.get();
        if (p0Var == null) {
            d dVar = new d(Thread.currentThread());
            threadLocal.set(dVar);
            return dVar;
        }
        return p0Var;
    }
}
