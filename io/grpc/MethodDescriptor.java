package io.grpc;

import androidx.core.app.NotificationCompat;
import f.h.c.a.i;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class MethodDescriptor<ReqT, RespT> {
    public final MethodType a;
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final b<ReqT> f8677d;

    /* renamed from: e  reason: collision with root package name */
    public final b<RespT> f8678e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f8679f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f8680g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f8681h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f8682i;

    /* loaded from: classes2.dex */
    public enum MethodType {
        UNARY,
        CLIENT_STREAMING,
        SERVER_STREAMING,
        BIDI_STREAMING,
        UNKNOWN;

        public final boolean clientSendsOneMessage() {
            return this == UNARY || this == SERVER_STREAMING;
        }

        public final boolean serverSendsOneMessage() {
            return this == UNARY || this == CLIENT_STREAMING;
        }
    }

    /* loaded from: classes2.dex */
    public interface b<T> {
        T a(InputStream inputStream);

        InputStream b(T t);
    }

    public MethodDescriptor(MethodType methodType, String str, b bVar, b bVar2, Object obj, boolean z, boolean z2, boolean z3, a aVar) {
        new AtomicReferenceArray(2);
        f.h.b.c.a.x(methodType, NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE);
        this.a = methodType;
        f.h.b.c.a.x(str, "fullMethodName");
        this.b = str;
        f.h.b.c.a.x(str, "fullMethodName");
        int lastIndexOf = str.lastIndexOf(47);
        this.c = lastIndexOf == -1 ? null : str.substring(0, lastIndexOf);
        f.h.b.c.a.x(bVar, "requestMarshaller");
        this.f8677d = bVar;
        f.h.b.c.a.x(bVar2, "responseMarshaller");
        this.f8678e = bVar2;
        this.f8679f = null;
        this.f8680g = z;
        this.f8681h = z2;
        this.f8682i = z3;
    }

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        f.h.b.c.a.x(str, "fullServiceName");
        sb.append(str);
        sb.append("/");
        f.h.b.c.a.x(str2, "methodName");
        sb.append(str2);
        return sb.toString();
    }

    public InputStream b(ReqT reqt) {
        return this.f8677d.b(reqt);
    }

    public String toString() {
        i c1 = f.h.b.c.a.c1(this);
        c1.c("fullMethodName", this.b);
        c1.c(NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE, this.a);
        c1.d("idempotent", this.f8680g);
        c1.d("safe", this.f8681h);
        c1.d("sampledToLocalTracing", this.f8682i);
        c1.c("requestMarshaller", this.f8677d);
        c1.c("responseMarshaller", this.f8678e);
        c1.c("schemaDescriptor", this.f8679f);
        c1.f5843d = true;
        return c1.toString();
    }
}
