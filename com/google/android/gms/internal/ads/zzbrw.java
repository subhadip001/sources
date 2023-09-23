package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbrw implements zzbol {
    public final /* synthetic */ zzbsk zza;
    public final /* synthetic */ zzbrg zzb;
    public final /* synthetic */ zzbsl zzc;

    public zzbrw(zzbsl zzbslVar, zzbsk zzbskVar, zzbrg zzbrgVar) {
        this.zzc = zzbslVar;
        this.zza = zzbskVar;
        this.zzb = zzbrgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        Object obj2;
        zzbsm zzbsmVar = (zzbsm) obj;
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            if (this.zza.zze() != -1 && this.zza.zze() != 1) {
                this.zzc.zzi = 0;
                zzbrg zzbrgVar = this.zzb;
                zzbrgVar.zzq("/log", zzbok.zzg);
                zzbrgVar.zzq("/result", zzbok.zzo);
                this.zza.zzh(this.zzb);
                this.zzc.zzh = this.zza;
                com.google.android.gms.ads.internal.util.zze.zza("Successfully loaded JS Engine.");
            }
        }
    }
}
