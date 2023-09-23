package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbx {
    public static final zzbx zza = new zzbv().zze();
    public static final zzl zzb = new zzl() { // from class: com.google.android.gms.internal.ads.zzbu
    };
    private final zzy zzc;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbx) {
            return this.zzc.equals(((zzbx) obj).zzc);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }
}
