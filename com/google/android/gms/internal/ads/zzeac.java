package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeac implements zzgpu {
    private final zzgqh zza;

    public zzeac(zzgqh zzgqhVar) {
        this.zza = zzgqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    /* renamed from: zza */
    public final String zzb() {
        String packageName = ((zzfdh) this.zza).zza().getPackageName();
        zzgqc.zzb(packageName);
        return packageName;
    }
}
