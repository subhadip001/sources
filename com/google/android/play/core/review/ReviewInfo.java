package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import f.h.b.d.a.g.b;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public abstract class ReviewInfo implements Parcelable {
    public static final Parcelable.Creator<ReviewInfo> CREATOR = new b();

    public abstract PendingIntent b();

    public abstract boolean c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(b(), 0);
        parcel.writeInt(c() ? 1 : 0);
    }
}
