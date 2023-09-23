package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzawo implements Runnable {
    public final /* synthetic */ zzawu zza;

    public zzawo(zzawu zzawuVar) {
        this.zza = zzawuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        zzawx zzawxVar;
        zzawu zzawuVar = this.zza;
        z = zzawuVar.zzF;
        if (z) {
            return;
        }
        zzawxVar = zzawuVar.zzo;
        zzawxVar.zze(zzawuVar);
    }
}
