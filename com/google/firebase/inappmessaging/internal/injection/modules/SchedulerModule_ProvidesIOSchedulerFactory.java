package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import g.c.o;

/* loaded from: classes2.dex */
public final class SchedulerModule_ProvidesIOSchedulerFactory implements Factory<o> {
    private final SchedulerModule module;

    public SchedulerModule_ProvidesIOSchedulerFactory(SchedulerModule schedulerModule) {
        this.module = schedulerModule;
    }

    public static SchedulerModule_ProvidesIOSchedulerFactory create(SchedulerModule schedulerModule) {
        return new SchedulerModule_ProvidesIOSchedulerFactory(schedulerModule);
    }

    public static o providesIOScheduler(SchedulerModule schedulerModule) {
        return (o) Preconditions.checkNotNull(schedulerModule.providesIOScheduler(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public o get() {
        return providesIOScheduler(this.module);
    }
}
