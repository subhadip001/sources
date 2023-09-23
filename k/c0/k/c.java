package k.c0.k;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* compiled from: Jdk9Platform.java */
/* loaded from: classes2.dex */
public final class c extends f {
    public final Method c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f9085d;

    public c(Method method, Method method2) {
        this.c = method;
        this.f9085d = method2;
    }

    @Override // k.c0.k.f
    public void e(SSLSocket sSLSocket, String str, List<Protocol> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = (ArrayList) f.b(list);
            this.c.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw k.c0.c.a("unable to set ssl parameters", e2);
        }
    }

    @Override // k.c0.k.f
    public String h(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f9085d.invoke(sSLSocket, new Object[0]);
            if (str != null) {
                if (str.equals("")) {
                    return null;
                }
                return str;
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw k.c0.c.a("unable to get selected protocols", e2);
        }
    }
}
