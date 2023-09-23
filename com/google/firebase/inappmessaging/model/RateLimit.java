package com.google.firebase.inappmessaging.model;

import com.google.firebase.inappmessaging.model.AutoValue_RateLimit;

/* loaded from: classes2.dex */
public abstract class RateLimit {

    /* loaded from: classes2.dex */
    public static abstract class Builder {
        public abstract RateLimit build();

        public abstract Builder setLimit(long j2);

        public abstract Builder setLimiterKey(String str);

        public abstract Builder setTimeToLiveMillis(long j2);
    }

    public static Builder builder() {
        return new AutoValue_RateLimit.Builder();
    }

    public abstract long limit();

    public abstract String limiterKey();

    public abstract long timeToLiveMillis();
}
