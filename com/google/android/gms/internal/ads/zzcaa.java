package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcaa implements Callable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzcac zzb;

    public zzcaa(zzcac zzcacVar, Context context) {
        this.zzb = zzcacVar;
        this.zza = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        WeakHashMap weakHashMap;
        zzbzz zza;
        WeakHashMap weakHashMap2;
        weakHashMap = this.zzb.zza;
        zzcab zzcabVar = (zzcab) weakHashMap.get(this.zza);
        if (zzcabVar != null) {
            if (((Long) zzbje.zza.zze()).longValue() + zzcabVar.zza >= com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()) {
                zza = new zzbzy(this.zza, zzcabVar.zzb).zza();
                zzcac zzcacVar = this.zzb;
                weakHashMap2 = zzcacVar.zza;
                weakHashMap2.put(this.zza, new zzcab(zzcacVar, zza));
                return zza;
            }
        }
        zza = new zzbzy(this.zza).zza();
        zzcac zzcacVar2 = this.zzb;
        weakHashMap2 = zzcacVar2.zza;
        weakHashMap2.put(this.zza, new zzcab(zzcacVar2, zza));
        return zza;
    }
}
