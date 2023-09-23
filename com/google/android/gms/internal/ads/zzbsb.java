package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbsb implements zzcgc {
    public final /* synthetic */ zzbsk zza;
    public final /* synthetic */ zzfhg zzb;
    public final /* synthetic */ zzbsl zzc;

    public zzbsb(zzbsl zzbslVar, zzbsk zzbskVar, zzfhg zzfhgVar) {
        this.zzc = zzbslVar;
        this.zza = zzbskVar;
        this.zzb = zzfhgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final void zza() {
        Object obj;
        zzfhs zzfhsVar;
        zzfhs zzfhsVar2;
        obj = this.zzc.zza;
        synchronized (obj) {
            this.zzc.zzi = 1;
            com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzb();
            if (((Boolean) zzbjh.zzd.zze()).booleanValue()) {
                zzbsl zzbslVar = this.zzc;
                zzfhsVar = zzbslVar.zze;
                if (zzfhsVar != null) {
                    zzfhsVar2 = zzbslVar.zze;
                    zzfhg zzfhgVar = this.zzb;
                    zzfhgVar.zze(false);
                    zzfhsVar2.zzb(zzfhgVar.zzj());
                }
            }
        }
    }
}
