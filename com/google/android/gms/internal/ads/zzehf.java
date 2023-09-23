package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzehf implements zzefg {
    private final Context zza;
    private final zzdkx zzb;
    private final zzcfo zzc;
    private final Executor zzd;

    public zzehf(Context context, zzcfo zzcfoVar, zzdkx zzdkxVar, Executor executor) {
        this.zza = context;
        this.zzc = zzcfoVar;
        this.zzb = zzdkxVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzefg
    public final /* bridge */ /* synthetic */ Object zza(zzfbs zzfbsVar, zzfbg zzfbgVar, final zzefb zzefbVar) {
        zzdjz zze = this.zzb.zze(new zzcyl(zzfbsVar, zzfbgVar, zzefbVar.zza), new zzdkc(new zzdlf() { // from class: com.google.android.gms.internal.ads.zzehe
            @Override // com.google.android.gms.internal.ads.zzdlf
            public final void zza(boolean z, Context context, zzdcf zzdcfVar) {
                zzehf.this.zzc(zzefbVar, z, context, zzdcfVar);
            }
        }, null));
        zze.zzd().zzj(new zzcti((zzfct) zzefbVar.zzb), this.zzd);
        ((zzegu) zzefbVar.zzc).zzc(zze.zzi());
        return zze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzefg
    public final void zzb(zzfbs zzfbsVar, zzfbg zzfbgVar, zzefb zzefbVar) {
        ((zzfct) zzefbVar.zzb).zzn(this.zza, zzfbsVar.zza.zza.zzd, zzfbgVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzfbgVar.zzt), (zzbuf) zzefbVar.zzc);
    }

    public final /* synthetic */ void zzc(zzefb zzefbVar, boolean z, Context context, zzdcf zzdcfVar) {
        try {
            ((zzfct) zzefbVar.zzb).zzu(z);
            if (this.zzc.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzaB)).intValue()) {
                ((zzfct) zzefbVar.zzb).zzv();
            } else {
                ((zzfct) zzefbVar.zzb).zzw(context);
            }
        } catch (zzfcd e2) {
            zzcfi.zzi("Cannot show interstitial.");
            throw new zzdle(e2.getCause());
        }
    }
}
