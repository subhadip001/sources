package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfbc extends zzfkm {
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzbw zza;
    public final /* synthetic */ zzfbd zzb;

    public zzfbc(zzfbd zzfbdVar, com.google.android.gms.ads.internal.client.zzbw zzbwVar) {
        this.zzb = zzfbdVar;
        this.zza = zzbwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfkm
    public final void zzv() {
        zzdss zzdssVar;
        zzdssVar = this.zzb.zzd;
        if (zzdssVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e2) {
                zzcfi.zzl("#007 Could not call remote method.", e2);
            }
        }
    }
}
