package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfzk extends zzgaq {
    public zzfzk(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzgaq
    public final /* bridge */ /* synthetic */ Object zza(zzgly zzglyVar) {
        zzgdx zzgdxVar = (zzgdx) zzglyVar;
        zzgdu zzc = zzgdxVar.zzf().zzc();
        zzged zzf = zzc.zzf();
        int zzc2 = zzfzv.zzc(zzf.zzg());
        byte[] zzE = zzgdxVar.zzg().zzE();
        return new zzghj((ECPrivateKey) ((KeyFactory) zzghq.zzg.zza("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, zzE), zzgho.zze(zzc2))), zzf.zze().zzE(), zzfzv.zzb(zzf.zzh()), zzfzv.zzd(zzc.zzi()), new zzfzw(zzc.zza().zze()));
    }
}
