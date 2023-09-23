package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.internal.AnalyticsEventsManager;
import h.a.a;

/* loaded from: classes2.dex */
public final class AnalyticsEventsModule_ProvidesAnalyticsEventsManagerFactory implements Factory<AnalyticsEventsManager> {
    private final a<AnalyticsConnector> analyticsConnectorProvider;
    private final AnalyticsEventsModule module;

    public AnalyticsEventsModule_ProvidesAnalyticsEventsManagerFactory(AnalyticsEventsModule analyticsEventsModule, a<AnalyticsConnector> aVar) {
        this.module = analyticsEventsModule;
        this.analyticsConnectorProvider = aVar;
    }

    public static AnalyticsEventsModule_ProvidesAnalyticsEventsManagerFactory create(AnalyticsEventsModule analyticsEventsModule, a<AnalyticsConnector> aVar) {
        return new AnalyticsEventsModule_ProvidesAnalyticsEventsManagerFactory(analyticsEventsModule, aVar);
    }

    public static AnalyticsEventsManager providesAnalyticsEventsManager(AnalyticsEventsModule analyticsEventsModule, AnalyticsConnector analyticsConnector) {
        return (AnalyticsEventsManager) Preconditions.checkNotNull(analyticsEventsModule.providesAnalyticsEventsManager(analyticsConnector), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public AnalyticsEventsManager get() {
        return providesAnalyticsEventsManager(this.module, this.analyticsConnectorProvider.get());
    }
}
