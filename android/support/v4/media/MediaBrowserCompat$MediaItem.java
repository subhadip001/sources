package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final int f0f;

    /* renamed from: g  reason: collision with root package name */
    public final MediaDescriptionCompat f1g;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        @Override // android.os.Parcelable.Creator
        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public MediaBrowserCompat$MediaItem[] newArray(int i2) {
            return new MediaBrowserCompat$MediaItem[i2];
        }
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f0f = parcel.readInt();
        this.f1g = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{mFlags=" + this.f0f + ", mDescription=" + this.f1g + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f0f);
        this.f1g.writeToParcel(parcel, i2);
    }
}
