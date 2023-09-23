package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgit {
    public static int zza(byte[] bArr, int i2, zzgis zzgisVar) {
        int zzj = zzj(bArr, i2, zzgisVar);
        int i3 = zzgisVar.zza;
        if (i3 >= 0) {
            if (i3 <= bArr.length - zzj) {
                if (i3 == 0) {
                    zzgisVar.zzc = zzgjg.zzb;
                    return zzj;
                }
                zzgisVar.zzc = zzgjg.zzw(bArr, zzj, i3);
                return zzj + i3;
            }
            throw zzgla.zzj();
        }
        throw zzgla.zzf();
    }

    public static int zzb(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static int zzc(zzgmr zzgmrVar, byte[] bArr, int i2, int i3, int i4, zzgis zzgisVar) {
        zzgmb zzgmbVar = (zzgmb) zzgmrVar;
        Object zze = zzgmbVar.zze();
        int zzc = zzgmbVar.zzc(zze, bArr, i2, i3, i4, zzgisVar);
        zzgmbVar.zzf(zze);
        zzgisVar.zzc = zze;
        return zzc;
    }

    public static int zzd(zzgmr zzgmrVar, byte[] bArr, int i2, int i3, zzgis zzgisVar) {
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            i4 = zzk(i5, bArr, i4, zzgisVar);
            i5 = zzgisVar.zza;
        }
        int i6 = i4;
        if (i5 >= 0 && i5 <= i3 - i6) {
            Object zze = zzgmrVar.zze();
            int i7 = i5 + i6;
            zzgmrVar.zzi(zze, bArr, i6, i7, zzgisVar);
            zzgmrVar.zzf(zze);
            zzgisVar.zzc = zze;
            return i7;
        }
        throw zzgla.zzj();
    }

    public static int zze(zzgmr zzgmrVar, int i2, byte[] bArr, int i3, int i4, zzgkx zzgkxVar, zzgis zzgisVar) {
        int zzd = zzd(zzgmrVar, bArr, i3, i4, zzgisVar);
        zzgkxVar.add(zzgisVar.zzc);
        while (zzd < i4) {
            int zzj = zzj(bArr, zzd, zzgisVar);
            if (i2 != zzgisVar.zza) {
                break;
            }
            zzd = zzd(zzgmrVar, bArr, zzj, i4, zzgisVar);
            zzgkxVar.add(zzgisVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i2, zzgkx zzgkxVar, zzgis zzgisVar) {
        zzgkp zzgkpVar = (zzgkp) zzgkxVar;
        int zzj = zzj(bArr, i2, zzgisVar);
        int i3 = zzgisVar.zza + zzj;
        while (zzj < i3) {
            zzj = zzj(bArr, zzj, zzgisVar);
            zzgkpVar.zzh(zzgisVar.zza);
        }
        if (zzj == i3) {
            return zzj;
        }
        throw zzgla.zzj();
    }

    public static int zzg(byte[] bArr, int i2, zzgis zzgisVar) {
        int zzj = zzj(bArr, i2, zzgisVar);
        int i3 = zzgisVar.zza;
        if (i3 >= 0) {
            if (i3 == 0) {
                zzgisVar.zzc = "";
                return zzj;
            }
            zzgisVar.zzc = new String(bArr, zzj, i3, zzgky.zzb);
            return zzj + i3;
        }
        throw zzgla.zzf();
    }

    public static int zzh(byte[] bArr, int i2, zzgis zzgisVar) {
        int zzj = zzj(bArr, i2, zzgisVar);
        int i3 = zzgisVar.zza;
        if (i3 >= 0) {
            if (i3 == 0) {
                zzgisVar.zzc = "";
                return zzj;
            }
            zzgisVar.zzc = zzgnx.zzh(bArr, zzj, i3);
            return zzj + i3;
        }
        throw zzgla.zzf();
    }

    public static int zzi(int i2, byte[] bArr, int i3, int i4, zzgnj zzgnjVar, zzgis zzgisVar) {
        if ((i2 >>> 3) != 0) {
            int i5 = i2 & 7;
            if (i5 == 0) {
                int zzm = zzm(bArr, i3, zzgisVar);
                zzgnjVar.zzh(i2, Long.valueOf(zzgisVar.zzb));
                return zzm;
            } else if (i5 == 1) {
                zzgnjVar.zzh(i2, Long.valueOf(zzn(bArr, i3)));
                return i3 + 8;
            } else if (i5 == 2) {
                int zzj = zzj(bArr, i3, zzgisVar);
                int i6 = zzgisVar.zza;
                if (i6 >= 0) {
                    if (i6 <= bArr.length - zzj) {
                        if (i6 == 0) {
                            zzgnjVar.zzh(i2, zzgjg.zzb);
                        } else {
                            zzgnjVar.zzh(i2, zzgjg.zzw(bArr, zzj, i6));
                        }
                        return zzj + i6;
                    }
                    throw zzgla.zzj();
                }
                throw zzgla.zzf();
            } else if (i5 != 3) {
                if (i5 == 5) {
                    zzgnjVar.zzh(i2, Integer.valueOf(zzb(bArr, i3)));
                    return i3 + 4;
                }
                throw zzgla.zzc();
            } else {
                int i7 = (i2 & (-8)) | 4;
                zzgnj zze = zzgnj.zze();
                int i8 = 0;
                while (true) {
                    if (i3 >= i4) {
                        break;
                    }
                    int zzj2 = zzj(bArr, i3, zzgisVar);
                    int i9 = zzgisVar.zza;
                    if (i9 == i7) {
                        i8 = i9;
                        i3 = zzj2;
                        break;
                    }
                    i8 = i9;
                    i3 = zzi(i9, bArr, zzj2, i4, zze, zzgisVar);
                }
                if (i3 <= i4 && i8 == i7) {
                    zzgnjVar.zzh(i2, zze);
                    return i3;
                }
                throw zzgla.zzg();
            }
        }
        throw zzgla.zzc();
    }

    public static int zzj(byte[] bArr, int i2, zzgis zzgisVar) {
        int i3 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzgisVar.zza = b;
            return i3;
        }
        return zzk(b, bArr, i3, zzgisVar);
    }

    public static int zzk(int i2, byte[] bArr, int i3, zzgis zzgisVar) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b = bArr[i3];
        if (b >= 0) {
            zzgisVar.zza = i4 | (b << 7);
            return i5;
        }
        int i6 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i7 = i5 + 1;
        byte b2 = bArr[i5];
        if (b2 >= 0) {
            zzgisVar.zza = i6 | (b2 << 14);
            return i7;
        }
        int i8 = i6 | ((b2 & Byte.MAX_VALUE) << 14);
        int i9 = i7 + 1;
        byte b3 = bArr[i7];
        if (b3 >= 0) {
            zzgisVar.zza = i8 | (b3 << 21);
            return i9;
        }
        int i10 = i8 | ((b3 & Byte.MAX_VALUE) << 21);
        int i11 = i9 + 1;
        byte b4 = bArr[i9];
        if (b4 >= 0) {
            zzgisVar.zza = i10 | (b4 << 28);
            return i11;
        }
        int i12 = i10 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                zzgisVar.zza = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static int zzl(int i2, byte[] bArr, int i3, int i4, zzgkx zzgkxVar, zzgis zzgisVar) {
        zzgkp zzgkpVar = (zzgkp) zzgkxVar;
        int zzj = zzj(bArr, i3, zzgisVar);
        zzgkpVar.zzh(zzgisVar.zza);
        while (zzj < i4) {
            int zzj2 = zzj(bArr, zzj, zzgisVar);
            if (i2 != zzgisVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzgisVar);
            zzgkpVar.zzh(zzgisVar.zza);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i2, zzgis zzgisVar) {
        byte b;
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            zzgisVar.zzb = j2;
            return i3;
        }
        int i4 = i3 + 1;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i6 = i4 + 1;
            i5 += 7;
            j3 |= (b & Byte.MAX_VALUE) << i5;
            b2 = bArr[i4];
            i4 = i6;
        }
        zzgisVar.zzb = j3;
        return i4;
    }

    public static long zzn(byte[] bArr, int i2) {
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }
}
