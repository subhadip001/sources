package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeyk implements zzeyv {
    private zzdbb zza;

    @Override // com.google.android.gms.internal.ads.zzeyv
    /* renamed from: zza */
    public final synchronized zzdbb zzd() {
        return this.zza;
    }

    public final synchronized zzfvj zzb(zzeyw zzeywVar, zzeyu zzeyuVar, zzdbb zzdbbVar) {
        zzcyz zzb;
        if (zzdbbVar != null) {
            this.zza = zzdbbVar;
        } else {
            this.zza = (zzdbb) zzeyuVar.zza(zzeywVar.zzb).zzh();
        }
        zzb = this.zza.zzb();
        return zzb.zzh(zzb.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    public final /* bridge */ /* synthetic */ zzfvj zzc(zzeyw zzeywVar, zzeyu zzeyuVar, Object obj) {
        return zzb(zzeywVar, zzeyuVar, null);
    }
}
