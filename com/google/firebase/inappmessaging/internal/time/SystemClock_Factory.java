package com.google.firebase.inappmessaging.internal.time;

import com.google.firebase.inappmessaging.dagger.internal.Factory;

/* loaded from: classes2.dex */
public final class SystemClock_Factory implements Factory<SystemClock> {

    /* loaded from: classes2.dex */
    public static final class InstanceHolder {
        private static final SystemClock_Factory INSTANCE = new SystemClock_Factory();

        private InstanceHolder() {
        }
    }

    public static SystemClock_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SystemClock newInstance() {
        return new SystemClock();
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public SystemClock get() {
        return newInstance();
    }
}
