package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzayb {
    private int zza;
    private final zzaxt[] zzb;

    public zzayb(zzaxt[] zzaxtVarArr, byte... bArr) {
        this.zzb = zzaxtVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzayb.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzb, ((zzayb) obj).zzb);
    }

    public final int hashCode() {
        int i2 = this.zza;
        if (i2 == 0) {
            int hashCode = Arrays.hashCode(this.zzb) + 527;
            this.zza = hashCode;
            return hashCode;
        }
        return i2;
    }

    public final zzaxt zza(int i2) {
        return this.zzb[i2];
    }

    public final zzaxt[] zzb() {
        return (zzaxt[]) this.zzb.clone();
    }
}
