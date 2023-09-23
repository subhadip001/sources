package com.google.protobuf;

import f.h.h.y;

/* loaded from: classes2.dex */
public enum Field$Cardinality implements y.c {
    CARDINALITY_UNKNOWN(0),
    CARDINALITY_OPTIONAL(1),
    CARDINALITY_REQUIRED(2),
    CARDINALITY_REPEATED(3),
    UNRECOGNIZED(-1);
    
    public static final int CARDINALITY_OPTIONAL_VALUE = 1;
    public static final int CARDINALITY_REPEATED_VALUE = 3;
    public static final int CARDINALITY_REQUIRED_VALUE = 2;
    public static final int CARDINALITY_UNKNOWN_VALUE = 0;
    private static final y.d<Field$Cardinality> internalValueMap = new y.d<Field$Cardinality>() { // from class: com.google.protobuf.Field$Cardinality.a
        @Override // f.h.h.y.d
        public Field$Cardinality findValueByNumber(int i2) {
            return Field$Cardinality.forNumber(i2);
        }
    };
    private final int value;

    /* loaded from: classes2.dex */
    public static final class b implements y.e {
        public static final y.e a = new b();

        @Override // f.h.h.y.e
        public boolean isInRange(int i2) {
            return Field$Cardinality.forNumber(i2) != null;
        }
    }

    Field$Cardinality(int i2) {
        this.value = i2;
    }

    public static Field$Cardinality forNumber(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        return null;
                    }
                    return CARDINALITY_REPEATED;
                }
                return CARDINALITY_REQUIRED;
            }
            return CARDINALITY_OPTIONAL;
        }
        return CARDINALITY_UNKNOWN;
    }

    public static y.d<Field$Cardinality> internalGetValueMap() {
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
    public static Field$Cardinality valueOf(int i2) {
        return forNumber(i2);
    }
}
