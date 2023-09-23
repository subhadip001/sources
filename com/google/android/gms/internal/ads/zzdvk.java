package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdvk implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;
    private final zzgqh zzd;

    public zzdvk(zzgqh zzgqhVar, zzgqh zzgqhVar2, zzgqh zzgqhVar3, zzgqh zzgqhVar4) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
        this.zzc = zzgqhVar3;
        this.zzd = zzgqhVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        final String zza = ((zzevj) this.zza).zza();
        Context zza2 = ((zzcnk) this.zzb).zza();
        zzfvk zzfvkVar = zzcfv.zza;
        zzgqc.zzb(zzfvkVar);
        Map zzb = ((zzgpy) this.zzd).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdU)).booleanValue()) {
            zzbdl zzbdlVar = new zzbdl(new zzbdr(zza2));
            zzbdlVar.zzb(new zzbdk() { // from class: com.google.android.gms.internal.ads.zzdvl
                @Override // com.google.android.gms.internal.ads.zzbdk
                public final void zza(zzbfa zzbfaVar) {
                    zzbfaVar.zzh(zza);
                }
            });
            emptySet = Collections.singleton(new zzdiy(new zzdvn(zzbdlVar, zzb), zzfvkVar));
        } else {
            emptySet = Collections.emptySet();
        }
        zzgqc.zzb(emptySet);
        return emptySet;
    }
}
