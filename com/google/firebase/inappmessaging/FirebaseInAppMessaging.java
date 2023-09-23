package com.google.firebase.inappmessaging;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inappmessaging.FirebaseInAppMessaging;
import com.google.firebase.inappmessaging.internal.DataCollectionHelper;
import com.google.firebase.inappmessaging.internal.DeveloperListenerManager;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksFactory;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager;
import com.google.firebase.inappmessaging.internal.Logging;
import com.google.firebase.inappmessaging.internal.ProgramaticContextualTriggers;
import com.google.firebase.inappmessaging.internal.injection.qualifiers.ProgrammaticTrigger;
import com.google.firebase.inappmessaging.internal.injection.scopes.FirebaseAppScope;
import com.google.firebase.inappmessaging.model.TriggeredInAppMessage;
import com.google.firebase.installations.FirebaseInstallationsApi;
import g.c.d;
import g.c.v.c;
import g.c.w.b.a;
import io.reactivex.internal.operators.flowable.FlowableInternalHelper$RequestMax;
import java.util.Objects;
import java.util.concurrent.Executor;

@FirebaseAppScope
/* loaded from: classes2.dex */
public class FirebaseInAppMessaging {
    private boolean areMessagesSuppressed = false;
    private final DataCollectionHelper dataCollectionHelper;
    private final DeveloperListenerManager developerListenerManager;
    private final DisplayCallbacksFactory displayCallbacksFactory;
    private FirebaseInAppMessagingDisplay fiamDisplay;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final InAppMessageStreamManager inAppMessageStreamManager;
    private final ProgramaticContextualTriggers programaticContextualTriggers;

