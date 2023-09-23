package g.a.w0.p;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLEngine;

/* compiled from: Platform.java */
/* loaded from: classes2.dex */
public class e implements PrivilegedExceptionAction<Method> {
    @Override // java.security.PrivilegedExceptionAction
    public Method run() {
        return SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]);
    }
}
