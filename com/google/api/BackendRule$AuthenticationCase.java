package com.google.api;

/* loaded from: classes.dex */
public enum BackendRule$AuthenticationCase {
    JWT_AUDIENCE(7),
    DISABLE_AUTH(8),
    AUTHENTICATION_NOT_SET(0);
    
    private final int value;

    BackendRule$AuthenticationCase(int i2) {
        this.value = i2;
    }

    public static BackendRule$AuthenticationCase forNumber(int i2) {
        if (i2 != 0) {
            if (i2 != 7) {
                if (i2 != 8) {
                    return null;
                }
                return DISABLE_AUTH;
            }
            return JWT_AUDIENCE;
        }
        return AUTHENTICATION_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @Deprecated
    public static BackendRule$AuthenticationCase valueOf(int i2) {
        return forNumber(i2);
    }
}
