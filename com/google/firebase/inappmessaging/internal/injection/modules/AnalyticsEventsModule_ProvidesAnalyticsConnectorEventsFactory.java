package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.internal.AnalyticsEventsManager;
import g.c.u.a;

/* loaded from: classes2.dex */
public final class AnalyticsEventsModule_ProvidesAnalyticsConnectorEventsFactory implements Factory<a<String>> {
    private final h.a.a<AnalyticsEventsManager> analyticsEventsManagerProvider;
    private final AnalyticsEventsModule module;

    public AnalyticsEventsModule_ProvidesAnalyticsConnectorEventsFactory(AnalyticsEventsModule analyticsEventsModule, h.a.a<AnalyticsEventsManager> aVar) {
        this.module = analyticsEventsModule;
        this.analyticsEventsManagerProvider = aVar;
    }

    public static AnalyticsEventsModule_ProvidesAnalyticsConnectorEventsFactory create(AnalyticsEventsModule analyticsEventsModule, h.a.a<AnalyticsEventsManager> aVar) {
        return new AnalyticsEventsModule_ProvidesAnalyticsConnectorEventsFactory(analyticsEventsModule, aVar);
    }

    public static a<String> providesAnalyticsConnectorEvents(AnalyticsEventsModule analyticsEventsModule, AnalyticsEventsManager analyticsEventsManager) {
        return (a) Preconditions.checkNotNull(analyticsEventsModule.providesAnalyticsConnectorEvents(analyticsEventsManager), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public a<String> get() {
        return providesAnalyticsConnectorEvents(this.module, this.analyticsEventsManagerProvider.get());
    }
}
