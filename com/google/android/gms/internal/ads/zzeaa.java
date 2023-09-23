package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeaa implements zzgpu {
    public static zzeaa zza() {
        zzeaa zzeaaVar;
        zzeaaVar = zzdzz.zza;
        return zzeaaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* synthetic */ Object zzb() {
        String valueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzaw.zze().nextInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER);
        zzgqc.zzb(valueOf);
        return valueOf;
    }
}
