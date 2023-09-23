package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfbd extends zzcam {
    private final zzfat zza;
    private final zzfaj zzb;
    private final zzfbt zzc;
    private zzdss zzd;
    private boolean zze = false;

    public zzfbd(zzfat zzfatVar, zzfaj zzfajVar, zzfbt zzfbtVar) {
        this.zza = zzfatVar;
        this.zzb = zzfajVar;
        this.zzc = zzfbtVar;
    }

    private final synchronized boolean zzx() {
        boolean z;
        zzdss zzdssVar = this.zzd;
        if (zzdssVar != null) {
            z = zzdssVar.zzd() ? false : true;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final Bundle zzb() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdss zzdssVar = this.zzd;
        return zzdssVar != null ? zzdssVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final synchronized com.google.android.gms.ads.internal.client.zzdh zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfJ)).booleanValue()) {
            zzdss zzdssVar = this.zzd;
            if (zzdssVar != null) {
                return zzdssVar.zzl();
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final synchronized String zzd() {
        zzdss zzdssVar = this.zzd;
        if (zzdssVar == null || zzdssVar.zzl() == null) {
            return null;
        }
        return zzdssVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zze() {
        zzf(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzb(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzm().zza(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final synchronized void zzg(zzcar zzcarVar) {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        String str = zzcarVar.zzb;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzer);
        if (str2 != null && str != null) {
            try {
                if (Pattern.matches(str2, str)) {
                    return;
                }
            } catch (RuntimeException e2) {
                com.google.android.gms.ads.internal.zzt.zzo().zzt(e2, "NonagonUtil.isPatternMatched");
            }
        }
        if (zzx()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzet)).booleanValue()) {
                return;
            }
        }
        zzfal zzfalVar = new zzfal(null);
        this.zzd = null;
        this.zza.zzj(1);
        this.zza.zzb(zzcarVar.zza, zzcarVar.zzb, zzfalVar, new zzfbb(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzh() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzb(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzj() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzc(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzl(com.google.android.gms.ads.internal.client.zzbw zzbwVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzbwVar == null) {
            this.zzb.zzb(null);
        } else {
            this.zzb.zzb(new zzfbc(this, zzbwVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final synchronized void zzm(String str) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final synchronized void zzn(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzo(zzcaq zzcaqVar) {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzf(zzcaqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final synchronized void zzp(String str) {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final synchronized void zzq() {
        zzr(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final synchronized void zzr(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (this.zzd != null) {
            Activity activity = null;
            if (iObjectWrapper != null) {
                Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
                if (unwrap instanceof Activity) {
                    activity = (Activity) unwrap;
                }
            }
            this.zzd.zzg(this.zze, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final boolean zzs() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final boolean zzt() {
        zzdss zzdssVar = this.zzd;
        return zzdssVar != null && zzdssVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzu(zzcal zzcalVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzh(zzcalVar);
    }
}
