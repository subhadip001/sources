package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import h.a.a;

/* loaded from: classes2.dex */
public final class ImpressionStorageClient_Factory implements Factory<ImpressionStorageClient> {
    private final a<ProtoStorageClient> storageClientProvider;

    public ImpressionStorageClient_Factory(a<ProtoStorageClient> aVar) {
        this.storageClientProvider = aVar;
    }

    public static ImpressionStorageClient_Factory create(a<ProtoStorageClient> aVar) {
        return new ImpressionStorageClient_Factory(aVar);
    }

    public static ImpressionStorageClient newInstance(ProtoStorageClient protoStorageClient) {
        return new ImpressionStorageClient(protoStorageClient);
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public ImpressionStorageClient get() {
        return newInstance(this.storageClientProvider.get());
    }
}
