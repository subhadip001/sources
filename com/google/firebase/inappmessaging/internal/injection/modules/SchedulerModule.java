package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.Module;
import com.google.firebase.inappmessaging.dagger.Provides;
import g.c.o;
import g.c.y.a;
import java.util.Objects;

@Module
/* loaded from: classes2.dex */
public class SchedulerModule {
    @Provides
    public o providesComputeScheduler() {
        return a.a;
    }

    @Provides
    public o providesIOScheduler() {
        return a.b;
    }

    @Provides
    public o providesMainThreadScheduler() {
        o oVar = g.c.s.a.a.a;
        Objects.requireNonNull(oVar, "scheduler == null");
        return oVar;
    }
}
