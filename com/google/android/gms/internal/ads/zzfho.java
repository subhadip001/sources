package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfho implements zzfuw {
    public final /* synthetic */ zzfhq zza;
    public final /* synthetic */ zzfhg zzb;

    public zzfho(zzfhq zzfhqVar, zzfhg zzfhgVar) {
        this.zza = zzfhqVar;
        this.zzb = zzfhgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        zzfhq zzfhqVar = this.zza;
        zzfhg zzfhgVar = this.zzb;
        zzfhgVar.zze(false);
        zzfhqVar.zza(zzfhgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zzb(Object obj) {
    }
}
