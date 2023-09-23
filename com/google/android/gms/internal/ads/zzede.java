package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzede implements zzfgf {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final zzfgn zzc;

    public zzede(Set set, zzfgn zzfgnVar) {
        zzffy zzffyVar;
        String str;
        zzffy zzffyVar2;
        String str2;
        this.zzc = zzfgnVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzedd zzeddVar = (zzedd) it.next();
            Map map = this.zza;
            zzffyVar = zzeddVar.zzb;
            str = zzeddVar.zza;
            map.put(zzffyVar, str);
            Map map2 = this.zzb;
            zzffyVar2 = zzeddVar.zzc;
            str2 = zzeddVar.zza;
            map2.put(zzffyVar2, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbF(zzffy zzffyVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbG(zzffy zzffyVar, String str, Throwable th) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "f.");
        if (this.zzb.containsKey(zzffyVar)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzffyVar))), "f.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzc(zzffy zzffyVar, String str) {
        this.zzc.zzd("task.".concat(String.valueOf(str)));
        if (this.zza.containsKey(zzffyVar)) {
            this.zzc.zzd("label.".concat(String.valueOf((String) this.zza.get(zzffyVar))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzd(zzffy zzffyVar, String str) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "s.");
        if (this.zzb.containsKey(zzffyVar)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzffyVar))), "s.");
        }
    }
}
