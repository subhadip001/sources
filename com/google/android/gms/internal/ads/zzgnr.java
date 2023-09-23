package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzgnr {
    public final Unsafe zza;

    public zzgnr(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract byte zza(long j2);

    public abstract double zzb(Object obj, long j2);

    public abstract float zzc(Object obj, long j2);

    public abstract void zzd(long j2, byte[] bArr, long j3, long j4);

    public abstract void zze(Object obj, long j2, boolean z);

    public abstract void zzf(Object obj, long j2, byte b);

    public abstract void zzg(Object obj, long j2, double d2);

    public abstract void zzh(Object obj, long j2, float f2);

    public abstract boolean zzi(Object obj, long j2);

    public final int zzj(Class cls) {
        return this.zza.arrayBaseOffset(cls);
    }

    public final int zzk(Class cls) {
        return this.zza.arrayIndexScale(cls);
    }

    public final int zzl(Object obj, long j2) {
        return this.zza.getInt(obj, j2);
    }

    public final long zzm(Object obj, long j2) {
        return this.zza.getLong(obj, j2);
    }

    public final long zzn(Field field) {
        return this.zza.objectFieldOffset(field);
    }

    public final Object zzo(Object obj, long j2) {
        return this.zza.getObject(obj, j2);
    }

    public final void zzp(Object obj, long j2, int i2) {
        this.zza.putInt(obj, j2, i2);
    }

    public final void zzq(Object obj, long j2, long j3) {
        this.zza.putLong(obj, j2, j3);
    }

    public final void zzr(Object obj, long j2, Object obj2) {
        this.zza.putObject(obj, j2, obj2);
    }
}
