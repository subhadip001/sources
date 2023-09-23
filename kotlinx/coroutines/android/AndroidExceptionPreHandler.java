package kotlinx.coroutines.android;

import android.os.Build;
import i.j.a;
import i.j.f;
import j.a.a0;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: AndroidExceptionPreHandler.kt */
/* loaded from: classes2.dex */
public final class AndroidExceptionPreHandler extends a implements a0 {
    private volatile Object _preHandler;

    public AndroidExceptionPreHandler() {
        super(a0.a.f8730f);
        this._preHandler = this;
    }

    private final Method preHandler() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            boolean z = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z = true;
                }
            }
            if (z) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // j.a.a0
    public void handleException(f fVar, Throwable th) {
        int i2 = Build.VERSION.SDK_INT;
        if (26 <= i2 && i2 < 28) {
            Method preHandler = preHandler();
            Object invoke = preHandler != null ? preHandler.invoke(null, new Object[0]) : null;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) invoke : null;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
