package g.a.w0;

import io.grpc.internal.GrpcUtil;
import io.grpc.okhttp.internal.Platform;
import io.grpc.okhttp.internal.Protocol;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.net.URI;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* compiled from: OkHttpProtocolNegotiator.java */
/* loaded from: classes2.dex */
public class i {
    public static final Logger b = Logger.getLogger(i.class.getName());
    public static final Platform c = Platform.f8709d;

    /* renamed from: d  reason: collision with root package name */
    public static i f8057d;
    public final Platform a;

    /* compiled from: OkHttpProtocolNegotiator.java */
    /* loaded from: classes2.dex */
    public static final class a extends i {

        /* renamed from: e  reason: collision with root package name */
        public static final g.a.w0.p.d<Socket> f8058e;

        /* renamed from: f  reason: collision with root package name */
        public static final g.a.w0.p.d<Socket> f8059f;

        /* renamed from: g  reason: collision with root package name */
        public static final g.a.w0.p.d<Socket> f8060g;

        /* renamed from: h  reason: collision with root package name */
        public static final g.a.w0.p.d<Socket> f8061h;

        /* renamed from: i  reason: collision with root package name */
        public static final g.a.w0.p.d<Socket> f8062i;

        /* renamed from: j  reason: collision with root package name */
        public static final g.a.w0.p.d<Socket> f8063j;

        /* renamed from: k  reason: collision with root package name */
        public static final Method f8064k;

        /* renamed from: l  reason: collision with root package name */
        public static final Method f8065l;

        /* renamed from: m  reason: collision with root package name */
        public static final Method f8066m;
        public static final Method n;
        public static final Method o;
        public static final Method p;
        public static final Constructor<?> q;

        /* JADX WARN: Can't wrap try/catch for region: R(14:1|2|3|5|6|(3:7|8|(5:9|10|11|12|13))|14|15|16|18|19|20|21|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00f0, code lost:
            r2 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00f2, code lost:
            r2 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00f4, code lost:
            r2 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00f5, code lost:
            r1 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00f6, code lost:
            g.a.w0.i.b.log(java.util.logging.Level.FINER, "Failed to find Android 7.0+ APIs", (java.lang.Throwable) r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00fe, code lost:
            r2 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00ff, code lost:
            r1 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0100, code lost:
            g.a.w0.i.b.log(java.util.logging.Level.FINER, "Failed to find Android 7.0+ APIs", (java.lang.Throwable) r2);
         */
        static {
            /*
                Method dump skipped, instructions count: 268
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: g.a.w0.i.a.<clinit>():void");
        }

        public a(Platform platform) {
            super(platform);
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00f3  */
        @Override // g.a.w0.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(javax.net.ssl.SSLSocket r9, java.lang.String r10, java.util.List<io.grpc.okhttp.internal.Protocol> r11) {
            /*
                Method dump skipped, instructions count: 272
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: g.a.w0.i.a.a(javax.net.ssl.SSLSocket, java.lang.String, java.util.List):void");
        }

        @Override // g.a.w0.i
        public String b(SSLSocket sSLSocket) {
            Method method = o;
            if (method != null) {
                try {
                    return (String) method.invoke(sSLSocket, new Object[0]);
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e3) {
                    if (e3.getTargetException() instanceof UnsupportedOperationException) {
                        i.b.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                    } else {
                        throw new RuntimeException(e3);
                    }
                }
            }
            if (this.a.e() == Platform.TlsExtensionType.ALPN_AND_NPN) {
                try {
                    byte[] bArr = (byte[]) f8060g.e(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, g.a.w0.p.h.b);
                    }
                } catch (Exception e4) {
                    i.b.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e4);
                }
            }
            if (this.a.e() != Platform.TlsExtensionType.NONE) {
                try {
                    byte[] bArr2 = (byte[]) f8062i.e(sSLSocket, new Object[0]);
                    if (bArr2 != null) {
                        return new String(bArr2, g.a.w0.p.h.b);
                    }
                    return null;
                } catch (Exception e5) {
                    i.b.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e5);
                    return null;
                }
            }
            return null;
        }

        @Override // g.a.w0.i
        public String d(SSLSocket sSLSocket, String str, List<Protocol> list) {
            String b = b(sSLSocket);
            return b == null ? super.d(sSLSocket, str, list) : b;
        }
    }

    static {
        boolean z;
        i iVar;
        ClassLoader classLoader = i.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e2) {
            b.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e2);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e3) {
                b.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e3);
                z = false;
            }
        }
        z = true;
        if (z) {
            iVar = new a(c);
        } else {
            iVar = new i(c);
        }
        f8057d = iVar;
    }

    public i(Platform platform) {
        f.h.b.c.a.x(platform, "platform");
        this.a = platform;
    }

    public static boolean c(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            URI a2 = GrpcUtil.a(str);
            f.h.b.c.a.q(a2.getHost() != null, "No host in authority '%s'", str);
            f.h.b.c.a.q(a2.getUserInfo() == null, "Userinfo must not be present on authority: '%s'", str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void a(SSLSocket sSLSocket, String str, List<Protocol> list) {
        this.a.c(sSLSocket, str, list);
    }

    public String b(SSLSocket sSLSocket) {
        return this.a.d(sSLSocket);
    }

    public String d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        if (list != null) {
            a(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String b2 = b(sSLSocket);
            if (b2 != null) {
                return b2;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            this.a.a(sSLSocket);
        }
    }
}
