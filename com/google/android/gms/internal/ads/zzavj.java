package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzavj {
    private static final int[] zza = {zzazn.zzg("isom"), zzazn.zzg("iso2"), zzazn.zzg("iso3"), zzazn.zzg("iso4"), zzazn.zzg("iso5"), zzazn.zzg("iso6"), zzazn.zzg("avc1"), zzazn.zzg("hvc1"), zzazn.zzg("hev1"), zzazn.zzg("mp41"), zzazn.zzg("mp42"), zzazn.zzg("3g2a"), zzazn.zzg("3g2b"), zzazn.zzg("3gr6"), zzazn.zzg("3gs6"), zzazn.zzg("3ge6"), zzazn.zzg("3gg6"), zzazn.zzg("M4V "), zzazn.zzg("M4A "), zzazn.zzg("f4v "), zzazn.zzg("kddi"), zzazn.zzg("M4VP"), zzazn.zzg("qt  "), zzazn.zzg("MSNV")};

    public static boolean zza(zzatu zzatuVar) {
        return zzc(zzatuVar, true);
    }

    public static boolean zzb(zzatu zzatuVar) {
        return zzc(zzatuVar, false);
    }

    private static boolean zzc(zzatu zzatuVar, boolean z) {
        boolean z2;
        long zzc = zzatuVar.zzc();
        int i2 = (int) ((zzc == -1 || zzc > 4096) ? 4096L : 4096L);
        zzazg zzazgVar = new zzazg(64);
        int i3 = 0;
        boolean z3 = false;
        while (i3 < i2) {
            zzazgVar.zzs(8);
            zzatuVar.zzg(zzazgVar.zza, 0, 8, false);
            long zzm = zzazgVar.zzm();
            int zze = zzazgVar.zze();
            int i4 = 16;
            if (zzm == 1) {
                zzatuVar.zzg(zzazgVar.zza, 8, 8, false);
                zzazgVar.zzu(16);
                zzm = zzazgVar.zzn();
            } else {
                i4 = 8;
            }
            long j2 = i4;
            if (zzm < j2) {
                return false;
            }
            i3 += i4;
            if (zze != zzaus.zzE) {
                if (zze == zzaus.zzN || zze == zzaus.zzP) {
                    z2 = true;
                    break;
                } else if ((i3 + zzm) - j2 >= i2) {
                    break;
                } else {
                    int i5 = (int) (zzm - j2);
                    i3 += i5;
                    if (zze == zzaus.zzd) {
                        if (i5 < 8) {
                            return false;
                        }
                        zzazgVar.zzs(i5);
                        zzatuVar.zzg(zzazgVar.zza, 0, i5, false);
                        int i6 = i5 >> 2;
                        for (int i7 = 0; i7 < i6; i7++) {
                            if (i7 == 1) {
                                zzazgVar.zzw(4);
                            } else {
                                int zze2 = zzazgVar.zze();
                                if ((zze2 >>> 8) != zzazn.zzg("3gp")) {
                                    int[] iArr = zza;
                                    int length = iArr.length;
                                    for (int i8 = 0; i8 < 24; i8++) {
                                        if (iArr[i8] != zze2) {
                                        }
                                    }
                                    continue;
                                }
                                z3 = true;
                                break;
                            }
                        }
                        if (!z3) {
                            return false;
                        }
                    } else if (i5 != 0) {
                        zzatuVar.zzf(i5, false);
                    }
                }
            }
        }
        z2 = false;
        return z3 && z == z2;
    }
}
