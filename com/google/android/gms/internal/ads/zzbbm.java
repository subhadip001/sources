package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbbm {
    private final float zza;
    private final float zzb;
    private final float zzc;
    private final float zzd;
    private final int zze;

    @VisibleForTesting
    public zzbbm(float f2, float f3, float f4, float f5, int i2) {
        this.zza = f2;
        this.zzb = f3;
        this.zzc = f2 + f4;
        this.zzd = f3 + f5;
        this.zze = i2;
    }

    public final float zza() {
        return this.zzd;
    }

    public final float zzb() {
        return this.zza;
    }

    public final float zzc() {
        return this.zzc;
    }

    public final float zzd() {
        return this.zzb;
    }

    public final int zze() {
        return this.zze;
    }
}
