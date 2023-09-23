package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzehb implements zzeey {
    private final Context zza;
    private final zzdto zzb;
    private final zzdkx zzc;
    private final zzfby zzd;
    private final Executor zze;
    private final zzcfo zzf;
    private final zzboo zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhq)).booleanValue();

    public zzehb(Context context, zzcfo zzcfoVar, zzfby zzfbyVar, Executor executor, zzdkx zzdkxVar, zzdto zzdtoVar, zzboo zzbooVar) {
        this.zza = context;
        this.zzd = zzfbyVar;
        this.zzc = zzdkxVar;
        this.zze = executor;
        this.zzf = zzcfoVar;
        this.zzb = zzdtoVar;
        this.zzg = zzbooVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeey
    public final zzfvj zza(final zzfbs zzfbsVar, final zzfbg zzfbgVar) {
        final zzdts zzdtsVar = new zzdts();
        zzfvj zzn = zzfva.zzn(zzfva.zzi(null), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzegw
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzehb.this.zzc(zzfbgVar, zzfbsVar, zzdtsVar, obj);
            }
        }, this.zze);
        zzn.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegx
            @Override // java.lang.Runnable
            public final void run() {
                zzdts.this.zzb();
            }
        }, this.zze);
        return zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzeey
    public final boolean zzb(zzfbs zzfbsVar, zzfbg zzfbgVar) {
        zzfbl zzfblVar = zzfbgVar.zzt;
        return (zzfblVar == null || zzfblVar.zza == null) ? false : true;
    }

    public final /* synthetic */ zzfvj zzc(final zzfbg zzfbgVar, zzfbs zzfbsVar, zzdts zzdtsVar, Object obj) {
        final zzcli zza = this.zzb.zza(this.zzd.zze, zzfbgVar, zzfbsVar.zzb.zzb);
        zza.zzab(zzfbgVar.zzX);
        zzdtsVar.zza(this.zza, (View) zza);
        zzcga zzcgaVar = new zzcga();
        final zzdjz zze = this.zzc.zze(new zzcyl(zzfbsVar, zzfbgVar, null), new zzdkc(new zzeha(this.zza, this.zzf, zzcgaVar, zzfbgVar, zza, this.zzd, this.zzh, this.zzg), zza));
        zzcgaVar.zzd(zze);
        zze.zzc().zzj(new zzdcm() { // from class: com.google.android.gms.internal.ads.zzegy
            @Override // com.google.android.gms.internal.ads.zzdcm
            public final void zzl() {
                zzcli zzcliVar = zzcli.this;
                if (zzcliVar.zzP() != null) {
                    zzcliVar.zzP().zzp();
                }
            }
        }, zzcfv.zzf);
        zze.zzk().zzi(zza, true, this.zzh ? this.zzg : null);
        zze.zzk();
        zzfbl zzfblVar = zzfbgVar.zzt;
        return zzfva.zzm(zzdtn.zzj(zza, zzfblVar.zzb, zzfblVar.zza), new zzfoi() { // from class: com.google.android.gms.internal.ads.zzegz
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj2) {
                zzcli zzcliVar = zza;
                zzfbg zzfbgVar2 = zzfbgVar;
                zzdjz zzdjzVar = zze;
                if (zzfbgVar2.zzN) {
                    zzcliVar.zzag();
                }
                zzcliVar.zzaa();
                zzcliVar.onPause();
                return zzdjzVar.zzg();
            }
        }, this.zze);
    }
}
