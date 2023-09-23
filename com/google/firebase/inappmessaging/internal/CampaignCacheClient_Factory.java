package com.google.firebase.inappmessaging.internal;

import android.app.Application;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.internal.time.Clock;
import h.a.a;

/* loaded from: classes2.dex */
public final class CampaignCacheClient_Factory implements Factory<CampaignCacheClient> {
    private final a<Application> applicationProvider;
    private final a<Clock> clockProvider;
    private final a<ProtoStorageClient> storageClientProvider;

    public CampaignCacheClient_Factory(a<ProtoStorageClient> aVar, a<Application> aVar2, a<Clock> aVar3) {
        this.storageClientProvider = aVar;
        this.applicationProvider = aVar2;
        this.clockProvider = aVar3;
    }

    public static CampaignCacheClient_Factory create(a<ProtoStorageClient> aVar, a<Application> aVar2, a<Clock> aVar3) {
        return new CampaignCacheClient_Factory(aVar, aVar2, aVar3);
    }

    public static CampaignCacheClient newInstance(ProtoStorageClient protoStorageClient, Application application, Clock clock) {
        return new CampaignCacheClient(protoStorageClient, application, clock);
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public CampaignCacheClient get() {
        return newInstance(this.storageClientProvider.get(), this.applicationProvider.get(), this.clockProvider.get());
    }
}
