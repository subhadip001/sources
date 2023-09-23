package g.a.w0.p;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLSocket;

/* compiled from: Platform.java */
/* loaded from: classes2.dex */
public class g implements PrivilegedExceptionAction<Method> {
    @Override // java.security.PrivilegedExceptionAction
    public Method run() {
        return SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
    }
}
