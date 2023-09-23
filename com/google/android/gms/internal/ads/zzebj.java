package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzebj implements zzebl {
    private final Map zza;
    private final zzfvk zzb;
    private final zzdel zzc;

    public zzebj(Map map, zzfvk zzfvkVar, zzdel zzdelVar) {
        this.zza = map;
        this.zzb = zzfvkVar;
        this.zzc = zzdelVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebl
    public final zzfvj zzb(final zzbzu zzbzuVar) {
        this.zzc.zzbE(zzbzuVar);
        zzfvj zzh = zzfva.zzh(new zzdzk(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgO)).split(",")) {
            final zzgqh zzgqhVar = (zzgqh) this.zza.get(str.trim());
            if (zzgqhVar != null) {
                zzh = zzfva.zzg(zzh, zzdzk.class, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzebh
                    @Override // com.google.android.gms.internal.ads.zzfuh
                    public final zzfvj zza(Object obj) {
                        zzgqh zzgqhVar2 = zzgqh.this;
                        zzdzk zzdzkVar = (zzdzk) obj;
                        return ((zzebl) zzgqhVar2.zzb()).zzb(zzbzuVar);
                    }
                }, this.zzb);
            }
        }
        zzfva.zzr(zzh, new zzebi(this), zzcfv.zzf);
        return zzh;
    }
}
