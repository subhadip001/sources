package com.google.firebase.inappmessaging.dagger.internal;

import com.google.firebase.inappmessaging.dagger.Lazy;
import h.a.a;

/* loaded from: classes2.dex */
public final class ProviderOfLazy<T> implements a<Lazy<T>> {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private final a<T> provider;

    private ProviderOfLazy(a<T> aVar) {
        this.provider = aVar;
    }

    public static <T> a<Lazy<T>> create(a<T> aVar) {
        return new ProviderOfLazy((a) Preconditions.checkNotNull(aVar));
    }

    @Override // h.a.a
    public Lazy<T> get() {
        return DoubleCheck.lazy(this.provider);
    }
}
