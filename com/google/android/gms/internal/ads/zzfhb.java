package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfhb implements zzfgo {
    private final zzfgy zza;
    private final zzfgw zzb;

    public zzfhb(zzfgy zzfgyVar, zzfgw zzfgwVar) {
        this.zza = zzfgyVar;
        this.zzb = zzfgwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final String zza(zzfgn zzfgnVar) {
        zzfgy zzfgyVar = this.zza;
        Map zzj = zzfgnVar.zzj();
        this.zzb.zza(zzj);
        return zzfgyVar.zza(zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzb(zzfgn zzfgnVar) {
    }
}
