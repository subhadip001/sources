package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzete {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfhq zzd;
    private final zzdwg zze;

    public zzete(Context context, Executor executor, Set set, zzfhq zzfhqVar, zzdwg zzdwgVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfhqVar;
        this.zze = zzdwgVar;
    }

    public final zzfvj zza(final Object obj) {
        zzfhg zza = zzfhf.zza(this.zza, 8);
        zza.zzf();
        final ArrayList arrayList = new ArrayList(this.zzb.size());
        for (final zzetb zzetbVar : this.zzb) {
            zzfvj zzb = zzetbVar.zzb();
            zzb.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzetc
                @Override // java.lang.Runnable
                public final void run() {
                    zzete.this.zzb(zzetbVar);
                }
            }, zzcfv.zzf);
            arrayList.add(zzb);
        }
        zzfvj zza2 = zzfva.zzc(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzetd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<zzfvj> list = arrayList;
                Object obj2 = obj;
                for (zzfvj zzfvjVar : list) {
                    zzeta zzetaVar = (zzeta) zzfvjVar.get();
                    if (zzetaVar != null) {
                        zzetaVar.zzf(obj2);
                    }
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfhs.zza()) {
            zzfhp.zza(zza2, this.zzd, zza);
        }
        return zza2;
    }

    public final /* synthetic */ void zzb(zzetb zzetbVar) {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
        if (((Boolean) zzbjr.zza.zze()).booleanValue()) {
            String zzc = zzfpg.zzc(zzetbVar.getClass().getCanonicalName());
            com.google.android.gms.ads.internal.util.zze.zza("Signal runtime (ms) : " + zzc + " = " + elapsedRealtime);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbM)).booleanValue()) {
            zzdwf zza = this.zze.zza();
            zza.zzb("action", "lat_ms");
            zza.zzb("lat_grp", "sig_lat_grp");
            zza.zzb("lat_id", String.valueOf(zzetbVar.zza()));
            zza.zzb("clat_ms", String.valueOf(elapsedRealtime));
            zza.zzh();
        }
    }
}
