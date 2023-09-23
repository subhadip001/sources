package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import f.h.b.b.g2.b0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    public final String f832g;

    /* renamed from: h  reason: collision with root package name */
    public final byte[] f833h;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<PrivFrame> {
        @Override // android.os.Parcelable.Creator
        public PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PrivFrame[] newArray(int i2) {
            return new PrivFrame[i2];
        }
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f832g = str;
        this.f833h = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return b0.a(this.f832g, privFrame.f832g) && Arrays.equals(this.f833h, privFrame.f833h);
    }

    public int hashCode() {
        String str = this.f832g;
        return Arrays.hashCode(this.f833h) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f823f;
        String str2 = this.f832g;
        return f.a.b.a.a.g(f.a.b.a.a.x(str2, f.a.b.a.a.x(str, 8)), str, ": owner=", str2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f832g);
        parcel.writeByteArray(this.f833h);
    }

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i2 = b0.a;
        this.f832g = readString;
        this.f833h = parcel.createByteArray();
    }
}
