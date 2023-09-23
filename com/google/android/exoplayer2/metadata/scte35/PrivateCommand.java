package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import f.h.b.b.g2.b0;

/* loaded from: classes.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final long f853f;

    /* renamed from: g  reason: collision with root package name */
    public final long f854g;

    /* renamed from: h  reason: collision with root package name */
    public final byte[] f855h;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<PrivateCommand> {
        @Override // android.os.Parcelable.Creator
        public PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public PrivateCommand[] newArray(int i2) {
            return new PrivateCommand[i2];
        }
    }

    public PrivateCommand(long j2, byte[] bArr, long j3) {
        this.f853f = j3;
        this.f854g = j2;
        this.f855h = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f853f);
        parcel.writeLong(this.f854g);
        parcel.writeByteArray(this.f855h);
    }

    public PrivateCommand(Parcel parcel, a aVar) {
        this.f853f = parcel.readLong();
        this.f854g = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i2 = b0.a;
        this.f855h = createByteArray;
    }
}
