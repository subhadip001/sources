package io.reactivex.exceptions;

/* loaded from: classes2.dex */
public final class OnErrorNotImplementedException extends RuntimeException {
    public OnErrorNotImplementedException(Throwable th) {
        super(th != null ? th.getMessage() : null, th == null ? new NullPointerException() : th);
    }
}
