package com.google.protobuf;

import f.h.h.y;

/* loaded from: classes2.dex */
public enum DescriptorProtos$FieldOptions$CType implements y.c {
    STRING(0),
    CORD(1),
    STRING_PIECE(2);
    
    public static final int CORD_VALUE = 1;
    public static final int STRING_PIECE_VALUE = 2;
    public static final int STRING_VALUE = 0;
    private static final y.d<DescriptorProtos$FieldOptions$CType> internalValueMap = new y.d<DescriptorProtos$FieldOptions$CType>() { // from class: com.google.protobuf.DescriptorProtos$FieldOptions$CType.a
        @Override // f.h.h.y.d
        public DescriptorProtos$FieldOptions$CType findValueByNumber(int i2) {
            return DescriptorProtos$FieldOptions$CType.forNumber(i2);
        }
    };
    private final int value;

    /* loaded from: classes2.dex */
    public static final class b implements y.e {
        public static final y.e a = new b();

        @Override // f.h.h.y.e
        public boolean isInRange(int i2) {
            return DescriptorProtos$FieldOptions$CType.forNumber(i2) != null;
        }
    }

    DescriptorProtos$FieldOptions$CType(int i2) {
        this.value = i2;
    }

    public static DescriptorProtos$FieldOptions$CType forNumber(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return null;
                }
                return STRING_PIECE;
            }
            return CORD;
        }
        return STRING;
    }

    public static y.d<DescriptorProtos$FieldOptions$CType> internalGetValueMap() {
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
    public static DescriptorProtos$FieldOptions$CType valueOf(int i2) {
        return forNumber(i2);
    }
}
