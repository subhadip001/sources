package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.core.app.NotificationCompat;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class zzkf extends zzkh {
    private final AlarmManager zza;
    private zzap zzb;
    private Integer zzc;

    public zzkf(zzkt zzktVar) {
        super(zzktVar);
        this.zza = (AlarmManager) this.zzt.zzau().getSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    private final int zzf() {
        if (this.zzc == null) {
            this.zzc = Integer.valueOf("measurement".concat(String.valueOf(this.zzt.zzau().getPackageName())).hashCode());
        }
        return this.zzc.intValue();
    }

    private final PendingIntent zzh() {
        Context zzau = this.zzt.zzau();
        return PendingIntent.getBroadcast(zzau, 0, new Intent().setClassName(zzau, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.zzbs.zza);
    }

    private final zzap zzi() {
        if (this.zzb == null) {
            this.zzb = new zzke(this, this.zzf.zzq());
        }
        return this.zzb;
    }

    private final void zzj() {
        JobScheduler jobScheduler = (JobScheduler) this.zzt.zzau().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(zzf());
        }
    }

    public final void zza() {
        zzW();
        a.K(this.zzt, "Unscheduling upload");
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzh());
        }
        zzi().zzb();
        if (Build.VERSION.SDK_INT >= 24) {
            zzj();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzkh
    public final boolean zzb() {
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzh());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            zzj();
            return false;
        }
        return false;
    }

    public final void zzd(long j2) {
        zzW();
        this.zzt.zzaw();
        Context zzau = this.zzt.zzau();
        if (!zzlb.zzaj(zzau)) {
            this.zzt.zzay().zzc().zza("Receiver not registered/enabled");
        }
        if (!zzlb.zzak(zzau, false)) {
            this.zzt.zzay().zzc().zza("Service not registered/enabled");
        }
        zza();
        this.zzt.zzay().zzj().zzb("Scheduling upload, millis", Long.valueOf(j2));
        long elapsedRealtime = this.zzt.zzav().elapsedRealtime() + j2;
        this.zzt.zzf();
        if (j2 < Math.max(0L, ((Long) zzdu.zzw.zza(null)).longValue()) && !zzi().zze()) {
            zzi().zzd(j2);
        }
        this.zzt.zzaw();
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.zza;
            if (alarmManager != null) {
                this.zzt.zzf();
                alarmManager.setInexactRepeating(2, elapsedRealtime, Math.max(((Long) zzdu.zzr.zza(null)).longValue(), j2), zzh());
                return;
            }
            return;
        }
        Context zzau2 = this.zzt.zzau();
        ComponentName componentName = new ComponentName(zzau2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int zzf = zzf();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.zzbt.zza(zzau2, new JobInfo.Builder(zzf, componentName).setMinimumLatency(j2).setOverrideDeadline(j2 + j2).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }
}
