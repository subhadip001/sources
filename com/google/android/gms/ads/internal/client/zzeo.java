package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeo extends zzbk {
    public final /* synthetic */ zzep zza;

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final String zze() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final String zzf() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg(zzl zzlVar) {
        zzh(zzlVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh(zzl zzlVar, int i2) {
        zzcfi.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzcfb.zza.post(new zzem(this));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final boolean zzi() {
        return false;
    }
}
