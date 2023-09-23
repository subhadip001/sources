package com.video_converter.video_compressor.screens.videoCompressorScreen.spinnerListItem;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class Item implements Parcelable {
    public static final Parcelable.Creator<Item> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public String f1395f;

    /* renamed from: g  reason: collision with root package name */
    public String f1396g;

    /* renamed from: h  reason: collision with root package name */
    public String f1397h;

    /* renamed from: i  reason: collision with root package name */
    public String f1398i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1399j;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<Item> {
        @Override // android.os.Parcelable.Creator
        public Item createFromParcel(Parcel parcel) {
            return new Item(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Item[] newArray(int i2) {
            return new Item[i2];
        }
    }

    public Item(String str, boolean z) {
        this.f1395f = str;
        this.f1399j = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1395f);
        parcel.writeString(this.f1396g);
        parcel.writeString(this.f1397h);
        parcel.writeString(this.f1398i);
        parcel.writeInt(this.f1399j ? 1 : 0);
    }

    public Item(String str, String str2) {
        this.f1395f = str;
        this.f1396g = str2;
    }

    public Item(String str, String str2, boolean z) {
        this.f1395f = str;
        this.f1396g = str2;
        this.f1399j = z;
    }

    public Item(String str, String str2, String str3, boolean z) {
        this.f1395f = str;
        this.f1396g = str2;
        this.f1398i = str3;
        this.f1399j = z;
    }

    public Item(String str, String str2, String str3) {
        this.f1395f = str;
        this.f1396g = null;
        this.f1397h = str3;
    }

    public Item(Parcel parcel) {
        this.f1395f = parcel.readString();
        this.f1396g = parcel.readString();
        this.f1397h = parcel.readString();
        this.f1398i = parcel.readString();
        this.f1399j = parcel.readInt() == 1;
    }
}
