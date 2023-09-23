package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbxt;
import com.google.android.gms.internal.ads.zzdjf;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzv extends zzbxt {
    private final AdOverlayInfoParcel zza;
    private final Activity zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzv(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        this.zzb = activity;
    }

    private final synchronized void zzb() {
        if (this.zzd) {
            return;
        }
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzf(4);
        }
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final boolean zzE() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzg(int i2, int i3, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzj(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzk(Bundle bundle) {
        zzo zzoVar;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzhp)).booleanValue()) {
            this.zzb.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zza;
        if (adOverlayInfoParcel == null) {
            this.zzb.finish();
        } else if (z) {
            this.zzb.finish();
        } else {
            if (bundle == null) {
                com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
                if (zzaVar != null) {
                    zzaVar.onAdClicked();
                }
                zzdjf zzdjfVar = this.zza.zzy;
                if (zzdjfVar != null) {
                    zzdjfVar.zzq();
                }
                if (this.zzb.getIntent() != null && this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzoVar = this.zza.zzc) != null) {
                    zzoVar.zzb();
                }
            }
            com.google.android.gms.ads.internal.zzt.zzi();
            Activity activity = this.zzb;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zza;
            zzc zzcVar = adOverlayInfoParcel2.zza;
            if (zza.zzb(activity, zzcVar, adOverlayInfoParcel2.zzi, zzcVar.zzi)) {
                return;
            }
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzl() {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzn() {
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzbr();
        }
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzp() {
        if (this.zzc) {
            this.zzb.finish();
            return;
        }
        this.zzc = true;
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzbK();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzq(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzr() {
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzs() {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzt() {
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzv() {
    }
}
