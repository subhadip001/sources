package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzehd implements zzdlf {
    private final zzfbg zza;
    private final zzbvs zzb;
    private final boolean zzc;
    private zzdck zzd = null;

    public zzehd(zzfbg zzfbgVar, zzbvs zzbvsVar, boolean z) {
        this.zza = zzfbgVar;
        this.zzb = zzbvsVar;
        this.zzc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzdlf
    public final void zza(boolean z, Context context, zzdcf zzdcfVar) {
        try {
            if (this.zzc ? this.zzb.zzr(ObjectWrapper.wrap(context)) : this.zzb.zzq(ObjectWrapper.wrap(context))) {
                if (this.zzd == null) {
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbp)).booleanValue() || this.zza.zzZ != 2) {
                    return;
                }
                this.zzd.zza();
                return;
            }
            throw new zzdle("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdle(th);
        }
    }

    public final void zzb(zzdck zzdckVar) {
        this.zzd = zzdckVar;
    }
}
