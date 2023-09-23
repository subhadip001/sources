package com.video_converter.video_compressor.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public abstract class MediaFile implements Parcelable {

    /* renamed from: f  reason: collision with root package name */
    public String f1368f;

    /* renamed from: g  reason: collision with root package name */
    public String f1369g;

    /* renamed from: h  reason: collision with root package name */
    public String f1370h;

    /* renamed from: i  reason: collision with root package name */
    public String f1371i;

    /* renamed from: j  reason: collision with root package name */
    public Uri f1372j;

    /* renamed from: k  reason: collision with root package name */
    public int f1373k;

    /* renamed from: l  reason: collision with root package name */
    public long f1374l;

    public MediaFile(String str, String str2, String str3, Uri uri, long j2) {
        this.f1370h = str;
        this.f1368f = str2;
        this.f1369g = str3;
        this.f1372j = uri;
        this.f1374l = j2;
    }

    public String b() {
        try {
            int lastIndexOf = this.f1368f.lastIndexOf(47) + 1;
            int lastIndexOf2 = this.f1368f.lastIndexOf(46);
            String str = this.f1368f;
            if (lastIndexOf <= 0) {
                lastIndexOf = 0;
            }
            if (lastIndexOf2 <= 0) {
                lastIndexOf2 = str.length();
            }
            return str.substring(lastIndexOf, lastIndexOf2);
        } catch (Exception unused) {
            return this.f1368f;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1368f);
        parcel.writeString(this.f1369g);
        parcel.writeString(this.f1370h);
        parcel.writeParcelable(this.f1372j, i2);
        parcel.writeInt(this.f1373k);
        parcel.writeLong(this.f1374l);
    }

    public MediaFile(Parcel parcel) {
        this.f1368f = parcel.readString();
        this.f1369g = parcel.readString();
        this.f1370h = parcel.readString();
        this.f1372j = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f1373k = parcel.readInt();
        this.f1374l = parcel.readLong();
    }
}
