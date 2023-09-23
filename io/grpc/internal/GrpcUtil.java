package io.grpc.internal;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import f.h.c.a.b;
import f.h.c.a.n;
import f.h.c.a.o;
import f.h.c.a.p;
import g.a.b;
import g.a.c0;
import g.a.h;
import g.a.i0;
import g.a.p0;
import g.a.v0.c2;
import g.a.v0.l0;
import g.a.v0.n2;
import g.a.v0.v;
import g.a.v0.w;
import g.a.v0.w2;
import g.a.y;
import g.a.z;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.internal.ClientStreamListener;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class GrpcUtil {
    public static final Logger a = Logger.getLogger(GrpcUtil.class.getName());
    public static final i0.f<Long> b;
    public static final i0.f<String> c;

    /* renamed from: d  reason: collision with root package name */
    public static final i0.f<byte[]> f8699d;

    /* renamed from: e  reason: collision with root package name */
    public static final i0.f<String> f8700e;

    /* renamed from: f  reason: collision with root package name */
    public static final i0.f<byte[]> f8701f;

    /* renamed from: g  reason: collision with root package name */
    public static final i0.f<String> f8702g;

    /* renamed from: h  reason: collision with root package name */
    public static final i0.f<String> f8703h;

    /* renamed from: i  reason: collision with root package name */
    public static final i0.f<String> f8704i;

    /* renamed from: j  reason: collision with root package name */
    public static final long f8705j;

    /* renamed from: k  reason: collision with root package name */
    public static final p0 f8706k;

    /* renamed from: l  reason: collision with root package name */
    public static final b.a<Boolean> f8707l;

    /* renamed from: m  reason: collision with root package name */
    public static final n2.c<Executor> f8708m;
    public static final n2.c<ScheduledExecutorService> n;
    public static final p<o> o;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum NO_ERROR uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes2.dex */
    public static final class Http2Error {
        private static final /* synthetic */ Http2Error[] $VALUES;
        public static final Http2Error CANCEL;
        public static final Http2Error COMPRESSION_ERROR;
        public static final Http2Error CONNECT_ERROR;
        public static final Http2Error ENHANCE_YOUR_CALM;
        public static final Http2Error FLOW_CONTROL_ERROR;
        public static final Http2Error FRAME_SIZE_ERROR;
        public static final Http2Error HTTP_1_1_REQUIRED;
        public static final Http2Error INADEQUATE_SECURITY;
        public static final Http2Error INTERNAL_ERROR;
        public static final Http2Error NO_ERROR;
        public static final Http2Error PROTOCOL_ERROR;
        public static final Http2Error REFUSED_STREAM;
        public static final Http2Error SETTINGS_TIMEOUT;
        public static final Http2Error STREAM_CLOSED;
        private static final Http2Error[] codeMap;
        private final int code;
        private final Status status;

        static {
            Status status = Status.n;
            Http2Error http2Error = new Http2Error("NO_ERROR", 0, 0, status);
            NO_ERROR = http2Error;
            Status status2 = Status.f8692m;
            Http2Error http2Error2 = new Http2Error("PROTOCOL_ERROR", 1, 1, status2);
            PROTOCOL_ERROR = http2Error2;
            Http2Error http2Error3 = new Http2Error("INTERNAL_ERROR", 2, 2, status2);
            INTERNAL_ERROR = http2Error3;
            Http2Error http2Error4 = new Http2Error("FLOW_CONTROL_ERROR", 3, 3, status2);
            FLOW_CONTROL_ERROR = http2Error4;
            Http2Error http2Error5 = new Http2Error("SETTINGS_TIMEOUT", 4, 4, status2);
            SETTINGS_TIMEOUT = http2Error5;
            Http2Error http2Error6 = new Http2Error("STREAM_CLOSED", 5, 5, status2);
            STREAM_CLOSED = http2Error6;
            Http2Error http2Error7 = new Http2Error("FRAME_SIZE_ERROR", 6, 6, status2);
            FRAME_SIZE_ERROR = http2Error7;
            Http2Error http2Error8 = new Http2Error("REFUSED_STREAM", 7, 7, status);
            REFUSED_STREAM = http2Error8;
            Http2Error http2Error9 = new Http2Error("CANCEL", 8, 8, Status.f8686g);
            CANCEL = http2Error9;
            Http2Error http2Error10 = new Http2Error("COMPRESSION_ERROR", 9, 9, status2);
            COMPRESSION_ERROR = http2Error10;
            Http2Error http2Error11 = new Http2Error("CONNECT_ERROR", 10, 10, status2);
            CONNECT_ERROR = http2Error11;
            Http2Error http2Error12 = new Http2Error("ENHANCE_YOUR_CALM", 11, 11, Status.f8691l.h("Bandwidth exhausted"));
            ENHANCE_YOUR_CALM = http2Error12;
            Http2Error http2Error13 = new Http2Error("INADEQUATE_SECURITY", 12, 12, Status.f8689j.h("Permission denied as protocol is not secure enough to call"));
            INADEQUATE_SECURITY = http2Error13;
            Http2Error http2Error14 = new Http2Error("HTTP_1_1_REQUIRED", 13, 13, Status.f8687h);
            HTTP_1_1_REQUIRED = http2Error14;
            $VALUES = new Http2Error[]{http2Error, http2Error2, http2Error3, http2Error4, http2Error5, http2Error6, http2Error7, http2Error8, http2Error9, http2Error10, http2Error11, http2Error12, http2Error13, http2Error14};
            Http2Error[] values = values();
            Http2Error[] http2ErrorArr = new Http2Error[((int) values[13].code()) + 1];
            for (Http2Error http2Error15 : values) {
                http2ErrorArr[(int) http2Error15.code()] = http2Error15;
            }
            codeMap = http2ErrorArr;
        }

        public Http2Error(String str, int i2, int i3, Status status) {
            this.code = i3;
            StringBuilder A = f.a.b.a.a.A("HTTP/2 error code: ");
            A.append(name());
            this.status = status.b(A.toString());
        }

        public static Http2Error forCode(long j2) {
            Http2Error[] http2ErrorArr = codeMap;
            if (j2 >= http2ErrorArr.length || j2 < 0) {
                return null;
            }
            return http2ErrorArr[(int) j2];
        }

        public static Status statusForCode(long j2) {
            Http2Error forCode = forCode(j2);
            if (forCode == null) {
                Status d2 = Status.d(INTERNAL_ERROR.status().a.value());
                return d2.h("Unrecognized HTTP/2 error code: " + j2);
            }
            return forCode.status();
        }

        public static Http2Error valueOf(String str) {
            return (Http2Error) Enum.valueOf(Http2Error.class, str);
        }

        public static Http2Error[] values() {
            return (Http2Error[]) $VALUES.clone();
        }

        public long code() {
            return this.code;
        }

        public Status status() {
            return this.status;
        }
    }

    /* loaded from: classes2.dex */
    public class a implements p0 {
    }

    /* loaded from: classes2.dex */
    public class b implements n2.c<Executor> {
        @Override // g.a.v0.n2.c
        public Executor a() {
            return Executors.newCachedThreadPool(GrpcUtil.d("grpc-default-executor-%d", true));
        }

        @Override // g.a.v0.n2.c
        public void b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        public String toString() {
            return "grpc-default-executor";
        }
    }

    /* loaded from: classes2.dex */
    public class c implements n2.c<ScheduledExecutorService> {
        @Override // g.a.v0.n2.c
        public ScheduledExecutorService a() {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, GrpcUtil.d("grpc-timer-%d", true));
            try {
                newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(newScheduledThreadPool, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception e3) {
                throw new RuntimeException(e3);
            }
            return Executors.unconfigurableScheduledExecutorService(newScheduledThreadPool);
        }

        @Override // g.a.v0.n2.c
        public void b(ScheduledExecutorService scheduledExecutorService) {
            scheduledExecutorService.shutdown();
        }
    }

    /* loaded from: classes2.dex */
    public class d implements p<o> {
        @Override // f.h.c.a.p
        public o get() {
            return new o();
        }
    }

    /* loaded from: classes2.dex */
    public class e implements w {
        public final /* synthetic */ w a;
        public final /* synthetic */ h.a b;

        public e(w wVar, h.a aVar) {
            this.a = wVar;
            this.b = aVar;
        }

        @Override // g.a.x
        public y e() {
            return this.a.e();
        }

        @Override // g.a.v0.w
        public v g(MethodDescriptor<?, ?> methodDescriptor, i0 i0Var, g.a.b bVar) {
            return this.a.g(methodDescriptor, i0Var, bVar.f(this.b));
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements z.a<byte[]> {
        public f(a aVar) {
        }

        @Override // g.a.i0.i
        public byte[] a(Object obj) {
            return (byte[]) obj;
        }

        @Override // g.a.i0.i
        public Object b(byte[] bArr) {
            return bArr;
        }
    }

    /* loaded from: classes2.dex */
    public static class g implements i0.d<Long> {
        @Override // g.a.i0.d
        public String a(Long l2) {
            Long l3 = l2;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (l3.longValue() >= 0) {
                if (l3.longValue() < 100000000) {
                    return l3 + GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION;
                } else if (l3.longValue() < 100000000000L) {
                    return timeUnit.toMicros(l3.longValue()) + "u";
                } else if (l3.longValue() < 100000000000000L) {
                    return timeUnit.toMillis(l3.longValue()) + "m";
                } else if (l3.longValue() < 100000000000000000L) {
                    return timeUnit.toSeconds(l3.longValue()) + "S";
                } else if (l3.longValue() < 6000000000000000000L) {
                    return timeUnit.toMinutes(l3.longValue()) + "M";
                } else {
                    return timeUnit.toHours(l3.longValue()) + "H";
                }
            }
            throw new IllegalArgumentException("Timeout too small");
        }

        @Override // g.a.i0.d
        public Long b(String str) {
            f.h.b.c.a.m(str.length() > 0, "empty timeout");
            f.h.b.c.a.m(str.length() <= 9, "bad timeout format");
            long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
            char charAt = str.charAt(str.length() - 1);
            if (charAt != 'H') {
                if (charAt != 'M') {
                    if (charAt != 'S') {
                        if (charAt != 'u') {
                            if (charAt != 'm') {
                                if (charAt == 'n') {
                                    return Long.valueOf(parseLong);
                                }
                                throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(charAt)));
                            }
                            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(parseLong));
                        }
                        return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(parseLong));
                    }
                    return Long.valueOf(TimeUnit.SECONDS.toNanos(parseLong));
                }
                return Long.valueOf(TimeUnit.MINUTES.toNanos(parseLong));
            }
            return Long.valueOf(TimeUnit.HOURS.toNanos(parseLong));
        }
    }

    static {
        Charset.forName("US-ASCII");
        b = i0.f.a("grpc-timeout", new g());
        i0.d<String> dVar = i0.f7537d;
        c = i0.f.a("grpc-encoding", dVar);
        f8699d = z.a("grpc-accept-encoding", new f(null));
        f8700e = i0.f.a("content-encoding", dVar);
        f8701f = z.a("accept-encoding", new f(null));
        f8702g = i0.f.a("content-type", dVar);
        f8703h = i0.f.a("te", dVar);
        f8704i = i0.f.a("user-agent", dVar);
        n.a(',');
        Objects.requireNonNull(b.f.c);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f8705j = timeUnit.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        timeUnit.toNanos(20L);
        f8706k = new c2();
        f8707l = b.a.a("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        f8708m = new b();
        n = new c();
        o = new d();
    }

    public static URI a(String str) {
        f.h.b.c.a.x(str, "authority");
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e2) {
            throw new IllegalArgumentException(f.a.b.a.a.p("Invalid authority: ", str), e2);
        }
    }

    public static void b(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e2) {
            a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e2);
        }
    }

    public static String c(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static ThreadFactory d(String str, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        String.format(Locale.ROOT, str, 0);
        return new f.h.c.g.a.d(Executors.defaultThreadFactory(), str, new AtomicLong(0L), valueOf, null, null);
    }

    public static w e(c0.e eVar, boolean z) {
        c0.h hVar = eVar.a;
        w a2 = hVar != null ? ((w2) hVar.c()).a() : null;
        if (a2 != null) {
            h.a aVar = eVar.b;
            return aVar == null ? a2 : new e(a2, aVar);
        }
        if (!eVar.c.f()) {
            if (eVar.f7534d) {
                return new l0(eVar.c, ClientStreamListener.RpcProgress.DROPPED);
            }
            if (!z) {
                return new l0(eVar.c, ClientStreamListener.RpcProgress.PROCESSED);
            }
        }
        return null;
    }

    public static Status f(int i2) {
        Status.Code code;
        if (i2 >= 100 && i2 < 200) {
            code = Status.Code.INTERNAL;
        } else {
            if (i2 != 400) {
                if (i2 == 401) {
                    code = Status.Code.UNAUTHENTICATED;
                } else if (i2 == 403) {
                    code = Status.Code.PERMISSION_DENIED;
                } else if (i2 != 404) {
                    if (i2 != 429) {
                        if (i2 != 431) {
                            switch (i2) {
                                case 502:
                                case 503:
                                case 504:
                                    break;
                                default:
                                    code = Status.Code.UNKNOWN;
                                    break;
                            }
                        }
                    }
                    code = Status.Code.UNAVAILABLE;
                } else {
                    code = Status.Code.UNIMPLEMENTED;
                }
            }
            code = Status.Code.INTERNAL;
        }
        Status status = code.toStatus();
        return status.h("HTTP status code " + i2);
    }
}
