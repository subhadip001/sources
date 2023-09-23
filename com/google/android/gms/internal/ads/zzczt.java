package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzczt implements zzgpu {
    private final zzczs zza;
    private final zzgqh zzb;
    private final zzgqh zzc;

    public zzczt(zzczs zzczsVar, zzgqh zzgqhVar, zzgqh zzgqhVar2) {
        this.zza = zzczsVar;
        this.zzb = zzgqhVar;
        this.zzc = zzgqhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new com.google.android.gms.ads.internal.zzb((Context) this.zzb.zzb(), (zzccj) this.zzc.zzb(), null);
    }
}
