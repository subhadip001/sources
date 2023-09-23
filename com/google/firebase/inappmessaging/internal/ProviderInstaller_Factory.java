package com.google.firebase.inappmessaging.internal;

import android.app.Application;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import h.a.a;

/* loaded from: classes2.dex */
public final class ProviderInstaller_Factory implements Factory<ProviderInstaller> {
    private final a<Application> applicationProvider;

    public ProviderInstaller_Factory(a<Application> aVar) {
        this.applicationProvider = aVar;
    }

    public static ProviderInstaller_Factory create(a<Application> aVar) {
        return new ProviderInstaller_Factory(aVar);
    }

    public static ProviderInstaller newInstance(Application application) {
        return new ProviderInstaller(application);
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public ProviderInstaller get() {
        return newInstance(this.applicationProvider.get());
    }
}
