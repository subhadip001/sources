package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import f.h.b.b.g2.b0;

/* loaded from: classes.dex */
public final class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final String f789f;

    /* renamed from: g  reason: collision with root package name */
    public final String f790g;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<VorbisComment> {
        @Override // android.os.Parcelable.Creator
        public VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public VorbisComment[] newArray(int i2) {
            return new VorbisComment[i2];
        }
    }

    public VorbisComment(String str, String str2) {
        this.f789f = str;
        this.f790g = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || VorbisComment.class != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        return this.f789f.equals(vorbisComment.f789f) && this.f790g.equals(vorbisComment.f790g);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] g0() {
        return f.h.b.b.a2.a.a(this);
    }

    public int hashCode() {
        return this.f790g.hashCode() + f.a.b.a.a.I(this.f789f, 527, 31);
    }

    public String toString() {
        String str = this.f789f;
        String str2 = this.f790g;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str).length() + 5);
        sb.append("VC: ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ Format v() {
        return f.h.b.b.a2.a.b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f789f);
        parcel.writeString(this.f790g);
    }

    public VorbisComment(Parcel parcel) {
        String readString = parcel.readString();
        int i2 = b0.a;
        this.f789f = readString;
        this.f790g = parcel.readString();
    }
}
