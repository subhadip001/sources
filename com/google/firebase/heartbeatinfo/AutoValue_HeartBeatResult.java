package com.google.firebase.heartbeatinfo;

import f.a.b.a.a;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class AutoValue_HeartBeatResult extends HeartBeatResult {
    private final List<String> usedDates;
    private final String userAgent;

    public AutoValue_HeartBeatResult(String str, List<String> list) {
        Objects.requireNonNull(str, "Null userAgent");
        this.userAgent = str;
        Objects.requireNonNull(list, "Null usedDates");
        this.usedDates = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof HeartBeatResult) {
            HeartBeatResult heartBeatResult = (HeartBeatResult) obj;
            return this.userAgent.equals(heartBeatResult.getUserAgent()) && this.usedDates.equals(heartBeatResult.getUsedDates());
        }
        return false;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public List<String> getUsedDates() {
        return this.usedDates;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public String getUserAgent() {
        return this.userAgent;
    }

    public int hashCode() {
        return ((this.userAgent.hashCode() ^ 1000003) * 1000003) ^ this.usedDates.hashCode();
    }

    public String toString() {
        StringBuilder A = a.A("HeartBeatResult{userAgent=");
        A.append(this.userAgent);
        A.append(", usedDates=");
        A.append(this.usedDates);
        A.append("}");
        return A.toString();
    }
}
