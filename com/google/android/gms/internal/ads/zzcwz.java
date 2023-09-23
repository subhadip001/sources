package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcwz implements zzgpu {
    private final zzgqh zza;

    public zzcwz(zzgqh zzgqhVar) {
        this.zza = zzgqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    /* renamed from: zza */
    public final Boolean zzb() {
        boolean z = true;
        if (((zzdbj) this.zza).zza().zza() == null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzey)).booleanValue()) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
