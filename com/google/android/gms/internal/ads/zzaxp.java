package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaxp {
    public static final zzaxp zza = new zzaxp(new zzaxo[0]);
    public final int zzb;
    private final zzaxo[] zzc;
    private int zzd;

    public zzaxp(zzaxo... zzaxoVarArr) {
        this.zzc = zzaxoVarArr;
        this.zzb = zzaxoVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaxp.class == obj.getClass()) {
            zzaxp zzaxpVar = (zzaxp) obj;
            if (this.zzb == zzaxpVar.zzb && Arrays.equals(this.zzc, zzaxpVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzd;
        if (i2 == 0) {
            int hashCode = Arrays.hashCode(this.zzc);
            this.zzd = hashCode;
            return hashCode;
        }
        return i2;
    }

    public final int zza(zzaxo zzaxoVar) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            if (this.zzc[i2] == zzaxoVar) {
                return i2;
            }
        }
        return -1;
    }

    public final zzaxo zzb(int i2) {
        return this.zzc[i2];
    }
}
