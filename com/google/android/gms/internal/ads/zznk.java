package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zznk {
    private final Handler zza;
    private final zznl zzb;

    public zznk(Handler handler, zznl zznlVar) {
        this.zza = zznlVar == null ? null : handler;
        this.zzb = zznlVar;
    }

    public final void zza(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzna
                @Override // java.lang.Runnable
                public final void run() {
                    zznk.this.zzh(exc);
                }
            });
        }
    }

    public final void zzb(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzng
                @Override // java.lang.Runnable
                public final void run() {
                    zznk.this.zzi(exc);
                }
            });
        }
    }

    public final void zzc(final String str, final long j2, final long j3) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznf
                @Override // java.lang.Runnable
                public final void run() {
                    zznk.this.zzj(str, j2, j3);
                }
            });
        }
    }

    public final void zzd(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznh
                @Override // java.lang.Runnable
                public final void run() {
                    zznk.this.zzk(str);
                }
            });
        }
    }

    public final void zze(final zzgm zzgmVar) {
        zzgmVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznb
                @Override // java.lang.Runnable
                public final void run() {
                    zznk.this.zzl(zzgmVar);
                }
            });
        }
    }

    public final void zzf(final zzgm zzgmVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznc
                @Override // java.lang.Runnable
                public final void run() {
                    zznk.this.zzm(zzgmVar);
                }
            });
        }
    }

    public final void zzg(final zzad zzadVar, final zzgn zzgnVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzni
                @Override // java.lang.Runnable
                public final void run() {
                    zznk.this.zzn(zzadVar, zzgnVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzh(Exception exc) {
        zznl zznlVar = this.zzb;
        int i2 = zzeg.zza;
        zznlVar.zzc(exc);
    }

    public final /* synthetic */ void zzi(Exception exc) {
        zznl zznlVar = this.zzb;
        int i2 = zzeg.zza;
        zznlVar.zzj(exc);
    }

    public final /* synthetic */ void zzj(String str, long j2, long j3) {
        zznl zznlVar = this.zzb;
        int i2 = zzeg.zza;
        zznlVar.zzd(str, j2, j3);
    }

    public final /* synthetic */ void zzk(String str) {
        zznl zznlVar = this.zzb;
        int i2 = zzeg.zza;
        zznlVar.zze(str);
    }

    public final /* synthetic */ void zzl(zzgm zzgmVar) {
        zzgmVar.zza();
        zznl zznlVar = this.zzb;
        int i2 = zzeg.zza;
        zznlVar.zzf(zzgmVar);
    }

    public final /* synthetic */ void zzm(zzgm zzgmVar) {
        zznl zznlVar = this.zzb;
        int i2 = zzeg.zza;
        zznlVar.zzg(zzgmVar);
    }

    public final /* synthetic */ void zzn(zzad zzadVar, zzgn zzgnVar) {
        int i2 = zzeg.zza;
        this.zzb.zzh(zzadVar, zzgnVar);
    }

    public final /* synthetic */ void zzo(long j2) {
        zznl zznlVar = this.zzb;
        int i2 = zzeg.zza;
        zznlVar.zzi(j2);
    }

    public final /* synthetic */ void zzp(boolean z) {
        zznl zznlVar = this.zzb;
        int i2 = zzeg.zza;
        zznlVar.zzn(z);
    }

    public final /* synthetic */ void zzq(int i2, long j2, long j3) {
        zznl zznlVar = this.zzb;
        int i3 = zzeg.zza;
        zznlVar.zzk(i2, j2, j3);
    }

    public final void zzr(final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznd
                @Override // java.lang.Runnable
                public final void run() {
                    zznk.this.zzo(j2);
                }
            });
        }
    }

    public final void zzs(final boolean z) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzne
                @Override // java.lang.Runnable
                public final void run() {
                    zznk.this.zzp(z);
                }
            });
        }
    }

    public final void zzt(final int i2, final long j2, final long j3) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznj
                @Override // java.lang.Runnable
                public final void run() {
                    zznk.this.zzq(i2, j2, j3);
                }
            });
        }
    }
}
