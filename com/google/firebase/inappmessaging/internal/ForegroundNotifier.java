package com.google.firebase.inappmessaging.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import com.google.firebase.inappmessaging.internal.ForegroundNotifier;
import g.c.d;
import g.c.w.b.b;
import g.c.w.e.b.n;
import g.c.w.e.b.q;
import g.c.z.a;
import java.util.Objects;

/* loaded from: classes2.dex */
public class ForegroundNotifier implements Application.ActivityLifecycleCallbacks {
    public static final long DELAY_MILLIS = 1000;
    private Runnable check;
    private final Handler handler = new Handler();
    private boolean foreground = false;
    private boolean paused = true;
    private final a<String> foregroundSubject = new a<>();

    public /* synthetic */ void a() {
        boolean z = this.foreground;
        this.foreground = !(z && this.paused) && z;
    }

    public g.c.u.a<String> foregroundFlowable() {
        a<String> aVar = this.foregroundSubject;
        Objects.requireNonNull(aVar);
        n nVar = new n(aVar);
        int i2 = d.f8128f;
        b.a(i2, "bufferSize");
        return new q(nVar, i2, true, false, g.c.w.b.a.c).c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.paused = true;
        Runnable runnable = this.check;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
        }
        Handler handler = this.handler;
        Runnable runnable2 = new Runnable() { // from class: f.h.e.n.e.y
            @Override // java.lang.Runnable
            public final void run() {
                ForegroundNotifier.this.a();
            }
        };
        this.check = runnable2;
        handler.postDelayed(runnable2, 1000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.paused = false;
        boolean z = !this.foreground;
        this.foreground = true;
        Runnable runnable = this.check;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
        }
        if (z) {
            Logging.logi("went foreground");
            this.foregroundSubject.onNext(InAppMessageStreamManager.ON_FOREGROUND);
        }
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
