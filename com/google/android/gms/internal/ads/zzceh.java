package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzceh implements Runnable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzcga zzb;

    public zzceh(zzcei zzceiVar, Context context, zzcga zzcgaVar) {
        this.zza = context;
        this.zzb = zzcgaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzd(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e2) {
            this.zzb.zze(e2);
            zzcfi.zzh("Exception while getting advertising Id info", e2);
        }
    }
}
