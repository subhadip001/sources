package com.google.firebase.messaging;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.FcmLifecycleCallbacks;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class FcmLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    private final Set<Intent> seenIntents = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: logNotificationOpen */
    public void a(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                bundle = extras.getBundle(Constants.MessageNotificationKeys.ANALYTICS_DATA);
            }
        } catch (RuntimeException e2) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e2);
        }
        if (MessagingAnalytics.shouldUploadScionMetrics(bundle)) {
            MessagingAnalytics.logNotificationOpen(bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        final Intent intent = activity.getIntent();
        if (intent == null || !this.seenIntents.add(intent)) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: f.h.e.p.g
                @Override // java.lang.Runnable
                public final void run() {
                    FcmLifecycleCallbacks.this.a(intent);
                }
            });
        } else {
            a(intent);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.seenIntents.remove(activity.getIntent());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
