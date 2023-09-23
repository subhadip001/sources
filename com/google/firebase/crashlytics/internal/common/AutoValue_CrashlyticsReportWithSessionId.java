package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import f.a.b.a.a;
import java.io.File;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class AutoValue_CrashlyticsReportWithSessionId extends CrashlyticsReportWithSessionId {
    private final CrashlyticsReport report;
    private final File reportFile;
    private final String sessionId;

    public AutoValue_CrashlyticsReportWithSessionId(CrashlyticsReport crashlyticsReport, String str, File file) {
        Objects.requireNonNull(crashlyticsReport, "Null report");
        this.report = crashlyticsReport;
        Objects.requireNonNull(str, "Null sessionId");
        this.sessionId = str;
        Objects.requireNonNull(file, "Null reportFile");
        this.reportFile = file;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReportWithSessionId) {
            CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) obj;
            return this.report.equals(crashlyticsReportWithSessionId.getReport()) && this.sessionId.equals(crashlyticsReportWithSessionId.getSessionId()) && this.reportFile.equals(crashlyticsReportWithSessionId.getReportFile());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public CrashlyticsReport getReport() {
        return this.report;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public File getReportFile() {
        return this.reportFile;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return ((((this.report.hashCode() ^ 1000003) * 1000003) ^ this.sessionId.hashCode()) * 1000003) ^ this.reportFile.hashCode();
    }

    public String toString() {
        StringBuilder A = a.A("CrashlyticsReportWithSessionId{report=");
        A.append(this.report);
        A.append(", sessionId=");
        A.append(this.sessionId);
        A.append(", reportFile=");
        A.append(this.reportFile);
        A.append("}");
        return A.toString();
    }
}
