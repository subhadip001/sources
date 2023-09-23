package com.google.firebase.inappmessaging.internal.injection.components;

import android.app.Application;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inappmessaging.FirebaseInAppMessaging;
import com.google.firebase.inappmessaging.FirebaseInAppMessaging_Factory;
import com.google.firebase.inappmessaging.dagger.internal.DoubleCheck;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.InstanceFactory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.internal.AbtIntegrationHelper;
import com.google.firebase.inappmessaging.internal.AnalyticsEventsManager;
import com.google.firebase.inappmessaging.internal.ApiClient;
import com.google.firebase.inappmessaging.internal.CampaignCacheClient;
import com.google.firebase.inappmessaging.internal.DataCollectionHelper;
import com.google.firebase.inappmessaging.internal.DeveloperListenerManager;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksFactory;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksFactory_Factory;
import com.google.firebase.inappmessaging.internal.GrpcClient;
import com.google.firebase.inappmessaging.internal.GrpcClient_Factory;
import com.google.firebase.inappmessaging.internal.ImpressionStorageClient;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager_Factory;
import com.google.firebase.inappmessaging.internal.MetricsLoggerClient;
import com.google.firebase.inappmessaging.internal.ProgramaticContextualTriggers;
import com.google.firebase.inappmessaging.internal.ProviderInstaller;
import com.google.firebase.inappmessaging.internal.RateLimiterClient;
import com.google.firebase.inappmessaging.internal.Schedulers;
import com.google.firebase.inappmessaging.internal.SharedPreferencesUtils;
import com.google.firebase.inappmessaging.internal.TestDeviceHelper;
import com.google.firebase.inappmessaging.internal.injection.components.AppComponent;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule_ProvidesApiClientFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule_ProvidesDataCollectionHelperFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule_ProvidesFirebaseAppFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule_ProvidesFirebaseInstallationsFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule_ProvidesSharedPreferencesUtilsFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule_ProvidesTestDeviceHelperFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.GrpcClientModule;
import com.google.firebase.inappmessaging.internal.injection.modules.GrpcClientModule_ProvidesApiKeyHeadersFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.GrpcClientModule_ProvidesInAppMessagingSdkServingStubFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.TransportClientModule_ProvidesMetricsLoggerClientFactory;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.inappmessaging.model.RateLimit;
import com.google.firebase.installations.FirebaseInstallationsApi;
import f.h.b.a.f;
import f.h.g.a.a.a.d.g;
import g.a.c;
import g.a.i0;
import h.a.a;

/* loaded from: classes2.dex */
public final class DaggerAppComponent implements AppComponent {
    private a<AbtIntegrationHelper> abtIntegrationHelperProvider;
    private a<AnalyticsConnector> analyticsConnectorProvider;
    private a<AnalyticsEventsManager> analyticsEventsManagerProvider;
    private final ApiClientModule apiClientModule;
    private a<g.c.u.a<String>> appForegroundEventFlowableProvider;
    private a<RateLimit> appForegroundRateLimitProvider;
    private a<Application> applicationProvider;
    private a<CampaignCacheClient> campaignCacheClientProvider;
    private a<Clock> clockProvider;
    private a<DeveloperListenerManager> developerListenerManagerProvider;
    private a<DisplayCallbacksFactory> displayCallbacksFactoryProvider;
    private a<Subscriber> firebaseEventsSubscriberProvider;
    private a<FirebaseInAppMessaging> firebaseInAppMessagingProvider;
    private a<c> gRPCChannelProvider;
    private a<GrpcClient> grpcClientProvider;
    private a<ImpressionStorageClient> impressionStorageClientProvider;
    private a<InAppMessageStreamManager> inAppMessageStreamManagerProvider;
    private a<ProviderInstaller> probiderInstallerProvider;
    private a<g.c.u.a<String>> programmaticContextualTriggerFlowableProvider;
    private a<ProgramaticContextualTriggers> programmaticContextualTriggersProvider;
    private a<ApiClient> providesApiClientProvider;
    private a<i0> providesApiKeyHeadersProvider;
    private a<DataCollectionHelper> providesDataCollectionHelperProvider;
    private a<FirebaseApp> providesFirebaseAppProvider;
    private a<FirebaseInstallationsApi> providesFirebaseInstallationsProvider;
    private a<g.a> providesInAppMessagingSdkServingStubProvider;
    private a<MetricsLoggerClient> providesMetricsLoggerClientProvider;
    private a<SharedPreferencesUtils> providesSharedPreferencesUtilsProvider;
    private a<TestDeviceHelper> providesTestDeviceHelperProvider;
    private a<RateLimiterClient> rateLimiterClientProvider;
    private a<Schedulers> schedulersProvider;
    private a<f> transportFactoryProvider;
    private final UniversalComponent universalComponent;

