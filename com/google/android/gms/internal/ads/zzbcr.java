package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbcr implements BaseGmsClient.BaseConnectionCallbacks {
    public final /* synthetic */ zzbct zza;

    public zzbcr(zzbct zzbctVar) {
        this.zza = zzbctVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        Object obj2;
        zzbcw zzbcwVar;
        zzbcw zzbcwVar2;
        obj = this.zza.zzb;
        synchronized (obj) {
            try {
                zzbct zzbctVar = this.zza;
                zzbcwVar = zzbctVar.zzc;
                if (zzbcwVar != null) {
                    zzbcwVar2 = zzbctVar.zzc;
                    zzbctVar.zze = zzbcwVar2.zzq();
                }
            } catch (DeadObjectException e2) {
                zzcfi.zzh("Unable to obtain a cache service instance.", e2);
                zzbct.zzh(this.zza);
            }
            obj2 = this.zza.zzb;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
        Object obj;
        Object obj2;
        obj = this.zza.zzb;
        synchronized (obj) {
            this.zza.zze = null;
            obj2 = this.zza.zzb;
            obj2.notifyAll();
        }
    }
}
