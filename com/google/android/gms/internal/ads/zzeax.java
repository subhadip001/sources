package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzeax implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public final zzcga zza = new zzcga();
    public final Object zzb = new Object();
    public boolean zzc = false;
    public boolean zzd = false;
    public zzbzu zze;
    public zzbzf zzf;

    public void onConnectionFailed(ConnectionResult connectionResult) {
        zzcfi.zze("Disconnected from remote ad request service.");
        this.zza.zze(new zzebm(1));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
        zzcfi.zze("Cannot connect to remote service, fallback to local instance.");
    }

    public final void zza() {
        synchronized (this.zzb) {
            this.zzd = true;
            if (this.zzf.isConnected() || this.zzf.isConnecting()) {
                this.zzf.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }
}
