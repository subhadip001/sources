package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcnl implements zzgpu {
    private final zzcni zza;

    public zzcnl(zzcni zzcniVar) {
        this.zza = zzcniVar;
    }

    public final WeakReference zza() {
        WeakReference zzf = this.zza.zzf();
        zzgqc.zzb(zzf);
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* synthetic */ Object zzb() {
        WeakReference zzf = this.zza.zzf();
        zzgqc.zzb(zzf);
        return zzf;
    }
}
