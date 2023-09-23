package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    public final byte[] f804g;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<BinaryFrame> {
        @Override // android.os.Parcelable.Creator
        public BinaryFrame createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public BinaryFrame[] newArray(int i2) {
            return new BinaryFrame[i2];
        }
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f804g = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        return this.f823f.equals(binaryFrame.f823f) && Arrays.equals(this.f804g, binaryFrame.f804g);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f804g) + f.a.b.a.a.I(this.f823f, 527, 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f823f);
        parcel.writeByteArray(this.f804g);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BinaryFrame(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = f.h.b.b.g2.b0.a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.f804g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.BinaryFrame.<init>(android.os.Parcel):void");
    }
}
