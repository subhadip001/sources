package com.google.firebase.heartbeatinfo;

import f.a.b.a.a;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class AutoValue_SdkHeartBeatResult extends SdkHeartBeatResult {
    private final long millis;
    private final String sdkName;

    public AutoValue_SdkHeartBeatResult(String str, long j2) {
        Objects.requireNonNull(str, "Null sdkName");
        this.sdkName = str;
        this.millis = j2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SdkHeartBeatResult) {
            SdkHeartBeatResult sdkHeartBeatResult = (SdkHeartBeatResult) obj;
            return this.sdkName.equals(sdkHeartBeatResult.getSdkName()) && this.millis == sdkHeartBeatResult.getMillis();
        }
        return false;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public long getMillis() {
        return this.millis;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public String getSdkName() {
        return this.sdkName;
    }

    public int hashCode() {
        long j2 = this.millis;
        return ((this.sdkName.hashCode() ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder A = a.A("SdkHeartBeatResult{sdkName=");
        A.append(this.sdkName);
        A.append(", millis=");
        A.append(this.millis);
        A.append("}");
        return A.toString();
    }
}
