package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import e.f.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdlg implements zzddg, com.google.android.gms.ads.internal.overlay.zzo {
    @VisibleForTesting
    public IObjectWrapper zza;
    private final Context zzb;
    private final zzcli zzc;
    private final zzfbg zzd;
    private final zzcfo zze;
    private final zzbdv zzf;

    public zzdlg(Context context, zzcli zzcliVar, zzfbg zzfbgVar, zzcfo zzcfoVar, zzbdv zzbdvVar) {
        this.zzb = context;
        this.zzc = zzcliVar;
        this.zzd = zzfbgVar;
        this.zze = zzcfoVar;
        this.zzf = zzbdvVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        zzcli zzcliVar;
        if (this.zza == null || (zzcliVar = this.zzc) == null) {
            return;
        }
        zzcliVar.zzd("onSdkImpression", new a());
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i2) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzddg
    public final void zzn() {
        zzbxq zzbxqVar;
        zzbxq zzbxqVar2;
        zzbxp zzbxpVar;
        zzbdv zzbdvVar = this.zzf;
        if ((zzbdvVar == zzbdv.REWARD_BASED_VIDEO_AD || zzbdvVar == zzbdv.INTERSTITIAL || zzbdvVar == zzbdv.APP_OPEN) && this.zzd.zzU && this.zzc != null && com.google.android.gms.ads.internal.zzt.zzh().zze(this.zzb)) {
            zzcfo zzcfoVar = this.zze;
            String str = zzcfoVar.zzb + "." + zzcfoVar.zzc;
            String zza = this.zzd.zzW.zza();
            if (this.zzd.zzW.zzb() == 1) {
                zzbxpVar = zzbxp.VIDEO;
                zzbxqVar2 = zzbxq.DEFINED_BY_JAVASCRIPT;
            } else {
                if (this.zzd.zzZ == 2) {
                    zzbxqVar = zzbxq.UNSPECIFIED;
                } else {
                    zzbxqVar = zzbxq.BEGIN_TO_RENDER;
                }
                zzbxqVar2 = zzbxqVar;
                zzbxpVar = zzbxp.HTML_DISPLAY;
            }
            IObjectWrapper zza2 = com.google.android.gms.ads.internal.zzt.zzh().zza(str, this.zzc.zzI(), "", "javascript", zza, zzbxqVar2, zzbxpVar, this.zzd.zzan);
            this.zza = zza2;
            if (zza2 != null) {
                com.google.android.gms.ads.internal.zzt.zzh().zzc(this.zza, (View) this.zzc);
                this.zzc.zzar(this.zza);
                com.google.android.gms.ads.internal.zzt.zzh().zzd(this.zza);
                this.zzc.zzd("onSdkLoaded", new a());
            }
        }
    }
}
