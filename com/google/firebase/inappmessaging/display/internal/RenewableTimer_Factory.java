package com.google.firebase.inappmessaging.display.internal;

import com.google.firebase.inappmessaging.display.dagger.internal.Factory;

/* loaded from: classes2.dex */
public final class RenewableTimer_Factory implements Factory<RenewableTimer> {

    /* loaded from: classes2.dex */
    public static final class InstanceHolder {
        private static final RenewableTimer_Factory INSTANCE = new RenewableTimer_Factory();

        private InstanceHolder() {
        }
    }

    public static RenewableTimer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static RenewableTimer newInstance() {
        return new RenewableTimer();
    }

    @Override // com.google.firebase.inappmessaging.display.dagger.internal.Factory, h.a.a
    public RenewableTimer get() {
        return newInstance();
    }
}
