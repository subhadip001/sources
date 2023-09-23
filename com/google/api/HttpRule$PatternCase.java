package com.google.api;

/* loaded from: classes.dex */
public enum HttpRule$PatternCase {
    GET(2),
    PUT(3),
    POST(4),
    DELETE(5),
    PATCH(6),
    CUSTOM(8),
    PATTERN_NOT_SET(0);
    
    private final int value;

    HttpRule$PatternCase(int i2) {
        this.value = i2;
    }

    public static HttpRule$PatternCase forNumber(int i2) {
        if (i2 != 0) {
            if (i2 != 8) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                if (i2 != 6) {
                                    return null;
                                }
                                return PATCH;
                            }
                            return DELETE;
                        }
                        return POST;
                    }
                    return PUT;
                }
                return GET;
            }
            return CUSTOM;
        }
        return PATTERN_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @Deprecated
    public static HttpRule$PatternCase valueOf(int i2) {
        return forNumber(i2);
    }
}
