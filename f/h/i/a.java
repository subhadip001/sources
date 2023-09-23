package f.h.i;

import com.google.protobuf.GeneratedMessageLite;
import f.h.h.u0;

/* compiled from: Date.java */
/* loaded from: classes2.dex */
public final class a extends GeneratedMessageLite<a, b> implements Object {
    public static final int DAY_FIELD_NUMBER = 3;
    private static final a DEFAULT_INSTANCE;
    public static final int MONTH_FIELD_NUMBER = 2;
    private static volatile u0<a> PARSER = null;
    public static final int YEAR_FIELD_NUMBER = 1;
    private int day_;
    private int month_;
    private int year_;

    /* compiled from: Date.java */
    /* loaded from: classes2.dex */
    public static final class b extends GeneratedMessageLite.a<a, b> implements Object {
        public b() {
            super(a.DEFAULT_INSTANCE);
        }

        public b(C0150a c0150a) {
            super(a.DEFAULT_INSTANCE);
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        GeneratedMessageLite.registerDefaultInstance(a.class, aVar);
    }

    public static a b() {
        return DEFAULT_INSTANCE;
    }

    public static b c(a aVar) {
        return DEFAULT_INSTANCE.createBuilder(aVar);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"year_", "month_", "day_"});
            case 3:
                return new a();
            case 4:
                return new b(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u0<a> u0Var = PARSER;
                if (u0Var == null) {
                    synchronized (a.class) {
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
