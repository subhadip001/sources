package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import f.h.b.b.g2.b0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    public final int f827g;

    /* renamed from: h  reason: collision with root package name */
    public final int f828h;

    /* renamed from: i  reason: collision with root package name */
    public final int f829i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f830j;

    /* renamed from: k  reason: collision with root package name */
    public final int[] f831k;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<MlltFrame> {
        @Override // android.os.Parcelable.Creator
        public MlltFrame createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public MlltFrame[] newArray(int i2) {
            return new MlltFrame[i2];
        }
    }

    public MlltFrame(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f827g = i2;
        this.f828h = i3;
        this.f829i = i4;
        this.f830j = iArr;
        this.f831k = iArr2;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        return this.f827g == mlltFrame.f827g && this.f828h == mlltFrame.f828h && this.f829i == mlltFrame.f829i && Arrays.equals(this.f830j, mlltFrame.f830j) && Arrays.equals(this.f831k, mlltFrame.f831k);
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.f830j);
        return Arrays.hashCode(this.f831k) + ((hashCode + ((((((527 + this.f827g) * 31) + this.f828h) * 31) + this.f829i) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f827g);
        parcel.writeInt(this.f828h);
        parcel.writeInt(this.f829i);
        parcel.writeIntArray(this.f830j);
        parcel.writeIntArray(this.f831k);
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f827g = parcel.readInt();
        this.f828h = parcel.readInt();
        this.f829i = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i2 = b0.a;
        this.f830j = createIntArray;
        this.f831k = parcel.createIntArray();
    }
}
