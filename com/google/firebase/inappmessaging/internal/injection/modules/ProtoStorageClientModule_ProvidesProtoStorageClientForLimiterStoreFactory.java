package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.internal.ProtoStorageClient;
import h.a.a;

/* loaded from: classes2.dex */
public final class ProtoStorageClientModule_ProvidesProtoStorageClientForLimiterStoreFactory implements Factory<ProtoStorageClient> {
    private final a<Application> applicationProvider;
    private final ProtoStorageClientModule module;

    public ProtoStorageClientModule_ProvidesProtoStorageClientForLimiterStoreFactory(ProtoStorageClientModule protoStorageClientModule, a<Application> aVar) {
        this.module = protoStorageClientModule;
        this.applicationProvider = aVar;
    }

    public static ProtoStorageClientModule_ProvidesProtoStorageClientForLimiterStoreFactory create(ProtoStorageClientModule protoStorageClientModule, a<Application> aVar) {
        return new ProtoStorageClientModule_ProvidesProtoStorageClientForLimiterStoreFactory(protoStorageClientModule, aVar);
    }

    public static ProtoStorageClient providesProtoStorageClientForLimiterStore(ProtoStorageClientModule protoStorageClientModule, Application application) {
        return (ProtoStorageClient) Preconditions.checkNotNull(protoStorageClientModule.providesProtoStorageClientForLimiterStore(application), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public ProtoStorageClient get() {
        return providesProtoStorageClientForLimiterStore(this.module, this.applicationProvider.get());
    }
}
