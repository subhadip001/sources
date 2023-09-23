package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdbc {
    private Context zza;
    private zzfby zzb;
    private Bundle zzc;
    private zzfbt zzd;

    public final zzdbc zzc(Context context) {
        this.zza = context;
        return this;
    }

    public final zzdbc zzd(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzdbc zze(zzfbt zzfbtVar) {
        this.zzd = zzfbtVar;
        return this;
    }

    public final zzdbc zzf(zzfby zzfbyVar) {
        this.zzb = zzfbyVar;
        return this;
    }

    public final zzdbe zzg() {
        return new zzdbe(this, null);
    }
}
