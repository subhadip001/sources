package com.google.api;

/* loaded from: classes.dex */
public enum JwtLocation$InCase {
    HEADER(1),
    QUERY(2),
    IN_NOT_SET(0);
    
    private final int value;

    JwtLocation$InCase(int i2) {
        this.value = i2;
    }

    public static JwtLocation$InCase forNumber(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return null;
                }
                return QUERY;
            }
            return HEADER;
        }
        return IN_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @Deprecated
    public static JwtLocation$InCase valueOf(int i2) {
        return forNumber(i2);
    }
}
