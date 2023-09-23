package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaqj extends zzaqm {
    private final View zzi;

    public zzaqj(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i2, int i3, View view) {
        super(zzapcVar, "3NWuanvGeSLpSagLaOAsn/Wjje90r/w2O3UK0Fwg9FAYR9qo+qmBwbA5vWXGCFiO", "Y36p4+OnCZGc4+WeLfFtxuI6ijQbwb2FRBUVzIb1EqM=", zzaliVar, i2, 57);
        this.zzi = view;
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zza() {
        if (this.zzi != null) {
            Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcA);
            Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzil);
            zzapg zzapgVar = new zzapg((String) this.zzf.invoke(null, this.zzi, this.zzb.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzalw zza = zzalx.zza();
            zza.zzb(zzapgVar.zza.longValue());
            zza.zzd(zzapgVar.zzb.longValue());
            zza.zze(zzapgVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zza.zzc(zzapgVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zza.zza(zzapgVar.zzd.longValue());
            }
            this.zze.zzV((zzalx) zza.zzaj());
        }
    }
}
