package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzau {
    public static final zzau zza = new zzau(new zzas());
    public static final zzl zzb = new zzl() { // from class: com.google.android.gms.internal.ads.zzar
    };
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final float zzf;
    public final float zzg;

    private zzau(zzas zzasVar) {
        this.zzc = -9223372036854775807L;
        this.zzd = -9223372036854775807L;
        this.zze = -9223372036854775807L;
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzau) {
            long j2 = ((zzau) obj).zzc;
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (int) (-9223372034707292159L);
        int floatToIntBits = Float.floatToIntBits(-3.4028235E38f);
        return Float.floatToIntBits(-3.4028235E38f) + ((floatToIntBits + (((((i2 * 31) + i2) * 31) + i2) * 31)) * 31);
    }
}
