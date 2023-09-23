package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;

/* loaded from: classes.dex */
public class CrashlyticsOriginAnalyticsEventLogger implements AnalyticsEventLogger {
    public static final String FIREBASE_ANALYTICS_ORIGIN_CRASHLYTICS = "clx";
    private final AnalyticsConnector analyticsConnector;

    public CrashlyticsOriginAnalyticsEventLogger(AnalyticsConnector analyticsConnector) {
        this.analyticsConnector = analyticsConnector;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(String str, Bundle bundle) {
        this.analyticsConnector.logEvent("clx", str, bundle);
    }
}
