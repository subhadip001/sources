package com.google.type;

/* loaded from: classes2.dex */
public enum DateTime$TimeOffsetCase {
    UTC_OFFSET(8),
    TIME_ZONE(9),
    TIMEOFFSET_NOT_SET(0);
    
    private final int value;

    DateTime$TimeOffsetCase(int i2) {
        this.value = i2;
    }

    public static DateTime$TimeOffsetCase forNumber(int i2) {
        if (i2 != 0) {
            if (i2 != 8) {
                if (i2 != 9) {
                    return null;
                }
                return TIME_ZONE;
            }
            return UTC_OFFSET;
        }
        return TIMEOFFSET_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @Deprecated
    public static DateTime$TimeOffsetCase valueOf(int i2) {
        return forNumber(i2);
    }
}
