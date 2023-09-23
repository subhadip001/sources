package io.grpc.okhttp.internal;

import com.google.android.gms.security.ProviderInstaller;
import g.a.w0.p.e;
import g.a.w0.p.f;
import g.a.w0.p.g;
import g.a.w0.p.h;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes2.dex */
public class Platform {
    public static final Logger b = Logger.getLogger(Platform.class.getName());
    public static final String[] c = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* renamed from: d  reason: collision with root package name */
    public static final Platform f8709d;
    public final Provider a;

    /* loaded from: classes2.dex */
    public enum TlsExtensionType {
        ALPN_AND_NPN,
        NPN,
        NONE
    }

    /* loaded from: classes2.dex */
    public static class a extends Platform {

        /* renamed from: e  reason: collision with root package name */
        public final g.a.w0.p.d<Socket> f8710e;

        /* renamed from: f  reason: collision with root package name */
        public final g.a.w0.p.d<Socket> f8711f;

        /* renamed from: g  reason: collision with root package name */
        public final g.a.w0.p.d<Socket> f8712g;

        /* renamed from: h  reason: collision with root package name */
        public final g.a.w0.p.d<Socket> f8713h;

        /* renamed from: i  reason: collision with root package name */
        public final TlsExtensionType f8714i;

        public a(g.a.w0.p.d<Socket> dVar, g.a.w0.p.d<Socket> dVar2, Method method, Method method2, g.a.w0.p.d<Socket> dVar3, g.a.w0.p.d<Socket> dVar4, Provider provider, TlsExtensionType tlsExtensionType) {
            super(provider);
            this.f8710e = dVar;
            this.f8711f = dVar2;
            this.f8712g = dVar3;
            this.f8713h = dVar4;
            this.f8714i = tlsExtensionType;
        }

        @Override // io.grpc.okhttp.internal.Platform
        public void c(SSLSocket sSLSocket, String str, List<Protocol> list) {
            if (str != null) {
                this.f8710e.d(sSLSocket, Boolean.TRUE);
                this.f8711f.d(sSLSocket, str);
            }
            g.a.w0.p.d<Socket> dVar = this.f8713h;
            Objects.requireNonNull(dVar);
            if (dVar.a(sSLSocket.getClass()) != null) {
                this.f8713h.e(sSLSocket, Platform.b(list));
            }
        }

        @Override // io.grpc.okhttp.internal.Platform
        public String d(SSLSocket sSLSocket) {
            byte[] bArr;
            g.a.w0.p.d<Socket> dVar = this.f8712g;
            Objects.requireNonNull(dVar);
            if ((dVar.a(sSLSocket.getClass()) != null) && (bArr = (byte[]) this.f8712g.e(sSLSocket, new Object[0])) != null) {
                return new String(bArr, h.b);
            }
            return null;
        }

