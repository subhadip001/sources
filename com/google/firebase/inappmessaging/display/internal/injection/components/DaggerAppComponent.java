package com.google.firebase.inappmessaging.display.internal.injection.components;

import android.app.Application;
import com.google.firebase.inappmessaging.FirebaseInAppMessaging;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay_Factory;
import com.google.firebase.inappmessaging.display.dagger.internal.DoubleCheck;
import com.google.firebase.inappmessaging.display.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.display.internal.BindingWrapperFactory;
import com.google.firebase.inappmessaging.display.internal.FiamAnimator;
import com.google.firebase.inappmessaging.display.internal.FiamAnimator_Factory;
import com.google.firebase.inappmessaging.display.internal.FiamImageLoader;
import com.google.firebase.inappmessaging.display.internal.FiamImageLoader_Factory;
import com.google.firebase.inappmessaging.display.internal.FiamWindowManager;
import com.google.firebase.inappmessaging.display.internal.GlideErrorListener;
import com.google.firebase.inappmessaging.display.internal.GlideErrorListener_Factory;
import com.google.firebase.inappmessaging.display.internal.InAppMessageLayoutConfig;
import com.google.firebase.inappmessaging.display.internal.RenewableTimer_Factory;
import com.google.firebase.inappmessaging.display.internal.injection.modules.GlideModule;
import com.google.firebase.inappmessaging.display.internal.injection.modules.GlideModule_ProvidesGlideRequestManagerFactory;
import com.google.firebase.inappmessaging.display.internal.injection.modules.HeadlessInAppMessagingModule;
import com.google.firebase.inappmessaging.display.internal.injection.modules.HeadlessInAppMessagingModule_ProvidesHeadlesssSingletonFactory;
import f.e.a.h;
import h.a.a;
import java.util.Map;

/* loaded from: classes2.dex */
public final class DaggerAppComponent implements AppComponent {
    private a<FiamAnimator> fiamAnimatorProvider;
    private a<FiamImageLoader> fiamImageLoaderProvider;
    private a<FiamWindowManager> fiamWindowManagerProvider;
    private a<FirebaseInAppMessagingDisplay> firebaseInAppMessagingDisplayProvider;
    private a<GlideErrorListener> glideErrorListenerProvider;
    private a<BindingWrapperFactory> inflaterClientProvider;
    private a<Map<String, a<InAppMessageLayoutConfig>>> myKeyStringMapProvider;
    private a<Application> providesApplicationProvider;
    private a<h> providesGlideRequestManagerProvider;
    private a<FirebaseInAppMessaging> providesHeadlesssSingletonProvider;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private GlideModule glideModule;
        private HeadlessInAppMessagingModule headlessInAppMessagingModule;
        private UniversalComponent universalComponent;

        public AppComponent build() {
            Preconditions.checkBuilderRequirement(this.headlessInAppMessagingModule, HeadlessInAppMessagingModule.class);
            if (this.glideModule == null) {
                this.glideModule = new GlideModule();
            }
            Preconditions.checkBuilderRequirement(this.universalComponent, UniversalComponent.class);
            return new DaggerAppComponent(this.headlessInAppMessagingModule, this.glideModule, this.universalComponent);
        }

        public Builder glideModule(GlideModule glideModule) {
            this.glideModule = (GlideModule) Preconditions.checkNotNull(glideModule);
            return this;
        }

        public Builder headlessInAppMessagingModule(HeadlessInAppMessagingModule headlessInAppMessagingModule) {
            this.headlessInAppMessagingModule = (HeadlessInAppMessagingModule) Preconditions.checkNotNull(headlessInAppMessagingModule);
            return this;
        }

        public Builder universalComponent(UniversalComponent universalComponent) {
            this.universalComponent = (UniversalComponent) Preconditions.checkNotNull(universalComponent);
            return this;
        }

