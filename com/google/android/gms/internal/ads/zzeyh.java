package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeyh implements zzeyv {
    private final zzfdn zza;
    private final Executor zzb;
    private final zzfuw zzc = new zzeyf(this);

    public zzeyh(zzfdn zzfdnVar, Executor executor) {
        this.zza = zzfdnVar;
        this.zzb = executor;
    }

    public final /* synthetic */ zzfvj zza(zzdbb zzdbbVar, zzeyq zzeyqVar) {
        zzfdx zzfdxVar = zzeyqVar.zzb;
        zzbzu zzbzuVar = zzeyqVar.zza;
        zzfdw zzb = zzfdxVar != null ? this.zza.zzb(zzfdxVar) : null;
        if (zzfdxVar == null) {
            return zzfva.zzi(null);
        }
        if (zzb != null && zzbzuVar != null) {
            zzfva.zzr(zzdbbVar.zzb().zzg(zzbzuVar), this.zzc, this.zzb);
        }
        return zzfva.zzi(new zzeyg(zzfdxVar, zzbzuVar, zzb));
    }

    public final zzfvj zzb(zzeyw zzeywVar, zzeyu zzeyuVar, final zzdbb zzdbbVar) {
        return zzfva.zzf(zzfva.zzn(zzfur.zzv(new zzeyr(this.zza, zzdbbVar, this.zzb).zzc()), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzeyd
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzeyh.this.zza(zzdbbVar, (zzeyq) obj);
            }
        }, this.zzb), Exception.class, new zzeye(this), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    public final /* bridge */ /* synthetic */ zzfvj zzc(zzeyw zzeywVar, zzeyu zzeyuVar, Object obj) {
        return zzb(zzeywVar, zzeyuVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
