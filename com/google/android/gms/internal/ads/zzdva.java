package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdva implements zzden, zzddg, zzdbv, zzdcm, com.google.android.gms.ads.internal.client.zza, zzdgy {
    private final zzbdl zza;
    private boolean zzb = false;

    public zzdva(zzbdl zzbdlVar, zzezb zzezbVar) {
        this.zza = zzbdlVar;
        zzbdlVar.zzc(2);
        if (zzezbVar != null) {
            zzbdlVar.zzc(1101);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.zzb) {
            this.zza.zzc(8);
            return;
        }
        this.zza.zzc(7);
        this.zzb = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        switch (zzeVar.zza) {
            case 1:
                this.zza.zzc(101);
                return;
            case 2:
                this.zza.zzc(102);
                return;
            case 3:
                this.zza.zzc(5);
                return;
            case 4:
                this.zza.zzc(103);
                return;
            case 5:
                this.zza.zzc(104);
                return;
            case 6:
                this.zza.zzc(105);
                return;
            case 7:
                this.zza.zzc(106);
                return;
            default:
                this.zza.zzc(4);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzb(final zzfbs zzfbsVar) {
        this.zza.zzb(new zzbdk() { // from class: com.google.android.gms.internal.ads.zzduw
            @Override // com.google.android.gms.internal.ads.zzbdk
            public final void zza(zzbfa zzbfaVar) {
                zzfbs zzfbsVar2 = zzfbs.this;
                zzbdw zzbdwVar = (zzbdw) zzbfaVar.zza().zzax();
                zzbeo zzbeoVar = (zzbeo) zzbfaVar.zza().zzd().zzax();
                zzbeoVar.zza(zzfbsVar2.zzb.zzb.zzb);
                zzbdwVar.zzb(zzbeoVar);
                zzbfaVar.zze(zzbdwVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzbE(zzbzu zzbzuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgy
    public final void zzd() {
        this.zza.zzc(1109);
    }

    @Override // com.google.android.gms.internal.ads.zzdgy
    public final void zze(final zzbeg zzbegVar) {
        this.zza.zzb(new zzbdk() { // from class: com.google.android.gms.internal.ads.zzduz
            @Override // com.google.android.gms.internal.ads.zzbdk
            public final void zza(zzbfa zzbfaVar) {
                zzbfaVar.zzf(zzbeg.this);
            }
        });
        this.zza.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzdgy
    public final void zzf(final zzbeg zzbegVar) {
        this.zza.zzb(new zzbdk() { // from class: com.google.android.gms.internal.ads.zzduy
            @Override // com.google.android.gms.internal.ads.zzbdk
            public final void zza(zzbfa zzbfaVar) {
                zzbfaVar.zzf(zzbeg.this);
            }
        });
        this.zza.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzdgy
    public final void zzh(boolean z) {
        this.zza.zzc(true != z ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzdgy
    public final void zzi(final zzbeg zzbegVar) {
        this.zza.zzb(new zzbdk() { // from class: com.google.android.gms.internal.ads.zzdux
            @Override // com.google.android.gms.internal.ads.zzbdk
            public final void zza(zzbfa zzbfaVar) {
                zzbfaVar.zzf(zzbeg.this);
            }
        });
        this.zza.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzdgy
    public final void zzk(boolean z) {
        this.zza.zzc(true != z ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzdcm
    public final synchronized void zzl() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzddg
    public final void zzn() {
        this.zza.zzc(3);
    }
}
