package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import f.h.b.b.g2.b0;

/* loaded from: classes.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    public final String f834g;

    /* renamed from: h  reason: collision with root package name */
    public final String f835h;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<TextInformationFrame> {
        @Override // android.os.Parcelable.Creator
        public TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public TextInformationFrame[] newArray(int i2) {
            return new TextInformationFrame[i2];
        }
    }

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.f834g = str2;
        this.f835h = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return this.f823f.equals(textInformationFrame.f823f) && b0.a(this.f834g, textInformationFrame.f834g) && b0.a(this.f835h, textInformationFrame.f835h);
    }

    public int hashCode() {
        int I = f.a.b.a.a.I(this.f823f, 527, 31);
        String str = this.f834g;
        int hashCode = (I + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f835h;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f823f;
        String str2 = this.f834g;
        String str3 = this.f835h;
        StringBuilder z = f.a.b.a.a.z(f.a.b.a.a.x(str3, f.a.b.a.a.x(str2, f.a.b.a.a.x(str, 22))), str, ": description=", str2, ": value=");
        z.append(str3);
        return z.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f823f);
        parcel.writeString(this.f834g);
        parcel.writeString(this.f835h);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextInformationFrame(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = f.h.b.b.g2.b0.a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f834g = r0
            java.lang.String r3 = r3.readString()
            r2.f835h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.TextInformationFrame.<init>(android.os.Parcel):void");
    }
}
