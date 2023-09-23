package com.arthenica.ffmpegkit;

/* loaded from: classes.dex */
public enum Level {
    AV_LOG_STDERR(-16),
    AV_LOG_QUIET(-8),
    AV_LOG_PANIC(0),
    AV_LOG_FATAL(8),
    AV_LOG_ERROR(16),
    AV_LOG_WARNING(24),
    AV_LOG_INFO(32),
    AV_LOG_VERBOSE(40),
    AV_LOG_DEBUG(48),
    AV_LOG_TRACE(56);
    
    private final int value;

    Level(int i2) {
        this.value = i2;
    }

    public static Level from(int i2) {
        Level level = AV_LOG_STDERR;
        if (i2 == level.getValue()) {
            return level;
        }
        Level level2 = AV_LOG_QUIET;
        if (i2 == level2.getValue()) {
            return level2;
        }
        Level level3 = AV_LOG_PANIC;
        if (i2 == level3.getValue()) {
            return level3;
        }
        Level level4 = AV_LOG_FATAL;
        if (i2 == level4.getValue()) {
            return level4;
        }
        Level level5 = AV_LOG_ERROR;
        if (i2 == level5.getValue()) {
            return level5;
        }
        Level level6 = AV_LOG_WARNING;
        if (i2 == level6.getValue()) {
            return level6;
        }
        Level level7 = AV_LOG_INFO;
        if (i2 == level7.getValue()) {
            return level7;
        }
        Level level8 = AV_LOG_VERBOSE;
        if (i2 == level8.getValue()) {
            return level8;
        }
        Level level9 = AV_LOG_DEBUG;
        return i2 == level9.getValue() ? level9 : AV_LOG_TRACE;
    }

    public int getValue() {
        return this.value;
    }
}
