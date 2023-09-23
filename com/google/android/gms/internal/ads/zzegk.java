package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzegk implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;

    public zzegk(zzgqh zzgqhVar, zzgqh zzgqhVar2) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    /* renamed from: zza */
    public final zzegj zzb() {
        return new zzegj((Context) this.zza.zzb(), (zzcwr) this.zzb.zzb());
    }
}
