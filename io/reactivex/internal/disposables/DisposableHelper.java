package io.reactivex.internal.disposables;

import f.n.a.n.i;
import g.c.t.b;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public enum DisposableHelper implements b {
    DISPOSED;

    public static boolean dispose(AtomicReference<b> atomicReference) {
        b andSet;
        b bVar = atomicReference.get();
        DisposableHelper disposableHelper = DISPOSED;
        if (bVar == disposableHelper || (andSet = atomicReference.getAndSet(disposableHelper)) == disposableHelper) {
            return false;
        }
        if (andSet != null) {
            andSet.dispose();
            return true;
        }
        return true;
    }

    public static boolean isDisposed(b bVar) {
        return bVar == DISPOSED;
    }

    public static boolean replace(AtomicReference<b> atomicReference, b bVar) {
        b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar != null) {
                    bVar.dispose();
                    return false;
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(bVar2, bVar));
        return true;
    }

    public static void reportDisposableSet() {
        i.L(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean set(AtomicReference<b> atomicReference, b bVar) {
        b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar != null) {
                    bVar.dispose();
                    return false;
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(bVar2, bVar));
        if (bVar2 != null) {
            bVar2.dispose();
            return true;
        }
        return true;
    }

    public static boolean setOnce(AtomicReference<b> atomicReference, b bVar) {
        Objects.requireNonNull(bVar, "d is null");
        if (atomicReference.compareAndSet(null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() != DISPOSED) {
            reportDisposableSet();
            return false;
        }
        return false;
    }

    public static boolean trySet(AtomicReference<b> atomicReference, b bVar) {
        if (atomicReference.compareAndSet(null, bVar)) {
            return true;
        }
        if (atomicReference.get() == DISPOSED) {
            bVar.dispose();
            return false;
        }
        return false;
    }

    public static boolean validate(b bVar, b bVar2) {
        if (bVar2 == null) {
            i.L(new NullPointerException("next is null"));
            return false;
        } else if (bVar != null) {
            bVar2.dispose();
            reportDisposableSet();
            return false;
        } else {
            return true;
        }
    }

    @Override // g.c.t.b
    public void dispose() {
    }

    public boolean isDisposed() {
        return true;
    }
}
