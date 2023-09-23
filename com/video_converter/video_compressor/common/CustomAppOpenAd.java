package com.video_converter.video_compressor.common;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import e.s.l;
import e.s.u;
import e.s.v;
import java.util.Objects;

/* loaded from: classes2.dex */
public class CustomAppOpenAd extends Application implements Application.ActivityLifecycleCallbacks, l {

    /* renamed from: f  reason: collision with root package name */
    public a f1361f;

    /* loaded from: classes2.dex */
    public class a {
        public a(CustomAppOpenAd customAppOpenAd, CustomAppOpenAd customAppOpenAd2) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Objects.requireNonNull(this.f1361f);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(this);
        v.n.f2825k.a(this);
        this.f1361f = new a(this, this);
    }

    @u(Lifecycle.Event.ON_START)
    public void onMoveToForeground() {
    }
}
