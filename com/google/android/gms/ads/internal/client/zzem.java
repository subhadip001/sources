package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzem implements Runnable {
    public final /* synthetic */ zzeo zza;

    public zzem(zzeo zzeoVar) {
        this.zza = zzeoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzep zzepVar = this.zza.zza;
        if (zzep.zzb(zzepVar) != null) {
            try {
                zzep.zzb(zzepVar).zze(1);
            } catch (RemoteException e2) {
                zzcfi.zzk("Could not notify onAdFailedToLoad event.", e2);
            }
        }
    }
}
