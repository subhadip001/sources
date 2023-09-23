package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzahx {
    public static Pair zza(zzyt zzytVar) {
        zzytVar.zzj();
        zzahw zzd = zzd(1684108385, zzytVar, new zzdy(8));
        ((zzym) zzytVar).zzo(8, false);
        return Pair.create(Long.valueOf(zzytVar.zzf()), Long.valueOf(zzd.zzb));
    }

    public static zzahv zzb(zzyt zzytVar) {
        byte[] bArr;
        zzdy zzdyVar = new zzdy(16);
        zzahw zzd = zzd(1718449184, zzytVar, zzdyVar);
        zzcw.zzf(zzd.zzb >= 16);
        zzym zzymVar = (zzym) zzytVar;
        zzymVar.zzm(zzdyVar.zzH(), 0, 16, false);
        zzdyVar.zzF(0);
        int zzi = zzdyVar.zzi();
        int zzi2 = zzdyVar.zzi();
        int zzh = zzdyVar.zzh();
        int zzh2 = zzdyVar.zzh();
        int zzi3 = zzdyVar.zzi();
        int zzi4 = zzdyVar.zzi();
        int i2 = ((int) zzd.zzb) - 16;
        if (i2 > 0) {
            bArr = new byte[i2];
            zzymVar.zzm(bArr, 0, i2, false);
        } else {
            bArr = zzeg.zzf;
        }
        byte[] bArr2 = bArr;
        ((zzym) zzytVar).zzo((int) (zzytVar.zze() - zzytVar.zzf()), false);
        return new zzahv(zzi, zzi2, zzh, zzh2, zzi3, zzi4, bArr2);
    }

    public static boolean zzc(zzyt zzytVar) {
        zzdy zzdyVar = new zzdy(8);
        int i2 = zzahw.zza(zzytVar, zzdyVar).zza;
        if (i2 == 1380533830 || i2 == 1380333108) {
            ((zzym) zzytVar).zzm(zzdyVar.zzH(), 0, 4, false);
            zzdyVar.zzF(0);
            int zze = zzdyVar.zze();
            if (zze != 1463899717) {
                Log.e("WavHeaderReader", "Unsupported form type: " + zze);
                return false;
            }
            return true;
        }
        return false;
    }

    private static zzahw zzd(int i2, zzyt zzytVar, zzdy zzdyVar) {
        zzahw zza = zzahw.zza(zzytVar, zzdyVar);
        while (true) {
            int i3 = zza.zza;
            if (i3 == i2) {
                return zza;
            }
            a.O("Ignoring unknown WAV chunk: ", i3, "WavHeaderReader");
            long j2 = zza.zzb + 8;
            if (j2 <= 2147483647L) {
                ((zzym) zzytVar).zzo((int) j2, false);
                zza = zzahw.zza(zzytVar, zzdyVar);
            } else {
                int i4 = zza.zza;
                throw zzbp.zzc("Chunk is too large (~2GB+) to skip; id: " + i4);
            }
        }
    }
}
