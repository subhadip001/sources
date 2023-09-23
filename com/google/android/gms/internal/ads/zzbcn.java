package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbcn {
    private com.google.android.gms.ads.internal.client.zzbs zza;
    private final Context zzb;
    private final String zzc;
    private final com.google.android.gms.ads.internal.client.zzdr zzd;
    @AppOpenAd.AppOpenAdOrientation
    private final int zze;
    private final AppOpenAd.AppOpenAdLoadCallback zzf;
    private final zzbtw zzg = new zzbtw();
    private final com.google.android.gms.ads.internal.client.zzp zzh = com.google.android.gms.ads.internal.client.zzp.zza;

    public zzbcn(Context context, String str, com.google.android.gms.ads.internal.client.zzdr zzdrVar, @AppOpenAd.AppOpenAdOrientation int i2, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.zzb = context;
        this.zzc = str;
        this.zzd = zzdrVar;
        this.zze = i2;
        this.zzf = appOpenAdLoadCallback;
    }

    public final void zza() {
        try {
            this.zza = com.google.android.gms.ads.internal.client.zzaw.zza().zzd(this.zzb, com.google.android.gms.ads.internal.client.zzq.zzb(), this.zzc, this.zzg);
            com.google.android.gms.ads.internal.client.zzw zzwVar = new com.google.android.gms.ads.internal.client.zzw(this.zze);
            com.google.android.gms.ads.internal.client.zzbs zzbsVar = this.zza;
            if (zzbsVar != null) {
                zzbsVar.zzI(zzwVar);
                this.zza.zzH(new zzbca(this.zzf, this.zzc));
                this.zza.zzaa(this.zzh.zza(this.zzb, this.zzd));
            }
        } catch (RemoteException e2) {
            zzcfi.zzl("#007 Could not call remote method.", e2);
        }
    }
}
