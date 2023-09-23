package com.google.firebase.inappmessaging.display.internal;

import android.os.CountDownTimer;

/* loaded from: classes2.dex */
public class RenewableTimer {
    private CountDownTimer mCountDownTimer;

    /* loaded from: classes2.dex */
    public interface Callback {
        void onFinish();
    }

    public void cancel() {
        CountDownTimer countDownTimer = this.mCountDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.mCountDownTimer = null;
        }
    }

    public void start(final Callback callback, long j2, long j3) {
        this.mCountDownTimer = new CountDownTimer(j2, j3) { // from class: com.google.firebase.inappmessaging.display.internal.RenewableTimer.1
            @Override // android.os.CountDownTimer
            public void onFinish() {
                callback.onFinish();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j4) {
            }
        }.start();
    }
}
