package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzaxt {
    public final zzaxo zza;
    public final int[] zzb;
    private final zzars[] zzc;
    private int zzd;

    public zzaxt(zzaxo zzaxoVar, int... iArr) {
        Objects.requireNonNull(zzaxoVar);
        this.zza = zzaxoVar;
        this.zzc = new zzars[1];
        for (int i2 = 0; i2 <= 0; i2++) {
            this.zzc[i2] = zzaxoVar.zzb(iArr[i2]);
        }
        Arrays.sort(this.zzc, new zzaxs(null));
        this.zzb = new int[1];
        for (int i3 = 0; i3 <= 0; i3++) {
            this.zzb[i3] = zzaxoVar.zza(this.zzc[i3]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaxt zzaxtVar = (zzaxt) obj;
            if (this.zza == zzaxtVar.zza && Arrays.equals(this.zzb, zzaxtVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzd;
        if (i2 == 0) {
            int hashCode = Arrays.hashCode(this.zzb) + (System.identityHashCode(this.zza) * 31);
            this.zzd = hashCode;
            return hashCode;
        }
        return i2;
    }

    public final int zza(int i2) {
        return this.zzb[0];
    }

    public final int zzb() {
        int length = this.zzb.length;
        return 1;
    }

    public final zzars zzc(int i2) {
        return this.zzc[i2];
    }

    public final zzaxo zzd() {
        return this.zza;
    }
}
