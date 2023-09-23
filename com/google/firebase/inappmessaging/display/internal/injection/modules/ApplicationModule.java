package com.google.firebase.inappmessaging.display.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.display.dagger.Module;
import com.google.firebase.inappmessaging.display.dagger.Provides;

@Module
/* loaded from: classes2.dex */
public class ApplicationModule {
    private final Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    public Application providesApplication() {
        return this.application;
    }
}
