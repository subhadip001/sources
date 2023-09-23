package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import e.f.a;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class zzd extends zze {
    private final Map zza;
    private final Map zzb;
    private long zzc;

    public zzd(zzfr zzfrVar) {
        super(zzfrVar);
        this.zzb = new a();
        this.zza = new a();
    }

    public static /* synthetic */ void zza(zzd zzdVar, String str, long j2) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        if (zzdVar.zzb.isEmpty()) {
            zzdVar.zzc = j2;
        }
        Integer num = (Integer) zzdVar.zzb.get(str);
        if (num != null) {
            zzdVar.zzb.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zzdVar.zzb.size() >= 100) {
            f.a.b.a.a.L(zzdVar.zzt, "Too many ads visible");
        } else {
            zzdVar.zzb.put(str, 1);
            zzdVar.zza.put(str, Long.valueOf(j2));
        }
    }

    public static /* synthetic */ void zzb(zzd zzdVar, String str, long j2) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) zzdVar.zzb.get(str);
        if (num != null) {
            zzie zzj = zzdVar.zzt.zzs().zzj(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                zzdVar.zzb.remove(str);
                Long l2 = (Long) zzdVar.zza.get(str);
                if (l2 == null) {
                    f.a.b.a.a.J(zzdVar.zzt, "First ad unit exposure time was never set");
                } else {
                    long longValue = l2.longValue();
                    zzdVar.zza.remove(str);
                    zzdVar.zzi(str, j2 - longValue, zzj);
                }
                if (zzdVar.zzb.isEmpty()) {
                    long j3 = zzdVar.zzc;
                    if (j3 == 0) {
                        f.a.b.a.a.J(zzdVar.zzt, "First ad exposure time was never set");
                        return;
                    }
                    zzdVar.zzh(j2 - j3, zzj);
                    zzdVar.zzc = 0L;
                    return;
                }
                return;
            }
            zzdVar.zzb.put(str, Integer.valueOf(intValue));
            return;
        }
        zzdVar.zzt.zzay().zzd().zzb("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    private final void zzh(long j2, zzie zzieVar) {
        if (zzieVar == null) {
            f.a.b.a.a.K(this.zzt, "Not logging ad exposure. No active activity");
        } else if (j2 < 1000) {
            this.zzt.zzay().zzj().zzb("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j2);
            zzlb.zzK(zzieVar, bundle, true);
            this.zzt.zzq().zzG("am", "_xa", bundle);
        }
    }

    private final void zzi(String str, long j2, zzie zzieVar) {
        if (zzieVar == null) {
            f.a.b.a.a.K(this.zzt, "Not logging ad unit exposure. No active activity");
        } else if (j2 < 1000) {
            this.zzt.zzay().zzj().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j2);
            zzlb.zzK(zzieVar, bundle, true);
            this.zzt.zzq().zzG("am", "_xu", bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(long j2) {
        for (String str : this.zza.keySet()) {
            this.zza.put(str, Long.valueOf(j2));
        }
        if (this.zza.isEmpty()) {
            return;
        }
        this.zzc = j2;
    }

    public final void zzd(String str, long j2) {
        if (str != null && str.length() != 0) {
            this.zzt.zzaz().zzp(new zza(this, str, j2));
        } else {
            f.a.b.a.a.J(this.zzt, "Ad unit id must be a non-empty string");
        }
    }

    public final void zze(String str, long j2) {
        if (str != null && str.length() != 0) {
            this.zzt.zzaz().zzp(new zzb(this, str, j2));
        } else {
            f.a.b.a.a.J(this.zzt, "Ad unit id must be a non-empty string");
        }
    }

    public final void zzf(long j2) {
        zzie zzj = this.zzt.zzs().zzj(false);
        for (String str : this.zza.keySet()) {
            zzi(str, j2 - ((Long) this.zza.get(str)).longValue(), zzj);
        }
        if (!this.zza.isEmpty()) {
            zzh(j2 - this.zzc, zzj);
        }
        zzj(j2);
    }
}
