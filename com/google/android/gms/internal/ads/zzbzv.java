package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbzv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Bundle bundle = null;
        zzcfo zzcfoVar = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList<String> arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        zzfdu zzfduVar = null;
        String str4 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    bundle = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 2:
                    zzcfoVar = (zzcfo) SafeParcelReader.createParcelable(parcel, readHeader, zzcfo.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.createParcelable(parcel, readHeader, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    arrayList = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 6:
                    packageInfo = (PackageInfo) SafeParcelReader.createParcelable(parcel, readHeader, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 8:
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 9:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 10:
                    zzfduVar = (zzfdu) SafeParcelReader.createParcelable(parcel, readHeader, zzfdu.CREATOR);
                    break;
                case 11:
                    str4 = SafeParcelReader.createString(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzbzu(bundle, zzcfoVar, applicationInfo, str, arrayList, packageInfo, str2, str3, zzfduVar, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzbzu[i2];
    }
}
