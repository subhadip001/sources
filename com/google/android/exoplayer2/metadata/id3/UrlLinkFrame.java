package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import f.h.b.b.g2.b0;

/* loaded from: classes.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    public final String f836g;

    /* renamed from: h  reason: collision with root package name */
    public final String f837h;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<UrlLinkFrame> {
        @Override // android.os.Parcelable.Creator
        public UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public UrlLinkFrame[] newArray(int i2) {
            return new UrlLinkFrame[i2];
        }
    }

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.f836g = str2;
        this.f837h = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.f823f.equals(urlLinkFrame.f823f) && b0.a(this.f836g, urlLinkFrame.f836g) && b0.a(this.f837h, urlLinkFrame.f837h);
    }

    public int hashCode() {
        int I = f.a.b.a.a.I(this.f823f, 527, 31);
        String str = this.f836g;
        int hashCode = (I + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f837h;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f823f;
        String str2 = this.f837h;
        return f.a.b.a.a.g(f.a.b.a.a.x(str2, f.a.b.a.a.x(str, 6)), str, ": url=", str2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f823f);
        parcel.writeString(this.f836g);
        parcel.writeString(this.f837h);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public UrlLinkFrame(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = f.h.b.b.g2.b0.a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f836g = r0
            java.lang.String r3 = r3.readString()
            r2.f837h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.UrlLinkFrame.<init>(android.os.Parcel):void");
    }
}
