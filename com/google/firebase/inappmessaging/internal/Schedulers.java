package com.google.firebase.inappmessaging.internal;

import g.c.o;

/* loaded from: classes2.dex */
public class Schedulers {
    private final o computeScheduler;
    private final o ioScheduler;
    private final o mainThreadScheduler;

    public Schedulers(o oVar, o oVar2, o oVar3) {
        this.ioScheduler = oVar;
        this.computeScheduler = oVar2;
        this.mainThreadScheduler = oVar3;
    }

    public o computation() {
        return this.computeScheduler;
    }

    public o io() {
        return this.ioScheduler;
    }

    public o mainThread() {
        return this.mainThreadScheduler;
    }
}
