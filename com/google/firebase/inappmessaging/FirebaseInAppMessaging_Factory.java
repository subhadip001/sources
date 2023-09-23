package com.google.firebase.inappmessaging;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.internal.DataCollectionHelper;
import com.google.firebase.inappmessaging.internal.DeveloperListenerManager;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksFactory;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager;
import com.google.firebase.inappmessaging.internal.ProgramaticContextualTriggers;
import com.google.firebase.installations.FirebaseInstallationsApi;
import h.a.a;

/* loaded from: classes2.dex */
public final class FirebaseInAppMessaging_Factory implements Factory<FirebaseInAppMessaging> {
    private final a<DataCollectionHelper> dataCollectionHelperProvider;
    private final a<DeveloperListenerManager> developerListenerManagerProvider;
    private final a<DisplayCallbacksFactory> displayCallbacksFactoryProvider;
    private final a<FirebaseInstallationsApi> firebaseInstallationsProvider;
    private final a<InAppMessageStreamManager> inAppMessageStreamManagerProvider;
    private final a<ProgramaticContextualTriggers> programaticContextualTriggersProvider;

    public FirebaseInAppMessaging_Factory(a<InAppMessageStreamManager> aVar, a<ProgramaticContextualTriggers> aVar2, a<DataCollectionHelper> aVar3, a<FirebaseInstallationsApi> aVar4, a<DisplayCallbacksFactory> aVar5, a<DeveloperListenerManager> aVar6) {
        this.inAppMessageStreamManagerProvider = aVar;
        this.programaticContextualTriggersProvider = aVar2;
        this.dataCollectionHelperProvider = aVar3;
        this.firebaseInstallationsProvider = aVar4;
        this.displayCallbacksFactoryProvider = aVar5;
        this.developerListenerManagerProvider = aVar6;
    }

    public static FirebaseInAppMessaging_Factory create(a<InAppMessageStreamManager> aVar, a<ProgramaticContextualTriggers> aVar2, a<DataCollectionHelper> aVar3, a<FirebaseInstallationsApi> aVar4, a<DisplayCallbacksFactory> aVar5, a<DeveloperListenerManager> aVar6) {
        return new FirebaseInAppMessaging_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static FirebaseInAppMessaging newInstance(InAppMessageStreamManager inAppMessageStreamManager, ProgramaticContextualTriggers programaticContextualTriggers, DataCollectionHelper dataCollectionHelper, FirebaseInstallationsApi firebaseInstallationsApi, DisplayCallbacksFactory displayCallbacksFactory, DeveloperListenerManager developerListenerManager) {
        return new FirebaseInAppMessaging(inAppMessageStreamManager, programaticContextualTriggers, dataCollectionHelper, firebaseInstallationsApi, displayCallbacksFactory, developerListenerManager);
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public FirebaseInAppMessaging get() {
        return newInstance(this.inAppMessageStreamManagerProvider.get(), this.programaticContextualTriggersProvider.get(), this.dataCollectionHelperProvider.get(), this.firebaseInstallationsProvider.get(), this.displayCallbacksFactoryProvider.get(), this.developerListenerManagerProvider.get());
    }
}
