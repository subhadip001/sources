package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import e.f.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcxj implements zzddg, zzdcm {
    private final Context zza;
    private final zzcli zzb;
    private final zzfbg zzc;
    private final zzcfo zzd;
    private IObjectWrapper zze;
    private boolean zzf;

    public zzcxj(Context context, zzcli zzcliVar, zzfbg zzfbgVar, zzcfo zzcfoVar) {
        this.zza = context;
        this.zzb = zzcliVar;
        this.zzc = zzfbgVar;
        this.zzd = zzcfoVar;
    }

    private final synchronized void zza() {
        zzbxp zzbxpVar;
        zzbxq zzbxqVar;
        if (this.zzc.zzU) {
            if (this.zzb == null) {
                return;
            }
            if (com.google.android.gms.ads.internal.zzt.zzh().zze(this.zza)) {
                zzcfo zzcfoVar = this.zzd;
                String str = zzcfoVar.zzb + "." + zzcfoVar.zzc;
                String zza = this.zzc.zzW.zza();
                if (this.zzc.zzW.zzb() == 1) {
                    zzbxpVar = zzbxp.VIDEO;
                    zzbxqVar = zzbxq.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzbxpVar = zzbxp.HTML_DISPLAY;
                    if (this.zzc.zzf == 1) {
                        zzbxqVar = zzbxq.ONE_PIXEL;
                    } else {
                        zzbxqVar = zzbxq.BEGIN_TO_RENDER;
                    }
                }
                IObjectWrapper zza2 = com.google.android.gms.ads.internal.zzt.zzh().zza(str, this.zzb.zzI(), "", "javascript", zza, zzbxqVar, zzbxpVar, this.zzc.zzan);
                this.zze = zza2;
                zzcli zzcliVar = this.zzb;
                if (zza2 != null) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzc(this.zze, (View) zzcliVar);
                    this.zzb.zzar(this.zze);
                    com.google.android.gms.ads.internal.zzt.zzh().zzd(this.zze);
                    this.zzf = true;
                    this.zzb.zzd("onSdkLoaded", new a());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcm
    public final synchronized void zzl() {
        zzcli zzcliVar;
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzU || this.zze == null || (zzcliVar = this.zzb) == null) {
            return;
        }
        zzcliVar.zzd("onSdkImpression", new a());
    }

    @Override // com.google.android.gms.internal.ads.zzddg
    public final synchronized void zzn() {
        if (this.zzf) {
            return;
        }
        zza();
    }
}
