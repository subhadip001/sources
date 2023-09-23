package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcfn;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzby extends zzb {
    private final zzcfn zza;
    private final String zzb;

    public zzby(Context context, String str, String str2) {
        this.zza = new zzcfn(com.google.android.gms.ads.internal.zzt.zzp().zzc(context, str));
        this.zzb = str2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        this.zza.zza(this.zzb);
    }
}
