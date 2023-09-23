package com.google.firebase.inappmessaging.internal;

import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import h.a.a;

/* loaded from: classes2.dex */
public final class AbtIntegrationHelper_Factory implements Factory<AbtIntegrationHelper> {
    private final a<FirebaseABTesting> abTestingProvider;

    public AbtIntegrationHelper_Factory(a<FirebaseABTesting> aVar) {
        this.abTestingProvider = aVar;
    }

    public static AbtIntegrationHelper_Factory create(a<FirebaseABTesting> aVar) {
        return new AbtIntegrationHelper_Factory(aVar);
    }

    public static AbtIntegrationHelper newInstance(FirebaseABTesting firebaseABTesting) {
        return new AbtIntegrationHelper(firebaseABTesting);
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public AbtIntegrationHelper get() {
        return newInstance(this.abTestingProvider.get());
    }
}
