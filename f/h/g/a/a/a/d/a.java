package f.h.g.a.a.a.d;

import com.google.protobuf.GeneratedMessageLite;
import f.h.h.u0;
import java.util.Objects;

/* compiled from: CampaignImpression.java */
/* loaded from: classes2.dex */
public final class a extends GeneratedMessageLite<a, b> implements Object {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    private static final a DEFAULT_INSTANCE;
    public static final int IMPRESSION_TIMESTAMP_MILLIS_FIELD_NUMBER = 2;
    private static volatile u0<a> PARSER;
    private String campaignId_ = "";
    private long impressionTimestampMillis_;

    /* compiled from: CampaignImpression.java */
    /* loaded from: classes2.dex */
    public static final class b extends GeneratedMessageLite.a<a, b> implements Object {
        public b() {
            super(a.DEFAULT_INSTANCE);
        }

        public b(C0146a c0146a) {
            super(a.DEFAULT_INSTANCE);
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        GeneratedMessageLite.registerDefaultInstance(a.class, aVar);
    }

    public static void b(a aVar, String str) {
        Objects.requireNonNull(aVar);
        str.getClass();
        aVar.campaignId_ = str;
    }

    public static void c(a aVar, long j2) {
        aVar.impressionTimestampMillis_ = j2;
    }

    public static b d() {
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"campaignId_", "impressionTimestampMillis_"});
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

    public String getCampaignId() {
        return this.campaignId_;
    }
}
