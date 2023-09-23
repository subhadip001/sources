package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzarw {
    public static final zzarw zza = new zzarw(1.0f, 1.0f);
    public final float zzb;
    public final float zzc = 1.0f;
    private final int zzd;

    public zzarw(float f2, float f3) {
        this.zzb = f2;
        this.zzd = Math.round(f2 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzarw.class == obj.getClass() && this.zzb == ((zzarw) obj).zzb;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(1.0f) + ((Float.floatToRawIntBits(this.zzb) + 527) * 31);
    }

    public final long zza(long j2) {
        return j2 * this.zzd;
    }
}
