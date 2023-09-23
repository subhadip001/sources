package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeok implements zzeta {
    private final com.google.android.gms.ads.internal.client.zzw zza;
    private final zzcfo zzb;
    private final boolean zzc;

    public zzeok(com.google.android.gms.ads.internal.client.zzw zzwVar, zzcfo zzcfoVar, boolean z) {
        this.zza = zzwVar;
        this.zzb = zzcfoVar;
        this.zzc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzeta
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zzb.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzej)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzek)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzc);
        }
        com.google.android.gms.ads.internal.client.zzw zzwVar = this.zza;
        if (zzwVar != null) {
            int i2 = zzwVar.zza;
            if (i2 == 1) {
                bundle.putString("avo", "p");
            } else if (i2 == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
