package com.google.firebase.inappmessaging;

import f.h.h.y;

/* loaded from: classes2.dex */
public enum FetchErrorReason implements y.c {
    UNSPECIFIED_FETCH_ERROR(0),
    SERVER_ERROR(1),
    CLIENT_ERROR(2),
    NETWORK_ERROR(3);
    
    public static final int CLIENT_ERROR_VALUE = 2;
    public static final int NETWORK_ERROR_VALUE = 3;
    public static final int SERVER_ERROR_VALUE = 1;
    public static final int UNSPECIFIED_FETCH_ERROR_VALUE = 0;
    private static final y.d<FetchErrorReason> internalValueMap = new y.d<FetchErrorReason>() { // from class: com.google.firebase.inappmessaging.FetchErrorReason.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // f.h.h.y.d
        public FetchErrorReason findValueByNumber(int i2) {
            return FetchErrorReason.forNumber(i2);
        }
    };
    private final int value;

    /* loaded from: classes2.dex */
    public static final class FetchErrorReasonVerifier implements y.e {
        public static final y.e INSTANCE = new FetchErrorReasonVerifier();

        private FetchErrorReasonVerifier() {
        }

        @Override // f.h.h.y.e
        public boolean isInRange(int i2) {
            return FetchErrorReason.forNumber(i2) != null;
        }
    }

    FetchErrorReason(int i2) {
        this.value = i2;
    }

    public static FetchErrorReason forNumber(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        return null;
                    }
                    return NETWORK_ERROR;
                }
                return CLIENT_ERROR;
            }
            return SERVER_ERROR;
        }
        return UNSPECIFIED_FETCH_ERROR;
    }

    public static y.d<FetchErrorReason> internalGetValueMap() {
        return internalValueMap;
    }

    public static y.e internalGetVerifier() {
        return FetchErrorReasonVerifier.INSTANCE;
    }

    @Override // f.h.h.y.c
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static FetchErrorReason valueOf(int i2) {
        return forNumber(i2);
    }
}
