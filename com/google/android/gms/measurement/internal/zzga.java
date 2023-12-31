package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class zzga implements Runnable {
    public final /* synthetic */ zzq zza;
    public final /* synthetic */ zzgj zzb;

    public zzga(zzgj zzgjVar, zzq zzqVar) {
        this.zzb = zzgjVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkt zzktVar;
        zzkt zzktVar2;
        zzktVar = this.zzb.zza;
        zzktVar.zzA();
        zzktVar2 = this.zzb.zza;
        zzq zzqVar = this.zza;
        zzktVar2.zzaz().zzg();
        zzktVar2.zzB();
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzktVar2.zzd(zzqVar);
    }
}
