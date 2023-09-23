package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzekk implements zzeey {
    private final zzbit zza;
    private final zzfvk zzb;
    private final zzfge zzc;
    private final zzekt zzd;

    public zzekk(zzfge zzfgeVar, zzfvk zzfvkVar, zzbit zzbitVar, zzekt zzektVar, byte[] bArr) {
        this.zzc = zzfgeVar;
        this.zzb = zzfvkVar;
        this.zza = zzbitVar;
        this.zzd = zzektVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeey
    public final zzfvj zza(zzfbs zzfbsVar, zzfbg zzfbgVar) {
        zzcga zzcgaVar = new zzcga();
        zzekp zzekpVar = new zzekp();
        zzekpVar.zzd(new zzekj(this, zzcgaVar, zzfbsVar, zzfbgVar, zzekpVar));
        zzfbl zzfblVar = zzfbgVar.zzt;
        final zzbio zzbioVar = new zzbio(zzekpVar, zzfblVar.zzb, zzfblVar.zza);
        zzfge zzfgeVar = this.zzc;
        return zzffo.zzd(new zzffi() { // from class: com.google.android.gms.internal.ads.zzeki
            @Override // com.google.android.gms.internal.ads.zzffi
            public final void zza() {
                zzekk.this.zzc(zzbioVar);
            }
        }, this.zzb, zzffy.CUSTOM_RENDER_SYN, zzfgeVar).zzb(zzffy.CUSTOM_RENDER_ACK).zzd(zzcgaVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeey
    public final boolean zzb(zzfbs zzfbsVar, zzfbg zzfbgVar) {
        zzfbl zzfblVar;
        return (this.zza == null || (zzfblVar = zzfbgVar.zzt) == null || zzfblVar.zza == null) ? false : true;
    }

    public final /* synthetic */ void zzc(zzbio zzbioVar) {
        this.zza.zze(zzbioVar);
    }
}
