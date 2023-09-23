package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import f.h.g.a.a.a.d.g;
import g.a.c;
import g.a.i0;
import h.a.a;

/* loaded from: classes2.dex */
public final class GrpcClientModule_ProvidesInAppMessagingSdkServingStubFactory implements Factory<g.a> {
    private final a<c> channelProvider;
    private final a<i0> metadataProvider;
    private final GrpcClientModule module;

    public GrpcClientModule_ProvidesInAppMessagingSdkServingStubFactory(GrpcClientModule grpcClientModule, a<c> aVar, a<i0> aVar2) {
        this.module = grpcClientModule;
        this.channelProvider = aVar;
        this.metadataProvider = aVar2;
    }

    public static GrpcClientModule_ProvidesInAppMessagingSdkServingStubFactory create(GrpcClientModule grpcClientModule, a<c> aVar, a<i0> aVar2) {
        return new GrpcClientModule_ProvidesInAppMessagingSdkServingStubFactory(grpcClientModule, aVar, aVar2);
    }

    public static g.a providesInAppMessagingSdkServingStub(GrpcClientModule grpcClientModule, c cVar, i0 i0Var) {
        return (g.a) Preconditions.checkNotNull(grpcClientModule.providesInAppMessagingSdkServingStub(cVar, i0Var), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public g.a get() {
        return providesInAppMessagingSdkServingStub(this.module, this.channelProvider.get(), this.metadataProvider.get());
    }
}
