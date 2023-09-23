package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzdwn {
    public final Executor zzc;
    public final zzcfn zzd;
    private final zzfgy zzf;
    public final String zza = (String) zzbji.zzb.zze();
    public final Map zzb = new HashMap();
    public final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbJ)).booleanValue();
    private final boolean zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbM)).booleanValue();
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfX)).booleanValue();

    public zzdwn(Executor executor, zzcfn zzcfnVar, zzfgy zzfgyVar) {
        this.zzc = executor;
        this.zzd = zzcfnVar;
        this.zzf = zzfgyVar;
    }

    private final void zza(Map map, boolean z) {
        if (!map.isEmpty()) {
            final String zza = this.zzf.zza(map);
            com.google.android.gms.ads.internal.util.zze.zza(zza);
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
            if (this.zze) {
                if (!z || this.zzg) {
                    if (!parseBoolean || this.zzh) {
                        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwm
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdwn zzdwnVar = zzdwn.this;
                                zzdwnVar.zzd.zza(zza);
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        zzcfi.zze("Empty paramMap.");
    }

    public final String zzb(Map map) {
        return this.zzf.zza(map);
    }

    public final ConcurrentHashMap zzc() {
        return new ConcurrentHashMap(this.zzb);
    }

    public final void zzd(Map map) {
        zza(map, true);
    }

    public final void zze(Map map) {
        zza(map, false);
    }
}
