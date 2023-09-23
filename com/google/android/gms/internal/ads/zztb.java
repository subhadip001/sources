package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zztb {
    public final int zza;
    public final boolean zzb;

    public zztb(int i2, boolean z) {
        this.zza = i2;
        this.zzb = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zztb.class == obj.getClass()) {
            zztb zztbVar = (zztb) obj;
            if (this.zza == zztbVar.zza && this.zzb == zztbVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza * 31) + (this.zzb ? 1 : 0);
    }
}
