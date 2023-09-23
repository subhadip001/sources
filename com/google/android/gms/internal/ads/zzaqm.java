package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzaqm implements Callable {
    public final String zza = getClass().getSimpleName();
    public final zzapc zzb;
    public final String zzc;
    public final String zzd;
    public final zzali zze;
    public Method zzf;
    public final int zzg;
    public final int zzh;

    public zzaqm(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i2, int i3) {
        this.zzb = zzapcVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzaliVar;
        this.zzg = i2;
        this.zzh = i3;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        zzk();
        return null;
    }

    public abstract void zza();

    public Void zzk() {
        long nanoTime;
        Method zzj;
        int i2;
        try {
            nanoTime = System.nanoTime();
            zzj = this.zzb.zzj(this.zzc, this.zzd);
            this.zzf = zzj;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (zzj == null) {
            return null;
        }
        zza();
        zzanx zzd = this.zzb.zzd();
        if (zzd != null && (i2 = this.zzg) != Integer.MIN_VALUE) {
            zzd.zzc(this.zzh, i2, (System.nanoTime() - nanoTime) / 1000, null, null);
        }
        return null;
    }
}
