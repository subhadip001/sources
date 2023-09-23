package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaey implements zzzv {
    public final /* synthetic */ zzaez zza;

    public /* synthetic */ zzaey(zzaez zzaezVar, zzaex zzaexVar) {
        this.zza = zzaezVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final long zze() {
        zzafl zzaflVar;
        long j2;
        zzaez zzaezVar = this.zza;
        zzaflVar = zzaezVar.zzd;
        j2 = zzaezVar.zzf;
        return zzaflVar.zzf(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzt zzg(long j2) {
        zzafl zzaflVar;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        zzaez zzaezVar = this.zza;
        zzaflVar = zzaezVar.zzd;
        long zzg = zzaflVar.zzg(j2);
        j3 = zzaezVar.zzb;
        j4 = zzaezVar.zzc;
        j5 = zzaezVar.zzb;
        j6 = zzaezVar.zzf;
        long j9 = ((j4 - j5) * zzg) / j6;
        j7 = zzaezVar.zzb;
        j8 = zzaezVar.zzc;
        zzzw zzzwVar = new zzzw(j2, zzeg.zzr((j3 + j9) - 30000, j7, j8 - 1));
        return new zzzt(zzzwVar, zzzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final boolean zzh() {
        return true;
    }
}
