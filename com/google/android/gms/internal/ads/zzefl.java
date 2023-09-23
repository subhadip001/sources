package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzefl implements zzeey {
    private final zzcvi zza;
    private final Context zzb;
    private final zzdto zzc;
    private final zzfby zzd;
    private final Executor zze;
    private final zzcfo zzf;
    private final zzboo zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhq)).booleanValue();

    public zzefl(zzcvi zzcviVar, Context context, Executor executor, zzdto zzdtoVar, zzfby zzfbyVar, zzcfo zzcfoVar, zzboo zzbooVar) {
        this.zzb = context;
        this.zza = zzcviVar;
        this.zze = executor;
        this.zzc = zzdtoVar;
        this.zzd = zzfbyVar;
        this.zzf = zzcfoVar;
        this.zzg = zzbooVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeey
    public final zzfvj zza(final zzfbs zzfbsVar, final zzfbg zzfbgVar) {
        final zzdts zzdtsVar = new zzdts();
        zzfvj zzn = zzfva.zzn(zzfva.zzi(null), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzefj
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzefl.this.zzc(zzfbgVar, zzfbsVar, zzdtsVar, obj);
            }
        }, this.zze);
        zzn.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefk
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
        final zzcli zza = this.zzc.zza(this.zzd.zze, zzfbgVar, zzfbsVar.zzb.zzb);
        zza.zzab(zzfbgVar.zzX);
        zzdtsVar.zza(this.zzb, (View) zza);
        zzcga zzcgaVar = new zzcga();
        final zzcvf zza2 = this.zza.zza(new zzcyl(zzfbsVar, zzfbgVar, null), new zzdkc(new zzefn(this.zzf, zzcgaVar, zzfbgVar, zza, this.zzd, this.zzh, this.zzg), zza), new zzcvg(zzfbgVar.zzab));
        zza2.zzj().zzi(zza, false, this.zzh ? this.zzg : null);
        zzcgaVar.zzd(zza2);
        zza2.zzc().zzj(new zzdcm() { // from class: com.google.android.gms.internal.ads.zzefh
            @Override // com.google.android.gms.internal.ads.zzdcm
            public final void zzl() {
                zzcli zzcliVar = zzcli.this;
                if (zzcliVar.zzP() != null) {
                    zzcliVar.zzP().zzp();
                }
            }
        }, zzcfv.zzf);
        zza2.zzj();
        zzfbl zzfblVar = zzfbgVar.zzt;
        return zzfva.zzm(zzdtn.zzj(zza, zzfblVar.zzb, zzfblVar.zza), new zzfoi() { // from class: com.google.android.gms.internal.ads.zzefi
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj2) {
                zzcli zzcliVar = zza;
                zzfbg zzfbgVar2 = zzfbgVar;
                zzcvf zzcvfVar = zza2;
                if (zzfbgVar2.zzN) {
                    zzcliVar.zzag();
                }
                zzcliVar.zzaa();
                zzcliVar.onPause();
                return zzcvfVar.zza();
            }
        }, this.zze);
    }
}
