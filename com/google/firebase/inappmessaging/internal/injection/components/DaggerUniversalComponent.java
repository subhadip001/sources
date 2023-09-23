package com.google.firebase.inappmessaging.internal.injection.components;

import android.app.Application;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inappmessaging.dagger.internal.DoubleCheck;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.internal.AnalyticsEventsManager;
import com.google.firebase.inappmessaging.internal.CampaignCacheClient;
import com.google.firebase.inappmessaging.internal.CampaignCacheClient_Factory;
import com.google.firebase.inappmessaging.internal.DeveloperListenerManager;
import com.google.firebase.inappmessaging.internal.ImpressionStorageClient;
import com.google.firebase.inappmessaging.internal.ImpressionStorageClient_Factory;
import com.google.firebase.inappmessaging.internal.ProgramaticContextualTriggers;
import com.google.firebase.inappmessaging.internal.ProtoStorageClient;
import com.google.firebase.inappmessaging.internal.ProviderInstaller;
import com.google.firebase.inappmessaging.internal.ProviderInstaller_Factory;
import com.google.firebase.inappmessaging.internal.RateLimiterClient;
import com.google.firebase.inappmessaging.internal.RateLimiterClient_Factory;
import com.google.firebase.inappmessaging.internal.Schedulers;
import com.google.firebase.inappmessaging.internal.Schedulers_Factory;
import com.google.firebase.inappmessaging.internal.injection.modules.AnalyticsEventsModule;
import com.google.firebase.inappmessaging.internal.injection.modules.AnalyticsEventsModule_ProvidesAnalyticsConnectorEventsFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.AnalyticsEventsModule_ProvidesAnalyticsEventsManagerFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.AppMeasurementModule;
import com.google.firebase.inappmessaging.internal.injection.modules.AppMeasurementModule_ProvidesAnalyticsConnectorFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.AppMeasurementModule_ProvidesSubsriberFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ApplicationModule;
import com.google.firebase.inappmessaging.internal.injection.modules.ApplicationModule_DeveloperListenerManagerFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ApplicationModule_ProvidesApplicationFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ForegroundFlowableModule;
import com.google.firebase.inappmessaging.internal.injection.modules.ForegroundFlowableModule_ProvidesAppForegroundEventStreamFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.GrpcChannelModule;
import com.google.firebase.inappmessaging.internal.injection.modules.GrpcChannelModule_ProvidesGrpcChannelFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.GrpcChannelModule_ProvidesServiceHostFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ProgrammaticContextualTriggerFlowableModule;
import com.google.firebase.inappmessaging.internal.injection.modules.ProgrammaticContextualTriggerFlowableModule_ProvidesProgramaticContextualTriggerStreamFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ProgrammaticContextualTriggerFlowableModule_ProvidesProgramaticContextualTriggersFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ProtoStorageClientModule;
import com.google.firebase.inappmessaging.internal.injection.modules.ProtoStorageClientModule_ProvidesProtoStorageClientForCampaignFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ProtoStorageClientModule_ProvidesProtoStorageClientForImpressionStoreFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ProtoStorageClientModule_ProvidesProtoStorageClientForLimiterStoreFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.RateLimitModule;
import com.google.firebase.inappmessaging.internal.injection.modules.RateLimitModule_ProvidesAppForegroundRateLimitFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.SchedulerModule;
import com.google.firebase.inappmessaging.internal.injection.modules.SchedulerModule_ProvidesComputeSchedulerFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.SchedulerModule_ProvidesIOSchedulerFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.SchedulerModule_ProvidesMainThreadSchedulerFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.SystemClockModule;
import com.google.firebase.inappmessaging.internal.injection.modules.SystemClockModule_ProvidesSystemClockModuleFactory;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.inappmessaging.model.ProtoMarshallerClient;
import com.google.firebase.inappmessaging.model.ProtoMarshallerClient_Factory;
import com.google.firebase.inappmessaging.model.RateLimit;
import g.a.c;
import g.c.o;
import h.a.a;

