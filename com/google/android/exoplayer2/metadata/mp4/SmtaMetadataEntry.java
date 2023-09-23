package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;

/* loaded from: classes.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final float f851f;

    /* renamed from: g  reason: collision with root package name */
    public final int f852g;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<SmtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public SmtaMetadataEntry createFromParcel(Parcel parcel) {
            return new SmtaMetadataEntry(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        public SmtaMetadataEntry[] newArray(int i2) {
            return new SmtaMetadataEntry[i2];
        }
    }

    public SmtaMetadataEntry(float f2, int i2) {
        this.f851f = f2;
        this.f852g = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SmtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        return this.f851f == smtaMetadataEntry.f851f && this.f852g == smtaMetadataEntry.f852g;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] g0() {
        return f.h.b.b.a2.a.a(this);
    }

    public int hashCode() {
        return ((527 + Float.valueOf(this.f851f).hashCode()) * 31) + this.f852g;
    }

    public String toString() {
        float f2 = this.f851f;
        int i2 = this.f852g;
        StringBuilder sb = new StringBuilder(73);
        sb.append("smta: captureFrameRate=");
        sb.append(f2);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ Format v() {
        return f.h.b.b.a2.a.b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(this.f851f);
        parcel.writeInt(this.f852g);
    }

    public SmtaMetadataEntry(Parcel parcel, a aVar) {
        this.f851f = parcel.readFloat();
        this.f852g = parcel.readInt();
    }
}
