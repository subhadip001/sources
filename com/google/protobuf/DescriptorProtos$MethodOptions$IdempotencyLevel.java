package com.google.protobuf;

import f.h.h.y;

/* loaded from: classes2.dex */
public enum DescriptorProtos$MethodOptions$IdempotencyLevel implements y.c {
    IDEMPOTENCY_UNKNOWN(0),
    NO_SIDE_EFFECTS(1),
    IDEMPOTENT(2);
    
    public static final int IDEMPOTENCY_UNKNOWN_VALUE = 0;
    public static final int IDEMPOTENT_VALUE = 2;
    public static final int NO_SIDE_EFFECTS_VALUE = 1;
    private static final y.d<DescriptorProtos$MethodOptions$IdempotencyLevel> internalValueMap = new y.d<DescriptorProtos$MethodOptions$IdempotencyLevel>() { // from class: com.google.protobuf.DescriptorProtos$MethodOptions$IdempotencyLevel.a
        @Override // f.h.h.y.d
        public DescriptorProtos$MethodOptions$IdempotencyLevel findValueByNumber(int i2) {
            return DescriptorProtos$MethodOptions$IdempotencyLevel.forNumber(i2);
        }
    };
    private final int value;

    /* loaded from: classes2.dex */
    public static final class b implements y.e {
        public static final y.e a = new b();

        @Override // f.h.h.y.e
        public boolean isInRange(int i2) {
            return DescriptorProtos$MethodOptions$IdempotencyLevel.forNumber(i2) != null;
        }
    }

    DescriptorProtos$MethodOptions$IdempotencyLevel(int i2) {
        this.value = i2;
    }

    public static DescriptorProtos$MethodOptions$IdempotencyLevel forNumber(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return null;
                }
                return IDEMPOTENT;
            }
            return NO_SIDE_EFFECTS;
        }
        return IDEMPOTENCY_UNKNOWN;
    }

    public static y.d<DescriptorProtos$MethodOptions$IdempotencyLevel> internalGetValueMap() {
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
    public static DescriptorProtos$MethodOptions$IdempotencyLevel valueOf(int i2) {
        return forNumber(i2);
    }
}
