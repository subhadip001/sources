package com.google.protobuf;

import f.h.h.y;

/* loaded from: classes2.dex */
public enum NullValue implements y.c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);
    
    public static final int NULL_VALUE_VALUE = 0;
    private static final y.d<NullValue> internalValueMap = new y.d<NullValue>() { // from class: com.google.protobuf.NullValue.a
        @Override // f.h.h.y.d
        public NullValue findValueByNumber(int i2) {
            return NullValue.forNumber(i2);
        }
    };
    private final int value;

    /* loaded from: classes2.dex */
    public static final class b implements y.e {
        public static final y.e a = new b();

        @Override // f.h.h.y.e
        public boolean isInRange(int i2) {
            return NullValue.forNumber(i2) != null;
        }
    }

    NullValue(int i2) {
        this.value = i2;
    }

    public static NullValue forNumber(int i2) {
        if (i2 != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static y.d<NullValue> internalGetValueMap() {
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
    public static NullValue valueOf(int i2) {
        return forNumber(i2);
    }
}
