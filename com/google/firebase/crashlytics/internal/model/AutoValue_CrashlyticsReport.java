package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import f.a.b.a.a;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class AutoValue_CrashlyticsReport extends CrashlyticsReport {
    private final String buildVersion;
    private final String displayVersion;
    private final String gmpAppId;
    private final String installationUuid;
    private final CrashlyticsReport.FilesPayload ndkPayload;
    private final int platform;
    private final String sdkVersion;
    private final CrashlyticsReport.Session session;

    /* loaded from: classes2.dex */
    public static final class Builder extends CrashlyticsReport.Builder {
        private String buildVersion;
        private String displayVersion;
        private String gmpAppId;
        private String installationUuid;
        private CrashlyticsReport.FilesPayload ndkPayload;
        private Integer platform;
        private String sdkVersion;
        private CrashlyticsReport.Session session;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport build() {
            String str = this.sdkVersion == null ? " sdkVersion" : "";
            if (this.gmpAppId == null) {
                str = a.p(str, " gmpAppId");
            }
            if (this.platform == null) {
                str = a.p(str, " platform");
            }
            if (this.installationUuid == null) {
                str = a.p(str, " installationUuid");
            }
            if (this.buildVersion == null) {
                str = a.p(str, " buildVersion");
            }
            if (this.displayVersion == null) {
                str = a.p(str, " displayVersion");
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport(this.sdkVersion, this.gmpAppId, this.platform.intValue(), this.installationUuid, this.buildVersion, this.displayVersion, this.session, this.ndkPayload);
            }
            throw new IllegalStateException(a.p("Missing required properties:", str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setBuildVersion(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.buildVersion = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setDisplayVersion(String str) {
            Objects.requireNonNull(str, "Null displayVersion");
            this.displayVersion = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setGmpAppId(String str) {
            Objects.requireNonNull(str, "Null gmpAppId");
            this.gmpAppId = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setInstallationUuid(String str) {
            Objects.requireNonNull(str, "Null installationUuid");
            this.installationUuid = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setNdkPayload(CrashlyticsReport.FilesPayload filesPayload) {
            this.ndkPayload = filesPayload;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setPlatform(int i2) {
            this.platform = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setSdkVersion(String str) {
            Objects.requireNonNull(str, "Null sdkVersion");
            this.sdkVersion = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setSession(CrashlyticsReport.Session session) {
            this.session = session;
            return this;
        }

        public Builder() {
        }

        private Builder(CrashlyticsReport crashlyticsReport) {
            this.sdkVersion = crashlyticsReport.getSdkVersion();
            this.gmpAppId = crashlyticsReport.getGmpAppId();
            this.platform = Integer.valueOf(crashlyticsReport.getPlatform());
            this.installationUuid = crashlyticsReport.getInstallationUuid();
            this.buildVersion = crashlyticsReport.getBuildVersion();
            this.displayVersion = crashlyticsReport.getDisplayVersion();
            this.session = crashlyticsReport.getSession();
            this.ndkPayload = crashlyticsReport.getNdkPayload();
        }
    }

    public boolean equals(Object obj) {
        CrashlyticsReport.Session session;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport) {
            CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
            if (this.sdkVersion.equals(crashlyticsReport.getSdkVersion()) && this.gmpAppId.equals(crashlyticsReport.getGmpAppId()) && this.platform == crashlyticsReport.getPlatform() && this.installationUuid.equals(crashlyticsReport.getInstallationUuid()) && this.buildVersion.equals(crashlyticsReport.getBuildVersion()) && this.displayVersion.equals(crashlyticsReport.getDisplayVersion()) && ((session = this.session) != null ? session.equals(crashlyticsReport.getSession()) : crashlyticsReport.getSession() == null)) {
                CrashlyticsReport.FilesPayload filesPayload = this.ndkPayload;
                if (filesPayload == null) {
                    if (crashlyticsReport.getNdkPayload() == null) {
                        return true;
                    }
                } else if (filesPayload.equals(crashlyticsReport.getNdkPayload())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String getBuildVersion() {
        return this.buildVersion;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String getDisplayVersion() {
        return this.displayVersion;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String getGmpAppId() {
        return this.gmpAppId;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String getInstallationUuid() {
        return this.installationUuid;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public CrashlyticsReport.FilesPayload getNdkPayload() {
        return this.ndkPayload;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public int getPlatform() {
        return this.platform;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String getSdkVersion() {
        return this.sdkVersion;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public CrashlyticsReport.Session getSession() {
        return this.session;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.sdkVersion.hashCode() ^ 1000003) * 1000003) ^ this.gmpAppId.hashCode()) * 1000003) ^ this.platform) * 1000003) ^ this.installationUuid.hashCode()) * 1000003) ^ this.buildVersion.hashCode()) * 1000003) ^ this.displayVersion.hashCode()) * 1000003;
        CrashlyticsReport.Session session = this.session;
        int hashCode2 = (hashCode ^ (session == null ? 0 : session.hashCode())) * 1000003;
        CrashlyticsReport.FilesPayload filesPayload = this.ndkPayload;
        return hashCode2 ^ (filesPayload != null ? filesPayload.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public CrashlyticsReport.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder A = a.A("CrashlyticsReport{sdkVersion=");
        A.append(this.sdkVersion);
        A.append(", gmpAppId=");
        A.append(this.gmpAppId);
        A.append(", platform=");
        A.append(this.platform);
        A.append(", installationUuid=");
        A.append(this.installationUuid);
        A.append(", buildVersion=");
        A.append(this.buildVersion);
        A.append(", displayVersion=");
        A.append(this.displayVersion);
        A.append(", session=");
        A.append(this.session);
        A.append(", ndkPayload=");
        A.append(this.ndkPayload);
        A.append("}");
        return A.toString();
    }

    private AutoValue_CrashlyticsReport(String str, String str2, int i2, String str3, String str4, String str5, CrashlyticsReport.Session session, CrashlyticsReport.FilesPayload filesPayload) {
        this.sdkVersion = str;
        this.gmpAppId = str2;
        this.platform = i2;
        this.installationUuid = str3;
        this.buildVersion = str4;
        this.displayVersion = str5;
        this.session = session;
        this.ndkPayload = filesPayload;
    }
}
