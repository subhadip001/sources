package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import f.h.b.b.g2.b0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final String f838f;

    /* renamed from: g  reason: collision with root package name */
    public final byte[] f839g;

    /* renamed from: h  reason: collision with root package name */
    public final int f840h;

    /* renamed from: i  reason: collision with root package name */
    public final int f841i;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<MdtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public MdtaMetadataEntry[] newArray(int i2) {
            return new MdtaMetadataEntry[i2];
        }
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i2, int i3) {
        this.f838f = str;
        this.f839g = bArr;
        this.f840h = i2;
        this.f841i = i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        return this.f838f.equals(mdtaMetadataEntry.f838f) && Arrays.equals(this.f839g, mdtaMetadataEntry.f839g) && this.f840h == mdtaMetadataEntry.f840h && this.f841i == mdtaMetadataEntry.f841i;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] g0() {
        return f.h.b.b.a2.a.a(this);
    }

    public int hashCode() {
        return ((((Arrays.hashCode(this.f839g) + f.a.b.a.a.I(this.f838f, 527, 31)) * 31) + this.f840h) * 31) + this.f841i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f838f);
        return valueOf.length() != 0 ? "mdta: key=".concat(valueOf) : new String("mdta: key=");
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ Format v() {
        return f.h.b.b.a2.a.b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f838f);
        parcel.writeByteArray(this.f839g);
        parcel.writeInt(this.f840h);
        parcel.writeInt(this.f841i);
    }

    public MdtaMetadataEntry(Parcel parcel, a aVar) {
        String readString = parcel.readString();
        int i2 = b0.a;
        this.f838f = readString;
        this.f839g = parcel.createByteArray();
        this.f840h = parcel.readInt();
        this.f841i = parcel.readInt();
    }
}
