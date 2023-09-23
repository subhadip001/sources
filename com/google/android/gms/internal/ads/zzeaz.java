package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeaz extends zzeax {
    public zzeaz(Context context) {
        this.zzf = new zzbzf(context, com.google.android.gms.ads.internal.zzt.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzf(this.zze, new zzeaw(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zze(new zzebm(1));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "RemoteSignalsClientTask.onConnected");
                    this.zza.zze(new zzebm(1));
                }
            }
        }
    }
}
