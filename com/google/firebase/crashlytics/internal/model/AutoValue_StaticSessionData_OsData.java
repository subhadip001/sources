package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import f.a.b.a.a;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class AutoValue_StaticSessionData_OsData extends StaticSessionData.OsData {
    private final boolean isRooted;
    private final String osCodeName;
    private final String osRelease;

    public AutoValue_StaticSessionData_OsData(String str, String str2, boolean z) {
        Objects.requireNonNull(str, "Null osRelease");
        this.osRelease = str;
        Objects.requireNonNull(str2, "Null osCodeName");
        this.osCodeName = str2;
        this.isRooted = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StaticSessionData.OsData) {
            StaticSessionData.OsData osData = (StaticSessionData.OsData) obj;
            return this.osRelease.equals(osData.osRelease()) && this.osCodeName.equals(osData.osCodeName()) && this.isRooted == osData.isRooted();
        }
        return false;
    }

    public int hashCode() {
        return ((((this.osRelease.hashCode() ^ 1000003) * 1000003) ^ this.osCodeName.hashCode()) * 1000003) ^ (this.isRooted ? 1231 : 1237);
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public boolean isRooted() {
        return this.isRooted;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public String osCodeName() {
        return this.osCodeName;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public String osRelease() {
        return this.osRelease;
    }

    public String toString() {
        StringBuilder A = a.A("OsData{osRelease=");
        A.append(this.osRelease);
        A.append(", osCodeName=");
        A.append(this.osCodeName);
        A.append(", isRooted=");
        A.append(this.isRooted);
        A.append("}");
        return A.toString();
    }
}
