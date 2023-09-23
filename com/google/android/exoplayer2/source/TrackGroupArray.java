package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class TrackGroupArray implements Parcelable {

    /* renamed from: f  reason: collision with root package name */
    public final int f879f;

    /* renamed from: g  reason: collision with root package name */
    public final TrackGroup[] f880g;

    /* renamed from: h  reason: collision with root package name */
    public int f881h;

    /* renamed from: i  reason: collision with root package name */
    public static final TrackGroupArray f878i = new TrackGroupArray(new TrackGroup[0]);
    public static final Parcelable.Creator<TrackGroupArray> CREATOR = new a();

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<TrackGroupArray> {
        @Override // android.os.Parcelable.Creator
        public TrackGroupArray createFromParcel(Parcel parcel) {
            return new TrackGroupArray(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public TrackGroupArray[] newArray(int i2) {
            return new TrackGroupArray[i2];
        }
    }

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.f880g = trackGroupArr;
        this.f879f = trackGroupArr.length;
    }

    public int b(TrackGroup trackGroup) {
        for (int i2 = 0; i2 < this.f879f; i2++) {
            if (this.f880g[i2] == trackGroup) {
                return i2;
            }
        }
        return -1;
    }

    public boolean c() {
        return this.f879f == 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroupArray.class != obj.getClass()) {
            return false;
        }
        TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
        return this.f879f == trackGroupArray.f879f && Arrays.equals(this.f880g, trackGroupArray.f880g);
    }

    public int hashCode() {
        if (this.f881h == 0) {
            this.f881h = Arrays.hashCode(this.f880g);
        }
        return this.f881h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f879f);
        for (int i3 = 0; i3 < this.f879f; i3++) {
            parcel.writeParcelable(this.f880g[i3], 0);
        }
    }

    public TrackGroupArray(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f879f = readInt;
        this.f880g = new TrackGroup[readInt];
        for (int i2 = 0; i2 < this.f879f; i2++) {
            this.f880g[i2] = (TrackGroup) parcel.readParcelable(TrackGroup.class.getClassLoader());
        }
    }
}
