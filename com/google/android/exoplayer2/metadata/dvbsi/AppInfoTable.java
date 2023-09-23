package com.google.android.exoplayer2.metadata.dvbsi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Objects;

/* loaded from: classes.dex */
public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator<AppInfoTable> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final int f771f;

    /* renamed from: g  reason: collision with root package name */
    public final String f772g;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<AppInfoTable> {
        @Override // android.os.Parcelable.Creator
        public AppInfoTable createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            Objects.requireNonNull(readString);
            return new AppInfoTable(parcel.readInt(), readString);
        }

        @Override // android.os.Parcelable.Creator
        public AppInfoTable[] newArray(int i2) {
            return new AppInfoTable[i2];
        }
    }

    public AppInfoTable(int i2, String str) {
        this.f771f = i2;
        this.f772g = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] g0() {
        return f.h.b.b.a2.a.a(this);
    }

    public String toString() {
        int i2 = this.f771f;
        String str = this.f772g;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
        sb.append("Ait(controlCode=");
        sb.append(i2);
        sb.append(",url=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ Format v() {
        return f.h.b.b.a2.a.b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f772g);
        parcel.writeInt(this.f771f);
    }
}
