package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbwb implements SignalCallbacks {
    public final /* synthetic */ zzbvv zza;

    public zzbwb(zzbwd zzbwdVar, zzbvv zzbvvVar) {
        this.zza = zzbvvVar;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(AdError adError) {
        try {
            this.zza.zzg(adError.zza());
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onSuccess(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(String str) {
        try {
            this.zza.zzf(str);
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
        }
    }
}
