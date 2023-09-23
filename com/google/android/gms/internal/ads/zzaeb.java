package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaeb implements zzady {
    private final zzdy zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzaeb(zzadv zzadvVar) {
        zzdy zzdyVar = zzadvVar.zza;
        this.zza = zzdyVar;
        zzdyVar.zzF(12);
        this.zzc = zzdyVar.zzn() & 255;
        this.zzb = zzdyVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzady
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzady
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzady
    public final int zzc() {
        int i2 = this.zzc;
        if (i2 == 8) {
            return this.zza.zzk();
        }
        if (i2 == 16) {
            return this.zza.zzo();
        }
        int i3 = this.zzd;
        this.zzd = i3 + 1;
        if (i3 % 2 == 0) {
            int zzk = this.zza.zzk();
            this.zze = zzk;
            return (zzk & 240) >> 4;
        }
        return this.zze & 15;
    }
}
