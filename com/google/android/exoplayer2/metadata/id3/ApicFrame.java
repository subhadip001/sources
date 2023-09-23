package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import f.h.b.b.g2.b0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    public final String f800g;

    /* renamed from: h  reason: collision with root package name */
    public final String f801h;

    /* renamed from: i  reason: collision with root package name */
    public final int f802i;

    /* renamed from: j  reason: collision with root package name */
    public final byte[] f803j;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<ApicFrame> {
        @Override // android.os.Parcelable.Creator
        public ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ApicFrame[] newArray(int i2) {
            return new ApicFrame[i2];
        }
    }

    public ApicFrame(String str, String str2, int i2, byte[] bArr) {
        super("APIC");
        this.f800g = str;
        this.f801h = str2;
        this.f802i = i2;
        this.f803j = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.f802i == apicFrame.f802i && b0.a(this.f800g, apicFrame.f800g) && b0.a(this.f801h, apicFrame.f801h) && Arrays.equals(this.f803j, apicFrame.f803j);
    }

    public int hashCode() {
        int i2 = (527 + this.f802i) * 31;
        String str = this.f800g;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f801h;
        return Arrays.hashCode(this.f803j) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f823f;
        String str2 = this.f800g;
        String str3 = this.f801h;
        StringBuilder z = f.a.b.a.a.z(f.a.b.a.a.x(str3, f.a.b.a.a.x(str2, f.a.b.a.a.x(str, 25))), str, ": mimeType=", str2, ", description=");
        z.append(str3);
        return z.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f800g);
        parcel.writeString(this.f801h);
        parcel.writeInt(this.f802i);
        parcel.writeByteArray(this.f803j);
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i2 = b0.a;
        this.f800g = readString;
        this.f801h = parcel.readString();
        this.f802i = parcel.readInt();
        this.f803j = parcel.createByteArray();
    }
}
