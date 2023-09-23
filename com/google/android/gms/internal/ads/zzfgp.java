package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfgp implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;

    public zzfgp(zzgqh zzgqhVar, zzgqh zzgqhVar2, zzgqh zzgqhVar3) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
        this.zzc = zzgqhVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        Object obj;
        zzgpo zza = zzgpt.zza(this.zza);
        zzgpo zza2 = zzgpt.zza(this.zzb);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzc.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhg)).booleanValue()) {
            obj = new zzfgr((zzfgo) zza.zzb(), scheduledExecutorService);
        } else {
            obj = (zzfgo) zza2.zzb();
        }
        zzgqc.zzb(obj);
        return obj;
    }
}
