package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcvn extends zzcxw {
    private final zzcli zzc;
    private final int zzd;
    private final Context zze;
    private final zzcuv zzf;
    private final zzdlf zzg;
    private final zzdio zzh;
    private final zzdcf zzi;
    private final boolean zzj;
    private boolean zzk;

    public zzcvn(zzcxv zzcxvVar, Context context, zzcli zzcliVar, int i2, zzcuv zzcuvVar, zzdlf zzdlfVar, zzdio zzdioVar, zzdcf zzdcfVar) {
        super(zzcxvVar);
        this.zzk = false;
        this.zzc = zzcliVar;
        this.zze = context;
        this.zzd = i2;
        this.zzf = zzcuvVar;
        this.zzg = zzdlfVar;
        this.zzh = zzdioVar;
        this.zzi = zzdcfVar;
        this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzem)).booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final void zzV() {
        super.zzV();
        zzcli zzcliVar = this.zzc;
        if (zzcliVar != null) {
            zzcliVar.destroy();
        }
    }

    public final int zza() {
        return this.zzd;
    }

    public final void zzc(zzbbz zzbbzVar) {
        zzcli zzcliVar = this.zzc;
        if (zzcliVar != null) {
            zzcliVar.zzaj(zzbbzVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r3 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(android.app.Activity r3, com.google.android.gms.internal.ads.zzbcm r4, boolean r5) {
        /*
            r2 = this;
            if (r3 != 0) goto L4
            android.content.Context r3 = r2.zze
        L4:
            boolean r4 = r2.zzj
            if (r4 == 0) goto Ld
            com.google.android.gms.internal.ads.zzdio r4 = r2.zzh
            r4.zzb()
        Ld:
            com.google.android.gms.internal.ads.zzbhq r4 = com.google.android.gms.internal.ads.zzbhy.zzay
            com.google.android.gms.internal.ads.zzbhw r0 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r4 = r0.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L61
            com.google.android.gms.ads.internal.zzt.zzp()
            boolean r4 = com.google.android.gms.ads.internal.util.zzs.zzC(r3)
            if (r4 == 0) goto L61
            java.lang.String r4 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.internal.ads.zzcfi.zzj(r4)
            com.google.android.gms.internal.ads.zzdcf r4 = r2.zzi
            r4.zzb()
            com.google.android.gms.internal.ads.zzbhq r4 = com.google.android.gms.internal.ads.zzbhy.zzaz
            com.google.android.gms.internal.ads.zzbhw r5 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L94
            com.google.android.gms.internal.ads.zzfld r4 = new com.google.android.gms.internal.ads.zzfld
            android.content.Context r3 = r3.getApplicationContext()
            com.google.android.gms.ads.internal.util.zzbv r5 = com.google.android.gms.ads.internal.zzt.zzt()
            android.os.Looper r5 = r5.zzb()
            r4.<init>(r3, r5)
            com.google.android.gms.internal.ads.zzfbs r3 = r2.zza
            com.google.android.gms.internal.ads.zzfbr r3 = r3.zzb
            com.google.android.gms.internal.ads.zzfbj r3 = r3.zzb
            java.lang.String r3 = r3.zzb
            r4.zza(r3)
            return
        L61:
            boolean r4 = r2.zzk
            if (r4 == 0) goto L76
            java.lang.String r4 = "App open interstitial ad is already visible."
            com.google.android.gms.internal.ads.zzcfi.zzj(r4)
            com.google.android.gms.internal.ads.zzdcf r4 = r2.zzi
            r0 = 10
            r1 = 0
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfcx.zzd(r0, r1, r1)
            r4.zza(r0)
        L76:
            boolean r4 = r2.zzk
            if (r4 != 0) goto L94
            com.google.android.gms.internal.ads.zzdlf r4 = r2.zzg     // Catch: com.google.android.gms.internal.ads.zzdle -> L8e
            com.google.android.gms.internal.ads.zzdcf r0 = r2.zzi     // Catch: com.google.android.gms.internal.ads.zzdle -> L8e
            r4.zza(r5, r3, r0)     // Catch: com.google.android.gms.internal.ads.zzdle -> L8e
            boolean r3 = r2.zzj     // Catch: com.google.android.gms.internal.ads.zzdle -> L8e
            if (r3 == 0) goto L8a
            com.google.android.gms.internal.ads.zzdio r3 = r2.zzh     // Catch: com.google.android.gms.internal.ads.zzdle -> L8e
            r3.zza()     // Catch: com.google.android.gms.internal.ads.zzdle -> L8e
        L8a:
            r3 = 1
            r2.zzk = r3
            return
        L8e:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzdcf r4 = r2.zzi
            r4.zze(r3)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcvn.zzd(android.app.Activity, com.google.android.gms.internal.ads.zzbcm, boolean):void");
    }

    public final void zze(long j2, int i2) {
        this.zzf.zza(j2, i2);
    }
}
