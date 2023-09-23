package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzrv extends zzci {
    private final zzbb zzc;

    public zzrv(zzbb zzbbVar) {
        this.zzc = zzbbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zza(Object obj) {
        return obj == zzru.zzd ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final zzcf zzd(int i2, zzcf zzcfVar, boolean z) {
        zzcfVar.zzk(z ? 0 : null, z ? zzru.zzd : null, 0, -9223372036854775807L, 0L, zzd.zza, true);
        return zzcfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final zzch zze(int i2, zzch zzchVar, long j2) {
        zzchVar.zza(zzch.zza, this.zzc, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        zzchVar.zzl = true;
        return zzchVar;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final Object zzf(int i2) {
        return zzru.zzd;
    }
}
