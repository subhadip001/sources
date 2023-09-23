package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.internal.ProtoStorageClient;
import h.a.a;

/* loaded from: classes2.dex */
public final class ProtoStorageClientModule_ProvidesProtoStorageClientForImpressionStoreFactory implements Factory<ProtoStorageClient> {
    private final a<Application> applicationProvider;
    private final ProtoStorageClientModule module;

    public ProtoStorageClientModule_ProvidesProtoStorageClientForImpressionStoreFactory(ProtoStorageClientModule protoStorageClientModule, a<Application> aVar) {
        this.module = protoStorageClientModule;
        this.applicationProvider = aVar;
    }

    public static ProtoStorageClientModule_ProvidesProtoStorageClientForImpressionStoreFactory create(ProtoStorageClientModule protoStorageClientModule, a<Application> aVar) {
        return new ProtoStorageClientModule_ProvidesProtoStorageClientForImpressionStoreFactory(protoStorageClientModule, aVar);
    }

    public static ProtoStorageClient providesProtoStorageClientForImpressionStore(ProtoStorageClientModule protoStorageClientModule, Application application) {
        return (ProtoStorageClient) Preconditions.checkNotNull(protoStorageClientModule.providesProtoStorageClientForImpressionStore(application), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public ProtoStorageClient get() {
        return providesProtoStorageClientForImpressionStore(this.module, this.applicationProvider.get());
    }
}
