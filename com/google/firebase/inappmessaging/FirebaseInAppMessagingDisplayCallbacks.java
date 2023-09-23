package com.google.firebase.inappmessaging;

import com.google.android.gms.tasks.Task;
import com.google.firebase.inappmessaging.model.Action;

/* loaded from: classes2.dex */
public interface FirebaseInAppMessagingDisplayCallbacks {

    /* loaded from: classes2.dex */
    public enum InAppMessagingDismissType {
        UNKNOWN_DISMISS_TYPE,
        AUTO,
        CLICK,
        SWIPE
    }

    /* loaded from: classes2.dex */
    public enum InAppMessagingErrorReason {
        UNSPECIFIED_RENDER_ERROR,
        IMAGE_FETCH_ERROR,
        IMAGE_DISPLAY_ERROR,
        IMAGE_UNSUPPORTED_FORMAT
    }

    Task<Void> displayErrorEncountered(InAppMessagingErrorReason inAppMessagingErrorReason);

    Task<Void> impressionDetected();

    Task<Void> messageClicked(Action action);

    Task<Void> messageDismissed(InAppMessagingDismissType inAppMessagingDismissType);
}
