package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfhn implements zzfuw {
    public final /* synthetic */ zzfhq zza;
    public final /* synthetic */ zzfhg zzb;

    public zzfhn(zzfhq zzfhqVar, zzfhg zzfhgVar, boolean z) {
        this.zza = zzfhqVar;
        this.zzb = zzfhgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        zzfhg zzfhgVar = this.zzb;
        if (zzfhgVar.zzh()) {
            zzfhq zzfhqVar = this.zza;
            zzfhgVar.zze(false);
            zzfhqVar.zza(zzfhgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zzb(Object obj) {
        zzfhq zzfhqVar = this.zza;
        zzfhg zzfhgVar = this.zzb;
        zzfhgVar.zze(true);
        zzfhqVar.zza(zzfhgVar);
    }
}
