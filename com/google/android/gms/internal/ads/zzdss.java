package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdss extends zzcxw {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdlf zze;
    private final zzdio zzf;
    private final zzdcf zzg;
    private final zzddm zzh;
    private final zzcyq zzi;
    private final zzcba zzj;
    private final zzfld zzk;
    private boolean zzl;

    public zzdss(zzcxv zzcxvVar, Context context, zzcli zzcliVar, zzdlf zzdlfVar, zzdio zzdioVar, zzdcf zzdcfVar, zzddm zzddmVar, zzcyq zzcyqVar, zzfbg zzfbgVar, zzfld zzfldVar) {
        super(zzcxvVar);
        this.zzl = false;
        this.zzc = context;
        this.zze = zzdlfVar;
        this.zzd = new WeakReference(zzcliVar);
        this.zzf = zzdioVar;
        this.zzg = zzdcfVar;
        this.zzh = zzddmVar;
        this.zzi = zzcyqVar;
        this.zzk = zzfldVar;
        zzcaw zzcawVar = zzfbgVar.zzm;
        this.zzj = new zzcbu(zzcawVar != null ? zzcawVar.zza : "", zzcawVar != null ? zzcawVar.zzb : 1);
    }

    public final void finalize() {
        try {
            final zzcli zzcliVar = (zzcli) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfH)).booleanValue()) {
                if (!this.zzl && zzcliVar != null) {
                    zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsr
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcli.this.destroy();
                        }
                    });
                }
            } else if (zzcliVar != null) {
                zzcliVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzcba zzc() {
        return this.zzj;
    }

    public final boolean zzd() {
        return this.zzi.zzg();
    }

    public final boolean zze() {
        return this.zzl;
    }

    public final boolean zzf() {
        zzcli zzcliVar = (zzcli) this.zzd.get();
        return (zzcliVar == null || zzcliVar.zzaD()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzg(boolean z, Activity activity) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzay)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzs.zzC(this.zzc)) {
                zzcfi.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzg.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzaz)).booleanValue()) {
                    this.zzk.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzl) {
            zzcfi.zzj("The rewarded ad have been showed.");
            this.zzg.zza(zzfcx.zzd(10, null, null));
            return false;
        }
        this.zzl = true;
        this.zzf.zzb();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zzc;
        }
        try {
            this.zze.zza(z, activity2, this.zzg);
            this.zzf.zza();
            return true;
        } catch (zzdle e2) {
            this.zzg.zze(e2);
            return false;
        }
    }
}
