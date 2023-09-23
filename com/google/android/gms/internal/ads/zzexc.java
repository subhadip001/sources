package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzexc implements zzdbv, zzddr, zzeys, com.google.android.gms.ads.internal.overlay.zzo, zzded, zzdci, zzdjf {
    private final zzfdj zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzexc zzh = null;

    public zzexc(zzfdj zzfdjVar) {
        this.zza = zzfdjVar;
    }

    public static zzexc zzi(zzexc zzexcVar) {
        zzexc zzexcVar2 = new zzexc(zzexcVar.zza);
        zzexcVar2.zzh = zzexcVar;
        return zzexcVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzexc zzexcVar = this.zzh;
        if (zzexcVar != null) {
            zzexcVar.zza(zzeVar);
            return;
        }
        zzeyj.zza(this.zzb, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzewn
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzbci) obj).zzc(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzeyj.zza(this.zzb, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzewt
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzbci) obj).zzb(com.google.android.gms.ads.internal.client.zze.this.zza);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        zzexc zzexcVar = this.zzh;
        if (zzexcVar != null) {
            zzexcVar.zzb();
            return;
        }
        zzeyj.zza(this.zzf, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzewv
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzb();
            }
        });
        zzeyj.zza(this.zzd, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzeww
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzbcm) obj).zzf();
            }
        });
        zzeyj.zza(this.zzd, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzewx
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzbcm) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
        zzexc zzexcVar = this.zzh;
        if (zzexcVar != null) {
            zzexcVar.zzbC();
        } else {
            zzeyj.zza(this.zzf, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzews
                @Override // com.google.android.gms.internal.ads.zzeyi
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzbC();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
    }

    @Override // com.google.android.gms.internal.ads.zzeys
    public final void zzbL(zzeys zzeysVar) {
        this.zzh = (zzexc) zzeysVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
        zzexc zzexcVar = this.zzh;
        if (zzexcVar != null) {
            zzexcVar.zze();
        } else {
            zzeyj.zza(this.zzf, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzewz
                @Override // com.google.android.gms.internal.ads.zzeyi
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(final int i2) {
        zzexc zzexcVar = this.zzh;
        if (zzexcVar != null) {
            zzexcVar.zzf(i2);
        } else {
            zzeyj.zza(this.zzf, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzewr
                @Override // com.google.android.gms.internal.ads.zzeyi
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzf(i2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzded
    public final void zzg(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzexc zzexcVar = this.zzh;
        if (zzexcVar != null) {
            zzexcVar.zzg(zzsVar);
        } else {
            zzeyj.zza(this.zzg, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzewq
                @Override // com.google.android.gms.internal.ads.zzeyi
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.client.zzde) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddr
    public final void zzh() {
        zzexc zzexcVar = this.zzh;
        if (zzexcVar != null) {
            zzexcVar.zzh();
        } else {
            zzeyj.zza(this.zze, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzexb
                @Override // com.google.android.gms.internal.ads.zzeyi
                public final void zza(Object obj) {
                    ((zzddr) obj).zzh();
                }
            });
        }
    }

    public final void zzj() {
        zzexc zzexcVar = this.zzh;
        if (zzexcVar != null) {
            zzexcVar.zzj();
            return;
        }
        this.zza.zza();
        zzeyj.zza(this.zzc, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzewo
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzbcj) obj).zze();
            }
        });
        zzeyj.zza(this.zzd, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzewp
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzbcm) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdci
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzexc zzexcVar = this.zzh;
        if (zzexcVar != null) {
            zzexcVar.zzk(zzeVar);
        } else {
            zzeyj.zza(this.zzd, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzewy
                @Override // com.google.android.gms.internal.ads.zzeyi
                public final void zza(Object obj) {
                    ((zzbcm) obj).zzd(com.google.android.gms.ads.internal.client.zze.this);
                }
            });
        }
    }

    public final void zzl(final zzbcf zzbcfVar) {
        zzexc zzexcVar = this.zzh;
        if (zzexcVar != null) {
            zzexcVar.zzl(zzbcfVar);
        } else {
            zzeyj.zza(this.zzb, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzewu
                @Override // com.google.android.gms.internal.ads.zzeyi
                public final void zza(Object obj) {
                    ((zzbci) obj).zzd(zzbcf.this);
                }
            });
        }
    }

    public final void zzn(zzddr zzddrVar) {
        this.zze.set(zzddrVar);
    }

    public final void zzo(com.google.android.gms.ads.internal.overlay.zzo zzoVar) {
        this.zzf.set(zzoVar);
    }

    public final void zzp(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        this.zzg.set(zzdeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdjf
    public final void zzq() {
        zzexc zzexcVar = this.zzh;
        if (zzexcVar != null) {
            zzexcVar.zzq();
        } else {
            zzeyj.zza(this.zzd, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzexa
                @Override // com.google.android.gms.internal.ads.zzeyi
                public final void zza(Object obj) {
                    ((zzbcm) obj).zzb();
                }
            });
        }
    }

    public final void zzr(zzbci zzbciVar) {
        this.zzb.set(zzbciVar);
    }

    public final void zzs(zzbcm zzbcmVar) {
        this.zzd.set(zzbcmVar);
    }

    public final void zzt(zzbcj zzbcjVar) {
        this.zzc.set(zzbcjVar);
    }
}
