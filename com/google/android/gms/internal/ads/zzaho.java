package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaho {
    public static int zza(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] != 71) {
            i2++;
        }
        return i2;
    }

    public static long zzb(zzdy zzdyVar, int i2, int i3) {
        zzdyVar.zzF(i2);
        if (zzdyVar.zza() < 5) {
            return -9223372036854775807L;
        }
        int zze = zzdyVar.zze();
        if ((8388608 & zze) == 0 && ((zze >> 8) & 8191) == i3 && (zze & 32) != 0 && zzdyVar.zzk() >= 7 && zzdyVar.zza() >= 7 && (zzdyVar.zzk() & 16) == 16) {
            byte[] bArr = new byte[6];
            zzdyVar.zzB(bArr, 0, 6);
            byte b = bArr[0];
            byte b2 = bArr[1];
            byte b3 = bArr[2];
            long j2 = bArr[3] & 255;
            return ((b2 & 255) << 17) | ((b & 255) << 25) | ((b3 & 255) << 9) | (j2 + j2) | ((bArr[4] & 255) >> 7);
        }
        return -9223372036854775807L;
    }
}
