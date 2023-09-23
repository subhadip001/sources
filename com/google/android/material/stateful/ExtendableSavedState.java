package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import e.f.h;

/* loaded from: classes.dex */
public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    public final h<String, Bundle> f1192h;

    /* loaded from: classes.dex */
    public class a implements Parcelable.ClassLoaderCreator<ExtendableSavedState> {
        @Override // android.os.Parcelable.ClassLoaderCreator
        public ExtendableSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i2) {
            return new ExtendableSavedState[i2];
        }

        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new ExtendableSavedState(parcel, null, null);
        }
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f1192h = new h<>();
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("ExtendableSavedState{");
        A.append(Integer.toHexString(System.identityHashCode(this)));
        A.append(" states=");
        A.append(this.f1192h);
        A.append("}");
        return A.toString();
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f348f, i2);
        int i3 = this.f1192h.f2001h;
        parcel.writeInt(i3);
        String[] strArr = new String[i3];
        Bundle[] bundleArr = new Bundle[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            strArr[i4] = this.f1192h.h(i4);
            bundleArr[i4] = this.f1192h.l(i4);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcel parcel, ClassLoader classLoader, a aVar) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f1192h = new h<>(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f1192h.put(strArr[i2], bundleArr[i2]);
        }
    }
}
