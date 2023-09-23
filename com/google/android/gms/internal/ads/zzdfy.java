package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdfy extends zzfkm implements zzdbs, com.google.android.gms.ads.internal.client.zza, zzarb, zzded, zzdcm, zzddr, com.google.android.gms.ads.internal.overlay.zzo, zzdci, zzdjf {
    private final zzdfw zza = new zzdfw(this, null);
    private zzemc zzb;
    private zzemg zzc;
    private zzexc zzd;
    private zzfaj zze;

    public static /* bridge */ /* synthetic */ void zzn(zzdfy zzdfyVar, zzemc zzemcVar) {
        zzdfyVar.zzb = zzemcVar;
    }

    public static /* bridge */ /* synthetic */ void zzs(zzdfy zzdfyVar, zzexc zzexcVar) {
        zzdfyVar.zzd = zzexcVar;
    }

    public static /* bridge */ /* synthetic */ void zzt(zzdfy zzdfyVar, zzemg zzemgVar) {
        zzdfyVar.zzc = zzemgVar;
    }

    public static /* bridge */ /* synthetic */ void zzu(zzdfy zzdfyVar, zzfaj zzfajVar) {
        zzdfyVar.zze = zzfajVar;
    }

    private static void zzw(Object obj, zzdfx zzdfxVar) {
        if (obj != null) {
            zzdfxVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzw(this.zzb, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdfm
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzemc) obj).onAdClicked();
            }
        });
        zzw(this.zzc, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdfn
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzemg) obj).onAdClicked();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        zzw(this.zzd, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdfs
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzexc) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
        zzw(this.zzd, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdev
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzexc) obj).zzbC();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
        zzw(this.zzd, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdfl
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                zzexc zzexcVar = (zzexc) obj;
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
        zzw(this.zzd, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdes
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                zzexc zzexcVar = (zzexc) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzarb
    public final void zzbu(final String str, final String str2) {
        zzw(this.zzb, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdep
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzemc) obj).zzbu(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzbv() {
        zzw(this.zzb, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdeq
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                zzemc zzemcVar = (zzemc) obj;
            }
        });
        zzw(this.zze, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzder
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzfaj) obj).zzbv();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
        zzw(this.zzd, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdeo
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzexc) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(final int i2) {
        zzw(this.zzd, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdfj
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzexc) obj).zzf(i2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzded
    public final void zzg(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzw(this.zzb, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdfp
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzemc) obj).zzg(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
        zzw(this.zze, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdfq
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzfaj) obj).zzg(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
        zzw(this.zzd, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdfr
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzexc) obj).zzg(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddr
    public final void zzh() {
        zzw(this.zzd, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdfb
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzexc) obj).zzh();
            }
        });
    }

    public final zzdfw zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzj() {
        zzw(this.zzb, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdfh
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzemc) obj).zzj();
            }
        });
        zzw(this.zze, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdfi
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzfaj) obj).zzj();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdci
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzw(this.zze, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdew
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzfaj) obj).zzk(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzw(this.zzb, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdex
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzemc) obj).zzk(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcm
    public final void zzl() {
        zzw(this.zzb, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdez
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzemc) obj).zzl();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzm() {
        zzw(this.zzb, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdfk
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzemc) obj).zzm();
            }
        });
        zzw(this.zze, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdfo
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzfaj) obj).zzm();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzo() {
        zzw(this.zzb, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdft
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzemc) obj).zzo();
            }
        });
        zzw(this.zze, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdfu
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzfaj) obj).zzo();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzp(final zzcak zzcakVar, final String str, final String str2) {
        zzw(this.zzb, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdey
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                zzemc zzemcVar = (zzemc) obj;
            }
        });
        zzw(this.zze, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdfa
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzfaj) obj).zzp(zzcak.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdjf
    public final void zzq() {
        zzw(this.zzb, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdfc
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzemc) obj).zzq();
            }
        });
        zzw(this.zzc, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdfd
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzemg) obj).zzq();
            }
        });
        zzw(this.zze, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdfe
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzfaj) obj).zzq();
            }
        });
        zzw(this.zzd, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdff
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzexc) obj).zzq();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzr() {
        zzw(this.zzb, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdet
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                zzemc zzemcVar = (zzemc) obj;
            }
        });
        zzw(this.zze, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdeu
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzfaj) obj).zzr();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfkm
    public final void zzv() {
        zzw(this.zze, new zzdfx() { // from class: com.google.android.gms.internal.ads.zzdfg
            @Override // com.google.android.gms.internal.ads.zzdfx
            public final void zza(Object obj) {
                ((zzfaj) obj).zzv();
            }
        });
    }
}
