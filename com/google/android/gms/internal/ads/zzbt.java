package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbt {
    public static final zzbt zza = new zzbt(1.0f, 1.0f);
    public static final zzl zzb = new zzl() { // from class: com.google.android.gms.internal.ads.zzbs
    };
    public final float zzc;
    public final float zzd;
    private final int zze;

    public zzbt(float f2, float f3) {
        zzcw.zzd(f2 > 0.0f);
        zzcw.zzd(f3 > 0.0f);
        this.zzc = f2;
        this.zzd = f3;
        this.zze = Math.round(f2 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbt.class == obj.getClass()) {
            zzbt zzbtVar = (zzbt) obj;
            if (this.zzc == zzbtVar.zzc && this.zzd == zzbtVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.zzd) + ((Float.floatToRawIntBits(this.zzc) + 527) * 31);
    }

    public final String toString() {
        return zzeg.zzH("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.zzc), Float.valueOf(this.zzd));
    }

    public final long zza(long j2) {
        return j2 * this.zze;
    }
}
