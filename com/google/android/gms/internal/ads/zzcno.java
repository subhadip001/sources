package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcno implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;

    public zzcno(zzgqh zzgqhVar, zzgqh zzgqhVar2) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        zzecz zzeczVar = (zzecz) this.zza.zzb();
        zzfvk zzfvkVar = zzcfv.zza;
        zzgqc.zzb(zzfvkVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbL)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhf)).booleanValue()) {
                emptySet = Collections.singleton(new zzdiy(zzeczVar, zzfvkVar));
                zzgqc.zzb(emptySet);
                return emptySet;
            }
        }
        emptySet = Collections.emptySet();
        zzgqc.zzb(emptySet);
        return emptySet;
    }
}
