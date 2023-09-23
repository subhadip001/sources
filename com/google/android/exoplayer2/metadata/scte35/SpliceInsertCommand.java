package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final long f856f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f857g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f858h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f859i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f860j;

    /* renamed from: k  reason: collision with root package name */
    public final long f861k;

    /* renamed from: l  reason: collision with root package name */
    public final long f862l;

    /* renamed from: m  reason: collision with root package name */
    public final List<b> f863m;
    public final boolean n;
    public final long o;
    public final int p;
    public final int q;
    public final int r;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<SpliceInsertCommand> {
        @Override // android.os.Parcelable.Creator
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public SpliceInsertCommand[] newArray(int i2) {
            return new SpliceInsertCommand[i2];
        }
    }

    public SpliceInsertCommand(long j2, boolean z, boolean z2, boolean z3, boolean z4, long j3, long j4, List<b> list, boolean z5, long j5, int i2, int i3, int i4) {
        this.f856f = j2;
        this.f857g = z;
        this.f858h = z2;
        this.f859i = z3;
        this.f860j = z4;
        this.f861k = j3;
        this.f862l = j4;
        this.f863m = Collections.unmodifiableList(list);
        this.n = z5;
        this.o = j5;
        this.p = i2;
        this.q = i3;
        this.r = i4;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f856f);
        parcel.writeByte(this.f857g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f858h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f859i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f860j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f861k);
        parcel.writeLong(this.f862l);
        int size = this.f863m.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.f863m.get(i3);
            parcel.writeInt(bVar.a);
            parcel.writeLong(bVar.b);
            parcel.writeLong(bVar.c);
        }
        parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final long b;
        public final long c;

        public b(int i2, long j2, long j3) {
            this.a = i2;
            this.b = j2;
            this.c = j3;
        }

        public b(int i2, long j2, long j3, a aVar) {
            this.a = i2;
            this.b = j2;
            this.c = j3;
        }
    }

    public SpliceInsertCommand(Parcel parcel, a aVar) {
        this.f856f = parcel.readLong();
        this.f857g = parcel.readByte() == 1;
        this.f858h = parcel.readByte() == 1;
        this.f859i = parcel.readByte() == 1;
        this.f860j = parcel.readByte() == 1;
        this.f861k = parcel.readLong();
        this.f862l = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(new b(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f863m = Collections.unmodifiableList(arrayList);
        this.n = parcel.readByte() == 1;
        this.o = parcel.readLong();
        this.p = parcel.readInt();
        this.q = parcel.readInt();
        this.r = parcel.readInt();
    }
}
