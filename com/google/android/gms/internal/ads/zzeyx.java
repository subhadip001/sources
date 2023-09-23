package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeyx {
    public static zzeyv zza(Context context, zzfdj zzfdjVar, zzfeb zzfebVar) {
        return zzc(context, zzfdjVar, zzfebVar);
    }

    public static zzeyv zzb(Context context, zzfdj zzfdjVar, zzfeb zzfebVar) {
        return zzc(context, zzfdjVar, zzfebVar);
    }

    private static zzeyv zzc(Context context, zzfdj zzfdjVar, zzfeb zzfebVar) {
        zzcel zzi;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfn)).booleanValue()) {
            zzi = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh();
        } else {
            zzi = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzi();
        }
        boolean z = false;
        if (zzi != null && zzi.zzh()) {
            z = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfD)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfm)).booleanValue() || z) {
                zzfea zza = zzfebVar.zza(zzfdr.AppOpen, context, zzfdjVar, new zzexz(new zzexw()));
                zzeyl zzeylVar = new zzeyl(new zzeyk());
                zzfdn zzfdnVar = zza.zza;
                zzfvk zzfvkVar = zzcfv.zza;
                return new zzeyb(zzeylVar, new zzeyh(zzfdnVar, zzfvkVar), zza.zzb, zza.zza.zza().zzf, zzfvkVar);
            }
        }
        return new zzeyk();
    }
}
