package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzemg implements com.google.android.gms.ads.internal.client.zza, zzdjf {
    private com.google.android.gms.ads.internal.client.zzbc zza;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zzbc zzbcVar = this.zza;
        if (zzbcVar != null) {
            try {
                zzbcVar.zzb();
            } catch (RemoteException e2) {
                zzcfi.zzk("Remote Exception at onAdClicked.", e2);
            }
        }
    }

    public final synchronized void zza(com.google.android.gms.ads.internal.client.zzbc zzbcVar) {
        this.zza = zzbcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdjf
    public final synchronized void zzq() {
        com.google.android.gms.ads.internal.client.zzbc zzbcVar = this.zza;
        if (zzbcVar != null) {
            try {
                zzbcVar.zzb();
            } catch (RemoteException e2) {
                zzcfi.zzk("Remote Exception at onPhysicalClick.", e2);
            }
        }
    }
}
