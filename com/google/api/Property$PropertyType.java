package com.google.api;

import f.h.h.y;

/* loaded from: classes.dex */
public enum Property$PropertyType implements y.c {
    UNSPECIFIED(0),
    INT64(1),
    BOOL(2),
    STRING(3),
    DOUBLE(4),
    UNRECOGNIZED(-1);
    
    public static final int BOOL_VALUE = 2;
    public static final int DOUBLE_VALUE = 4;
    public static final int INT64_VALUE = 1;
    public static final int STRING_VALUE = 3;
    public static final int UNSPECIFIED_VALUE = 0;
    private static final y.d<Property$PropertyType> internalValueMap = new y.d<Property$PropertyType>() { // from class: com.google.api.Property$PropertyType.a
        @Override // f.h.h.y.d
        public Property$PropertyType findValueByNumber(int i2) {
            return Property$PropertyType.forNumber(i2);
        }
    };
    private final int value;

    /* loaded from: classes.dex */
    public static final class b implements y.e {
        public static final y.e a = new b();

        @Override // f.h.h.y.e
        public boolean isInRange(int i2) {
            return Property$PropertyType.forNumber(i2) != null;
        }
    }

    Property$PropertyType(int i2) {
        this.value = i2;
    }

    public static Property$PropertyType forNumber(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            return null;
                        }
                        return DOUBLE;
                    }
                    return STRING;
                }
                return BOOL;
            }
            return INT64;
        }
        return UNSPECIFIED;
    }

    public static y.d<Property$PropertyType> internalGetValueMap() {
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
    public static Property$PropertyType valueOf(int i2) {
        return forNumber(i2);
    }
}
