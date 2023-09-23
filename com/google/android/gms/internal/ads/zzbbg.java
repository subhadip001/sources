package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbbg {
    private final Object zza = new Object();
    private zzbbe zzb = null;
    private boolean zzc = false;

    public final Activity zza() {
        synchronized (this.zza) {
            zzbbe zzbbeVar = this.zzb;
            if (zzbbeVar != null) {
                return zzbbeVar.zza();
            }
            return null;
        }
    }

    public final Context zzb() {
        synchronized (this.zza) {
            zzbbe zzbbeVar = this.zzb;
            if (zzbbeVar != null) {
                return zzbbeVar.zzb();
            }
            return null;
        }
    }

    public final void zzc(zzbbf zzbbfVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new zzbbe();
            }
            this.zzb.zzf(zzbbfVar);
        }
    }

    public final void zzd(Context context) {
        synchronized (this.zza) {
            if (!this.zzc) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    zzcfi.zzj("Can not cast Context to Application");
                    return;
                }
                if (this.zzb == null) {
                    this.zzb = new zzbbe();
                }
                this.zzb.zzg(application, context);
                this.zzc = true;
            }
        }
    }

    public final void zze(zzbbf zzbbfVar) {
        synchronized (this.zza) {
            zzbbe zzbbeVar = this.zzb;
            if (zzbbeVar == null) {
                return;
            }
            zzbbeVar.zzh(zzbbfVar);
        }
    }
}
