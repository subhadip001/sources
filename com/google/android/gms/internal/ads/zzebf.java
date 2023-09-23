package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzebf implements zzden {
    private final Context zza;
    private final zzcdn zzb;

    public zzebf(Context context, zzcdn zzcdnVar) {
        this.zza = context;
        this.zzb = zzcdnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzb(zzfbs zzfbsVar) {
        if (TextUtils.isEmpty(zzfbsVar.zzb.zzb.zzd)) {
            return;
        }
        this.zzb.zzp(this.zza, zzfbsVar.zza.zza.zzd);
        this.zzb.zzl(this.zza, zzfbsVar.zzb.zzb.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzbE(zzbzu zzbzuVar) {
    }
}
