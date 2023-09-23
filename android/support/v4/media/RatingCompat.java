package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final int f12f;

    /* renamed from: g  reason: collision with root package name */
    public final float f13g;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public RatingCompat[] newArray(int i2) {
            return new RatingCompat[i2];
        }
    }

    public RatingCompat(int i2, float f2) {
        this.f12f = i2;
        this.f13g = f2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f12f;
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("Rating:style=");
        A.append(this.f12f);
        A.append(" rating=");
        float f2 = this.f13g;
        A.append(f2 < 0.0f ? "unrated" : String.valueOf(f2));
        return A.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f12f);
        parcel.writeFloat(this.f13g);
    }
}
