package g.a.w0.p;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLParameters;

/* compiled from: Platform.java */
/* loaded from: classes2.dex */
public class f implements PrivilegedExceptionAction<Method> {
    @Override // java.security.PrivilegedExceptionAction
    public Method run() {
        return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
    }
}
