package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzffm {
    public final /* synthetic */ zzffw zza;
    private final Object zzb;
    private final List zzc;

    public /* synthetic */ zzffm(zzffw zzffwVar, Object obj, List list, zzffl zzfflVar) {
        this.zza = zzffwVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzffv zza(Callable callable) {
        zzfvk zzfvkVar;
        zzfuz zzc = zzfva.zzc(this.zzc);
        zzfvj zza = zzc.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzffk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zzcfv.zzf);
        zzffw zzffwVar = this.zza;
        Object obj = this.zzb;
        List list = this.zzc;
        zzfvkVar = zzffwVar.zzb;
        return new zzffv(zzffwVar, obj, zza, list, zzc.zza(callable, zzfvkVar));
    }
}
