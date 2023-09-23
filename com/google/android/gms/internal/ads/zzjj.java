package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzjj implements zzsl, zzpe {
    public final /* synthetic */ zzjn zza;
    private final zzjl zzb;
    private zzsk zzc;
    private zzpd zzd;

    public zzjj(zzjn zzjnVar, zzjl zzjlVar) {
        zzsk zzskVar;
        zzpd zzpdVar;
        this.zza = zzjnVar;
        zzskVar = zzjnVar.zzf;
        this.zzc = zzskVar;
        zzpdVar = zzjnVar.zzg;
        this.zzd = zzpdVar;
        this.zzb = zzjlVar;
    }

    private final boolean zzf(int i2, zzsb zzsbVar) {
        zzsk zzskVar;
        zzpd zzpdVar;
        zzsb zzsbVar2 = null;
        if (zzsbVar != null) {
            zzjl zzjlVar = this.zzb;
            int i3 = 0;
            while (true) {
                if (i3 >= zzjlVar.zzc.size()) {
                    break;
                } else if (((zzsb) zzjlVar.zzc.get(i3)).zzd == zzsbVar.zzd) {
                    zzsbVar2 = zzsbVar.zzc(Pair.create(zzjlVar.zzb, zzsbVar.zza));
                    break;
                } else {
                    i3++;
                }
            }
            if (zzsbVar2 == null) {
                return false;
            }
        }
        int i4 = i2 + this.zzb.zzd;
        zzsk zzskVar2 = this.zzc;
        if (zzskVar2.zza != i4 || !zzeg.zzS(zzskVar2.zzb, zzsbVar2)) {
            zzskVar = this.zza.zzf;
            this.zzc = zzskVar.zza(i4, zzsbVar2, 0L);
        }
        zzpd zzpdVar2 = this.zzd;
        if (zzpdVar2.zza == i4 && zzeg.zzS(zzpdVar2.zzb, zzsbVar2)) {
            return true;
        }
        zzpdVar = this.zza.zzg;
        this.zzd = zzpdVar.zza(i4, zzsbVar2);
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
