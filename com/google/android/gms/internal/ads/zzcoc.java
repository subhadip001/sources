package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcoc implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;

    public zzcoc(zzgqh zzgqhVar, zzgqh zzgqhVar2) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    /* renamed from: zza */
    public final zzcaf zzb() {
        Context zza = ((zzcnk) this.zza).zza();
        zzfhs zzfhsVar = (zzfhs) this.zzb.zzb();
        zzbsz zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(zza, zzcfo.zza(), zzfhsVar);
        zzbst zzbstVar = zzbsw.zza;
        zzb.zza("google.afma.request.getAdDictionary", zzbstVar, zzbstVar);
        return new zzcae(zza, com.google.android.gms.ads.internal.zzt.zzf().zzb(zza, zzcfo.zza(), zzfhsVar).zza("google.afma.sdkConstants.getSdkConstants", zzbstVar, zzbstVar));
    }
}
