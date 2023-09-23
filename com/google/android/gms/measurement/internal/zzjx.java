package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class zzjx implements Runnable {
    public final long zza;
    public final long zzb;
    public final /* synthetic */ zzjy zzc;

    public zzjx(zzjy zzjyVar, long j2, long j3) {
        this.zzc = zzjyVar;
        this.zza = j2;
        this.zzb = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzt.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjw
            @Override // java.lang.Runnable
            public final void run() {
                zzjx zzjxVar = zzjx.this;
                zzjy zzjyVar = zzjxVar.zzc;
                long j2 = zzjxVar.zza;
                long j3 = zzjxVar.zzb;
                zzjyVar.zza.zzg();
                zzjyVar.zza.zzt.zzay().zzc().zza("Application going to the background");
                zzjyVar.zza.zzt.zzm().zzm.zza(true);
                Bundle bundle = new Bundle();
                if (!zzjyVar.zza.zzt.zzf().zzu()) {
                    zzjyVar.zza.zzb.zzb(j3);
                    zzjyVar.zza.zzb.zzd(false, false, j3);
                }
                zzjyVar.zza.zzt.zzq().zzH("auto", "_ab", j2, bundle);
            }
        });
    }
}
