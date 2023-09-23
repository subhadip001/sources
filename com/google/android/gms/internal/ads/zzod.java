package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzod {
    private final zzmz[] zza;
    private final zzov zzb;
    private final zzox zzc;

    public zzod(zzmz... zzmzVarArr) {
        zzov zzovVar = new zzov();
        zzox zzoxVar = new zzox();
        this.zza = r2;
        System.arraycopy(zzmzVarArr, 0, r2, 0, 0);
        this.zzb = zzovVar;
        this.zzc = zzoxVar;
        zzmz[] zzmzVarArr2 = {zzovVar, zzoxVar};
    }

    public final long zza(long j2) {
        return this.zzc.zzi(j2);
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzbt zzc(zzbt zzbtVar) {
        this.zzc.zzk(zzbtVar.zzc);
        this.zzc.zzj(zzbtVar.zzd);
        return zzbtVar;
    }

    public final boolean zzd(boolean z) {
        this.zzb.zzp(z);
        return z;
    }

    public final zzmz[] zze() {
        return this.zza;
    }
}
