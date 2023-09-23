package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzegv extends zzcau implements zzddc {
    private zzcav zza;
    private zzddb zzb;
    private zzdjq zzc;

    @Override // com.google.android.gms.internal.ads.zzddc
    public final synchronized void zza(zzddb zzddbVar) {
        this.zzb = zzddbVar;
    }

    public final synchronized void zzc(zzcav zzcavVar) {
        this.zza = zzcavVar;
    }

    public final synchronized void zzd(zzdjq zzdjqVar) {
        this.zzc = zzdjqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final synchronized void zze(IObjectWrapper iObjectWrapper) {
        zzcav zzcavVar = this.zza;
        if (zzcavVar != null) {
            ((zzejo) zzcavVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) {
        zzcav zzcavVar = this.zza;
        if (zzcavVar != null) {
            zzcavVar.zzf(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final synchronized void zzg(IObjectWrapper iObjectWrapper, int i2) {
        zzddb zzddbVar = this.zzb;
        if (zzddbVar != null) {
            zzddbVar.zza(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) {
        zzcav zzcavVar = this.zza;
        if (zzcavVar != null) {
            ((zzejo) zzcavVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        zzddb zzddbVar = this.zzb;
        if (zzddbVar != null) {
            zzddbVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) {
        zzcav zzcavVar = this.zza;
        if (zzcavVar != null) {
            ((zzejo) zzcavVar).zza.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, int i2) {
        zzdjq zzdjqVar = this.zzc;
        if (zzdjqVar != null) {
            zzcfi.zzj("Fail to initialize adapter ".concat(String.valueOf(((zzejn) zzdjqVar).zzc.zza)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) {
        zzdjq zzdjqVar = this.zzc;
        if (zzdjqVar != null) {
            Executor zzc = zzejp.zzc(((zzejn) zzdjqVar).zzd);
            final zzfbs zzfbsVar = ((zzejn) zzdjqVar).zza;
            final zzfbg zzfbgVar = ((zzejn) zzdjqVar).zzb;
            final zzefb zzefbVar = ((zzejn) zzdjqVar).zzc;
            final zzejn zzejnVar = (zzejn) zzdjqVar;
            zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejm
                @Override // java.lang.Runnable
                public final void run() {
                    zzejn zzejnVar2 = zzejn.this;
                    zzfbs zzfbsVar2 = zzfbsVar;
                    zzfbg zzfbgVar2 = zzfbgVar;
                    zzefb zzefbVar2 = zzefbVar;
                    zzejp zzejpVar = zzejnVar2.zzd;
                    zzejp.zze(zzfbsVar2, zzfbgVar2, zzefbVar2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final synchronized void zzm(IObjectWrapper iObjectWrapper, zzcaw zzcawVar) {
        zzcav zzcavVar = this.zza;
        if (zzcavVar != null) {
            ((zzejo) zzcavVar).zzd.zza(zzcawVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) {
        zzcav zzcavVar = this.zza;
        if (zzcavVar != null) {
            ((zzejo) zzcavVar).zzc.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) {
        zzcav zzcavVar = this.zza;
        if (zzcavVar != null) {
            ((zzejo) zzcavVar).zzd.zzc();
        }
    }
}
