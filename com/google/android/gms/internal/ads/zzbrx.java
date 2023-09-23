package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbrx implements zzbol {
    public final /* synthetic */ zzbrg zza;
    public final /* synthetic */ com.google.android.gms.ads.internal.util.zzca zzb;
    public final /* synthetic */ zzbsl zzc;

    public zzbrx(zzbsl zzbslVar, zzaoc zzaocVar, zzbrg zzbrgVar, com.google.android.gms.ads.internal.util.zzca zzcaVar) {
        this.zzc = zzbslVar;
        this.zza = zzbrgVar;
        this.zzb = zzcaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzbol, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzbol
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        Object obj2;
        int i2;
        zzbsm zzbsmVar = (zzbsm) obj;
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            zzcfi.zzi("JS Engine is requesting an update");
            i2 = this.zzc.zzi;
            if (i2 == 0) {
                zzcfi.zzi("Starting reload.");
                this.zzc.zzi = 2;
                this.zzc.zzd(null);
            }
            this.zza.zzr("/requestReload", this.zzb.zza());
        }
    }
}
