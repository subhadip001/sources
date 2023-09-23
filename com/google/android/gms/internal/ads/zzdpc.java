package com.google.android.gms.internal.ads;

import e.f.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdpc implements zzdcm {
    private final zzdng zza;
    private final zzdnl zzb;

    public zzdpc(zzdng zzdngVar, zzdnl zzdnlVar) {
        this.zza = zzdngVar;
        this.zzb = zzdnlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcm
    public final void zzl() {
        zzdng zzdngVar = this.zza;
        if (zzdngVar.zzu() == null) {
            return;
        }
        zzcli zzq = zzdngVar.zzq();
        zzcli zzr = zzdngVar.zzr();
        if (zzq == null) {
            zzq = zzr == null ? null : zzr;
        }
        if (!this.zzb.zzd() || zzq == null) {
            return;
        }
        zzq.zzd("onSdkImpression", new a());
    }
}
