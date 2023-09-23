package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfye extends zzgap {
    public final /* synthetic */ zzfyf zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfye(zzfyf zzfyfVar, Class cls) {
        super(cls);
        this.zza = zzfyfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* bridge */ /* synthetic */ zzgly zza(zzgly zzglyVar) {
        zzgdj zzgdjVar = (zzgdj) zzglyVar;
        zzgdf zzc = zzgdg.zzc();
        zzc.zzb(0);
        zzc.zza(zzgjg.zzv(zzgii.zza(32)));
        return (zzgdg) zzc.zzaj();
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) {
        return zzgdj.zzd(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final Map zzc() {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new zzgao(zzgdj.zzc(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new zzgao(zzgdj.zzc(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* bridge */ /* synthetic */ void zzd(zzgly zzglyVar) {
        zzgdj zzgdjVar = (zzgdj) zzglyVar;
    }
}
