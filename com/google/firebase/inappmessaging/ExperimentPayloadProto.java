package com.google.firebase.inappmessaging;

import com.google.protobuf.GeneratedMessageLite;
import f.h.h.a;
import f.h.h.j;
import f.h.h.k;
import f.h.h.n0;
import f.h.h.o0;
import f.h.h.q;
import f.h.h.u0;
import f.h.h.y;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class ExperimentPayloadProto {

    /* renamed from: com.google.firebase.inappmessaging.ExperimentPayloadProto$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            GeneratedMessageLite.MethodToInvoke.values();
            int[] iArr = new int[7];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class ExperimentLite extends GeneratedMessageLite<ExperimentLite, Builder> implements ExperimentLiteOrBuilder {
        private static final ExperimentLite DEFAULT_INSTANCE;
        public static final int EXPERIMENT_ID_FIELD_NUMBER = 1;
        private static volatile u0<ExperimentLite> PARSER;
        private String experimentId_ = "";

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.a<ExperimentLite, Builder> implements ExperimentLiteOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearExperimentId() {
                copyOnWrite();
                ((ExperimentLite) this.instance).clearExperimentId();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentLiteOrBuilder
            public String getExperimentId() {
                return ((ExperimentLite) this.instance).getExperimentId();
            }

            @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentLiteOrBuilder
            public j getExperimentIdBytes() {
                return ((ExperimentLite) this.instance).getExperimentIdBytes();
            }

            public Builder setExperimentId(String str) {
                copyOnWrite();
                ((ExperimentLite) this.instance).setExperimentId(str);
                return this;
            }

            public Builder setExperimentIdBytes(j jVar) {
                copyOnWrite();
                ((ExperimentLite) this.instance).setExperimentIdBytes(jVar);
                return this;
            }

            private Builder() {
                super(ExperimentLite.DEFAULT_INSTANCE);
            }
        }

        static {
            ExperimentLite experimentLite = new ExperimentLite();
            DEFAULT_INSTANCE = experimentLite;
            GeneratedMessageLite.registerDefaultInstance(ExperimentLite.class, experimentLite);
        }

        private ExperimentLite() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExperimentId() {
            this.experimentId_ = getDefaultInstance().getExperimentId();
        }

        public static ExperimentLite getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ExperimentLite parseDelimitedFrom(InputStream inputStream) {
            return (ExperimentLite) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExperimentLite parseFrom(ByteBuffer byteBuffer) {
            return (ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static u0<ExperimentLite> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExperimentId(String str) {
            str.getClass();
            this.experimentId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExperimentIdBytes(j jVar) {
            a.checkByteStringIsUtf8(jVar);
            this.experimentId_ = jVar.n();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"experimentId_"});
                case 3:
                    return new ExperimentLite();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0<ExperimentLite> u0Var = PARSER;
                    if (u0Var == null) {
                        synchronized (ExperimentLite.class) {
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

        @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentLiteOrBuilder
        public String getExperimentId() {
            return this.experimentId_;
        }

        @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentLiteOrBuilder
        public j getExperimentIdBytes() {
            return j.d(this.experimentId_);
        }

        public static Builder newBuilder(ExperimentLite experimentLite) {
            return DEFAULT_INSTANCE.createBuilder(experimentLite);
        }

        public static ExperimentLite parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (ExperimentLite) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExperimentLite parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static ExperimentLite parseFrom(j jVar) {
            return (ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ExperimentLite parseFrom(j jVar, q qVar) {
            return (ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static ExperimentLite parseFrom(byte[] bArr) {
            return (ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExperimentLite parseFrom(byte[] bArr, q qVar) {
            return (ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static ExperimentLite parseFrom(InputStream inputStream) {
            return (ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExperimentLite parseFrom(InputStream inputStream, q qVar) {
            return (ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExperimentLite parseFrom(k kVar) {
            return (ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static ExperimentLite parseFrom(k kVar, q qVar) {
            return (ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, qVar);
        }
    }

    /* loaded from: classes2.dex */
    public interface ExperimentLiteOrBuilder extends o0 {
        @Override // f.h.h.o0
        /* synthetic */ n0 getDefaultInstanceForType();

        String getExperimentId();

        j getExperimentIdBytes();

        @Override // f.h.h.o0
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes2.dex */
    public static final class ExperimentPayload extends GeneratedMessageLite<ExperimentPayload, Builder> implements ExperimentPayloadOrBuilder {
        public static final int ACTIVATE_EVENT_TO_LOG_FIELD_NUMBER = 8;
        public static final int CLEAR_EVENT_TO_LOG_FIELD_NUMBER = 9;
        private static final ExperimentPayload DEFAULT_INSTANCE;
        public static final int EXPERIMENT_ID_FIELD_NUMBER = 1;
        public static final int EXPERIMENT_START_TIME_MILLIS_FIELD_NUMBER = 3;
        public static final int ONGOING_EXPERIMENTS_FIELD_NUMBER = 13;
        public static final int OVERFLOW_POLICY_FIELD_NUMBER = 12;
        private static volatile u0<ExperimentPayload> PARSER = null;
        public static final int SET_EVENT_TO_LOG_FIELD_NUMBER = 7;
        public static final int TIMEOUT_EVENT_TO_LOG_FIELD_NUMBER = 10;
        public static final int TIME_TO_LIVE_MILLIS_FIELD_NUMBER = 6;
        public static final int TRIGGER_EVENT_FIELD_NUMBER = 4;
        public static final int TRIGGER_TIMEOUT_MILLIS_FIELD_NUMBER = 5;
        public static final int TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER = 11;
        public static final int VARIANT_ID_FIELD_NUMBER = 2;
        private long experimentStartTimeMillis_;
        private int overflowPolicy_;
        private long timeToLiveMillis_;
        private long triggerTimeoutMillis_;
        private String experimentId_ = "";
        private String variantId_ = "";
        private String triggerEvent_ = "";
        private String setEventToLog_ = "";
        private String activateEventToLog_ = "";
        private String clearEventToLog_ = "";
        private String timeoutEventToLog_ = "";
        private String ttlExpiryEventToLog_ = "";
        private y.i<ExperimentLite> ongoingExperiments_ = GeneratedMessageLite.emptyProtobufList();

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.a<ExperimentPayload, Builder> implements ExperimentPayloadOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllOngoingExperiments(Iterable<? extends ExperimentLite> iterable) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).addAllOngoingExperiments(iterable);
                return this;
            }

            public Builder addOngoingExperiments(ExperimentLite experimentLite) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).addOngoingExperiments(experimentLite);
                return this;
            }

            public Builder clearActivateEventToLog() {
                copyOnWrite();
                ((ExperimentPayload) this.instance).clearActivateEventToLog();
                return this;
            }

            public Builder clearClearEventToLog() {
                copyOnWrite();
                ((ExperimentPayload) this.instance).clearClearEventToLog();
                return this;
            }

            public Builder clearExperimentId() {
                copyOnWrite();
                ((ExperimentPayload) this.instance).clearExperimentId();
                return this;
            }

            public Builder clearExperimentStartTimeMillis() {
                copyOnWrite();
                ((ExperimentPayload) this.instance).clearExperimentStartTimeMillis();
                return this;
            }

            public Builder clearOngoingExperiments() {
                copyOnWrite();
                ((ExperimentPayload) this.instance).clearOngoingExperiments();
                return this;
            }

            public Builder clearOverflowPolicy() {
                copyOnWrite();
                ((ExperimentPayload) this.instance).clearOverflowPolicy();
                return this;
            }

            public Builder clearSetEventToLog() {
                copyOnWrite();
                ((ExperimentPayload) this.instance).clearSetEventToLog();
                return this;
            }

            public Builder clearTimeToLiveMillis() {
                copyOnWrite();
                ((ExperimentPayload) this.instance).clearTimeToLiveMillis();
                return this;
            }

            public Builder clearTimeoutEventToLog() {
                copyOnWrite();
                ((ExperimentPayload) this.instance).clearTimeoutEventToLog();
                return this;
            }

            public Builder clearTriggerEvent() {
                copyOnWrite();
                ((ExperimentPayload) this.instance).clearTriggerEvent();
                return this;
            }

            public Builder clearTriggerTimeoutMillis() {
                copyOnWrite();
                ((ExperimentPayload) this.instance).clearTriggerTimeoutMillis();
                return this;
            }

            public Builder clearTtlExpiryEventToLog() {
                copyOnWrite();
                ((ExperimentPayload) this.instance).clearTtlExpiryEventToLog();
                return this;
            }

            public Builder clearVariantId() {
                copyOnWrite();
                ((ExperimentPayload) this.instance).clearVariantId();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
            public String getActivateEventToLog() {
                return ((ExperimentPayload) this.instance).getActivateEventToLog();
            }

            @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
            public j getActivateEventToLogBytes() {
                return ((ExperimentPayload) this.instance).getActivateEventToLogBytes();
            }

            @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
            public String getClearEventToLog() {
                return ((ExperimentPayload) this.instance).getClearEventToLog();
            }

            @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
            public j getClearEventToLogBytes() {
                return ((ExperimentPayload) this.instance).getClearEventToLogBytes();
            }

            @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
            public String getExperimentId() {
                return ((ExperimentPayload) this.instance).getExperimentId();
            }

            @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
            public j getExperimentIdBytes() {
                return ((ExperimentPayload) this.instance).getExperimentIdBytes();
            }

            @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
            public long getExperimentStartTimeMillis() {
                return ((ExperimentPayload) this.instance).getExperimentStartTimeMillis();
            }

            @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
            public ExperimentLite getOngoingExperiments(int i2) {
                return ((ExperimentPayload) this.instance).getOngoingExperiments(i2);
            }

            @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
            public int getOngoingExperimentsCount() {
                return ((ExperimentPayload) this.instance).getOngoingExperimentsCount();
            }

            @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
            public List<ExperimentLite> getOngoingExperimentsList() {
                return Collections.unmodifiableList(((ExperimentPayload) this.instance).getOngoingExperimentsList());
            }

            @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
            public ExperimentOverflowPolicy getOverflowPolicy() {
                return ((ExperimentPayload) this.instance).getOverflowPolicy();
            }

            @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
            public int getOverflowPolicyValue() {
                return ((ExperimentPayload) this.instance).getOverflowPolicyValue();
            }

            @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
            public String getSetEventToLog() {
                return ((ExperimentPayload) this.instance).getSetEventToLog();
            }

            @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
            public j getSetEventToLogBytes() {
                return ((ExperimentPayload) this.instance).getSetEventToLogBytes();
            }

            @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
            public long getTimeToLiveMillis() {
                return ((ExperimentPayload) this.instance).getTimeToLiveMillis();
            }

            @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
            public String getTimeoutEventToLog() {
                return ((ExperimentPayload) this.instance).getTimeoutEventToLog();
            }

            @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
            public j getTimeoutEventToLogBytes() {
                return ((ExperimentPayload) this.instance).getTimeoutEventToLogBytes();
            }

            @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
            public String getTriggerEvent() {
                return ((ExperimentPayload) this.instance).getTriggerEvent();
            }

            @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
            public j getTriggerEventBytes() {
                return ((ExperimentPayload) this.instance).getTriggerEventBytes();
            }

            @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
            public long getTriggerTimeoutMillis() {
                return ((ExperimentPayload) this.instance).getTriggerTimeoutMillis();
            }

            @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
            public String getTtlExpiryEventToLog() {
                return ((ExperimentPayload) this.instance).getTtlExpiryEventToLog();
            }

            @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
            public j getTtlExpiryEventToLogBytes() {
                return ((ExperimentPayload) this.instance).getTtlExpiryEventToLogBytes();
            }

            @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
            public String getVariantId() {
                return ((ExperimentPayload) this.instance).getVariantId();
            }

            @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
            public j getVariantIdBytes() {
                return ((ExperimentPayload) this.instance).getVariantIdBytes();
            }

            public Builder removeOngoingExperiments(int i2) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).removeOngoingExperiments(i2);
                return this;
            }

            public Builder setActivateEventToLog(String str) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).setActivateEventToLog(str);
                return this;
            }

            public Builder setActivateEventToLogBytes(j jVar) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).setActivateEventToLogBytes(jVar);
                return this;
            }

            public Builder setClearEventToLog(String str) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).setClearEventToLog(str);
                return this;
            }

            public Builder setClearEventToLogBytes(j jVar) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).setClearEventToLogBytes(jVar);
                return this;
            }

            public Builder setExperimentId(String str) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).setExperimentId(str);
                return this;
            }

            public Builder setExperimentIdBytes(j jVar) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).setExperimentIdBytes(jVar);
                return this;
            }

            public Builder setExperimentStartTimeMillis(long j2) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).setExperimentStartTimeMillis(j2);
                return this;
            }

            public Builder setOngoingExperiments(int i2, ExperimentLite experimentLite) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).setOngoingExperiments(i2, experimentLite);
                return this;
            }

            public Builder setOverflowPolicy(ExperimentOverflowPolicy experimentOverflowPolicy) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).setOverflowPolicy(experimentOverflowPolicy);
                return this;
            }

            public Builder setOverflowPolicyValue(int i2) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).setOverflowPolicyValue(i2);
                return this;
            }

            public Builder setSetEventToLog(String str) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).setSetEventToLog(str);
                return this;
            }

            public Builder setSetEventToLogBytes(j jVar) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).setSetEventToLogBytes(jVar);
                return this;
            }

            public Builder setTimeToLiveMillis(long j2) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).setTimeToLiveMillis(j2);
                return this;
            }

            public Builder setTimeoutEventToLog(String str) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).setTimeoutEventToLog(str);
                return this;
            }

            public Builder setTimeoutEventToLogBytes(j jVar) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).setTimeoutEventToLogBytes(jVar);
                return this;
            }

            public Builder setTriggerEvent(String str) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).setTriggerEvent(str);
                return this;
            }

            public Builder setTriggerEventBytes(j jVar) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).setTriggerEventBytes(jVar);
                return this;
            }

            public Builder setTriggerTimeoutMillis(long j2) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).setTriggerTimeoutMillis(j2);
                return this;
            }

            public Builder setTtlExpiryEventToLog(String str) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).setTtlExpiryEventToLog(str);
                return this;
            }

            public Builder setTtlExpiryEventToLogBytes(j jVar) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).setTtlExpiryEventToLogBytes(jVar);
                return this;
            }

            public Builder setVariantId(String str) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).setVariantId(str);
                return this;
            }

            public Builder setVariantIdBytes(j jVar) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).setVariantIdBytes(jVar);
                return this;
            }

            private Builder() {
                super(ExperimentPayload.DEFAULT_INSTANCE);
            }

            public Builder addOngoingExperiments(int i2, ExperimentLite experimentLite) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).addOngoingExperiments(i2, experimentLite);
                return this;
            }

            public Builder setOngoingExperiments(int i2, ExperimentLite.Builder builder) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).setOngoingExperiments(i2, builder.build());
                return this;
            }

            public Builder addOngoingExperiments(ExperimentLite.Builder builder) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).addOngoingExperiments(builder.build());
                return this;
            }

            public Builder addOngoingExperiments(int i2, ExperimentLite.Builder builder) {
                copyOnWrite();
                ((ExperimentPayload) this.instance).addOngoingExperiments(i2, builder.build());
                return this;
            }
        }

        /* loaded from: classes2.dex */
        public enum ExperimentOverflowPolicy implements y.c {
            POLICY_UNSPECIFIED(0),
            DISCARD_OLDEST(1),
            IGNORE_NEWEST(2),
            UNRECOGNIZED(-1);
            
            public static final int DISCARD_OLDEST_VALUE = 1;
            public static final int IGNORE_NEWEST_VALUE = 2;
            public static final int POLICY_UNSPECIFIED_VALUE = 0;
            private static final y.d<ExperimentOverflowPolicy> internalValueMap = new y.d<ExperimentOverflowPolicy>() { // from class: com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayload.ExperimentOverflowPolicy.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // f.h.h.y.d
                public ExperimentOverflowPolicy findValueByNumber(int i2) {
                    return ExperimentOverflowPolicy.forNumber(i2);
                }
            };
            private final int value;

            /* loaded from: classes2.dex */
            public static final class ExperimentOverflowPolicyVerifier implements y.e {
                public static final y.e INSTANCE = new ExperimentOverflowPolicyVerifier();

                private ExperimentOverflowPolicyVerifier() {
                }

                @Override // f.h.h.y.e
                public boolean isInRange(int i2) {
                    return ExperimentOverflowPolicy.forNumber(i2) != null;
                }
            }

            ExperimentOverflowPolicy(int i2) {
                this.value = i2;
            }

            public static ExperimentOverflowPolicy forNumber(int i2) {
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            return null;
                        }
                        return IGNORE_NEWEST;
                    }
                    return DISCARD_OLDEST;
                }
                return POLICY_UNSPECIFIED;
            }

            public static y.d<ExperimentOverflowPolicy> internalGetValueMap() {
                return internalValueMap;
            }

            public static y.e internalGetVerifier() {
                return ExperimentOverflowPolicyVerifier.INSTANCE;
            }

            @Override // f.h.h.y.c
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static ExperimentOverflowPolicy valueOf(int i2) {
                return forNumber(i2);
            }
        }

        static {
            ExperimentPayload experimentPayload = new ExperimentPayload();
            DEFAULT_INSTANCE = experimentPayload;
            GeneratedMessageLite.registerDefaultInstance(ExperimentPayload.class, experimentPayload);
        }

        private ExperimentPayload() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOngoingExperiments(Iterable<? extends ExperimentLite> iterable) {
            ensureOngoingExperimentsIsMutable();
            a.addAll((Iterable) iterable, (List) this.ongoingExperiments_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOngoingExperiments(ExperimentLite experimentLite) {
            experimentLite.getClass();
            ensureOngoingExperimentsIsMutable();
            this.ongoingExperiments_.add(experimentLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearActivateEventToLog() {
            this.activateEventToLog_ = getDefaultInstance().getActivateEventToLog();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClearEventToLog() {
            this.clearEventToLog_ = getDefaultInstance().getClearEventToLog();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExperimentId() {
            this.experimentId_ = getDefaultInstance().getExperimentId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExperimentStartTimeMillis() {
            this.experimentStartTimeMillis_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOngoingExperiments() {
            this.ongoingExperiments_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOverflowPolicy() {
            this.overflowPolicy_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSetEventToLog() {
            this.setEventToLog_ = getDefaultInstance().getSetEventToLog();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeToLiveMillis() {
            this.timeToLiveMillis_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeoutEventToLog() {
            this.timeoutEventToLog_ = getDefaultInstance().getTimeoutEventToLog();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTriggerEvent() {
            this.triggerEvent_ = getDefaultInstance().getTriggerEvent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTriggerTimeoutMillis() {
            this.triggerTimeoutMillis_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTtlExpiryEventToLog() {
            this.ttlExpiryEventToLog_ = getDefaultInstance().getTtlExpiryEventToLog();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVariantId() {
            this.variantId_ = getDefaultInstance().getVariantId();
        }

        private void ensureOngoingExperimentsIsMutable() {
            y.i<ExperimentLite> iVar = this.ongoingExperiments_;
            if (iVar.m0()) {
                return;
            }
            this.ongoingExperiments_ = GeneratedMessageLite.mutableCopy(iVar);
        }

        public static ExperimentPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ExperimentPayload parseDelimitedFrom(InputStream inputStream) {
            return (ExperimentPayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExperimentPayload parseFrom(ByteBuffer byteBuffer) {
            return (ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static u0<ExperimentPayload> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeOngoingExperiments(int i2) {
            ensureOngoingExperimentsIsMutable();
            this.ongoingExperiments_.remove(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActivateEventToLog(String str) {
            str.getClass();
            this.activateEventToLog_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActivateEventToLogBytes(j jVar) {
            a.checkByteStringIsUtf8(jVar);
            this.activateEventToLog_ = jVar.n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClearEventToLog(String str) {
            str.getClass();
            this.clearEventToLog_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClearEventToLogBytes(j jVar) {
            a.checkByteStringIsUtf8(jVar);
            this.clearEventToLog_ = jVar.n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExperimentId(String str) {
            str.getClass();
            this.experimentId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExperimentIdBytes(j jVar) {
            a.checkByteStringIsUtf8(jVar);
            this.experimentId_ = jVar.n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExperimentStartTimeMillis(long j2) {
            this.experimentStartTimeMillis_ = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOngoingExperiments(int i2, ExperimentLite experimentLite) {
            experimentLite.getClass();
            ensureOngoingExperimentsIsMutable();
            this.ongoingExperiments_.set(i2, experimentLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOverflowPolicy(ExperimentOverflowPolicy experimentOverflowPolicy) {
            this.overflowPolicy_ = experimentOverflowPolicy.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOverflowPolicyValue(int i2) {
            this.overflowPolicy_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSetEventToLog(String str) {
            str.getClass();
            this.setEventToLog_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSetEventToLogBytes(j jVar) {
            a.checkByteStringIsUtf8(jVar);
            this.setEventToLog_ = jVar.n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeToLiveMillis(long j2) {
            this.timeToLiveMillis_ = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeoutEventToLog(String str) {
            str.getClass();
            this.timeoutEventToLog_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeoutEventToLogBytes(j jVar) {
            a.checkByteStringIsUtf8(jVar);
            this.timeoutEventToLog_ = jVar.n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTriggerEvent(String str) {
            str.getClass();
            this.triggerEvent_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTriggerEventBytes(j jVar) {
            a.checkByteStringIsUtf8(jVar);
            this.triggerEvent_ = jVar.n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTriggerTimeoutMillis(long j2) {
            this.triggerTimeoutMillis_ = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTtlExpiryEventToLog(String str) {
            str.getClass();
            this.ttlExpiryEventToLog_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTtlExpiryEventToLogBytes(j jVar) {
            a.checkByteStringIsUtf8(jVar);
            this.ttlExpiryEventToLog_ = jVar.n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVariantId(String str) {
            str.getClass();
            this.variantId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVariantIdBytes(j jVar) {
            a.checkByteStringIsUtf8(jVar);
            this.variantId_ = jVar.n();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004Ȉ\u0005\u0002\u0006\u0002\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\f\f\r\u001b", new Object[]{"experimentId_", "variantId_", "experimentStartTimeMillis_", "triggerEvent_", "triggerTimeoutMillis_", "timeToLiveMillis_", "setEventToLog_", "activateEventToLog_", "clearEventToLog_", "timeoutEventToLog_", "ttlExpiryEventToLog_", "overflowPolicy_", "ongoingExperiments_", ExperimentLite.class});
                case 3:
                    return new ExperimentPayload();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0<ExperimentPayload> u0Var = PARSER;
                    if (u0Var == null) {
                        synchronized (ExperimentPayload.class) {
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

        @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
        public String getActivateEventToLog() {
            return this.activateEventToLog_;
        }

        @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
        public j getActivateEventToLogBytes() {
            return j.d(this.activateEventToLog_);
        }

        @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
        public String getClearEventToLog() {
            return this.clearEventToLog_;
        }

        @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
        public j getClearEventToLogBytes() {
            return j.d(this.clearEventToLog_);
        }

        @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
        public String getExperimentId() {
            return this.experimentId_;
        }

        @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
        public j getExperimentIdBytes() {
            return j.d(this.experimentId_);
        }

        @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
        public long getExperimentStartTimeMillis() {
            return this.experimentStartTimeMillis_;
        }

        @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
        public ExperimentLite getOngoingExperiments(int i2) {
            return this.ongoingExperiments_.get(i2);
        }

        @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
        public int getOngoingExperimentsCount() {
            return this.ongoingExperiments_.size();
        }

        @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
        public List<ExperimentLite> getOngoingExperimentsList() {
            return this.ongoingExperiments_;
        }

        public ExperimentLiteOrBuilder getOngoingExperimentsOrBuilder(int i2) {
            return this.ongoingExperiments_.get(i2);
        }

        public List<? extends ExperimentLiteOrBuilder> getOngoingExperimentsOrBuilderList() {
            return this.ongoingExperiments_;
        }

        @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
        public ExperimentOverflowPolicy getOverflowPolicy() {
            ExperimentOverflowPolicy forNumber = ExperimentOverflowPolicy.forNumber(this.overflowPolicy_);
            return forNumber == null ? ExperimentOverflowPolicy.UNRECOGNIZED : forNumber;
        }

        @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
        public int getOverflowPolicyValue() {
            return this.overflowPolicy_;
        }

        @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
        public String getSetEventToLog() {
            return this.setEventToLog_;
        }

        @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
        public j getSetEventToLogBytes() {
            return j.d(this.setEventToLog_);
        }

        @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
        public long getTimeToLiveMillis() {
            return this.timeToLiveMillis_;
        }

        @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
        public String getTimeoutEventToLog() {
            return this.timeoutEventToLog_;
        }

        @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
        public j getTimeoutEventToLogBytes() {
            return j.d(this.timeoutEventToLog_);
        }

        @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
        public String getTriggerEvent() {
            return this.triggerEvent_;
        }

        @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
        public j getTriggerEventBytes() {
            return j.d(this.triggerEvent_);
        }

        @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
        public long getTriggerTimeoutMillis() {
            return this.triggerTimeoutMillis_;
        }

        @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
        public String getTtlExpiryEventToLog() {
            return this.ttlExpiryEventToLog_;
        }

        @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
        public j getTtlExpiryEventToLogBytes() {
            return j.d(this.ttlExpiryEventToLog_);
        }

        @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
        public String getVariantId() {
            return this.variantId_;
        }

        @Override // com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayloadOrBuilder
        public j getVariantIdBytes() {
            return j.d(this.variantId_);
        }

        public static Builder newBuilder(ExperimentPayload experimentPayload) {
            return DEFAULT_INSTANCE.createBuilder(experimentPayload);
        }

        public static ExperimentPayload parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (ExperimentPayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExperimentPayload parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static ExperimentPayload parseFrom(j jVar) {
            return (ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOngoingExperiments(int i2, ExperimentLite experimentLite) {
            experimentLite.getClass();
            ensureOngoingExperimentsIsMutable();
            this.ongoingExperiments_.add(i2, experimentLite);
        }

        public static ExperimentPayload parseFrom(j jVar, q qVar) {
            return (ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static ExperimentPayload parseFrom(byte[] bArr) {
            return (ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExperimentPayload parseFrom(byte[] bArr, q qVar) {
            return (ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static ExperimentPayload parseFrom(InputStream inputStream) {
            return (ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExperimentPayload parseFrom(InputStream inputStream, q qVar) {
            return (ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExperimentPayload parseFrom(k kVar) {
            return (ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static ExperimentPayload parseFrom(k kVar, q qVar) {
            return (ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, qVar);
        }
    }

    /* loaded from: classes2.dex */
    public interface ExperimentPayloadOrBuilder extends o0 {
        String getActivateEventToLog();

        j getActivateEventToLogBytes();

        String getClearEventToLog();

        j getClearEventToLogBytes();

        @Override // f.h.h.o0
        /* synthetic */ n0 getDefaultInstanceForType();

        String getExperimentId();

        j getExperimentIdBytes();

        long getExperimentStartTimeMillis();

        ExperimentLite getOngoingExperiments(int i2);

        int getOngoingExperimentsCount();

        List<ExperimentLite> getOngoingExperimentsList();

        ExperimentPayload.ExperimentOverflowPolicy getOverflowPolicy();

        int getOverflowPolicyValue();

        String getSetEventToLog();

        j getSetEventToLogBytes();

        long getTimeToLiveMillis();

        String getTimeoutEventToLog();

        j getTimeoutEventToLogBytes();

        String getTriggerEvent();

        j getTriggerEventBytes();

        long getTriggerTimeoutMillis();

        String getTtlExpiryEventToLog();

        j getTtlExpiryEventToLogBytes();

        String getVariantId();

        j getVariantIdBytes();

        @Override // f.h.h.o0
        /* synthetic */ boolean isInitialized();
    }

    private ExperimentPayloadProto() {
    }

    public static void registerAllExtensions(q qVar) {
    }
}