/* loaded from: classes2.dex */
public final class DaggerUniversalComponent implements UniversalComponent {
    private a<CampaignCacheClient> campaignCacheClientProvider;
    private a<DeveloperListenerManager> developerListenerManagerProvider;
    private a<ImpressionStorageClient> impressionStorageClientProvider;
    private a<ProtoMarshallerClient> protoMarshallerClientProvider;
    private a<ProviderInstaller> providerInstallerProvider;
    private a<g.c.u.a<String>> providesAnalyticsConnectorEventsProvider;
    private a<AnalyticsConnector> providesAnalyticsConnectorProvider;
    private a<AnalyticsEventsManager> providesAnalyticsEventsManagerProvider;
    private a<g.c.u.a<String>> providesAppForegroundEventStreamProvider;
    private a<Application> providesApplicationProvider;
    private a<o> providesComputeSchedulerProvider;
    private a<c> providesGrpcChannelProvider;
    private a<o> providesIOSchedulerProvider;
    private a<o> providesMainThreadSchedulerProvider;
    private a<g.c.u.a<String>> providesProgramaticContextualTriggerStreamProvider;
    private a<ProgramaticContextualTriggers> providesProgramaticContextualTriggersProvider;
    private a<ProtoStorageClient> providesProtoStorageClientForCampaignProvider;
    private a<ProtoStorageClient> providesProtoStorageClientForImpressionStoreProvider;
    private a<ProtoStorageClient> providesProtoStorageClientForLimiterStoreProvider;
    private a<String> providesServiceHostProvider;
    private a<Subscriber> providesSubsriberProvider;
    private a<Clock> providesSystemClockModuleProvider;
    private final RateLimitModule rateLimitModule;
    private a<RateLimiterClient> rateLimiterClientProvider;
    private a<Schedulers> schedulersProvider;
    private final SystemClockModule systemClockModule;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private AnalyticsEventsModule analyticsEventsModule;
        private AppMeasurementModule appMeasurementModule;
        private ApplicationModule applicationModule;
        private ForegroundFlowableModule foregroundFlowableModule;
        private GrpcChannelModule grpcChannelModule;
        private ProgrammaticContextualTriggerFlowableModule programmaticContextualTriggerFlowableModule;
        private ProtoStorageClientModule protoStorageClientModule;
        private RateLimitModule rateLimitModule;
        private SchedulerModule schedulerModule;
        private SystemClockModule systemClockModule;

        public Builder analyticsEventsModule(AnalyticsEventsModule analyticsEventsModule) {
            this.analyticsEventsModule = (AnalyticsEventsModule) Preconditions.checkNotNull(analyticsEventsModule);
            return this;
        }

        public Builder appMeasurementModule(AppMeasurementModule appMeasurementModule) {
            this.appMeasurementModule = (AppMeasurementModule) Preconditions.checkNotNull(appMeasurementModule);
            return this;
        }

        public Builder applicationModule(ApplicationModule applicationModule) {
            this.applicationModule = (ApplicationModule) Preconditions.checkNotNull(applicationModule);
            return this;
        }

        public UniversalComponent build() {
            if (this.grpcChannelModule == null) {
                this.grpcChannelModule = new GrpcChannelModule();
            }
            if (this.schedulerModule == null) {
                this.schedulerModule = new SchedulerModule();
            }
            Preconditions.checkBuilderRequirement(this.applicationModule, ApplicationModule.class);
            if (this.foregroundFlowableModule == null) {
                this.foregroundFlowableModule = new ForegroundFlowableModule();
            }
            Preconditions.checkBuilderRequirement(this.programmaticContextualTriggerFlowableModule, ProgrammaticContextualTriggerFlowableModule.class);
            if (this.analyticsEventsModule == null) {
                this.analyticsEventsModule = new AnalyticsEventsModule();
            }
            if (this.protoStorageClientModule == null) {
                this.protoStorageClientModule = new ProtoStorageClientModule();
            }
            if (this.systemClockModule == null) {
                this.systemClockModule = new SystemClockModule();
            }
            if (this.rateLimitModule == null) {
                this.rateLimitModule = new RateLimitModule();
            }
            Preconditions.checkBuilderRequirement(this.appMeasurementModule, AppMeasurementModule.class);
            return new DaggerUniversalComponent(this.grpcChannelModule, this.schedulerModule, this.applicationModule, this.foregroundFlowableModule, this.programmaticContextualTriggerFlowableModule, this.analyticsEventsModule, this.protoStorageClientModule, this.systemClockModule, this.rateLimitModule, this.appMeasurementModule);
        }

        public Builder foregroundFlowableModule(ForegroundFlowableModule foregroundFlowableModule) {
            this.foregroundFlowableModule = (ForegroundFlowableModule) Preconditions.checkNotNull(foregroundFlowableModule);
            return this;
        }

        public Builder grpcChannelModule(GrpcChannelModule grpcChannelModule) {
            this.grpcChannelModule = (GrpcChannelModule) Preconditions.checkNotNull(grpcChannelModule);
            return this;
        }

        public Builder programmaticContextualTriggerFlowableModule(ProgrammaticContextualTriggerFlowableModule programmaticContextualTriggerFlowableModule) {
            this.programmaticContextualTriggerFlowableModule = (ProgrammaticContextualTriggerFlowableModule) Preconditions.checkNotNull(programmaticContextualTriggerFlowableModule);
            return this;
        }

