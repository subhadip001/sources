package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfav extends zzfkm {
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzdb zza;
    public final /* synthetic */ zzfax zzb;

    public zzfav(zzfax zzfaxVar, com.google.android.gms.ads.internal.client.zzdb zzdbVar) {
        this.zzb = zzfaxVar;
        this.zza = zzdbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfkm
    public final void zzv() {
        zzdss zzdssVar;
        zzdssVar = this.zzb.zzg;
        if (zzdssVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e2) {
                zzcfi.zzl("#007 Could not call remote method.", e2);
            }
        }
    }
}
