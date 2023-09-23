package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaes {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean zza(zzyt zzytVar) {
        return zzc(zzytVar, true, false);
    }

    public static boolean zzb(zzyt zzytVar, boolean z) {
        return zzc(zzytVar, false, false);
    }

    private static boolean zzc(zzyt zzytVar, boolean z, boolean z2) {
        boolean z3;
        long zzd = zzytVar.zzd();
        long j2 = -1;
        long j3 = 4096;
        int i2 = (zzd > (-1L) ? 1 : (zzd == (-1L) ? 0 : -1));
        if (i2 != 0 && zzd <= 4096) {
            j3 = zzd;
        }
        int i3 = (int) j3;
        zzdy zzdyVar = new zzdy(64);
        boolean z4 = false;
        int i4 = 0;
        boolean z5 = false;
        while (i4 < i3) {
            zzdyVar.zzC(8);
            if (!zzytVar.zzm(zzdyVar.zzH(), z4 ? 1 : 0, 8, true)) {
                break;
            }
            long zzs = zzdyVar.zzs();
            int zze = zzdyVar.zze();
            int i5 = 16;
            if (zzs == 1) {
                zzytVar.zzh(zzdyVar.zzH(), 8, 8);
                zzdyVar.zzE(16);
                zzs = zzdyVar.zzr();
            } else {
                if (zzs == 0) {
                    long zzd2 = zzytVar.zzd();
                    if (zzd2 != j2) {
                        zzs = (zzd2 - zzytVar.zze()) + 8;
                    }
                }
                i5 = 8;
            }
            long j4 = i5;
            if (zzs < j4) {
                return z4;
            }
            i4 += i5;
            if (zze == 1836019574) {
                i3 += (int) zzs;
                if (i2 != 0 && i3 > zzd) {
                    i3 = (int) zzd;
                }
                j2 = -1;
            } else if (zze == 1836019558 || zze == 1836475768) {
                z3 = true;
                break;
            } else {
                long j5 = zzd;
                if ((i4 + zzs) - j4 >= i3) {
                    break;
                }
                int i6 = (int) (zzs - j4);
                i4 += i6;
                if (zze == 1718909296) {
                    if (i6 < 8) {
                        return false;
                    }
                    zzdyVar.zzC(i6);
                    zzytVar.zzh(zzdyVar.zzH(), 0, i6);
                    int i7 = i6 >> 2;
                    for (int i8 = 0; i8 < i7; i8++) {
                        if (i8 == 1) {
                            zzdyVar.zzG(4);
                        } else {
                            int zze2 = zzdyVar.zze();
                            if ((zze2 >>> 8) != 3368816) {
                                if (zze2 == 1751476579) {
                                    zze2 = 1751476579;
                                }
                                int[] iArr = zza;
                                for (int i9 = 0; i9 < 29; i9++) {
                                    if (iArr[i9] != zze2) {
                                    }
                                }
                                continue;
                            }
                            z5 = true;
                            break;
                        }
                    }
                    if (!z5) {
                        return false;
                    }
                } else if (i6 != 0) {
                    zzytVar.zzg(i6);
                }
                zzd = j5;
                j2 = -1;
                z4 = false;
            }
        }
        z3 = false;
        return z5 && z == z3;
    }
}
