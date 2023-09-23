package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzanu implements Runnable {
    public final /* synthetic */ zzanv zza;

    public zzanu(zzanv zzanvVar) {
        this.zza = zzanvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        zzfks zzfksVar;
        Object obj2;
        obj = this.zza.zzm;
        synchronized (obj) {
            z = this.zza.zzn;
            if (z) {
                return;
            }
            this.zza.zzn = true;
            try {
                zzanv.zzj(this.zza);
            } catch (Exception e2) {
                zzfksVar = this.zza.zzh;
                zzfksVar.zzc(2023, -1L, e2);
            }
            obj2 = this.zza.zzm;
            synchronized (obj2) {
                this.zza.zzn = false;
            }
        }
    }
}
