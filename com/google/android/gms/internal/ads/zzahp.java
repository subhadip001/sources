package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzahp {
    private final List zza;
    private final zzzz[] zzb;

    public zzahp(List list) {
        this.zza = list;
        this.zzb = new zzzz[list.size()];
    }

    public final void zza(long j2, zzdy zzdyVar) {
        if (zzdyVar.zza() < 9) {
            return;
        }
        int zze = zzdyVar.zze();
        int zze2 = zzdyVar.zze();
        int zzk = zzdyVar.zzk();
        if (zze == 434 && zze2 == 1195456820 && zzk == 3) {
            zzyj.zzb(j2, zzdyVar, this.zzb);
        }
    }

    public final void zzb(zzyv zzyvVar, zzahm zzahmVar) {
        for (int i2 = 0; i2 < this.zzb.length; i2++) {
            zzahmVar.zzc();
            zzzz zzv = zzyvVar.zzv(zzahmVar.zza(), 3);
            zzad zzadVar = (zzad) this.zza.get(i2);
            String str = zzadVar.zzm;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzcw.zze(z, "Invalid closed caption mime type provided: ".concat(String.valueOf(str)));
            zzab zzabVar = new zzab();
            zzabVar.zzH(zzahmVar.zzb());
            zzabVar.zzS(str);
            zzabVar.zzU(zzadVar.zze);
            zzabVar.zzK(zzadVar.zzd);
            zzabVar.zzu(zzadVar.zzE);
            zzabVar.zzI(zzadVar.zzo);
            zzv.zzk(zzabVar.zzY());
            this.zzb[i2] = zzv;
        }
    }
}
