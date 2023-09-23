package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfgs {
    public final String zza;
    public final String zzb;

    public zzfgs(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfgs) {
            zzfgs zzfgsVar = (zzfgs) obj;
            return this.zza.equals(zzfgsVar.zza) && this.zzb.equals(zzfgsVar.zzb);
        }
        return false;
    }

    public final int hashCode() {
        return String.valueOf(this.zza).concat(String.valueOf(this.zzb)).hashCode();
    }
}
