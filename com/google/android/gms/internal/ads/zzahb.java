package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzahb {
    private final List zza;
    private final zzzz[] zzb;

    public zzahb(List list) {
        this.zza = list;
        this.zzb = new zzzz[list.size()];
    }

    public final void zza(long j2, zzdy zzdyVar) {
        zzyj.zza(j2, zzdyVar, this.zzb);
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
            String str2 = zzadVar.zzb;
            if (str2 == null) {
                str2 = zzahmVar.zzb();
            }
            zzab zzabVar = new zzab();
            zzabVar.zzH(str2);
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
