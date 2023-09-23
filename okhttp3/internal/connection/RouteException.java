package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class RouteException extends RuntimeException {

    /* renamed from: g  reason: collision with root package name */
    public static final Method f9331g;

    /* renamed from: f  reason: collision with root package name */
    public IOException f9332f;

    static {
        Method method;
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            method = null;
        }
        f9331g = method;
    }

    public RouteException(IOException iOException) {
        super(iOException);
        this.f9332f = iOException;
    }
}
