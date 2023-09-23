package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdlm implements zzcxz {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzgqh zzd;
    private final zzdnr zze;

    public zzdlm(Map map, Map map2, Map map3, zzgqh zzgqhVar, zzdnr zzdnrVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzgqhVar;
        this.zze = zzdnrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxz
    public final zzeey zza(int i2, String str) {
        zzeey zza;
        zzeey zzeeyVar = (zzeey) this.zza.get(str);
        if (zzeeyVar != null) {
            return zzeeyVar;
        }
        if (i2 == 1) {
            if (this.zze.zze() == null || (zza = ((zzcxz) this.zzd.zzb()).zza(i2, str)) == null) {
                return null;
            }
            return zzcyd.zza(zza);
        } else if (i2 != 4) {
            return null;
        } else {
            zzehm zzehmVar = (zzehm) this.zzc.get(str);
            if (zzehmVar != null) {
                return new zzeez(zzehmVar, new zzfoi() { // from class: com.google.android.gms.internal.ads.zzcyb
                    @Override // com.google.android.gms.internal.ads.zzfoi
                    public final Object apply(Object obj) {
                        return new zzcyd((List) obj);
                    }
                });
            }
            zzeey zzeeyVar2 = (zzeey) this.zzb.get(str);
            if (zzeeyVar2 == null) {
                return null;
            }
            return zzcyd.zza(zzeeyVar2);
        }
    }
}
