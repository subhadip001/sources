package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzecj implements zzfuw {
    public final /* synthetic */ zzbzq zza;

    public zzecj(zzecn zzecnVar, zzbzq zzbzqVar) {
        this.zza = zzbzqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        try {
            this.zza.zze(com.google.android.gms.ads.internal.util.zzaz.zza(th));
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zzf((ParcelFileDescriptor) obj);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e2);
        }
    }
}
