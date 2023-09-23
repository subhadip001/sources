package com.bumptech.glide.request;

import f.e.a.p.d;

/* loaded from: classes.dex */
public interface RequestCoordinator {

    /* loaded from: classes.dex */
    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        
        private final boolean isComplete;

        RequestState(boolean z) {
            this.isComplete = z;
        }

        public boolean a() {
            return this.isComplete;
        }
    }

    boolean a();

    RequestCoordinator b();

    void c(d dVar);

    boolean d(d dVar);

    boolean h(d dVar);

    void j(d dVar);

    boolean l(d dVar);
}
