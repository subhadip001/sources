package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcru implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;

    public zzcru(zzgqh zzgqhVar, zzgqh zzgqhVar2) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* synthetic */ Object zzb() {
        zzbto zzbtoVar = new zzbto();
        String str = (String) this.zzb.zzb();
        return ((Boolean) zzbjp.zza.zze()).booleanValue() ? new zzbtn(zzbtoVar, str) : new zzcfn(str);
    }
}
