package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class zzja implements Runnable {
    public final /* synthetic */ zzq zza;
    public final /* synthetic */ zzjm zzb;

    public zzja(zzjm zzjmVar, zzq zzqVar) {
        this.zzb = zzjmVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        zzjm zzjmVar = this.zzb;
        zzdxVar = zzjmVar.zzb;
        if (zzdxVar == null) {
            a.J(zzjmVar.zzt, "Failed to send consent settings to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzdxVar.zzp(this.zza);
            this.zzb.zzQ();
        } catch (RemoteException e2) {
            this.zzb.zzt.zzay().zzd().zzb("Failed to send consent settings to the service", e2);
        }
    }
}
