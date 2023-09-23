package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import e.c0.b;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final b f591f;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<ParcelImpl> {
        @Override // android.os.Parcelable.Creator
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelImpl[] newArray(int i2) {
            return new ParcelImpl[i2];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.f591f = new e.c0.a(parcel).o();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        new e.c0.a(parcel).w(this.f591f);
    }
}
