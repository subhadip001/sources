package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.internal.SharedPreferencesUtils;
import com.google.firebase.inappmessaging.internal.TestDeviceHelper;
import h.a.a;

/* loaded from: classes2.dex */
public final class ApiClientModule_ProvidesTestDeviceHelperFactory implements Factory<TestDeviceHelper> {
    private final ApiClientModule module;
    private final a<SharedPreferencesUtils> sharedPreferencesUtilsProvider;

    public ApiClientModule_ProvidesTestDeviceHelperFactory(ApiClientModule apiClientModule, a<SharedPreferencesUtils> aVar) {
        this.module = apiClientModule;
        this.sharedPreferencesUtilsProvider = aVar;
    }

    public static ApiClientModule_ProvidesTestDeviceHelperFactory create(ApiClientModule apiClientModule, a<SharedPreferencesUtils> aVar) {
        return new ApiClientModule_ProvidesTestDeviceHelperFactory(apiClientModule, aVar);
    }

    public static TestDeviceHelper providesTestDeviceHelper(ApiClientModule apiClientModule, SharedPreferencesUtils sharedPreferencesUtils) {
        return (TestDeviceHelper) Preconditions.checkNotNull(apiClientModule.providesTestDeviceHelper(sharedPreferencesUtils), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public TestDeviceHelper get() {
        return providesTestDeviceHelper(this.module, this.sharedPreferencesUtilsProvider.get());
    }
}
