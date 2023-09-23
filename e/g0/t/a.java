package e.g0.t;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* compiled from: DefaultRunnableScheduler.java */
/* loaded from: classes.dex */
public class a {
    public final Handler a;

    public a() {
        Handler handler;
        Handler handler2;
        Looper mainLooper = Looper.getMainLooper();
        if (Build.VERSION.SDK_INT >= 28) {
            handler2 = Handler.createAsync(mainLooper);
        } else {
            try {
                handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
            } catch (IllegalAccessException e2) {
                e = e2;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
                handler2 = handler;
                this.a = handler2;
            } catch (InstantiationException e3) {
                e = e3;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
                handler2 = handler;
                this.a = handler2;
            } catch (NoSuchMethodException e4) {
                e = e4;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
                handler2 = handler;
                this.a = handler2;
            } catch (InvocationTargetException e5) {
                Throwable cause = e5.getCause();
                if (!(cause instanceof RuntimeException)) {
                    if (cause instanceof Error) {
                        throw ((Error) cause);
                    }
                    throw new RuntimeException(cause);
                }
                throw ((RuntimeException) cause);
            }
            handler2 = handler;
        }
        this.a = handler2;
    }
}
