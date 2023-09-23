package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzefz implements zzeey {
    private final zzcwr zza;
    private final Context zzb;
    private final zzdto zzc;
    private final zzfby zzd;
    private final Executor zze;
    private final zzfoi zzf;

    public zzefz(zzcwr zzcwrVar, Context context, Executor executor, zzdto zzdtoVar, zzfby zzfbyVar, zzfoi zzfoiVar) {
        this.zzb = context;
        this.zza = zzcwrVar;
        this.zze = executor;
        this.zzc = zzdtoVar;
        this.zzd = zzfbyVar;
        this.zzf = zzfoiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeey
    public final zzfvj zza(final zzfbs zzfbsVar, final zzfbg zzfbgVar) {
        return zzfva.zzn(zzfva.zzi(null), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzeft
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzefz.this.zzc(zzfbsVar, zzfbgVar, obj);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzeey
    public final boolean zzb(zzfbs zzfbsVar, zzfbg zzfbgVar) {
        zzfbl zzfblVar = zzfbgVar.zzt;
        return (zzfblVar == null || zzfblVar.zza == null) ? false : true;
    }

    public final /* synthetic */ zzfvj zzc(zzfbs zzfbsVar, zzfbg zzfbgVar, Object obj) {
        View zzdtrVar;
        com.google.android.gms.ads.internal.client.zzq zza = zzfcc.zza(this.zzb, zzfbgVar.zzv);
        final zzcli zza2 = this.zzc.zza(zza, zzfbgVar, zzfbsVar.zzb.zzb);
        zza2.zzab(zzfbgVar.zzX);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgy)).booleanValue() && zzfbgVar.zzai) {
            zzdtrVar = zzcxi.zza(this.zzb, (View) zza2, zzfbgVar);
        } else {
            zzdtrVar = new zzdtr(this.zzb, (View) zza2, (com.google.android.gms.ads.internal.util.zzas) this.zzf.apply(zzfbgVar));
        }
        final zzcvv zza3 = this.zza.zza(new zzcyl(zzfbsVar, zzfbgVar, null), new zzcwb(zzdtrVar, zza2, new zzcxu() { // from class: com.google.android.gms.internal.ads.zzefu
            @Override // com.google.android.gms.internal.ads.zzcxu
            public final com.google.android.gms.ads.internal.client.zzdk zza() {
                return zzcli.this.zzs();
            }
        }, zzfcc.zzc(zza)));
        zza3.zzj().zzi(zza2, false, null);
        zzdck zzc = zza3.zzc();
        zzdcm zzdcmVar = new zzdcm() { // from class: com.google.android.gms.internal.ads.zzefv
            @Override // com.google.android.gms.internal.ads.zzdcm
            public final void zzl() {
                zzcli zzcliVar = zzcli.this;
                if (zzcliVar.zzP() != null) {
                    zzcliVar.zzP().zzp();
                }
            }
        };
        zzfvk zzfvkVar = zzcfv.zzf;
        zzc.zzj(zzdcmVar, zzfvkVar);
        zza3.zzj();
        zzfbl zzfblVar = zzfbgVar.zzt;
        zzfvj zzj = zzdtn.zzj(zza2, zzfblVar.zzb, zzfblVar.zza);
        if (zzfbgVar.zzN) {
            zzj.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefw
                @Override // java.lang.Runnable
                public final void run() {
                    zzcli.this.zzag();
                }
            }, this.zze);
        }
        zzj.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefx
            @Override // java.lang.Runnable
            public final void run() {
                zzefz.this.zzd(zza2);
            }
        }, this.zze);
        return zzfva.zzm(zzj, new zzfoi() { // from class: com.google.android.gms.internal.ads.zzefy
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj2) {
                return zzcvv.this.zza();
            }
        }, zzfvkVar);
    }

    public final /* synthetic */ void zzd(zzcli zzcliVar) {
        zzcliVar.zzaa();
        zzcme zzs = zzcliVar.zzs();
        com.google.android.gms.ads.internal.client.zzfg zzfgVar = this.zzd.zza;
        if (zzfgVar == null || zzs == null) {
            return;
        }
        zzs.zzs(zzfgVar);
    }
}