    @VisibleForTesting
    public FirebaseInAppMessaging(InAppMessageStreamManager inAppMessageStreamManager, @ProgrammaticTrigger ProgramaticContextualTriggers programaticContextualTriggers, DataCollectionHelper dataCollectionHelper, FirebaseInstallationsApi firebaseInstallationsApi, DisplayCallbacksFactory displayCallbacksFactory, DeveloperListenerManager developerListenerManager) {
        this.inAppMessageStreamManager = inAppMessageStreamManager;
        this.programaticContextualTriggers = programaticContextualTriggers;
        this.dataCollectionHelper = dataCollectionHelper;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.displayCallbacksFactory = displayCallbacksFactory;
        this.developerListenerManager = developerListenerManager;
        firebaseInstallationsApi.getId().addOnSuccessListener(new OnSuccessListener() { // from class: f.h.e.n.b
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Logging.logi("Starting InAppMessaging runtime with Installation ID " + ((String) obj));
            }
        });
        d<TriggeredInAppMessage> createFirebaseInAppMessageStream = inAppMessageStreamManager.createFirebaseInAppMessageStream();
        c cVar = new c() { // from class: f.h.e.n.a
            @Override // g.c.v.c
            public final void accept(Object obj) {
                FirebaseInAppMessaging.a(FirebaseInAppMessaging.this, (TriggeredInAppMessage) obj);
            }
        };
        Objects.requireNonNull(createFirebaseInAppMessageStream);
        c<Throwable> cVar2 = a.f8142e;
        g.c.v.a aVar = a.c;
        FlowableInternalHelper$RequestMax flowableInternalHelper$RequestMax = FlowableInternalHelper$RequestMax.INSTANCE;
        Objects.requireNonNull(flowableInternalHelper$RequestMax, "onSubscribe is null");
        createFirebaseInAppMessageStream.d(new g.c.w.h.c(cVar, cVar2, aVar, flowableInternalHelper$RequestMax));
    }

    public static /* synthetic */ void a(FirebaseInAppMessaging firebaseInAppMessaging, TriggeredInAppMessage triggeredInAppMessage) {
        firebaseInAppMessaging.triggerInAppMessage(triggeredInAppMessage);
    }

    public static FirebaseInAppMessaging getInstance() {
        return (FirebaseInAppMessaging) FirebaseApp.getInstance().get(FirebaseInAppMessaging.class);
    }

    public void triggerInAppMessage(TriggeredInAppMessage triggeredInAppMessage) {
        FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay = this.fiamDisplay;
        if (firebaseInAppMessagingDisplay != null) {
            firebaseInAppMessagingDisplay.displayMessage(triggeredInAppMessage.getInAppMessage(), this.displayCallbacksFactory.generateDisplayCallback(triggeredInAppMessage.getInAppMessage(), triggeredInAppMessage.getTriggeringEvent()));
        }
    }

    public void addClickListener(FirebaseInAppMessagingClickListener firebaseInAppMessagingClickListener) {
        this.developerListenerManager.addClickListener(firebaseInAppMessagingClickListener);
    }

    public void addDismissListener(FirebaseInAppMessagingDismissListener firebaseInAppMessagingDismissListener) {
        this.developerListenerManager.addDismissListener(firebaseInAppMessagingDismissListener);
    }

    public void addDisplayErrorListener(FirebaseInAppMessagingDisplayErrorListener firebaseInAppMessagingDisplayErrorListener) {
        this.developerListenerManager.addDisplayErrorListener(firebaseInAppMessagingDisplayErrorListener);
    }

    public void addImpressionListener(FirebaseInAppMessagingImpressionListener firebaseInAppMessagingImpressionListener) {
        this.developerListenerManager.addImpressionListener(firebaseInAppMessagingImpressionListener);
    }

    public boolean areMessagesSuppressed() {
        return this.areMessagesSuppressed;
    }

    public void clearDisplayListener() {
        Logging.logi("Removing display event component");
        this.fiamDisplay = null;
    }

    public boolean isAutomaticDataCollectionEnabled() {
        return this.dataCollectionHelper.isAutomaticDataCollectionEnabled();
    }

    public void removeAllListeners() {
        this.developerListenerManager.removeAllListeners();
    }

    public void removeClickListener(FirebaseInAppMessagingClickListener firebaseInAppMessagingClickListener) {
        this.developerListenerManager.removeClickListener(firebaseInAppMessagingClickListener);
    }

    public void removeDisplayErrorListener(FirebaseInAppMessagingDisplayErrorListener firebaseInAppMessagingDisplayErrorListener) {
        this.developerListenerManager.removeDisplayErrorListener(firebaseInAppMessagingDisplayErrorListener);
    }

    public void removeImpressionListener(FirebaseInAppMessagingImpressionListener firebaseInAppMessagingImpressionListener) {
        this.developerListenerManager.removeImpressionListener(firebaseInAppMessagingImpressionListener);
    }

    public void setAutomaticDataCollectionEnabled(Boolean bool) {
        this.dataCollectionHelper.setAutomaticDataCollectionEnabled(bool);
    }

    public void setMessageDisplayComponent(FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay) {
        Logging.logi("Setting display event component");
        this.fiamDisplay = firebaseInAppMessagingDisplay;
    }

    public void setMessagesSuppressed(Boolean bool) {
        this.areMessagesSuppressed = bool.booleanValue();
    }

    public void triggerEvent(String str) {
        this.programaticContextualTriggers.triggerEvent(str);
    }

    public void addClickListener(FirebaseInAppMessagingClickListener firebaseInAppMessagingClickListener, Executor executor) {
        this.developerListenerManager.addClickListener(firebaseInAppMessagingClickListener, executor);
    }

    public void addDismissListener(FirebaseInAppMessagingDismissListener firebaseInAppMessagingDismissListener, Executor executor) {
        this.developerListenerManager.addDismissListener(firebaseInAppMessagingDismissListener, executor);
    }

    public void addDisplayErrorListener(FirebaseInAppMessagingDisplayErrorListener firebaseInAppMessagingDisplayErrorListener, Executor executor) {
        this.developerListenerManager.addDisplayErrorListener(firebaseInAppMessagingDisplayErrorListener, executor);
    }

    public void addImpressionListener(FirebaseInAppMessagingImpressionListener firebaseInAppMessagingImpressionListener, Executor executor) {
        this.developerListenerManager.addImpressionListener(firebaseInAppMessagingImpressionListener, executor);
    }

    public void setAutomaticDataCollectionEnabled(boolean z) {
        this.dataCollectionHelper.setAutomaticDataCollectionEnabled(z);
    }
}