        public Builder protoStorageClientModule(ProtoStorageClientModule protoStorageClientModule) {
            this.protoStorageClientModule = (ProtoStorageClientModule) Preconditions.checkNotNull(protoStorageClientModule);
            return this;
        }

        public Builder rateLimitModule(RateLimitModule rateLimitModule) {
            this.rateLimitModule = (RateLimitModule) Preconditions.checkNotNull(rateLimitModule);
            return this;
        }

        public Builder schedulerModule(SchedulerModule schedulerModule) {
            this.schedulerModule = (SchedulerModule) Preconditions.checkNotNull(schedulerModule);
            return this;
        }

        public Builder systemClockModule(SystemClockModule systemClockModule) {
            this.systemClockModule = (SystemClockModule) Preconditions.checkNotNull(systemClockModule);
            return this;
        }

        private Builder() {
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(GrpcChannelModule grpcChannelModule, SchedulerModule schedulerModule, ApplicationModule applicationModule, ForegroundFlowableModule foregroundFlowableModule, ProgrammaticContextualTriggerFlowableModule programmaticContextualTriggerFlowableModule, AnalyticsEventsModule analyticsEventsModule, ProtoStorageClientModule protoStorageClientModule, SystemClockModule systemClockModule, RateLimitModule rateLimitModule, AppMeasurementModule appMeasurementModule) {
        a<Application> provider = DoubleCheck.provider(ApplicationModule_ProvidesApplicationFactory.create(applicationModule));
        this.providesApplicationProvider = provider;
        this.providerInstallerProvider = DoubleCheck.provider(ProviderInstaller_Factory.create(provider));
        a<String> provider2 = DoubleCheck.provider(GrpcChannelModule_ProvidesServiceHostFactory.create(grpcChannelModule));
        this.providesServiceHostProvider = provider2;
        this.providesGrpcChannelProvider = DoubleCheck.provider(GrpcChannelModule_ProvidesGrpcChannelFactory.create(grpcChannelModule, provider2));
        this.providesIOSchedulerProvider = DoubleCheck.provider(SchedulerModule_ProvidesIOSchedulerFactory.create(schedulerModule));
        this.providesComputeSchedulerProvider = DoubleCheck.provider(SchedulerModule_ProvidesComputeSchedulerFactory.create(schedulerModule));
        a<o> provider3 = DoubleCheck.provider(SchedulerModule_ProvidesMainThreadSchedulerFactory.create(schedulerModule));
        this.providesMainThreadSchedulerProvider = provider3;
        this.schedulersProvider = DoubleCheck.provider(Schedulers_Factory.create(this.providesIOSchedulerProvider, this.providesComputeSchedulerProvider, provider3));
        this.providesAppForegroundEventStreamProvider = DoubleCheck.provider(ForegroundFlowableModule_ProvidesAppForegroundEventStreamFactory.create(foregroundFlowableModule, this.providesApplicationProvider));
        this.providesProgramaticContextualTriggerStreamProvider = DoubleCheck.provider(ProgrammaticContextualTriggerFlowableModule_ProvidesProgramaticContextualTriggerStreamFactory.create(programmaticContextualTriggerFlowableModule));
        this.providesProgramaticContextualTriggersProvider = DoubleCheck.provider(ProgrammaticContextualTriggerFlowableModule_ProvidesProgramaticContextualTriggersFactory.create(programmaticContextualTriggerFlowableModule));
        a<AnalyticsConnector> provider4 = DoubleCheck.provider(AppMeasurementModule_ProvidesAnalyticsConnectorFactory.create(appMeasurementModule));
        this.providesAnalyticsConnectorProvider = provider4;
        a<AnalyticsEventsManager> provider5 = DoubleCheck.provider(AnalyticsEventsModule_ProvidesAnalyticsEventsManagerFactory.create(analyticsEventsModule, provider4));
        this.providesAnalyticsEventsManagerProvider = provider5;
        this.providesAnalyticsConnectorEventsProvider = DoubleCheck.provider(AnalyticsEventsModule_ProvidesAnalyticsConnectorEventsFactory.create(analyticsEventsModule, provider5));
        this.providesSubsriberProvider = DoubleCheck.provider(AppMeasurementModule_ProvidesSubsriberFactory.create(appMeasurementModule));
        this.providesProtoStorageClientForCampaignProvider = DoubleCheck.provider(ProtoStorageClientModule_ProvidesProtoStorageClientForCampaignFactory.create(protoStorageClientModule, this.providesApplicationProvider));
        SystemClockModule_ProvidesSystemClockModuleFactory create = SystemClockModule_ProvidesSystemClockModuleFactory.create(systemClockModule);
        this.providesSystemClockModuleProvider = create;
        this.campaignCacheClientProvider = DoubleCheck.provider(CampaignCacheClient_Factory.create(this.providesProtoStorageClientForCampaignProvider, this.providesApplicationProvider, create));
        a<ProtoStorageClient> provider6 = DoubleCheck.provider(ProtoStorageClientModule_ProvidesProtoStorageClientForImpressionStoreFactory.create(protoStorageClientModule, this.providesApplicationProvider));
        this.providesProtoStorageClientForImpressionStoreProvider = provider6;
        this.impressionStorageClientProvider = DoubleCheck.provider(ImpressionStorageClient_Factory.create(provider6));
        this.protoMarshallerClientProvider = DoubleCheck.provider(ProtoMarshallerClient_Factory.create());
        a<ProtoStorageClient> provider7 = DoubleCheck.provider(ProtoStorageClientModule_ProvidesProtoStorageClientForLimiterStoreFactory.create(protoStorageClientModule, this.providesApplicationProvider));
        this.providesProtoStorageClientForLimiterStoreProvider = provider7;
        this.rateLimiterClientProvider = DoubleCheck.provider(RateLimiterClient_Factory.create(provider7, this.providesSystemClockModuleProvider));
        this.developerListenerManagerProvider = DoubleCheck.provider(ApplicationModule_DeveloperListenerManagerFactory.create(applicationModule));
    }

    @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
    public AnalyticsConnector analyticsConnector() {
        return this.providesAnalyticsConnectorProvider.get();
    }

    @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
    public g.c.u.a<String> analyticsEventsFlowable() {
        return this.providesAnalyticsConnectorEventsProvider.get();
    }

    @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
    public AnalyticsEventsManager analyticsEventsManager() {
        return this.providesAnalyticsEventsManagerProvider.get();
    }

    @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
    public g.c.u.a<String> appForegroundEventFlowable() {
        return this.providesAppForegroundEventStreamProvider.get();
    }

    @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
    public RateLimit appForegroundRateLimit() {
        return RateLimitModule_ProvidesAppForegroundRateLimitFactory.providesAppForegroundRateLimit(this.rateLimitModule);
    }

    @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
    public Application application() {
        return this.providesApplicationProvider.get();
    }

    @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
    public CampaignCacheClient campaignCacheClient() {
        return this.campaignCacheClientProvider.get();
    }

    @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
    public Clock clock() {
        return SystemClockModule_ProvidesSystemClockModuleFactory.providesSystemClockModule(this.systemClockModule);
    }

    @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
    public DeveloperListenerManager developerListenerManager() {
        return this.developerListenerManagerProvider.get();
    }

    @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
    public Subscriber firebaseEventsSubscriber() {
        return this.providesSubsriberProvider.get();
    }

    @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
    public c gRPCChannel() {
        return this.providesGrpcChannelProvider.get();
    }

    @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
    public ImpressionStorageClient impressionStorageClient() {
        return this.impressionStorageClientProvider.get();
    }

    @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
    public ProviderInstaller probiderInstaller() {
        return this.providerInstallerProvider.get();
    }

    @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
    public g.c.u.a<String> programmaticContextualTriggerFlowable() {
        return this.providesProgramaticContextualTriggerStreamProvider.get();
    }

    @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
    public ProgramaticContextualTriggers programmaticContextualTriggers() {
        return this.providesProgramaticContextualTriggersProvider.get();
    }

    @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
    public ProtoMarshallerClient protoMarshallerClient() {
        return this.protoMarshallerClientProvider.get();
    }

    @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
    public RateLimiterClient rateLimiterClient() {
        return this.rateLimiterClientProvider.get();
    }

    @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
    public Schedulers schedulers() {
        return this.schedulersProvider.get();
    }

    private DaggerUniversalComponent(GrpcChannelModule grpcChannelModule, SchedulerModule schedulerModule, ApplicationModule applicationModule, ForegroundFlowableModule foregroundFlowableModule, ProgrammaticContextualTriggerFlowableModule programmaticContextualTriggerFlowableModule, AnalyticsEventsModule analyticsEventsModule, ProtoStorageClientModule protoStorageClientModule, SystemClockModule systemClockModule, RateLimitModule rateLimitModule, AppMeasurementModule appMeasurementModule) {
        this.systemClockModule = systemClockModule;
        this.rateLimitModule = rateLimitModule;
        initialize(grpcChannelModule, schedulerModule, applicationModule, foregroundFlowableModule, programmaticContextualTriggerFlowableModule, analyticsEventsModule, protoStorageClientModule, systemClockModule, rateLimitModule, appMeasurementModule);
    }
}
