package f.h.h;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.ProtoSyntax;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: Protobuf.java */
/* loaded from: classes2.dex */
public final class w0 {
    public static final w0 c = new w0();
    public final ConcurrentMap<Class<?>, a1<?>> b = new ConcurrentHashMap();
    public final b1 a = new f0();

    public <T> a1<T> a(Class<T> cls) {
        a1 B;
        a1 q0Var;
        Class<?> cls2;
        Charset charset = y.a;
        Objects.requireNonNull(cls, "messageType");
        a1<T> a1Var = (a1<T>) this.b.get(cls);
        if (a1Var == null) {
            f0 f0Var = (f0) this.a;
            Objects.requireNonNull(f0Var);
            Class<?> cls3 = c1.a;
            if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = c1.a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            }
            l0 a = f0Var.a.a(cls);
            if (a.a()) {
                if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    g1<?, ?> g1Var = c1.f6326d;
                    r<?> rVar = t.a;
                    q0Var = new q0(g1Var, t.a, a.b());
                } else {
                    g1<?, ?> g1Var2 = c1.b;
                    r<?> rVar2 = t.b;
                    if (rVar2 != null) {
                        q0Var = new q0(g1Var2, rVar2, a.b());
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
                B = q0Var;
            } else {
                if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    if (a.c() == ProtoSyntax.PROTO2) {
                        r0 r0Var = t0.b;
                        d0 d0Var = d0.b;
                        g1<?, ?> g1Var3 = c1.f6326d;
                        r<?> rVar3 = t.a;
                        B = p0.B(a, r0Var, d0Var, g1Var3, t.a, k0.b);
                    } else {
                        B = p0.B(a, t0.b, d0.b, c1.f6326d, null, k0.b);
                    }
                } else {
                    if (a.c() == ProtoSyntax.PROTO2) {
                        r0 r0Var2 = t0.a;
                        d0 d0Var2 = d0.a;
                        g1<?, ?> g1Var4 = c1.b;
                        r<?> rVar4 = t.b;
                        if (rVar4 != null) {
                            B = p0.B(a, r0Var2, d0Var2, g1Var4, rVar4, k0.a);
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    } else {
                        B = p0.B(a, t0.a, d0.a, c1.c, null, k0.a);
                    }
                }
            }
            a1<T> a1Var2 = (a1<T>) this.b.putIfAbsent(cls, B);
            return a1Var2 != null ? a1Var2 : B;
        }
        return a1Var;
    }

    public <T> a1<T> b(T t) {
        return a(t.getClass());
    }
}
