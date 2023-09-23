package com.google.longrunning;

/* loaded from: classes2.dex */
public enum Operation$ResultCase {
    ERROR(4),
    RESPONSE(5),
    RESULT_NOT_SET(0);
    
    private final int value;

    Operation$ResultCase(int i2) {
        this.value = i2;
    }

    public static Operation$ResultCase forNumber(int i2) {
        if (i2 != 0) {
            if (i2 != 4) {
                if (i2 != 5) {
                    return null;
                }
                return RESPONSE;
            }
            return ERROR;
        }
        return RESULT_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @Deprecated
    public static Operation$ResultCase valueOf(int i2) {
        return forNumber(i2);
    }
}
