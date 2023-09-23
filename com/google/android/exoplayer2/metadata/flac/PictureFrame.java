package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import f.h.b.b.g2.b0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final int f781f;

    /* renamed from: g  reason: collision with root package name */
    public final String f782g;

    /* renamed from: h  reason: collision with root package name */
    public final String f783h;

    /* renamed from: i  reason: collision with root package name */
    public final int f784i;

    /* renamed from: j  reason: collision with root package name */
    public final int f785j;

    /* renamed from: k  reason: collision with root package name */
    public final int f786k;

    /* renamed from: l  reason: collision with root package name */
    public final int f787l;

    /* renamed from: m  reason: collision with root package name */
    public final byte[] f788m;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<PictureFrame> {
        @Override // android.os.Parcelable.Creator
        public PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PictureFrame[] newArray(int i2) {
            return new PictureFrame[i2];
        }
    }

    public PictureFrame(int i2, String str, String str2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.f781f = i2;
        this.f782g = str;
        this.f783h = str2;
        this.f784i = i3;
        this.f785j = i4;
        this.f786k = i5;
        this.f787l = i6;
        this.f788m = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        return this.f781f == pictureFrame.f781f && this.f782g.equals(pictureFrame.f782g) && this.f783h.equals(pictureFrame.f783h) && this.f784i == pictureFrame.f784i && this.f785j == pictureFrame.f785j && this.f786k == pictureFrame.f786k && this.f787l == pictureFrame.f787l && Arrays.equals(this.f788m, pictureFrame.f788m);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] g0() {
        return f.h.b.b.a2.a.a(this);
    }

    public int hashCode() {
        int I = f.a.b.a.a.I(this.f782g, (this.f781f + 527) * 31, 31);
        return Arrays.hashCode(this.f788m) + ((((((((f.a.b.a.a.I(this.f783h, I, 31) + this.f784i) * 31) + this.f785j) * 31) + this.f786k) * 31) + this.f787l) * 31);
    }

    public String toString() {
        String str = this.f782g;
        String str2 = this.f783h;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str).length() + 32);
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ Format v() {
        return f.h.b.b.a2.a.b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f781f);
        parcel.writeString(this.f782g);
        parcel.writeString(this.f783h);
        parcel.writeInt(this.f784i);
        parcel.writeInt(this.f785j);
        parcel.writeInt(this.f786k);
        parcel.writeInt(this.f787l);
        parcel.writeByteArray(this.f788m);
    }

    public PictureFrame(Parcel parcel) {
        this.f781f = parcel.readInt();
        String readString = parcel.readString();
        int i2 = b0.a;
        this.f782g = readString;
        this.f783h = parcel.readString();
        this.f784i = parcel.readInt();
        this.f785j = parcel.readInt();
        this.f786k = parcel.readInt();
        this.f787l = parcel.readInt();
        this.f788m = parcel.createByteArray();
    }
}
