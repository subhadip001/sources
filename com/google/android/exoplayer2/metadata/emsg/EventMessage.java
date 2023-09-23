package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import f.h.b.b.g2.b0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR;

    /* renamed from: l  reason: collision with root package name */
    public static final Format f773l;

    /* renamed from: m  reason: collision with root package name */
    public static final Format f774m;

    /* renamed from: f  reason: collision with root package name */
    public final String f775f;

    /* renamed from: g  reason: collision with root package name */
    public final String f776g;

    /* renamed from: h  reason: collision with root package name */
    public final long f777h;

    /* renamed from: i  reason: collision with root package name */
    public final long f778i;

    /* renamed from: j  reason: collision with root package name */
    public final byte[] f779j;

    /* renamed from: k  reason: collision with root package name */
    public int f780k;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<EventMessage> {
        @Override // android.os.Parcelable.Creator
        public EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public EventMessage[] newArray(int i2) {
            return new EventMessage[i2];
        }
    }

    static {
        Format.b bVar = new Format.b();
        bVar.f722k = "application/id3";
        f773l = bVar.a();
        Format.b bVar2 = new Format.b();
        bVar2.f722k = "application/x-scte35";
        f774m = bVar2.a();
        CREATOR = new a();
    }

    public EventMessage(String str, String str2, long j2, long j3, byte[] bArr) {
        this.f775f = str;
        this.f776g = str2;
        this.f777h = j2;
        this.f778i = j3;
        this.f779j = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return this.f777h == eventMessage.f777h && this.f778i == eventMessage.f778i && b0.a(this.f775f, eventMessage.f775f) && b0.a(this.f776g, eventMessage.f776g) && Arrays.equals(this.f779j, eventMessage.f779j);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public byte[] g0() {
        if (v() != null) {
            return this.f779j;
        }
        return null;
    }

    public int hashCode() {
        if (this.f780k == 0) {
            String str = this.f775f;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f776g;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j2 = this.f777h;
            long j3 = this.f778i;
            this.f780k = Arrays.hashCode(this.f779j) + ((((((hashCode + hashCode2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31);
        }
        return this.f780k;
    }

    public String toString() {
        String str = this.f775f;
        long j2 = this.f778i;
        long j3 = this.f777h;
        String str2 = this.f776g;
        StringBuilder sb = new StringBuilder(f.a.b.a.a.x(str2, f.a.b.a.a.x(str, 79)));
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(j2);
        f.a.b.a.a.Q(sb, ", durationMs=", j3, ", value=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public Format v() {
        String str = this.f775f;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return f774m;
            case 1:
            case 2:
                return f773l;
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f775f);
        parcel.writeString(this.f776g);
        parcel.writeLong(this.f777h);
        parcel.writeLong(this.f778i);
        parcel.writeByteArray(this.f779j);
    }

    public EventMessage(Parcel parcel) {
        String readString = parcel.readString();
        int i2 = b0.a;
        this.f775f = readString;
        this.f776g = parcel.readString();
        this.f777h = parcel.readLong();
        this.f778i = parcel.readLong();
        this.f779j = parcel.createByteArray();
    }
}
