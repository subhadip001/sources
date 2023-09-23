package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzbvl extends zzaqw implements zzbvm {
    public zzbvl() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            zzbuo zzb = zzbun.zzb(parcel.readStrongBinder());
            zzaqx.zzc(parcel);
            zzg(zzb);
        } else if (i2 == 2) {
            String readString = parcel.readString();
            zzaqx.zzc(parcel);
            zze(readString);
        } else if (i2 != 3) {
            return false;
        } else {
            zzaqx.zzc(parcel);
            zzf((com.google.android.gms.ads.internal.client.zze) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
