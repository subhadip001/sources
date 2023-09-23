package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import h.a.a;

/* loaded from: classes2.dex */
public final class TestDeviceHelper_Factory implements Factory<TestDeviceHelper> {
    private final a<SharedPreferencesUtils> sharedPreferencesUtilsProvider;

    public TestDeviceHelper_Factory(a<SharedPreferencesUtils> aVar) {
        this.sharedPreferencesUtilsProvider = aVar;
    }

    public static TestDeviceHelper_Factory create(a<SharedPreferencesUtils> aVar) {
        return new TestDeviceHelper_Factory(aVar);
    }

    public static TestDeviceHelper newInstance(SharedPreferencesUtils sharedPreferencesUtils) {
        return new TestDeviceHelper(sharedPreferencesUtils);
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public TestDeviceHelper get() {
        return newInstance(this.sharedPreferencesUtilsProvider.get());
    }
}
