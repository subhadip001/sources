package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfdz implements zzfdx {
    private final String zza;

    public zzfdz(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfdx
    public final boolean equals(Object obj) {
        if (obj instanceof zzfdz) {
            return this.zza.equals(((zzfdz) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfdx
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
