package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbsj implements zzcge {
    public final /* synthetic */ zzbsk zza;

    public zzbsj(zzbsk zzbskVar) {
        this.zza = zzbskVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final zzbrg zzbrgVar = (zzbrg) obj;
        zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsi
            @Override // java.lang.Runnable
            public final void run() {
                zzbrg zzbrgVar2 = zzbrgVar;
                zzbrgVar2.zzr("/result", zzbok.zzo);
                zzbrgVar2.zzc();
            }
        });
    }
}
