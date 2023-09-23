package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcyy implements zzfuw {
    public final /* synthetic */ zzcyz zza;

    public zzcyy(zzcyz zzcyzVar) {
        this.zza = zzcyzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        zzdgw zzdgwVar;
        zzdgwVar = this.zza.zzf;
        zzdgwVar.zzh(false);
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        zzdgw zzdgwVar;
        Void r2 = (Void) obj;
        zzdgwVar = this.zza.zzf;
        zzdgwVar.zzh(true);
    }
}
