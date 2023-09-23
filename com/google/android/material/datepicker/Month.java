package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import f.h.b.c.n.x;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final Calendar f1155f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1156g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1157h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1158i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1159j;

    /* renamed from: k  reason: collision with root package name */
    public final long f1160k;

    /* renamed from: l  reason: collision with root package name */
    public String f1161l;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<Month> {
        @Override // android.os.Parcelable.Creator
        public Month createFromParcel(Parcel parcel) {
            return Month.f(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public Month[] newArray(int i2) {
            return new Month[i2];
        }
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b = x.b(calendar);
        this.f1155f = b;
        this.f1156g = b.get(2);
        this.f1157h = b.get(1);
        this.f1158i = b.getMaximum(7);
        this.f1159j = b.getActualMaximum(5);
        this.f1160k = b.getTimeInMillis();
    }

    public static Month f(int i2, int i3) {
        Calendar e2 = x.e();
        e2.set(1, i2);
        e2.set(2, i3);
        return new Month(e2);
    }

    public static Month g(long j2) {
        Calendar e2 = x.e();
        e2.setTimeInMillis(j2);
        return new Month(e2);
    }

    @Override // java.lang.Comparable
    /* renamed from: d */
    public int compareTo(Month month) {
        return this.f1155f.compareTo(month.f1155f);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Month) {
            Month month = (Month) obj;
            return this.f1156g == month.f1156g && this.f1157h == month.f1157h;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1156g), Integer.valueOf(this.f1157h)});
    }

    public int i() {
        int firstDayOfWeek = this.f1155f.get(7) - this.f1155f.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f1158i : firstDayOfWeek;
    }

    public String j() {
        if (this.f1161l == null) {
            this.f1161l = DateUtils.formatDateTime(null, this.f1155f.getTimeInMillis(), 8228);
        }
        return this.f1161l;
    }

    public Month k(int i2) {
        Calendar b = x.b(this.f1155f);
        b.add(2, i2);
        return new Month(b);
    }

    public int m(Month month) {
        if (this.f1155f instanceof GregorianCalendar) {
            return (month.f1156g - this.f1156g) + ((month.f1157h - this.f1157h) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f1157h);
        parcel.writeInt(this.f1156g);
    }
}
