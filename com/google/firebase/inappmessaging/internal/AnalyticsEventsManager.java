package com.google.firebase.inappmessaging.internal;

import android.text.TextUtils;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inappmessaging.CommonTypesProto;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import g.c.d;
import g.c.e;
import g.c.f;
import g.c.u.a;
import g.c.w.e.b.c;
import io.reactivex.BackpressureStrategy;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public class AnalyticsEventsManager {
    public static final String TOO_MANY_CONTEXTUAL_TRIGGERS_ERROR = "Too many contextual triggers defined - limiting to 50";
    private final AnalyticsConnector analyticsConnector;
    private final a<String> flowable;
    private AnalyticsConnector.AnalyticsConnectorHandle handle;

    /* loaded from: classes2.dex */
    public class AnalyticsFlowableSubscriber implements f<String> {
        public AnalyticsFlowableSubscriber() {
        }

        @Override // g.c.f
        public void subscribe(e<String> eVar) {
            Logging.logd("Subscribing to analytics events.");
            AnalyticsEventsManager analyticsEventsManager = AnalyticsEventsManager.this;
            analyticsEventsManager.handle = analyticsEventsManager.analyticsConnector.registerAnalyticsConnectorListener("fiam", new FiamAnalyticsConnectorListener(eVar));
        }
    }

    public AnalyticsEventsManager(AnalyticsConnector analyticsConnector) {
        this.analyticsConnector = analyticsConnector;
        AnalyticsFlowableSubscriber analyticsFlowableSubscriber = new AnalyticsFlowableSubscriber();
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.BUFFER;
        int i2 = d.f8128f;
        Objects.requireNonNull(backpressureStrategy, "mode is null");
        a c = new c(analyticsFlowableSubscriber, backpressureStrategy).c();
        this.flowable = c;
        c.f();
    }

    public static Set<String> extractAnalyticsEventNames(f.h.g.a.a.a.d.e eVar) {
        HashSet hashSet = new HashSet();
        for (CampaignProto$ThickContent campaignProto$ThickContent : eVar.e()) {
            for (CommonTypesProto.TriggeringCondition triggeringCondition : campaignProto$ThickContent.g()) {
                if (!TextUtils.isEmpty(triggeringCondition.getEvent().getName())) {
                    hashSet.add(triggeringCondition.getEvent().getName());
                }
            }
        }
        if (hashSet.size() > 50) {
            Logging.logi(TOO_MANY_CONTEXTUAL_TRIGGERS_ERROR);
        }
        return hashSet;
    }

    public a<String> getAnalyticsEventsFlowable() {
        return this.flowable;
    }

    public AnalyticsConnector.AnalyticsConnectorHandle getHandle() {
        return this.handle;
    }

    public void updateContextualTriggers(f.h.g.a.a.a.d.e eVar) {
        Set<String> extractAnalyticsEventNames = extractAnalyticsEventNames(eVar);
        Logging.logd("Updating contextual triggers for the following analytics events: " + extractAnalyticsEventNames);
        this.handle.registerEventNames(extractAnalyticsEventNames);
    }
}
