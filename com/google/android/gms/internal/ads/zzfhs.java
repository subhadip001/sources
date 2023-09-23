package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfhs implements Runnable {
    public static Boolean zza;
    private final Context zzb;
    private final zzcfo zzc;
    private String zze;
    private int zzf;
    private final zzdty zzg;
    private final zzecs zzi;
    private final zzcag zzj;
    private final zzfhx zzd = zzfia.zzc();
    private boolean zzh = false;

    public zzfhs(Context context, zzcfo zzcfoVar, zzdty zzdtyVar, zzecs zzecsVar, zzcag zzcagVar, byte[] bArr) {
        this.zzb = context;
        this.zzc = zzcfoVar;
        this.zzg = zzdtyVar;
        this.zzi = zzecsVar;
        this.zzj = zzcagVar;
    }

    public static synchronized boolean zza() {
        boolean booleanValue;
        synchronized (zzfhs.class) {
            if (zza == null) {
                if (((Boolean) zzbjh.zzb.zze()).booleanValue()) {
                    zza = Boolean.valueOf(Math.random() < ((Double) zzbjh.zza.zze()).doubleValue());
                } else {
                    zza = Boolean.FALSE;
                }
            }
            booleanValue = zza.booleanValue();
        }
        return booleanValue;
    }

    private final synchronized void zzc() {
        if (this.zzh) {
            return;
        }
        this.zzh = true;
        if (zza()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            this.zze = com.google.android.gms.ads.internal.util.zzs.zzo(this.zzb);
            this.zzf = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzb);
            long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhk)).intValue();
            zzcfv.zzd.scheduleAtFixedRate(this, intValue, intValue, TimeUnit.MILLISECONDS);
        }
    }

    private final synchronized void zzd() {
        try {
            new zzecr(this.zzb, this.zzc.zza, this.zzj, Binder.getCallingUid(), null).zza(new zzecp((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhj), 60000, new HashMap(), ((zzfia) this.zzd.zzaj()).zzau(), "application/x-protobuf"));
            this.zzd.zzc();
        } catch (Exception e2) {
            if ((e2 instanceof zzdzk) && ((zzdzk) e2).zza() == 3) {
                this.zzd.zzc();
            } else {
                com.google.android.gms.ads.internal.zzt.zzo().zzs(e2, "CuiMonitor.sendCuiPing");
            }
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        if (zza()) {
            if (this.zzd.zza() == 0) {
                return;
            }
            zzd();
        }
    }

    public final synchronized void zzb(zzfhk zzfhkVar) {
        if (!this.zzh) {
            zzc();
        }
        if (zza()) {
            if (zzfhkVar == null) {
                return;
            }
            if (this.zzd.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhl)).intValue()) {
                return;
            }
            zzfhx zzfhxVar = this.zzd;
            zzfhy zza2 = zzfhz.zza();
            zzfhu zza3 = zzfhv.zza();
            zza3.zzo(zzfhkVar.zzh());
            zza3.zzl(zzfhkVar.zzg());
            zza3.zze(zzfhkVar.zzb());
            zza3.zzq(3);
            zza3.zzk(this.zzc.zza);
            zza3.zza(this.zze);
            zza3.zzi(Build.VERSION.RELEASE);
            zza3.zzm(Build.VERSION.SDK_INT);
            zza3.zzp(zzfhkVar.zzj());
            zza3.zzh(zzfhkVar.zza());
            zza3.zzc(this.zzf);
            zza3.zzn(zzfhkVar.zzi());
            zza3.zzb(zzfhkVar.zzc());
            zza3.zzd(zzfhkVar.zzd());
            zza3.zzf(zzfhkVar.zze());
            zza3.zzg(this.zzg.zzc(zzfhkVar.zze()));
            zza3.zzj(zzfhkVar.zzf());
            zza2.zza(zza3);
            zzfhxVar.zzb(zza2);
        }
    }
}
