package com.google.firebase.inappmessaging.internal;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat$FieldType;
import f.h.h.g0;
import f.h.h.h0;
import f.h.h.j;
import f.h.h.k;
import f.h.h.n0;
import f.h.h.o0;
import f.h.h.q;
import f.h.h.u0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class RateLimitProto {

    /* renamed from: com.google.firebase.inappmessaging.internal.RateLimitProto$1  reason: invalid class name */
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
    public static final class Counter extends GeneratedMessageLite<Counter, Builder> implements CounterOrBuilder {
        private static final Counter DEFAULT_INSTANCE;
        private static volatile u0<Counter> PARSER = null;
        public static final int START_TIME_EPOCH_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 1;
        private long startTimeEpoch_;
        private long value_;

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.a<Counter, Builder> implements CounterOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearStartTimeEpoch() {
                copyOnWrite();
                ((Counter) this.instance).clearStartTimeEpoch();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((Counter) this.instance).clearValue();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.internal.RateLimitProto.CounterOrBuilder
            public long getStartTimeEpoch() {
                return ((Counter) this.instance).getStartTimeEpoch();
            }

            @Override // com.google.firebase.inappmessaging.internal.RateLimitProto.CounterOrBuilder
            public long getValue() {
                return ((Counter) this.instance).getValue();
            }

            public Builder setStartTimeEpoch(long j2) {
                copyOnWrite();
                ((Counter) this.instance).setStartTimeEpoch(j2);
                return this;
            }

            public Builder setValue(long j2) {
                copyOnWrite();
                ((Counter) this.instance).setValue(j2);
                return this;
            }

            private Builder() {
                super(Counter.DEFAULT_INSTANCE);
            }
        }

        static {
            Counter counter = new Counter();
            DEFAULT_INSTANCE = counter;
            GeneratedMessageLite.registerDefaultInstance(Counter.class, counter);
        }

        private Counter() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartTimeEpoch() {
            this.startTimeEpoch_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = 0L;
        }

        public static Counter getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Counter parseDelimitedFrom(InputStream inputStream) {
            return (Counter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Counter parseFrom(ByteBuffer byteBuffer) {
            return (Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static u0<Counter> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartTimeEpoch(long j2) {
            this.startTimeEpoch_ = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(long j2) {
            this.value_ = j2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"value_", "startTimeEpoch_"});
                case 3:
                    return new Counter();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0<Counter> u0Var = PARSER;
                    if (u0Var == null) {
                        synchronized (Counter.class) {
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

        @Override // com.google.firebase.inappmessaging.internal.RateLimitProto.CounterOrBuilder
        public long getStartTimeEpoch() {
            return this.startTimeEpoch_;
        }

        @Override // com.google.firebase.inappmessaging.internal.RateLimitProto.CounterOrBuilder
        public long getValue() {
            return this.value_;
        }

        public static Builder newBuilder(Counter counter) {
            return DEFAULT_INSTANCE.createBuilder(counter);
        }

        public static Counter parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (Counter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Counter parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static Counter parseFrom(j jVar) {
            return (Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static Counter parseFrom(j jVar, q qVar) {
            return (Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static Counter parseFrom(byte[] bArr) {
            return (Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Counter parseFrom(byte[] bArr, q qVar) {
            return (Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static Counter parseFrom(InputStream inputStream) {
            return (Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Counter parseFrom(InputStream inputStream, q qVar) {
            return (Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Counter parseFrom(k kVar) {
            return (Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static Counter parseFrom(k kVar, q qVar) {
            return (Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, qVar);
        }
    }

    /* loaded from: classes2.dex */
    public interface CounterOrBuilder extends o0 {
        @Override // f.h.h.o0
        /* synthetic */ n0 getDefaultInstanceForType();

        long getStartTimeEpoch();

        long getValue();

        @Override // f.h.h.o0
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes2.dex */
    public static final class RateLimit extends GeneratedMessageLite<RateLimit, Builder> implements RateLimitOrBuilder {
        private static final RateLimit DEFAULT_INSTANCE;
        public static final int LIMITS_FIELD_NUMBER = 1;
        private static volatile u0<RateLimit> PARSER;
        private h0<String, Counter> limits_ = h0.f6358g;

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.a<RateLimit, Builder> implements RateLimitOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearLimits() {
                copyOnWrite();
                ((RateLimit) this.instance).getMutableLimitsMap().clear();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.internal.RateLimitProto.RateLimitOrBuilder
            public boolean containsLimits(String str) {
                str.getClass();
                return ((RateLimit) this.instance).getLimitsMap().containsKey(str);
            }

            @Override // com.google.firebase.inappmessaging.internal.RateLimitProto.RateLimitOrBuilder
            @Deprecated
            public Map<String, Counter> getLimits() {
                return getLimitsMap();
            }

            @Override // com.google.firebase.inappmessaging.internal.RateLimitProto.RateLimitOrBuilder
            public int getLimitsCount() {
                return ((RateLimit) this.instance).getLimitsMap().size();
            }

            @Override // com.google.firebase.inappmessaging.internal.RateLimitProto.RateLimitOrBuilder
            public Map<String, Counter> getLimitsMap() {
                return Collections.unmodifiableMap(((RateLimit) this.instance).getLimitsMap());
            }

            @Override // com.google.firebase.inappmessaging.internal.RateLimitProto.RateLimitOrBuilder
            public Counter getLimitsOrDefault(String str, Counter counter) {
                str.getClass();
                Map<String, Counter> limitsMap = ((RateLimit) this.instance).getLimitsMap();
                return limitsMap.containsKey(str) ? limitsMap.get(str) : counter;
            }

            @Override // com.google.firebase.inappmessaging.internal.RateLimitProto.RateLimitOrBuilder
            public Counter getLimitsOrThrow(String str) {
                str.getClass();
                Map<String, Counter> limitsMap = ((RateLimit) this.instance).getLimitsMap();
                if (limitsMap.containsKey(str)) {
                    return limitsMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            public Builder putAllLimits(Map<String, Counter> map) {
                copyOnWrite();
                ((RateLimit) this.instance).getMutableLimitsMap().putAll(map);
                return this;
            }

            public Builder putLimits(String str, Counter counter) {
                str.getClass();
                counter.getClass();
                copyOnWrite();
                ((RateLimit) this.instance).getMutableLimitsMap().put(str, counter);
                return this;
            }

            public Builder removeLimits(String str) {
                str.getClass();
                copyOnWrite();
                ((RateLimit) this.instance).getMutableLimitsMap().remove(str);
                return this;
            }

            private Builder() {
                super(RateLimit.DEFAULT_INSTANCE);
            }
        }

        /* loaded from: classes2.dex */
        public static final class LimitsDefaultEntryHolder {
            public static final g0<String, Counter> defaultEntry = new g0<>(WireFormat$FieldType.STRING, "", WireFormat$FieldType.MESSAGE, Counter.getDefaultInstance());

            private LimitsDefaultEntryHolder() {
            }
        }

        static {
            RateLimit rateLimit = new RateLimit();
            DEFAULT_INSTANCE = rateLimit;
            GeneratedMessageLite.registerDefaultInstance(RateLimit.class, rateLimit);
        }

        private RateLimit() {
        }

        public static RateLimit getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, Counter> getMutableLimitsMap() {
            return internalGetMutableLimits();
        }

        private h0<String, Counter> internalGetLimits() {
            return this.limits_;
        }

        private h0<String, Counter> internalGetMutableLimits() {
            h0<String, Counter> h0Var = this.limits_;
            if (!h0Var.f6359f) {
                this.limits_ = h0Var.c();
            }
            return this.limits_;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static RateLimit parseDelimitedFrom(InputStream inputStream) {
            return (RateLimit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RateLimit parseFrom(ByteBuffer byteBuffer) {
            return (RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static u0<RateLimit> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.firebase.inappmessaging.internal.RateLimitProto.RateLimitOrBuilder
        public boolean containsLimits(String str) {
            str.getClass();
            return internalGetLimits().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"limits_", LimitsDefaultEntryHolder.defaultEntry});
                case 3:
                    return new RateLimit();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0<RateLimit> u0Var = PARSER;
                    if (u0Var == null) {
                        synchronized (RateLimit.class) {
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

        @Override // com.google.firebase.inappmessaging.internal.RateLimitProto.RateLimitOrBuilder
        @Deprecated
        public Map<String, Counter> getLimits() {
            return getLimitsMap();
        }

        @Override // com.google.firebase.inappmessaging.internal.RateLimitProto.RateLimitOrBuilder
        public int getLimitsCount() {
            return internalGetLimits().size();
        }

        @Override // com.google.firebase.inappmessaging.internal.RateLimitProto.RateLimitOrBuilder
        public Map<String, Counter> getLimitsMap() {
            return Collections.unmodifiableMap(internalGetLimits());
        }

        @Override // com.google.firebase.inappmessaging.internal.RateLimitProto.RateLimitOrBuilder
        public Counter getLimitsOrDefault(String str, Counter counter) {
            str.getClass();
            h0<String, Counter> internalGetLimits = internalGetLimits();
            return internalGetLimits.containsKey(str) ? internalGetLimits.get(str) : counter;
        }

        @Override // com.google.firebase.inappmessaging.internal.RateLimitProto.RateLimitOrBuilder
        public Counter getLimitsOrThrow(String str) {
            str.getClass();
            h0<String, Counter> internalGetLimits = internalGetLimits();
            if (internalGetLimits.containsKey(str)) {
                return internalGetLimits.get(str);
            }
            throw new IllegalArgumentException();
        }

        public static Builder newBuilder(RateLimit rateLimit) {
            return DEFAULT_INSTANCE.createBuilder(rateLimit);
        }

        public static RateLimit parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (RateLimit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static RateLimit parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static RateLimit parseFrom(j jVar) {
            return (RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static RateLimit parseFrom(j jVar, q qVar) {
            return (RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static RateLimit parseFrom(byte[] bArr) {
            return (RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RateLimit parseFrom(byte[] bArr, q qVar) {
            return (RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static RateLimit parseFrom(InputStream inputStream) {
            return (RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RateLimit parseFrom(InputStream inputStream, q qVar) {
            return (RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static RateLimit parseFrom(k kVar) {
            return (RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static RateLimit parseFrom(k kVar, q qVar) {
            return (RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, qVar);
        }
    }

    /* loaded from: classes2.dex */
    public interface RateLimitOrBuilder extends o0 {
        boolean containsLimits(String str);

        @Override // f.h.h.o0
        /* synthetic */ n0 getDefaultInstanceForType();

        @Deprecated
        Map<String, Counter> getLimits();

        int getLimitsCount();

        Map<String, Counter> getLimitsMap();

        Counter getLimitsOrDefault(String str, Counter counter);

        Counter getLimitsOrThrow(String str);

        @Override // f.h.h.o0
        /* synthetic */ boolean isInitialized();
    }

    private RateLimitProto() {
    }

    public static void registerAllExtensions(q qVar) {
    }
}
