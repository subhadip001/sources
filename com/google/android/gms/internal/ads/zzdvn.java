package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdvn implements zzfgf {
    private final Map zza;
    private final zzbdl zzb;

    public zzdvn(zzbdl zzbdlVar, Map map) {
        this.zza = map;
        this.zzb = zzbdlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbF(zzffy zzffyVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbG(zzffy zzffyVar, String str, Throwable th) {
        if (this.zza.containsKey(zzffyVar)) {
            this.zzb.zzc(((zzdvm) this.zza.get(zzffyVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzc(zzffy zzffyVar, String str) {
        if (this.zza.containsKey(zzffyVar)) {
            this.zzb.zzc(((zzdvm) this.zza.get(zzffyVar)).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzd(zzffy zzffyVar, String str) {
        if (this.zza.containsKey(zzffyVar)) {
            this.zzb.zzc(((zzdvm) this.zza.get(zzffyVar)).zzb);
        }
    }
}
