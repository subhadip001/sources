package com.google.protobuf;

import f.h.h.y;

/* loaded from: classes2.dex */
public enum DescriptorProtos$FieldDescriptorProto$Label implements y.c {
    LABEL_OPTIONAL(1),
    LABEL_REQUIRED(2),
    LABEL_REPEATED(3);
    
    public static final int LABEL_OPTIONAL_VALUE = 1;
    public static final int LABEL_REPEATED_VALUE = 3;
    public static final int LABEL_REQUIRED_VALUE = 2;
    private static final y.d<DescriptorProtos$FieldDescriptorProto$Label> internalValueMap = new y.d<DescriptorProtos$FieldDescriptorProto$Label>() { // from class: com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Label.a
        @Override // f.h.h.y.d
        public DescriptorProtos$FieldDescriptorProto$Label findValueByNumber(int i2) {
            return DescriptorProtos$FieldDescriptorProto$Label.forNumber(i2);
        }
    };
    private final int value;

    /* loaded from: classes2.dex */
    public static final class b implements y.e {
        public static final y.e a = new b();

        @Override // f.h.h.y.e
        public boolean isInRange(int i2) {
            return DescriptorProtos$FieldDescriptorProto$Label.forNumber(i2) != null;
        }
    }

    DescriptorProtos$FieldDescriptorProto$Label(int i2) {
        this.value = i2;
    }

    public static DescriptorProtos$FieldDescriptorProto$Label forNumber(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return null;
                }
                return LABEL_REPEATED;
            }
            return LABEL_REQUIRED;
        }
        return LABEL_OPTIONAL;
    }

    public static y.d<DescriptorProtos$FieldDescriptorProto$Label> internalGetValueMap() {
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
    public static DescriptorProtos$FieldDescriptorProto$Label valueOf(int i2) {
        return forNumber(i2);
    }
}
