package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgmg {
    private static final zzgmg zza = new zzgmg();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzgms zzb = new zzglq();

    private zzgmg() {
    }

    public static zzgmg zza() {
        return zza;
    }

    public final zzgmr zzb(Class cls) {
        zzgky.zzf(cls, "messageType");
        zzgmr zzgmrVar = (zzgmr) this.zzc.get(cls);
        if (zzgmrVar == null) {
            zzgmrVar = this.zzb.zza(cls);
            zzgky.zzf(cls, "messageType");
            zzgky.zzf(zzgmrVar, "schema");
            zzgmr zzgmrVar2 = (zzgmr) this.zzc.putIfAbsent(cls, zzgmrVar);
            if (zzgmrVar2 != null) {
                return zzgmrVar2;
            }
        }
        return zzgmrVar;
    }
}
