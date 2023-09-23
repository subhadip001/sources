package com.google.firebase.inappmessaging;

import com.google.firebase.inappmessaging.MessagesProto;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.protobuf.GeneratedMessageLite;
import f.h.h.j;
import f.h.h.k;
import f.h.h.n0;
import f.h.h.o0;
import f.h.h.q;
import f.h.h.u0;
import f.h.h.y;
import f.h.i.a;
import f.h.i.b;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class CommonTypesProto {

    /* renamed from: com.google.firebase.inappmessaging.CommonTypesProto$1  reason: invalid class name */
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
    public enum CampaignState implements y.c {
        UNKNOWN_CAMPAIGN_STATE(0),
        DRAFT(1),
        PUBLISHED(2),
        STOPPED(3),
        DELETED(4),
        UNRECOGNIZED(-1);
        
        public static final int DELETED_VALUE = 4;
        public static final int DRAFT_VALUE = 1;
        public static final int PUBLISHED_VALUE = 2;
        public static final int STOPPED_VALUE = 3;
        public static final int UNKNOWN_CAMPAIGN_STATE_VALUE = 0;
        private static final y.d<CampaignState> internalValueMap = new y.d<CampaignState>() { // from class: com.google.firebase.inappmessaging.CommonTypesProto.CampaignState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // f.h.h.y.d
            public CampaignState findValueByNumber(int i2) {
                return CampaignState.forNumber(i2);
            }
        };
        private final int value;

        /* loaded from: classes2.dex */
        public static final class CampaignStateVerifier implements y.e {
            public static final y.e INSTANCE = new CampaignStateVerifier();

            private CampaignStateVerifier() {
            }

            @Override // f.h.h.y.e
            public boolean isInRange(int i2) {
                return CampaignState.forNumber(i2) != null;
            }
        }

        CampaignState(int i2) {
            this.value = i2;
        }

        public static CampaignState forNumber(int i2) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                return null;
                            }
                            return DELETED;
                        }
                        return STOPPED;
                    }
                    return PUBLISHED;
                }
                return DRAFT;
            }
            return UNKNOWN_CAMPAIGN_STATE;
        }

        public static y.d<CampaignState> internalGetValueMap() {
            return internalValueMap;
        }

        public static y.e internalGetVerifier() {
            return CampaignStateVerifier.INSTANCE;
        }

        @Override // f.h.h.y.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static CampaignState valueOf(int i2) {
            return forNumber(i2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class CampaignTime extends GeneratedMessageLite<CampaignTime, Builder> implements CampaignTimeOrBuilder {
        public static final int DATE_FIELD_NUMBER = 1;
        private static final CampaignTime DEFAULT_INSTANCE;
        private static volatile u0<CampaignTime> PARSER = null;
        public static final int TIME_FIELD_NUMBER = 2;
        public static final int TIME_ZONE_FIELD_NUMBER = 3;
        private a date_;
        private String timeZone_ = "";
        private b time_;

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.a<CampaignTime, Builder> implements CampaignTimeOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDate() {
                copyOnWrite();
                ((CampaignTime) this.instance).clearDate();
                return this;
            }

            public Builder clearTime() {
                copyOnWrite();
                ((CampaignTime) this.instance).clearTime();
                return this;
            }

            public Builder clearTimeZone() {
                copyOnWrite();
                ((CampaignTime) this.instance).clearTimeZone();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.CampaignTimeOrBuilder
            public a getDate() {
                return ((CampaignTime) this.instance).getDate();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.CampaignTimeOrBuilder
            public b getTime() {
                return ((CampaignTime) this.instance).getTime();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.CampaignTimeOrBuilder
            public String getTimeZone() {
                return ((CampaignTime) this.instance).getTimeZone();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.CampaignTimeOrBuilder
            public j getTimeZoneBytes() {
                return ((CampaignTime) this.instance).getTimeZoneBytes();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.CampaignTimeOrBuilder
            public boolean hasDate() {
                return ((CampaignTime) this.instance).hasDate();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.CampaignTimeOrBuilder
            public boolean hasTime() {
                return ((CampaignTime) this.instance).hasTime();
            }

            public Builder mergeDate(a aVar) {
                copyOnWrite();
                ((CampaignTime) this.instance).mergeDate(aVar);
                return this;
            }

            public Builder mergeTime(b bVar) {
                copyOnWrite();
                ((CampaignTime) this.instance).mergeTime(bVar);
                return this;
            }

            public Builder setDate(a aVar) {
                copyOnWrite();
                ((CampaignTime) this.instance).setDate(aVar);
                return this;
            }

            public Builder setTime(b bVar) {
                copyOnWrite();
                ((CampaignTime) this.instance).setTime(bVar);
                return this;
            }

            public Builder setTimeZone(String str) {
                copyOnWrite();
                ((CampaignTime) this.instance).setTimeZone(str);
                return this;
            }

            public Builder setTimeZoneBytes(j jVar) {
                copyOnWrite();
                ((CampaignTime) this.instance).setTimeZoneBytes(jVar);
                return this;
            }

            private Builder() {
                super(CampaignTime.DEFAULT_INSTANCE);
            }

            public Builder setDate(a.b bVar) {
                copyOnWrite();
                ((CampaignTime) this.instance).setDate(bVar.build());
                return this;
            }

            public Builder setTime(b.C0151b c0151b) {
                copyOnWrite();
                ((CampaignTime) this.instance).setTime(c0151b.build());
                return this;
            }
        }

        static {
            CampaignTime campaignTime = new CampaignTime();
            DEFAULT_INSTANCE = campaignTime;
            GeneratedMessageLite.registerDefaultInstance(CampaignTime.class, campaignTime);
        }

        private CampaignTime() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDate() {
            this.date_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTime() {
            this.time_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeZone() {
            this.timeZone_ = getDefaultInstance().getTimeZone();
        }

        public static CampaignTime getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDate(a aVar) {
            aVar.getClass();
            a aVar2 = this.date_;
            if (aVar2 != null && aVar2 != a.b()) {
                this.date_ = a.c(this.date_).mergeFrom((a.b) aVar).buildPartial();
            } else {
                this.date_ = aVar;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTime(b bVar) {
            bVar.getClass();
            b bVar2 = this.time_;
            if (bVar2 != null && bVar2 != b.b()) {
                this.time_ = b.c(this.time_).mergeFrom((b.C0151b) bVar).buildPartial();
            } else {
                this.time_ = bVar;
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CampaignTime parseDelimitedFrom(InputStream inputStream) {
            return (CampaignTime) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CampaignTime parseFrom(ByteBuffer byteBuffer) {
            return (CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static u0<CampaignTime> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDate(a aVar) {
            aVar.getClass();
            this.date_ = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTime(b bVar) {
            bVar.getClass();
            this.time_ = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeZone(String str) {
            str.getClass();
            this.timeZone_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeZoneBytes(j jVar) {
            f.h.h.a.checkByteStringIsUtf8(jVar);
            this.timeZone_ = jVar.n();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ", new Object[]{"date_", "time_", "timeZone_"});
                case 3:
                    return new CampaignTime();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0<CampaignTime> u0Var = PARSER;
                    if (u0Var == null) {
                        synchronized (CampaignTime.class) {
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

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.CampaignTimeOrBuilder
        public a getDate() {
            a aVar = this.date_;
            return aVar == null ? a.b() : aVar;
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.CampaignTimeOrBuilder
        public b getTime() {
            b bVar = this.time_;
            return bVar == null ? b.b() : bVar;
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.CampaignTimeOrBuilder
        public String getTimeZone() {
            return this.timeZone_;
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.CampaignTimeOrBuilder
        public j getTimeZoneBytes() {
            return j.d(this.timeZone_);
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.CampaignTimeOrBuilder
        public boolean hasDate() {
            return this.date_ != null;
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.CampaignTimeOrBuilder
        public boolean hasTime() {
            return this.time_ != null;
        }

        public static Builder newBuilder(CampaignTime campaignTime) {
            return DEFAULT_INSTANCE.createBuilder(campaignTime);
        }

        public static CampaignTime parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (CampaignTime) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static CampaignTime parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static CampaignTime parseFrom(j jVar) {
            return (CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static CampaignTime parseFrom(j jVar, q qVar) {
            return (CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static CampaignTime parseFrom(byte[] bArr) {
            return (CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CampaignTime parseFrom(byte[] bArr, q qVar) {
            return (CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static CampaignTime parseFrom(InputStream inputStream) {
            return (CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CampaignTime parseFrom(InputStream inputStream, q qVar) {
            return (CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static CampaignTime parseFrom(k kVar) {
            return (CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static CampaignTime parseFrom(k kVar, q qVar) {
            return (CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, qVar);
        }
    }

    /* loaded from: classes2.dex */
    public interface CampaignTimeOrBuilder extends o0 {
        a getDate();

        @Override // f.h.h.o0
        /* synthetic */ n0 getDefaultInstanceForType();

        b getTime();

        String getTimeZone();

        j getTimeZoneBytes();

        boolean hasDate();

        boolean hasTime();

        @Override // f.h.h.o0
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes2.dex */
    public static final class DailyAnalyticsSummary extends GeneratedMessageLite<DailyAnalyticsSummary, Builder> implements DailyAnalyticsSummaryOrBuilder {
        public static final int CLICKS_FIELD_NUMBER = 3;
        private static final DailyAnalyticsSummary DEFAULT_INSTANCE;
        public static final int ERRORS_FIELD_NUMBER = 4;
        public static final int IMPRESSIONS_FIELD_NUMBER = 2;
        private static volatile u0<DailyAnalyticsSummary> PARSER = null;
        public static final int START_OF_DAY_MILLIS_FIELD_NUMBER = 1;
        private int clicks_;
        private int errors_;
        private int impressions_;
        private long startOfDayMillis_;

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.a<DailyAnalyticsSummary, Builder> implements DailyAnalyticsSummaryOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearClicks() {
                copyOnWrite();
                ((DailyAnalyticsSummary) this.instance).clearClicks();
                return this;
            }

            public Builder clearErrors() {
                copyOnWrite();
                ((DailyAnalyticsSummary) this.instance).clearErrors();
                return this;
            }

            public Builder clearImpressions() {
                copyOnWrite();
                ((DailyAnalyticsSummary) this.instance).clearImpressions();
                return this;
            }

            public Builder clearStartOfDayMillis() {
                copyOnWrite();
                ((DailyAnalyticsSummary) this.instance).clearStartOfDayMillis();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.DailyAnalyticsSummaryOrBuilder
            public int getClicks() {
                return ((DailyAnalyticsSummary) this.instance).getClicks();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.DailyAnalyticsSummaryOrBuilder
            public int getErrors() {
                return ((DailyAnalyticsSummary) this.instance).getErrors();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.DailyAnalyticsSummaryOrBuilder
            public int getImpressions() {
                return ((DailyAnalyticsSummary) this.instance).getImpressions();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.DailyAnalyticsSummaryOrBuilder
            public long getStartOfDayMillis() {
                return ((DailyAnalyticsSummary) this.instance).getStartOfDayMillis();
            }

            public Builder setClicks(int i2) {
                copyOnWrite();
                ((DailyAnalyticsSummary) this.instance).setClicks(i2);
                return this;
            }

            public Builder setErrors(int i2) {
                copyOnWrite();
                ((DailyAnalyticsSummary) this.instance).setErrors(i2);
                return this;
            }

            public Builder setImpressions(int i2) {
                copyOnWrite();
                ((DailyAnalyticsSummary) this.instance).setImpressions(i2);
                return this;
            }

            public Builder setStartOfDayMillis(long j2) {
                copyOnWrite();
                ((DailyAnalyticsSummary) this.instance).setStartOfDayMillis(j2);
                return this;
            }

            private Builder() {
                super(DailyAnalyticsSummary.DEFAULT_INSTANCE);
            }
        }

        static {
            DailyAnalyticsSummary dailyAnalyticsSummary = new DailyAnalyticsSummary();
            DEFAULT_INSTANCE = dailyAnalyticsSummary;
            GeneratedMessageLite.registerDefaultInstance(DailyAnalyticsSummary.class, dailyAnalyticsSummary);
        }

        private DailyAnalyticsSummary() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClicks() {
            this.clicks_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrors() {
            this.errors_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImpressions() {
            this.impressions_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartOfDayMillis() {
            this.startOfDayMillis_ = 0L;
        }

        public static DailyAnalyticsSummary getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DailyAnalyticsSummary parseDelimitedFrom(InputStream inputStream) {
            return (DailyAnalyticsSummary) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DailyAnalyticsSummary parseFrom(ByteBuffer byteBuffer) {
            return (DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static u0<DailyAnalyticsSummary> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClicks(int i2) {
            this.clicks_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrors(int i2) {
            this.errors_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImpressions(int i2) {
            this.impressions_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartOfDayMillis(long j2) {
            this.startOfDayMillis_ = j2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"startOfDayMillis_", "impressions_", "clicks_", "errors_"});
                case 3:
                    return new DailyAnalyticsSummary();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0<DailyAnalyticsSummary> u0Var = PARSER;
                    if (u0Var == null) {
                        synchronized (DailyAnalyticsSummary.class) {
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

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.DailyAnalyticsSummaryOrBuilder
        public int getClicks() {
            return this.clicks_;
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.DailyAnalyticsSummaryOrBuilder
        public int getErrors() {
            return this.errors_;
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.DailyAnalyticsSummaryOrBuilder
        public int getImpressions() {
            return this.impressions_;
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.DailyAnalyticsSummaryOrBuilder
        public long getStartOfDayMillis() {
            return this.startOfDayMillis_;
        }

        public static Builder newBuilder(DailyAnalyticsSummary dailyAnalyticsSummary) {
            return DEFAULT_INSTANCE.createBuilder(dailyAnalyticsSummary);
        }

        public static DailyAnalyticsSummary parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (DailyAnalyticsSummary) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static DailyAnalyticsSummary parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static DailyAnalyticsSummary parseFrom(j jVar) {
            return (DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static DailyAnalyticsSummary parseFrom(j jVar, q qVar) {
            return (DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static DailyAnalyticsSummary parseFrom(byte[] bArr) {
            return (DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DailyAnalyticsSummary parseFrom(byte[] bArr, q qVar) {
            return (DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static DailyAnalyticsSummary parseFrom(InputStream inputStream) {
            return (DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DailyAnalyticsSummary parseFrom(InputStream inputStream, q qVar) {
            return (DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static DailyAnalyticsSummary parseFrom(k kVar) {
            return (DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static DailyAnalyticsSummary parseFrom(k kVar, q qVar) {
            return (DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, qVar);
        }
    }

    /* loaded from: classes2.dex */
    public interface DailyAnalyticsSummaryOrBuilder extends o0 {
        int getClicks();

        @Override // f.h.h.o0
        /* synthetic */ n0 getDefaultInstanceForType();

        int getErrors();

        int getImpressions();

        long getStartOfDayMillis();

        @Override // f.h.h.o0
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes2.dex */
    public static final class DailyConversionSummary extends GeneratedMessageLite<DailyConversionSummary, Builder> implements DailyConversionSummaryOrBuilder {
        public static final int CONVERSIONS_FIELD_NUMBER = 2;
        private static final DailyConversionSummary DEFAULT_INSTANCE;
        private static volatile u0<DailyConversionSummary> PARSER = null;
        public static final int START_OF_DAY_MILLIS_FIELD_NUMBER = 1;
        private int conversions_;
        private long startOfDayMillis_;

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.a<DailyConversionSummary, Builder> implements DailyConversionSummaryOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearConversions() {
                copyOnWrite();
                ((DailyConversionSummary) this.instance).clearConversions();
                return this;
            }

            public Builder clearStartOfDayMillis() {
                copyOnWrite();
                ((DailyConversionSummary) this.instance).clearStartOfDayMillis();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.DailyConversionSummaryOrBuilder
            public int getConversions() {
                return ((DailyConversionSummary) this.instance).getConversions();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.DailyConversionSummaryOrBuilder
            public long getStartOfDayMillis() {
                return ((DailyConversionSummary) this.instance).getStartOfDayMillis();
            }

            public Builder setConversions(int i2) {
                copyOnWrite();
                ((DailyConversionSummary) this.instance).setConversions(i2);
                return this;
            }

            public Builder setStartOfDayMillis(long j2) {
                copyOnWrite();
                ((DailyConversionSummary) this.instance).setStartOfDayMillis(j2);
                return this;
            }

            private Builder() {
                super(DailyConversionSummary.DEFAULT_INSTANCE);
            }
        }

        static {
            DailyConversionSummary dailyConversionSummary = new DailyConversionSummary();
            DEFAULT_INSTANCE = dailyConversionSummary;
            GeneratedMessageLite.registerDefaultInstance(DailyConversionSummary.class, dailyConversionSummary);
        }

        private DailyConversionSummary() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConversions() {
            this.conversions_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartOfDayMillis() {
            this.startOfDayMillis_ = 0L;
        }

        public static DailyConversionSummary getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DailyConversionSummary parseDelimitedFrom(InputStream inputStream) {
            return (DailyConversionSummary) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DailyConversionSummary parseFrom(ByteBuffer byteBuffer) {
            return (DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static u0<DailyConversionSummary> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConversions(int i2) {
            this.conversions_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartOfDayMillis(long j2) {
            this.startOfDayMillis_ = j2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"startOfDayMillis_", "conversions_"});
                case 3:
                    return new DailyConversionSummary();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0<DailyConversionSummary> u0Var = PARSER;
                    if (u0Var == null) {
                        synchronized (DailyConversionSummary.class) {
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

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.DailyConversionSummaryOrBuilder
        public int getConversions() {
            return this.conversions_;
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.DailyConversionSummaryOrBuilder
        public long getStartOfDayMillis() {
            return this.startOfDayMillis_;
        }

        public static Builder newBuilder(DailyConversionSummary dailyConversionSummary) {
            return DEFAULT_INSTANCE.createBuilder(dailyConversionSummary);
        }

        public static DailyConversionSummary parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (DailyConversionSummary) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static DailyConversionSummary parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static DailyConversionSummary parseFrom(j jVar) {
            return (DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static DailyConversionSummary parseFrom(j jVar, q qVar) {
            return (DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static DailyConversionSummary parseFrom(byte[] bArr) {
            return (DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DailyConversionSummary parseFrom(byte[] bArr, q qVar) {
            return (DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static DailyConversionSummary parseFrom(InputStream inputStream) {
            return (DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DailyConversionSummary parseFrom(InputStream inputStream, q qVar) {
            return (DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static DailyConversionSummary parseFrom(k kVar) {
            return (DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static DailyConversionSummary parseFrom(k kVar, q qVar) {
            return (DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, qVar);
        }
    }

    /* loaded from: classes2.dex */
    public interface DailyConversionSummaryOrBuilder extends o0 {
        int getConversions();

        @Override // f.h.h.o0
        /* synthetic */ n0 getDefaultInstanceForType();

        long getStartOfDayMillis();

        @Override // f.h.h.o0
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes2.dex */
    public static final class Event extends GeneratedMessageLite<Event, Builder> implements EventOrBuilder {
        public static final int COUNT_FIELD_NUMBER = 5;
        private static final Event DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile u0<Event> PARSER = null;
        public static final int PREVIOUS_TIMESTAMP_MILLIS_FIELD_NUMBER = 4;
        public static final int TIMESTAMP_MILLIS_FIELD_NUMBER = 3;
        public static final int TRIGGER_PARAMS_FIELD_NUMBER = 1;
        private int count_;
        private long previousTimestampMillis_;
        private long timestampMillis_;
        private y.i<TriggerParam> triggerParams_ = GeneratedMessageLite.emptyProtobufList();
        private String name_ = "";

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.a<Event, Builder> implements EventOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllTriggerParams(Iterable<? extends TriggerParam> iterable) {
                copyOnWrite();
                ((Event) this.instance).addAllTriggerParams(iterable);
                return this;
            }

            public Builder addTriggerParams(TriggerParam triggerParam) {
                copyOnWrite();
                ((Event) this.instance).addTriggerParams(triggerParam);
                return this;
            }

            public Builder clearCount() {
                copyOnWrite();
                ((Event) this.instance).clearCount();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((Event) this.instance).clearName();
                return this;
            }

            public Builder clearPreviousTimestampMillis() {
                copyOnWrite();
                ((Event) this.instance).clearPreviousTimestampMillis();
                return this;
            }

            public Builder clearTimestampMillis() {
                copyOnWrite();
                ((Event) this.instance).clearTimestampMillis();
                return this;
            }

            public Builder clearTriggerParams() {
                copyOnWrite();
                ((Event) this.instance).clearTriggerParams();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.EventOrBuilder
            public int getCount() {
                return ((Event) this.instance).getCount();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.EventOrBuilder
            public String getName() {
                return ((Event) this.instance).getName();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.EventOrBuilder
            public j getNameBytes() {
                return ((Event) this.instance).getNameBytes();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.EventOrBuilder
            public long getPreviousTimestampMillis() {
                return ((Event) this.instance).getPreviousTimestampMillis();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.EventOrBuilder
            public long getTimestampMillis() {
                return ((Event) this.instance).getTimestampMillis();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.EventOrBuilder
            public TriggerParam getTriggerParams(int i2) {
                return ((Event) this.instance).getTriggerParams(i2);
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.EventOrBuilder
            public int getTriggerParamsCount() {
                return ((Event) this.instance).getTriggerParamsCount();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.EventOrBuilder
            public List<TriggerParam> getTriggerParamsList() {
                return Collections.unmodifiableList(((Event) this.instance).getTriggerParamsList());
            }

            public Builder removeTriggerParams(int i2) {
                copyOnWrite();
                ((Event) this.instance).removeTriggerParams(i2);
                return this;
            }

            public Builder setCount(int i2) {
                copyOnWrite();
                ((Event) this.instance).setCount(i2);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((Event) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(j jVar) {
                copyOnWrite();
                ((Event) this.instance).setNameBytes(jVar);
                return this;
            }

            public Builder setPreviousTimestampMillis(long j2) {
                copyOnWrite();
                ((Event) this.instance).setPreviousTimestampMillis(j2);
                return this;
            }

            public Builder setTimestampMillis(long j2) {
                copyOnWrite();
                ((Event) this.instance).setTimestampMillis(j2);
                return this;
            }

            public Builder setTriggerParams(int i2, TriggerParam triggerParam) {
                copyOnWrite();
                ((Event) this.instance).setTriggerParams(i2, triggerParam);
                return this;
            }

            private Builder() {
                super(Event.DEFAULT_INSTANCE);
            }

            public Builder addTriggerParams(int i2, TriggerParam triggerParam) {
                copyOnWrite();
                ((Event) this.instance).addTriggerParams(i2, triggerParam);
                return this;
            }

            public Builder setTriggerParams(int i2, TriggerParam.Builder builder) {
                copyOnWrite();
                ((Event) this.instance).setTriggerParams(i2, builder.build());
                return this;
            }

            public Builder addTriggerParams(TriggerParam.Builder builder) {
                copyOnWrite();
                ((Event) this.instance).addTriggerParams(builder.build());
                return this;
            }

            public Builder addTriggerParams(int i2, TriggerParam.Builder builder) {
                copyOnWrite();
                ((Event) this.instance).addTriggerParams(i2, builder.build());
                return this;
            }
        }

        static {
            Event event = new Event();
            DEFAULT_INSTANCE = event;
            GeneratedMessageLite.registerDefaultInstance(Event.class, event);
        }

        private Event() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTriggerParams(Iterable<? extends TriggerParam> iterable) {
            ensureTriggerParamsIsMutable();
            f.h.h.a.addAll((Iterable) iterable, (List) this.triggerParams_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTriggerParams(TriggerParam triggerParam) {
            triggerParam.getClass();
            ensureTriggerParamsIsMutable();
            this.triggerParams_.add(triggerParam);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCount() {
            this.count_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPreviousTimestampMillis() {
            this.previousTimestampMillis_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestampMillis() {
            this.timestampMillis_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTriggerParams() {
            this.triggerParams_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureTriggerParamsIsMutable() {
            y.i<TriggerParam> iVar = this.triggerParams_;
            if (iVar.m0()) {
                return;
            }
            this.triggerParams_ = GeneratedMessageLite.mutableCopy(iVar);
        }

        public static Event getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Event parseDelimitedFrom(InputStream inputStream) {
            return (Event) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Event parseFrom(ByteBuffer byteBuffer) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static u0<Event> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeTriggerParams(int i2) {
            ensureTriggerParamsIsMutable();
            this.triggerParams_.remove(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCount(int i2) {
            this.count_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(j jVar) {
            f.h.h.a.checkByteStringIsUtf8(jVar);
            this.name_ = jVar.n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPreviousTimestampMillis(long j2) {
            this.previousTimestampMillis_ = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestampMillis(long j2) {
            this.timestampMillis_ = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTriggerParams(int i2, TriggerParam triggerParam) {
            triggerParam.getClass();
            ensureTriggerParamsIsMutable();
            this.triggerParams_.set(i2, triggerParam);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003\u0002\u0004\u0002\u0005\u0004", new Object[]{"triggerParams_", TriggerParam.class, "name_", "timestampMillis_", "previousTimestampMillis_", "count_"});
                case 3:
                    return new Event();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0<Event> u0Var = PARSER;
                    if (u0Var == null) {
                        synchronized (Event.class) {
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

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.EventOrBuilder
        public int getCount() {
            return this.count_;
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.EventOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.EventOrBuilder
        public j getNameBytes() {
            return j.d(this.name_);
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.EventOrBuilder
        public long getPreviousTimestampMillis() {
            return this.previousTimestampMillis_;
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.EventOrBuilder
        public long getTimestampMillis() {
            return this.timestampMillis_;
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.EventOrBuilder
        public TriggerParam getTriggerParams(int i2) {
            return this.triggerParams_.get(i2);
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.EventOrBuilder
        public int getTriggerParamsCount() {
            return this.triggerParams_.size();
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.EventOrBuilder
        public List<TriggerParam> getTriggerParamsList() {
            return this.triggerParams_;
        }

        public TriggerParamOrBuilder getTriggerParamsOrBuilder(int i2) {
            return this.triggerParams_.get(i2);
        }

        public List<? extends TriggerParamOrBuilder> getTriggerParamsOrBuilderList() {
            return this.triggerParams_;
        }

        public static Builder newBuilder(Event event) {
            return DEFAULT_INSTANCE.createBuilder(event);
        }

        public static Event parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (Event) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Event parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static Event parseFrom(j jVar) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTriggerParams(int i2, TriggerParam triggerParam) {
            triggerParam.getClass();
            ensureTriggerParamsIsMutable();
            this.triggerParams_.add(i2, triggerParam);
        }

        public static Event parseFrom(j jVar, q qVar) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static Event parseFrom(byte[] bArr) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Event parseFrom(byte[] bArr, q qVar) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static Event parseFrom(InputStream inputStream) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Event parseFrom(InputStream inputStream, q qVar) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Event parseFrom(k kVar) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static Event parseFrom(k kVar, q qVar) {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, qVar);
        }
    }

    /* loaded from: classes2.dex */
    public interface EventOrBuilder extends o0 {
        int getCount();

        @Override // f.h.h.o0
        /* synthetic */ n0 getDefaultInstanceForType();

        String getName();

        j getNameBytes();

        long getPreviousTimestampMillis();

        long getTimestampMillis();

        TriggerParam getTriggerParams(int i2);

        int getTriggerParamsCount();

        List<TriggerParam> getTriggerParamsList();

        @Override // f.h.h.o0
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes2.dex */
    public static final class ExperimentVariant extends GeneratedMessageLite<ExperimentVariant, Builder> implements ExperimentVariantOrBuilder {
        public static final int CONTENT_FIELD_NUMBER = 2;
        private static final ExperimentVariant DEFAULT_INSTANCE;
        public static final int INDEX_FIELD_NUMBER = 1;
        private static volatile u0<ExperimentVariant> PARSER;
        private MessagesProto.Content content_;
        private int index_;

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.a<ExperimentVariant, Builder> implements ExperimentVariantOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearContent() {
                copyOnWrite();
                ((ExperimentVariant) this.instance).clearContent();
                return this;
            }

            public Builder clearIndex() {
                copyOnWrite();
                ((ExperimentVariant) this.instance).clearIndex();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.ExperimentVariantOrBuilder
            public MessagesProto.Content getContent() {
                return ((ExperimentVariant) this.instance).getContent();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.ExperimentVariantOrBuilder
            public int getIndex() {
                return ((ExperimentVariant) this.instance).getIndex();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.ExperimentVariantOrBuilder
            public boolean hasContent() {
                return ((ExperimentVariant) this.instance).hasContent();
            }

            public Builder mergeContent(MessagesProto.Content content) {
                copyOnWrite();
                ((ExperimentVariant) this.instance).mergeContent(content);
                return this;
            }

            public Builder setContent(MessagesProto.Content content) {
                copyOnWrite();
                ((ExperimentVariant) this.instance).setContent(content);
                return this;
            }

            public Builder setIndex(int i2) {
                copyOnWrite();
                ((ExperimentVariant) this.instance).setIndex(i2);
                return this;
            }

            private Builder() {
                super(ExperimentVariant.DEFAULT_INSTANCE);
            }

            public Builder setContent(MessagesProto.Content.Builder builder) {
                copyOnWrite();
                ((ExperimentVariant) this.instance).setContent(builder.build());
                return this;
            }
        }

        static {
            ExperimentVariant experimentVariant = new ExperimentVariant();
            DEFAULT_INSTANCE = experimentVariant;
            GeneratedMessageLite.registerDefaultInstance(ExperimentVariant.class, experimentVariant);
        }

        private ExperimentVariant() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.content_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIndex() {
            this.index_ = 0;
        }

        public static ExperimentVariant getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeContent(MessagesProto.Content content) {
            content.getClass();
            MessagesProto.Content content2 = this.content_;
            if (content2 != null && content2 != MessagesProto.Content.getDefaultInstance()) {
                this.content_ = MessagesProto.Content.newBuilder(this.content_).mergeFrom((MessagesProto.Content.Builder) content).buildPartial();
            } else {
                this.content_ = content;
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ExperimentVariant parseDelimitedFrom(InputStream inputStream) {
            return (ExperimentVariant) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExperimentVariant parseFrom(ByteBuffer byteBuffer) {
            return (ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static u0<ExperimentVariant> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(MessagesProto.Content content) {
            content.getClass();
            this.content_ = content;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndex(int i2) {
            this.index_ = i2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\t", new Object[]{"index_", "content_"});
                case 3:
                    return new ExperimentVariant();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0<ExperimentVariant> u0Var = PARSER;
                    if (u0Var == null) {
                        synchronized (ExperimentVariant.class) {
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

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.ExperimentVariantOrBuilder
        public MessagesProto.Content getContent() {
            MessagesProto.Content content = this.content_;
            return content == null ? MessagesProto.Content.getDefaultInstance() : content;
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.ExperimentVariantOrBuilder
        public int getIndex() {
            return this.index_;
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.ExperimentVariantOrBuilder
        public boolean hasContent() {
            return this.content_ != null;
        }

        public static Builder newBuilder(ExperimentVariant experimentVariant) {
            return DEFAULT_INSTANCE.createBuilder(experimentVariant);
        }

        public static ExperimentVariant parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (ExperimentVariant) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExperimentVariant parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static ExperimentVariant parseFrom(j jVar) {
            return (ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ExperimentVariant parseFrom(j jVar, q qVar) {
            return (ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static ExperimentVariant parseFrom(byte[] bArr) {
            return (ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExperimentVariant parseFrom(byte[] bArr, q qVar) {
            return (ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static ExperimentVariant parseFrom(InputStream inputStream) {
            return (ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExperimentVariant parseFrom(InputStream inputStream, q qVar) {
            return (ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExperimentVariant parseFrom(k kVar) {
            return (ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static ExperimentVariant parseFrom(k kVar, q qVar) {
            return (ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, qVar);
        }
    }

    /* loaded from: classes2.dex */
    public interface ExperimentVariantOrBuilder extends o0 {
        MessagesProto.Content getContent();

        @Override // f.h.h.o0
        /* synthetic */ n0 getDefaultInstanceForType();

        int getIndex();

        boolean hasContent();

        @Override // f.h.h.o0
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes2.dex */
    public enum ExperimentalCampaignState implements y.c {
        UNKNOWN_EXPERIMENTAL_CAMPAIGN_STATE(0),
        EXPERIMENT_DRAFT(1),
        EXPERIMENT_RUNNING(2),
        EXPERIMENT_STOPPED(3),
        EXPERIMENT_ROLLED_OUT(4),
        UNRECOGNIZED(-1);
        
        public static final int EXPERIMENT_DRAFT_VALUE = 1;
        public static final int EXPERIMENT_ROLLED_OUT_VALUE = 4;
        public static final int EXPERIMENT_RUNNING_VALUE = 2;
        public static final int EXPERIMENT_STOPPED_VALUE = 3;
        public static final int UNKNOWN_EXPERIMENTAL_CAMPAIGN_STATE_VALUE = 0;
        private static final y.d<ExperimentalCampaignState> internalValueMap = new y.d<ExperimentalCampaignState>() { // from class: com.google.firebase.inappmessaging.CommonTypesProto.ExperimentalCampaignState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // f.h.h.y.d
            public ExperimentalCampaignState findValueByNumber(int i2) {
                return ExperimentalCampaignState.forNumber(i2);
            }
        };
        private final int value;

        /* loaded from: classes2.dex */
        public static final class ExperimentalCampaignStateVerifier implements y.e {
            public static final y.e INSTANCE = new ExperimentalCampaignStateVerifier();

            private ExperimentalCampaignStateVerifier() {
            }

            @Override // f.h.h.y.e
            public boolean isInRange(int i2) {
                return ExperimentalCampaignState.forNumber(i2) != null;
            }
        }

        ExperimentalCampaignState(int i2) {
            this.value = i2;
        }

        public static ExperimentalCampaignState forNumber(int i2) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                return null;
                            }
                            return EXPERIMENT_ROLLED_OUT;
                        }
                        return EXPERIMENT_STOPPED;
                    }
                    return EXPERIMENT_RUNNING;
                }
                return EXPERIMENT_DRAFT;
            }
            return UNKNOWN_EXPERIMENTAL_CAMPAIGN_STATE;
        }

        public static y.d<ExperimentalCampaignState> internalGetValueMap() {
            return internalValueMap;
        }

        public static y.e internalGetVerifier() {
            return ExperimentalCampaignStateVerifier.INSTANCE;
        }

        @Override // f.h.h.y.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static ExperimentalCampaignState valueOf(int i2) {
            return forNumber(i2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Priority extends GeneratedMessageLite<Priority, Builder> implements PriorityOrBuilder {
        private static final Priority DEFAULT_INSTANCE;
        private static volatile u0<Priority> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 1;
        private int value_;

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.a<Priority, Builder> implements PriorityOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearValue() {
                copyOnWrite();
                ((Priority) this.instance).clearValue();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.PriorityOrBuilder
            public int getValue() {
                return ((Priority) this.instance).getValue();
            }

            public Builder setValue(int i2) {
                copyOnWrite();
                ((Priority) this.instance).setValue(i2);
                return this;
            }

            private Builder() {
                super(Priority.DEFAULT_INSTANCE);
            }
        }

        static {
            Priority priority = new Priority();
            DEFAULT_INSTANCE = priority;
            GeneratedMessageLite.registerDefaultInstance(Priority.class, priority);
        }

        private Priority() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = 0;
        }

        public static Priority getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Priority parseDelimitedFrom(InputStream inputStream) {
            return (Priority) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Priority parseFrom(ByteBuffer byteBuffer) {
            return (Priority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static u0<Priority> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(int i2) {
            this.value_ = i2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
                case 3:
                    return new Priority();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0<Priority> u0Var = PARSER;
                    if (u0Var == null) {
                        synchronized (Priority.class) {
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

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.PriorityOrBuilder
        public int getValue() {
            return this.value_;
        }

        public static Builder newBuilder(Priority priority) {
            return DEFAULT_INSTANCE.createBuilder(priority);
        }

        public static Priority parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (Priority) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Priority parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (Priority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static Priority parseFrom(j jVar) {
            return (Priority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static Priority parseFrom(j jVar, q qVar) {
            return (Priority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static Priority parseFrom(byte[] bArr) {
            return (Priority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Priority parseFrom(byte[] bArr, q qVar) {
            return (Priority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static Priority parseFrom(InputStream inputStream) {
            return (Priority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Priority parseFrom(InputStream inputStream, q qVar) {
            return (Priority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Priority parseFrom(k kVar) {
            return (Priority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static Priority parseFrom(k kVar, q qVar) {
            return (Priority) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, qVar);
        }
    }

    /* loaded from: classes2.dex */
    public interface PriorityOrBuilder extends o0 {
        @Override // f.h.h.o0
        /* synthetic */ n0 getDefaultInstanceForType();

        int getValue();

        @Override // f.h.h.o0
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes2.dex */
    public static final class ScionConversionEvent extends GeneratedMessageLite<ScionConversionEvent, Builder> implements ScionConversionEventOrBuilder {
        private static final ScionConversionEvent DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile u0<ScionConversionEvent> PARSER;
        private String name_ = "";

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.a<ScionConversionEvent, Builder> implements ScionConversionEventOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearName() {
                copyOnWrite();
                ((ScionConversionEvent) this.instance).clearName();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.ScionConversionEventOrBuilder
            public String getName() {
                return ((ScionConversionEvent) this.instance).getName();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.ScionConversionEventOrBuilder
            public j getNameBytes() {
                return ((ScionConversionEvent) this.instance).getNameBytes();
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((ScionConversionEvent) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(j jVar) {
                copyOnWrite();
                ((ScionConversionEvent) this.instance).setNameBytes(jVar);
                return this;
            }

            private Builder() {
                super(ScionConversionEvent.DEFAULT_INSTANCE);
            }
        }

        static {
            ScionConversionEvent scionConversionEvent = new ScionConversionEvent();
            DEFAULT_INSTANCE = scionConversionEvent;
            GeneratedMessageLite.registerDefaultInstance(ScionConversionEvent.class, scionConversionEvent);
        }

        private ScionConversionEvent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        public static ScionConversionEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ScionConversionEvent parseDelimitedFrom(InputStream inputStream) {
            return (ScionConversionEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ScionConversionEvent parseFrom(ByteBuffer byteBuffer) {
            return (ScionConversionEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static u0<ScionConversionEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(j jVar) {
            f.h.h.a.checkByteStringIsUtf8(jVar);
            this.name_ = jVar.n();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"name_"});
                case 3:
                    return new ScionConversionEvent();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0<ScionConversionEvent> u0Var = PARSER;
                    if (u0Var == null) {
                        synchronized (ScionConversionEvent.class) {
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

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.ScionConversionEventOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.ScionConversionEventOrBuilder
        public j getNameBytes() {
            return j.d(this.name_);
        }

        public static Builder newBuilder(ScionConversionEvent scionConversionEvent) {
            return DEFAULT_INSTANCE.createBuilder(scionConversionEvent);
        }

        public static ScionConversionEvent parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (ScionConversionEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ScionConversionEvent parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (ScionConversionEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static ScionConversionEvent parseFrom(j jVar) {
            return (ScionConversionEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ScionConversionEvent parseFrom(j jVar, q qVar) {
            return (ScionConversionEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static ScionConversionEvent parseFrom(byte[] bArr) {
            return (ScionConversionEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ScionConversionEvent parseFrom(byte[] bArr, q qVar) {
            return (ScionConversionEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static ScionConversionEvent parseFrom(InputStream inputStream) {
            return (ScionConversionEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ScionConversionEvent parseFrom(InputStream inputStream, q qVar) {
            return (ScionConversionEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ScionConversionEvent parseFrom(k kVar) {
            return (ScionConversionEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static ScionConversionEvent parseFrom(k kVar, q qVar) {
            return (ScionConversionEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, qVar);
        }
    }

    /* loaded from: classes2.dex */
    public interface ScionConversionEventOrBuilder extends o0 {
        @Override // f.h.h.o0
        /* synthetic */ n0 getDefaultInstanceForType();

        String getName();

        j getNameBytes();

        @Override // f.h.h.o0
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes2.dex */
    public enum Trigger implements y.c {
        UNKNOWN_TRIGGER(0),
        APP_LAUNCH(1),
        ON_FOREGROUND(2),
        UNRECOGNIZED(-1);
        
        public static final int APP_LAUNCH_VALUE = 1;
        public static final int ON_FOREGROUND_VALUE = 2;
        public static final int UNKNOWN_TRIGGER_VALUE = 0;
        private static final y.d<Trigger> internalValueMap = new y.d<Trigger>() { // from class: com.google.firebase.inappmessaging.CommonTypesProto.Trigger.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // f.h.h.y.d
            public Trigger findValueByNumber(int i2) {
                return Trigger.forNumber(i2);
            }
        };
        private final int value;

        /* loaded from: classes2.dex */
        public static final class TriggerVerifier implements y.e {
            public static final y.e INSTANCE = new TriggerVerifier();

            private TriggerVerifier() {
            }

            @Override // f.h.h.y.e
            public boolean isInRange(int i2) {
                return Trigger.forNumber(i2) != null;
            }
        }

        Trigger(int i2) {
            this.value = i2;
        }

        public static Trigger forNumber(int i2) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        return null;
                    }
                    return ON_FOREGROUND;
                }
                return APP_LAUNCH;
            }
            return UNKNOWN_TRIGGER;
        }

        public static y.d<Trigger> internalGetValueMap() {
            return internalValueMap;
        }

        public static y.e internalGetVerifier() {
            return TriggerVerifier.INSTANCE;
        }

        @Override // f.h.h.y.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static Trigger valueOf(int i2) {
            return forNumber(i2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class TriggerParam extends GeneratedMessageLite<TriggerParam, Builder> implements TriggerParamOrBuilder {
        private static final TriggerParam DEFAULT_INSTANCE;
        public static final int DOUBLE_VALUE_FIELD_NUMBER = 5;
        public static final int FLOAT_VALUE_FIELD_NUMBER = 4;
        public static final int INT_VALUE_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile u0<TriggerParam> PARSER = null;
        public static final int STRING_VALUE_FIELD_NUMBER = 2;
        private double doubleValue_;
        private float floatValue_;
        private long intValue_;
        private String name_ = "";
        private String stringValue_ = "";

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.a<TriggerParam, Builder> implements TriggerParamOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDoubleValue() {
                copyOnWrite();
                ((TriggerParam) this.instance).clearDoubleValue();
                return this;
            }

            public Builder clearFloatValue() {
                copyOnWrite();
                ((TriggerParam) this.instance).clearFloatValue();
                return this;
            }

            public Builder clearIntValue() {
                copyOnWrite();
                ((TriggerParam) this.instance).clearIntValue();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((TriggerParam) this.instance).clearName();
                return this;
            }

            public Builder clearStringValue() {
                copyOnWrite();
                ((TriggerParam) this.instance).clearStringValue();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.TriggerParamOrBuilder
            public double getDoubleValue() {
                return ((TriggerParam) this.instance).getDoubleValue();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.TriggerParamOrBuilder
            public float getFloatValue() {
                return ((TriggerParam) this.instance).getFloatValue();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.TriggerParamOrBuilder
            public long getIntValue() {
                return ((TriggerParam) this.instance).getIntValue();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.TriggerParamOrBuilder
            public String getName() {
                return ((TriggerParam) this.instance).getName();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.TriggerParamOrBuilder
            public j getNameBytes() {
                return ((TriggerParam) this.instance).getNameBytes();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.TriggerParamOrBuilder
            public String getStringValue() {
                return ((TriggerParam) this.instance).getStringValue();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.TriggerParamOrBuilder
            public j getStringValueBytes() {
                return ((TriggerParam) this.instance).getStringValueBytes();
            }

            public Builder setDoubleValue(double d2) {
                copyOnWrite();
                ((TriggerParam) this.instance).setDoubleValue(d2);
                return this;
            }

            public Builder setFloatValue(float f2) {
                copyOnWrite();
                ((TriggerParam) this.instance).setFloatValue(f2);
                return this;
            }

            public Builder setIntValue(long j2) {
                copyOnWrite();
                ((TriggerParam) this.instance).setIntValue(j2);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((TriggerParam) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(j jVar) {
                copyOnWrite();
                ((TriggerParam) this.instance).setNameBytes(jVar);
                return this;
            }

            public Builder setStringValue(String str) {
                copyOnWrite();
                ((TriggerParam) this.instance).setStringValue(str);
                return this;
            }

            public Builder setStringValueBytes(j jVar) {
                copyOnWrite();
                ((TriggerParam) this.instance).setStringValueBytes(jVar);
                return this;
            }

            private Builder() {
                super(TriggerParam.DEFAULT_INSTANCE);
            }
        }

        static {
            TriggerParam triggerParam = new TriggerParam();
            DEFAULT_INSTANCE = triggerParam;
            GeneratedMessageLite.registerDefaultInstance(TriggerParam.class, triggerParam);
        }

        private TriggerParam() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDoubleValue() {
            this.doubleValue_ = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFloatValue() {
            this.floatValue_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIntValue() {
            this.intValue_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStringValue() {
            this.stringValue_ = getDefaultInstance().getStringValue();
        }

        public static TriggerParam getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TriggerParam parseDelimitedFrom(InputStream inputStream) {
            return (TriggerParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TriggerParam parseFrom(ByteBuffer byteBuffer) {
            return (TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static u0<TriggerParam> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDoubleValue(double d2) {
            this.doubleValue_ = d2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFloatValue(float f2) {
            this.floatValue_ = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntValue(long j2) {
            this.intValue_ = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(j jVar) {
            f.h.h.a.checkByteStringIsUtf8(jVar);
            this.name_ = jVar.n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValue(String str) {
            str.getClass();
            this.stringValue_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValueBytes(j jVar) {
            f.h.h.a.checkByteStringIsUtf8(jVar);
            this.stringValue_ = jVar.n();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0001\u0005\u0000", new Object[]{"name_", "stringValue_", "intValue_", "floatValue_", "doubleValue_"});
                case 3:
                    return new TriggerParam();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0<TriggerParam> u0Var = PARSER;
                    if (u0Var == null) {
                        synchronized (TriggerParam.class) {
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

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.TriggerParamOrBuilder
        public double getDoubleValue() {
            return this.doubleValue_;
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.TriggerParamOrBuilder
        public float getFloatValue() {
            return this.floatValue_;
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.TriggerParamOrBuilder
        public long getIntValue() {
            return this.intValue_;
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.TriggerParamOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.TriggerParamOrBuilder
        public j getNameBytes() {
            return j.d(this.name_);
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.TriggerParamOrBuilder
        public String getStringValue() {
            return this.stringValue_;
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.TriggerParamOrBuilder
        public j getStringValueBytes() {
            return j.d(this.stringValue_);
        }

        public static Builder newBuilder(TriggerParam triggerParam) {
            return DEFAULT_INSTANCE.createBuilder(triggerParam);
        }

        public static TriggerParam parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (TriggerParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static TriggerParam parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static TriggerParam parseFrom(j jVar) {
            return (TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static TriggerParam parseFrom(j jVar, q qVar) {
            return (TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static TriggerParam parseFrom(byte[] bArr) {
            return (TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TriggerParam parseFrom(byte[] bArr, q qVar) {
            return (TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static TriggerParam parseFrom(InputStream inputStream) {
            return (TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TriggerParam parseFrom(InputStream inputStream, q qVar) {
            return (TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static TriggerParam parseFrom(k kVar) {
            return (TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static TriggerParam parseFrom(k kVar, q qVar) {
            return (TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, qVar);
        }
    }

    /* loaded from: classes2.dex */
    public interface TriggerParamOrBuilder extends o0 {
        @Override // f.h.h.o0
        /* synthetic */ n0 getDefaultInstanceForType();

        double getDoubleValue();

        float getFloatValue();

        long getIntValue();

        String getName();

        j getNameBytes();

        String getStringValue();

        j getStringValueBytes();

        @Override // f.h.h.o0
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes2.dex */
    public static final class TriggeringCondition extends GeneratedMessageLite<TriggeringCondition, Builder> implements TriggeringConditionOrBuilder {
        private static final TriggeringCondition DEFAULT_INSTANCE;
        public static final int EVENT_FIELD_NUMBER = 2;
        public static final int FIAM_TRIGGER_FIELD_NUMBER = 1;
        private static volatile u0<TriggeringCondition> PARSER;
        private int conditionCase_ = 0;
        private Object condition_;

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.a<TriggeringCondition, Builder> implements TriggeringConditionOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCondition() {
                copyOnWrite();
                ((TriggeringCondition) this.instance).clearCondition();
                return this;
            }

            public Builder clearEvent() {
                copyOnWrite();
                ((TriggeringCondition) this.instance).clearEvent();
                return this;
            }

            public Builder clearFiamTrigger() {
                copyOnWrite();
                ((TriggeringCondition) this.instance).clearFiamTrigger();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.TriggeringConditionOrBuilder
            public ConditionCase getConditionCase() {
                return ((TriggeringCondition) this.instance).getConditionCase();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.TriggeringConditionOrBuilder
            public Event getEvent() {
                return ((TriggeringCondition) this.instance).getEvent();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.TriggeringConditionOrBuilder
            public Trigger getFiamTrigger() {
                return ((TriggeringCondition) this.instance).getFiamTrigger();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.TriggeringConditionOrBuilder
            public int getFiamTriggerValue() {
                return ((TriggeringCondition) this.instance).getFiamTriggerValue();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.TriggeringConditionOrBuilder
            public boolean hasEvent() {
                return ((TriggeringCondition) this.instance).hasEvent();
            }

            @Override // com.google.firebase.inappmessaging.CommonTypesProto.TriggeringConditionOrBuilder
            public boolean hasFiamTrigger() {
                return ((TriggeringCondition) this.instance).hasFiamTrigger();
            }

            public Builder mergeEvent(Event event) {
                copyOnWrite();
                ((TriggeringCondition) this.instance).mergeEvent(event);
                return this;
            }

            public Builder setEvent(Event event) {
                copyOnWrite();
                ((TriggeringCondition) this.instance).setEvent(event);
                return this;
            }

            public Builder setFiamTrigger(Trigger trigger) {
                copyOnWrite();
                ((TriggeringCondition) this.instance).setFiamTrigger(trigger);
                return this;
            }

            public Builder setFiamTriggerValue(int i2) {
                copyOnWrite();
                ((TriggeringCondition) this.instance).setFiamTriggerValue(i2);
                return this;
            }

            private Builder() {
                super(TriggeringCondition.DEFAULT_INSTANCE);
            }

            public Builder setEvent(Event.Builder builder) {
                copyOnWrite();
                ((TriggeringCondition) this.instance).setEvent(builder.build());
                return this;
            }
        }

        /* loaded from: classes2.dex */
        public enum ConditionCase {
            FIAM_TRIGGER(1),
            EVENT(2),
            CONDITION_NOT_SET(0);
            
            private final int value;

            ConditionCase(int i2) {
                this.value = i2;
            }

            public static ConditionCase forNumber(int i2) {
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            return null;
                        }
                        return EVENT;
                    }
                    return FIAM_TRIGGER;
                }
                return CONDITION_NOT_SET;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ConditionCase valueOf(int i2) {
                return forNumber(i2);
            }
        }

        static {
            TriggeringCondition triggeringCondition = new TriggeringCondition();
            DEFAULT_INSTANCE = triggeringCondition;
            GeneratedMessageLite.registerDefaultInstance(TriggeringCondition.class, triggeringCondition);
        }

        private TriggeringCondition() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCondition() {
            this.conditionCase_ = 0;
            this.condition_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEvent() {
            if (this.conditionCase_ == 2) {
                this.conditionCase_ = 0;
                this.condition_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFiamTrigger() {
            if (this.conditionCase_ == 1) {
                this.conditionCase_ = 0;
                this.condition_ = null;
            }
        }

        public static TriggeringCondition getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEvent(Event event) {
            event.getClass();
            if (this.conditionCase_ == 2 && this.condition_ != Event.getDefaultInstance()) {
                this.condition_ = Event.newBuilder((Event) this.condition_).mergeFrom((Event.Builder) event).buildPartial();
            } else {
                this.condition_ = event;
            }
            this.conditionCase_ = 2;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TriggeringCondition parseDelimitedFrom(InputStream inputStream) {
            return (TriggeringCondition) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TriggeringCondition parseFrom(ByteBuffer byteBuffer) {
            return (TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static u0<TriggeringCondition> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEvent(Event event) {
            event.getClass();
            this.condition_ = event;
            this.conditionCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFiamTrigger(Trigger trigger) {
            this.condition_ = Integer.valueOf(trigger.getNumber());
            this.conditionCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFiamTriggerValue(int i2) {
            this.conditionCase_ = 1;
            this.condition_ = Integer.valueOf(i2);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002<\u0000", new Object[]{"condition_", "conditionCase_", Event.class});
                case 3:
                    return new TriggeringCondition();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0<TriggeringCondition> u0Var = PARSER;
                    if (u0Var == null) {
                        synchronized (TriggeringCondition.class) {
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

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.TriggeringConditionOrBuilder
        public ConditionCase getConditionCase() {
            return ConditionCase.forNumber(this.conditionCase_);
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.TriggeringConditionOrBuilder
        public Event getEvent() {
            if (this.conditionCase_ == 2) {
                return (Event) this.condition_;
            }
            return Event.getDefaultInstance();
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.TriggeringConditionOrBuilder
        public Trigger getFiamTrigger() {
            if (this.conditionCase_ == 1) {
                Trigger forNumber = Trigger.forNumber(((Integer) this.condition_).intValue());
                return forNumber == null ? Trigger.UNRECOGNIZED : forNumber;
            }
            return Trigger.UNKNOWN_TRIGGER;
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.TriggeringConditionOrBuilder
        public int getFiamTriggerValue() {
            if (this.conditionCase_ == 1) {
                return ((Integer) this.condition_).intValue();
            }
            return 0;
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.TriggeringConditionOrBuilder
        public boolean hasEvent() {
            return this.conditionCase_ == 2;
        }

        @Override // com.google.firebase.inappmessaging.CommonTypesProto.TriggeringConditionOrBuilder
        public boolean hasFiamTrigger() {
            return this.conditionCase_ == 1;
        }

        public static Builder newBuilder(TriggeringCondition triggeringCondition) {
            return DEFAULT_INSTANCE.createBuilder(triggeringCondition);
        }

        public static TriggeringCondition parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (TriggeringCondition) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static TriggeringCondition parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static TriggeringCondition parseFrom(j jVar) {
            return (TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static TriggeringCondition parseFrom(j jVar, q qVar) {
            return (TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static TriggeringCondition parseFrom(byte[] bArr) {
            return (TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TriggeringCondition parseFrom(byte[] bArr, q qVar) {
            return (TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static TriggeringCondition parseFrom(InputStream inputStream) {
            return (TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TriggeringCondition parseFrom(InputStream inputStream, q qVar) {
            return (TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static TriggeringCondition parseFrom(k kVar) {
            return (TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static TriggeringCondition parseFrom(k kVar, q qVar) {
            return (TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, qVar);
        }
    }

    /* loaded from: classes2.dex */
    public interface TriggeringConditionOrBuilder extends o0 {
        TriggeringCondition.ConditionCase getConditionCase();

        @Override // f.h.h.o0
        /* synthetic */ n0 getDefaultInstanceForType();

        Event getEvent();

        Trigger getFiamTrigger();

        int getFiamTriggerValue();

        boolean hasEvent();

        boolean hasFiamTrigger();

        @Override // f.h.h.o0
        /* synthetic */ boolean isInitialized();
    }

    private CommonTypesProto() {
    }

    public static void registerAllExtensions(q qVar) {
    }
}
