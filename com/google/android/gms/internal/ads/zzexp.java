package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzexp implements zzfuw {
    public final /* synthetic */ zzemr zza;
    public final /* synthetic */ zzfhq zzb;
    public final /* synthetic */ zzfhg zzc;
    public final /* synthetic */ zzcwr zzd;
    public final /* synthetic */ zzexq zze;

    public zzexp(zzexq zzexqVar, zzemr zzemrVar, zzfhq zzfhqVar, zzfhg zzfhgVar, zzcwr zzcwrVar) {
        this.zze = zzexqVar;
        this.zza = zzemrVar;
        this.zzb = zzfhqVar;
        this.zzc = zzfhgVar;
        this.zzd = zzcwrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        zzdeh zzdehVar;
        zzdgn zzdgnVar;
        zzfhs zzfhsVar;
        zzfhq zzfhqVar;
        Executor executor;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zzd().zza(th);
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zzd.zzf().zza(zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgL)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexo
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzemc zzemcVar;
                        zzexp zzexpVar = zzexp.this;
                        com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                        zzemcVar = zzexpVar.zze.zzd;
                        zzemcVar.zza(zzeVar);
                    }
                });
            }
            zzexq zzexqVar = this.zze;
            zzdehVar = zzexqVar.zzh;
            zzdgnVar = zzexqVar.zzj;
            zzdehVar.zzd(zzdgnVar.zzc());
            zzfcs.zzb(zza.zza, th, "BannerAdLoader.onFailure");
            this.zza.zza();
            if (((Boolean) zzbjh.zzc.zze()).booleanValue() && (zzfhqVar = this.zzb) != null) {
                zzfhqVar.zzc(zza);
                zzfhg zzfhgVar = this.zzc;
                zzfhgVar.zze(false);
                zzfhqVar.zza(zzfhgVar);
                zzfhqVar.zzg();
            } else {
                zzfhsVar = this.zze.zzi;
                zzfhg zzfhgVar2 = this.zzc;
                zzfhgVar2.zza(zza);
                zzfhgVar2.zze(false);
                zzfhsVar.zzb(zzfhgVar2.zzj());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        zzdeh zzdehVar;
        zzfhs zzfhsVar;
        zzfhq zzfhqVar;
        Executor executor;
        final zzemc zzemcVar;
        zzemc zzemcVar2;
        zzemg zzemgVar;
        zzcvu zzcvuVar = (zzcvu) obj;
        synchronized (this.zze) {
            this.zze.zzl = null;
            viewGroup = this.zze.zzf;
            viewGroup.removeAllViews();
            if (zzcvuVar.zzc() != null) {
                ViewParent parent = zzcvuVar.zzc().getParent();
                if (parent instanceof ViewGroup) {
                    String zzg = zzcvuVar.zzl() != null ? zzcvuVar.zzl().zzg() : "";
                    zzcfi.zzj("Banner view provided from " + zzg + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(zzcvuVar.zzc());
                }
            }
            zzbhq zzbhqVar = zzbhy.zzgL;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhqVar)).booleanValue()) {
                zzdfw zzn = zzcvuVar.zzn();
                zzemcVar2 = this.zze.zzd;
                zzn.zza(zzemcVar2);
                zzemgVar = this.zze.zze;
                zzn.zzc(zzemgVar);
            }
            viewGroup2 = this.zze.zzf;
            viewGroup2.addView(zzcvuVar.zzc());
            this.zza.zzb(zzcvuVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhqVar)).booleanValue()) {
                zzexq zzexqVar = this.zze;
                executor = zzexqVar.zzb;
                zzemcVar = zzexqVar.zzd;
                zzemcVar.getClass();
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexn
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzemc.this.zzn();
                    }
                });
            }
            zzdehVar = this.zze.zzh;
            zzdehVar.zzd(zzcvuVar.zza());
            if (((Boolean) zzbjh.zzc.zze()).booleanValue() && (zzfhqVar = this.zzb) != null) {
                zzfhqVar.zzf(zzcvuVar.zzp().zzb);
                zzfhqVar.zze(zzcvuVar.zzl().zzg());
                zzfhg zzfhgVar = this.zzc;
                zzfhgVar.zze(true);
                zzfhqVar.zza(zzfhgVar);
                zzfhqVar.zzg();
            } else {
                zzfhsVar = this.zze.zzi;
                zzfhg zzfhgVar2 = this.zzc;
                zzfhgVar2.zzb(zzcvuVar.zzp().zzb);
                zzfhgVar2.zzc(zzcvuVar.zzl().zzg());
                zzfhgVar2.zze(true);
                zzfhsVar.zzb(zzfhgVar2.zzj());
            }
        }
    }
}
