package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzyj {
    public static void zza(long j2, zzdy zzdyVar, zzzz[] zzzzVarArr) {
        int i2;
        while (true) {
            if (zzdyVar.zza() <= 1) {
                return;
            }
            int zzc = zzc(zzdyVar);
            int zzc2 = zzc(zzdyVar);
            int zzc3 = zzdyVar.zzc() + zzc2;
            if (zzc2 == -1 || zzc2 > zzdyVar.zza()) {
                Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                zzc3 = zzdyVar.zzd();
            } else if (zzc == 4 && zzc2 >= 8) {
                int zzk = zzdyVar.zzk();
                int zzo = zzdyVar.zzo();
                if (zzo == 49) {
                    i2 = zzdyVar.zze();
                    zzo = 49;
                } else {
                    i2 = 0;
                }
                int zzk2 = zzdyVar.zzk();
                if (zzo == 47) {
                    zzdyVar.zzG(1);
                    zzo = 47;
                }
                boolean z = zzk == 181 && (zzo == 49 || zzo == 47) && zzk2 == 3;
                if (zzo == 49) {
                    z &= i2 == 1195456820;
                }
                if (z) {
                    zzb(j2, zzdyVar, zzzzVarArr);
                }
            }
            zzdyVar.zzF(zzc3);
        }
    }

    public static void zzb(long j2, zzdy zzdyVar, zzzz[] zzzzVarArr) {
        int zzk = zzdyVar.zzk();
        if ((zzk & 64) != 0) {
            zzdyVar.zzG(1);
            int i2 = (zzk & 31) * 3;
            int zzc = zzdyVar.zzc();
            for (zzzz zzzzVar : zzzzVarArr) {
                zzdyVar.zzF(zzc);
                zzzzVar.zzq(zzdyVar, i2);
                if (j2 != -9223372036854775807L) {
                    zzzzVar.zzs(j2, 1, i2, 0, null);
                }
            }
        }
    }

    private static int zzc(zzdy zzdyVar) {
        int i2 = 0;
        while (zzdyVar.zza() != 0) {
            int zzk = zzdyVar.zzk();
            i2 += zzk;
            if (zzk != 255) {
                return i2;
            }
        }
        return -1;
    }
}
