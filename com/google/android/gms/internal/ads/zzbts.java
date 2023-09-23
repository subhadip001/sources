package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbts {
    private static zzbts zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    public static zzbts zza() {
        if (zza == null) {
            zza = new zzbts();
        }
        return zza;
    }

    public final Thread zzb(final Context context, final String str) {
        if (this.zzb.compareAndSet(false, true)) {
            Thread thread = new Thread(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtr
                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = context;
                    String str2 = str;
                    zzbhy.zzc(context2);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("measurementEnabled", ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzaf)).booleanValue());
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzam)).booleanValue()) {
                        bundle.putString("ad_storage", "denied");
                        bundle.putString("analytics_storage", "denied");
                    }
                    try {
                        ((zzcnc) zzcfm.zzb(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new zzcfk() { // from class: com.google.android.gms.internal.ads.zzbtq
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.google.android.gms.internal.ads.zzcfk
                            public final Object zza(Object obj) {
                                return zzcnb.zzb(obj);
                            }
                        })).zze(ObjectWrapper.wrap(context2), new zzbtp(AppMeasurementSdk.getInstance(context2, "FA-Ads", "am", str2, bundle)));
                    } catch (RemoteException | zzcfl | NullPointerException e2) {
                        zzcfi.zzl("#007 Could not call remote method.", e2);
                    }
                }
            });
            thread.start();
            return thread;
        }
        return null;
    }
}
