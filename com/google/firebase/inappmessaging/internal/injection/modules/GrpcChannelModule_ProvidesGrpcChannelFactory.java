package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import g.a.c;
import h.a.a;

/* loaded from: classes2.dex */
public final class GrpcChannelModule_ProvidesGrpcChannelFactory implements Factory<c> {
    private final a<String> hostProvider;
    private final GrpcChannelModule module;

    public GrpcChannelModule_ProvidesGrpcChannelFactory(GrpcChannelModule grpcChannelModule, a<String> aVar) {
        this.module = grpcChannelModule;
        this.hostProvider = aVar;
    }

    public static GrpcChannelModule_ProvidesGrpcChannelFactory create(GrpcChannelModule grpcChannelModule, a<String> aVar) {
        return new GrpcChannelModule_ProvidesGrpcChannelFactory(grpcChannelModule, aVar);
    }

    public static c providesGrpcChannel(GrpcChannelModule grpcChannelModule, String str) {
        return (c) Preconditions.checkNotNull(grpcChannelModule.providesGrpcChannel(str), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public c get() {
        return providesGrpcChannel(this.module, this.hostProvider.get());
    }
}
