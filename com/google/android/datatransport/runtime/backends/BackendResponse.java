package com.google.android.datatransport.runtime.backends;

import f.h.b.a.i.s.b;

/* loaded from: classes.dex */
public abstract class BackendResponse {

    /* loaded from: classes.dex */
    public enum Status {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static BackendResponse a() {
        return new b(Status.FATAL_ERROR, -1L);
    }

    public abstract long b();

    public abstract Status c();
}
