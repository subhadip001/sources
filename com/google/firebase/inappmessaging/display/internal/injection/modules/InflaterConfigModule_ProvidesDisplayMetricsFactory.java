package com.google.firebase.inappmessaging.display.internal.injection.modules;

import android.app.Application;
import android.util.DisplayMetrics;
import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import com.google.firebase.inappmessaging.display.dagger.internal.Preconditions;
import h.a.a;

/* loaded from: classes2.dex */
public final class InflaterConfigModule_ProvidesDisplayMetricsFactory implements Factory<DisplayMetrics> {
    private final a<Application> applicationProvider;
    private final InflaterConfigModule module;

    public InflaterConfigModule_ProvidesDisplayMetricsFactory(InflaterConfigModule inflaterConfigModule, a<Application> aVar) {
        this.module = inflaterConfigModule;
        this.applicationProvider = aVar;
    }

    public static InflaterConfigModule_ProvidesDisplayMetricsFactory create(InflaterConfigModule inflaterConfigModule, a<Application> aVar) {
        return new InflaterConfigModule_ProvidesDisplayMetricsFactory(inflaterConfigModule, aVar);
    }

    public static DisplayMetrics providesDisplayMetrics(InflaterConfigModule inflaterConfigModule, Application application) {
        return (DisplayMetrics) Preconditions.checkNotNull(inflaterConfigModule.providesDisplayMetrics(application), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.firebase.inappmessaging.display.dagger.internal.Factory, h.a.a
    public DisplayMetrics get() {
        return providesDisplayMetrics(this.module, this.applicationProvider.get());
    }
}
