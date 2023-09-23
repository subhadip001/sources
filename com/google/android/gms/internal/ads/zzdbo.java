package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdbo implements zzgpu {
    private final zzdbn zza;
    private final zzgqh zzb;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;

    public zzdbo(zzdbn zzdbnVar, zzgqh zzgqhVar, zzgqh zzgqhVar2, zzgqh zzgqhVar3, zzgqh zzgqhVar4) {
        this.zza = zzdbnVar;
        this.zzb = zzgqhVar;
        this.zzc = zzgqhVar2;
        this.zzd = zzgqhVar3;
        this.zze = zzgqhVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.zzb.zzb();
        zzcfo zza = ((zzcnu) this.zzc).zza();
        zzfbg zza2 = ((zzcym) this.zzd).zza();
        zzccf zzccfVar = new zzccf();
        if (zza2.zzB != null) {
            return new zzccd(context, zza, zza2.zzB, zza2.zzt.zzb, zzccfVar, null);
        }
        return null;
    }
}
