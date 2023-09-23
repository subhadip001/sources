package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfik {
    private boolean zza;

    public final void zza(Context context) {
        zzfjt.zzb(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzfjh.zzb().zzc(context);
        zzfjc.zza().zzc(context);
        zzfjr.zzf(context);
        zzfje.zzb().zzc(context);
    }

    public final boolean zzb() {
        return this.zza;
    }
}
