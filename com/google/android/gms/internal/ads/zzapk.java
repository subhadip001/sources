package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzapk implements AppOpsManager.OnOpActiveChangedListener {
    public final /* synthetic */ zzapl zza;

    public zzapk(zzapl zzaplVar) {
        this.zza = zzaplVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i2, String str2, boolean z) {
        long j2;
        long j3;
        long j4;
        if (z) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        zzapl zzaplVar = this.zza;
        j2 = zzaplVar.zzc;
        if (j2 > 0) {
            j3 = zzaplVar.zzc;
            if (currentTimeMillis >= j3) {
                j4 = zzaplVar.zzc;
                zzaplVar.zzd = currentTimeMillis - j4;
            }
        }
        this.zza.zze = false;
    }
}
