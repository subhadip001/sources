package com.google.firebase.inappmessaging.internal.injection.components;

import com.google.firebase.inappmessaging.FirebaseInAppMessaging;
import com.google.firebase.inappmessaging.dagger.BindsInstance;
import com.google.firebase.inappmessaging.dagger.Component;
import com.google.firebase.inappmessaging.internal.AbtIntegrationHelper;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule;
import com.google.firebase.inappmessaging.internal.injection.modules.GrpcClientModule;
import com.google.firebase.inappmessaging.internal.injection.modules.TransportClientModule;
import com.google.firebase.inappmessaging.internal.injection.scopes.FirebaseAppScope;
import f.h.b.a.f;

@FirebaseAppScope
@Component(dependencies = {UniversalComponent.class}, modules = {ApiClientModule.class, GrpcClientModule.class, TransportClientModule.class})
/* loaded from: classes2.dex */
public interface AppComponent {

    @Component.Builder
    /* loaded from: classes2.dex */
    public interface Builder {
        @BindsInstance
        Builder abtIntegrationHelper(AbtIntegrationHelper abtIntegrationHelper);

        Builder apiClientModule(ApiClientModule apiClientModule);

        AppComponent build();

        Builder grpcClientModule(GrpcClientModule grpcClientModule);

        @BindsInstance
        Builder transportFactory(f fVar);

        Builder universalComponent(UniversalComponent universalComponent);
    }

    DisplayCallbacksFactory displayCallbacksFactory();

    FirebaseInAppMessaging providesFirebaseInAppMessaging();
}
