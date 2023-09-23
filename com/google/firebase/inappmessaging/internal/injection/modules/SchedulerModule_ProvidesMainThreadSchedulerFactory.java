package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import g.c.o;

/* loaded from: classes2.dex */
public final class SchedulerModule_ProvidesMainThreadSchedulerFactory implements Factory<o> {
    private final SchedulerModule module;

    public SchedulerModule_ProvidesMainThreadSchedulerFactory(SchedulerModule schedulerModule) {
        this.module = schedulerModule;
    }

    public static SchedulerModule_ProvidesMainThreadSchedulerFactory create(SchedulerModule schedulerModule) {
        return new SchedulerModule_ProvidesMainThreadSchedulerFactory(schedulerModule);
    }

    public static o providesMainThreadScheduler(SchedulerModule schedulerModule) {
        return (o) Preconditions.checkNotNull(schedulerModule.providesMainThreadScheduler(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public o get() {
        return providesMainThreadScheduler(this.module);
    }
}
