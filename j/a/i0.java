package j.a;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
/* loaded from: classes2.dex */
public final class i0 extends RuntimeException {

    /* renamed from: f  reason: collision with root package name */
    public final i.j.f f8760f;

    public i0(i.j.f fVar) {
        this.f8760f = fVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f8760f.toString();
    }
}
