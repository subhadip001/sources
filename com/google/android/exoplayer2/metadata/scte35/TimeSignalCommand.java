package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import f.h.b.b.g2.t;

/* loaded from: classes.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final long f873f;

    /* renamed from: g  reason: collision with root package name */
    public final long f874g;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<TimeSignalCommand> {
        @Override // android.os.Parcelable.Creator
        public TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        public TimeSignalCommand[] newArray(int i2) {
            return new TimeSignalCommand[i2];
        }
    }

    public TimeSignalCommand(long j2, long j3) {
        this.f873f = j2;
        this.f874g = j3;
    }

    public static long b(t tVar, long j2) {
        long r = tVar.r();
        if ((128 & r) != 0) {
            return 8589934591L & ((((r & 1) << 32) | tVar.s()) + j2);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f873f);
        parcel.writeLong(this.f874g);
    }

    public TimeSignalCommand(long j2, long j3, a aVar) {
        this.f873f = j2;
        this.f874g = j3;
    }
}
