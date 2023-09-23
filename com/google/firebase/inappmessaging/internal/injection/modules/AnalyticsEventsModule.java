package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inappmessaging.dagger.Module;
import com.google.firebase.inappmessaging.dagger.Provides;
import com.google.firebase.inappmessaging.internal.AnalyticsEventsManager;
import com.google.firebase.inappmessaging.internal.injection.qualifiers.AnalyticsListener;
import g.c.u.a;

@Module
/* loaded from: classes2.dex */
public class AnalyticsEventsModule {
    @Provides
    @AnalyticsListener
    public a<String> providesAnalyticsConnectorEvents(AnalyticsEventsManager analyticsEventsManager) {
        return analyticsEventsManager.getAnalyticsEventsFlowable();
    }

    @Provides
    public AnalyticsEventsManager providesAnalyticsEventsManager(AnalyticsConnector analyticsConnector) {
        return new AnalyticsEventsManager(analyticsConnector);
    }
}
