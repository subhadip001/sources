package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzez implements zzeq {
    private zzft zzb;
    private String zzc;
    private boolean zzf;
    private final zzfn zza = new zzfn();
    private int zzd = 8000;
    private int zze = 8000;

    public final zzez zzb(boolean z) {
        this.zzf = true;
        return this;
    }

    public final zzez zzc(int i2) {
        this.zzd = i2;
        return this;
    }

    public final zzez zzd(int i2) {
        this.zze = i2;
        return this;
    }

    public final zzez zze(zzft zzftVar) {
        this.zzb = zzftVar;
        return this;
    }

    public final zzez zzf(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    /* renamed from: zzg */
    public final zzfe zza() {
        zzfe zzfeVar = new zzfe(this.zzc, this.zzd, this.zze, this.zzf, this.zza);
        zzft zzftVar = this.zzb;
        if (zzftVar != null) {
            zzfeVar.zzf(zzftVar);
        }
        return zzfeVar;
    }
}
