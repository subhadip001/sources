package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzesi implements zzetb {
    private final String zza;
    private final zzfvk zzb;
    private final ScheduledExecutorService zzc;
    private final Context zzd;
    private final zzfby zze;
    private final zzcnf zzf;

    public zzesi(zzfvk zzfvkVar, ScheduledExecutorService scheduledExecutorService, String str, Context context, zzfby zzfbyVar, zzcnf zzcnfVar) {
        this.zzb = zzfvkVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = context;
        this.zze = zzfbyVar;
        this.zzf = zzcnfVar;
    }

    public static /* synthetic */ zzfvj zzc(zzesi zzesiVar) {
        String str = zzesiVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgc)).booleanValue()) {
            str = AdFormat.UNKNOWN.name();
        }
        com.google.android.gms.ads.nonagon.signalgeneration.zzg zzn = zzesiVar.zzf.zzn();
        zzdbc zzdbcVar = new zzdbc();
        zzdbcVar.zzc(zzesiVar.zzd);
        zzfbw zzfbwVar = new zzfbw();
        zzfbwVar.zzs("adUnitId");
        zzfbwVar.zzE(zzesiVar.zze.zzd);
        zzfbwVar.zzr(new com.google.android.gms.ads.internal.client.zzq());
        zzdbcVar.zzf(zzfbwVar.zzG());
        zzn.zza(zzdbcVar.zzg());
        com.google.android.gms.ads.nonagon.signalgeneration.zzab zzabVar = new com.google.android.gms.ads.nonagon.signalgeneration.zzab();
        zzabVar.zza(str);
        zzn.zzb(zzabVar.zzb());
        new zzdhc();
        return zzfva.zzf(zzfva.zzm((zzfur) zzfva.zzo(zzfur.zzv(zzn.zzc().zzb()), ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgd)).longValue(), TimeUnit.MILLISECONDS, zzesiVar.zzc), new zzfoi() { // from class: com.google.android.gms.internal.ads.zzesg
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                com.google.android.gms.ads.nonagon.signalgeneration.zzal zzalVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzal) obj;
                return zzalVar != null ? new zzesj(zzalVar.zza) : new zzesj(null);
            }
        }, zzesiVar.zzb), Exception.class, new zzfoi() { // from class: com.google.android.gms.internal.ads.zzesh
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                zzcfi.zzh("", (Exception) obj);
                return new zzesj(null);
            }
        }, zzesiVar.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 33;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgb)).booleanValue() && !"adUnitId".equals(this.zze.zzf)) {
            return zzfva.zzl(new zzfug() { // from class: com.google.android.gms.internal.ads.zzesf
                @Override // com.google.android.gms.internal.ads.zzfug
                public final zzfvj zza() {
                    return zzesi.zzc(zzesi.this);
                }
            }, this.zzb);
        }
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzese
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzesj(null);
            }
        });
    }
}
