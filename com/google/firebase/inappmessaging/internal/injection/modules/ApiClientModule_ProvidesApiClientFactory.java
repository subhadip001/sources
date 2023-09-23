package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.internal.ApiClient;
import com.google.firebase.inappmessaging.internal.GrpcClient;
import com.google.firebase.inappmessaging.internal.ProviderInstaller;
import h.a.a;

/* loaded from: classes2.dex */
public final class ApiClientModule_ProvidesApiClientFactory implements Factory<ApiClient> {
    private final a<Application> applicationProvider;
    private final a<GrpcClient> grpcClientProvider;
    private final ApiClientModule module;
    private final a<ProviderInstaller> providerInstallerProvider;

    public ApiClientModule_ProvidesApiClientFactory(ApiClientModule apiClientModule, a<GrpcClient> aVar, a<Application> aVar2, a<ProviderInstaller> aVar3) {
        this.module = apiClientModule;
        this.grpcClientProvider = aVar;
        this.applicationProvider = aVar2;
        this.providerInstallerProvider = aVar3;
    }

    public static ApiClientModule_ProvidesApiClientFactory create(ApiClientModule apiClientModule, a<GrpcClient> aVar, a<Application> aVar2, a<ProviderInstaller> aVar3) {
        return new ApiClientModule_ProvidesApiClientFactory(apiClientModule, aVar, aVar2, aVar3);
    }

    public static ApiClient providesApiClient(ApiClientModule apiClientModule, a<GrpcClient> aVar, Application application, ProviderInstaller providerInstaller) {
        return (ApiClient) Preconditions.checkNotNull(apiClientModule.providesApiClient(aVar, application, providerInstaller), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public ApiClient get() {
        return providesApiClient(this.module, this.grpcClientProvider, this.applicationProvider.get(), this.providerInstallerProvider.get());
    }
}
