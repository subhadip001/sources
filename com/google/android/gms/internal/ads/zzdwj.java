package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdwj implements zzfgf {
    private final zzdwb zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdwj(zzdwb zzdwbVar, Set set, Clock clock) {
        zzffy zzffyVar;
        this.zzb = zzdwbVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdwi zzdwiVar = (zzdwi) it.next();
            Map map = this.zzd;
            zzffyVar = zzdwiVar.zzc;
            map.put(zzffyVar, zzdwiVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzffy zzffyVar, boolean z) {
        zzffy zzffyVar2;
        String str;
        zzffyVar2 = ((zzdwi) this.zzd.get(zzffyVar)).zzb;
        String str2 = true != z ? "f." : "s.";
        if (this.zza.containsKey(zzffyVar2)) {
            long elapsedRealtime = this.zzc.elapsedRealtime();
            long longValue = ((Long) this.zza.get(zzffyVar2)).longValue();
            Map zza = this.zzb.zza();
            str = ((zzdwi) this.zzd.get(zzffyVar)).zza;
            zza.put("label.".concat(str), str2.concat(String.valueOf(Long.toString(elapsedRealtime - longValue))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbF(zzffy zzffyVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbG(zzffy zzffyVar, String str, Throwable th) {
        if (this.zza.containsKey(zzffyVar)) {
            this.zzb.zza().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzffyVar)).longValue()))));
        }
        if (this.zzd.containsKey(zzffyVar)) {
            zze(zzffyVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzc(zzffy zzffyVar, String str) {
        this.zza.put(zzffyVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzd(zzffy zzffyVar, String str) {
        if (this.zza.containsKey(zzffyVar)) {
            this.zzb.zza().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzffyVar)).longValue()))));
        }
        if (this.zzd.containsKey(zzffyVar)) {
            zze(zzffyVar, true);
        }
    }
}
