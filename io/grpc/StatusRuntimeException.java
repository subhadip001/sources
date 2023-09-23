package io.grpc;

import g.a.i0;

/* loaded from: classes2.dex */
public class StatusRuntimeException extends RuntimeException {

    /* renamed from: f  reason: collision with root package name */
    public final Status f8696f;

    /* renamed from: g  reason: collision with root package name */
    public final i0 f8697g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f8698h;

    public StatusRuntimeException(Status status, i0 i0Var) {
        super(Status.c(status), status.c);
        this.f8696f = status;
        this.f8697g = i0Var;
        this.f8698h = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f8698h ? super.fillInStackTrace() : this;
    }
}
