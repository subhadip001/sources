package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfax extends zzcbc {
    private final zzfat zza;
    private final zzfaj zzb;
    private final String zzc;
    private final zzfbt zzd;
    private final Context zze;
    private final zzcfo zzf;
    private zzdss zzg;
    private boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzaA)).booleanValue();

    public zzfax(String str, zzfat zzfatVar, Context context, zzfaj zzfajVar, zzfbt zzfbtVar, zzcfo zzcfoVar) {
        this.zzc = str;
        this.zza = zzfatVar;
        this.zzb = zzfajVar;
        this.zzd = zzfbtVar;
        this.zze = context;
        this.zzf = zzcfoVar;
    }

    private final synchronized void zzt(com.google.android.gms.ads.internal.client.zzl zzlVar, zzcbk zzcbkVar, int i2) {
        boolean z = false;
        if (((Boolean) zzbjm.zzi.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zziq)).booleanValue()) {
                z = true;
            }
        }
        if (this.zzf.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzir)).intValue() || !z) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        }
        this.zzb.zze(zzcbkVar);
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(this.zze) && zzlVar.zzs == null) {
            zzcfi.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zza(zzfcx.zzd(4, null, null));
            return;
        }
        if (this.zzg != null) {
            return;
        }
        zzfal zzfalVar = new zzfal(null);
        this.zza.zzj(i2);
        this.zza.zzb(zzlVar, this.zzc, zzfalVar, new zzfaw(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final Bundle zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdss zzdssVar = this.zzg;
        return zzdssVar != null ? zzdssVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final com.google.android.gms.ads.internal.client.zzdh zzc() {
        zzdss zzdssVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfJ)).booleanValue() && (zzdssVar = this.zzg) != null) {
            return zzdssVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final zzcba zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdss zzdssVar = this.zzg;
        if (zzdssVar != null) {
            return zzdssVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final synchronized String zze() {
        zzdss zzdssVar = this.zzg;
        if (zzdssVar == null || zzdssVar.zzl() == null) {
            return null;
        }
        return zzdssVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final synchronized void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzcbk zzcbkVar) {
        zzt(zzlVar, zzcbkVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzcbk zzcbkVar) {
        zzt(zzlVar, zzcbkVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final synchronized void zzh(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzh = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzi(com.google.android.gms.ads.internal.client.zzdb zzdbVar) {
        if (zzdbVar == null) {
            this.zzb.zzb(null);
        } else {
            this.zzb.zzb(new zzfav(this, zzdbVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzj(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        this.zzb.zzc(zzdeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzk(zzcbg zzcbgVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzd(zzcbgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final synchronized void zzl(zzcbr zzcbrVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzfbt zzfbtVar = this.zzd;
        zzfbtVar.zza = zzcbrVar.zza;
        zzfbtVar.zzb = zzcbrVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final synchronized void zzm(IObjectWrapper iObjectWrapper) {
        zzn(iObjectWrapper, this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final synchronized void zzn(IObjectWrapper iObjectWrapper, boolean z) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzg == null) {
            zzcfi.zzj("Rewarded can not be shown before loaded");
            this.zzb.zzk(zzfcx.zzd(9, null, null));
            return;
        }
        this.zzg.zzg(z, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final boolean zzo() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdss zzdssVar = this.zzg;
        return (zzdssVar == null || zzdssVar.zze()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzp(zzcbl zzcblVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzi(zzcblVar);
    }
}
