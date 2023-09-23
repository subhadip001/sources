package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgay extends zzgap {
    public final /* synthetic */ zzgaz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgay(zzgaz zzgazVar, Class cls) {
        super(cls);
        this.zza = zzgazVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* bridge */ /* synthetic */ zzgly zza(zzgly zzglyVar) {
        zzgen zzgenVar = (zzgen) zzglyVar;
        zzgej zzc = zzgek.zzc();
        zzc.zzc(0);
        zzc.zzb(zzgenVar.zzg());
        zzc.zza(zzgjg.zzv(zzgii.zza(zzgenVar.zza())));
        return (zzgek) zzc.zzaj();
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) {
        return zzgen.zzf(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final Map zzc() {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", zzgaz.zzm(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", zzgaz.zzm(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", zzgaz.zzm(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzgaz.zzm(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", zzgaz.zzm(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzgaz.zzm(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", zzgaz.zzm(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzgaz.zzm(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", zzgaz.zzm(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzgaz.zzm(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* bridge */ /* synthetic */ void zzd(zzgly zzglyVar) {
        zzgen zzgenVar = (zzgen) zzglyVar;
        if (zzgenVar.zza() >= 16) {
            zzgaz.zzn(zzgenVar.zzg());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
