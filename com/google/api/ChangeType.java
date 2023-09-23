package com.google.api;

import f.h.h.y;

/* loaded from: classes.dex */
public enum ChangeType implements y.c {
    CHANGE_TYPE_UNSPECIFIED(0),
    ADDED(1),
    REMOVED(2),
    MODIFIED(3),
    UNRECOGNIZED(-1);
    
    public static final int ADDED_VALUE = 1;
    public static final int CHANGE_TYPE_UNSPECIFIED_VALUE = 0;
    public static final int MODIFIED_VALUE = 3;
    public static final int REMOVED_VALUE = 2;
    private static final y.d<ChangeType> internalValueMap = new y.d<ChangeType>() { // from class: com.google.api.ChangeType.a
        @Override // f.h.h.y.d
        public ChangeType findValueByNumber(int i2) {
            return ChangeType.forNumber(i2);
        }
    };
    private final int value;

    /* loaded from: classes.dex */
    public static final class b implements y.e {
        public static final y.e a = new b();

        @Override // f.h.h.y.e
        public boolean isInRange(int i2) {
            return ChangeType.forNumber(i2) != null;
        }
    }

    ChangeType(int i2) {
        this.value = i2;
    }

    public static ChangeType forNumber(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        return null;
                    }
                    return MODIFIED;
                }
                return REMOVED;
            }
            return ADDED;
        }
        return CHANGE_TYPE_UNSPECIFIED;
    }

    public static y.d<ChangeType> internalGetValueMap() {
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
    public static ChangeType valueOf(int i2) {
        return forNumber(i2);
    }
}
