package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbsa implements zzcge {
    public final /* synthetic */ zzbsk zza;
    public final /* synthetic */ zzfhg zzb;
    public final /* synthetic */ zzbsl zzc;

    public zzbsa(zzbsl zzbslVar, zzbsk zzbskVar, zzfhg zzfhgVar) {
        this.zzc = zzbslVar;
        this.zza = zzbskVar;
        this.zzb = zzfhgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Object obj2;
        zzbsk zzbskVar;
        zzfhs zzfhsVar;
        zzfhs zzfhsVar2;
        zzbsk zzbskVar2;
        zzbsk zzbskVar3;
        zzbrg zzbrgVar = (zzbrg) obj;
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            this.zzc.zzi = 0;
            zzbsl zzbslVar = this.zzc;
            zzbskVar = zzbslVar.zzh;
            if (zzbskVar != null) {
                zzbsk zzbskVar4 = this.zza;
                zzbskVar2 = zzbslVar.zzh;
                if (zzbskVar4 != zzbskVar2) {
                    com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    zzbskVar3 = this.zzc.zzh;
                    zzbskVar3.zzb();
                }
            }
            this.zzc.zzh = this.zza;
            if (((Boolean) zzbjh.zzd.zze()).booleanValue()) {
                zzbsl zzbslVar2 = this.zzc;
                zzfhsVar = zzbslVar2.zze;
                if (zzfhsVar != null) {
                    zzfhsVar2 = zzbslVar2.zze;
                    zzfhg zzfhgVar = this.zzb;
                    zzfhgVar.zze(true);
                    zzfhsVar2.zzb(zzfhgVar.zzj());
                }
            }
        }
    }
}
