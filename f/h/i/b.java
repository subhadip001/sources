package f.h.i;

import com.google.protobuf.GeneratedMessageLite;
import f.h.h.u0;

/* compiled from: TimeOfDay.java */
/* loaded from: classes2.dex */
public final class b extends GeneratedMessageLite<b, C0151b> implements Object {
    private static final b DEFAULT_INSTANCE;
    public static final int HOURS_FIELD_NUMBER = 1;
    public static final int MINUTES_FIELD_NUMBER = 2;
    public static final int NANOS_FIELD_NUMBER = 4;
    private static volatile u0<b> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 3;
    private int hours_;
    private int minutes_;
    private int nanos_;
    private int seconds_;

    /* compiled from: TimeOfDay.java */
    /* renamed from: f.h.i.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0151b extends GeneratedMessageLite.a<b, C0151b> implements Object {
        public C0151b() {
            super(b.DEFAULT_INSTANCE);
        }

        public C0151b(a aVar) {
            super(b.DEFAULT_INSTANCE);
        }
    }

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        GeneratedMessageLite.registerDefaultInstance(b.class, bVar);
    }

    public static b b() {
        return DEFAULT_INSTANCE;
    }

    public static C0151b c(b bVar) {
        return DEFAULT_INSTANCE.createBuilder(bVar);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"hours_", "minutes_", "seconds_", "nanos_"});
            case 3:
                return new b();
            case 4:
                return new C0151b(null);
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
