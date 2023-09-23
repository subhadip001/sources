package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.internal.SharedPreferencesUtils;

/* loaded from: classes2.dex */
public final class ApiClientModule_ProvidesSharedPreferencesUtilsFactory implements Factory<SharedPreferencesUtils> {
    private final ApiClientModule module;

    public ApiClientModule_ProvidesSharedPreferencesUtilsFactory(ApiClientModule apiClientModule) {
        this.module = apiClientModule;
    }

    public static ApiClientModule_ProvidesSharedPreferencesUtilsFactory create(ApiClientModule apiClientModule) {
        return new ApiClientModule_ProvidesSharedPreferencesUtilsFactory(apiClientModule);
    }

    public static SharedPreferencesUtils providesSharedPreferencesUtils(ApiClientModule apiClientModule) {
        return (SharedPreferencesUtils) Preconditions.checkNotNull(apiClientModule.providesSharedPreferencesUtils(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public SharedPreferencesUtils get() {
        return providesSharedPreferencesUtils(this.module);
    }
}
