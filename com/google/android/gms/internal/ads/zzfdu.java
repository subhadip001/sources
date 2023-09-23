package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@SafeParcelable.Class(creator = "PoolConfigurationCreator")
/* loaded from: classes.dex */
public final class zzfdu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfdu> CREATOR = new zzfdv();
    public final Context zza;
    public final zzfdr zzb;
    @SafeParcelable.Field(id = 2)
    public final int zzc;
    @SafeParcelable.Field(id = 3)
    public final int zzd;
    @SafeParcelable.Field(id = 4)
    public final int zze;
    @SafeParcelable.Field(id = 5)
    public final String zzf;
    public final int zzg;
    private final zzfdr[] zzh;
    @SafeParcelable.Field(getter = "getFormatInt", id = 1)
    private final int zzi;
    @SafeParcelable.Field(getter = "getPoolDiscardStrategyInt", id = 6)
    private final int zzj;
    @SafeParcelable.Field(getter = "getPrecacheStartTriggerInt", id = 7)
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    @SafeParcelable.Constructor
    public zzfdu(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) int i4, @SafeParcelable.Param(id = 4) int i5, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) int i6, @SafeParcelable.Param(id = 7) int i7) {
        zzfdr[] values = zzfdr.values();
        this.zzh = values;
        int[] zza = zzfds.zza();
        this.zzl = zza;
        int[] zza2 = zzfdt.zza();
        this.zzm = zza2;
        this.zza = null;
        this.zzi = i2;
        this.zzb = values[i2];
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = str;
        this.zzj = i6;
        this.zzg = zza[i6];
        this.zzk = i7;
        int i8 = zza2[i7];
    }

    public static zzfdu zza(zzfdr zzfdrVar, Context context) {
        if (zzfdrVar == zzfdr.Rewarded) {
            return new zzfdu(context, zzfdrVar, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfp)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfv)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfx)).intValue(), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfz), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfr), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzft));
        } else if (zzfdrVar == zzfdr.Interstitial) {
            return new zzfdu(context, zzfdrVar, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfq)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfw)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfy)).intValue(), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfA), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfs), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfu));
        } else if (zzfdrVar == zzfdr.AppOpen) {
            return new zzfdu(context, zzfdrVar, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfD)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfF)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfG)).intValue(), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfB), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfC), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfE));
        } else {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzi);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zzfdu(Context context, zzfdr zzfdrVar, int i2, int i3, int i4, String str, String str2, String str3) {
        this.zzh = zzfdr.values();
        this.zzl = zzfds.zza();
        this.zzm = zzfdt.zza();
        this.zza = context;
        this.zzi = zzfdrVar.ordinal();
        this.zzb = zzfdrVar;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        int i5 = 2;
        if ("oldest".equals(str2)) {
            i5 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i5 = 3;
        }
        this.zzg = i5;
        this.zzj = i5 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
