package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaxo {
    public final int zza = 1;
    private final zzars[] zzb;
    private int zzc;

    public zzaxo(zzars... zzarsVarArr) {
        this.zzb = zzarsVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzaxo.class == obj.getClass() && Arrays.equals(this.zzb, ((zzaxo) obj).zzb);
    }

    public final int hashCode() {
        int i2 = this.zzc;
        if (i2 == 0) {
            int hashCode = Arrays.hashCode(this.zzb) + 527;
            this.zzc = hashCode;
            return hashCode;
        }
        return i2;
    }

    public final int zza(zzars zzarsVar) {
        for (int i2 = 0; i2 <= 0; i2++) {
            if (zzarsVar == this.zzb[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public final zzars zzb(int i2) {
        return this.zzb[i2];
    }
}
