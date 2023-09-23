package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcht implements Runnable {
    private final zzchf zza;
    private boolean zzb = false;

    public zzcht(zzchf zzchfVar) {
        this.zza = zzchfVar;
    }

    private final void zzc() {
        zzfnu zzfnuVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzfnuVar.removeCallbacks(this);
        zzfnuVar.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzs();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzs();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
