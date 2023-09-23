package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzo {
    public static final zzl zza = new zzl() { // from class: com.google.android.gms.internal.ads.zzn
    };
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final byte[] zze;
    private int zzf;

    public zzo(int i2, int i3, int i4, byte[] bArr) {
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = bArr;
    }

    public static int zza(int i2) {
        if (i2 != 1) {
            if (i2 != 9) {
                return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
            }
            return 6;
        }
        return 1;
    }

    public static int zzb(int i2) {
        if (i2 != 1) {
            if (i2 != 16) {
                if (i2 != 18) {
                    return (i2 == 6 || i2 == 7) ? 3 : -1;
                }
                return 7;
            }
            return 6;
        }
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzo.class == obj.getClass()) {
            zzo zzoVar = (zzo) obj;
            if (this.zzb == zzoVar.zzb && this.zzc == zzoVar.zzc && this.zzd == zzoVar.zzd && Arrays.equals(this.zze, zzoVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzf;
        if (i2 == 0) {
            int hashCode = Arrays.hashCode(this.zze) + ((((((this.zzb + 527) * 31) + this.zzc) * 31) + this.zzd) * 31);
            this.zzf = hashCode;
            return hashCode;
        }
        return i2;
    }

    public final String toString() {
        int i2 = this.zzb;
        int i3 = this.zzc;
        int i4 = this.zzd;
        boolean z = this.zze != null;
        StringBuilder C = a.C("ColorInfo(", i2, ", ", i3, ", ");
        C.append(i4);
        C.append(", ");
        C.append(z);
        C.append(")");
        return C.toString();
    }
}
