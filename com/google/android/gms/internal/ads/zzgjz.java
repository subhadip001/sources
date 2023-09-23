package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgjz {
    private final Object zza;
    private final int zzb;

    public zzgjz(Object obj, int i2) {
        this.zza = obj;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgjz) {
            zzgjz zzgjzVar = (zzgjz) obj;
            return this.zza == zzgjzVar.zza && this.zzb == zzgjzVar.zzb;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
