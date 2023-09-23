package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;

/* loaded from: classes.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final long f842f;

    /* renamed from: g  reason: collision with root package name */
    public final long f843g;

    /* renamed from: h  reason: collision with root package name */
    public final long f844h;

    /* renamed from: i  reason: collision with root package name */
    public final long f845i;

    /* renamed from: j  reason: collision with root package name */
    public final long f846j;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<MotionPhotoMetadata> {
        @Override // android.os.Parcelable.Creator
        public MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public MotionPhotoMetadata[] newArray(int i2) {
            return new MotionPhotoMetadata[i2];
        }
    }

    public MotionPhotoMetadata(long j2, long j3, long j4, long j5, long j6) {
        this.f842f = j2;
        this.f843g = j3;
        this.f844h = j4;
        this.f845i = j5;
        this.f846j = j6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MotionPhotoMetadata.class != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        return this.f842f == motionPhotoMetadata.f842f && this.f843g == motionPhotoMetadata.f843g && this.f844h == motionPhotoMetadata.f844h && this.f845i == motionPhotoMetadata.f845i && this.f846j == motionPhotoMetadata.f846j;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] g0() {
        return f.h.b.b.a2.a.a(this);
    }

    public int hashCode() {
        int t0 = f.h.b.c.a.t0(this.f843g);
        int t02 = f.h.b.c.a.t0(this.f844h);
        int t03 = f.h.b.c.a.t0(this.f845i);
        return f.h.b.c.a.t0(this.f846j) + ((t03 + ((t02 + ((t0 + ((f.h.b.c.a.t0(this.f842f) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        long j2 = this.f842f;
        long j3 = this.f843g;
        long j4 = this.f844h;
        long j5 = this.f845i;
        long j6 = this.f846j;
        StringBuilder sb = new StringBuilder(218);
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(j2);
        sb.append(", photoSize=");
        sb.append(j3);
        f.a.b.a.a.Q(sb, ", photoPresentationTimestampUs=", j4, ", videoStartPosition=");
        sb.append(j5);
        sb.append(", videoSize=");
        sb.append(j6);
        return sb.toString();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ Format v() {
        return f.h.b.b.a2.a.b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f842f);
        parcel.writeLong(this.f843g);
        parcel.writeLong(this.f844h);
        parcel.writeLong(this.f845i);
        parcel.writeLong(this.f846j);
    }

    public MotionPhotoMetadata(Parcel parcel, a aVar) {
        this.f842f = parcel.readLong();
        this.f843g = parcel.readLong();
        this.f844h = parcel.readLong();
        this.f845i = parcel.readLong();
        this.f846j = parcel.readLong();
    }
}
