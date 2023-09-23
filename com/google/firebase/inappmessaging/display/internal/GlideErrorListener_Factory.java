package com.google.firebase.inappmessaging.display.internal;

import com.google.firebase.inappmessaging.display.dagger.internal.Factory;

/* loaded from: classes2.dex */
public final class GlideErrorListener_Factory implements Factory<GlideErrorListener> {

    /* loaded from: classes2.dex */
    public static final class InstanceHolder {
        private static final GlideErrorListener_Factory INSTANCE = new GlideErrorListener_Factory();

        private InstanceHolder() {
        }
    }

    public static GlideErrorListener_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static GlideErrorListener newInstance() {
        return new GlideErrorListener();
    }

    @Override // com.google.firebase.inappmessaging.display.dagger.internal.Factory, h.a.a
    public GlideErrorListener get() {
        return newInstance();
    }
}
