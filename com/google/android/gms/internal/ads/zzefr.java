package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzefr implements zzeey {
    private final zzcux zza;
    private final Context zzb;
    private final zzdto zzc;
    private final Executor zzd;

    public zzefr(zzcux zzcuxVar, Context context, Executor executor, zzdto zzdtoVar) {
        this.zzb = context;
        this.zza = zzcuxVar;
        this.zzd = executor;
        this.zzc = zzdtoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeey
    public final zzfvj zza(final zzfbs zzfbsVar, final zzfbg zzfbgVar) {
        return zzfva.zzn(zzfva.zzi(null), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzefo
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzefr.this.zzc(zzfbsVar, zzfbgVar, obj);
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzeey
    public final boolean zzb(zzfbs zzfbsVar, zzfbg zzfbgVar) {
        zzfbl zzfblVar = zzfbgVar.zzt;
        return (zzfblVar == null || zzfblVar.zza == null) ? false : true;
    }

    public final /* synthetic */ zzfvj zzc(zzfbs zzfbsVar, zzfbg zzfbgVar, Object obj) {
        com.google.android.gms.ads.internal.client.zzq zza = zzfcc.zza(this.zzb, zzfbgVar.zzv);
        final zzcli zza2 = this.zzc.zza(zza, zzfbgVar, zzfbsVar.zzb.zzb);
        final zzcup zza3 = this.zza.zza(new zzcyl(zzfbsVar, zzfbgVar, null), new zzcuq((View) zza2, zza2, zzfcc.zzc(zza), zzfbgVar.zzab, zzfbgVar.zzaf, zzfbgVar.zzP));
        zza3.zzg().zzi(zza2, false, null);
        zzdck zzc = zza3.zzc();
        zzdcm zzdcmVar = new zzdcm() { // from class: com.google.android.gms.internal.ads.zzefp
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
        zza3.zzg();
        zzfbl zzfblVar = zzfbgVar.zzt;
        return zzfva.zzm(zzdtn.zzj(zza2, zzfblVar.zzb, zzfblVar.zza), new zzfoi() { // from class: com.google.android.gms.internal.ads.zzefq
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj2) {
                return zzcup.this.zza();
            }
        }, zzfvkVar);
    }
}
