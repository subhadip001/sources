package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcti implements zzdcn {
    private final zzfct zza;

    public zzcti(zzfct zzfctVar) {
        this.zza = zzfctVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final void zzbq(Context context) {
        try {
            this.zza.zzg();
        } catch (zzfcd e2) {
            zzcfi.zzk("Cannot invoke onDestroy for the mediation adapter.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final void zzbs(Context context) {
        try {
            this.zza.zzs();
        } catch (zzfcd e2) {
            zzcfi.zzk("Cannot invoke onPause for the mediation adapter.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final void zzbt(Context context) {
        try {
            this.zza.zzt();
            if (context != null) {
                this.zza.zzr(context);
            }
        } catch (zzfcd e2) {
            zzcfi.zzk("Cannot invoke onResume for the mediation adapter.", e2);
        }
    }
}
