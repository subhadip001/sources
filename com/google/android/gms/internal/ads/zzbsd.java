package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbsd implements zzcge {
    public final /* synthetic */ zzbsf zza;

    public zzbsd(zzbsf zzbsfVar) {
        this.zza = zzbsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbsk zzbskVar;
        zzbsm zzbsmVar = (zzbsm) obj;
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        zzbskVar = this.zza.zzb;
        zzbskVar.zzd();
    }
}
