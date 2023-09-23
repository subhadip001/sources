package com.google.firebase.inappmessaging.display.internal;

import android.app.Application;
import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import h.a.a;

/* loaded from: classes2.dex */
public final class BindingWrapperFactory_Factory implements Factory<BindingWrapperFactory> {
    private final a<Application> applicationProvider;

    public BindingWrapperFactory_Factory(a<Application> aVar) {
        this.applicationProvider = aVar;
    }

    public static BindingWrapperFactory_Factory create(a<Application> aVar) {
        return new BindingWrapperFactory_Factory(aVar);
    }

    public static BindingWrapperFactory newInstance(Application application) {
        return new BindingWrapperFactory(application);
    }

    @Override // com.google.firebase.inappmessaging.display.dagger.internal.Factory, h.a.a
    public BindingWrapperFactory get() {
        return newInstance(this.applicationProvider.get());
    }
}
