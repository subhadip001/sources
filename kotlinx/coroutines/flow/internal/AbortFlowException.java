package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;

/* compiled from: FlowExceptions.kt */
/* loaded from: classes2.dex */
public final class AbortFlowException extends CancellationException {
    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
