package com.google.protobuf;

import f.h.h.y;

/* loaded from: classes2.dex */
public enum Syntax implements y.c {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);
    
    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final y.d<Syntax> internalValueMap = new y.d<Syntax>() { // from class: com.google.protobuf.Syntax.a
        @Override // f.h.h.y.d
        public Syntax findValueByNumber(int i2) {
            return Syntax.forNumber(i2);
        }
    };
    private final int value;

    /* loaded from: classes2.dex */
    public static final class b implements y.e {
        public static final y.e a = new b();

        @Override // f.h.h.y.e
        public boolean isInRange(int i2) {
            return Syntax.forNumber(i2) != null;
        }
    }

    Syntax(int i2) {
        this.value = i2;
    }

    public static Syntax forNumber(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                return null;
            }
            return SYNTAX_PROTO3;
        }
        return SYNTAX_PROTO2;
    }

    public static y.d<Syntax> internalGetValueMap() {
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
    public static Syntax valueOf(int i2) {
        return forNumber(i2);
    }
}
