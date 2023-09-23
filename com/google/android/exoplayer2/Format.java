package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import f.h.b.b.g2.b0;
import f.h.b.b.x1.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Format implements Parcelable {
    public static final Parcelable.Creator<Format> CREATOR = new a();
    public final byte[] A;
    public final int B;
    public final ColorInfo C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final Class<? extends Object> J;
    public int K;

    /* renamed from: f  reason: collision with root package name */
    public final String f707f;

    /* renamed from: g  reason: collision with root package name */
    public final String f708g;

    /* renamed from: h  reason: collision with root package name */
    public final String f709h;

    /* renamed from: i  reason: collision with root package name */
    public final int f710i;

    /* renamed from: j  reason: collision with root package name */
    public final int f711j;

    /* renamed from: k  reason: collision with root package name */
    public final int f712k;

    /* renamed from: l  reason: collision with root package name */
    public final int f713l;

    /* renamed from: m  reason: collision with root package name */
    public final int f714m;
    public final String n;
    public final Metadata o;
    public final String p;
    public final String q;
    public final int r;
    public final List<byte[]> s;
    public final DrmInitData t;
    public final long u;
    public final int v;
    public final int w;
    public final float x;
    public final int y;
    public final float z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<Format> {
        @Override // android.os.Parcelable.Creator
        public Format createFromParcel(Parcel parcel) {
            return new Format(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Format[] newArray(int i2) {
            return new Format[i2];
        }
    }

    public Format(b bVar, a aVar) {
        this.f707f = bVar.a;
        this.f708g = bVar.b;
        this.f709h = b0.B(bVar.c);
        this.f710i = bVar.f715d;
        this.f711j = bVar.f716e;
        int i2 = bVar.f717f;
        this.f712k = i2;
        int i3 = bVar.f718g;
        this.f713l = i3;
        this.f714m = i3 != -1 ? i3 : i2;
        this.n = bVar.f719h;
        this.o = bVar.f720i;
        this.p = bVar.f721j;
        this.q = bVar.f722k;
        this.r = bVar.f723l;
        List<byte[]> list = bVar.f724m;
        this.s = list == null ? Collections.emptyList() : list;
        DrmInitData drmInitData = bVar.n;
        this.t = drmInitData;
        this.u = bVar.o;
        this.v = bVar.p;
        this.w = bVar.q;
        this.x = bVar.r;
        int i4 = bVar.s;
        this.y = i4 == -1 ? 0 : i4;
        float f2 = bVar.t;
        this.z = f2 == -1.0f ? 1.0f : f2;
        this.A = bVar.u;
        this.B = bVar.v;
        this.C = bVar.w;
        this.D = bVar.x;
        this.E = bVar.y;
        this.F = bVar.z;
        int i5 = bVar.A;
        this.G = i5 == -1 ? 0 : i5;
        int i6 = bVar.B;
        this.H = i6 != -1 ? i6 : 0;
        this.I = bVar.C;
        Class<? extends Object> cls = bVar.D;
        if (cls == null && drmInitData != null) {
            this.J = f.class;
        } else {
            this.J = cls;
        }
    }

    public b b() {
        return new b(this, null);
    }

    public boolean c(Format format) {
        if (this.s.size() != format.s.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.s.size(); i2++) {
            if (!Arrays.equals(this.s.get(i2), format.s.get(i2))) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        int i3 = this.K;
        return (i3 == 0 || (i2 = format.K) == 0 || i3 == i2) && this.f710i == format.f710i && this.f711j == format.f711j && this.f712k == format.f712k && this.f713l == format.f713l && this.r == format.r && this.u == format.u && this.v == format.v && this.w == format.w && this.y == format.y && this.B == format.B && this.D == format.D && this.E == format.E && this.F == format.F && this.G == format.G && this.H == format.H && this.I == format.I && Float.compare(this.x, format.x) == 0 && Float.compare(this.z, format.z) == 0 && b0.a(this.J, format.J) && b0.a(this.f707f, format.f707f) && b0.a(this.f708g, format.f708g) && b0.a(this.n, format.n) && b0.a(this.p, format.p) && b0.a(this.q, format.q) && b0.a(this.f709h, format.f709h) && Arrays.equals(this.A, format.A) && b0.a(this.o, format.o) && b0.a(this.C, format.C) && b0.a(this.t, format.t) && c(format);
    }

    public int hashCode() {
        if (this.K == 0) {
            String str = this.f707f;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f708g;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f709h;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f710i) * 31) + this.f711j) * 31) + this.f712k) * 31) + this.f713l) * 31;
            String str4 = this.n;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.o;
            int hashCode5 = (hashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str5 = this.p;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.q;
            int hashCode7 = str6 == null ? 0 : str6.hashCode();
            int floatToIntBits = (((((((((((((((Float.floatToIntBits(this.z) + ((((Float.floatToIntBits(this.x) + ((((((((((hashCode6 + hashCode7) * 31) + this.r) * 31) + ((int) this.u)) * 31) + this.v) * 31) + this.w) * 31)) * 31) + this.y) * 31)) * 31) + this.B) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31;
            Class<? extends Object> cls = this.J;
            this.K = floatToIntBits + (cls != null ? cls.hashCode() : 0);
        }
        return this.K;
    }

    public String toString() {
        String str = this.f707f;
        String str2 = this.f708g;
        String str3 = this.p;
        String str4 = this.q;
        String str5 = this.n;
        int i2 = this.f714m;
        String str6 = this.f709h;
        int i3 = this.v;
        int i4 = this.w;
        float f2 = this.x;
        int i5 = this.D;
        int i6 = this.E;
        StringBuilder z = f.a.b.a.a.z(f.a.b.a.a.x(str6, f.a.b.a.a.x(str5, f.a.b.a.a.x(str4, f.a.b.a.a.x(str3, f.a.b.a.a.x(str2, f.a.b.a.a.x(str, 104)))))), "Format(", str, ", ", str2);
        f.a.b.a.a.R(z, ", ", str3, ", ", str4);
        z.append(", ");
        z.append(str5);
        z.append(", ");
        z.append(i2);
        z.append(", ");
        z.append(str6);
        z.append(", [");
        z.append(i3);
        z.append(", ");
        z.append(i4);
        z.append(", ");
        z.append(f2);
        z.append("], [");
        z.append(i5);
        z.append(", ");
        z.append(i6);
        z.append("])");
        return z.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f707f);
        parcel.writeString(this.f708g);
        parcel.writeString(this.f709h);
        parcel.writeInt(this.f710i);
        parcel.writeInt(this.f711j);
        parcel.writeInt(this.f712k);
        parcel.writeInt(this.f713l);
        parcel.writeString(this.n);
        parcel.writeParcelable(this.o, 0);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeInt(this.r);
        int size = this.s.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(this.s.get(i3));
        }
        parcel.writeParcelable(this.t, 0);
        parcel.writeLong(this.u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        parcel.writeFloat(this.x);
        parcel.writeInt(this.y);
        parcel.writeFloat(this.z);
        int i4 = this.A != null ? 1 : 0;
        int i5 = b0.a;
        parcel.writeInt(i4);
        byte[] bArr = this.A;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.B);
        parcel.writeParcelable(this.C, i2);
        parcel.writeInt(this.D);
        parcel.writeInt(this.E);
        parcel.writeInt(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeInt(this.I);
    }

    /* loaded from: classes.dex */
    public static final class b {
        public int A;
        public int B;
        public int C;
        public Class<? extends Object> D;
        public String a;
        public String b;
        public String c;

        /* renamed from: d  reason: collision with root package name */
        public int f715d;

        /* renamed from: e  reason: collision with root package name */
        public int f716e;

        /* renamed from: f  reason: collision with root package name */
        public int f717f;

        /* renamed from: g  reason: collision with root package name */
        public int f718g;

        /* renamed from: h  reason: collision with root package name */
        public String f719h;

        /* renamed from: i  reason: collision with root package name */
        public Metadata f720i;

        /* renamed from: j  reason: collision with root package name */
        public String f721j;

        /* renamed from: k  reason: collision with root package name */
        public String f722k;

        /* renamed from: l  reason: collision with root package name */
        public int f723l;

        /* renamed from: m  reason: collision with root package name */
        public List<byte[]> f724m;
        public DrmInitData n;
        public long o;
        public int p;
        public int q;
        public float r;
        public int s;
        public float t;
        public byte[] u;
        public int v;
        public ColorInfo w;
        public int x;
        public int y;
        public int z;

        public b() {
            this.f717f = -1;
            this.f718g = -1;
            this.f723l = -1;
            this.o = Long.MAX_VALUE;
            this.p = -1;
            this.q = -1;
            this.r = -1.0f;
            this.t = 1.0f;
            this.v = -1;
            this.x = -1;
            this.y = -1;
            this.z = -1;
            this.C = -1;
        }

        public Format a() {
            return new Format(this, null);
        }

        public b b(int i2) {
            this.a = Integer.toString(i2);
            return this;
        }

        public b(Format format, a aVar) {
            this.a = format.f707f;
            this.b = format.f708g;
            this.c = format.f709h;
            this.f715d = format.f710i;
            this.f716e = format.f711j;
            this.f717f = format.f712k;
            this.f718g = format.f713l;
            this.f719h = format.n;
            this.f720i = format.o;
            this.f721j = format.p;
            this.f722k = format.q;
            this.f723l = format.r;
            this.f724m = format.s;
            this.n = format.t;
            this.o = format.u;
            this.p = format.v;
            this.q = format.w;
            this.r = format.x;
            this.s = format.y;
            this.t = format.z;
            this.u = format.A;
            this.v = format.B;
            this.w = format.C;
            this.x = format.D;
            this.y = format.E;
            this.z = format.F;
            this.A = format.G;
            this.B = format.H;
            this.C = format.I;
            this.D = format.J;
        }
    }

    public Format(Parcel parcel) {
        this.f707f = parcel.readString();
        this.f708g = parcel.readString();
        this.f709h = parcel.readString();
        this.f710i = parcel.readInt();
        this.f711j = parcel.readInt();
        int readInt = parcel.readInt();
        this.f712k = readInt;
        int readInt2 = parcel.readInt();
        this.f713l = readInt2;
        this.f714m = readInt2 != -1 ? readInt2 : readInt;
        this.n = parcel.readString();
        this.o = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
        this.p = parcel.readString();
        this.q = parcel.readString();
        this.r = parcel.readInt();
        int readInt3 = parcel.readInt();
        this.s = new ArrayList(readInt3);
        for (int i2 = 0; i2 < readInt3; i2++) {
            List<byte[]> list = this.s;
            byte[] createByteArray = parcel.createByteArray();
            Objects.requireNonNull(createByteArray);
            list.add(createByteArray);
        }
        DrmInitData drmInitData = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.t = drmInitData;
        this.u = parcel.readLong();
        this.v = parcel.readInt();
        this.w = parcel.readInt();
        this.x = parcel.readFloat();
        this.y = parcel.readInt();
        this.z = parcel.readFloat();
        int i3 = b0.a;
        this.A = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.B = parcel.readInt();
        this.C = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.D = parcel.readInt();
        this.E = parcel.readInt();
        this.F = parcel.readInt();
        this.G = parcel.readInt();
        this.H = parcel.readInt();
        this.I = parcel.readInt();
        this.J = drmInitData != null ? f.class : null;
    }
}
