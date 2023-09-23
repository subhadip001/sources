package com.google.firebase.inappmessaging;

import com.google.firebase.inappmessaging.CampaignAnalytics;
import f.h.h.j;
import f.h.h.n0;
import f.h.h.o0;

/* loaded from: classes2.dex */
public interface CampaignAnalyticsOrBuilder extends o0 {
    String getCampaignId();

    j getCampaignIdBytes();

    ClientAppInfo getClientApp();

    long getClientTimestampMillis();

    @Override // f.h.h.o0
    /* synthetic */ n0 getDefaultInstanceForType();

    DismissType getDismissType();

    int getEngagementMetricsDeliveryRetryCount();

    CampaignAnalytics.EventCase getEventCase();

    EventType getEventType();

    FetchErrorReason getFetchErrorReason();

    String getFiamSdkVersion();

    j getFiamSdkVersionBytes();

    String getProjectNumber();

    j getProjectNumberBytes();

    RenderErrorReason getRenderErrorReason();

    boolean hasCampaignId();

    boolean hasClientApp();

    boolean hasClientTimestampMillis();

    boolean hasDismissType();

    boolean hasEngagementMetricsDeliveryRetryCount();

    boolean hasEventType();

    boolean hasFetchErrorReason();

    boolean hasFiamSdkVersion();

    boolean hasProjectNumber();

    boolean hasRenderErrorReason();

    @Override // f.h.h.o0
    /* synthetic */ boolean isInitialized();
}
