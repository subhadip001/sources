package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbdr {
    @VisibleForTesting
    public zzara zza;
    @VisibleForTesting
    public boolean zzb;
    private final ExecutorService zzc;

    public zzbdr() {
        this.zzc = zzcex.zzb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzc */
    public final void zzb(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdU)).booleanValue()) {
            try {
                this.zza = (zzara) zzcfm.zzb(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new zzcfk() { // from class: com.google.android.gms.internal.ads.zzbdn
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.zzcfk
                    public final Object zza(Object obj) {
                        return zzaqz.zzb(obj);
                    }
                });
                this.zza.zze(ObjectWrapper.wrap(context), "GMA_SDK");
                this.zzb = true;
            } catch (RemoteException | zzcfl | NullPointerException unused) {
                zzcfi.zze("Cannot dynamite load clearcut");
            }
        }
    }

    public zzbdr(final Context context) {
        ExecutorService executorService = zzcex.zzb;
        this.zzc = executorService;
        zzbhy.zzc(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzin)).booleanValue()) {
            executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdm
                @Override // java.lang.Runnable
                public final void run() {
                    zzbdr.this.zzb(context);
                }
            });
        } else {
            zzb(context);
        }
    }
}
