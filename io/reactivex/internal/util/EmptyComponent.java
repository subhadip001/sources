package io.reactivex.internal.util;

import f.n.a.n.i;
import g.c.b;
import g.c.g;
import g.c.j;
import g.c.n;
import g.c.q;
import m.c.c;

/* loaded from: classes2.dex */
public enum EmptyComponent implements g<Object>, n<Object>, j<Object>, q<Object>, b, c, g.c.t.b {
    INSTANCE;

    public static <T> n<T> asObserver() {
        return INSTANCE;
    }

    public static <T> m.c.b<T> asSubscriber() {
        return INSTANCE;
    }

    @Override // m.c.c
    public void cancel() {
    }

    @Override // g.c.t.b
    public void dispose() {
    }

    public boolean isDisposed() {
        return true;
    }

    @Override // m.c.b
    public void onComplete() {
    }

    @Override // m.c.b
    public void onError(Throwable th) {
        i.L(th);
    }

    @Override // m.c.b
    public void onNext(Object obj) {
    }

    @Override // g.c.n
    public void onSubscribe(g.c.t.b bVar) {
        bVar.dispose();
    }

    @Override // g.c.j
    public void onSuccess(Object obj) {
    }

    @Override // m.c.c
    public void request(long j2) {
    }

    @Override // g.c.g, m.c.b
    public void onSubscribe(c cVar) {
        cVar.cancel();
    }
}
