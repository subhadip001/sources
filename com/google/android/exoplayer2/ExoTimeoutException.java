package com.google.android.exoplayer2;

/* loaded from: classes.dex */
public final class ExoTimeoutException extends Exception {
    public ExoTimeoutException(int i2) {
        super(i2 != 1 ? i2 != 2 ? i2 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.");
    }
}
