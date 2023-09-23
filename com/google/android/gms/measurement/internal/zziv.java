package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class zziv implements Runnable {
    public final /* synthetic */ zzq zza;
    public final /* synthetic */ Bundle zzb;
    public final /* synthetic */ zzjm zzc;

    public zziv(zzjm zzjmVar, zzq zzqVar, Bundle bundle) {
        this.zzc = zzjmVar;
        this.zza = zzqVar;
        this.zzb = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        zzjm zzjmVar = this.zzc;
        zzdxVar = zzjmVar.zzb;
        if (zzdxVar == null) {
            a.J(zzjmVar.zzt, "Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzdxVar.zzr(this.zzb, this.zza);
        } catch (RemoteException e2) {
            this.zzc.zzt.zzay().zzd().zzb("Failed to send default event parameters to service", e2);
        }
    }
}
