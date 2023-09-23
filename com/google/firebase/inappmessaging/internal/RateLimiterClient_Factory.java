package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.internal.time.Clock;
import h.a.a;

/* loaded from: classes2.dex */
public final class RateLimiterClient_Factory implements Factory<RateLimiterClient> {
    private final a<Clock> clockProvider;
    private final a<ProtoStorageClient> storageClientProvider;

    public RateLimiterClient_Factory(a<ProtoStorageClient> aVar, a<Clock> aVar2) {
        this.storageClientProvider = aVar;
        this.clockProvider = aVar2;
    }

    public static RateLimiterClient_Factory create(a<ProtoStorageClient> aVar, a<Clock> aVar2) {
        return new RateLimiterClient_Factory(aVar, aVar2);
    }

    public static RateLimiterClient newInstance(ProtoStorageClient protoStorageClient, Clock clock) {
        return new RateLimiterClient(protoStorageClient, clock);
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public RateLimiterClient get() {
        return newInstance(this.storageClientProvider.get(), this.clockProvider.get());
    }
}
