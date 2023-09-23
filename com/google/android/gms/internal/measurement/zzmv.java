package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class zzmv extends zzmx {
    public zzmv(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zzmx
    public final double zza(Object obj, long j2) {
        return Double.longBitsToDouble(zzk(obj, j2));
    }

    @Override // com.google.android.gms.internal.measurement.zzmx
    public final float zzb(Object obj, long j2) {
        return Float.intBitsToFloat(zzj(obj, j2));
    }

    @Override // com.google.android.gms.internal.measurement.zzmx
    public final void zzc(Object obj, long j2, boolean z) {
        if (zzmy.zzb) {
            zzmy.zzD(obj, j2, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzmy.zzE(obj, j2, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmx
    public final void zzd(Object obj, long j2, byte b) {
        if (zzmy.zzb) {
            zzmy.zzD(obj, j2, b);
        } else {
            zzmy.zzE(obj, j2, b);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmx
    public final void zze(Object obj, long j2, double d2) {
        zzo(obj, j2, Double.doubleToLongBits(d2));
    }

    @Override // com.google.android.gms.internal.measurement.zzmx
    public final void zzf(Object obj, long j2, float f2) {
        zzn(obj, j2, Float.floatToIntBits(f2));
    }

    @Override // com.google.android.gms.internal.measurement.zzmx
    public final boolean zzg(Object obj, long j2) {
        if (zzmy.zzb) {
            return zzmy.zzt(obj, j2);
        }
        return zzmy.zzu(obj, j2);
    }
}
