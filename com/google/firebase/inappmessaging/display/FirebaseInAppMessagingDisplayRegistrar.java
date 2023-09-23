package com.google.firebase.inappmessaging.display;

import android.app.Application;
import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.inappmessaging.FirebaseInAppMessaging;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplayRegistrar;
import com.google.firebase.inappmessaging.display.internal.injection.components.DaggerAppComponent;
import com.google.firebase.inappmessaging.display.internal.injection.components.DaggerUniversalComponent;
import com.google.firebase.inappmessaging.display.internal.injection.modules.ApplicationModule;
import com.google.firebase.inappmessaging.display.internal.injection.modules.HeadlessInAppMessagingModule;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public class FirebaseInAppMessagingDisplayRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fiamd";

    public static /* synthetic */ FirebaseInAppMessagingDisplay a(FirebaseInAppMessagingDisplayRegistrar firebaseInAppMessagingDisplayRegistrar, ComponentContainer componentContainer) {
        return firebaseInAppMessagingDisplayRegistrar.buildFirebaseInAppMessagingUI(componentContainer);
    }

    public FirebaseInAppMessagingDisplay buildFirebaseInAppMessagingUI(ComponentContainer componentContainer) {
        Application application = (Application) ((FirebaseApp) componentContainer.get(FirebaseApp.class)).getApplicationContext();
        FirebaseInAppMessagingDisplay providesFirebaseInAppMessagingUI = DaggerAppComponent.builder().universalComponent(DaggerUniversalComponent.builder().applicationModule(new ApplicationModule(application)).build()).headlessInAppMessagingModule(new HeadlessInAppMessagingModule((FirebaseInAppMessaging) componentContainer.get(FirebaseInAppMessaging.class))).build().providesFirebaseInAppMessagingUI();
        application.registerActivityLifecycleCallbacks(providesFirebaseInAppMessagingUI);
        return providesFirebaseInAppMessagingUI;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(FirebaseInAppMessagingDisplay.class).name(LIBRARY_NAME).add(Dependency.required(FirebaseApp.class)).add(Dependency.required(FirebaseInAppMessaging.class)).factory(new ComponentFactory() { // from class: f.h.e.n.d.b
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return FirebaseInAppMessagingDisplayRegistrar.a(FirebaseInAppMessagingDisplayRegistrar.this, componentContainer);
            }
        }).eagerInDefaultApp().build(), LibraryVersionComponent.create(LIBRARY_NAME, "20.2.0"));
    }
}
