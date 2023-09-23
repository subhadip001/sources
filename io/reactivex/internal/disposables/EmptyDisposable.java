package io.reactivex.internal.disposables;

import g.c.b;
import g.c.j;
import g.c.n;
import g.c.q;
import g.c.w.c.e;

/* loaded from: classes2.dex */
public enum EmptyDisposable implements e<Object> {
    INSTANCE,
    NEVER;

    public static void complete(n<?> nVar) {
        nVar.onSubscribe(INSTANCE);
        nVar.onComplete();
    }

    public static void error(Throwable th, n<?> nVar) {
        nVar.onSubscribe(INSTANCE);
        nVar.onError(th);
    }

    @Override // g.c.w.c.j
    public void clear() {
    }

    @Override // g.c.t.b
    public void dispose() {
    }

    public boolean isDisposed() {
        return this == INSTANCE;
    }

    @Override // g.c.w.c.j
    public boolean isEmpty() {
        return true;
    }

    @Override // g.c.w.c.j
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // g.c.w.c.j
    public Object poll() {
        return null;
    }

    @Override // g.c.w.c.f
    public int requestFusion(int i2) {
        return i2 & 2;
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(j<?> jVar) {
        jVar.onSubscribe(INSTANCE);
        jVar.onComplete();
    }

    public static void error(Throwable th, b bVar) {
        bVar.onSubscribe(INSTANCE);
        bVar.onError(th);
    }

    public static void complete(b bVar) {
        bVar.onSubscribe(INSTANCE);
        bVar.onComplete();
    }

    public static void error(Throwable th, q<?> qVar) {
        qVar.onSubscribe(INSTANCE);
        qVar.onError(th);
    }

    public static void error(Throwable th, j<?> jVar) {
        jVar.onSubscribe(INSTANCE);
        jVar.onError(th);
    }
}
