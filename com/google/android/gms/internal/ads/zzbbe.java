package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbbe implements Application.ActivityLifecycleCallbacks {
    private Activity zza;
    private Context zzb;
    private Runnable zzh;
    private long zzj;
    private final Object zzc = new Object();
    private boolean zzd = true;
    private boolean zze = false;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private boolean zzi = false;

    private final void zzk(Activity activity) {
        synchronized (this.zzc) {
            if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                this.zza = activity;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.zzc) {
            Activity activity2 = this.zza;
            if (activity2 != null) {
                if (activity2.equals(activity)) {
                    this.zza = null;
                }
                Iterator it = this.zzg.iterator();
                while (it.hasNext()) {
                    try {
                        if (((zzbbt) it.next()).zza()) {
                            it.remove();
                        }
                    } catch (Exception e2) {
                        com.google.android.gms.ads.internal.zzt.zzo().zzt(e2, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        zzcfi.zzh("", e2);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzk(activity);
        synchronized (this.zzc) {
            for (zzbbt zzbbtVar : this.zzg) {
                try {
                    zzbbtVar.zzb();
                } catch (Exception e2) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzt(e2, "AppActivityTracker.ActivityListener.onActivityPaused");
                    zzcfi.zzh("", e2);
                }
            }
        }
        this.zze = true;
        Runnable runnable = this.zzh;
        if (runnable != null) {
            com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(runnable);
        }
        zzfnu zzfnuVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzbbd zzbbdVar = new zzbbd(this);
        this.zzh = zzbbdVar;
        zzfnuVar.postDelayed(zzbbdVar, this.zzj);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzk(activity);
        this.zze = false;
        boolean z = !this.zzd;
        this.zzd = true;
        Runnable runnable = this.zzh;
        if (runnable != null) {
            com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(runnable);
        }
        synchronized (this.zzc) {
            for (zzbbt zzbbtVar : this.zzg) {
                try {
                    zzbbtVar.zzc();
                } catch (Exception e2) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzt(e2, "AppActivityTracker.ActivityListener.onActivityResumed");
                    zzcfi.zzh("", e2);
                }
            }
            if (z) {
                for (zzbbf zzbbfVar : this.zzf) {
                    try {
                        zzbbfVar.zza(true);
                    } catch (Exception e3) {
                        zzcfi.zzh("", e3);
                    }
                }
            } else {
                zzcfi.zze("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zzk(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public final Activity zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzb;
    }

    public final void zzf(zzbbf zzbbfVar) {
        synchronized (this.zzc) {
            this.zzf.add(zzbbfVar);
        }
    }

    public final void zzg(Application application, Context context) {
        if (this.zzi) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            zzk((Activity) context);
        }
        this.zzb = application;
        this.zzj = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzaM)).longValue();
        this.zzi = true;
    }

    public final void zzh(zzbbf zzbbfVar) {
        synchronized (this.zzc) {
            this.zzf.remove(zzbbfVar);
        }
    }
}
