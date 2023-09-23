package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class SpliceNullCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceNullCommand> CREATOR = new a();

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<SpliceNullCommand> {
        @Override // android.os.Parcelable.Creator
        public SpliceNullCommand createFromParcel(Parcel parcel) {
            return new SpliceNullCommand();
        }

        @Override // android.os.Parcelable.Creator
        public SpliceNullCommand[] newArray(int i2) {
            return new SpliceNullCommand[i2];
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }
}
