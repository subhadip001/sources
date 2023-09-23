package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbbd implements Runnable {
    public final /* synthetic */ zzbbe zza;

    public zzbbd(zzbbe zzbbeVar) {
        this.zza = zzbbeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List<zzbbf> list;
        obj = this.zza.zzc;
        synchronized (obj) {
            zzbbe zzbbeVar = this.zza;
            z = zzbbeVar.zzd;
            if (z) {
                z2 = zzbbeVar.zze;
                if (z2) {
                    zzbbeVar.zzd = false;
                    zzcfi.zze("App went background");
                    list = this.zza.zzf;
                    for (zzbbf zzbbfVar : list) {
                        try {
                            zzbbfVar.zza(false);
                        } catch (Exception e2) {
                            zzcfi.zzh("", e2);
                        }
                    }
                }
            }
            zzcfi.zze("App is still foreground");
        }
    }
}
