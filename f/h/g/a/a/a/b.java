package f.h.g.a.a.a;

import com.google.firebase.inappmessaging.ExperimentPayloadProto;
import com.google.protobuf.GeneratedMessageLite;
import f.h.h.u0;

/* compiled from: CampaignProto.java */
/* loaded from: classes2.dex */
public final class b extends GeneratedMessageLite<b, a> implements Object {
    public static final int CAMPAIGN_END_TIME_MILLIS_FIELD_NUMBER = 4;
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    public static final int CAMPAIGN_NAME_FIELD_NUMBER = 5;
    public static final int CAMPAIGN_START_TIME_MILLIS_FIELD_NUMBER = 3;
    private static final b DEFAULT_INSTANCE;
    public static final int EXPERIMENT_PAYLOAD_FIELD_NUMBER = 2;
    private static volatile u0<b> PARSER;
    private long campaignEndTimeMillis_;
    private String campaignId_ = "";
    private String campaignName_ = "";
    private long campaignStartTimeMillis_;
    private ExperimentPayloadProto.ExperimentPayload experimentPayload_;

    /* compiled from: CampaignProto.java */
    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.a<b, a> implements Object {
        public a(f.h.g.a.a.a.a aVar) {
            super(b.DEFAULT_INSTANCE);
        }
    }

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        GeneratedMessageLite.registerDefaultInstance(b.class, bVar);
    }

    public static b e() {
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\u0002\u0004\u0002\u0005Ȉ", new Object[]{"campaignId_", "experimentPayload_", "campaignStartTimeMillis_", "campaignEndTimeMillis_", "campaignName_"});
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

    public ExperimentPayloadProto.ExperimentPayload f() {
        ExperimentPayloadProto.ExperimentPayload experimentPayload = this.experimentPayload_;
        return experimentPayload == null ? ExperimentPayloadProto.ExperimentPayload.getDefaultInstance() : experimentPayload;
    }

    public String getCampaignId() {
        return this.campaignId_;
    }
}
