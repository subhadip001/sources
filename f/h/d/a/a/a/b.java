package f.h.d.a.a.a;

import com.google.protobuf.GeneratedMessageLite;
import f.h.h.u0;
import java.util.Objects;

/* compiled from: ClientSignalsProto.java */
/* loaded from: classes.dex */
public final class b extends GeneratedMessageLite<b, a> implements Object {
    public static final int APP_VERSION_FIELD_NUMBER = 1;
    private static final b DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
    private static volatile u0<b> PARSER = null;
    public static final int PLATFORM_VERSION_FIELD_NUMBER = 2;
    public static final int TIME_ZONE_FIELD_NUMBER = 4;
    private String appVersion_ = "";
    private String platformVersion_ = "";
    private String languageCode_ = "";
    private String timeZone_ = "";

    /* compiled from: ClientSignalsProto.java */
    /* loaded from: classes.dex */
    public static final class a extends GeneratedMessageLite.a<b, a> implements Object {
        public a() {
            super(b.DEFAULT_INSTANCE);
        }

        public a(f.h.d.a.a.a.a aVar) {
            super(b.DEFAULT_INSTANCE);
        }
    }

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        GeneratedMessageLite.registerDefaultInstance(b.class, bVar);
    }

    public static void b(b bVar, String str) {
        Objects.requireNonNull(bVar);
        str.getClass();
        bVar.appVersion_ = str;
    }

    public static void c(b bVar, String str) {
        Objects.requireNonNull(bVar);
        str.getClass();
        bVar.timeZone_ = str;
    }

    public static void d(b bVar, String str) {
        Objects.requireNonNull(bVar);
        str.getClass();
        bVar.platformVersion_ = str;
    }

    public static void e(b bVar, String str) {
        Objects.requireNonNull(bVar);
        str.getClass();
        bVar.languageCode_ = str;
    }

    public static a f() {
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"appVersion_", "platformVersion_", "languageCode_", "timeZone_"});
            case 3:
                return new b();
            case 4:
                return new a(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u0<b> u0Var = PARSER;
                if (u0Var == null) {
                    synchronized (b.class) {
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
