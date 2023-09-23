package com.google.api;

import f.h.h.y;

/* loaded from: classes.dex */
public enum ResourceDescriptor$History implements y.c {
    HISTORY_UNSPECIFIED(0),
    ORIGINALLY_SINGLE_PATTERN(1),
    FUTURE_MULTI_PATTERN(2),
    UNRECOGNIZED(-1);
    
    public static final int FUTURE_MULTI_PATTERN_VALUE = 2;
    public static final int HISTORY_UNSPECIFIED_VALUE = 0;
    public static final int ORIGINALLY_SINGLE_PATTERN_VALUE = 1;
    private static final y.d<ResourceDescriptor$History> internalValueMap = new y.d<ResourceDescriptor$History>() { // from class: com.google.api.ResourceDescriptor$History.a
        @Override // f.h.h.y.d
        public ResourceDescriptor$History findValueByNumber(int i2) {
            return ResourceDescriptor$History.forNumber(i2);
        }
    };
    private final int value;

    /* loaded from: classes.dex */
    public static final class b implements y.e {
        public static final y.e a = new b();

        @Override // f.h.h.y.e
        public boolean isInRange(int i2) {
            return ResourceDescriptor$History.forNumber(i2) != null;
        }
    }

    ResourceDescriptor$History(int i2) {
        this.value = i2;
    }

    public static ResourceDescriptor$History forNumber(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return null;
                }
                return FUTURE_MULTI_PATTERN;
            }
            return ORIGINALLY_SINGLE_PATTERN;
        }
        return HISTORY_UNSPECIFIED;
    }

    public static y.d<ResourceDescriptor$History> internalGetValueMap() {
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
    public static ResourceDescriptor$History valueOf(int i2) {
        return forNumber(i2);
    }
}
