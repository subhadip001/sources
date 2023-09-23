package io.reactivex.internal.subscriptions;

import g.c.w.c.g;
import m.c.b;

/* loaded from: classes2.dex */
public enum EmptySubscription implements g<Object> {
    INSTANCE;

    public static void complete(b<?> bVar) {
        bVar.onSubscribe(INSTANCE);
        bVar.onComplete();
    }

    public static void error(Throwable th, b<?> bVar) {
        bVar.onSubscribe(INSTANCE);
        bVar.onError(th);
    }

    @Override // m.c.c
    public void cancel() {
    }

    @Override // g.c.w.c.j
    public void clear() {
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

    @Override // m.c.c
    public void request(long j2) {
        SubscriptionHelper.validate(j2);
    }

    @Override // g.c.w.c.f
    public int requestFusion(int i2) {
        return i2 & 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
