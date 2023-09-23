package com.google.type;

import f.h.h.y;

/* loaded from: classes2.dex */
public enum CalendarPeriod implements y.c {
    CALENDAR_PERIOD_UNSPECIFIED(0),
    DAY(1),
    WEEK(2),
    FORTNIGHT(3),
    MONTH(4),
    QUARTER(5),
    HALF(6),
    YEAR(7),
    UNRECOGNIZED(-1);
    
    public static final int CALENDAR_PERIOD_UNSPECIFIED_VALUE = 0;
    public static final int DAY_VALUE = 1;
    public static final int FORTNIGHT_VALUE = 3;
    public static final int HALF_VALUE = 6;
    public static final int MONTH_VALUE = 4;
    public static final int QUARTER_VALUE = 5;
    public static final int WEEK_VALUE = 2;
    public static final int YEAR_VALUE = 7;
    private static final y.d<CalendarPeriod> internalValueMap = new y.d<CalendarPeriod>() { // from class: com.google.type.CalendarPeriod.a
        @Override // f.h.h.y.d
        public CalendarPeriod findValueByNumber(int i2) {
            return CalendarPeriod.forNumber(i2);
        }
    };
    private final int value;

    /* loaded from: classes2.dex */
    public static final class b implements y.e {
        public static final y.e a = new b();

        @Override // f.h.h.y.e
        public boolean isInRange(int i2) {
            return CalendarPeriod.forNumber(i2) != null;
        }
    }

    CalendarPeriod(int i2) {
        this.value = i2;
    }

    public static CalendarPeriod forNumber(int i2) {
        switch (i2) {
            case 0:
                return CALENDAR_PERIOD_UNSPECIFIED;
            case 1:
                return DAY;
            case 2:
                return WEEK;
            case 3:
                return FORTNIGHT;
            case 4:
                return MONTH;
            case 5:
                return QUARTER;
            case 6:
                return HALF;
            case 7:
                return YEAR;
            default:
                return null;
        }
    }

    public static y.d<CalendarPeriod> internalGetValueMap() {
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
    public static CalendarPeriod valueOf(int i2) {
        return forNumber(i2);
    }
}
