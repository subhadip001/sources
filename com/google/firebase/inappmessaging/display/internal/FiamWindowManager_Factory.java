package com.google.firebase.inappmessaging.display.internal;

import com.google.firebase.inappmessaging.display.dagger.internal.Factory;

/* loaded from: classes2.dex */
public final class FiamWindowManager_Factory implements Factory<FiamWindowManager> {

    /* loaded from: classes2.dex */
    public static final class InstanceHolder {
        private static final FiamWindowManager_Factory INSTANCE = new FiamWindowManager_Factory();

        private InstanceHolder() {
        }
    }

    public static FiamWindowManager_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static FiamWindowManager newInstance() {
        return new FiamWindowManager();
    }

    @Override // com.google.firebase.inappmessaging.display.dagger.internal.Factory, h.a.a
    public FiamWindowManager get() {
        return newInstance();
    }
}
