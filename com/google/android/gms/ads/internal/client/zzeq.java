package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeq implements Runnable {
    public final /* synthetic */ zzer zza;

    public zzeq(zzer zzerVar) {
        this.zza = zzerVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbf zzbfVar;
        zzbf zzbfVar2;
        zzer zzerVar = this.zza;
        zzbfVar = zzerVar.zza;
        if (zzbfVar != null) {
            try {
                zzbfVar2 = zzerVar.zza;
                zzbfVar2.zze(1);
            } catch (RemoteException e2) {
                zzcfi.zzk("Could not notify onAdFailedToLoad event.", e2);
            }
        }
    }
}
