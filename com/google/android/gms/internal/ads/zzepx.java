package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzepx implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;

    public zzepx(zzgqh zzgqhVar, zzgqh zzgqhVar2) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzfdh) this.zza).zza();
        zzfvk zzfvkVar = zzcfv.zza;
        zzgqc.zzb(zzfvkVar);
        return new zzepw(zza, zzfvkVar);
    }
}