        @Override // io.grpc.okhttp.internal.Platform
        public TlsExtensionType e() {
            return this.f8714i;
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends Platform {

        /* renamed from: e  reason: collision with root package name */
        public final Method f8715e;

        /* renamed from: f  reason: collision with root package name */
        public final Method f8716f;

        public b(Provider provider, Method method, Method method2, e eVar) {
            super(provider);
            this.f8715e = method;
            this.f8716f = method2;
        }

        @Override // io.grpc.okhttp.internal.Platform
        public void c(SSLSocket sSLSocket, String str, List<Protocol> list) {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            for (Protocol protocol : list) {
                if (protocol != Protocol.HTTP_1_0) {
                    arrayList.add(protocol.toString());
                }
            }
            try {
                this.f8715e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
                sSLSocket.setSSLParameters(sSLParameters);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        }

        @Override // io.grpc.okhttp.internal.Platform
        public String d(SSLSocket sSLSocket) {
            try {
                return (String) this.f8716f.invoke(sSLSocket, new Object[0]);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        }

        @Override // io.grpc.okhttp.internal.Platform
        public TlsExtensionType e() {
            return TlsExtensionType.ALPN_AND_NPN;
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends Platform {

        /* renamed from: e  reason: collision with root package name */
        public final Method f8717e;

        /* renamed from: f  reason: collision with root package name */
        public final Method f8718f;

        /* renamed from: g  reason: collision with root package name */
        public final Method f8719g;

        /* renamed from: h  reason: collision with root package name */
        public final Class<?> f8720h;

        /* renamed from: i  reason: collision with root package name */
        public final Class<?> f8721i;

        public c(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2, Provider provider) {
            super(provider);
            this.f8717e = method;
            this.f8718f = method2;
            this.f8719g = method3;
            this.f8720h = cls;
            this.f8721i = cls2;
        }

        @Override // io.grpc.okhttp.internal.Platform
        public void a(SSLSocket sSLSocket) {
            try {
                this.f8719g.invoke(null, sSLSocket);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e2) {
                Platform.b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e2);
            }
        }

        @Override // io.grpc.okhttp.internal.Platform
        public void c(SSLSocket sSLSocket, String str, List<Protocol> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Protocol protocol = list.get(i2);
                if (protocol != Protocol.HTTP_1_0) {
                    arrayList.add(protocol.toString());
                }
            }
            try {
                this.f8717e.invoke(null, sSLSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.f8720h, this.f8721i}, new d(arrayList)));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }

        @Override // io.grpc.okhttp.internal.Platform
        public String d(SSLSocket sSLSocket) {
            try {
                d dVar = (d) Proxy.getInvocationHandler(this.f8718f.invoke(null, sSLSocket));
                boolean z = dVar.b;
                if (!z && dVar.c == null) {
                    Platform.b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                } else if (z) {
                    return null;
                } else {
                    return dVar.c;
                }
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                throw new AssertionError();
            }
        }

        @Override // io.grpc.okhttp.internal.Platform
        public TlsExtensionType e() {
            return TlsExtensionType.ALPN_AND_NPN;
        }
    }

    /* loaded from: classes2.dex */
    public static class d implements InvocationHandler {
        public final List<String> a;
        public boolean b;
        public String c;

        public d(List<String> list) {
            this.a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = h.a;
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

    static {
        Method method;
        Provider provider;
        Platform platform;
        Platform platform2;
        Method method2;
        Method method3;
        TlsExtensionType tlsExtensionType;
        boolean z;
        String[] strArr;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        boolean z2 = false;
        int i2 = 0;
        loop0: while (true) {
            method = null;
            if (i2 < length) {
                Provider provider2 = providers[i2];
                for (String str : c) {
                    if (str.equals(provider2.getClass().getName())) {
                        b.log(Level.FINE, "Found registered provider {0}", str);
                        provider = provider2;
                        break loop0;
                    }
                }
                i2++;
            } else {
                b.log(Level.WARNING, "Unable to find Conscrypt");
                provider = null;
                break;
            }
        }
        if (provider != null) {
            g.a.w0.p.d dVar = new g.a.w0.p.d(null, "setUseSessionTickets", Boolean.TYPE);
            g.a.w0.p.d dVar2 = new g.a.w0.p.d(null, "setHostname", String.class);
            g.a.w0.p.d dVar3 = new g.a.w0.p.d(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            g.a.w0.p.d dVar4 = new g.a.w0.p.d(null, "setAlpnProtocols", byte[].class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                Method method4 = cls.getMethod("tagSocket", Socket.class);
                try {
                    method = cls.getMethod("untagSocket", Socket.class);
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                }
                method2 = method4;
                method3 = method;
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                method2 = null;
                method3 = null;
            }
            if (!provider.getName().equals(ProviderInstaller.PROVIDER_NAME) && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
                try {
                    Platform.class.getClassLoader().loadClass("android.net.Network");
                    z = true;
                } catch (ClassNotFoundException e2) {
                    b.log(Level.FINE, "Can't find class", (Throwable) e2);
                    z = false;
                }
                if (z) {
                    tlsExtensionType = TlsExtensionType.ALPN_AND_NPN;
                } else {
                    try {
                        Platform.class.getClassLoader().loadClass("android.app.ActivityOptions");
                        z2 = true;
                    } catch (ClassNotFoundException e3) {
                        b.log(Level.FINE, "Can't find class", (Throwable) e3);
                    }
                    if (z2) {
                        tlsExtensionType = TlsExtensionType.NPN;
                    } else {
                        tlsExtensionType = TlsExtensionType.NONE;
                    }
                }
            } else {
                tlsExtensionType = TlsExtensionType.ALPN_AND_NPN;
            }
            platform2 = new a(dVar, dVar2, method2, method3, dVar3, dVar4, provider, tlsExtensionType);
        } else {
            try {
                Provider provider3 = SSLContext.getDefault().getProvider();
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLS", provider3);
                    sSLContext.init(null, null, null);
                    ((Method) AccessController.doPrivileged(new e())).invoke(sSLContext.createSSLEngine(), new Object[0]);
                    platform2 = new b(provider3, (Method) AccessController.doPrivileged(new f()), (Method) AccessController.doPrivileged(new g()), null);
                } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused3) {
                    try {
                        Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        platform = new c(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider3);
                    } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                        platform = new Platform(provider3);
                    }
                    platform2 = platform;
                }
            } catch (NoSuchAlgorithmException e4) {
                throw new RuntimeException(e4);
            }
        }
        f8709d = platform2;
    }

    public Platform(Provider provider) {
        this.a = provider;
    }

    public static byte[] b(List<Protocol> list) {
        l.f fVar = new l.f();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Protocol protocol = list.get(i2);
            if (protocol != Protocol.HTTP_1_0) {
                fVar.m0(protocol.toString().length());
                fVar.u0(protocol.toString());
            }
        }
        return fVar.v();
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List<Protocol> list) {
    }

    public String d(SSLSocket sSLSocket) {
        return null;
    }

    public TlsExtensionType e() {
        return TlsExtensionType.NONE;
    }
}
