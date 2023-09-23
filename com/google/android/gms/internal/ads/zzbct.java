package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbct {
    private final Runnable zza = new zzbcp(this);
    private final Object zzb = new Object();
    private zzbcw zzc;
    private Context zzd;
    private zzbcz zze;

    public static /* bridge */ /* synthetic */ void zzh(zzbct zzbctVar) {
        synchronized (zzbctVar.zzb) {
            zzbcw zzbcwVar = zzbctVar.zzc;
            if (zzbcwVar == null) {
                return;
            }
            if (zzbcwVar.isConnected() || zzbctVar.zzc.isConnecting()) {
                zzbctVar.zzc.disconnect();
            }
            zzbctVar.zzc = null;
            zzbctVar.zze = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        synchronized (this.zzb) {
            if (this.zzd != null && this.zzc == null) {
                zzbcw zzd = zzd(new zzbcr(this), new zzbcs(this));
                this.zzc = zzd;
                zzd.checkAvailabilityAndConnect();
            }
        }
    }

    public final long zza(zzbcx zzbcxVar) {
        synchronized (this.zzb) {
            if (this.zze == null) {
                return -2L;
            }
            if (this.zzc.zzp()) {
                try {
                    return this.zze.zze(zzbcxVar);
                } catch (RemoteException e2) {
                    zzcfi.zzh("Unable to call into cache service.", e2);
                }
            }
            return -2L;
        }
    }

    public final zzbcu zzb(zzbcx zzbcxVar) {
        synchronized (this.zzb) {
            if (this.zze == null) {
                return new zzbcu();
            }
            try {
                if (this.zzc.zzp()) {
                    return this.zze.zzg(zzbcxVar);
                }
                return this.zze.zzf(zzbcxVar);
            } catch (RemoteException e2) {
                zzcfi.zzh("Unable to call into cache service.", e2);
                return new zzbcu();
            }
        }
    }

    @VisibleForTesting
    public final synchronized zzbcw zzd(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzbcw(this.zzd, com.google.android.gms.ads.internal.zzt.zzt().zzb(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    public final void zzi(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzd != null) {
                return;
            }
            this.zzd = context.getApplicationContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdk)).booleanValue()) {
                zzl();
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdj)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzb().zzc(new zzbcq(this));
                }
            }
        }
    }

    public final void zzj() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdl)).booleanValue()) {
            synchronized (this.zzb) {
                zzl();
                zzfnu zzfnuVar = com.google.android.gms.ads.internal.util.zzs.zza;
                zzfnuVar.removeCallbacks(this.zza);
                zzfnuVar.postDelayed(this.zza, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdm)).longValue());
            }
        }
    }
}
