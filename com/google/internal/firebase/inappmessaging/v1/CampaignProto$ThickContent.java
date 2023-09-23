package com.google.internal.firebase.inappmessaging.v1;

import com.google.firebase.inappmessaging.CommonTypesProto;
import com.google.firebase.inappmessaging.MessagesProto;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat$FieldType;
import f.h.g.a.a.a.c;
import f.h.h.g0;
import f.h.h.h0;
import f.h.h.u0;
import f.h.h.y;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class CampaignProto$ThickContent extends GeneratedMessageLite<CampaignProto$ThickContent, a> implements Object {
    public static final int CONTENT_FIELD_NUMBER = 3;
    public static final int DATA_BUNDLE_FIELD_NUMBER = 8;
    private static final CampaignProto$ThickContent DEFAULT_INSTANCE;
    public static final int EXPERIMENTAL_PAYLOAD_FIELD_NUMBER = 2;
    public static final int IS_TEST_CAMPAIGN_FIELD_NUMBER = 7;
    private static volatile u0<CampaignProto$ThickContent> PARSER = null;
    public static final int PRIORITY_FIELD_NUMBER = 4;
    public static final int TRIGGERING_CONDITIONS_FIELD_NUMBER = 5;
    public static final int VANILLA_PAYLOAD_FIELD_NUMBER = 1;
    private MessagesProto.Content content_;
    private boolean isTestCampaign_;
    private Object payload_;
    private CommonTypesProto.Priority priority_;
    private int payloadCase_ = 0;
    private h0<String, String> dataBundle_ = h0.f6358g;
    private y.i<CommonTypesProto.TriggeringCondition> triggeringConditions_ = GeneratedMessageLite.emptyProtobufList();

    /* loaded from: classes2.dex */
    public enum PayloadCase {
        VANILLA_PAYLOAD(1),
        EXPERIMENTAL_PAYLOAD(2),
        PAYLOAD_NOT_SET(0);
        
        private final int value;

        PayloadCase(int i2) {
            this.value = i2;
        }

        public static PayloadCase forNumber(int i2) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        return null;
                    }
                    return EXPERIMENTAL_PAYLOAD;
                }
                return VANILLA_PAYLOAD;
            }
            return PAYLOAD_NOT_SET;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PayloadCase valueOf(int i2) {
            return forNumber(i2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.a<CampaignProto$ThickContent, a> implements Object {
        public a(f.h.g.a.a.a.a aVar) {
            super(CampaignProto$ThickContent.DEFAULT_INSTANCE);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public static final g0<String, String> a;

        static {
            WireFormat$FieldType wireFormat$FieldType = WireFormat$FieldType.STRING;
            a = new g0<>(wireFormat$FieldType, "", wireFormat$FieldType, "");
        }
    }

    static {
        CampaignProto$ThickContent campaignProto$ThickContent = new CampaignProto$ThickContent();
        DEFAULT_INSTANCE = campaignProto$ThickContent;
        GeneratedMessageLite.registerDefaultInstance(CampaignProto$ThickContent.class, campaignProto$ThickContent);
    }

    public Map<String, String> b() {
        return Collections.unmodifiableMap(this.dataBundle_);
    }

    public f.h.g.a.a.a.b c() {
        if (this.payloadCase_ == 2) {
            return (f.h.g.a.a.a.b) this.payload_;
        }
        return f.h.g.a.a.a.b.e();
    }

    public boolean d() {
        return this.isTestCampaign_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\b\u0007\u0001\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003\t\u0004\t\u0005\u001b\u0007\u0007\b2", new Object[]{"payload_", "payloadCase_", c.class, f.h.g.a.a.a.b.class, "content_", "priority_", "triggeringConditions_", CommonTypesProto.TriggeringCondition.class, "isTestCampaign_", "dataBundle_", b.a});
            case 3:
                return new CampaignProto$ThickContent();
            case 4:
                return new a(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u0<CampaignProto$ThickContent> u0Var = PARSER;
                if (u0Var == null) {
                    synchronized (CampaignProto$ThickContent.class) {
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

    public PayloadCase e() {
        return PayloadCase.forNumber(this.payloadCase_);
    }

    public CommonTypesProto.Priority f() {
        CommonTypesProto.Priority priority = this.priority_;
        return priority == null ? CommonTypesProto.Priority.getDefaultInstance() : priority;
    }

    public List<CommonTypesProto.TriggeringCondition> g() {
        return this.triggeringConditions_;
    }

    public MessagesProto.Content getContent() {
        MessagesProto.Content content = this.content_;
        return content == null ? MessagesProto.Content.getDefaultInstance() : content;
    }

    public c h() {
        if (this.payloadCase_ == 1) {
            return (c) this.payload_;
        }
        return c.e();
    }
}
