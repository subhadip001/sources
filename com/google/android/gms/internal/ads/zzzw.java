package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzzw {
    public static final zzzw zza = new zzzw(0, 0);
    public final long zzb;
    public final long zzc;

    public zzzw(long j2, long j3) {
        this.zzb = j2;
        this.zzc = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzw.class == obj.getClass()) {
            zzzw zzzwVar = (zzzw) obj;
            if (this.zzb == zzzwVar.zzb && this.zzc == zzzwVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        long j2 = this.zzb;
        long j3 = this.zzc;
        return "[timeUs=" + j2 + ", position=" + j3 + "]";
    }
}
