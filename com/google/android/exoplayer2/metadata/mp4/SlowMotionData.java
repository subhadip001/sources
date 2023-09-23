package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import f.h.b.b.e2.j;
import f.h.b.b.g2.b0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final List<Segment> f847f;

    /* loaded from: classes.dex */
    public static final class Segment implements Parcelable {
        public static final Parcelable.Creator<Segment> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        public final long f848f;

        /* renamed from: g  reason: collision with root package name */
        public final long f849g;

        /* renamed from: h  reason: collision with root package name */
        public final int f850h;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<Segment> {
            @Override // android.os.Parcelable.Creator
            public Segment createFromParcel(Parcel parcel) {
                return new Segment(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public Segment[] newArray(int i2) {
                return new Segment[i2];
            }
        }

        public Segment(long j2, long j3, int i2) {
            j.c(j2 < j3);
            this.f848f = j2;
            this.f849g = j3;
            this.f850h = i2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Segment.class != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            return this.f848f == segment.f848f && this.f849g == segment.f849g && this.f850h == segment.f850h;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f848f), Long.valueOf(this.f849g), Integer.valueOf(this.f850h)});
        }

        public String toString() {
            return b0.k("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f848f), Long.valueOf(this.f849g), Integer.valueOf(this.f850h));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeLong(this.f848f);
            parcel.writeLong(this.f849g);
            parcel.writeInt(this.f850h);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<SlowMotionData> {
        @Override // android.os.Parcelable.Creator
        public SlowMotionData createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Segment.class.getClassLoader());
            return new SlowMotionData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public SlowMotionData[] newArray(int i2) {
            return new SlowMotionData[i2];
        }
    }

    public SlowMotionData(List<Segment> list) {
        this.f847f = list;
        boolean z = false;
        if (!list.isEmpty()) {
            long j2 = list.get(0).f849g;
            int i2 = 1;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                } else if (list.get(i2).f848f < j2) {
                    z = true;
                    break;
                } else {
                    j2 = list.get(i2).f849g;
                    i2++;
                }
            }
        }
        j.c(!z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.f847f.equals(((SlowMotionData) obj).f847f);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] g0() {
        return f.h.b.b.a2.a.a(this);
    }

    public int hashCode() {
        return this.f847f.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f847f);
        StringBuilder sb = new StringBuilder(valueOf.length() + 21);
        sb.append("SlowMotion: segments=");
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ Format v() {
        return f.h.b.b.a2.a.b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeList(this.f847f);
    }
}
