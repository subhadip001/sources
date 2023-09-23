package f.h.g.a.a.a.d;

import com.google.protobuf.GeneratedMessageLite;
import f.h.h.u0;
import java.util.Objects;

/* compiled from: ClientAppInfo.java */
/* loaded from: classes2.dex */
public final class c extends GeneratedMessageLite<c, b> implements Object {
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int APP_INSTANCE_ID_TOKEN_FIELD_NUMBER = 3;
    private static final c DEFAULT_INSTANCE;
    public static final int GMP_APP_ID_FIELD_NUMBER = 1;
    private static volatile u0<c> PARSER;
    private String gmpAppId_ = "";
    private String appInstanceId_ = "";
    private String appInstanceIdToken_ = "";

    /* compiled from: ClientAppInfo.java */
    /* loaded from: classes2.dex */
    public static final class b extends GeneratedMessageLite.a<c, b> implements Object {
        public b() {
            super(c.DEFAULT_INSTANCE);
        }

        public b(a aVar) {
            super(c.DEFAULT_INSTANCE);
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        GeneratedMessageLite.registerDefaultInstance(c.class, cVar);
    }

    public static void b(c cVar, String str) {
        Objects.requireNonNull(cVar);
        str.getClass();
        cVar.gmpAppId_ = str;
    }

    public static void c(c cVar, String str) {
        Objects.requireNonNull(cVar);
        str.getClass();
        cVar.appInstanceId_ = str;
    }

    public static void d(c cVar, String str) {
        Objects.requireNonNull(cVar);
        str.getClass();
        cVar.appInstanceIdToken_ = str;
    }

    public static b e() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"gmpAppId_", "appInstanceId_", "appInstanceIdToken_"});
            case 3:
                return new c();
            case 4:
                return new b(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u0<c> u0Var = PARSER;
                if (u0Var == null) {
                    synchronized (c.class) {
                        u0Var = PARSER;
                        if (u0Var == null) {
                            u0Var = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                            PARSER = u0Var;
                        }
                    }
                }
                return u0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
