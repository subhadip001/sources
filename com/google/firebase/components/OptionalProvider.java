package com.google.firebase.components;

import com.google.firebase.components.OptionalProvider;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* loaded from: classes.dex */
public class OptionalProvider<T> implements Provider<T>, Deferred<T> {
    public static final /* synthetic */ int a = 0;
    private volatile Provider<T> delegate;
    private Deferred.DeferredHandler<T> handler;
    private static final Deferred.DeferredHandler<Object> NOOP_HANDLER = new Deferred.DeferredHandler() { // from class: f.h.e.h.m
        @Override // com.google.firebase.inject.Deferred.DeferredHandler
        public final void handle(Provider provider) {
            int i2 = OptionalProvider.a;
        }
    };
    private static final Provider<Object> EMPTY_PROVIDER = new Provider() { // from class: f.h.e.h.l
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            int i2 = OptionalProvider.a;
            return null;
        }
    };

    private OptionalProvider(Deferred.DeferredHandler<T> deferredHandler, Provider<T> provider) {
        this.handler = deferredHandler;
        this.delegate = provider;
    }

    public static <T> OptionalProvider<T> empty() {
        return new OptionalProvider<>(NOOP_HANDLER, EMPTY_PROVIDER);
    }

    public static <T> OptionalProvider<T> of(Provider<T> provider) {
        return new OptionalProvider<>(null, provider);
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        return this.delegate.get();
    }

    public void set(Provider<T> provider) {
        Deferred.DeferredHandler<T> deferredHandler;
        if (this.delegate == EMPTY_PROVIDER) {
            synchronized (this) {
                deferredHandler = this.handler;
                this.handler = null;
                this.delegate = provider;
            }
            deferredHandler.handle(provider);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    @Override // com.google.firebase.inject.Deferred
    public void whenAvailable(final Deferred.DeferredHandler<T> deferredHandler) {
        Provider<T> provider;
        Provider<T> provider2 = this.delegate;
        Provider<Object> provider3 = EMPTY_PROVIDER;
        if (provider2 != provider3) {
            deferredHandler.handle(provider2);
            return;
        }
        Provider<T> provider4 = null;
        synchronized (this) {
            provider = this.delegate;
            if (provider != provider3) {
                provider4 = provider;
            } else {
                final Deferred.DeferredHandler<T> deferredHandler2 = this.handler;
                this.handler = new Deferred.DeferredHandler() { // from class: f.h.e.h.n
                    @Override // com.google.firebase.inject.Deferred.DeferredHandler
                    public final void handle(Provider provider5) {
                        Deferred.DeferredHandler deferredHandler3 = Deferred.DeferredHandler.this;
                        Deferred.DeferredHandler deferredHandler4 = deferredHandler;
                        int i2 = OptionalProvider.a;
                        deferredHandler3.handle(provider5);
                        deferredHandler4.handle(provider5);
                    }
                };
            }
        }
        if (provider4 != null) {
            deferredHandler.handle(provider);
        }
    }
}
