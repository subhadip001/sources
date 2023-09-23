package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzr {
    public static final zzr zza = new zzr(0, 0, 0);
    public static final zzl zzb = new zzl() { // from class: com.google.android.gms.internal.ads.zzq
    };
    public final int zzc = 0;
    public final int zzd;
    public final int zze;

    public zzr(int i2, int i3, int i4) {
        this.zzd = i3;
        this.zze = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzr) {
            zzr zzrVar = (zzr) obj;
            int i2 = zzrVar.zzc;
            return this.zzd == zzrVar.zzd && this.zze == zzrVar.zze;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zzd + 16337) * 31) + this.zze;
    }
}
