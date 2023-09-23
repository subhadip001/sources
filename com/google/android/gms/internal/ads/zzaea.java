package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaea implements zzady {
    private final int zza;
    private final int zzb;
    private final zzdy zzc;

    public zzaea(zzadv zzadvVar, zzad zzadVar) {
        zzdy zzdyVar = zzadvVar.zza;
        this.zzc = zzdyVar;
        zzdyVar.zzF(12);
        int zzn = zzdyVar.zzn();
        if ("audio/raw".equals(zzadVar.zzm)) {
            int zzo = zzeg.zzo(zzadVar.zzB, zzadVar.zzz);
            if (zzn == 0 || zzn % zzo != 0) {
                Log.w("AtomParsers", "Audio sample size mismatch. stsd sample size: " + zzo + ", stsz sample size: " + zzn);
                zzn = zzo;
            }
        }
        this.zza = zzn == 0 ? -1 : zzn;
        this.zzb = zzdyVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzady
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzady
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzady
    public final int zzc() {
        int i2 = this.zza;
        return i2 == -1 ? this.zzc.zzn() : i2;
    }
}
