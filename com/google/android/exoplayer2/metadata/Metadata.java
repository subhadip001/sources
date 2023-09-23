package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import f.h.b.b.g2.b0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final Entry[] f770f;

    /* loaded from: classes.dex */
    public interface Entry extends Parcelable {
        byte[] g0();

        Format v();
    }

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<Metadata> {
        @Override // android.os.Parcelable.Creator
        public Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Metadata[] newArray(int i2) {
            return new Metadata[i2];
        }
    }

    public Metadata(Entry... entryArr) {
        this.f770f = entryArr;
    }

    public Metadata b(Entry... entryArr) {
        if (entryArr.length == 0) {
            return this;
        }
        Entry[] entryArr2 = this.f770f;
        int i2 = b0.a;
        Object[] copyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
        System.arraycopy(entryArr, 0, copyOf, entryArr2.length, entryArr.length);
        return new Metadata((Entry[]) copyOf);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f770f, ((Metadata) obj).f770f);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f770f);
    }

    public String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.f770f));
        return valueOf.length() != 0 ? "entries=".concat(valueOf) : new String("entries=");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f770f.length);
        for (Entry entry : this.f770f) {
            parcel.writeParcelable(entry, 0);
        }
    }

    public Metadata(List<? extends Entry> list) {
        this.f770f = (Entry[]) list.toArray(new Entry[0]);
    }

    public Metadata(Parcel parcel) {
        this.f770f = new Entry[parcel.readInt()];
        int i2 = 0;
        while (true) {
            Entry[] entryArr = this.f770f;
            if (i2 >= entryArr.length) {
                return;
            }
            entryArr[i2] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
            i2++;
        }
    }
}
