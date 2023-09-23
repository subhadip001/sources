package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdlu implements zzgpu {
    private final zzgqh zza;

    public zzdlu(zzgqh zzgqhVar) {
        this.zza = zzgqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        if (((zzdlr) this.zza).zza().zze() != null) {
            emptySet = Collections.singleton("banner");
        } else {
            emptySet = Collections.emptySet();
        }
        zzgqc.zzb(emptySet);
        return emptySet;
    }
}
