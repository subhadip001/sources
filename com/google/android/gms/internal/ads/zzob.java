package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzob {
    private zzod zzc;
    private zzmw zzb = zzmw.zza;
    public final zzoa zza = zzoa.zza;

    public final zzob zzb(zzmw zzmwVar) {
        this.zzb = zzmwVar;
        return this;
    }

    public final zzob zzc(zzmz[] zzmzVarArr) {
        this.zzc = new zzod(zzmzVarArr);
        return this;
    }

    public final zzon zzd() {
        if (this.zzc == null) {
            this.zzc = new zzod(new zzmz[0]);
        }
        return new zzon(this, null);
    }
}
