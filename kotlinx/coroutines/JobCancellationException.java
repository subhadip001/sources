package kotlinx.coroutines;

import i.l.b.i;
import j.a.c1;
import java.util.concurrent.CancellationException;

/* compiled from: Exceptions.kt */
/* loaded from: classes2.dex */
public final class JobCancellationException extends CancellationException {

    /* renamed from: f  reason: collision with root package name */
    public final transient c1 f9200f;

    public JobCancellationException(String str, Throwable th, c1 c1Var) {
        super(str);
        this.f9200f = c1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!i.a(jobCancellationException.getMessage(), getMessage()) || !i.a(jobCancellationException.f9200f, this.f9200f) || !i.a(jobCancellationException.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        i.b(message);
        int hashCode = (this.f9200f.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f9200f;
    }
}
