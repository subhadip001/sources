package io.reactivex.internal.operators.flowable;

import g.c.v.c;

/* loaded from: classes2.dex */
public enum FlowableInternalHelper$RequestMax implements c<m.c.c> {
    INSTANCE;

    @Override // g.c.v.c
    public void accept(m.c.c cVar) {
        cVar.request(Long.MAX_VALUE);
    }
}
