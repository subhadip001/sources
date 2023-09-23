package com.google.firebase.inappmessaging;

import f.h.h.y;

/* loaded from: classes2.dex */
public enum RenderErrorReason implements y.c {
    UNSPECIFIED_RENDER_ERROR(0),
    IMAGE_FETCH_ERROR(1),
    IMAGE_DISPLAY_ERROR(2),
    IMAGE_UNSUPPORTED_FORMAT(3);
    
    public static final int IMAGE_DISPLAY_ERROR_VALUE = 2;
    public static final int IMAGE_FETCH_ERROR_VALUE = 1;
    public static final int IMAGE_UNSUPPORTED_FORMAT_VALUE = 3;
    public static final int UNSPECIFIED_RENDER_ERROR_VALUE = 0;
    private static final y.d<RenderErrorReason> internalValueMap = new y.d<RenderErrorReason>() { // from class: com.google.firebase.inappmessaging.RenderErrorReason.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // f.h.h.y.d
        public RenderErrorReason findValueByNumber(int i2) {
            return RenderErrorReason.forNumber(i2);
        }
    };
    private final int value;

    /* loaded from: classes2.dex */
    public static final class RenderErrorReasonVerifier implements y.e {
        public static final y.e INSTANCE = new RenderErrorReasonVerifier();

        private RenderErrorReasonVerifier() {
        }

        @Override // f.h.h.y.e
        public boolean isInRange(int i2) {
            return RenderErrorReason.forNumber(i2) != null;
        }
    }

    RenderErrorReason(int i2) {
        this.value = i2;
    }

    public static RenderErrorReason forNumber(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        return null;
                    }
                    return IMAGE_UNSUPPORTED_FORMAT;
                }
                return IMAGE_DISPLAY_ERROR;
            }
            return IMAGE_FETCH_ERROR;
        }
        return UNSPECIFIED_RENDER_ERROR;
    }

    public static y.d<RenderErrorReason> internalGetValueMap() {
        return internalValueMap;
    }

    public static y.e internalGetVerifier() {
        return RenderErrorReasonVerifier.INSTANCE;
    }

    @Override // f.h.h.y.c
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static RenderErrorReason valueOf(int i2) {
        return forNumber(i2);
    }
}
