package com.google.android.exoplayer2.drm;

import java.io.IOException;

/* loaded from: classes.dex */
public interface DrmSession {

    /* loaded from: classes.dex */
    public static class DrmSessionException extends IOException {
        public DrmSessionException(Throwable th) {
            super(th);
        }
    }
}
