package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfxy extends zzgap {
    public final /* synthetic */ zzfxz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfxy(zzfxz zzfxzVar, Class cls) {
        super(cls);
        this.zza = zzfxzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* bridge */ /* synthetic */ zzgly zza(zzgly zzglyVar) {
        zzgcn zzc = zzgco.zzc();
        zzc.zza(zzgjg.zzv(zzgii.zza(((zzgcr) zzglyVar).zza())));
        zzc.zzb(0);
        return (zzgco) zzc.zzaj();
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) {
        return zzgcr.zze(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final Map zzc() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzfxz.zzg(16, 1));
        hashMap.put("AES128_GCM_RAW", zzfxz.zzg(16, 3));
        hashMap.put("AES256_GCM", zzfxz.zzg(32, 1));
        hashMap.put("AES256_GCM_RAW", zzfxz.zzg(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* synthetic */ void zzd(zzgly zzglyVar) {
        zzgik.zza(((zzgcr) zzglyVar).zza());
    }
}
