package k.c0.k;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* compiled from: JdkWithJettyBootPlatform.java */
/* loaded from: classes2.dex */
public class d extends f {
    public final Method c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f9086d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f9087e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f9088f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f9089g;

    /* compiled from: JdkWithJettyBootPlatform.java */
    /* loaded from: classes2.dex */
    public static class a implements InvocationHandler {
        public final List<String> a;
        public boolean b;
        public String c;

        public a(List<String> list) {
            this.a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = k.c0.c.b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (this.a.contains(list.get(i2))) {
                            String str = (String) list.get(i2);
                            this.c = str;
                            return str;
                        }
                    }
                    String str2 = this.a.get(0);
                    this.c = str2;
                    return str2;
                } else if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
                    this.c = (String) objArr[0];
                    return null;
                } else {
                    return method.invoke(this, objArr);
                }
            }
        }
    }

    public d(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.c = method;
        this.f9086d = method2;
        this.f9087e = method3;
        this.f9088f = cls;
        this.f9089g = cls2;
    }

    @Override // k.c0.k.f
    public void a(SSLSocket sSLSocket) {
        try {
            this.f9087e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw k.c0.c.a("unable to remove alpn", e2);
        }
    }

    @Override // k.c0.k.f
    public void e(SSLSocket sSLSocket, String str, List<Protocol> list) {
        try {
            this.c.invoke(null, sSLSocket, Proxy.newProxyInstance(f.class.getClassLoader(), new Class[]{this.f9088f, this.f9089g}, new a(f.b(list))));
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw k.c0.c.a("unable to set alpn", e2);
        }
    }

    @Override // k.c0.k.f
    public String h(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f9086d.invoke(null, sSLSocket));
            boolean z = aVar.b;
            if (!z && aVar.c == null) {
                f.a.k(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            } else if (z) {
                return null;
            } else {
                return aVar.c;
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw k.c0.c.a("unable to get selected protocol", e2);
        }
    }
}
