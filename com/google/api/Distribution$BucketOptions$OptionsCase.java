package com.google.api;

/* loaded from: classes.dex */
public enum Distribution$BucketOptions$OptionsCase {
    LINEAR_BUCKETS(1),
    EXPONENTIAL_BUCKETS(2),
    EXPLICIT_BUCKETS(3),
    OPTIONS_NOT_SET(0);
    
    private final int value;

    Distribution$BucketOptions$OptionsCase(int i2) {
        this.value = i2;
    }

    public static Distribution$BucketOptions$OptionsCase forNumber(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        return null;
                    }
                    return EXPLICIT_BUCKETS;
                }
                return EXPONENTIAL_BUCKETS;
            }
            return LINEAR_BUCKETS;
        }
        return OPTIONS_NOT_SET;
    }

    public int getNumber() {
        return this.value;
    }

    @Deprecated
    public static Distribution$BucketOptions$OptionsCase valueOf(int i2) {
        return forNumber(i2);
    }
}
