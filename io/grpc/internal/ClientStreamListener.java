package io.grpc.internal;

import g.a.i0;
import g.a.v0.t2;
import io.grpc.Status;

/* loaded from: classes2.dex */
public interface ClientStreamListener extends t2 {

    /* loaded from: classes2.dex */
    public enum RpcProgress {
        PROCESSED,
        REFUSED,
        DROPPED
    }

    void c(Status status, i0 i0Var);

    void d(i0 i0Var);

    void e(Status status, RpcProgress rpcProgress, i0 i0Var);
}
