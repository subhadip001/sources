package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzayz {
    private static final byte[] zza = {0, 0, 0, 1};
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static Pair zza(byte[] bArr) {
        zzazf zzazfVar = new zzazf(bArr, bArr.length);
        int zzc2 = zzc(zzazfVar);
        int zzd = zzd(zzazfVar);
        int zza2 = zzazfVar.zza(4);
        if (zzc2 == 5 || zzc2 == 29) {
            zzd = zzd(zzazfVar);
            if (zzc(zzazfVar) == 22) {
                zza2 = zzazfVar.zza(4);
            }
        }
        int i2 = zzc[zza2];
        zzayy.zzc(i2 != -1);
        return Pair.create(Integer.valueOf(zzd), Integer.valueOf(i2));
    }

    public static byte[] zzb(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3 + 4];
        System.arraycopy(zza, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i2, bArr2, 4, i3);
        return bArr2;
    }

    private static int zzc(zzazf zzazfVar) {
        int zza2 = zzazfVar.zza(5);
        return zza2 == 31 ? zzazfVar.zza(6) + 32 : zza2;
    }

    private static int zzd(zzazf zzazfVar) {
        int zza2 = zzazfVar.zza(4);
        if (zza2 == 15) {
            return zzazfVar.zza(24);
        }
        zzayy.zzc(zza2 < 13);
        return zzb[zza2];
    }
}
