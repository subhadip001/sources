package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeiq implements zzfuh {
    private final zzfge zza;
    private final zzdbu zzb;
    private final zzfic zzc;
    private final zzfig zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcxz zzg;
    private final zzeil zzh;
    private final zzefd zzi;
    private final Context zzj;
    private final zzfhq zzk;

    public zzeiq(Context context, zzfge zzfgeVar, zzeil zzeilVar, zzdbu zzdbuVar, zzfic zzficVar, zzfig zzfigVar, zzcxz zzcxzVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzefd zzefdVar, zzfhq zzfhqVar) {
        this.zzj = context;
        this.zza = zzfgeVar;
        this.zzh = zzeilVar;
        this.zzb = zzdbuVar;
        this.zzc = zzficVar;
        this.zzd = zzfigVar;
        this.zzg = zzcxzVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzefdVar;
        this.zzk = zzfhqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    @Override // com.google.android.gms.internal.ads.zzfuh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzfvj zza(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeiq.zza(java.lang.Object):com.google.android.gms.internal.ads.zzfvj");
    }

    public final /* synthetic */ zzfvj zzb(zzfbg zzfbgVar, zzfbs zzfbsVar, zzeey zzeeyVar, Throwable th) {
        zzfhg zza = zzfhf.zza(this.zzj, 12);
        zza.zzc(zzfbgVar.zzF);
        zza.zzf();
        zzeil zzeilVar = this.zzh;
        zzfvj zzo = zzfva.zzo(zzeeyVar.zza(zzfbsVar, zzfbgVar), zzfbgVar.zzS, TimeUnit.MILLISECONDS, this.zzf);
        zzeilVar.zze(zzfbsVar, zzfbgVar, zzo, this.zzc);
        zzfhp.zza(zzo, this.zzk, zza);
        return zzo;
    }
}
