package com.google.firebase.inappmessaging.display.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import com.google.firebase.inappmessaging.display.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.display.internal.GlideErrorListener;
import f.e.a.h;
import h.a.a;

/* loaded from: classes2.dex */
public final class GlideModule_ProvidesGlideRequestManagerFactory implements Factory<h> {
    private final a<Application> applicationProvider;
    private final a<GlideErrorListener> glideErrorListenerProvider;
    private final GlideModule module;

    public GlideModule_ProvidesGlideRequestManagerFactory(GlideModule glideModule, a<Application> aVar, a<GlideErrorListener> aVar2) {
        this.module = glideModule;
        this.applicationProvider = aVar;
        this.glideErrorListenerProvider = aVar2;
    }

    public static GlideModule_ProvidesGlideRequestManagerFactory create(GlideModule glideModule, a<Application> aVar, a<GlideErrorListener> aVar2) {
        return new GlideModule_ProvidesGlideRequestManagerFactory(glideModule, aVar, aVar2);
    }

    public static h providesGlideRequestManager(GlideModule glideModule, Application application, GlideErrorListener glideErrorListener) {
        return (h) Preconditions.checkNotNull(glideModule.providesGlideRequestManager(application, glideErrorListener), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.firebase.inappmessaging.display.dagger.internal.Factory, h.a.a
    public h get() {
        return providesGlideRequestManager(this.module, this.applicationProvider.get(), this.glideErrorListenerProvider.get());
    }
}
