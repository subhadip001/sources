package com.google.firebase.inappmessaging;

import f.h.h.y;

/* loaded from: classes2.dex */
public enum EventType implements y.c {
    UNKNOWN_EVENT_TYPE(0),
    IMPRESSION_EVENT_TYPE(1),
    CLICK_EVENT_TYPE(2);
    
    public static final int CLICK_EVENT_TYPE_VALUE = 2;
    public static final int IMPRESSION_EVENT_TYPE_VALUE = 1;
    public static final int UNKNOWN_EVENT_TYPE_VALUE = 0;
    private static final y.d<EventType> internalValueMap = new y.d<EventType>() { // from class: com.google.firebase.inappmessaging.EventType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // f.h.h.y.d
        public EventType findValueByNumber(int i2) {
            return EventType.forNumber(i2);
        }
    };
    private final int value;

    /* loaded from: classes2.dex */
    public static final class EventTypeVerifier implements y.e {
        public static final y.e INSTANCE = new EventTypeVerifier();

        private EventTypeVerifier() {
        }

        @Override // f.h.h.y.e
        public boolean isInRange(int i2) {
            return EventType.forNumber(i2) != null;
        }
    }

    EventType(int i2) {
        this.value = i2;
    }

    public static EventType forNumber(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return null;
                }
                return CLICK_EVENT_TYPE;
            }
            return IMPRESSION_EVENT_TYPE;
        }
        return UNKNOWN_EVENT_TYPE;
    }

    public static y.d<EventType> internalGetValueMap() {
        return internalValueMap;
    }

    public static y.e internalGetVerifier() {
        return EventTypeVerifier.INSTANCE;
    }

    @Override // f.h.h.y.c
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static EventType valueOf(int i2) {
        return forNumber(i2);
    }
}
