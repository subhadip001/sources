package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbvz implements MediationAdLoadCallback {
    public final /* synthetic */ zzbvj zza;
    public final /* synthetic */ zzbuf zzb;
    public final /* synthetic */ zzbwd zzc;

    public zzbvz(zzbwd zzbwdVar, zzbvj zzbvjVar, zzbuf zzbufVar) {
        this.zzc = zzbwdVar;
        this.zza = zzbvjVar;
        this.zzb = zzbufVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.zza.zzf(adError.zza());
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationInterstitialAd mediationInterstitialAd = (MediationInterstitialAd) obj;
        if (mediationInterstitialAd == null) {
            zzcfi.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zza.zze("Adapter returned null.");
                return null;
            } catch (RemoteException e2) {
                zzcfi.zzh("", e2);
                return null;
            }
        }
        try {
            this.zzc.zzb = mediationInterstitialAd;
            this.zza.zzg();
        } catch (RemoteException e3) {
            zzcfi.zzh("", e3);
        }
        return new zzbwe(this.zzb);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
