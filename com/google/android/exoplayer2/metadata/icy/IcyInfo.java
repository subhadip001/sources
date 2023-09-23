package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f797f;

    /* renamed from: g  reason: collision with root package name */
    public final String f798g;

    /* renamed from: h  reason: collision with root package name */
    public final String f799h;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<IcyInfo> {
        @Override // android.os.Parcelable.Creator
        public IcyInfo createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public IcyInfo[] newArray(int i2) {
            return new IcyInfo[i2];
        }
    }

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.f797f = bArr;
        this.f798g = str;
        this.f799h = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f797f, ((IcyInfo) obj).f797f);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] g0() {
        return f.h.b.b.a2.a.a(this);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f797f);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f798g, this.f799h, Integer.valueOf(this.f797f.length));
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ Format v() {
        return f.h.b.b.a2.a.b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByteArray(this.f797f);
        parcel.writeString(this.f798g);
        parcel.writeString(this.f799h);
    }

    public IcyInfo(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        Objects.requireNonNull(createByteArray);
        this.f797f = createByteArray;
        this.f798g = parcel.readString();
        this.f799h = parcel.readString();
    }
}
