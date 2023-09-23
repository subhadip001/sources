package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbti {
    private final zzbsl zza;
    private zzfvj zzb;

    public zzbti(zzbsl zzbslVar) {
        this.zza = zzbslVar;
    }

    private final void zzd() {
        if (this.zzb == null) {
            final zzcga zzcgaVar = new zzcga();
            this.zzb = zzcgaVar;
            this.zza.zzb(null).zzi(new zzcge() { // from class: com.google.android.gms.internal.ads.zzbtg
                @Override // com.google.android.gms.internal.ads.zzcge
                public final void zza(Object obj) {
                    zzcga.this.zzd((zzbsm) obj);
                }
            }, new zzcgc() { // from class: com.google.android.gms.internal.ads.zzbth
                @Override // com.google.android.gms.internal.ads.zzcgc
                public final void zza() {
                    zzcga.this.zze(new zzbso("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final zzbtl zza(String str, zzbss zzbssVar, zzbsr zzbsrVar) {
        zzd();
        return new zzbtl(this.zzb, "google.afma.activeView.handleUpdate", zzbssVar, zzbsrVar);
    }

    public final void zzb(final String str, final zzbol zzbolVar) {
        zzd();
        this.zzb = zzfva.zzn(this.zzb, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzbte
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                zzbsm zzbsmVar = (zzbsm) obj;
                zzbsmVar.zzq(str, zzbolVar);
                return zzfva.zzi(zzbsmVar);
            }
        }, zzcfv.zzf);
    }

    public final void zzc(final String str, final zzbol zzbolVar) {
        this.zzb = zzfva.zzm(this.zzb, new zzfoi() { // from class: com.google.android.gms.internal.ads.zzbtf
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                zzbsm zzbsmVar = (zzbsm) obj;
                zzbsmVar.zzr(str, zzbolVar);
                return zzbsmVar;
            }
        }, zzcfv.zzf);
    }
}
