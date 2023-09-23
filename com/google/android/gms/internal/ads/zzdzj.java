package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdzj implements SensorEventListener {
    private final Context zza;
    private SensorManager zzb;
    private Sensor zzc;
    private long zzd;
    private int zze;
    private zzdzi zzf;
    private boolean zzg;

    public zzdzj(Context context) {
        this.zza = context;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhv)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f2 = fArr[0] / 9.80665f;
            float f3 = fArr[1] / 9.80665f;
            float f4 = fArr[2] / 9.80665f;
            float f5 = f4 * f4;
            if (((float) Math.sqrt(f5 + (f3 * f3) + (f2 * f2))) < ((Float) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhw)).floatValue()) {
                return;
            }
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
            if (this.zzd + ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhx)).intValue() > currentTimeMillis) {
                return;
            }
            if (this.zzd + ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhy)).intValue() < currentTimeMillis) {
                this.zze = 0;
            }
            com.google.android.gms.ads.internal.util.zze.zza("Shake detected.");
            this.zzd = currentTimeMillis;
            int i2 = this.zze + 1;
            this.zze = i2;
            zzdzi zzdziVar = this.zzf;
            if (zzdziVar != null) {
                if (i2 == ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhz)).intValue()) {
                    zzdza zzdzaVar = (zzdza) zzdziVar;
                    zzdzaVar.zzg(new zzdyx(zzdzaVar), zzdyz.GESTURE);
                }
            }
        }
    }

    public final void zza() {
        synchronized (this) {
            if (this.zzg) {
                SensorManager sensorManager = this.zzb;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.zzc);
                    com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for shake gestures.");
                }
                this.zzg = false;
            }
        }
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhv)).booleanValue()) {
                if (this.zzb == null) {
                    SensorManager sensorManager2 = (SensorManager) this.zza.getSystemService("sensor");
                    this.zzb = sensorManager2;
                    if (sensorManager2 == null) {
                        zzcfi.zzj("Shake detection failed to initialize. Failed to obtain accelerometer.");
                        return;
                    }
                    this.zzc = sensorManager2.getDefaultSensor(1);
                }
                if (!this.zzg && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.zzd = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis() - ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhx)).intValue();
                    this.zzg = true;
                    com.google.android.gms.ads.internal.util.zze.zza("Listening for shake gestures.");
                }
            }
        }
    }

    public final void zzc(zzdzi zzdziVar) {
        this.zzf = zzdziVar;
    }
}
