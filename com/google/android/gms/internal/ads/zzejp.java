package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzejp implements zzefg {
    private final Context zza;
    private final Executor zzb;
    private final zzdsx zzc;

    public zzejp(Context context, Executor executor, zzdsx zzdsxVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdsxVar;
    }

    public static /* bridge */ /* synthetic */ Executor zzc(zzejp zzejpVar) {
        return zzejpVar.zzb;
    }

    public static final void zze(zzfbs zzfbsVar, zzfbg zzfbgVar, zzefb zzefbVar) {
        try {
            ((zzfct) zzefbVar.zzb).zzk(zzfbsVar.zza.zza.zzd, zzfbgVar.zzw.toString());
        } catch (Exception e2) {
            zzcfi.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzefbVar.zza)), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefg
    public final /* bridge */ /* synthetic */ Object zza(zzfbs zzfbsVar, zzfbg zzfbgVar, final zzefb zzefbVar) {
        zzdst zze = this.zzc.zze(new zzcyl(zzfbsVar, zzfbgVar, zzefbVar.zza), new zzdsu(new zzdlf() { // from class: com.google.android.gms.internal.ads.zzejl
            @Override // com.google.android.gms.internal.ads.zzdlf
            public final void zza(boolean z, Context context, zzdcf zzdcfVar) {
                zzefb zzefbVar2 = zzefb.this;
                try {
                    ((zzfct) zzefbVar2.zzb).zzu(z);
                    ((zzfct) zzefbVar2.zzb).zzy();
                } catch (zzfcd e2) {
                    zzcfi.zzk("Cannot show rewarded video.", e2);
                    throw new zzdle(e2.getCause());
                }
            }
        }));
        zze.zzd().zzj(new zzcti((zzfct) zzefbVar.zzb), this.zzb);
        zzdcz zze2 = zze.zze();
        zzdbq zzb = zze.zzb();
        ((zzegv) zzefbVar.zzc).zzc(new zzejo(this, zze.zza(), zzb, zze2, zze.zzg()));
        return zze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzefg
    public final void zzb(zzfbs zzfbsVar, zzfbg zzfbgVar, zzefb zzefbVar) {
        if (!((zzfct) zzefbVar.zzb).zzA()) {
            ((zzegv) zzefbVar.zzc).zzd(new zzejn(this, zzfbsVar, zzfbgVar, zzefbVar));
            ((zzfct) zzefbVar.zzb).zzh(this.zza, zzfbsVar.zza.zza.zzd, null, (zzcav) zzefbVar.zzc, zzfbgVar.zzw.toString());
            return;
        }
        zze(zzfbsVar, zzfbgVar, zzefbVar);
    }
}
