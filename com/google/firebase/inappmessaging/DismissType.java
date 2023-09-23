package com.google.firebase.inappmessaging;

import f.h.h.y;

/* loaded from: classes2.dex */
public enum DismissType implements y.c {
    UNKNOWN_DISMISS_TYPE(0),
    AUTO(1),
    CLICK(2),
    SWIPE(3);
    
    public static final int AUTO_VALUE = 1;
    public static final int CLICK_VALUE = 2;
    public static final int SWIPE_VALUE = 3;
    public static final int UNKNOWN_DISMISS_TYPE_VALUE = 0;
    private static final y.d<DismissType> internalValueMap = new y.d<DismissType>() { // from class: com.google.firebase.inappmessaging.DismissType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // f.h.h.y.d
        public DismissType findValueByNumber(int i2) {
            return DismissType.forNumber(i2);
        }
    };
    private final int value;

    /* loaded from: classes2.dex */
    public static final class DismissTypeVerifier implements y.e {
        public static final y.e INSTANCE = new DismissTypeVerifier();

        private DismissTypeVerifier() {
        }

        @Override // f.h.h.y.e
        public boolean isInRange(int i2) {
            return DismissType.forNumber(i2) != null;
        }
    }

    DismissType(int i2) {
        this.value = i2;
    }

    public static DismissType forNumber(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        return null;
                    }
                    return SWIPE;
                }
                return CLICK;
            }
            return AUTO;
        }
        return UNKNOWN_DISMISS_TYPE;
    }

    public static y.d<DismissType> internalGetValueMap() {
        return internalValueMap;
    }

    public static y.e internalGetVerifier() {
        return DismissTypeVerifier.INSTANCE;
    }

    @Override // f.h.h.y.c
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static DismissType valueOf(int i2) {
        return forNumber(i2);
    }
}
