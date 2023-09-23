package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzrl implements zztt {
    public final zztt[] zza;

    public zzrl(zztt[] zzttVarArr) {
        this.zza = zzttVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zztt
    public final long zzb() {
        long j2 = Long.MAX_VALUE;
        for (zztt zzttVar : this.zza) {
            long zzb = zzttVar.zzb();
            if (zzb != Long.MIN_VALUE) {
                j2 = Math.min(j2, zzb);
            }
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zztt
    public final long zzc() {
        long j2 = Long.MAX_VALUE;
        for (zztt zzttVar : this.zza) {
            long zzc = zzttVar.zzc();
            if (zzc != Long.MIN_VALUE) {
                j2 = Math.min(j2, zzc);
            }
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zztt
    public final void zzm(long j2) {
        for (zztt zzttVar : this.zza) {
            zzttVar.zzm(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztt
    public final boolean zzo(long j2) {
        zztt[] zzttVarArr;
        boolean z;
        boolean z2 = false;
        do {
            long zzc = zzc();
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (zztt zzttVar : this.zza) {
                long zzc2 = zzttVar.zzc();
                boolean z3 = zzc2 != Long.MIN_VALUE && zzc2 <= j2;
                if (zzc2 == zzc || z3) {
                    z |= zzttVar.zzo(j2);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zztt
    public final boolean zzp() {
        for (zztt zzttVar : this.zza) {
            if (zzttVar.zzp()) {
                return true;
            }
        }
        return false;
    }
}
