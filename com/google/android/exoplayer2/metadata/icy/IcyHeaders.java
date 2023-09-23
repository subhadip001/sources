package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import f.h.b.b.e2.j;
import f.h.b.b.g2.b0;

/* loaded from: classes.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final int f791f;

    /* renamed from: g  reason: collision with root package name */
    public final String f792g;

    /* renamed from: h  reason: collision with root package name */
    public final String f793h;

    /* renamed from: i  reason: collision with root package name */
    public final String f794i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f795j;

    /* renamed from: k  reason: collision with root package name */
    public final int f796k;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<IcyHeaders> {
        @Override // android.os.Parcelable.Creator
        public IcyHeaders createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public IcyHeaders[] newArray(int i2) {
            return new IcyHeaders[i2];
        }
    }

    public IcyHeaders(int i2, String str, String str2, String str3, boolean z, int i3) {
        j.c(i3 == -1 || i3 > 0);
        this.f791f = i2;
        this.f792g = str;
        this.f793h = str2;
        this.f794i = str3;
        this.f795j = z;
        this.f796k = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.metadata.icy.IcyHeaders b(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.icy.IcyHeaders.b(java.util.Map):com.google.android.exoplayer2.metadata.icy.IcyHeaders");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        return this.f791f == icyHeaders.f791f && b0.a(this.f792g, icyHeaders.f792g) && b0.a(this.f793h, icyHeaders.f793h) && b0.a(this.f794i, icyHeaders.f794i) && this.f795j == icyHeaders.f795j && this.f796k == icyHeaders.f796k;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] g0() {
        return f.h.b.b.a2.a.a(this);
    }

    public int hashCode() {
        int i2 = (527 + this.f791f) * 31;
        String str = this.f792g;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f793h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f794i;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f795j ? 1 : 0)) * 31) + this.f796k;
    }

    public String toString() {
        String str = this.f793h;
        String str2 = this.f792g;
        int i2 = this.f791f;
        int i3 = this.f796k;
        StringBuilder z = f.a.b.a.a.z(f.a.b.a.a.x(str2, f.a.b.a.a.x(str, 80)), "IcyHeaders: name=\"", str, "\", genre=\"", str2);
        z.append("\", bitrate=");
        z.append(i2);
        z.append(", metadataInterval=");
        z.append(i3);
        return z.toString();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ Format v() {
        return f.h.b.b.a2.a.b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f791f);
        parcel.writeString(this.f792g);
        parcel.writeString(this.f793h);
        parcel.writeString(this.f794i);
        boolean z = this.f795j;
        int i3 = b0.a;
        parcel.writeInt(z ? 1 : 0);
        parcel.writeInt(this.f796k);
    }

    public IcyHeaders(Parcel parcel) {
        this.f791f = parcel.readInt();
        this.f792g = parcel.readString();
        this.f793h = parcel.readString();
        this.f794i = parcel.readString();
        int i2 = b0.a;
        this.f795j = parcel.readInt() != 0;
        this.f796k = parcel.readInt();
    }
}
