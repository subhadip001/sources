package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeku implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;

    public zzeku(zzgqh zzgqhVar, zzgqh zzgqhVar2) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    /* renamed from: zza */
    public final zzekt zzb() {
        return new zzekt((Context) this.zza.zzb(), (zzdkx) this.zzb.zzb());
    }
}
