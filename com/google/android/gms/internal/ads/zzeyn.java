package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeyn implements zzfoi {
    public final /* synthetic */ zzeyr zza;

    public zzeyn(zzeyr zzeyrVar) {
        this.zza = zzeyrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfoi
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzfdx zze;
        zzeyq zzeyqVar;
        zzcfi.zzh("", (zzebm) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzeyr zzeyrVar = this.zza;
        zze = zzeyrVar.zze();
        zzeyrVar.zzd = new zzeyq(null, zze, null);
        zzeyqVar = this.zza.zzd;
        return zzeyqVar;
    }
}
