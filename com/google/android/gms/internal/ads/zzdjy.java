package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdjy extends zzcxw {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdio zze;
    private final zzdlf zzf;
    private final zzcyq zzg;
    private final zzfld zzh;
    private final zzdcf zzi;
    private boolean zzj;

    public zzdjy(zzcxv zzcxvVar, Context context, zzcli zzcliVar, zzdio zzdioVar, zzdlf zzdlfVar, zzcyq zzcyqVar, zzfld zzfldVar, zzdcf zzdcfVar) {
        super(zzcxvVar);
        this.zzj = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcliVar);
        this.zze = zzdioVar;
        this.zzf = zzdlfVar;
        this.zzg = zzcyqVar;
        this.zzh = zzfldVar;
        this.zzi = zzdcfVar;
    }

    public final void finalize() {
        try {
            final zzcli zzcliVar = (zzcli) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfH)).booleanValue()) {
                if (!this.zzj && zzcliVar != null) {
                    zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjx
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

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzc(boolean z, Activity activity) {
        this.zze.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzay)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzs.zzC(this.zzc)) {
                zzcfi.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzaz)).booleanValue()) {
                    this.zzh.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzj) {
            zzcfi.zzj("The interstitial ad has been showed.");
            this.zzi.zza(zzfcx.zzd(10, null, null));
        }
        Activity activity2 = activity;
        if (!this.zzj) {
            if (activity == null) {
                activity2 = this.zzc;
            }
            try {
                this.zzf.zza(z, activity2, this.zzi);
                this.zze.zza();
                this.zzj = true;
                return true;
            } catch (zzdle e2) {
                this.zzi.zze(e2);
            }
        }
        return false;
    }
}
