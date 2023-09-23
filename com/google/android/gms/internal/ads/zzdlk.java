package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdlk implements zzdbs, zzdip {
    private final zzccv zza;
    private final Context zzb;
    private final zzcdn zzc;
    private final View zzd;
    private String zze;
    private final zzbdv zzf;

    public zzdlk(zzccv zzccvVar, Context context, zzcdn zzcdnVar, View view, zzbdv zzbdvVar) {
        this.zza = zzccvVar;
        this.zzb = context;
        this.zzc = zzcdnVar;
        this.zzd = view;
        this.zzf = zzbdvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzbv() {
    }

    @Override // com.google.android.gms.internal.ads.zzdip
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdip
    public final void zzf() {
        if (this.zzf == zzbdv.APP_OPEN) {
            return;
        }
        String zzd = this.zzc.zzd(this.zzb);
        this.zze = zzd;
        this.zze = String.valueOf(zzd).concat(this.zzf == zzbdv.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzj() {
        this.zza.zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzo() {
        View view = this.zzd;
        if (view != null && this.zze != null) {
            this.zzc.zzs(view.getContext(), this.zze);
        }
        this.zza.zzb(true);
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzp(zzcak zzcakVar, String str, String str2) {
        if (this.zzc.zzu(this.zzb)) {
            try {
                zzcdn zzcdnVar = this.zzc;
                Context context = this.zzb;
                zzcdnVar.zzo(context, zzcdnVar.zza(context), this.zza.zza(), zzcakVar.zzc(), zzcakVar.zzb());
            } catch (RemoteException e2) {
                zzcfi.zzk("Remote Exception to get reward item.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzr() {
    }
}
