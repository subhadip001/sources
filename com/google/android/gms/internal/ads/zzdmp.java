package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdmp implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;

    public zzdmp(zzgqh zzgqhVar, zzgqh zzgqhVar2) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcfo zza = ((zzcnu) this.zza).zza();
        com.google.android.gms.ads.internal.zzt.zzp();
        return new zzbai(UUID.randomUUID().toString(), zza, "native", new JSONObject(), false, true);
    }
}
