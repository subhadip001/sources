package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import f.h.b.b.g2.b0;

/* loaded from: classes.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    public final String f824g;

    /* renamed from: h  reason: collision with root package name */
    public final String f825h;

    /* renamed from: i  reason: collision with root package name */
    public final String f826i;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<InternalFrame> {
        @Override // android.os.Parcelable.Creator
        public InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public InternalFrame[] newArray(int i2) {
            return new InternalFrame[i2];
        }
    }

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.f824g = str;
        this.f825h = str2;
        this.f826i = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        return b0.a(this.f825h, internalFrame.f825h) && b0.a(this.f824g, internalFrame.f824g) && b0.a(this.f826i, internalFrame.f826i);
    }

    public int hashCode() {
        String str = this.f824g;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f825h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f826i;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f823f;
        String str2 = this.f824g;
        String str3 = this.f825h;
        StringBuilder z = f.a.b.a.a.z(f.a.b.a.a.x(str3, f.a.b.a.a.x(str2, f.a.b.a.a.x(str, 23))), str, ": domain=", str2, ", description=");
        z.append(str3);
        return z.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f823f);
        parcel.writeString(this.f824g);
        parcel.writeString(this.f826i);
    }

    public InternalFrame(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i2 = b0.a;
        this.f824g = readString;
        this.f825h = parcel.readString();
        this.f826i = parcel.readString();
    }
}
