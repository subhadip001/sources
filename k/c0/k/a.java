package k.c0.k;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;

/* compiled from: AndroidPlatform.java */
/* loaded from: classes2.dex */
public class a extends f {
    public final e<Socket> c;

    /* renamed from: d  reason: collision with root package name */
    public final e<Socket> f9081d;

    /* renamed from: e  reason: collision with root package name */
    public final e<Socket> f9082e;

    /* renamed from: f  reason: collision with root package name */
    public final e<Socket> f9083f;

    /* renamed from: g  reason: collision with root package name */
    public final c f9084g;

    /* compiled from: AndroidPlatform.java */
    /* renamed from: k.c0.k.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0235a extends k.c0.l.c {
        public final Object a;
        public final Method b;

        public C0235a(Object obj, Method method) {
            this.a = obj;
            this.b = method;
        }

        @Override // k.c0.l.c
        public List<Certificate> a(List<Certificate> list, String str) {
            try {
                return (List) this.b.invoke(this.a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e3.getMessage());
                sSLPeerUnverifiedException.initCause(e3);
                throw sSLPeerUnverifiedException;
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof C0235a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* compiled from: AndroidPlatform.java */
    /* loaded from: classes2.dex */
    public static final class b implements k.c0.l.e {
        public final X509TrustManager a;
        public final Method b;

        public b(X509TrustManager x509TrustManager, Method method) {
            this.b = method;
            this.a = x509TrustManager;
        }

        @Override // k.c0.l.e
        public X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.b.invoke(this.a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e2) {
                throw k.c0.c.a("unable to get issues and signature", e2);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.a.equals(bVar.a) && this.b.equals(bVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.a.hashCode();
        }
    }

    /* compiled from: AndroidPlatform.java */
    /* loaded from: classes2.dex */
    public static final class c {
        public final Method a;
        public final Method b;
        public final Method c;

        public c(Method method, Method method2, Method method3) {
            this.a = method;
            this.b = method2;
            this.c = method3;
        }
    }

    public a(Class<?> cls, e<Socket> eVar, e<Socket> eVar2, e<Socket> eVar3, e<Socket> eVar4) {
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", new Class[0]);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f9084g = new c(method3, method2, method);
        this.c = eVar;
        this.f9081d = eVar2;
        this.f9082e = eVar3;
        this.f9083f = eVar4;
    }

    @Override // k.c0.k.f
    public k.c0.l.c c(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C0235a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return new k.c0.l.a(d(x509TrustManager));
        }
    }

    @Override // k.c0.k.f
    public k.c0.l.e d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return new k.c0.l.b(x509TrustManager.getAcceptedIssuers());
        }
    }

    @Override // k.c0.k.f
    public void e(SSLSocket sSLSocket, String str, List<Protocol> list) {
        if (str != null) {
            this.c.c(sSLSocket, Boolean.TRUE);
            this.f9081d.c(sSLSocket, str);
        }
        e<Socket> eVar = this.f9083f;
        if (eVar != null) {
            if (eVar.a(sSLSocket.getClass()) != null) {
                Object[] objArr = new Object[1];
                l.f fVar = new l.f();
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Protocol protocol = list.get(i2);
                    if (protocol != Protocol.HTTP_1_0) {
                        fVar.m0(protocol.toString().length());
                        fVar.u0(protocol.toString());
                    }
                }
                objArr[0] = fVar.v();
                this.f9083f.d(sSLSocket, objArr);
            }
        }
    }

    @Override // k.c0.k.f
    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        try {
            socket.connect(inetSocketAddress, i2);
        } catch (AssertionError e2) {
            if (!k.c0.c.r(e2)) {
                throw e2;
            }
            throw new IOException(e2);
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e3);
                throw iOException;
            }
            throw e3;
        } catch (SecurityException e4) {
            IOException iOException2 = new IOException("Exception in connect");
            iOException2.initCause(e4);
            throw iOException2;
        }
    }

    @Override // k.c0.k.f
    public String h(SSLSocket sSLSocket) {
        byte[] bArr;
        e<Socket> eVar = this.f9082e;
        if (eVar == null) {
            return null;
        }
        if ((eVar.a(sSLSocket.getClass()) != null) && (bArr = (byte[]) this.f9082e.d(sSLSocket, new Object[0])) != null) {
            return new String(bArr, k.c0.c.f8879d);
        }
        return null;
    }

    @Override // k.c0.k.f
    public Object i(String str) {
        c cVar = this.f9084g;
        Method method = cVar.a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                cVar.b.invoke(invoke, str);
                return invoke;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    @Override // k.c0.k.f
    public boolean j(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return m(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException e2) {
            e = e2;
            throw k.c0.c.a("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e3) {
            e = e3;
            throw k.c0.c.a("unable to determine cleartext support", e);
        } catch (InvocationTargetException e4) {
            e = e4;
            throw k.c0.c.a("unable to determine cleartext support", e);
        }
    }

    @Override // k.c0.k.f
    public void k(int i2, String str, Throwable th) {
        int min;
        int i3 = i2 != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int i4 = 0;
        int length = str.length();
        while (i4 < length) {
            int indexOf = str.indexOf(10, i4);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i4 + 4000);
                Log.println(i3, "OkHttp", str.substring(i4, min));
                if (min >= indexOf) {
                    break;
                }
                i4 = min;
            }
            i4 = min + 1;
        }
    }

    @Override // k.c0.k.f
    public void l(String str, Object obj) {
        c cVar = this.f9084g;
        Objects.requireNonNull(cVar);
        boolean z = false;
        if (obj != null) {
            try {
                cVar.c.invoke(obj, new Object[0]);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (z) {
            return;
        }
        k(5, str, null);
    }

    public final boolean m(String str, Class<?> cls, Object obj) {
        try {
            try {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
            } catch (NoSuchMethodException unused) {
                return true;
            }
        } catch (NoSuchMethodException unused2) {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        }
    }
}
