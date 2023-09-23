package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.ProtoEnum;

/* loaded from: classes.dex */
public final class LogEventDropped {
    public static final /* synthetic */ int c = 0;
    public final long a;
    public final Reason b;

    /* loaded from: classes.dex */
    public enum Reason implements ProtoEnum {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        
        private final int number_;

        Reason(int i2) {
            this.number_ = i2;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.number_;
        }
    }

    public LogEventDropped(long j2, Reason reason) {
        this.a = j2;
        this.b = reason;
    }
}
