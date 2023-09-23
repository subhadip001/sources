package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import f.h.g.a.a.a.d.g;
import h.a.a;

/* loaded from: classes2.dex */
public final class GrpcClient_Factory implements Factory<GrpcClient> {
    private final a<g.a> stubProvider;

    public GrpcClient_Factory(a<g.a> aVar) {
        this.stubProvider = aVar;
    }

    public static GrpcClient_Factory create(a<g.a> aVar) {
        return new GrpcClient_Factory(aVar);
    }

    public static GrpcClient newInstance(g.a aVar) {
        return new GrpcClient(aVar);
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public GrpcClient get() {
        return newInstance(this.stubProvider.get());
    }
}
