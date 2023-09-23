package com.google.firebase.inappmessaging.internal;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inappmessaging.CampaignAnalytics;
import com.google.firebase.inappmessaging.ClientAppInfo;
import com.google.firebase.inappmessaging.DismissType;
import com.google.firebase.inappmessaging.EventType;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks;
import com.google.firebase.inappmessaging.RenderErrorReason;
import com.google.firebase.inappmessaging.internal.MetricsLoggerClient;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.inappmessaging.model.Action;
import com.google.firebase.inappmessaging.model.BannerMessage;
import com.google.firebase.inappmessaging.model.CardMessage;
import com.google.firebase.inappmessaging.model.ImageOnlyMessage;
import com.google.firebase.inappmessaging.model.InAppMessage;
import com.google.firebase.inappmessaging.model.MessageType;
import com.google.firebase.inappmessaging.model.ModalMessage;
import com.google.firebase.installations.FirebaseInstallationsApi;
import f.a.b.a.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class MetricsLoggerClient {
    private static final Map<FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType, DismissType> dismissTransform;
    private static final Map<FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason, RenderErrorReason> errorTransform;
    private final AnalyticsConnector analyticsConnector;
    private final Clock clock;
    private final DeveloperListenerManager developerListenerManager;
    private final EngagementMetricsLoggerInterface engagementMetricsLogger;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;

    /* renamed from: com.google.firebase.inappmessaging.internal.MetricsLoggerClient$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$firebase$inappmessaging$model$MessageType;

        static {
            MessageType.values();
            int[] iArr = new int[5];
            $SwitchMap$com$google$firebase$inappmessaging$model$MessageType = iArr;
            try {
                MessageType messageType = MessageType.CARD;
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$com$google$firebase$inappmessaging$model$MessageType;
                MessageType messageType2 = MessageType.MODAL;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$com$google$firebase$inappmessaging$model$MessageType;
                MessageType messageType3 = MessageType.BANNER;
                iArr3[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$com$google$firebase$inappmessaging$model$MessageType;
                MessageType messageType4 = MessageType.IMAGE_ONLY;
                iArr4[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface EngagementMetricsLoggerInterface {
        void logEvent(byte[] bArr);
    }

    static {
        HashMap hashMap = new HashMap();
        errorTransform = hashMap;
        HashMap hashMap2 = new HashMap();
        dismissTransform = hashMap2;
        hashMap.put(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason.UNSPECIFIED_RENDER_ERROR, RenderErrorReason.UNSPECIFIED_RENDER_ERROR);
        hashMap.put(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason.IMAGE_FETCH_ERROR, RenderErrorReason.IMAGE_FETCH_ERROR);
        hashMap.put(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason.IMAGE_DISPLAY_ERROR, RenderErrorReason.IMAGE_DISPLAY_ERROR);
        hashMap.put(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason.IMAGE_UNSUPPORTED_FORMAT, RenderErrorReason.IMAGE_UNSUPPORTED_FORMAT);
        hashMap2.put(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType.AUTO, DismissType.AUTO);
        hashMap2.put(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType.CLICK, DismissType.CLICK);
        hashMap2.put(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType.SWIPE, DismissType.SWIPE);
        hashMap2.put(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType.UNKNOWN_DISMISS_TYPE, DismissType.UNKNOWN_DISMISS_TYPE);
    }

    public MetricsLoggerClient(EngagementMetricsLoggerInterface engagementMetricsLoggerInterface, AnalyticsConnector analyticsConnector, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, Clock clock, DeveloperListenerManager developerListenerManager) {
        this.engagementMetricsLogger = engagementMetricsLoggerInterface;
        this.analyticsConnector = analyticsConnector;
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.clock = clock;
        this.developerListenerManager = developerListenerManager;
    }

    private CampaignAnalytics.Builder createCampaignAnalyticsBuilder(InAppMessage inAppMessage, String str) {
        return CampaignAnalytics.newBuilder().setFiamSdkVersion("20.2.0").setProjectNumber(this.firebaseApp.getOptions().getGcmSenderId()).setCampaignId(inAppMessage.getCampaignMetadata().getCampaignId()).setClientApp(ClientAppInfo.newBuilder().setGoogleAppId(this.firebaseApp.getOptions().getApplicationId()).setFirebaseInstanceId(str)).setClientTimestampMillis(this.clock.now());
    }

    private CampaignAnalytics createDismissEntry(InAppMessage inAppMessage, String str, DismissType dismissType) {
        return createCampaignAnalyticsBuilder(inAppMessage, str).setDismissType(dismissType).build();
    }

    private CampaignAnalytics createEventEntry(InAppMessage inAppMessage, String str, EventType eventType) {
        return createCampaignAnalyticsBuilder(inAppMessage, str).setEventType(eventType).build();
    }

    private CampaignAnalytics createRenderErrorEntry(InAppMessage inAppMessage, String str, RenderErrorReason renderErrorReason) {
        return createCampaignAnalyticsBuilder(inAppMessage, str).setRenderErrorReason(renderErrorReason).build();
    }

    private boolean impressionCountsAsConversion(InAppMessage inAppMessage) {
        int ordinal = inAppMessage.getMessageType().ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        Logging.loge("Unable to determine if impression should be counted as conversion.");
                        return false;
                    }
                    CardMessage cardMessage = (CardMessage) inAppMessage;
                    return (isValidAction(cardMessage.getPrimaryAction()) ^ true) && (isValidAction(cardMessage.getSecondaryAction()) ^ true);
                }
                return !isValidAction(((BannerMessage) inAppMessage).getAction());
            }
            return !isValidAction(((ImageOnlyMessage) inAppMessage).getAction());
        }
        return !isValidAction(((ModalMessage) inAppMessage).getAction());
    }

    private boolean isTestCampaign(InAppMessage inAppMessage) {
        return inAppMessage.getCampaignMetadata().getIsTestMessage();
    }

    private boolean isValidAction(Action action) {
        return (action == null || action.getActionUrl() == null || action.getActionUrl().isEmpty()) ? false : true;
    }

    private void logEventAsync(InAppMessage inAppMessage, String str, boolean z) {
        String campaignId = inAppMessage.getCampaignMetadata().getCampaignId();
        Bundle collectAnalyticsParams = collectAnalyticsParams(inAppMessage.getCampaignMetadata().getCampaignName(), campaignId);
        Logging.logd("Sending event=" + str + " params=" + collectAnalyticsParams);
        AnalyticsConnector analyticsConnector = this.analyticsConnector;
        if (analyticsConnector != null) {
            analyticsConnector.logEvent("fiam", str, collectAnalyticsParams);
            if (z) {
                AnalyticsConnector analyticsConnector2 = this.analyticsConnector;
                analyticsConnector2.setUserProperty("fiam", "_ln", "fiam:" + campaignId);
                return;
            }
            return;
        }
        Logging.logw("Unable to log event: analytics library is missing");
    }

    public /* synthetic */ void a(InAppMessage inAppMessage, FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType inAppMessagingDismissType, String str) {
        this.engagementMetricsLogger.logEvent(createDismissEntry(inAppMessage, str, dismissTransform.get(inAppMessagingDismissType)).toByteArray());
    }

    public /* synthetic */ void b(InAppMessage inAppMessage, String str) {
        this.engagementMetricsLogger.logEvent(createEventEntry(inAppMessage, str, EventType.IMPRESSION_EVENT_TYPE).toByteArray());
    }

    public /* synthetic */ void c(InAppMessage inAppMessage, String str) {
        this.engagementMetricsLogger.logEvent(createEventEntry(inAppMessage, str, EventType.CLICK_EVENT_TYPE).toByteArray());
    }

    public Bundle collectAnalyticsParams(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("_nmid", str2);
        bundle.putString("_nmn", str);
        try {
            bundle.putInt("_ndt", (int) (this.clock.now() / 1000));
        } catch (NumberFormatException e2) {
            StringBuilder A = a.A("Error while parsing use_device_time in FIAM event: ");
            A.append(e2.getMessage());
            Logging.logw(A.toString());
        }
        return bundle;
    }

    public /* synthetic */ void d(InAppMessage inAppMessage, FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason inAppMessagingErrorReason, String str) {
        this.engagementMetricsLogger.logEvent(createRenderErrorEntry(inAppMessage, str, errorTransform.get(inAppMessagingErrorReason)).toByteArray());
    }

    public void logDismiss(final InAppMessage inAppMessage, final FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType inAppMessagingDismissType) {
        if (!isTestCampaign(inAppMessage)) {
            this.firebaseInstallations.getId().addOnSuccessListener(new OnSuccessListener() { // from class: f.h.e.n.e.q1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    MetricsLoggerClient.this.a(inAppMessage, inAppMessagingDismissType, (String) obj);
                }
            });
            logEventAsync(inAppMessage, AnalyticsConstants.ANALYTICS_DISMISS_EVENT, false);
        }
        this.developerListenerManager.messageDismissed(inAppMessage);
    }

    public void logImpression(final InAppMessage inAppMessage) {
        if (!isTestCampaign(inAppMessage)) {
            this.firebaseInstallations.getId().addOnSuccessListener(new OnSuccessListener() { // from class: f.h.e.n.e.p1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    MetricsLoggerClient.this.b(inAppMessage, (String) obj);
                }
            });
            logEventAsync(inAppMessage, AnalyticsConstants.ANALYTICS_IMPRESSION_EVENT, impressionCountsAsConversion(inAppMessage));
        }
        this.developerListenerManager.impressionDetected(inAppMessage);
    }

    public void logMessageClick(final InAppMessage inAppMessage, Action action) {
        if (!isTestCampaign(inAppMessage)) {
            this.firebaseInstallations.getId().addOnSuccessListener(new OnSuccessListener() { // from class: f.h.e.n.e.n1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    MetricsLoggerClient.this.c(inAppMessage, (String) obj);
                }
            });
            logEventAsync(inAppMessage, AnalyticsConstants.ANALYTICS_ACTION_EVENT, true);
        }
        this.developerListenerManager.messageClicked(inAppMessage, action);
    }

    public void logRenderError(final InAppMessage inAppMessage, final FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason inAppMessagingErrorReason) {
        if (!isTestCampaign(inAppMessage)) {
            this.firebaseInstallations.getId().addOnSuccessListener(new OnSuccessListener() { // from class: f.h.e.n.e.o1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    MetricsLoggerClient.this.d(inAppMessage, inAppMessagingErrorReason, (String) obj);
                }
            });
        }
        this.developerListenerManager.displayErrorEncountered(inAppMessage, inAppMessagingErrorReason);
    }
}
