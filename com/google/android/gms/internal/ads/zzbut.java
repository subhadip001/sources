package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbut implements InitializationCompleteCallback {
    public final /* synthetic */ zzbqj zza;

    public zzbut(zzbuy zzbuyVar, zzbqj zzbqjVar) {
        this.zza = zzbqjVar;
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.zza.zzf();
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
        }
    }
}
