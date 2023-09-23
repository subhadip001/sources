package f.h.g.a.a.a;

import com.google.protobuf.GeneratedMessageLite;
import f.h.h.u0;

/* compiled from: CampaignProto.java */
/* loaded from: classes2.dex */
public final class c extends GeneratedMessageLite<c, a> implements Object {
    public static final int CAMPAIGN_END_TIME_MILLIS_FIELD_NUMBER = 4;
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    public static final int CAMPAIGN_NAME_FIELD_NUMBER = 5;
    public static final int CAMPAIGN_START_TIME_MILLIS_FIELD_NUMBER = 3;
    private static final c DEFAULT_INSTANCE;
    public static final int EXPERIMENTAL_CAMPAIGN_ID_FIELD_NUMBER = 2;
    private static volatile u0<c> PARSER;
    private long campaignEndTimeMillis_;
    private long campaignStartTimeMillis_;
    private String campaignId_ = "";
    private String experimentalCampaignId_ = "";
    private String campaignName_ = "";

    /* compiled from: CampaignProto.java */
    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.a<c, a> implements Object {
        public a(f.h.g.a.a.a.a aVar) {
            super(c.DEFAULT_INSTANCE);
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        GeneratedMessageLite.registerDefaultInstance(c.class, cVar);
    }

    public static c e() {
        return DEFAULT_INSTANCE;
    }

    public long b() {
        return this.campaignEndTimeMillis_;
    }

    public String c() {
        return this.campaignName_;
    }

    public long d() {
        return this.campaignStartTimeMillis_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0002\u0005Ȉ", new Object[]{"campaignId_", "experimentalCampaignId_", "campaignStartTimeMillis_", "campaignEndTimeMillis_", "campaignName_"});
            case 3:
                return new c();
            case 4:
                return new a(null);
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

    public String getCampaignId() {
        return this.campaignId_;
    }
}
