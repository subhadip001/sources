package com.google.api;

import f.h.h.y;

/* loaded from: classes.dex */
public enum LabelDescriptor$ValueType implements y.c {
    STRING(0),
    BOOL(1),
    INT64(2),
    UNRECOGNIZED(-1);
    
    public static final int BOOL_VALUE = 1;
    public static final int INT64_VALUE = 2;
    public static final int STRING_VALUE = 0;
    private static final y.d<LabelDescriptor$ValueType> internalValueMap = new y.d<LabelDescriptor$ValueType>() { // from class: com.google.api.LabelDescriptor$ValueType.a
        @Override // f.h.h.y.d
        public LabelDescriptor$ValueType findValueByNumber(int i2) {
            return LabelDescriptor$ValueType.forNumber(i2);
        }
    };
    private final int value;

    /* loaded from: classes.dex */
    public static final class b implements y.e {
        public static final y.e a = new b();

        @Override // f.h.h.y.e
        public boolean isInRange(int i2) {
            return LabelDescriptor$ValueType.forNumber(i2) != null;
        }
    }

    LabelDescriptor$ValueType(int i2) {
        this.value = i2;
    }

    public static LabelDescriptor$ValueType forNumber(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return null;
                }
                return INT64;
            }
            return BOOL;
        }
        return STRING;
    }

    public static y.d<LabelDescriptor$ValueType> internalGetValueMap() {
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
    public static LabelDescriptor$ValueType valueOf(int i2) {
        return forNumber(i2);
    }
}
