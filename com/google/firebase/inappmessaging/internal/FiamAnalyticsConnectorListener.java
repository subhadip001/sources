package com.google.firebase.inappmessaging.internal;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import g.c.e;

/* loaded from: classes2.dex */
public final class FiamAnalyticsConnectorListener implements AnalyticsConnector.AnalyticsConnectorListener {
    private e<String> emitter;

    public FiamAnalyticsConnectorListener(e<String> eVar) {
        this.emitter = eVar;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener
    public void onMessageTriggered(int i2, Bundle bundle) {
        if (i2 == 2) {
            this.emitter.onNext(bundle.getString(AnalyticsConstants.BUNDLE_EVENT_NAME_KEY));
        }
    }
}
