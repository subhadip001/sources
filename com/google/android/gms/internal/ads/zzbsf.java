package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbsf extends zzcgh {
    private final Object zza = new Object();
    private final zzbsk zzb;
    private boolean zzc;

    public zzbsf(zzbsk zzbskVar) {
        this.zzb = zzbskVar;
    }

    public final void zzb() {
        synchronized (this.zza) {
            if (this.zzc) {
                return;
            }
            this.zzc = true;
            zzi(new zzbsc(this), new zzcgd());
            zzi(new zzbsd(this), new zzbse(this));
        }
    }
}
