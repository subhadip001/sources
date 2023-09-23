package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdsn extends VideoController.VideoLifecycleCallbacks {
    private final zzdng zza;

    public zzdsn(zzdng zzdngVar) {
        this.zza = zzdngVar;
    }

    private static com.google.android.gms.ads.internal.client.zzdn zza(zzdng zzdngVar) {
        com.google.android.gms.ads.internal.client.zzdk zzj = zzdngVar.zzj();
        if (zzj == null) {
            return null;
        }
        try {
            return zzj.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        com.google.android.gms.ads.internal.client.zzdn zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zze();
        } catch (RemoteException e2) {
            zzcfi.zzk("Unable to call onVideoEnd()", e2);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        com.google.android.gms.ads.internal.client.zzdn zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zzg();
        } catch (RemoteException e2) {
            zzcfi.zzk("Unable to call onVideoEnd()", e2);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        com.google.android.gms.ads.internal.client.zzdn zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zzi();
        } catch (RemoteException e2) {
            zzcfi.zzk("Unable to call onVideoEnd()", e2);
        }
    }
}
