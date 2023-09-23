package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfqp extends zzfqd {
    public final /* synthetic */ zzfqr zza;
    private final Object zzb;
    private int zzc;

    public zzfqp(zzfqr zzfqrVar, int i2) {
        this.zza = zzfqrVar;
        this.zzb = zzfqr.zzg(zzfqrVar, i2);
        this.zzc = i2;
    }

    private final void zza() {
        int zzv;
        int i2 = this.zzc;
        if (i2 == -1 || i2 >= this.zza.size() || !zzfoo.zza(this.zzb, zzfqr.zzg(this.zza, this.zzc))) {
            zzv = this.zza.zzv(this.zzb);
            this.zzc = zzv;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqd, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfqd, java.util.Map.Entry
    public final Object getValue() {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.get(this.zzb);
        }
        zza();
        int i2 = this.zzc;
        if (i2 == -1) {
            return null;
        }
        return zzfqr.zzj(this.zza, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzfqd, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.put(this.zzb, obj);
        }
        zza();
        int i2 = this.zzc;
        if (i2 == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        Object zzj = zzfqr.zzj(this.zza, i2);
        zzfqr.zzm(this.zza, this.zzc, obj);
        return zzj;
    }
}
