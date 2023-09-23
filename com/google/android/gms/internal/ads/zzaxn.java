package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaxn extends zzasd {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;

    public zzaxn(long j2, boolean z) {
        this.zzc = j2;
        this.zzd = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzasd
    public final int zza(Object obj) {
        return zzb.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzasd
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzasd
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzasd
    public final zzasb zzd(int i2, zzasb zzasbVar, boolean z) {
        zzayy.zza(i2, 0, 1);
        Object obj = z ? zzb : null;
        long j2 = this.zzc;
        zzasbVar.zza = obj;
        zzasbVar.zzb = obj;
        zzasbVar.zzc = j2;
        return zzasbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzasd
    public final zzasc zze(int i2, zzasc zzascVar, boolean z, long j2) {
        zzayy.zza(i2, 0, 1);
        zzascVar.zza = this.zzd;
        return zzascVar;
    }
}
