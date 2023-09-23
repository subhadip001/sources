package io.reactivex.internal.subscriptions;

import f.a.b.a.a;
import f.n.a.n.i;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import m.c.c;

/* loaded from: classes2.dex */
public enum SubscriptionHelper implements c {
    CANCELLED;

    public static boolean cancel(AtomicReference<c> atomicReference) {
        c andSet;
        c cVar = atomicReference.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (cVar == subscriptionHelper || (andSet = atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (andSet != null) {
            andSet.cancel();
            return true;
        }
        return true;
    }

    public static void deferredRequest(AtomicReference<c> atomicReference, AtomicLong atomicLong, long j2) {
        c cVar = atomicReference.get();
        if (cVar != null) {
            cVar.request(j2);
        } else if (validate(j2)) {
            i.b(atomicLong, j2);
            c cVar2 = atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    cVar2.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<c> atomicReference, AtomicLong atomicLong, c cVar) {
        if (setOnce(atomicReference, cVar)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                cVar.request(andSet);
                return true;
            }
            return true;
        }
        return false;
    }

    public static boolean isCancelled(c cVar) {
        return cVar == CANCELLED;
    }

    public static boolean replace(AtomicReference<c> atomicReference, c cVar) {
        c cVar2;
        do {
            cVar2 = atomicReference.get();
            if (cVar2 == CANCELLED) {
                if (cVar != null) {
                    cVar.cancel();
                    return false;
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(cVar2, cVar));
        return true;
    }

    public static void reportMoreProduced(long j2) {
        i.L(new ProtocolViolationException(a.l("More produced than requested: ", j2)));
    }

    public static void reportSubscriptionSet() {
        i.L(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean set(AtomicReference<c> atomicReference, c cVar) {
        c cVar2;
        do {
            cVar2 = atomicReference.get();
            if (cVar2 == CANCELLED) {
                if (cVar != null) {
                    cVar.cancel();
                    return false;
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(cVar2, cVar));
        if (cVar2 != null) {
            cVar2.cancel();
            return true;
        }
        return true;
    }

    public static boolean setOnce(AtomicReference<c> atomicReference, c cVar) {
        Objects.requireNonNull(cVar, "s is null");
        if (atomicReference.compareAndSet(null, cVar)) {
            return true;
        }
        cVar.cancel();
        if (atomicReference.get() != CANCELLED) {
            reportSubscriptionSet();
            return false;
        }
        return false;
    }

    public static boolean validate(c cVar, c cVar2) {
        if (cVar2 == null) {
            i.L(new NullPointerException("next is null"));
            return false;
        } else if (cVar != null) {
            cVar2.cancel();
            reportSubscriptionSet();
            return false;
        } else {
            return true;
        }
    }

    @Override // m.c.c
    public void cancel() {
    }

    @Override // m.c.c
    public void request(long j2) {
    }

    public static boolean validate(long j2) {
        if (j2 <= 0) {
            i.L(new IllegalArgumentException(a.l("n > 0 required but it was ", j2)));
            return false;
        }
        return true;
    }

    public static boolean setOnce(AtomicReference<c> atomicReference, c cVar, long j2) {
        if (setOnce(atomicReference, cVar)) {
            cVar.request(j2);
            return true;
        }
        return false;
    }
}
