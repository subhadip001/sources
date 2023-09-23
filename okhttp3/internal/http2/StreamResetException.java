package okhttp3.internal.http2;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class StreamResetException extends IOException {

    /* renamed from: f  reason: collision with root package name */
    public final ErrorCode f9333f;

    public StreamResetException(ErrorCode errorCode) {
        super("stream was reset: " + errorCode);
        this.f9333f = errorCode;
    }
}
