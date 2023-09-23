package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzri implements zzsl, zzpe {
    public final /* synthetic */ zzrk zza;
    private final Object zzb;
    private zzsk zzc;
    private zzpd zzd;

    public zzri(zzrk zzrkVar, Object obj) {
        this.zza = zzrkVar;
        this.zzc = zzrkVar.zze(null);
        this.zzd = zzrkVar.zzc(null);
        this.zzb = obj;
    }

    private final boolean zzf(int i2, zzsb zzsbVar) {
        zzsb zzsbVar2;
        if (zzsbVar != null) {
            zzsbVar2 = this.zza.zzv(this.zzb, zzsbVar);
            if (zzsbVar2 == null) {
                return false;
            }
        } else {
            zzsbVar2 = null;
        }
        zzsk zzskVar = this.zzc;
        if (zzskVar.zza != i2 || !zzeg.zzS(zzskVar.zzb, zzsbVar2)) {
            this.zzc = this.zza.zzf(i2, zzsbVar2, 0L);
        }
        zzpd zzpdVar = this.zzd;
        if (zzpdVar.zza == i2 && zzeg.zzS(zzpdVar.zzb, zzsbVar2)) {
            return true;
        }
        this.zzd = this.zza.zzd(i2, zzsbVar2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsl
    public final void zzaf(int i2, zzsb zzsbVar, zzrx zzrxVar) {
        if (zzf(i2, zzsbVar)) {
            this.zzc.zzc(zzrxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsl
    public final void zzag(int i2, zzsb zzsbVar, zzrs zzrsVar, zzrx zzrxVar) {
        if (zzf(i2, zzsbVar)) {
            this.zzc.zze(zzrsVar, zzrxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsl
    public final void zzah(int i2, zzsb zzsbVar, zzrs zzrsVar, zzrx zzrxVar) {
        if (zzf(i2, zzsbVar)) {
            this.zzc.zzg(zzrsVar, zzrxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsl
    public final void zzai(int i2, zzsb zzsbVar, zzrs zzrsVar, zzrx zzrxVar, IOException iOException, boolean z) {
        if (zzf(i2, zzsbVar)) {
            this.zzc.zzi(zzrsVar, zzrxVar, iOException, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsl
    public final void zzaj(int i2, zzsb zzsbVar, zzrs zzrsVar, zzrx zzrxVar) {
        if (zzf(i2, zzsbVar)) {
            this.zzc.zzk(zzrsVar, zzrxVar);
        }
    }
}
