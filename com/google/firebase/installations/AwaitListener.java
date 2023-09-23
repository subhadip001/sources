package com.google.firebase.installations;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class AwaitListener implements OnCompleteListener<Void> {
    private final CountDownLatch latch = new CountDownLatch(1);

    public boolean await(long j2, TimeUnit timeUnit) {
        return this.latch.await(j2, timeUnit);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task<Void> task) {
        this.latch.countDown();
    }

    public void onSuccess() {
        this.latch.countDown();
    }
}
