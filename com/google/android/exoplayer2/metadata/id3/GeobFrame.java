package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import f.h.b.b.g2.b0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    public final String f819g;

    /* renamed from: h  reason: collision with root package name */
    public final String f820h;

    /* renamed from: i  reason: collision with root package name */
    public final String f821i;

    /* renamed from: j  reason: collision with root package name */
    public final byte[] f822j;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<GeobFrame> {
        @Override // android.os.Parcelable.Creator
        public GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public GeobFrame[] newArray(int i2) {
            return new GeobFrame[i2];
        }
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f819g = str;
        this.f820h = str2;
        this.f821i = str3;
        this.f822j = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return b0.a(this.f819g, geobFrame.f819g) && b0.a(this.f820h, geobFrame.f820h) && b0.a(this.f821i, geobFrame.f821i) && Arrays.equals(this.f822j, geobFrame.f822j);
    }

    public int hashCode() {
        String str = this.f819g;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f820h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f821i;
        return Arrays.hashCode(this.f822j) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f823f;
        String str2 = this.f819g;
        String str3 = this.f820h;
        String str4 = this.f821i;
        return f.a.b.a.a.v(f.a.b.a.a.z(f.a.b.a.a.x(str4, f.a.b.a.a.x(str3, f.a.b.a.a.x(str2, f.a.b.a.a.x(str, 36)))), str, ": mimeType=", str2, ", filename="), str3, ", description=", str4);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f819g);
        parcel.writeString(this.f820h);
        parcel.writeString(this.f821i);
        parcel.writeByteArray(this.f822j);
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i2 = b0.a;
        this.f819g = readString;
        this.f820h = parcel.readString();
        this.f821i = parcel.readString();
        this.f822j = parcel.createByteArray();
    }
}
