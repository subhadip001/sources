package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import f.a.b.a.a;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal extends CrashlyticsReport.Session.Event.Application.Execution.Signal {
    private final long address;
    private final String code;
    private final String name;

    /* loaded from: classes2.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder {
        private Long address;
        private String code;
        private String name;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Signal build() {
            String str = this.name == null ? " name" : "";
            if (this.code == null) {
                str = a.p(str, " code");
            }
            if (this.address == null) {
                str = a.p(str, " address");
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal(this.name, this.code, this.address.longValue());
            }
            throw new IllegalStateException(a.p("Missing required properties:", str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setAddress(long j2) {
            this.address = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setCode(String str) {
            Objects.requireNonNull(str, "Null code");
            this.code = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setName(String str) {
            Objects.requireNonNull(str, "Null name");
            this.name = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Signal) {
            CrashlyticsReport.Session.Event.Application.Execution.Signal signal = (CrashlyticsReport.Session.Event.Application.Execution.Signal) obj;
            return this.name.equals(signal.getName()) && this.code.equals(signal.getCode()) && this.address == signal.getAddress();
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    public long getAddress() {
        return this.address;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    public String getCode() {
        return this.code;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        long j2 = this.address;
        return ((((this.name.hashCode() ^ 1000003) * 1000003) ^ this.code.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder A = a.A("Signal{name=");
        A.append(this.name);
        A.append(", code=");
        A.append(this.code);
        A.append(", address=");
        A.append(this.address);
        A.append("}");
        return A.toString();
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal(String str, String str2, long j2) {
        this.name = str;
        this.code = str2;
        this.address = j2;
    }
}
