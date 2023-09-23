package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzehx extends zzbvl {
    public final /* synthetic */ zzehy zza;
    private final zzefb zzb;

    public /* synthetic */ zzehx(zzehy zzehyVar, zzefb zzefbVar, zzehw zzehwVar) {
        this.zza = zzehyVar;
        this.zzb = zzefbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zze(String str) {
        ((zzegu) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        ((zzegu) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzg(zzbuo zzbuoVar) {
        zzehy.zzc(this.zza, zzbuoVar);
        ((zzegu) this.zzb.zzc).zzo();
    }
}
