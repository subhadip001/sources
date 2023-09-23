package com.google.api;

import f.h.h.y;

/* loaded from: classes.dex */
public enum BackendRule$PathTranslation implements y.c {
    PATH_TRANSLATION_UNSPECIFIED(0),
    CONSTANT_ADDRESS(1),
    APPEND_PATH_TO_ADDRESS(2),
    UNRECOGNIZED(-1);
    
    public static final int APPEND_PATH_TO_ADDRESS_VALUE = 2;
    public static final int CONSTANT_ADDRESS_VALUE = 1;
    public static final int PATH_TRANSLATION_UNSPECIFIED_VALUE = 0;
    private static final y.d<BackendRule$PathTranslation> internalValueMap = new y.d<BackendRule$PathTranslation>() { // from class: com.google.api.BackendRule$PathTranslation.a
        @Override // f.h.h.y.d
        public BackendRule$PathTranslation findValueByNumber(int i2) {
            return BackendRule$PathTranslation.forNumber(i2);
        }
    };
    private final int value;

    /* loaded from: classes.dex */
    public static final class b implements y.e {
        public static final y.e a = new b();

        @Override // f.h.h.y.e
        public boolean isInRange(int i2) {
            return BackendRule$PathTranslation.forNumber(i2) != null;
        }
    }

    BackendRule$PathTranslation(int i2) {
        this.value = i2;
    }

    public static BackendRule$PathTranslation forNumber(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return null;
                }
                return APPEND_PATH_TO_ADDRESS;
            }
            return CONSTANT_ADDRESS;
        }
        return PATH_TRANSLATION_UNSPECIFIED;
    }

    public static y.d<BackendRule$PathTranslation> internalGetValueMap() {
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
    public static BackendRule$PathTranslation valueOf(int i2) {
        return forNumber(i2);
    }
}
