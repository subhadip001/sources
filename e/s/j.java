package e.s;

import android.app.Activity;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LifecycleDispatcher.java */
/* loaded from: classes.dex */
public class j {
    public static AtomicBoolean a = new AtomicBoolean(false);

    /* compiled from: LifecycleDispatcher.java */
    /* loaded from: classes.dex */
    public static class a extends f {
        @Override // e.s.f, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            x.c(activity);
        }

        @Override // e.s.f, android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // e.s.f, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }
}
