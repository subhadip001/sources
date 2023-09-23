package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdrx implements com.google.android.gms.ads.internal.client.zza, zzbnl, com.google.android.gms.ads.internal.overlay.zzo, zzbnn, com.google.android.gms.ads.internal.overlay.zzw {
    private com.google.android.gms.ads.internal.client.zza zza;
    private zzbnl zzb;
    private com.google.android.gms.ads.internal.overlay.zzo zzc;
    private zzbnn zzd;
    private com.google.android.gms.ads.internal.overlay.zzw zze;

    private zzdrx() {
    }

    public /* synthetic */ zzdrx(zzdrw zzdrwVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzi(com.google.android.gms.ads.internal.client.zza zzaVar, zzbnl zzbnlVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzbnn zzbnnVar, com.google.android.gms.ads.internal.overlay.zzw zzwVar) {
        this.zza = zzaVar;
        this.zzb = zzbnlVar;
        this.zzc = zzoVar;
        this.zzd = zzbnnVar;
        this.zze = zzwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zza;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final synchronized void zza(String str, Bundle bundle) {
        zzbnl zzbnlVar = this.zzb;
        if (zzbnlVar != null) {
            zzbnlVar.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzb() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbC() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbC();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final synchronized void zzbD(String str, String str2) {
        zzbnn zzbnnVar = this.zzd;
        if (zzbnnVar != null) {
            zzbnnVar.zzbD(str, str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbK() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbK();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbr() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbr();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zze() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zze();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzf(int i2) {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzf(i2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzw
    public final synchronized void zzg() {
        com.google.android.gms.ads.internal.overlay.zzw zzwVar = this.zze;
        if (zzwVar != null) {
            ((zzdry) zzwVar).zza.zzb();
        }
    }
}
