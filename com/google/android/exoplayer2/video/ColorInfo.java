package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import f.h.b.b.g2.b0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ColorInfo implements Parcelable {
    public static final Parcelable.Creator<ColorInfo> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final int f1029f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1030g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1031h;

    /* renamed from: i  reason: collision with root package name */
    public final byte[] f1032i;

    /* renamed from: j  reason: collision with root package name */
    public int f1033j;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<ColorInfo> {
        @Override // android.os.Parcelable.Creator
        public ColorInfo createFromParcel(Parcel parcel) {
            return new ColorInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ColorInfo[] newArray(int i2) {
            return new ColorInfo[i2];
        }
    }

    public ColorInfo(int i2, int i3, int i4, byte[] bArr) {
        this.f1029f = i2;
        this.f1030g = i3;
        this.f1031h = i4;
        this.f1032i = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ColorInfo.class != obj.getClass()) {
            return false;
        }
        ColorInfo colorInfo = (ColorInfo) obj;
        return this.f1029f == colorInfo.f1029f && this.f1030g == colorInfo.f1030g && this.f1031h == colorInfo.f1031h && Arrays.equals(this.f1032i, colorInfo.f1032i);
    }

    public int hashCode() {
        if (this.f1033j == 0) {
            this.f1033j = Arrays.hashCode(this.f1032i) + ((((((527 + this.f1029f) * 31) + this.f1030g) * 31) + this.f1031h) * 31);
        }
        return this.f1033j;
    }

    public String toString() {
        int i2 = this.f1029f;
        int i3 = this.f1030g;
        int i4 = this.f1031h;
        boolean z = this.f1032i != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f1029f);
        parcel.writeInt(this.f1030g);
        parcel.writeInt(this.f1031h);
        int i3 = this.f1032i != null ? 1 : 0;
        int i4 = b0.a;
        parcel.writeInt(i3);
        byte[] bArr = this.f1032i;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public ColorInfo(Parcel parcel) {
        this.f1029f = parcel.readInt();
        this.f1030g = parcel.readInt();
        this.f1031h = parcel.readInt();
        int i2 = b0.a;
        this.f1032i = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}
