package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzur implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzur(zzad zzadVar, int i2) {
        this.zza = 1 == (zzadVar.zze & 1);
        this.zzb = zzvf.zzi(i2, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzur zzurVar) {
        return zzfqw.zzj().zzd(this.zzb, zzurVar.zzb).zzd(this.zza, zzurVar.zza).zza();
    }
}
