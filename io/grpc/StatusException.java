package io.grpc;

import g.a.i0;

/* loaded from: classes2.dex */
public class StatusException extends Exception {

    /* renamed from: f  reason: collision with root package name */
    public final Status f8693f;

    /* renamed from: g  reason: collision with root package name */
    public final i0 f8694g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f8695h;

    public StatusException(Status status) {
        super(Status.c(status), status.c);
        this.f8693f = status;
        this.f8694g = null;
        this.f8695h = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f8695h ? super.fillInStackTrace() : this;
    }
}
