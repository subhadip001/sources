package com.google.firebase.inappmessaging;

import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.component.AbtComponent;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingRegistrar;
import com.google.firebase.inappmessaging.internal.AbtIntegrationHelper;
import com.google.firebase.inappmessaging.internal.ProgramaticContextualTriggers;
import com.google.firebase.inappmessaging.internal.injection.components.DaggerAppComponent;
import com.google.firebase.inappmessaging.internal.injection.components.DaggerUniversalComponent;
import com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent;
import com.google.firebase.inappmessaging.internal.injection.modules.AnalyticsEventsModule;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule;
import com.google.firebase.inappmessaging.internal.injection.modules.AppMeasurementModule;
import com.google.firebase.inappmessaging.internal.injection.modules.ApplicationModule;
import com.google.firebase.inappmessaging.internal.injection.modules.GrpcClientModule;
import com.google.firebase.inappmessaging.internal.injection.modules.ProgrammaticContextualTriggerFlowableModule;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import f.h.b.a.f;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public class FirebaseInAppMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fiam";

    public static /* synthetic */ FirebaseInAppMessaging a(FirebaseInAppMessagingRegistrar firebaseInAppMessagingRegistrar, ComponentContainer componentContainer) {
        return firebaseInAppMessagingRegistrar.providesFirebaseInAppMessaging(componentContainer);
    }

    public FirebaseInAppMessaging providesFirebaseInAppMessaging(ComponentContainer componentContainer) {
        FirebaseApp firebaseApp = (FirebaseApp) componentContainer.get(FirebaseApp.class);
        UniversalComponent build = DaggerUniversalComponent.builder().applicationModule(new ApplicationModule((Application) firebaseApp.getApplicationContext())).appMeasurementModule(new AppMeasurementModule(componentContainer.getDeferred(AnalyticsConnector.class), (Subscriber) componentContainer.get(Subscriber.class))).analyticsEventsModule(new AnalyticsEventsModule()).programmaticContextualTriggerFlowableModule(new ProgrammaticContextualTriggerFlowableModule(new ProgramaticContextualTriggers())).build();
        return DaggerAppComponent.builder().abtIntegrationHelper(new AbtIntegrationHelper(((AbtComponent) componentContainer.get(AbtComponent.class)).get("fiam"))).apiClientModule(new ApiClientModule(firebaseApp, (FirebaseInstallationsApi) componentContainer.get(FirebaseInstallationsApi.class), build.clock())).grpcClientModule(new GrpcClientModule(firebaseApp)).universalComponent(build).transportFactory((f) componentContainer.get(f.class)).build().providesFirebaseInAppMessaging();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(FirebaseInAppMessaging.class).name(LIBRARY_NAME).add(Dependency.required(Context.class)).add(Dependency.required(FirebaseInstallationsApi.class)).add(Dependency.required(FirebaseApp.class)).add(Dependency.required(AbtComponent.class)).add(Dependency.deferred(AnalyticsConnector.class)).add(Dependency.required(f.class)).add(Dependency.required(Subscriber.class)).factory(new ComponentFactory() { // from class: f.h.e.n.c
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return FirebaseInAppMessagingRegistrar.a(FirebaseInAppMessagingRegistrar.this, componentContainer);
            }
        }).eagerInDefaultApp().build(), LibraryVersionComponent.create(LIBRARY_NAME, "20.2.0"));
    }
}
