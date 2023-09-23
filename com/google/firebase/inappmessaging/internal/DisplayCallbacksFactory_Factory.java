package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.inappmessaging.model.RateLimit;
import h.a.a;

/* loaded from: classes2.dex */
public final class DisplayCallbacksFactory_Factory implements Factory<DisplayCallbacksFactory> {
    private final a<RateLimit> appForegroundRateLimitProvider;
    private final a<CampaignCacheClient> campaignCacheClientProvider;
    private final a<Clock> clockProvider;
    private final a<DataCollectionHelper> dataCollectionHelperProvider;
    private final a<ImpressionStorageClient> impressionStorageClientProvider;
    private final a<MetricsLoggerClient> metricsLoggerClientProvider;
    private final a<RateLimiterClient> rateLimiterClientProvider;
    private final a<Schedulers> schedulersProvider;

    public DisplayCallbacksFactory_Factory(a<ImpressionStorageClient> aVar, a<Clock> aVar2, a<Schedulers> aVar3, a<RateLimiterClient> aVar4, a<CampaignCacheClient> aVar5, a<RateLimit> aVar6, a<MetricsLoggerClient> aVar7, a<DataCollectionHelper> aVar8) {
        this.impressionStorageClientProvider = aVar;
        this.clockProvider = aVar2;
        this.schedulersProvider = aVar3;
        this.rateLimiterClientProvider = aVar4;
        this.campaignCacheClientProvider = aVar5;
        this.appForegroundRateLimitProvider = aVar6;
        this.metricsLoggerClientProvider = aVar7;
        this.dataCollectionHelperProvider = aVar8;
    }

    public static DisplayCallbacksFactory_Factory create(a<ImpressionStorageClient> aVar, a<Clock> aVar2, a<Schedulers> aVar3, a<RateLimiterClient> aVar4, a<CampaignCacheClient> aVar5, a<RateLimit> aVar6, a<MetricsLoggerClient> aVar7, a<DataCollectionHelper> aVar8) {
        return new DisplayCallbacksFactory_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    public static DisplayCallbacksFactory newInstance(ImpressionStorageClient impressionStorageClient, Clock clock, Schedulers schedulers, RateLimiterClient rateLimiterClient, CampaignCacheClient campaignCacheClient, RateLimit rateLimit, MetricsLoggerClient metricsLoggerClient, DataCollectionHelper dataCollectionHelper) {
        return new DisplayCallbacksFactory(impressionStorageClient, clock, schedulers, rateLimiterClient, campaignCacheClient, rateLimit, metricsLoggerClient, dataCollectionHelper);
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public DisplayCallbacksFactory get() {
        return newInstance(this.impressionStorageClientProvider.get(), this.clockProvider.get(), this.schedulersProvider.get(), this.rateLimiterClientProvider.get(), this.campaignCacheClientProvider.get(), this.appForegroundRateLimitProvider.get(), this.metricsLoggerClientProvider.get(), this.dataCollectionHelperProvider.get());
    }
}
