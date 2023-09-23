package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.annotations.Encodable;
import f.a.b.a.a;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class AutoValue_CrashlyticsReport_Session extends CrashlyticsReport.Session {
    private final CrashlyticsReport.Session.Application app;
    private final boolean crashed;
    private final CrashlyticsReport.Session.Device device;
    private final Long endedAt;
    private final ImmutableList<CrashlyticsReport.Session.Event> events;
    private final String generator;
    private final int generatorType;
    private final String identifier;
    private final CrashlyticsReport.Session.OperatingSystem os;
    private final long startedAt;
    private final CrashlyticsReport.Session.User user;

    /* loaded from: classes2.dex */
    public static final class Builder extends CrashlyticsReport.Session.Builder {
        private CrashlyticsReport.Session.Application app;
        private Boolean crashed;
        private CrashlyticsReport.Session.Device device;
        private Long endedAt;
        private ImmutableList<CrashlyticsReport.Session.Event> events;
        private String generator;
        private Integer generatorType;
        private String identifier;
        private CrashlyticsReport.Session.OperatingSystem os;
        private Long startedAt;
        private CrashlyticsReport.Session.User user;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session build() {
            String str = this.generator == null ? " generator" : "";
            if (this.identifier == null) {
                str = a.p(str, " identifier");
            }
            if (this.startedAt == null) {
                str = a.p(str, " startedAt");
            }
            if (this.crashed == null) {
                str = a.p(str, " crashed");
            }
            if (this.app == null) {
                str = a.p(str, " app");
            }
            if (this.generatorType == null) {
                str = a.p(str, " generatorType");
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session(this.generator, this.identifier, this.startedAt.longValue(), this.endedAt, this.crashed.booleanValue(), this.app, this.user, this.os, this.device, this.events, this.generatorType.intValue());
            }
            throw new IllegalStateException(a.p("Missing required properties:", str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setApp(CrashlyticsReport.Session.Application application) {
            Objects.requireNonNull(application, "Null app");
            this.app = application;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setCrashed(boolean z) {
            this.crashed = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setDevice(CrashlyticsReport.Session.Device device) {
            this.device = device;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setEndedAt(Long l2) {
            this.endedAt = l2;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setEvents(ImmutableList<CrashlyticsReport.Session.Event> immutableList) {
            this.events = immutableList;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setGenerator(String str) {
            Objects.requireNonNull(str, "Null generator");
            this.generator = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setGeneratorType(int i2) {
            this.generatorType = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setIdentifier(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.identifier = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setOs(CrashlyticsReport.Session.OperatingSystem operatingSystem) {
            this.os = operatingSystem;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setStartedAt(long j2) {
            this.startedAt = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setUser(CrashlyticsReport.Session.User user) {
            this.user = user;
            return this;
        }

        public Builder() {
        }

        private Builder(CrashlyticsReport.Session session) {
            this.generator = session.getGenerator();
            this.identifier = session.getIdentifier();
            this.startedAt = Long.valueOf(session.getStartedAt());
            this.endedAt = session.getEndedAt();
            this.crashed = Boolean.valueOf(session.isCrashed());
            this.app = session.getApp();
            this.user = session.getUser();
            this.os = session.getOs();
            this.device = session.getDevice();
            this.events = session.getEvents();
            this.generatorType = Integer.valueOf(session.getGeneratorType());
        }
    }

    public boolean equals(Object obj) {
        Long l2;
        CrashlyticsReport.Session.User user;
        CrashlyticsReport.Session.OperatingSystem operatingSystem;
        CrashlyticsReport.Session.Device device;
        ImmutableList<CrashlyticsReport.Session.Event> immutableList;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session) {
            CrashlyticsReport.Session session = (CrashlyticsReport.Session) obj;
            return this.generator.equals(session.getGenerator()) && this.identifier.equals(session.getIdentifier()) && this.startedAt == session.getStartedAt() && ((l2 = this.endedAt) != null ? l2.equals(session.getEndedAt()) : session.getEndedAt() == null) && this.crashed == session.isCrashed() && this.app.equals(session.getApp()) && ((user = this.user) != null ? user.equals(session.getUser()) : session.getUser() == null) && ((operatingSystem = this.os) != null ? operatingSystem.equals(session.getOs()) : session.getOs() == null) && ((device = this.device) != null ? device.equals(session.getDevice()) : session.getDevice() == null) && ((immutableList = this.events) != null ? immutableList.equals(session.getEvents()) : session.getEvents() == null) && this.generatorType == session.getGeneratorType();
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public CrashlyticsReport.Session.Application getApp() {
        return this.app;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public CrashlyticsReport.Session.Device getDevice() {
        return this.device;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public Long getEndedAt() {
        return this.endedAt;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public ImmutableList<CrashlyticsReport.Session.Event> getEvents() {
        return this.events;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public String getGenerator() {
        return this.generator;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public int getGeneratorType() {
        return this.generatorType;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @Encodable.Ignore
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public CrashlyticsReport.Session.OperatingSystem getOs() {
        return this.os;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public long getStartedAt() {
        return this.startedAt;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public CrashlyticsReport.Session.User getUser() {
        return this.user;
    }

    public int hashCode() {
        long j2 = this.startedAt;
        int hashCode = (((((this.generator.hashCode() ^ 1000003) * 1000003) ^ this.identifier.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Long l2 = this.endedAt;
        int hashCode2 = (((((hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003) ^ (this.crashed ? 1231 : 1237)) * 1000003) ^ this.app.hashCode()) * 1000003;
        CrashlyticsReport.Session.User user = this.user;
        int hashCode3 = (hashCode2 ^ (user == null ? 0 : user.hashCode())) * 1000003;
        CrashlyticsReport.Session.OperatingSystem operatingSystem = this.os;
        int hashCode4 = (hashCode3 ^ (operatingSystem == null ? 0 : operatingSystem.hashCode())) * 1000003;
        CrashlyticsReport.Session.Device device = this.device;
        int hashCode5 = (hashCode4 ^ (device == null ? 0 : device.hashCode())) * 1000003;
        ImmutableList<CrashlyticsReport.Session.Event> immutableList = this.events;
        return ((hashCode5 ^ (immutableList != null ? immutableList.hashCode() : 0)) * 1000003) ^ this.generatorType;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public boolean isCrashed() {
        return this.crashed;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public CrashlyticsReport.Session.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder A = a.A("Session{generator=");
        A.append(this.generator);
        A.append(", identifier=");
        A.append(this.identifier);
        A.append(", startedAt=");
        A.append(this.startedAt);
        A.append(", endedAt=");
        A.append(this.endedAt);
        A.append(", crashed=");
        A.append(this.crashed);
        A.append(", app=");
        A.append(this.app);
        A.append(", user=");
        A.append(this.user);
        A.append(", os=");
        A.append(this.os);
        A.append(", device=");
        A.append(this.device);
        A.append(", events=");
        A.append(this.events);
        A.append(", generatorType=");
        return a.t(A, this.generatorType, "}");
    }

    private AutoValue_CrashlyticsReport_Session(String str, String str2, long j2, Long l2, boolean z, CrashlyticsReport.Session.Application application, CrashlyticsReport.Session.User user, CrashlyticsReport.Session.OperatingSystem operatingSystem, CrashlyticsReport.Session.Device device, ImmutableList<CrashlyticsReport.Session.Event> immutableList, int i2) {
        this.generator = str;
        this.identifier = str2;
        this.startedAt = j2;
        this.endedAt = l2;
        this.crashed = z;
        this.app = application;
        this.user = user;
        this.os = operatingSystem;
        this.device = device;
        this.events = immutableList;
        this.generatorType = i2;
    }
}
