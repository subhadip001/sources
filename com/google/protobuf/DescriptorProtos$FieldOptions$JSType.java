package com.google.protobuf;

import f.h.h.y;

/* loaded from: classes2.dex */
public enum DescriptorProtos$FieldOptions$JSType implements y.c {
    JS_NORMAL(0),
    JS_STRING(1),
    JS_NUMBER(2);
    
    public static final int JS_NORMAL_VALUE = 0;
    public static final int JS_NUMBER_VALUE = 2;
    public static final int JS_STRING_VALUE = 1;
    private static final y.d<DescriptorProtos$FieldOptions$JSType> internalValueMap = new y.d<DescriptorProtos$FieldOptions$JSType>() { // from class: com.google.protobuf.DescriptorProtos$FieldOptions$JSType.a
        @Override // f.h.h.y.d
        public DescriptorProtos$FieldOptions$JSType findValueByNumber(int i2) {
            return DescriptorProtos$FieldOptions$JSType.forNumber(i2);
        }
    };
    private final int value;

    /* loaded from: classes2.dex */
    public static final class b implements y.e {
        public static final y.e a = new b();

        @Override // f.h.h.y.e
        public boolean isInRange(int i2) {
            return DescriptorProtos$FieldOptions$JSType.forNumber(i2) != null;
        }
    }

    DescriptorProtos$FieldOptions$JSType(int i2) {
        this.value = i2;
    }

    public static DescriptorProtos$FieldOptions$JSType forNumber(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return null;
                }
                return JS_NUMBER;
            }
            return JS_STRING;
        }
        return JS_NORMAL;
    }

    public static y.d<DescriptorProtos$FieldOptions$JSType> internalGetValueMap() {
        return internalValueMap;
    }

    public static y.e internalGetVerifier() {
        return b.a;
    }

    @Override // f.h.h.y.c
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static DescriptorProtos$FieldOptions$JSType valueOf(int i2) {
        return forNumber(i2);
    }
}
