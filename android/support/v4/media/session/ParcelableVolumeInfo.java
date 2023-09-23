package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public int f20f;

    /* renamed from: g  reason: collision with root package name */
    public int f21g;

    /* renamed from: h  reason: collision with root package name */
    public int f22h;

    /* renamed from: i  reason: collision with root package name */
    public int f23i;

    /* renamed from: j  reason: collision with root package name */
    public int f24j;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo[] newArray(int i2) {
            return new ParcelableVolumeInfo[i2];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f20f = parcel.readInt();
        this.f22h = parcel.readInt();
        this.f23i = parcel.readInt();
        this.f24j = parcel.readInt();
        this.f21g = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f20f);
        parcel.writeInt(this.f22h);
        parcel.writeInt(this.f23i);
        parcel.writeInt(this.f24j);
        parcel.writeInt(this.f21g);
    }
}
