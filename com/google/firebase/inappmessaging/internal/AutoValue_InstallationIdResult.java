package com.google.firebase.inappmessaging.internal;

import com.google.firebase.installations.InstallationTokenResult;
import f.a.b.a.a;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class AutoValue_InstallationIdResult extends InstallationIdResult {
    private final String installationId;
    private final InstallationTokenResult installationTokenResult;

    public AutoValue_InstallationIdResult(String str, InstallationTokenResult installationTokenResult) {
        Objects.requireNonNull(str, "Null installationId");
        this.installationId = str;
        Objects.requireNonNull(installationTokenResult, "Null installationTokenResult");
        this.installationTokenResult = installationTokenResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallationIdResult) {
            InstallationIdResult installationIdResult = (InstallationIdResult) obj;
            return this.installationId.equals(installationIdResult.installationId()) && this.installationTokenResult.equals(installationIdResult.installationTokenResult());
        }
        return false;
    }

    public int hashCode() {
        return ((this.installationId.hashCode() ^ 1000003) * 1000003) ^ this.installationTokenResult.hashCode();
    }

    @Override // com.google.firebase.inappmessaging.internal.InstallationIdResult
    public String installationId() {
        return this.installationId;
    }

    @Override // com.google.firebase.inappmessaging.internal.InstallationIdResult
    public InstallationTokenResult installationTokenResult() {
        return this.installationTokenResult;
    }

    public String toString() {
        StringBuilder A = a.A("InstallationIdResult{installationId=");
        A.append(this.installationId);
        A.append(", installationTokenResult=");
        A.append(this.installationTokenResult);
        A.append("}");
        return A.toString();
    }
}
