package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcug implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;
    private final zzgqh zzd;

    public zzcug(zzgqh zzgqhVar, zzgqh zzgqhVar2, zzgqh zzgqhVar3, zzgqh zzgqhVar4) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
        this.zzc = zzgqhVar3;
        this.zzd = zzgqhVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        ((zzcym) this.zza).zza();
        zzcfo zza = ((zzcnu) this.zzb).zza();
        JSONObject jSONObject = (JSONObject) this.zzc.zzb();
        String str = (String) this.zzd.zzb();
        boolean equals = "native".equals(str);
        com.google.android.gms.ads.internal.zzt.zzp();
        return new zzbai(UUID.randomUUID().toString(), zza, str, jSONObject, false, equals);
    }
}
