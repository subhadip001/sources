package j.a.x1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import f.n.a.n.i;
import i.e;
import java.util.Objects;

/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes2.dex */
public final class c {
    private static volatile Choreographer choreographer;

    static {
        Object p;
        try {
            p = new a(a(Looper.getMainLooper(), true), null, false);
        } catch (Throwable th) {
            p = i.p(th);
        }
        b bVar = (b) (p instanceof e.a ? null : p);
    }

    public static final Handler a(Looper looper, boolean z) {
        if (z) {
            if (Build.VERSION.SDK_INT >= 28) {
                Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
                Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
                return (Handler) invoke;
            }
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }
}
