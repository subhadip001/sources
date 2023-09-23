package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzgpp {
    public final LinkedHashMap zza;

    public zzgpp(int i2) {
        this.zza = zzgpr.zzb(i2);
    }

    public final zzgpp zza(Object obj, zzgqh zzgqhVar) {
        LinkedHashMap linkedHashMap = this.zza;
        zzgqc.zza(obj, "key");
        zzgqc.zza(zzgqhVar, "provider");
        linkedHashMap.put(obj, zzgqhVar);
        return this;
    }
}
