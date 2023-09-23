package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.dagger.Module;
import com.google.firebase.inappmessaging.dagger.Provides;
import com.google.firebase.inappmessaging.internal.ForegroundNotifier;
import com.google.firebase.inappmessaging.internal.injection.qualifiers.AppForeground;
import g.c.u.a;

@Module
/* loaded from: classes2.dex */
public class ForegroundFlowableModule {
    @Provides
    @AppForeground
    public a<String> providesAppForegroundEventStream(Application application) {
        ForegroundNotifier foregroundNotifier = new ForegroundNotifier();
        a<String> foregroundFlowable = foregroundNotifier.foregroundFlowable();
        foregroundFlowable.f();
        application.registerActivityLifecycleCallbacks(foregroundNotifier);
        return foregroundFlowable;
    }
}
