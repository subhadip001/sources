package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import f.h.b.b.g2.b0;
import f.h.b.b.h0;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final SchemeData[] f758f;

    /* renamed from: g  reason: collision with root package name */
    public int f759g;

    /* renamed from: h  reason: collision with root package name */
    public final String f760h;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<DrmInitData> {
        @Override // android.os.Parcelable.Creator
        public DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public DrmInitData[] newArray(int i2) {
            return new DrmInitData[i2];
        }
    }

    public DrmInitData(String str, boolean z, SchemeData... schemeDataArr) {
        this.f760h = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f758f = schemeDataArr;
        int length = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public DrmInitData b(String str) {
        return b0.a(this.f760h, str) ? this : new DrmInitData(str, false, this.f758f);
    }

    @Override // java.util.Comparator
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = h0.a;
        if (uuid.equals(schemeData3.f762g)) {
            return uuid.equals(schemeData4.f762g) ? 0 : 1;
        }
        return schemeData3.f762g.compareTo(schemeData4.f762g);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        return b0.a(this.f760h, drmInitData.f760h) && Arrays.equals(this.f758f, drmInitData.f758f);
    }

    public int hashCode() {
        if (this.f759g == 0) {
            String str = this.f760h;
            this.f759g = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f758f);
        }
        return this.f759g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f760h);
        parcel.writeTypedArray(this.f758f, 0);
    }

    /* loaded from: classes.dex */
    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        public int f761f;

        /* renamed from: g  reason: collision with root package name */
        public final UUID f762g;

        /* renamed from: h  reason: collision with root package name */
        public final String f763h;

        /* renamed from: i  reason: collision with root package name */
        public final String f764i;

        /* renamed from: j  reason: collision with root package name */
        public final byte[] f765j;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<SchemeData> {
            @Override // android.os.Parcelable.Creator
            public SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SchemeData[] newArray(int i2) {
                return new SchemeData[i2];
            }
        }

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            Objects.requireNonNull(uuid);
            this.f762g = uuid;
            this.f763h = null;
            this.f764i = str;
            this.f765j = bArr;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (obj instanceof SchemeData) {
                if (obj == this) {
                    return true;
                }
                SchemeData schemeData = (SchemeData) obj;
                return b0.a(this.f763h, schemeData.f763h) && b0.a(this.f764i, schemeData.f764i) && b0.a(this.f762g, schemeData.f762g) && Arrays.equals(this.f765j, schemeData.f765j);
            }
            return false;
        }

        public int hashCode() {
            if (this.f761f == 0) {
                int hashCode = this.f762g.hashCode() * 31;
                String str = this.f763h;
                this.f761f = Arrays.hashCode(this.f765j) + f.a.b.a.a.I(this.f764i, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }
            return this.f761f;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeLong(this.f762g.getMostSignificantBits());
            parcel.writeLong(this.f762g.getLeastSignificantBits());
            parcel.writeString(this.f763h);
            parcel.writeString(this.f764i);
            parcel.writeByteArray(this.f765j);
        }

        public SchemeData(Parcel parcel) {
            this.f762g = new UUID(parcel.readLong(), parcel.readLong());
            this.f763h = parcel.readString();
            String readString = parcel.readString();
            int i2 = b0.a;
            this.f764i = readString;
            this.f765j = parcel.createByteArray();
        }
    }

    public DrmInitData(Parcel parcel) {
        this.f760h = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        int i2 = b0.a;
        this.f758f = schemeDataArr;
        int length = schemeDataArr.length;
    }
}
