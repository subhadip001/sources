package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import f.h.b.b.g2.b0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    public final String f805g;

    /* renamed from: h  reason: collision with root package name */
    public final int f806h;

    /* renamed from: i  reason: collision with root package name */
    public final int f807i;

    /* renamed from: j  reason: collision with root package name */
    public final long f808j;

    /* renamed from: k  reason: collision with root package name */
    public final long f809k;

    /* renamed from: l  reason: collision with root package name */
    public final Id3Frame[] f810l;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<ChapterFrame> {
        @Override // android.os.Parcelable.Creator
        public ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ChapterFrame[] newArray(int i2) {
            return new ChapterFrame[i2];
        }
    }

    public ChapterFrame(String str, int i2, int i3, long j2, long j3, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f805g = str;
        this.f806h = i2;
        this.f807i = i3;
        this.f808j = j2;
        this.f809k = j3;
        this.f810l = id3FrameArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        return this.f806h == chapterFrame.f806h && this.f807i == chapterFrame.f807i && this.f808j == chapterFrame.f808j && this.f809k == chapterFrame.f809k && b0.a(this.f805g, chapterFrame.f805g) && Arrays.equals(this.f810l, chapterFrame.f810l);
    }

    public int hashCode() {
        int i2 = (((((((527 + this.f806h) * 31) + this.f807i) * 31) + ((int) this.f808j)) * 31) + ((int) this.f809k)) * 31;
        String str = this.f805g;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f805g);
        parcel.writeInt(this.f806h);
        parcel.writeInt(this.f807i);
        parcel.writeLong(this.f808j);
        parcel.writeLong(this.f809k);
        parcel.writeInt(this.f810l.length);
        for (Id3Frame id3Frame : this.f810l) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i2 = b0.a;
        this.f805g = readString;
        this.f806h = parcel.readInt();
        this.f807i = parcel.readInt();
        this.f808j = parcel.readLong();
        this.f809k = parcel.readLong();
        int readInt = parcel.readInt();
        this.f810l = new Id3Frame[readInt];
        for (int i3 = 0; i3 < readInt; i3++) {
            this.f810l[i3] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
