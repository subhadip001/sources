package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzcnf implements zzcsl {
    private static zzcnf zza;

    private static synchronized zzcnf zzC(Context context, zzbtz zzbtzVar, int i2, boolean z, int i3, zzcrc zzcrcVar) {
        synchronized (zzcnf.class) {
            zzcnf zzcnfVar = zza;
            if (zzcnfVar != null) {
                return zzcnfVar;
            }
            zzbhy.zzc(context);
            zzfcr zzd = zzfcr.zzd(context);
            zzcfo zzc = zzd.zzc(221310000, false, i3);
            zzd.zze(zzbtzVar);
            zzcpn zzcpnVar = new zzcpn(null);
            zzcng zzcngVar = new zzcng();
            zzcngVar.zzd(zzc);
            zzcngVar.zzc(context);
            zzcpnVar.zzb(new zzcni(zzcngVar, null));
            zzcpnVar.zzc(new zzcrd(zzcrcVar));
            zzcnf zza2 = zzcpnVar.zza();
            com.google.android.gms.ads.internal.zzt.zzo().zzr(context, zzc);
            com.google.android.gms.ads.internal.zzt.zzc().zzi(context);
            com.google.android.gms.ads.internal.zzt.zzp().zzj(context);
            com.google.android.gms.ads.internal.zzt.zzp().zzi(context);
            com.google.android.gms.ads.internal.util.zzd.zza(context);
            com.google.android.gms.ads.internal.zzt.zzb().zzd(context);
            com.google.android.gms.ads.internal.zzt.zzv().zzb(context);
            zzcdo.zzd(context);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzff)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzas)).booleanValue()) {
                    zzbdl zzbdlVar = new zzbdl(new zzbdr(context));
                    zzedn zzednVar = new zzedn(new zzedj(context), zza2.zzz());
                    com.google.android.gms.ads.internal.zzt.zzp();
                    new zzeef(context, zzc, zzbdlVar, zzednVar, UUID.randomUUID().toString(), zza2.zzx()).zzb(com.google.android.gms.ads.internal.zzt.zzo().zzh().zzP());
                }
            }
            zza = zza2;
            return zza2;
        }
    }

    public static zzcnf zza(Context context, zzbtz zzbtzVar, int i2) {
        return zzC(context, zzbtzVar, 221310000, false, i2, new zzcof());
    }

    public abstract Executor zzA();

    public abstract ScheduledExecutorService zzB();

    public abstract zzcro zzb();

    public abstract zzcuw zzc();

    public abstract zzcvh zzd();

    public abstract zzcwq zze();

    public abstract zzdeh zzf();

    public abstract zzdkw zzg();

    public abstract zzdls zzh();

    public abstract zzdsw zzi();

    public abstract zzdxo zzj();

    public abstract zzdza zzk();

    public abstract zzeev zzl();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzc zzm();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzg zzn();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzz zzo();

    @Override // com.google.android.gms.internal.ads.zzcsl
    public final zzett zzp(zzbzu zzbzuVar, int i2) {
        return zzq(new zzevf(zzbzuVar, i2));
    }

    public abstract zzett zzq(zzevf zzevfVar);

    public abstract zzewe zzr();

    public abstract zzexs zzs();

    public abstract zzezl zzt();

    public abstract zzfaz zzu();

    public abstract zzfck zzv();

    public abstract zzfcu zzw();

    public abstract zzfgo zzx();

    public abstract zzfhs zzy();

    public abstract zzfvk zzz();
}
