package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzccn {
    private final Clock zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzcdn zzc;

    public zzccn(Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcdn zzcdnVar) {
        this.zza = clock;
        this.zzb = zzgVar;
        this.zzc = zzcdnVar;
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzao)).booleanValue()) {
            this.zzc.zzt();
        }
    }

    public final void zzb(int i2, long j2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzan)).booleanValue()) {
            return;
        }
        if (j2 - this.zzb.zzf() < 0) {
            com.google.android.gms.ads.internal.util.zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzao)).booleanValue()) {
            this.zzb.zzK(-1);
            this.zzb.zzL(j2);
        } else {
            this.zzb.zzK(i2);
            this.zzb.zzL(j2);
        }
        zza();
    }
}
