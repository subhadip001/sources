package com.google.api;

import f.h.h.y;

/* loaded from: classes.dex */
public enum MetricDescriptor$MetricKind implements y.c {
    METRIC_KIND_UNSPECIFIED(0),
    GAUGE(1),
    DELTA(2),
    CUMULATIVE(3),
    UNRECOGNIZED(-1);
    
    public static final int CUMULATIVE_VALUE = 3;
    public static final int DELTA_VALUE = 2;
    public static final int GAUGE_VALUE = 1;
    public static final int METRIC_KIND_UNSPECIFIED_VALUE = 0;
    private static final y.d<MetricDescriptor$MetricKind> internalValueMap = new y.d<MetricDescriptor$MetricKind>() { // from class: com.google.api.MetricDescriptor$MetricKind.a
        @Override // f.h.h.y.d
        public MetricDescriptor$MetricKind findValueByNumber(int i2) {
            return MetricDescriptor$MetricKind.forNumber(i2);
        }
    };
    private final int value;

    /* loaded from: classes.dex */
    public static final class b implements y.e {
        public static final y.e a = new b();

        @Override // f.h.h.y.e
        public boolean isInRange(int i2) {
            return MetricDescriptor$MetricKind.forNumber(i2) != null;
        }
    }

    MetricDescriptor$MetricKind(int i2) {
        this.value = i2;
    }

    public static MetricDescriptor$MetricKind forNumber(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        return null;
                    }
                    return CUMULATIVE;
                }
                return DELTA;
            }
            return GAUGE;
        }
        return METRIC_KIND_UNSPECIFIED;
    }

    public static y.d<MetricDescriptor$MetricKind> internalGetValueMap() {
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
    public static MetricDescriptor$MetricKind valueOf(int i2) {
        return forNumber(i2);
    }
}
