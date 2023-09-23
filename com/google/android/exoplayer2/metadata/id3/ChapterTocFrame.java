package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import f.h.b.b.g2.b0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    public final String f811g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f812h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f813i;

    /* renamed from: j  reason: collision with root package name */
    public final String[] f814j;

    /* renamed from: k  reason: collision with root package name */
    public final Id3Frame[] f815k;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<ChapterTocFrame> {
        @Override // android.os.Parcelable.Creator
        public ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ChapterTocFrame[] newArray(int i2) {
            return new ChapterTocFrame[i2];
        }
    }

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f811g = str;
        this.f812h = z;
        this.f813i = z2;
        this.f814j = strArr;
        this.f815k = id3FrameArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.f812h == chapterTocFrame.f812h && this.f813i == chapterTocFrame.f813i && b0.a(this.f811g, chapterTocFrame.f811g) && Arrays.equals(this.f814j, chapterTocFrame.f814j) && Arrays.equals(this.f815k, chapterTocFrame.f815k);
    }

    public int hashCode() {
        int i2 = (((527 + (this.f812h ? 1 : 0)) * 31) + (this.f813i ? 1 : 0)) * 31;
        String str = this.f811g;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f811g);
        parcel.writeByte(this.f812h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f813i ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f814j);
        parcel.writeInt(this.f815k.length);
        for (Id3Frame id3Frame : this.f815k) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i2 = b0.a;
        this.f811g = readString;
        this.f812h = parcel.readByte() != 0;
        this.f813i = parcel.readByte() != 0;
        this.f814j = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f815k = new Id3Frame[readInt];
        for (int i3 = 0; i3 < readInt; i3++) {
            this.f815k[i3] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
