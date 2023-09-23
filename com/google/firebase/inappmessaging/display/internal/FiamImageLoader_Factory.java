package com.google.firebase.inappmessaging.display.internal;

import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import f.e.a.h;
import h.a.a;

/* loaded from: classes2.dex */
public final class FiamImageLoader_Factory implements Factory<FiamImageLoader> {
    private final a<h> requestManagerProvider;

    public FiamImageLoader_Factory(a<h> aVar) {
        this.requestManagerProvider = aVar;
    }

    public static FiamImageLoader_Factory create(a<h> aVar) {
        return new FiamImageLoader_Factory(aVar);
    }

    public static FiamImageLoader newInstance(h hVar) {
        return new FiamImageLoader(hVar);
    }

    @Override // com.google.firebase.inappmessaging.display.dagger.internal.Factory, h.a.a
    public FiamImageLoader get() {
        return newInstance(this.requestManagerProvider.get());
    }
}
