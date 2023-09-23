package com.google.firebase.database.logging;

/* loaded from: classes2.dex */
public interface Logger {

    /* loaded from: classes2.dex */
    public enum Level {
        DEBUG,
        INFO,
        WARN,
        ERROR,
        NONE
    }

    Level getLogLevel();

    void onLogMessage(Level level, String str, String str2, long j2);
}
