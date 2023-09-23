package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

/* loaded from: classes.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final long f1152f;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<DateValidatorPointForward> {
        @Override // android.os.Parcelable.Creator
        public DateValidatorPointForward createFromParcel(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        public DateValidatorPointForward[] newArray(int i2) {
            return new DateValidatorPointForward[i2];
        }
    }

    public DateValidatorPointForward(long j2) {
        this.f1152f = j2;
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean N(long j2) {
        return j2 >= this.f1152f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.f1152f == ((DateValidatorPointForward) obj).f1152f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f1152f)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f1152f);
    }

    public DateValidatorPointForward(long j2, a aVar) {
        this.f1152f = j2;
    }
}
