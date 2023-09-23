package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import g.c.o;

/* loaded from: classes2.dex */
public final class SchedulerModule_ProvidesComputeSchedulerFactory implements Factory<o> {
    private final SchedulerModule module;

    public SchedulerModule_ProvidesComputeSchedulerFactory(SchedulerModule schedulerModule) {
        this.module = schedulerModule;
    }

    public static SchedulerModule_ProvidesComputeSchedulerFactory create(SchedulerModule schedulerModule) {
        return new SchedulerModule_ProvidesComputeSchedulerFactory(schedulerModule);
    }

    public static o providesComputeScheduler(SchedulerModule schedulerModule) {
        return (o) Preconditions.checkNotNull(schedulerModule.providesComputeScheduler(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public o get() {
        return providesComputeScheduler(this.module);
    }
}
