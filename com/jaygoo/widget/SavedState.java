package com.jaygoo.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes2.dex */
public class SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<SavedState> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public float f1317f;

    /* renamed from: g  reason: collision with root package name */
    public float f1318g;

    /* renamed from: h  reason: collision with root package name */
    public float f1319h;

    /* renamed from: i  reason: collision with root package name */
    public int f1320i;

    /* renamed from: j  reason: collision with root package name */
    public float f1321j;

    /* renamed from: k  reason: collision with root package name */
    public float f1322k;

    /* loaded from: classes2.dex */
    public static class a implements Parcelable.Creator<SavedState> {
        @Override // android.os.Parcelable.Creator
        public SavedState createFromParcel(Parcel parcel) {
            return new SavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public SavedState[] newArray(int i2) {
            return new SavedState[i2];
        }
    }

    public SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeFloat(this.f1317f);
        parcel.writeFloat(this.f1318g);
        parcel.writeFloat(this.f1319h);
        parcel.writeInt(this.f1320i);
        parcel.writeFloat(this.f1321j);
        parcel.writeFloat(this.f1322k);
    }

    public SavedState(Parcel parcel, a aVar) {
        super(parcel);
        this.f1317f = parcel.readFloat();
        this.f1318g = parcel.readFloat();
        this.f1319h = parcel.readFloat();
        this.f1320i = parcel.readInt();
        this.f1321j = parcel.readFloat();
        this.f1322k = parcel.readFloat();
    }
}
