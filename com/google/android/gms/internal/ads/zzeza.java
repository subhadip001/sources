package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeza implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;

    public zzeza(zzgqh zzgqhVar, zzgqh zzgqhVar2, zzgqh zzgqhVar3) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
        this.zzc = zzgqhVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    /* renamed from: zza */
    public final zzeyv zzb() {
        zzcel zzi;
        Context context = (Context) this.zza.zzb();
        zzfdj zzfdjVar = (zzfdj) this.zzb.zzb();
        zzfeb zzfebVar = (zzfeb) this.zzc.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfn)).booleanValue()) {
            zzi = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh();
        } else {
            zzi = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzi();
        }
        boolean z = false;
        if (zzi != null && zzi.zzh()) {
            z = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfp)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfm)).booleanValue() || z) {
                zzfea zza = zzfebVar.zza(zzfdr.Rewarded, context, zzfdjVar, new zzexz(new zzexw()));
                zzeyl zzeylVar = new zzeyl(new zzeyk());
                zzfdn zzfdnVar = zza.zza;
                zzfvk zzfvkVar = zzcfv.zza;
                return new zzeyb(zzeylVar, new zzeyh(zzfdnVar, zzfvkVar), zza.zzb, zza.zza.zza().zzf, zzfvkVar);
            }
        }
        return new zzeyk();
    }
}
