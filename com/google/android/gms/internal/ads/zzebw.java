package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzebw {
    private final zzfvk zza;
    private final zzebd zzb;
    private final zzgpo zzc;

    public zzebw(zzfvk zzfvkVar, zzebd zzebdVar, zzgpo zzgpoVar) {
        this.zza = zzfvkVar;
        this.zzb = zzebdVar;
        this.zzc = zzgpoVar;
    }

    private final zzfvj zzg(final zzbzu zzbzuVar, zzebv zzebvVar, final zzebv zzebvVar2, final zzfuh zzfuhVar) {
        zzfvj zzg;
        String str = zzbzuVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzy(str)) {
            zzg = zzfva.zzh(new zzebm(1));
        } else {
            zzg = zzfva.zzg(zzebvVar.zza(zzbzuVar), ExecutionException.class, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzebn
                @Override // com.google.android.gms.internal.ads.zzfuh
                public final zzfvj zza(Object obj) {
                    return zzfva.zzh(((ExecutionException) obj).getCause());
                }
            }, this.zza);
        }
        return zzfva.zzg(zzfva.zzn(zzfur.zzv(zzg), zzfuhVar, this.zza), zzebm.class, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzebu
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzebw.this.zzb(zzebvVar2, zzbzuVar, zzfuhVar, (zzebm) obj);
            }
        }, this.zza);
    }

    public final zzfvj zza(final zzbzu zzbzuVar) {
        zzfuh zzfuhVar = new zzfuh() { // from class: com.google.android.gms.internal.ads.zzebr
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                zzbzu zzbzuVar2 = zzbzu.this;
                zzbzuVar2.zzj = new String(zzftj.zza((InputStream) obj), zzfog.zzc);
                return zzfva.zzi(zzbzuVar2);
            }
        };
        final zzebd zzebdVar = this.zzb;
        return zzg(zzbzuVar, new zzebv() { // from class: com.google.android.gms.internal.ads.zzebs
            @Override // com.google.android.gms.internal.ads.zzebv
            public final zzfvj zza(zzbzu zzbzuVar2) {
                return zzebd.this.zzb(zzbzuVar2);
            }
        }, new zzebv() { // from class: com.google.android.gms.internal.ads.zzebt
            @Override // com.google.android.gms.internal.ads.zzebv
            public final zzfvj zza(zzbzu zzbzuVar2) {
                return zzebw.this.zzc(zzbzuVar2);
            }
        }, zzfuhVar);
    }

    public final /* synthetic */ zzfvj zzb(zzebv zzebvVar, zzbzu zzbzuVar, zzfuh zzfuhVar, zzebm zzebmVar) {
        return zzfva.zzn(zzebvVar.zza(zzbzuVar), zzfuhVar, this.zza);
    }

    public final /* synthetic */ zzfvj zzc(zzbzu zzbzuVar) {
        return ((zzecn) this.zzc.zzb()).zzb(zzbzuVar, Binder.getCallingUid());
    }

    public final /* synthetic */ zzfvj zzd(zzbzu zzbzuVar) {
        String str;
        zzebd zzebdVar = this.zzb;
        if (((Boolean) zzbju.zzd.zze()).booleanValue()) {
            str = zzbzuVar.zzh;
        } else {
            str = zzbzuVar.zzj;
        }
        return zzebdVar.zzc(str);
    }

    public final /* synthetic */ zzfvj zze(zzbzu zzbzuVar) {
        String str;
        zzecn zzecnVar = (zzecn) this.zzc.zzb();
        if (((Boolean) zzbju.zzd.zze()).booleanValue()) {
            str = zzbzuVar.zzh;
        } else {
            str = zzbzuVar.zzj;
        }
        return zzecnVar.zzi(str);
    }

    public final zzfvj zzf(zzbzu zzbzuVar) {
        if (zzapf.zzg(zzbzuVar.zzj)) {
            return zzfva.zzh(new zzdzk(2, "Pool key missing from removeUrl call."));
        }
        return zzg(zzbzuVar, new zzebv() { // from class: com.google.android.gms.internal.ads.zzebp
            @Override // com.google.android.gms.internal.ads.zzebv
            public final zzfvj zza(zzbzu zzbzuVar2) {
                return zzebw.this.zzd(zzbzuVar2);
            }
        }, new zzebv() { // from class: com.google.android.gms.internal.ads.zzebq
            @Override // com.google.android.gms.internal.ads.zzebv
            public final zzfvj zza(zzbzu zzbzuVar2) {
                return zzebw.this.zze(zzbzuVar2);
            }
        }, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzebo
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                return zzfva.zzi(null);
            }
        });
    }
}
