package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzafz implements zzaga {
    private final List zza;
    private final zzzz[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf = -9223372036854775807L;

    public zzafz(List list) {
        this.zza = list;
        this.zzb = new zzzz[list.size()];
    }

    private final boolean zzf(zzdy zzdyVar, int i2) {
        if (zzdyVar.zza() == 0) {
            return false;
        }
        if (zzdyVar.zzk() != i2) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zza(zzdy zzdyVar) {
        zzzz[] zzzzVarArr;
        if (this.zzc) {
            if (this.zzd != 2 || zzf(zzdyVar, 32)) {
                if (this.zzd != 1 || zzf(zzdyVar, 0)) {
                    int zzc = zzdyVar.zzc();
                    int zza = zzdyVar.zza();
                    for (zzzz zzzzVar : this.zzb) {
                        zzdyVar.zzF(zzc);
                        zzzzVar.zzq(zzdyVar, zza);
                    }
                    this.zze += zza;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyv zzyvVar, zzahm zzahmVar) {
        for (int i2 = 0; i2 < this.zzb.length; i2++) {
            zzahj zzahjVar = (zzahj) this.zza.get(i2);
            zzahmVar.zzc();
            zzzz zzv = zzyvVar.zzv(zzahmVar.zza(), 3);
            zzab zzabVar = new zzab();
            zzabVar.zzH(zzahmVar.zzb());
            zzabVar.zzS("application/dvbsubs");
            zzabVar.zzI(Collections.singletonList(zzahjVar.zzb));
            zzabVar.zzK(zzahjVar.zza);
            zzv.zzk(zzabVar.zzY());
            this.zzb[i2] = zzv;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
        if (this.zzc) {
            if (this.zzf != -9223372036854775807L) {
                for (zzzz zzzzVar : this.zzb) {
                    zzzzVar.zzs(this.zzf, 1, this.zze, 0, null);
                }
            }
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long j2, int i2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.zzc = true;
        if (j2 != -9223372036854775807L) {
            this.zzf = j2;
        }
        this.zze = 0;
        this.zzd = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        this.zzc = false;
        this.zzf = -9223372036854775807L;
    }
}
