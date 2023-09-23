package com.google.firebase.inappmessaging.model;

import com.google.firebase.inappmessaging.model.RateLimit;
import f.a.b.a.a;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class AutoValue_RateLimit extends RateLimit {
    private final long limit;
    private final String limiterKey;
    private final long timeToLiveMillis;

    /* loaded from: classes2.dex */
    public static final class Builder extends RateLimit.Builder {
        private Long limit;
        private String limiterKey;
        private Long timeToLiveMillis;

        @Override // com.google.firebase.inappmessaging.model.RateLimit.Builder
        public RateLimit build() {
            String str = this.limiterKey == null ? " limiterKey" : "";
            if (this.limit == null) {
                str = a.p(str, " limit");
            }
            if (this.timeToLiveMillis == null) {
                str = a.p(str, " timeToLiveMillis");
            }
            if (str.isEmpty()) {
                return new AutoValue_RateLimit(this.limiterKey, this.limit.longValue(), this.timeToLiveMillis.longValue());
            }
            throw new IllegalStateException(a.p("Missing required properties:", str));
        }

        @Override // com.google.firebase.inappmessaging.model.RateLimit.Builder
        public RateLimit.Builder setLimit(long j2) {
            this.limit = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.inappmessaging.model.RateLimit.Builder
        public RateLimit.Builder setLimiterKey(String str) {
            Objects.requireNonNull(str, "Null limiterKey");
            this.limiterKey = str;
            return this;
        }

        @Override // com.google.firebase.inappmessaging.model.RateLimit.Builder
        public RateLimit.Builder setTimeToLiveMillis(long j2) {
            this.timeToLiveMillis = Long.valueOf(j2);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RateLimit) {
            RateLimit rateLimit = (RateLimit) obj;
            return this.limiterKey.equals(rateLimit.limiterKey()) && this.limit == rateLimit.limit() && this.timeToLiveMillis == rateLimit.timeToLiveMillis();
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.limit;
        long j3 = this.timeToLiveMillis;
        return ((((this.limiterKey.hashCode() ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    @Override // com.google.firebase.inappmessaging.model.RateLimit
    public long limit() {
        return this.limit;
    }

    @Override // com.google.firebase.inappmessaging.model.RateLimit
    public String limiterKey() {
        return this.limiterKey;
    }

    @Override // com.google.firebase.inappmessaging.model.RateLimit
    public long timeToLiveMillis() {
        return this.timeToLiveMillis;
    }

    public String toString() {
        StringBuilder A = a.A("RateLimit{limiterKey=");
        A.append(this.limiterKey);
        A.append(", limit=");
        A.append(this.limit);
        A.append(", timeToLiveMillis=");
        A.append(this.timeToLiveMillis);
        A.append("}");
        return A.toString();
    }

    private AutoValue_RateLimit(String str, long j2, long j3) {
        this.limiterKey = str;
        this.limit = j2;
        this.timeToLiveMillis = j3;
    }
}
