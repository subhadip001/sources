package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zznw;
import com.google.android.gms.internal.measurement.zzpd;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class zzkb {
    public final /* synthetic */ zzkc zza;

    public zzkb(zzkc zzkcVar) {
        this.zza = zzkcVar;
    }

    public final void zza() {
        this.zza.zzg();
        if (this.zza.zzt.zzm().zzk(this.zza.zzt.zzav().currentTimeMillis())) {
            this.zza.zzt.zzm().zzg.zza(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                a.K(this.zza.zzt, "Detected application was in foreground");
                zzc(this.zza.zzt.zzav().currentTimeMillis(), false);
            }
        }
    }

    public final void zzb(long j2, boolean z) {
        this.zza.zzg();
        this.zza.zzm();
        if (this.zza.zzt.zzm().zzk(j2)) {
            this.zza.zzt.zzm().zzg.zza(true);
            zzpd.zzc();
            if (this.zza.zzt.zzf().zzs(null, zzdu.zzam)) {
                this.zza.zzt.zzh().zzo();
            }
        }
        this.zza.zzt.zzm().zzj.zzb(j2);
        if (this.zza.zzt.zzm().zzg.zzb()) {
            zzc(j2, z);
        }
    }

    @VisibleForTesting
    public final void zzc(long j2, boolean z) {
        this.zza.zzg();
        if (this.zza.zzt.zzJ()) {
            this.zza.zzt.zzm().zzj.zzb(j2);
            this.zza.zzt.zzay().zzj().zzb("Session started, time", Long.valueOf(this.zza.zzt.zzav().elapsedRealtime()));
            Long valueOf = Long.valueOf(j2 / 1000);
            this.zza.zzt.zzq().zzY("auto", "_sid", valueOf, j2);
            this.zza.zzt.zzm().zzk.zzb(valueOf.longValue());
            this.zza.zzt.zzm().zzg.zza(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.zza.zzt.zzf().zzs(null, zzdu.zzZ) && z) {
                bundle.putLong("_aib", 1L);
            }
            this.zza.zzt.zzq().zzH("auto", "_s", j2, bundle);
            zznw.zzc();
            if (this.zza.zzt.zzf().zzs(null, zzdu.zzac)) {
                String zza = this.zza.zzt.zzm().zzp.zza();
                if (TextUtils.isEmpty(zza)) {
                    return;
                }
                this.zza.zzt.zzq().zzH("auto", "_ssr", j2, a.S("_ffr", zza));
            }
        }
    }
}
