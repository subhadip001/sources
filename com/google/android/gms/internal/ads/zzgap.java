package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzgap {
    private final Class zza;

    public zzgap(Class cls) {
        this.zza = cls;
    }

    public abstract zzgly zza(zzgly zzglyVar);

    public abstract zzgly zzb(zzgjg zzgjgVar);

    public Map zzc() {
        return Collections.emptyMap();
    }

    public abstract void zzd(zzgly zzglyVar);

    public final Class zzg() {
        return this.zza;
    }
}
