package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import g.c.u.a;

/* loaded from: classes2.dex */
public final class ForegroundFlowableModule_ProvidesAppForegroundEventStreamFactory implements Factory<a<String>> {
    private final h.a.a<Application> applicationProvider;
    private final ForegroundFlowableModule module;

    public ForegroundFlowableModule_ProvidesAppForegroundEventStreamFactory(ForegroundFlowableModule foregroundFlowableModule, h.a.a<Application> aVar) {
        this.module = foregroundFlowableModule;
        this.applicationProvider = aVar;
    }

    public static ForegroundFlowableModule_ProvidesAppForegroundEventStreamFactory create(ForegroundFlowableModule foregroundFlowableModule, h.a.a<Application> aVar) {
        return new ForegroundFlowableModule_ProvidesAppForegroundEventStreamFactory(foregroundFlowableModule, aVar);
    }

    public static a<String> providesAppForegroundEventStream(ForegroundFlowableModule foregroundFlowableModule, Application application) {
        return (a) Preconditions.checkNotNull(foregroundFlowableModule.providesAppForegroundEventStream(application), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public a<String> get() {
        return providesAppForegroundEventStream(this.module, this.applicationProvider.get());
    }
}