        private Builder() {
        }
    }

    /* loaded from: classes2.dex */
    public static class com_google_firebase_inappmessaging_display_internal_injection_components_UniversalComponent_fiamWindowManager implements a<FiamWindowManager> {
        private final UniversalComponent universalComponent;

        public com_google_firebase_inappmessaging_display_internal_injection_components_UniversalComponent_fiamWindowManager(UniversalComponent universalComponent) {
            this.universalComponent = universalComponent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.a.a
        public FiamWindowManager get() {
            return (FiamWindowManager) Preconditions.checkNotNull(this.universalComponent.fiamWindowManager(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* loaded from: classes2.dex */
    public static class com_google_firebase_inappmessaging_display_internal_injection_components_UniversalComponent_inflaterClient implements a<BindingWrapperFactory> {
        private final UniversalComponent universalComponent;

        public com_google_firebase_inappmessaging_display_internal_injection_components_UniversalComponent_inflaterClient(UniversalComponent universalComponent) {
            this.universalComponent = universalComponent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.a.a
        public BindingWrapperFactory get() {
            return (BindingWrapperFactory) Preconditions.checkNotNull(this.universalComponent.inflaterClient(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* loaded from: classes2.dex */
    public static class com_google_firebase_inappmessaging_display_internal_injection_components_UniversalComponent_myKeyStringMap implements a<Map<String, a<InAppMessageLayoutConfig>>> {
        private final UniversalComponent universalComponent;

        public com_google_firebase_inappmessaging_display_internal_injection_components_UniversalComponent_myKeyStringMap(UniversalComponent universalComponent) {
            this.universalComponent = universalComponent;
        }

        @Override // h.a.a
        public Map<String, a<InAppMessageLayoutConfig>> get() {
            return (Map) Preconditions.checkNotNull(this.universalComponent.myKeyStringMap(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* loaded from: classes2.dex */
    public static class com_google_firebase_inappmessaging_display_internal_injection_components_UniversalComponent_providesApplication implements a<Application> {
        private final UniversalComponent universalComponent;

        public com_google_firebase_inappmessaging_display_internal_injection_components_UniversalComponent_providesApplication(UniversalComponent universalComponent) {
            this.universalComponent = universalComponent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.a.a
        public Application get() {
            return (Application) Preconditions.checkNotNull(this.universalComponent.providesApplication(), "Cannot return null from a non-@Nullable component method");
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(HeadlessInAppMessagingModule headlessInAppMessagingModule, GlideModule glideModule, UniversalComponent universalComponent) {
        this.providesHeadlesssSingletonProvider = DoubleCheck.provider(HeadlessInAppMessagingModule_ProvidesHeadlesssSingletonFactory.create(headlessInAppMessagingModule));
        this.myKeyStringMapProvider = new com_google_firebase_inappmessaging_display_internal_injection_components_UniversalComponent_myKeyStringMap(universalComponent);
        this.providesApplicationProvider = new com_google_firebase_inappmessaging_display_internal_injection_components_UniversalComponent_providesApplication(universalComponent);
        a<GlideErrorListener> provider = DoubleCheck.provider(GlideErrorListener_Factory.create());
        this.glideErrorListenerProvider = provider;
        a<h> provider2 = DoubleCheck.provider(GlideModule_ProvidesGlideRequestManagerFactory.create(glideModule, this.providesApplicationProvider, provider));
        this.providesGlideRequestManagerProvider = provider2;
        this.fiamImageLoaderProvider = DoubleCheck.provider(FiamImageLoader_Factory.create(provider2));
        this.fiamWindowManagerProvider = new com_google_firebase_inappmessaging_display_internal_injection_components_UniversalComponent_fiamWindowManager(universalComponent);
        this.inflaterClientProvider = new com_google_firebase_inappmessaging_display_internal_injection_components_UniversalComponent_inflaterClient(universalComponent);
        this.fiamAnimatorProvider = DoubleCheck.provider(FiamAnimator_Factory.create());
        this.firebaseInAppMessagingDisplayProvider = DoubleCheck.provider(FirebaseInAppMessagingDisplay_Factory.create(this.providesHeadlesssSingletonProvider, this.myKeyStringMapProvider, this.fiamImageLoaderProvider, RenewableTimer_Factory.create(), RenewableTimer_Factory.create(), this.fiamWindowManagerProvider, this.providesApplicationProvider, this.inflaterClientProvider, this.fiamAnimatorProvider));
    }

    @Override // com.google.firebase.inappmessaging.display.internal.injection.components.AppComponent
    public FiamImageLoader fiamImageLoader() {
        return this.fiamImageLoaderProvider.get();
    }

    @Override // com.google.firebase.inappmessaging.display.internal.injection.components.AppComponent
    public GlideErrorListener glideErrorListener() {
        return this.glideErrorListenerProvider.get();
    }

    @Override // com.google.firebase.inappmessaging.display.internal.injection.components.AppComponent
    public FirebaseInAppMessagingDisplay providesFirebaseInAppMessagingUI() {
        return this.firebaseInAppMessagingDisplayProvider.get();
    }

    private DaggerAppComponent(HeadlessInAppMessagingModule headlessInAppMessagingModule, GlideModule glideModule, UniversalComponent universalComponent) {
        initialize(headlessInAppMessagingModule, glideModule, universalComponent);
    }
}
