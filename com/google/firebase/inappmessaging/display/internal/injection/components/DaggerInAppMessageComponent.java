package com.google.firebase.inappmessaging.display.internal.injection.components;

import android.view.LayoutInflater;
import com.google.firebase.inappmessaging.display.dagger.internal.DoubleCheck;
import com.google.firebase.inappmessaging.display.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.display.internal.InAppMessageLayoutConfig;
import com.google.firebase.inappmessaging.display.internal.bindingwrappers.BannerBindingWrapper;
import com.google.firebase.inappmessaging.display.internal.bindingwrappers.BannerBindingWrapper_Factory;
import com.google.firebase.inappmessaging.display.internal.bindingwrappers.CardBindingWrapper;
import com.google.firebase.inappmessaging.display.internal.bindingwrappers.CardBindingWrapper_Factory;
import com.google.firebase.inappmessaging.display.internal.bindingwrappers.ImageBindingWrapper;
import com.google.firebase.inappmessaging.display.internal.bindingwrappers.ImageBindingWrapper_Factory;
import com.google.firebase.inappmessaging.display.internal.bindingwrappers.ModalBindingWrapper;
import com.google.firebase.inappmessaging.display.internal.bindingwrappers.ModalBindingWrapper_Factory;
import com.google.firebase.inappmessaging.display.internal.injection.modules.InflaterModule;
import com.google.firebase.inappmessaging.display.internal.injection.modules.InflaterModule_InAppMessageLayoutConfigFactory;
import com.google.firebase.inappmessaging.display.internal.injection.modules.InflaterModule_ProvidesBannerMessageFactory;
import com.google.firebase.inappmessaging.display.internal.injection.modules.InflaterModule_ProvidesInflaterserviceFactory;
import com.google.firebase.inappmessaging.model.InAppMessage;
import h.a.a;

/* loaded from: classes2.dex */
public final class DaggerInAppMessageComponent implements InAppMessageComponent {
    private a<BannerBindingWrapper> bannerBindingWrapperProvider;
    private a<CardBindingWrapper> cardBindingWrapperProvider;
    private a<ImageBindingWrapper> imageBindingWrapperProvider;
    private a<InAppMessageLayoutConfig> inAppMessageLayoutConfigProvider;
    private a<ModalBindingWrapper> modalBindingWrapperProvider;
    private a<InAppMessage> providesBannerMessageProvider;
    private a<LayoutInflater> providesInflaterserviceProvider;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private InflaterModule inflaterModule;

        public InAppMessageComponent build() {
            Preconditions.checkBuilderRequirement(this.inflaterModule, InflaterModule.class);
            return new DaggerInAppMessageComponent(this.inflaterModule);
        }

        public Builder inflaterModule(InflaterModule inflaterModule) {
            this.inflaterModule = (InflaterModule) Preconditions.checkNotNull(inflaterModule);
            return this;
        }

        private Builder() {
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(InflaterModule inflaterModule) {
        this.inAppMessageLayoutConfigProvider = DoubleCheck.provider(InflaterModule_InAppMessageLayoutConfigFactory.create(inflaterModule));
        this.providesInflaterserviceProvider = DoubleCheck.provider(InflaterModule_ProvidesInflaterserviceFactory.create(inflaterModule));
        InflaterModule_ProvidesBannerMessageFactory create = InflaterModule_ProvidesBannerMessageFactory.create(inflaterModule);
        this.providesBannerMessageProvider = create;
        this.imageBindingWrapperProvider = DoubleCheck.provider(ImageBindingWrapper_Factory.create(this.inAppMessageLayoutConfigProvider, this.providesInflaterserviceProvider, create));
        this.modalBindingWrapperProvider = DoubleCheck.provider(ModalBindingWrapper_Factory.create(this.inAppMessageLayoutConfigProvider, this.providesInflaterserviceProvider, this.providesBannerMessageProvider));
        this.bannerBindingWrapperProvider = DoubleCheck.provider(BannerBindingWrapper_Factory.create(this.inAppMessageLayoutConfigProvider, this.providesInflaterserviceProvider, this.providesBannerMessageProvider));
        this.cardBindingWrapperProvider = DoubleCheck.provider(CardBindingWrapper_Factory.create(this.inAppMessageLayoutConfigProvider, this.providesInflaterserviceProvider, this.providesBannerMessageProvider));
    }

    @Override // com.google.firebase.inappmessaging.display.internal.injection.components.InAppMessageComponent
    public BannerBindingWrapper bannerBindingWrapper() {
        return this.bannerBindingWrapperProvider.get();
    }

    @Override // com.google.firebase.inappmessaging.display.internal.injection.components.InAppMessageComponent
    public CardBindingWrapper cardBindingWrapper() {
        return this.cardBindingWrapperProvider.get();
    }

    @Override // com.google.firebase.inappmessaging.display.internal.injection.components.InAppMessageComponent
    public ImageBindingWrapper imageBindingWrapper() {
        return this.imageBindingWrapperProvider.get();
    }

    @Override // com.google.firebase.inappmessaging.display.internal.injection.components.InAppMessageComponent
    public ModalBindingWrapper modalBindingWrapper() {
        return this.modalBindingWrapperProvider.get();
    }

    private DaggerInAppMessageComponent(InflaterModule inflaterModule) {
        initialize(inflaterModule);
    }
}
