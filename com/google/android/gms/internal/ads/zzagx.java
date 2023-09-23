package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzagx {
    private final zzaga zza;
    private final zzee zzb;
    private final zzdx zzc = new zzdx(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzagx(zzaga zzagaVar, zzee zzeeVar) {
        this.zza = zzagaVar;
        this.zzb = zzeeVar;
    }

    public final void zza(zzdy zzdyVar) {
        long j2;
        zzdyVar.zzB(this.zzc.zza, 0, 3);
        this.zzc.zzh(0);
        this.zzc.zzj(8);
        this.zzd = this.zzc.zzl();
        this.zze = this.zzc.zzl();
        this.zzc.zzj(6);
        zzdyVar.zzB(this.zzc.zza, 0, this.zzc.zzc(8));
        this.zzc.zzh(0);
        if (this.zzd) {
            this.zzc.zzj(4);
            int zzc = this.zzc.zzc(3);
            this.zzc.zzj(1);
            int zzc2 = this.zzc.zzc(15);
            this.zzc.zzj(1);
            long zzc3 = (zzc << 30) | (zzc2 << 15) | this.zzc.zzc(15);
            this.zzc.zzj(1);
            if (!this.zzf && this.zze) {
                this.zzc.zzj(4);
                int zzc4 = this.zzc.zzc(3);
                this.zzc.zzj(1);
                int zzc5 = this.zzc.zzc(15);
                this.zzc.zzj(1);
                int zzc6 = this.zzc.zzc(15);
                this.zzc.zzj(1);
                this.zzb.zzb((zzc5 << 15) | (zzc4 << 30) | zzc6);
                this.zzf = true;
            }
            j2 = this.zzb.zzb(zzc3);
        } else {
            j2 = 0;
        }
        this.zza.zzd(j2, 4);
        this.zza.zza(zzdyVar);
        this.zza.zzc();
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zze();
    }
}
