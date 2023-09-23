package com.google.api;

import f.h.h.y;

/* loaded from: classes.dex */
public enum LaunchStage implements y.c {
    LAUNCH_STAGE_UNSPECIFIED(0),
    EARLY_ACCESS(1),
    ALPHA(2),
    BETA(3),
    GA(4),
    DEPRECATED(5),
    UNRECOGNIZED(-1);
    
    public static final int ALPHA_VALUE = 2;
    public static final int BETA_VALUE = 3;
    public static final int DEPRECATED_VALUE = 5;
    public static final int EARLY_ACCESS_VALUE = 1;
    public static final int GA_VALUE = 4;
    public static final int LAUNCH_STAGE_UNSPECIFIED_VALUE = 0;
    private static final y.d<LaunchStage> internalValueMap = new y.d<LaunchStage>() { // from class: com.google.api.LaunchStage.a
        @Override // f.h.h.y.d
        public LaunchStage findValueByNumber(int i2) {
            return LaunchStage.forNumber(i2);
        }
    };
    private final int value;

    /* loaded from: classes.dex */
    public static final class b implements y.e {
        public static final y.e a = new b();

        @Override // f.h.h.y.e
        public boolean isInRange(int i2) {
            return LaunchStage.forNumber(i2) != null;
        }
    }

    LaunchStage(int i2) {
        this.value = i2;
    }

    public static LaunchStage forNumber(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                return null;
                            }
                            return DEPRECATED;
                        }
                        return GA;
                    }
                    return BETA;
                }
                return ALPHA;
            }
            return EARLY_ACCESS;
        }
        return LAUNCH_STAGE_UNSPECIFIED;
    }

    public static y.d<LaunchStage> internalGetValueMap() {
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
    public static LaunchStage valueOf(int i2) {
        return forNumber(i2);
    }
}
