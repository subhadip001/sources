package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfgu implements zzfgo {
    private final zzfgy zza;
    private final zzfgw zzb;
    private final zzfgl zzc;

    public zzfgu(zzfgl zzfglVar, zzfgy zzfgyVar, zzfgw zzfgwVar, byte[] bArr) {
        this.zzc = zzfglVar;
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
        this.zzc.zzb(zza(zzfgnVar));
    }
}
