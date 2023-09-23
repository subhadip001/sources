package io.reactivex.parallel;

import g.c.v.b;

/* loaded from: classes2.dex */
public enum ParallelFailureHandling implements b<Long, Throwable, ParallelFailureHandling> {
    STOP,
    ERROR,
    SKIP,
    RETRY;

    @Override // g.c.v.b
    public ParallelFailureHandling apply(Long l2, Throwable th) {
        return this;
    }
}
