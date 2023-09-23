package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzanw implements Runnable {
    public final /* synthetic */ zzanx zza;

    public zzanw(zzanx zzanxVar) {
        this.zza = zzanxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z;
        zzapc zzapcVar;
        ConditionVariable conditionVariable2;
        if (this.zza.zzb != null) {
            return;
        }
        conditionVariable = zzanx.zzc;
        synchronized (conditionVariable) {
            if (this.zza.zzb != null) {
                return;
            }
            boolean z2 = false;
            try {
                z = ((Boolean) zzbhy.zzca.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                z = false;
            }
            if (z) {
                try {
                    zzapcVar = this.zza.zze;
                    zzanx.zza = zzfmu.zzb(zzapcVar.zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z2 = z;
            this.zza.zzb = Boolean.valueOf(z2);
            conditionVariable2 = zzanx.zzc;
            conditionVariable2.open();
        }
    }
}
