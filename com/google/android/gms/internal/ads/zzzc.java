package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzzc {
    public static zzbl zza(zzyt zzytVar, boolean z) {
        zzbl zza = new zzzj().zza(zzytVar, z ? null : zzacb.zza);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }

    public static zzze zzb(zzdy zzdyVar) {
        zzdyVar.zzG(1);
        int zzm = zzdyVar.zzm();
        long zzc = zzdyVar.zzc() + zzm;
        int i2 = zzm / 18;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            long zzr = zzdyVar.zzr();
            if (zzr == -1) {
                jArr = Arrays.copyOf(jArr, i3);
                jArr2 = Arrays.copyOf(jArr2, i3);
                break;
            }
            jArr[i3] = zzr;
            jArr2[i3] = zzdyVar.zzr();
            zzdyVar.zzG(2);
            i3++;
        }
        zzdyVar.zzG((int) (zzc - zzdyVar.zzc()));
        return new zzze(jArr, jArr2);
    }
}
