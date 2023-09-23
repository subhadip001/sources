package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfxv extends zzgap {
    public final /* synthetic */ zzfxw zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfxv(zzfxw zzfxwVar, Class cls) {
        super(cls);
        this.zza = zzfxwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* bridge */ /* synthetic */ zzgly zza(zzgly zzglyVar) {
        zzgci zzgciVar = (zzgci) zzglyVar;
        zzgce zzc = zzgcf.zzc();
        zzc.zza(zzgjg.zzv(zzgii.zza(zzgciVar.zza())));
        zzc.zzb(zzgciVar.zzf());
        zzc.zzc(0);
        return (zzgcf) zzc.zzaj();
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) {
        return zzgci.zze(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final Map zzc() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", zzfxw.zzg(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", zzfxw.zzg(16, 16, 3));
        hashMap.put("AES256_EAX", zzfxw.zzg(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", zzfxw.zzg(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* bridge */ /* synthetic */ void zzd(zzgly zzglyVar) {
        zzgci zzgciVar = (zzgci) zzglyVar;
        zzgik.zza(zzgciVar.zza());
        if (zzgciVar.zzf().zza() != 12 && zzgciVar.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
