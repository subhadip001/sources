package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import f.h.b.b.e2.j;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class TrackGroup implements Parcelable {
    public static final Parcelable.Creator<TrackGroup> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final int f875f;

    /* renamed from: g  reason: collision with root package name */
    public final Format[] f876g;

    /* renamed from: h  reason: collision with root package name */
    public int f877h;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<TrackGroup> {
        @Override // android.os.Parcelable.Creator
        public TrackGroup createFromParcel(Parcel parcel) {
            return new TrackGroup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public TrackGroup[] newArray(int i2) {
            return new TrackGroup[i2];
        }
    }

    public TrackGroup(Format... formatArr) {
        j.g(formatArr.length > 0);
        this.f876g = formatArr;
        this.f875f = formatArr.length;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroup.class != obj.getClass()) {
            return false;
        }
        TrackGroup trackGroup = (TrackGroup) obj;
        return this.f875f == trackGroup.f875f && Arrays.equals(this.f876g, trackGroup.f876g);
    }

    public int hashCode() {
        if (this.f877h == 0) {
            this.f877h = 527 + Arrays.hashCode(this.f876g);
        }
        return this.f877h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f875f);
        for (int i3 = 0; i3 < this.f875f; i3++) {
            parcel.writeParcelable(this.f876g[i3], 0);
        }
    }

    public TrackGroup(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f875f = readInt;
        this.f876g = new Format[readInt];
        for (int i2 = 0; i2 < this.f875f; i2++) {
            this.f876g[i2] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }
}
