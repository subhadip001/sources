package com.google.firebase.inappmessaging.display;

import android.app.Application;
import com.google.firebase.inappmessaging.FirebaseInAppMessaging;
import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import com.google.firebase.inappmessaging.display.internal.BindingWrapperFactory;
import com.google.firebase.inappmessaging.display.internal.FiamAnimator;
import com.google.firebase.inappmessaging.display.internal.FiamImageLoader;
import com.google.firebase.inappmessaging.display.internal.FiamWindowManager;
import com.google.firebase.inappmessaging.display.internal.InAppMessageLayoutConfig;
import com.google.firebase.inappmessaging.display.internal.RenewableTimer;
import h.a.a;
import java.util.Map;

/* loaded from: classes2.dex */
public final class FirebaseInAppMessagingDisplay_Factory implements Factory<FirebaseInAppMessagingDisplay> {
    private final a<FiamAnimator> animatorProvider;
    private final a<Application> applicationProvider;
    private final a<RenewableTimer> autoDismissTimerProvider;
    private final a<BindingWrapperFactory> bindingWrapperFactoryProvider;
    private final a<FirebaseInAppMessaging> headlessInAppMessagingProvider;
    private final a<FiamImageLoader> imageLoaderProvider;
    private final a<RenewableTimer> impressionTimerProvider;
    private final a<Map<String, a<InAppMessageLayoutConfig>>> layoutConfigsProvider;
    private final a<FiamWindowManager> windowManagerProvider;

    public FirebaseInAppMessagingDisplay_Factory(a<FirebaseInAppMessaging> aVar, a<Map<String, a<InAppMessageLayoutConfig>>> aVar2, a<FiamImageLoader> aVar3, a<RenewableTimer> aVar4, a<RenewableTimer> aVar5, a<FiamWindowManager> aVar6, a<Application> aVar7, a<BindingWrapperFactory> aVar8, a<FiamAnimator> aVar9) {
        this.headlessInAppMessagingProvider = aVar;
        this.layoutConfigsProvider = aVar2;
        this.imageLoaderProvider = aVar3;
        this.impressionTimerProvider = aVar4;
        this.autoDismissTimerProvider = aVar5;
        this.windowManagerProvider = aVar6;
        this.applicationProvider = aVar7;
        this.bindingWrapperFactoryProvider = aVar8;
        this.animatorProvider = aVar9;
    }

    public static FirebaseInAppMessagingDisplay_Factory create(a<FirebaseInAppMessaging> aVar, a<Map<String, a<InAppMessageLayoutConfig>>> aVar2, a<FiamImageLoader> aVar3, a<RenewableTimer> aVar4, a<RenewableTimer> aVar5, a<FiamWindowManager> aVar6, a<Application> aVar7, a<BindingWrapperFactory> aVar8, a<FiamAnimator> aVar9) {
        return new FirebaseInAppMessagingDisplay_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static FirebaseInAppMessagingDisplay newInstance(FirebaseInAppMessaging firebaseInAppMessaging, Map<String, a<InAppMessageLayoutConfig>> map, FiamImageLoader fiamImageLoader, RenewableTimer renewableTimer, RenewableTimer renewableTimer2, FiamWindowManager fiamWindowManager, Application application, BindingWrapperFactory bindingWrapperFactory, FiamAnimator fiamAnimator) {
        return new FirebaseInAppMessagingDisplay(firebaseInAppMessaging, map, fiamImageLoader, renewableTimer, renewableTimer2, fiamWindowManager, application, bindingWrapperFactory, fiamAnimator);
    }

    @Override // com.google.firebase.inappmessaging.display.dagger.internal.Factory, h.a.a
    public FirebaseInAppMessagingDisplay get() {
        return newInstance(this.headlessInAppMessagingProvider.get(), this.layoutConfigsProvider.get(), this.imageLoaderProvider.get(), this.impressionTimerProvider.get(), this.autoDismissTimerProvider.get(), this.windowManagerProvider.get(), this.applicationProvider.get(), this.bindingWrapperFactoryProvider.get(), this.animatorProvider.get());
    }
}
