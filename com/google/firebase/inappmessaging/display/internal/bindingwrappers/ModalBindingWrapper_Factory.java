package com.google.firebase.inappmessaging.display.internal.bindingwrappers;

import android.view.LayoutInflater;
import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import com.google.firebase.inappmessaging.display.internal.InAppMessageLayoutConfig;
import com.google.firebase.inappmessaging.model.InAppMessage;
import h.a.a;

/* loaded from: classes2.dex */
public final class ModalBindingWrapper_Factory implements Factory<ModalBindingWrapper> {
    private final a<InAppMessageLayoutConfig> configProvider;
    private final a<LayoutInflater> inflaterProvider;
    private final a<InAppMessage> messageProvider;

    public ModalBindingWrapper_Factory(a<InAppMessageLayoutConfig> aVar, a<LayoutInflater> aVar2, a<InAppMessage> aVar3) {
        this.configProvider = aVar;
        this.inflaterProvider = aVar2;
        this.messageProvider = aVar3;
    }

    public static ModalBindingWrapper_Factory create(a<InAppMessageLayoutConfig> aVar, a<LayoutInflater> aVar2, a<InAppMessage> aVar3) {
        return new ModalBindingWrapper_Factory(aVar, aVar2, aVar3);
    }

    public static ModalBindingWrapper newInstance(InAppMessageLayoutConfig inAppMessageLayoutConfig, LayoutInflater layoutInflater, InAppMessage inAppMessage) {
        return new ModalBindingWrapper(inAppMessageLayoutConfig, layoutInflater, inAppMessage);
    }

    @Override // com.google.firebase.inappmessaging.display.dagger.internal.Factory, h.a.a
    public ModalBindingWrapper get() {
        return newInstance(this.configProvider.get(), this.inflaterProvider.get(), this.messageProvider.get());
    }
}
