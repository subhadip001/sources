package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.inappmessaging.model.RateLimit;
import com.google.firebase.installations.FirebaseInstallationsApi;
import h.a.a;

/* loaded from: classes2.dex */
public final class InAppMessageStreamManager_Factory implements Factory<InAppMessageStreamManager> {
    private final a<AbtIntegrationHelper> abtIntegrationHelperProvider;
    private final a<AnalyticsEventsManager> analyticsEventsManagerProvider;
    private final a<ApiClient> apiClientProvider;
    private final a<g.c.u.a<String>> appForegroundEventFlowableProvider;
    private final a<RateLimit> appForegroundRateLimitProvider;
    private final a<CampaignCacheClient> campaignCacheClientProvider;
    private final a<Clock> clockProvider;
    private final a<DataCollectionHelper> dataCollectionHelperProvider;
    private final a<FirebaseInstallationsApi> firebaseInstallationsProvider;
    private final a<ImpressionStorageClient> impressionStorageClientProvider;
    private final a<g.c.u.a<String>> programmaticTriggerEventFlowableProvider;
    private final a<RateLimiterClient> rateLimiterClientProvider;
    private final a<Schedulers> schedulersProvider;
    private final a<TestDeviceHelper> testDeviceHelperProvider;

    public InAppMessageStreamManager_Factory(a<g.c.u.a<String>> aVar, a<g.c.u.a<String>> aVar2, a<CampaignCacheClient> aVar3, a<Clock> aVar4, a<ApiClient> aVar5, a<AnalyticsEventsManager> aVar6, a<Schedulers> aVar7, a<ImpressionStorageClient> aVar8, a<RateLimiterClient> aVar9, a<RateLimit> aVar10, a<TestDeviceHelper> aVar11, a<FirebaseInstallationsApi> aVar12, a<DataCollectionHelper> aVar13, a<AbtIntegrationHelper> aVar14) {
        this.appForegroundEventFlowableProvider = aVar;
        this.programmaticTriggerEventFlowableProvider = aVar2;
        this.campaignCacheClientProvider = aVar3;
        this.clockProvider = aVar4;
        this.apiClientProvider = aVar5;
        this.analyticsEventsManagerProvider = aVar6;
        this.schedulersProvider = aVar7;
        this.impressionStorageClientProvider = aVar8;
        this.rateLimiterClientProvider = aVar9;
        this.appForegroundRateLimitProvider = aVar10;
        this.testDeviceHelperProvider = aVar11;
        this.firebaseInstallationsProvider = aVar12;
        this.dataCollectionHelperProvider = aVar13;
        this.abtIntegrationHelperProvider = aVar14;
    }

    public static InAppMessageStreamManager_Factory create(a<g.c.u.a<String>> aVar, a<g.c.u.a<String>> aVar2, a<CampaignCacheClient> aVar3, a<Clock> aVar4, a<ApiClient> aVar5, a<AnalyticsEventsManager> aVar6, a<Schedulers> aVar7, a<ImpressionStorageClient> aVar8, a<RateLimiterClient> aVar9, a<RateLimit> aVar10, a<TestDeviceHelper> aVar11, a<FirebaseInstallationsApi> aVar12, a<DataCollectionHelper> aVar13, a<AbtIntegrationHelper> aVar14) {
        return new InAppMessageStreamManager_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14);
    }

    public static InAppMessageStreamManager newInstance(g.c.u.a<String> aVar, g.c.u.a<String> aVar2, CampaignCacheClient campaignCacheClient, Clock clock, ApiClient apiClient, AnalyticsEventsManager analyticsEventsManager, Schedulers schedulers, ImpressionStorageClient impressionStorageClient, RateLimiterClient rateLimiterClient, RateLimit rateLimit, TestDeviceHelper testDeviceHelper, FirebaseInstallationsApi firebaseInstallationsApi, DataCollectionHelper dataCollectionHelper, AbtIntegrationHelper abtIntegrationHelper) {
        return new InAppMessageStreamManager(aVar, aVar2, campaignCacheClient, clock, apiClient, analyticsEventsManager, schedulers, impressionStorageClient, rateLimiterClient, rateLimit, testDeviceHelper, firebaseInstallationsApi, dataCollectionHelper, abtIntegrationHelper);
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public InAppMessageStreamManager get() {
        return newInstance(this.appForegroundEventFlowableProvider.get(), this.programmaticTriggerEventFlowableProvider.get(), this.campaignCacheClientProvider.get(), this.clockProvider.get(), this.apiClientProvider.get(), this.analyticsEventsManagerProvider.get(), this.schedulersProvider.get(), this.impressionStorageClientProvider.get(), this.rateLimiterClientProvider.get(), this.appForegroundRateLimitProvider.get(), this.testDeviceHelperProvider.get(), this.firebaseInstallationsProvider.get(), this.dataCollectionHelperProvider.get(), this.abtIntegrationHelperProvider.get());
    }
}
