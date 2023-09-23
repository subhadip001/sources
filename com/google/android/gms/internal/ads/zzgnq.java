package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgnq extends zzgnr {
    public zzgnq(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzgnr
    public final byte zza(long j2) {
        return Memory.peekByte(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzgnr
    public final double zzb(Object obj, long j2) {
        return Double.longBitsToDouble(zzm(obj, j2));
    }

    @Override // com.google.android.gms.internal.ads.zzgnr
    public final float zzc(Object obj, long j2) {
        return Float.intBitsToFloat(zzl(obj, j2));
    }

    @Override // com.google.android.gms.internal.ads.zzgnr
    public final void zzd(long j2, byte[] bArr, long j3, long j4) {
        Memory.peekByteArray(j2, bArr, (int) j3, (int) j4);
    }

    @Override // com.google.android.gms.internal.ads.zzgnr
    public final void zze(Object obj, long j2, boolean z) {
        if (zzgns.zzb) {
            zzgns.zzG(obj, j2, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzgns.zzH(obj, j2, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnr
    public final void zzf(Object obj, long j2, byte b) {
        if (zzgns.zzb) {
            zzgns.zzG(obj, j2, b);
        } else {
            zzgns.zzH(obj, j2, b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnr
    public final void zzg(Object obj, long j2, double d2) {
        zzq(obj, j2, Double.doubleToLongBits(d2));
    }

    @Override // com.google.android.gms.internal.ads.zzgnr
    public final void zzh(Object obj, long j2, float f2) {
        zzp(obj, j2, Float.floatToIntBits(f2));
    }

    @Override // com.google.android.gms.internal.ads.zzgnr
    public final boolean zzi(Object obj, long j2) {
        if (zzgns.zzb) {
            return zzgns.zzw(obj, j2);
        }
        return zzgns.zzx(obj, j2);
    }
}
