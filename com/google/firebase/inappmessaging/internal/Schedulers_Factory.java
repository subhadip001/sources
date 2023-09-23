package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import g.c.o;
import h.a.a;

/* loaded from: classes2.dex */
public final class Schedulers_Factory implements Factory<Schedulers> {
    private final a<o> computeSchedulerProvider;
    private final a<o> ioSchedulerProvider;
    private final a<o> mainThreadSchedulerProvider;

    public Schedulers_Factory(a<o> aVar, a<o> aVar2, a<o> aVar3) {
        this.ioSchedulerProvider = aVar;
        this.computeSchedulerProvider = aVar2;
        this.mainThreadSchedulerProvider = aVar3;
    }

    public static Schedulers_Factory create(a<o> aVar, a<o> aVar2, a<o> aVar3) {
        return new Schedulers_Factory(aVar, aVar2, aVar3);
    }

    public static Schedulers newInstance(o oVar, o oVar2, o oVar3) {
        return new Schedulers(oVar, oVar2, oVar3);
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public Schedulers get() {
        return newInstance(this.ioSchedulerProvider.get(), this.computeSchedulerProvider.get(), this.mainThreadSchedulerProvider.get());
    }
}
