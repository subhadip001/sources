package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfyo extends zzgap {
    public final /* synthetic */ zzfyp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfyo(zzfyp zzfypVar, Class cls) {
        super(cls);
        this.zza = zzfypVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* bridge */ /* synthetic */ zzgly zza(zzgly zzglyVar) {
        zzggw zzggwVar = (zzggw) zzglyVar;
        zzggs zzc = zzggt.zzc();
        zzc.zzb(0);
        zzc.zza(zzgjg.zzv(zzgii.zza(32)));
        return (zzggt) zzc.zzaj();
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) {
        return zzggw.zzd(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final Map zzc() {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new zzgao(zzggw.zzc(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new zzgao(zzggw.zzc(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* bridge */ /* synthetic */ void zzd(zzgly zzglyVar) {
        zzggw zzggwVar = (zzggw) zzglyVar;
    }
}
