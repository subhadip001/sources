package com.google.logging.type;

import f.h.h.y;

/* loaded from: classes2.dex */
public enum LogSeverity implements y.c {
    DEFAULT(0),
    DEBUG(100),
    INFO(INFO_VALUE),
    NOTICE(NOTICE_VALUE),
    WARNING(WARNING_VALUE),
    ERROR(500),
    CRITICAL(CRITICAL_VALUE),
    ALERT(ALERT_VALUE),
    EMERGENCY(EMERGENCY_VALUE),
    UNRECOGNIZED(-1);
    
    public static final int ALERT_VALUE = 700;
    public static final int CRITICAL_VALUE = 600;
    public static final int DEBUG_VALUE = 100;
    public static final int DEFAULT_VALUE = 0;
    public static final int EMERGENCY_VALUE = 800;
    public static final int ERROR_VALUE = 500;
    public static final int INFO_VALUE = 200;
    public static final int NOTICE_VALUE = 300;
    public static final int WARNING_VALUE = 400;
    private static final y.d<LogSeverity> internalValueMap = new y.d<LogSeverity>() { // from class: com.google.logging.type.LogSeverity.a
        @Override // f.h.h.y.d
        public LogSeverity findValueByNumber(int i2) {
            return LogSeverity.forNumber(i2);
        }
    };
    private final int value;

    /* loaded from: classes2.dex */
    public static final class b implements y.e {
        public static final y.e a = new b();

        @Override // f.h.h.y.e
        public boolean isInRange(int i2) {
            return LogSeverity.forNumber(i2) != null;
        }
    }

    LogSeverity(int i2) {
        this.value = i2;
    }

    public static LogSeverity forNumber(int i2) {
        if (i2 != 0) {
            if (i2 != 100) {
                if (i2 != 200) {
                    if (i2 != 300) {
                        if (i2 != 400) {
                            if (i2 != 500) {
                                if (i2 != 600) {
                                    if (i2 != 700) {
                                        if (i2 != 800) {
                                            return null;
                                        }
                                        return EMERGENCY;
                                    }
                                    return ALERT;
                                }
                                return CRITICAL;
                            }
                            return ERROR;
                        }
                        return WARNING;
                    }
                    return NOTICE;
                }
                return INFO;
            }
            return DEBUG;
        }
        return DEFAULT;
    }

    public static y.d<LogSeverity> internalGetValueMap() {
        return internalValueMap;
    }

    public static y.e internalGetVerifier() {
        return b.a;
    }

    @Override // f.h.h.y.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static LogSeverity valueOf(int i2) {
        return forNumber(i2);
    }
}
