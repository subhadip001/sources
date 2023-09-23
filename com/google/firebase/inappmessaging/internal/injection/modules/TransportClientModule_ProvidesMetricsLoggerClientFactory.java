package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.internal.DeveloperListenerManager;
import com.google.firebase.inappmessaging.internal.MetricsLoggerClient;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.installations.FirebaseInstallationsApi;
import f.h.b.a.f;
import h.a.a;

/* loaded from: classes2.dex */
public final class TransportClientModule_ProvidesMetricsLoggerClientFactory implements Factory<MetricsLoggerClient> {
    private final a<AnalyticsConnector> analyticsConnectorProvider;
    private final a<FirebaseApp> appProvider;
    private final a<Clock> clockProvider;
    private final a<DeveloperListenerManager> developerListenerManagerProvider;
    private final a<FirebaseInstallationsApi> firebaseInstallationsProvider;
    private final a<f> transportFactoryProvider;

    public TransportClientModule_ProvidesMetricsLoggerClientFactory(a<FirebaseApp> aVar, a<f> aVar2, a<AnalyticsConnector> aVar3, a<FirebaseInstallationsApi> aVar4, a<Clock> aVar5, a<DeveloperListenerManager> aVar6) {
        this.appProvider = aVar;
        this.transportFactoryProvider = aVar2;
        this.analyticsConnectorProvider = aVar3;
        this.firebaseInstallationsProvider = aVar4;
        this.clockProvider = aVar5;
        this.developerListenerManagerProvider = aVar6;
    }

    public static TransportClientModule_ProvidesMetricsLoggerClientFactory create(a<FirebaseApp> aVar, a<f> aVar2, a<AnalyticsConnector> aVar3, a<FirebaseInstallationsApi> aVar4, a<Clock> aVar5, a<DeveloperListenerManager> aVar6) {
        return new TransportClientModule_ProvidesMetricsLoggerClientFactory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static MetricsLoggerClient providesMetricsLoggerClient(FirebaseApp firebaseApp, f fVar, AnalyticsConnector analyticsConnector, FirebaseInstallationsApi firebaseInstallationsApi, Clock clock, DeveloperListenerManager developerListenerManager) {
        return (MetricsLoggerClient) Preconditions.checkNotNull(TransportClientModule.providesMetricsLoggerClient(firebaseApp, fVar, analyticsConnector, firebaseInstallationsApi, clock, developerListenerManager), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public MetricsLoggerClient get() {
        return providesMetricsLoggerClient(this.appProvider.get(), this.transportFactoryProvider.get(), this.analyticsConnectorProvider.get(), this.firebaseInstallationsProvider.get(), this.clockProvider.get(), this.developerListenerManagerProvider.get());
    }
}
