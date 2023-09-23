package com.google.firebase.inappmessaging.display.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks;
import com.google.firebase.inappmessaging.model.InAppMessage;
import f.a.b.a.a;

/* loaded from: classes2.dex */
public class FirebaseInAppMessagingDisplayImpl implements FirebaseInAppMessagingDisplay, Application.ActivityLifecycleCallbacks {
    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay
    public void displayMessage(InAppMessage inAppMessage, FirebaseInAppMessagingDisplayCallbacks firebaseInAppMessagingDisplayCallbacks) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        StringBuilder A = a.A("Created activity: ");
        A.append(activity.getClass().getName());
        Logging.logd(A.toString());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        StringBuilder A = a.A("Destroyed activity: ");
        A.append(activity.getClass().getName());
        Logging.logd(A.toString());
    }

    public void onActivityPaused(Activity activity) {
        StringBuilder A = a.A("Pausing activity: ");
        A.append(activity.getClass().getName());
        Logging.logd(A.toString());
    }

    public void onActivityResumed(Activity activity) {
        StringBuilder A = a.A("Resumed activity: ");
        A.append(activity.getClass().getName());
        Logging.logd(A.toString());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        StringBuilder A = a.A("SavedInstance activity: ");
        A.append(activity.getClass().getName());
        Logging.logd(A.toString());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        StringBuilder A = a.A("Started activity: ");
        A.append(activity.getClass().getName());
        Logging.logd(A.toString());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        StringBuilder A = a.A("Stopped activity: ");
        A.append(activity.getClass().getName());
        Logging.logd(A.toString());
    }
}
