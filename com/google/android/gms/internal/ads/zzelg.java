package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzelg extends com.google.android.gms.ads.internal.client.zzbn {
    @VisibleForTesting
    public final zzfbw zza;
    @VisibleForTesting
    public final zzdnp zzb;
    private final Context zzc;
    private final zzcnf zzd;
    private com.google.android.gms.ads.internal.client.zzbf zze;

    public zzelg(zzcnf zzcnfVar, Context context, String str) {
        zzfbw zzfbwVar = new zzfbw();
        this.zza = zzfbwVar;
        this.zzb = new zzdnp();
        this.zzd = zzcnfVar;
        zzfbwVar.zzs(str);
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final com.google.android.gms.ads.internal.client.zzbl zze() {
        zzdnr zzg = this.zzb.zzg();
        this.zza.zzB(zzg.zzi());
        this.zza.zzC(zzg.zzh());
        zzfbw zzfbwVar = this.zza;
        if (zzfbwVar.zzg() == null) {
            zzfbwVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzc());
        }
        return new zzelh(this.zzc, this.zzd, this.zza, zzg, this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzf(zzbly zzblyVar) {
        this.zzb.zza(zzblyVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzg(zzbmb zzbmbVar) {
        this.zzb.zzb(zzbmbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzh(String str, zzbmh zzbmhVar, zzbme zzbmeVar) {
        this.zzb.zzc(str, zzbmhVar, zzbmeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzi(zzbra zzbraVar) {
        this.zzb.zzd(zzbraVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzj(zzbml zzbmlVar, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzb.zze(zzbmlVar);
        this.zza.zzr(zzqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzk(zzbmo zzbmoVar) {
        this.zzb.zzf(zzbmoVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzl(com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
        this.zze = zzbfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzq(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzn(zzbqr zzbqrVar) {
        this.zza.zzv(zzbqrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzo(zzbko zzbkoVar) {
        this.zza.zzA(zzbkoVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzD(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzq(com.google.android.gms.ads.internal.client.zzcd zzcdVar) {
        this.zza.zzQ(zzcdVar);
    }
}
