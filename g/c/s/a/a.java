package g.c.s.a;

import android.os.Handler;
import android.os.Looper;
import g.c.o;
import g.c.w.j.d;

/* compiled from: AndroidSchedulers.java */
/* loaded from: classes2.dex */
public final class a {
    public static final o a;

    /* compiled from: AndroidSchedulers.java */
    /* renamed from: g.c.s.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0204a {
        public static final o a = new b(new Handler(Looper.getMainLooper()));
    }

    static {
        try {
            o oVar = C0204a.a;
            if (oVar != null) {
                a = oVar;
                return;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw d.d(th);
        }
    }
}
