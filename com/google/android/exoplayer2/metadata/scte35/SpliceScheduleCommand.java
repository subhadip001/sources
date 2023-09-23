package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final List<c> f864f;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<SpliceScheduleCommand> {
        @Override // android.os.Parcelable.Creator
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public SpliceScheduleCommand[] newArray(int i2) {
            return new SpliceScheduleCommand[i2];
        }
    }

    public SpliceScheduleCommand(List<c> list) {
        this.f864f = Collections.unmodifiableList(list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int size = this.f864f.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            c cVar = this.f864f.get(i3);
            parcel.writeLong(cVar.a);
            parcel.writeByte(cVar.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.f865d ? (byte) 1 : (byte) 0);
            int size2 = cVar.f867f.size();
            parcel.writeInt(size2);
            for (int i4 = 0; i4 < size2; i4++) {
                b bVar = cVar.f867f.get(i4);
                parcel.writeInt(bVar.a);
                parcel.writeLong(bVar.b);
            }
            parcel.writeLong(cVar.f866e);
            parcel.writeByte(cVar.f868g ? (byte) 1 : (byte) 0);
            parcel.writeLong(cVar.f869h);
            parcel.writeInt(cVar.f870i);
            parcel.writeInt(cVar.f871j);
            parcel.writeInt(cVar.f872k);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final long b;

        public b(int i2, long j2) {
            this.a = i2;
            this.b = j2;
        }

        public b(int i2, long j2, a aVar) {
            this.a = i2;
            this.b = j2;
        }
    }

    public SpliceScheduleCommand(Parcel parcel, a aVar) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(new c(parcel));
        }
        this.f864f = Collections.unmodifiableList(arrayList);
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final long a;
        public final boolean b;
        public final boolean c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f865d;

        /* renamed from: e  reason: collision with root package name */
        public final long f866e;

        /* renamed from: f  reason: collision with root package name */
        public final List<b> f867f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f868g;

        /* renamed from: h  reason: collision with root package name */
        public final long f869h;

        /* renamed from: i  reason: collision with root package name */
        public final int f870i;

        /* renamed from: j  reason: collision with root package name */
        public final int f871j;

        /* renamed from: k  reason: collision with root package name */
        public final int f872k;

        public c(long j2, boolean z, boolean z2, boolean z3, List<b> list, long j3, boolean z4, long j4, int i2, int i3, int i4) {
            this.a = j2;
            this.b = z;
            this.c = z2;
            this.f865d = z3;
            this.f867f = Collections.unmodifiableList(list);
            this.f866e = j3;
            this.f868g = z4;
            this.f869h = j4;
            this.f870i = i2;
            this.f871j = i3;
            this.f872k = i4;
        }

        public c(Parcel parcel) {
            this.a = parcel.readLong();
            this.b = parcel.readByte() == 1;
            this.c = parcel.readByte() == 1;
            this.f865d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i2 = 0; i2 < readInt; i2++) {
                arrayList.add(new b(parcel.readInt(), parcel.readLong()));
            }
            this.f867f = Collections.unmodifiableList(arrayList);
            this.f866e = parcel.readLong();
            this.f868g = parcel.readByte() == 1;
            this.f869h = parcel.readLong();
            this.f870i = parcel.readInt();
            this.f871j = parcel.readInt();
            this.f872k = parcel.readInt();
        }
    }
}
