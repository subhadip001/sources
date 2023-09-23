package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import f.h.b.b.g2.b0;

/* loaded from: classes.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    public final String f816g;

    /* renamed from: h  reason: collision with root package name */
    public final String f817h;

    /* renamed from: i  reason: collision with root package name */
    public final String f818i;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<CommentFrame> {
        @Override // android.os.Parcelable.Creator
        public CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public CommentFrame[] newArray(int i2) {
            return new CommentFrame[i2];
        }
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f816g = str;
        this.f817h = str2;
        this.f818i = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return b0.a(this.f817h, commentFrame.f817h) && b0.a(this.f816g, commentFrame.f816g) && b0.a(this.f818i, commentFrame.f818i);
    }

    public int hashCode() {
        String str = this.f816g;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f817h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f818i;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f823f;
        String str2 = this.f816g;
        String str3 = this.f817h;
        StringBuilder z = f.a.b.a.a.z(f.a.b.a.a.x(str3, f.a.b.a.a.x(str2, f.a.b.a.a.x(str, 25))), str, ": language=", str2, ", description=");
        z.append(str3);
        return z.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f823f);
        parcel.writeString(this.f816g);
        parcel.writeString(this.f818i);
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i2 = b0.a;
        this.f816g = readString;
        this.f817h = parcel.readString();
        this.f818i = parcel.readString();
    }
}
