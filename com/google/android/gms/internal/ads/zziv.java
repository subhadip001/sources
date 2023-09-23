package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zziv {
    public zzjo zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    public boolean zze;
    public int zzf;
    private boolean zzg;

    public zziv(zzjo zzjoVar) {
        this.zza = zzjoVar;
    }

    public final void zza(int i2) {
        this.zzg = 1 == ((this.zzg ? 1 : 0) | i2);
        this.zzb += i2;
    }

    public final void zzb(int i2) {
        this.zzg = true;
        this.zze = true;
        this.zzf = i2;
    }

    public final void zzc(zzjo zzjoVar) {
        this.zzg |= this.zza != zzjoVar;
        this.zza = zzjoVar;
    }

    public final void zzd(int i2) {
        if (this.zzc && this.zzd != 5) {
            zzcw.zzd(i2 == 5);
            return;
        }
        this.zzg = true;
        this.zzc = true;
        this.zzd = i2;
    }
}