    /* loaded from: classes2.dex */
    public static final class Builder implements AppComponent.Builder {
        private AbtIntegrationHelper abtIntegrationHelper;
        private ApiClientModule apiClientModule;
        private GrpcClientModule grpcClientModule;
        private f transportFactory;
        private UniversalComponent universalComponent;

        private Builder() {
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.AppComponent.Builder
        public AppComponent build() {
            Preconditions.checkBuilderRequirement(this.abtIntegrationHelper, AbtIntegrationHelper.class);
            Preconditions.checkBuilderRequirement(this.apiClientModule, ApiClientModule.class);
            Preconditions.checkBuilderRequirement(this.grpcClientModule, GrpcClientModule.class);
            Preconditions.checkBuilderRequirement(this.universalComponent, UniversalComponent.class);
            Preconditions.checkBuilderRequirement(this.transportFactory, f.class);
            return new DaggerAppComponent(this.apiClientModule, this.grpcClientModule, this.universalComponent, this.abtIntegrationHelper, this.transportFactory);
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.AppComponent.Builder
        public Builder abtIntegrationHelper(AbtIntegrationHelper abtIntegrationHelper) {
            this.abtIntegrationHelper = (AbtIntegrationHelper) Preconditions.checkNotNull(abtIntegrationHelper);
            return this;
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.AppComponent.Builder
        public Builder apiClientModule(ApiClientModule apiClientModule) {
            this.apiClientModule = (ApiClientModule) Preconditions.checkNotNull(apiClientModule);
            return this;
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.AppComponent.Builder
        public Builder grpcClientModule(GrpcClientModule grpcClientModule) {
            this.grpcClientModule = (GrpcClientModule) Preconditions.checkNotNull(grpcClientModule);
            return this;
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.AppComponent.Builder
        public Builder transportFactory(f fVar) {
            this.transportFactory = (f) Preconditions.checkNotNull(fVar);
            return this;
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.AppComponent.Builder
        public Builder universalComponent(UniversalComponent universalComponent) {
            this.universalComponent = (UniversalComponent) Preconditions.checkNotNull(universalComponent);
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static class com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_analyticsConnector implements a<AnalyticsConnector> {
        private final UniversalComponent universalComponent;

        public com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_analyticsConnector(UniversalComponent universalComponent) {
            this.universalComponent = universalComponent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.a.a
        public AnalyticsConnector get() {
            return (AnalyticsConnector) Preconditions.checkNotNull(this.universalComponent.analyticsConnector(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* loaded from: classes2.dex */
    public static class com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_analyticsEventsManager implements a<AnalyticsEventsManager> {
        private final UniversalComponent universalComponent;

        public com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_analyticsEventsManager(UniversalComponent universalComponent) {
            this.universalComponent = universalComponent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.a.a
        public AnalyticsEventsManager get() {
            return (AnalyticsEventsManager) Preconditions.checkNotNull(this.universalComponent.analyticsEventsManager(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* loaded from: classes2.dex */
    public static class com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_appForegroundEventFlowable implements a<g.c.u.a<String>> {
        private final UniversalComponent universalComponent;

        public com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_appForegroundEventFlowable(UniversalComponent universalComponent) {
            this.universalComponent = universalComponent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.a.a
        public g.c.u.a<String> get() {
            return (g.c.u.a) Preconditions.checkNotNull(this.universalComponent.appForegroundEventFlowable(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* loaded from: classes2.dex */
    public static class com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_appForegroundRateLimit implements a<RateLimit> {
        private final UniversalComponent universalComponent;

        public com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_appForegroundRateLimit(UniversalComponent universalComponent) {
            this.universalComponent = universalComponent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.a.a
        public RateLimit get() {
            return (RateLimit) Preconditions.checkNotNull(this.universalComponent.appForegroundRateLimit(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* loaded from: classes2.dex */
    public static class com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_application implements a<Application> {
        private final UniversalComponent universalComponent;

        public com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_application(UniversalComponent universalComponent) {
            this.universalComponent = universalComponent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.a.a
        public Application get() {
            return (Application) Preconditions.checkNotNull(this.universalComponent.application(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* loaded from: classes2.dex */
    public static class com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_campaignCacheClient implements a<CampaignCacheClient> {
        private final UniversalComponent universalComponent;

        public com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_campaignCacheClient(UniversalComponent universalComponent) {
            this.universalComponent = universalComponent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.a.a
        public CampaignCacheClient get() {
            return (CampaignCacheClient) Preconditions.checkNotNull(this.universalComponent.campaignCacheClient(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* loaded from: classes2.dex */
    public static class com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_clock implements a<Clock> {
        private final UniversalComponent universalComponent;

        public com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_clock(UniversalComponent universalComponent) {
            this.universalComponent = universalComponent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.a.a
        public Clock get() {
            return (Clock) Preconditions.checkNotNull(this.universalComponent.clock(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* loaded from: classes2.dex */
    public static class com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_developerListenerManager implements a<DeveloperListenerManager> {
        private final UniversalComponent universalComponent;

        public com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_developerListenerManager(UniversalComponent universalComponent) {
            this.universalComponent = universalComponent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.a.a
        public DeveloperListenerManager get() {
            return (DeveloperListenerManager) Preconditions.checkNotNull(this.universalComponent.developerListenerManager(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* loaded from: classes2.dex */
    public static class com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_firebaseEventsSubscriber implements a<Subscriber> {
        private final UniversalComponent universalComponent;

        public com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_firebaseEventsSubscriber(UniversalComponent universalComponent) {
            this.universalComponent = universalComponent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.a.a
        public Subscriber get() {
            return (Subscriber) Preconditions.checkNotNull(this.universalComponent.firebaseEventsSubscriber(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* loaded from: classes2.dex */
    public static class com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_gRPCChannel implements a<c> {
        private final UniversalComponent universalComponent;

        public com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_gRPCChannel(UniversalComponent universalComponent) {
            this.universalComponent = universalComponent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.a.a
        public c get() {
            return (c) Preconditions.checkNotNull(this.universalComponent.gRPCChannel(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* loaded from: classes2.dex */
    public static class com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_impressionStorageClient implements a<ImpressionStorageClient> {
        private final UniversalComponent universalComponent;

        public com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_impressionStorageClient(UniversalComponent universalComponent) {
            this.universalComponent = universalComponent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.a.a
        public ImpressionStorageClient get() {
            return (ImpressionStorageClient) Preconditions.checkNotNull(this.universalComponent.impressionStorageClient(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* loaded from: classes2.dex */
    public static class com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_probiderInstaller implements a<ProviderInstaller> {
        private final UniversalComponent universalComponent;

        public com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_probiderInstaller(UniversalComponent universalComponent) {
            this.universalComponent = universalComponent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.a.a
        public ProviderInstaller get() {
            return (ProviderInstaller) Preconditions.checkNotNull(this.universalComponent.probiderInstaller(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* loaded from: classes2.dex */
    public static class com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_programmaticContextualTriggerFlowable implements a<g.c.u.a<String>> {
        private final UniversalComponent universalComponent;

        public com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_programmaticContextualTriggerFlowable(UniversalComponent universalComponent) {
            this.universalComponent = universalComponent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.a.a
        public g.c.u.a<String> get() {
            return (g.c.u.a) Preconditions.checkNotNull(this.universalComponent.programmaticContextualTriggerFlowable(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* loaded from: classes2.dex */
    public static class com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_programmaticContextualTriggers implements a<ProgramaticContextualTriggers> {
        private final UniversalComponent universalComponent;

        public com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_programmaticContextualTriggers(UniversalComponent universalComponent) {
            this.universalComponent = universalComponent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.a.a
        public ProgramaticContextualTriggers get() {
            return (ProgramaticContextualTriggers) Preconditions.checkNotNull(this.universalComponent.programmaticContextualTriggers(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* loaded from: classes2.dex */
    public static class com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_rateLimiterClient implements a<RateLimiterClient> {
        private final UniversalComponent universalComponent;

        public com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_rateLimiterClient(UniversalComponent universalComponent) {
            this.universalComponent = universalComponent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.a.a
        public RateLimiterClient get() {
            return (RateLimiterClient) Preconditions.checkNotNull(this.universalComponent.rateLimiterClient(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* loaded from: classes2.dex */
    public static class com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_schedulers implements a<Schedulers> {
        private final UniversalComponent universalComponent;

        public com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_schedulers(UniversalComponent universalComponent) {
            this.universalComponent = universalComponent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.a.a
        public Schedulers get() {
            return (Schedulers) Preconditions.checkNotNull(this.universalComponent.schedulers(), "Cannot return null from a non-@Nullable component method");
        }
    }

    public static AppComponent.Builder builder() {
        return new Builder();
    }

    private DataCollectionHelper getDataCollectionHelper() {
        ApiClientModule apiClientModule = this.apiClientModule;
        return ApiClientModule_ProvidesDataCollectionHelperFactory.providesDataCollectionHelper(apiClientModule, ApiClientModule_ProvidesSharedPreferencesUtilsFactory.providesSharedPreferencesUtils(apiClientModule), (Subscriber) Preconditions.checkNotNull(this.universalComponent.firebaseEventsSubscriber(), "Cannot return null from a non-@Nullable component method"));
    }

    private void initialize(ApiClientModule apiClientModule, GrpcClientModule grpcClientModule, UniversalComponent universalComponent, AbtIntegrationHelper abtIntegrationHelper, f fVar) {
        this.appForegroundEventFlowableProvider = new com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_appForegroundEventFlowable(universalComponent);
        this.programmaticContextualTriggerFlowableProvider = new com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_programmaticContextualTriggerFlowable(universalComponent);
        this.campaignCacheClientProvider = new com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_campaignCacheClient(universalComponent);
        this.clockProvider = new com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_clock(universalComponent);
        this.gRPCChannelProvider = new com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_gRPCChannel(universalComponent);
        GrpcClientModule_ProvidesApiKeyHeadersFactory create = GrpcClientModule_ProvidesApiKeyHeadersFactory.create(grpcClientModule);
        this.providesApiKeyHeadersProvider = create;
        a<g.a> provider = DoubleCheck.provider(GrpcClientModule_ProvidesInAppMessagingSdkServingStubFactory.create(grpcClientModule, this.gRPCChannelProvider, create));
        this.providesInAppMessagingSdkServingStubProvider = provider;
        this.grpcClientProvider = DoubleCheck.provider(GrpcClient_Factory.create(provider));
        this.applicationProvider = new com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_application(universalComponent);
        com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_probiderInstaller com_google_firebase_inappmessaging_internal_injection_components_universalcomponent_probiderinstaller = new com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_probiderInstaller(universalComponent);
        this.probiderInstallerProvider = com_google_firebase_inappmessaging_internal_injection_components_universalcomponent_probiderinstaller;
        this.providesApiClientProvider = DoubleCheck.provider(ApiClientModule_ProvidesApiClientFactory.create(apiClientModule, this.grpcClientProvider, this.applicationProvider, com_google_firebase_inappmessaging_internal_injection_components_universalcomponent_probiderinstaller));
        this.analyticsEventsManagerProvider = new com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_analyticsEventsManager(universalComponent);
        this.schedulersProvider = new com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_schedulers(universalComponent);
        this.impressionStorageClientProvider = new com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_impressionStorageClient(universalComponent);
        this.rateLimiterClientProvider = new com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_rateLimiterClient(universalComponent);
        this.appForegroundRateLimitProvider = new com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_appForegroundRateLimit(universalComponent);
        ApiClientModule_ProvidesSharedPreferencesUtilsFactory create2 = ApiClientModule_ProvidesSharedPreferencesUtilsFactory.create(apiClientModule);
        this.providesSharedPreferencesUtilsProvider = create2;
        this.providesTestDeviceHelperProvider = ApiClientModule_ProvidesTestDeviceHelperFactory.create(apiClientModule, create2);
        this.providesFirebaseInstallationsProvider = ApiClientModule_ProvidesFirebaseInstallationsFactory.create(apiClientModule);
        com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_firebaseEventsSubscriber com_google_firebase_inappmessaging_internal_injection_components_universalcomponent_firebaseeventssubscriber = new com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_firebaseEventsSubscriber(universalComponent);
        this.firebaseEventsSubscriberProvider = com_google_firebase_inappmessaging_internal_injection_components_universalcomponent_firebaseeventssubscriber;
        this.providesDataCollectionHelperProvider = ApiClientModule_ProvidesDataCollectionHelperFactory.create(apiClientModule, this.providesSharedPreferencesUtilsProvider, com_google_firebase_inappmessaging_internal_injection_components_universalcomponent_firebaseeventssubscriber);
        Factory create3 = InstanceFactory.create(abtIntegrationHelper);
        this.abtIntegrationHelperProvider = create3;
        this.inAppMessageStreamManagerProvider = DoubleCheck.provider(InAppMessageStreamManager_Factory.create(this.appForegroundEventFlowableProvider, this.programmaticContextualTriggerFlowableProvider, this.campaignCacheClientProvider, this.clockProvider, this.providesApiClientProvider, this.analyticsEventsManagerProvider, this.schedulersProvider, this.impressionStorageClientProvider, this.rateLimiterClientProvider, this.appForegroundRateLimitProvider, this.providesTestDeviceHelperProvider, this.providesFirebaseInstallationsProvider, this.providesDataCollectionHelperProvider, create3));
        this.programmaticContextualTriggersProvider = new com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_programmaticContextualTriggers(universalComponent);
        this.providesFirebaseAppProvider = ApiClientModule_ProvidesFirebaseAppFactory.create(apiClientModule);
        this.transportFactoryProvider = InstanceFactory.create(fVar);
        this.analyticsConnectorProvider = new com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_analyticsConnector(universalComponent);
        com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_developerListenerManager com_google_firebase_inappmessaging_internal_injection_components_universalcomponent_developerlistenermanager = new com_google_firebase_inappmessaging_internal_injection_components_UniversalComponent_developerListenerManager(universalComponent);
        this.developerListenerManagerProvider = com_google_firebase_inappmessaging_internal_injection_components_universalcomponent_developerlistenermanager;
        a<MetricsLoggerClient> provider2 = DoubleCheck.provider(TransportClientModule_ProvidesMetricsLoggerClientFactory.create(this.providesFirebaseAppProvider, this.transportFactoryProvider, this.analyticsConnectorProvider, this.providesFirebaseInstallationsProvider, this.clockProvider, com_google_firebase_inappmessaging_internal_injection_components_universalcomponent_developerlistenermanager));
        this.providesMetricsLoggerClientProvider = provider2;
        DisplayCallbacksFactory_Factory create4 = DisplayCallbacksFactory_Factory.create(this.impressionStorageClientProvider, this.clockProvider, this.schedulersProvider, this.rateLimiterClientProvider, this.campaignCacheClientProvider, this.appForegroundRateLimitProvider, provider2, this.providesDataCollectionHelperProvider);
        this.displayCallbacksFactoryProvider = create4;
        this.firebaseInAppMessagingProvider = DoubleCheck.provider(FirebaseInAppMessaging_Factory.create(this.inAppMessageStreamManagerProvider, this.programmaticContextualTriggersProvider, this.providesDataCollectionHelperProvider, this.providesFirebaseInstallationsProvider, create4, this.developerListenerManagerProvider));
    }

    @Override // com.google.firebase.inappmessaging.internal.injection.components.AppComponent
    public DisplayCallbacksFactory displayCallbacksFactory() {
        return new DisplayCallbacksFactory((ImpressionStorageClient) Preconditions.checkNotNull(this.universalComponent.impressionStorageClient(), "Cannot return null from a non-@Nullable component method"), (Clock) Preconditions.checkNotNull(this.universalComponent.clock(), "Cannot return null from a non-@Nullable component method"), (Schedulers) Preconditions.checkNotNull(this.universalComponent.schedulers(), "Cannot return null from a non-@Nullable component method"), (RateLimiterClient) Preconditions.checkNotNull(this.universalComponent.rateLimiterClient(), "Cannot return null from a non-@Nullable component method"), (CampaignCacheClient) Preconditions.checkNotNull(this.universalComponent.campaignCacheClient(), "Cannot return null from a non-@Nullable component method"), (RateLimit) Preconditions.checkNotNull(this.universalComponent.appForegroundRateLimit(), "Cannot return null from a non-@Nullable component method"), this.providesMetricsLoggerClientProvider.get(), getDataCollectionHelper());
    }

    @Override // com.google.firebase.inappmessaging.internal.injection.components.AppComponent
    public FirebaseInAppMessaging providesFirebaseInAppMessaging() {
        return this.firebaseInAppMessagingProvider.get();
    }

    private DaggerAppComponent(ApiClientModule apiClientModule, GrpcClientModule grpcClientModule, UniversalComponent universalComponent, AbtIntegrationHelper abtIntegrationHelper, f fVar) {
        this.universalComponent = universalComponent;
        this.apiClientModule = apiClientModule;
        initialize(apiClientModule, grpcClientModule, universalComponent, abtIntegrationHelper, fVar);
    }
}
