package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzd {
    private final zzc[] zzf;
    public static final zzd zza = new zzd(null, new zzc[0], 0, -9223372036854775807L, 0);
    private static final zzc zze = new zzc(0).zzb(0);
    public static final zzl zzb = new zzl() { // from class: com.google.android.gms.internal.ads.zza
    };
    public final long zzd = 0;
    public final int zzc = 0;

    private zzd(Object obj, zzc[] zzcVarArr, long j2, long j3, int i2) {
        this.zzf = zzcVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzd.class == obj.getClass()) {
            zzd zzdVar = (zzd) obj;
            if (zzeg.zzS(null, null) && Arrays.equals(this.zzf, zzdVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (((int) (-9223372036854775807L)) * 961);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + ((Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }

    public final zzc zza(int i2) {
        return i2 < 0 ? zze : this.zzf[i2];
    }
}
