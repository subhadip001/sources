package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzedp implements zzddg, zzdbv {
    private static final Object zza = new Object();
    private static int zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzedy zzd;

    public zzedp(zzedy zzedyVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzedyVar;
        this.zzc = zzgVar;
    }

    private final void zzb(boolean z) {
        int i2;
        int intValue;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzff)).booleanValue() && !this.zzc.zzP()) {
            Object obj = zza;
            synchronized (obj) {
                i2 = zzb;
                intValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfg)).intValue();
            }
            if (i2 >= intValue) {
                return;
            }
            this.zzd.zze(z);
            synchronized (obj) {
                zzb++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzddg
    public final void zzn() {
        zzb(true);
    }
}
