package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfxp extends zzgap {
    public final /* synthetic */ zzfxq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfxp(zzfxq zzfxqVar, Class cls) {
        super(cls);
        this.zza = zzfxqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* bridge */ /* synthetic */ zzgly zza(zzgly zzglyVar) {
        zzgbt zzgbtVar = (zzgbt) zzglyVar;
        new zzfxt();
        zzgbw zzf = zzfxs.zzf(zzgbtVar.zze());
        zzgly zza = new zzgaz().zza().zza(zzgbtVar.zzf());
        zzgbp zzc = zzgbq.zzc();
        zzc.zza(zzf);
        zzc.zzb((zzgek) zza);
        zzc.zzc(0);
        return (zzgbq) zzc.zzaj();
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) {
        return zzgbt.zzd(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final Map zzc() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", zzfxq.zzg(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzfxq.zzg(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", zzfxq.zzg(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzfxq.zzg(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* bridge */ /* synthetic */ void zzd(zzgly zzglyVar) {
        zzgbt zzgbtVar = (zzgbt) zzglyVar;
        ((zzfxs) new zzfxt().zza()).zzd(zzgbtVar.zze());
        new zzgaz().zza().zzd(zzgbtVar.zzf());
        zzgik.zza(zzgbtVar.zze().zza());
    }
}
