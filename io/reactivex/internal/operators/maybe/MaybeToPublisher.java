package io.reactivex.internal.operators.maybe;

import g.c.k;
import g.c.v.d;
import g.c.w.e.c.u;
import m.c.a;

/* loaded from: classes2.dex */
public enum MaybeToPublisher implements d<k<Object>, a<Object>> {
    INSTANCE;

    public static <T> d<k<T>, a<T>> instance() {
        return INSTANCE;
    }

    @Override // g.c.v.d
    public a<Object> apply(k<Object> kVar) {
        return new u(kVar);
    }
}
