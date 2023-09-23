package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcvo extends zzbce {
    private final zzcvn zza;
    private final com.google.android.gms.ads.internal.client.zzbs zzb;
    private final zzexc zzc;
    private boolean zzd = false;

    public zzcvo(zzcvn zzcvnVar, com.google.android.gms.ads.internal.client.zzbs zzbsVar, zzexc zzexcVar) {
        this.zza = zzcvnVar;
        this.zzb = zzbsVar;
        this.zzc = zzexcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbcf
    public final com.google.android.gms.ads.internal.client.zzbs zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbcf
    public final com.google.android.gms.ads.internal.client.zzdh zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfJ)).booleanValue()) {
            return this.zza.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbcf
    public final void zzg(boolean z) {
        this.zzd = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbcf
    public final void zzh(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        zzexc zzexcVar = this.zzc;
        if (zzexcVar != null) {
            zzexcVar.zzp(zzdeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcf
    public final void zzi(IObjectWrapper iObjectWrapper, zzbcm zzbcmVar) {
        try {
            this.zzc.zzs(zzbcmVar);
            this.zza.zzd((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzbcmVar, this.zzd);
        } catch (RemoteException e2) {
            zzcfi.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcf
    public final void zzj(zzbcj zzbcjVar) {
    }
}
