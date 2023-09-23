package com.google.android.gms.internal.ads;

import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeaf implements zzgpu {
    public static zzeaf zza() {
        zzeaf zzeafVar;
        zzeafVar = zzeae.zza;
        return zzeafVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* synthetic */ Object zzb() {
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzgqc.zzb(uuid);
        return uuid;
    }
}
