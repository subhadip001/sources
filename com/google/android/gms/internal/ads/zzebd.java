package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzebd extends zzeax {
    private String zzg;
    private int zzh = 1;

    public zzebd(Context context) {
        this.zzf = new zzbzf(context, com.google.android.gms.ads.internal.zzt.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    int i2 = this.zzh;
                    if (i2 == 2) {
                        this.zzf.zzp().zze(this.zze, new zzeaw(this));
                    } else if (i2 == 3) {
                        this.zzf.zzp().zzh(this.zzg, new zzeaw(this));
                    } else {
                        this.zza.zze(new zzebm(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zze(new zzebm(1));
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeax, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzcfi.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zze(new zzebm(1));
    }

    public final zzfvj zzb(zzbzu zzbzuVar) {
        synchronized (this.zzb) {
            int i2 = this.zzh;
            if (i2 != 1 && i2 != 2) {
                return zzfva.zzh(new zzebm(2));
            } else if (this.zzc) {
                return this.zza;
            } else {
                this.zzh = 2;
                this.zzc = true;
                this.zze = zzbzuVar;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebc
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzebd.this.zza();
                    }
                }, zzcfv.zzf);
                return this.zza;
            }
        }
    }

    public final zzfvj zzc(String str) {
        synchronized (this.zzb) {
            int i2 = this.zzh;
            if (i2 != 1 && i2 != 3) {
                return zzfva.zzh(new zzebm(2));
            } else if (this.zzc) {
                return this.zza;
            } else {
                this.zzh = 3;
                this.zzc = true;
                this.zzg = str;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebb
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzebd.this.zza();
                    }
                }, zzcfv.zzf);
                return this.zza;
            }
        }
    }
}
