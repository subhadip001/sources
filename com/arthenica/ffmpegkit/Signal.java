package com.arthenica.ffmpegkit;

/* loaded from: classes.dex */
public enum Signal {
    SIGINT(2),
    SIGQUIT(3),
    SIGPIPE(13),
    SIGTERM(15),
    SIGXCPU(24);
    
    private final int value;

    Signal(int i2) {
        this.value = i2;
    }

    public int getValue() {
        return this.value;
    }
}
