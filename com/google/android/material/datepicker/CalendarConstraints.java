package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import f.h.b.c.n.x;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final Month f1143f;

    /* renamed from: g  reason: collision with root package name */
    public final Month f1144g;

    /* renamed from: h  reason: collision with root package name */
    public final DateValidator f1145h;

    /* renamed from: i  reason: collision with root package name */
    public Month f1146i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1147j;

    /* renamed from: k  reason: collision with root package name */
    public final int f1148k;

    /* loaded from: classes.dex */
    public interface DateValidator extends Parcelable {
        boolean N(long j2);
    }

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<CalendarConstraints> {
        @Override // android.os.Parcelable.Creator
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        public CalendarConstraints[] newArray(int i2) {
            return new CalendarConstraints[i2];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        public static final long f1149e = x.a(Month.f(1900, 0).f1160k);

        /* renamed from: f  reason: collision with root package name */
        public static final long f1150f = x.a(Month.f(2100, 11).f1160k);
        public long a;
        public long b;
        public Long c;

        /* renamed from: d  reason: collision with root package name */
        public DateValidator f1151d;

        public b(CalendarConstraints calendarConstraints) {
            this.a = f1149e;
            this.b = f1150f;
            this.f1151d = new DateValidatorPointForward(Long.MIN_VALUE);
            this.a = calendarConstraints.f1143f.f1160k;
            this.b = calendarConstraints.f1144g.f1160k;
            this.c = Long.valueOf(calendarConstraints.f1146i.f1160k);
            this.f1151d = calendarConstraints.f1145h;
        }
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, a aVar) {
        this.f1143f = month;
        this.f1144g = month2;
        this.f1146i = month3;
        this.f1145h = dateValidator;
        if (month3 != null && month.f1155f.compareTo(month3.f1155f) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.f1155f.compareTo(month2.f1155f) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f1148k = month.m(month2) + 1;
        this.f1147j = (month2.f1157h - month.f1157h) + 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CalendarConstraints) {
            CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
            return this.f1143f.equals(calendarConstraints.f1143f) && this.f1144g.equals(calendarConstraints.f1144g) && Objects.equals(this.f1146i, calendarConstraints.f1146i) && this.f1145h.equals(calendarConstraints.f1145h);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1143f, this.f1144g, this.f1146i, this.f1145h});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f1143f, 0);
        parcel.writeParcelable(this.f1144g, 0);
        parcel.writeParcelable(this.f1146i, 0);
        parcel.writeParcelable(this.f1145h, 0);
    }
}
