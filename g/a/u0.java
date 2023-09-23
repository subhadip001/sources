package g.a;

import g.a.m;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ThreadLocalContextStorage.java */
/* loaded from: classes2.dex */
public final class u0 extends m.b {
    public static final Logger a = Logger.getLogger(u0.class.getName());
    public static final ThreadLocal<m> b = new ThreadLocal<>();

    @Override // g.a.m.b
    public m a() {
        m mVar = b.get();
        return mVar == null ? m.b : mVar;
    }

    @Override // g.a.m.b
    public void b(m mVar, m mVar2) {
        if (a() != mVar) {
            a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (mVar2 != m.b) {
            b.set(mVar2);
        } else {
            b.set(null);
        }
    }

    @Override // g.a.m.b
    public m c(m mVar) {
        m a2 = a();
        b.set(mVar);
        return a2;
    }
}
