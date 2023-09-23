package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbbu {
    public final long zza;
    public final String zzb;
    public final int zzc;

    public zzbbu(long j2, String str, int i2) {
        this.zza = j2;
        this.zzb = str;
        this.zzc = i2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbbu)) {
            zzbbu zzbbuVar = (zzbbu) obj;
            if (zzbbuVar.zza == this.zza && zzbbuVar.zzc == this.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
