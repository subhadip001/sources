package f.h.g.a.a.a.d;

import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import com.google.protobuf.GeneratedMessageLite;
import f.h.h.u0;
import f.h.h.y;
import java.util.List;

/* compiled from: FetchEligibleCampaignsResponse.java */
/* loaded from: classes2.dex */
public final class e extends GeneratedMessageLite<e, b> implements Object {
    private static final e DEFAULT_INSTANCE;
    public static final int EXPIRATION_EPOCH_TIMESTAMP_MILLIS_FIELD_NUMBER = 2;
    public static final int MESSAGES_FIELD_NUMBER = 1;
    private static volatile u0<e> PARSER;
    private long expirationEpochTimestampMillis_;
    private y.i<CampaignProto$ThickContent> messages_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: FetchEligibleCampaignsResponse.java */
    /* loaded from: classes2.dex */
    public static final class b extends GeneratedMessageLite.a<e, b> implements Object {
        public b() {
            super(e.DEFAULT_INSTANCE);
        }

        public b(a aVar) {
            super(e.DEFAULT_INSTANCE);
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        GeneratedMessageLite.registerDefaultInstance(e.class, eVar);
    }

    public static void b(e eVar, long j2) {
        eVar.expirationEpochTimestampMillis_ = j2;
    }

    public static e c() {
        return DEFAULT_INSTANCE;
    }

    public static b f() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static u0<e> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public long d() {
        return this.expirationEpochTimestampMillis_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"messages_", CampaignProto$ThickContent.class, "expirationEpochTimestampMillis_"});
            case 3:
                return new e();
            case 4:
                return new b(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u0<e> u0Var = PARSER;
                if (u0Var == null) {
                    synchronized (e.class) {
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

    public List<CampaignProto$ThickContent> e() {
        return this.messages_;
    }
}
