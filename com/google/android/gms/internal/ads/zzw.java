package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzw {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzw zza(int i2) {
        zzcw.zzf(!this.zzb);
        this.zza.append(i2, true);
        return this;
    }

    public final zzy zzb() {
        zzcw.zzf(!this.zzb);
        this.zzb = true;
        return new zzy(this.zza, null);
    }
}
