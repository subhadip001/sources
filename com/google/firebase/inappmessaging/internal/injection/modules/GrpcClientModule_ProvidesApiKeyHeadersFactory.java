package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import g.a.i0;

/* loaded from: classes2.dex */
public final class GrpcClientModule_ProvidesApiKeyHeadersFactory implements Factory<i0> {
    private final GrpcClientModule module;

    public GrpcClientModule_ProvidesApiKeyHeadersFactory(GrpcClientModule grpcClientModule) {
        this.module = grpcClientModule;
    }

    public static GrpcClientModule_ProvidesApiKeyHeadersFactory create(GrpcClientModule grpcClientModule) {
        return new GrpcClientModule_ProvidesApiKeyHeadersFactory(grpcClientModule);
    }

    public static i0 providesApiKeyHeaders(GrpcClientModule grpcClientModule) {
        return (i0) Preconditions.checkNotNull(grpcClientModule.providesApiKeyHeaders(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public i0 get() {
        return providesApiKeyHeaders(this.module);
    }
}
