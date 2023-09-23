package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzawm implements zzaxm {
    private final zzaxm[] zza;

    public zzawm(zzaxm[] zzaxmVarArr) {
        this.zza = zzaxmVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaxm
    public final long zza() {
        long j2 = Long.MAX_VALUE;
        for (zzaxm zzaxmVar : this.zza) {
            long zza = zzaxmVar.zza();
            if (zza != Long.MIN_VALUE) {
                j2 = Math.min(j2, zza);
            }
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaxm
    public final boolean zzbj(long j2) {
        zzaxm[] zzaxmVarArr;
        boolean z;
        boolean z2 = false;
        do {
            long zza = zza();
            if (zza == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (zzaxm zzaxmVar : this.zza) {
                if (zzaxmVar.zza() == zza) {
                    z |= zzaxmVar.zzbj(j2);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
