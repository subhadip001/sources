package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzduv implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;

    public zzduv(zzgqh zzgqhVar, zzgqh zzgqhVar2) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        zzfvk zzfvkVar = zzcfv.zza;
        zzgqc.zzb(zzfvkVar);
        zzdvn zzb = ((zzdvo) this.zzb).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdU)).booleanValue()) {
            emptySet = Collections.singleton(new zzdiy(zzb, zzfvkVar));
        } else {
            emptySet = Collections.emptySet();
        }
        zzgqc.zzb(emptySet);
        return emptySet;
    }
}
