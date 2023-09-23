package com.google.android.gms.internal.ads;

import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfzl extends zzgap {
    public final /* synthetic */ zzfzm zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzl(zzfzm zzfzmVar, Class cls) {
        super(cls);
        this.zza = zzfzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* bridge */ /* synthetic */ zzgly zza(zzgly zzglyVar) {
        zzgdr zzgdrVar = (zzgdr) zzglyVar;
        KeyPair zzb = zzgho.zzb(zzgho.zze(zzfzv.zzc(zzgdrVar.zze().zzf().zzg())));
        ECPoint w = ((ECPublicKey) zzb.getPublic()).getW();
        zzgdz zzd = zzgea.zzd();
        zzd.zzb(0);
        zzd.zza(zzgdrVar.zze());
        zzd.zzc(zzgjg.zzv(w.getAffineX().toByteArray()));
        zzd.zzd(zzgjg.zzv(w.getAffineY().toByteArray()));
        zzgdw zzc = zzgdx.zzc();
        zzc.zzc(0);
        zzc.zzb((zzgea) zzd.zzaj());
        zzc.zza(zzgjg.zzv(((ECPrivateKey) zzb.getPrivate()).getS().toByteArray()));
        return (zzgdx) zzc.zzaj();
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) {
        return zzgdr.zzd(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final Map zzc() {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        HashMap hashMap = new HashMap();
        zzfwp zza = zzfwq.zza("AES128_GCM");
        bArr = zzfzm.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zzfzm.zzh(4, 5, 3, zza, bArr, 1));
        zzfwp zza2 = zzfwq.zza("AES128_GCM");
        bArr2 = zzfzm.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzfzm.zzh(4, 5, 3, zza2, bArr2, 3));
        zzfwp zza3 = zzfwq.zza("AES128_GCM");
        bArr3 = zzfzm.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zzfzm.zzh(4, 5, 4, zza3, bArr3, 1));
        zzfwp zza4 = zzfwq.zza("AES128_GCM");
        bArr4 = zzfzm.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzfzm.zzh(4, 5, 4, zza4, bArr4, 3));
        zzfwp zza5 = zzfwq.zza("AES128_GCM");
        bArr5 = zzfzm.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzfzm.zzh(4, 5, 4, zza5, bArr5, 3));
        zzfwp zza6 = zzfwq.zza("AES128_CTR_HMAC_SHA256");
        bArr6 = zzfzm.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzfzm.zzh(4, 5, 3, zza6, bArr6, 1));
        zzfwp zza7 = zzfwq.zza("AES128_CTR_HMAC_SHA256");
        bArr7 = zzfzm.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzfzm.zzh(4, 5, 3, zza7, bArr7, 3));
        zzfwp zza8 = zzfwq.zza("AES128_CTR_HMAC_SHA256");
        bArr8 = zzfzm.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzfzm.zzh(4, 5, 4, zza8, bArr8, 1));
        zzfwp zza9 = zzfwq.zza("AES128_CTR_HMAC_SHA256");
        bArr9 = zzfzm.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzfzm.zzh(4, 5, 4, zza9, bArr9, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* synthetic */ void zzd(zzgly zzglyVar) {
        zzfzv.zza(((zzgdr) zzglyVar).zze());
    }
}
