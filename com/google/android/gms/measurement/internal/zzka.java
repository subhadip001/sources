package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzof;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class zzka {
    @VisibleForTesting
    public long zza;
    @VisibleForTesting
    public long zzb;
    public final /* synthetic */ zzkc zzc;
    private final zzap zzd;

    public zzka(zzkc zzkcVar) {
        this.zzc = zzkcVar;
        this.zzd = new zzjz(this, zzkcVar.zzt);
        long elapsedRealtime = zzkcVar.zzt.zzav().elapsedRealtime();
        this.zza = elapsedRealtime;
        this.zzb = elapsedRealtime;
    }

    public final void zza() {
        this.zzd.zzb();
        this.zza = 0L;
        this.zzb = 0L;
    }

    public final void zzb(long j2) {
        this.zzd.zzb();
    }

    public final void zzc(long j2) {
        this.zzc.zzg();
        this.zzd.zzb();
        this.zza = j2;
        this.zzb = j2;
    }

    public final boolean zzd(boolean z, boolean z2, long j2) {
        this.zzc.zzg();
        this.zzc.zza();
        zzof.zzc();
        if (this.zzc.zzt.zzf().zzs(null, zzdu.zzad)) {
            if (this.zzc.zzt.zzJ()) {
                this.zzc.zzt.zzm().zzj.zzb(this.zzc.zzt.zzav().currentTimeMillis());
            }
        } else {
            this.zzc.zzt.zzm().zzj.zzb(this.zzc.zzt.zzav().currentTimeMillis());
        }
        long j3 = j2 - this.zza;
        if (!z && j3 < 1000) {
            this.zzc.zzt.zzay().zzj().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j3));
            return false;
        }
        if (!z2) {
            j3 = j2 - this.zzb;
            this.zzb = j2;
        }
        this.zzc.zzt.zzay().zzj().zzb("Recording user engagement, ms", Long.valueOf(j3));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j3);
        zzlb.zzK(this.zzc.zzt.zzs().zzj(!this.zzc.zzt.zzf().zzu()), bundle, true);
        if (!z2) {
            this.zzc.zzt.zzq().zzG("auto", "_e", bundle);
        }
        this.zza = j2;
        this.zzd.zzb();
        this.zzd.zzd(3600000L);
        return true;
    }
}
