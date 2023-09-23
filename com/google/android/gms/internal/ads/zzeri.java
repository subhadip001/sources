package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeri implements zzetb {
    private final zzfvk zza;
    private final Context zzb;
    private final Set zzc;

    public zzeri(zzfvk zzfvkVar, Context context, Set set) {
        this.zza = zzfvkVar;
        this.zzb = context;
        this.zzc = set;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeri.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzerj zzc() {
        zzbhq zzbhqVar = zzbhy.zzea;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhqVar)).booleanValue()) {
            Set set = this.zzc;
            if (set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner")) {
                com.google.android.gms.ads.internal.zzt.zzh();
                return new zzerj(true == ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhqVar)).booleanValue() ? "a.1.3.3-google_20200416" : null);
            }
        }
        return new zzerj(null);
    }
}
