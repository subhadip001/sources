package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.events.Subscriber;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.internal.DataCollectionHelper;
import com.google.firebase.inappmessaging.internal.SharedPreferencesUtils;
import h.a.a;

/* loaded from: classes2.dex */
public final class ApiClientModule_ProvidesDataCollectionHelperFactory implements Factory<DataCollectionHelper> {
    private final a<Subscriber> firebaseEventSubscriberProvider;
    private final ApiClientModule module;
    private final a<SharedPreferencesUtils> sharedPreferencesUtilsProvider;

    public ApiClientModule_ProvidesDataCollectionHelperFactory(ApiClientModule apiClientModule, a<SharedPreferencesUtils> aVar, a<Subscriber> aVar2) {
        this.module = apiClientModule;
        this.sharedPreferencesUtilsProvider = aVar;
        this.firebaseEventSubscriberProvider = aVar2;
    }

    public static ApiClientModule_ProvidesDataCollectionHelperFactory create(ApiClientModule apiClientModule, a<SharedPreferencesUtils> aVar, a<Subscriber> aVar2) {
        return new ApiClientModule_ProvidesDataCollectionHelperFactory(apiClientModule, aVar, aVar2);
    }

    public static DataCollectionHelper providesDataCollectionHelper(ApiClientModule apiClientModule, SharedPreferencesUtils sharedPreferencesUtils, Subscriber subscriber) {
        return (DataCollectionHelper) Preconditions.checkNotNull(apiClientModule.providesDataCollectionHelper(sharedPreferencesUtils, subscriber), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public DataCollectionHelper get() {
        return providesDataCollectionHelper(this.module, this.sharedPreferencesUtilsProvider.get(), this.firebaseEventSubscriberProvider.get());
    }
}
