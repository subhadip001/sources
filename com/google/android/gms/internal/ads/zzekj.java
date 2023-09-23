package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzekj implements com.google.android.gms.ads.internal.zzf {
    public final /* synthetic */ zzcga zza;
    public final /* synthetic */ zzfbs zzb;
    public final /* synthetic */ zzfbg zzc;
    public final /* synthetic */ zzekp zzd;
    public final /* synthetic */ zzekk zze;

    public zzekj(zzekk zzekkVar, zzcga zzcgaVar, zzfbs zzfbsVar, zzfbg zzfbgVar, zzekp zzekpVar) {
        this.zze = zzekkVar;
        this.zza = zzcgaVar;
        this.zzb = zzfbsVar;
        this.zzc = zzfbgVar;
        this.zzd = zzekpVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
        zzekt zzektVar;
        zzcga zzcgaVar = this.zza;
        zzektVar = this.zze.zzd;
        zzcgaVar.zzd(zzektVar.zza(this.zzb, this.zzc, view, this.zzd));
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
    }
}
