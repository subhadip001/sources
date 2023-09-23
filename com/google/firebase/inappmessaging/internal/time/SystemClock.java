package com.google.firebase.inappmessaging.internal.time;

/* loaded from: classes2.dex */
public class SystemClock implements Clock {
    @Override // com.google.firebase.inappmessaging.internal.time.Clock
    public long now() {
        return System.currentTimeMillis();
    }
}
