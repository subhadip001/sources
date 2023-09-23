package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbkp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.ads.internal.client.zzfg zzfgVar = null;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i2 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    z = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 3:
                    i3 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 4:
                    z2 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 5:
                    i4 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 6:
                    zzfgVar = (com.google.android.gms.ads.internal.client.zzfg) SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.ads.internal.client.zzfg.CREATOR);
                    break;
                case 7:
                    z3 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 8:
                    i5 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzbko(i2, z, i3, z2, i4, zzfgVar, z3, i5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzbko[i2];
    }
}
