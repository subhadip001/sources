package com.google.firebase.inappmessaging.internal;

import com.google.firebase.FirebaseApp;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import h.a.a;

/* loaded from: classes2.dex */
public final class SharedPreferencesUtils_Factory implements Factory<SharedPreferencesUtils> {
    private final a<FirebaseApp> firebaseAppProvider;

    public SharedPreferencesUtils_Factory(a<FirebaseApp> aVar) {
        this.firebaseAppProvider = aVar;
    }

    public static SharedPreferencesUtils_Factory create(a<FirebaseApp> aVar) {
        return new SharedPreferencesUtils_Factory(aVar);
    }

    public static SharedPreferencesUtils newInstance(FirebaseApp firebaseApp) {
        return new SharedPreferencesUtils(firebaseApp);
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public SharedPreferencesUtils get() {
        return newInstance(this.firebaseAppProvider.get());
    }
}
