package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzddj implements zzgpu {
    private final zzgqh zza;

    public zzddj(zzgqh zzgqhVar) {
        this.zza = zzgqhVar;
    }

    public static zzddi zzc(Set set) {
        return new zzddi(set);
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    /* renamed from: zza */
    public final zzddi zzb() {
        return new zzddi(((zzgqf) this.zza).zzb());
    }
}
