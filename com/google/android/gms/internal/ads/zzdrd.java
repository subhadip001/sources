package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdrd extends zzbqt implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbkl {
    private View zza;
    private com.google.android.gms.ads.internal.client.zzdk zzb;
    private zzdnb zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdrd(zzdnb zzdnbVar, zzdng zzdngVar) {
        this.zza = zzdngVar.zzf();
        this.zzb = zzdngVar.zzj();
        this.zzc = zzdnbVar;
        if (zzdngVar.zzr() != null) {
            zzdngVar.zzr().zzao(this);
        }
    }

    private final void zzg() {
        View view;
        zzdnb zzdnbVar = this.zzc;
        if (zzdnbVar == null || (view = this.zza) == null) {
            return;
        }
        zzdnbVar.zzv(view, Collections.emptyMap(), Collections.emptyMap(), zzdnb.zzP(this.zza));
    }

    private final void zzh() {
        View view = this.zza;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.zza);
        }
    }

    private static final void zzi(zzbqx zzbqxVar, int i2) {
        try {
            zzbqxVar.zze(i2);
        } catch (RemoteException e2) {
            zzcfi.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzg();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final com.google.android.gms.ads.internal.client.zzdk zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zzcfi.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final zzbkx zzc() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zzcfi.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdnb zzdnbVar = this.zzc;
        if (zzdnbVar == null || zzdnbVar.zza() == null) {
            return null;
        }
        return zzdnbVar.zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzh();
        zzdnb zzdnbVar = this.zzc;
        if (zzdnbVar != null) {
            zzdnbVar.zzV();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zze(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzf(iObjectWrapper, new zzdrc(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzf(IObjectWrapper iObjectWrapper, zzbqx zzbqxVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zzcfi.zzg("Instream ad can not be shown after destroy().");
            zzi(zzbqxVar, 2);
            return;
        }
        View view = this.zza;
        if (view != null && this.zzb != null) {
            if (this.zze) {
                zzcfi.zzg("Instream ad should not be used again.");
                zzi(zzbqxVar, 1);
                return;
            }
            this.zze = true;
            zzh();
            ((ViewGroup) ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
            com.google.android.gms.ads.internal.zzt.zzx();
            zzcgi.zza(this.zza, this);
            com.google.android.gms.ads.internal.zzt.zzx();
            zzcgi.zzb(this.zza, this);
            zzg();
            try {
                zzbqxVar.zzf();
                return;
            } catch (RemoteException e2) {
                zzcfi.zzl("#007 Could not call remote method.", e2);
                return;
            }
        }
        zzcfi.zzg("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
        zzi(zzbqxVar, 0);
    }
}
