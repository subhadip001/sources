package com.google.firebase.inappmessaging.internal;

import com.google.firebase.FirebaseApp;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import h.a.a;

/* loaded from: classes2.dex */
public final class DataCollectionHelper_Factory implements Factory<DataCollectionHelper> {
    private final a<FirebaseApp> firebaseAppProvider;
    private final a<Subscriber> firebaseEventsSubscriberProvider;
    private final a<SharedPreferencesUtils> sharedPreferencesUtilsProvider;

    public DataCollectionHelper_Factory(a<FirebaseApp> aVar, a<SharedPreferencesUtils> aVar2, a<Subscriber> aVar3) {
        this.firebaseAppProvider = aVar;
        this.sharedPreferencesUtilsProvider = aVar2;
        this.firebaseEventsSubscriberProvider = aVar3;
    }

    public static DataCollectionHelper_Factory create(a<FirebaseApp> aVar, a<SharedPreferencesUtils> aVar2, a<Subscriber> aVar3) {
        return new DataCollectionHelper_Factory(aVar, aVar2, aVar3);
    }

    public static DataCollectionHelper newInstance(FirebaseApp firebaseApp, SharedPreferencesUtils sharedPreferencesUtils, Subscriber subscriber) {
        return new DataCollectionHelper(firebaseApp, sharedPreferencesUtils, subscriber);
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public DataCollectionHelper get() {
        return newInstance(this.firebaseAppProvider.get(), this.sharedPreferencesUtilsProvider.get(), this.firebaseEventsSubscriberProvider.get());
    }
}
