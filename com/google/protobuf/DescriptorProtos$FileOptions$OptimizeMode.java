package com.google.protobuf;

import f.h.h.y;

/* loaded from: classes2.dex */
public enum DescriptorProtos$FileOptions$OptimizeMode implements y.c {
    SPEED(1),
    CODE_SIZE(2),
    LITE_RUNTIME(3);
    
    public static final int CODE_SIZE_VALUE = 2;
    public static final int LITE_RUNTIME_VALUE = 3;
    public static final int SPEED_VALUE = 1;
    private static final y.d<DescriptorProtos$FileOptions$OptimizeMode> internalValueMap = new y.d<DescriptorProtos$FileOptions$OptimizeMode>() { // from class: com.google.protobuf.DescriptorProtos$FileOptions$OptimizeMode.a
        @Override // f.h.h.y.d
        public DescriptorProtos$FileOptions$OptimizeMode findValueByNumber(int i2) {
            return DescriptorProtos$FileOptions$OptimizeMode.forNumber(i2);
        }
    };
    private final int value;

    /* loaded from: classes2.dex */
    public static final class b implements y.e {
        public static final y.e a = new b();

        @Override // f.h.h.y.e
        public boolean isInRange(int i2) {
            return DescriptorProtos$FileOptions$OptimizeMode.forNumber(i2) != null;
        }
    }

    DescriptorProtos$FileOptions$OptimizeMode(int i2) {
        this.value = i2;
    }

    public static DescriptorProtos$FileOptions$OptimizeMode forNumber(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return null;
                }
                return LITE_RUNTIME;
            }
            return CODE_SIZE;
        }
        return SPEED;
    }

    public static y.d<DescriptorProtos$FileOptions$OptimizeMode> internalGetValueMap() {
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
    public static DescriptorProtos$FileOptions$OptimizeMode valueOf(int i2) {
        return forNumber(i2);
    }
}
