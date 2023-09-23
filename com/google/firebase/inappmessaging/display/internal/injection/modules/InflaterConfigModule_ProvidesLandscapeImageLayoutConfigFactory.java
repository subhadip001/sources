package com.google.firebase.inappmessaging.display.internal.injection.modules;

import android.util.DisplayMetrics;
import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import com.google.firebase.inappmessaging.display.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.display.internal.InAppMessageLayoutConfig;
import h.a.a;

/* loaded from: classes2.dex */
public final class InflaterConfigModule_ProvidesLandscapeImageLayoutConfigFactory implements Factory<InAppMessageLayoutConfig> {
    private final a<DisplayMetrics> displayMetricsProvider;
    private final InflaterConfigModule module;

    public InflaterConfigModule_ProvidesLandscapeImageLayoutConfigFactory(InflaterConfigModule inflaterConfigModule, a<DisplayMetrics> aVar) {
        this.module = inflaterConfigModule;
        this.displayMetricsProvider = aVar;
    }

    public static InflaterConfigModule_ProvidesLandscapeImageLayoutConfigFactory create(InflaterConfigModule inflaterConfigModule, a<DisplayMetrics> aVar) {
        return new InflaterConfigModule_ProvidesLandscapeImageLayoutConfigFactory(inflaterConfigModule, aVar);
    }

    public static InAppMessageLayoutConfig providesLandscapeImageLayoutConfig(InflaterConfigModule inflaterConfigModule, DisplayMetrics displayMetrics) {
        return (InAppMessageLayoutConfig) Preconditions.checkNotNull(inflaterConfigModule.providesLandscapeImageLayoutConfig(displayMetrics), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.firebase.inappmessaging.display.dagger.internal.Factory, h.a.a
    public InAppMessageLayoutConfig get() {
        return providesLandscapeImageLayoutConfig(this.module, this.displayMetricsProvider.get());
    }
}
