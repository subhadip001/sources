package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdzt implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;

    public zzdzt(zzgqh zzgqhVar, zzgqh zzgqhVar2, zzgqh zzgqhVar3) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
        this.zzc = zzgqhVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        final zzaoc zzaocVar = (zzaoc) this.zza.zzb();
        final Context zza = ((zzfdh) this.zzb).zza();
        zzfvk zzfvkVar = zzcfv.zza;
        zzgqc.zzb(zzfvkVar);
        zzfvj zzb = zzfvkVar.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzaoc zzaocVar2 = zzaoc.this;
                return zzaocVar2.zzc().zzg(zza);
            }
        });
        zzgqc.zzb(zzb);
        return zzb;
    }
}
