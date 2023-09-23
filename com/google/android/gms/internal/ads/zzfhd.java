package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfhd implements zzdip, zzdci, zzdit {
    private final zzfhq zza;
    private final zzfhg zzb;

    public zzfhd(Context context, zzfhq zzfhqVar) {
        this.zza = zzfhqVar;
        this.zzb = zzfhf.zza(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzdit
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdit
    public final void zzb() {
        if (((Boolean) zzbjh.zzd.zze()).booleanValue()) {
            zzfhq zzfhqVar = this.zza;
            zzfhg zzfhgVar = this.zzb;
            zzfhgVar.zze(true);
            zzfhqVar.zza(zzfhgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdip
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdip
    public final void zzf() {
        if (((Boolean) zzbjh.zzd.zze()).booleanValue()) {
            this.zzb.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdci
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbjh.zzd.zze()).booleanValue()) {
            zzfhq zzfhqVar = this.zza;
            zzfhg zzfhgVar = this.zzb;
            zzfhgVar.zze(false);
            zzfhqVar.zza(zzfhgVar);
        }
    }
}
