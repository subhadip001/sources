package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzck {
    public static final zzl zza = new zzl() { // from class: com.google.android.gms.internal.ads.zzcj
    };
    public final int zzb = 1;
    public final String zzc;
    public final int zzd;
    private final zzad[] zze;
    private int zzf;

    public zzck(String str, zzad... zzadVarArr) {
        this.zzc = str;
        this.zze = zzadVarArr;
        int zzb = zzbo.zzb(zzadVarArr[0].zzm);
        this.zzd = zzb == -1 ? zzbo.zzb(zzadVarArr[0].zzl) : zzb;
        zzd(zzadVarArr[0].zzd);
        int i2 = zzadVarArr[0].zzf;
    }

    private static String zzd(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzck.class == obj.getClass()) {
            zzck zzckVar = (zzck) obj;
            if (this.zzc.equals(zzckVar.zzc) && Arrays.equals(this.zze, zzckVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzf;
        if (i2 == 0) {
            int hashCode = Arrays.hashCode(this.zze) + a.I(this.zzc, 527, 31);
            this.zzf = hashCode;
            return hashCode;
        }
        return i2;
    }

    public final int zza(zzad zzadVar) {
        for (int i2 = 0; i2 <= 0; i2++) {
            if (zzadVar == this.zze[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public final zzad zzb(int i2) {
        return this.zze[i2];
    }

    public final zzck zzc(String str) {
        return new zzck(str, this.zze);
    }
}
