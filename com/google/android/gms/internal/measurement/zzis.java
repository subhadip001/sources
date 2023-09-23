package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class zzis {
    public static int zza(byte[] bArr, int i2, zzir zzirVar) {
        int zzj = zzj(bArr, i2, zzirVar);
        int i3 = zzirVar.zza;
        if (i3 >= 0) {
            if (i3 <= bArr.length - zzj) {
                if (i3 == 0) {
                    zzirVar.zzc = zzje.zzb;
                    return zzj;
                }
                zzirVar.zzc = zzje.zzl(bArr, zzj, i3);
                return zzj + i3;
            }
            throw zzkp.zzf();
        }
        throw zzkp.zzd();
    }

    public static int zzb(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static int zzc(zzlx zzlxVar, byte[] bArr, int i2, int i3, int i4, zzir zzirVar) {
        Object zze = zzlxVar.zze();
        int zzn = zzn(zze, zzlxVar, bArr, i2, i3, i4, zzirVar);
        zzlxVar.zzf(zze);
        zzirVar.zzc = zze;
        return zzn;
    }

    public static int zzd(zzlx zzlxVar, byte[] bArr, int i2, int i3, zzir zzirVar) {
        Object zze = zzlxVar.zze();
        int zzo = zzo(zze, zzlxVar, bArr, i2, i3, zzirVar);
        zzlxVar.zzf(zze);
        zzirVar.zzc = zze;
        return zzo;
    }

    public static int zze(zzlx zzlxVar, int i2, byte[] bArr, int i3, int i4, zzkm zzkmVar, zzir zzirVar) {
        int zzd = zzd(zzlxVar, bArr, i3, i4, zzirVar);
        zzkmVar.add(zzirVar.zzc);
        while (zzd < i4) {
            int zzj = zzj(bArr, zzd, zzirVar);
            if (i2 != zzirVar.zza) {
                break;
            }
            zzd = zzd(zzlxVar, bArr, zzj, i4, zzirVar);
            zzkmVar.add(zzirVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i2, zzkm zzkmVar, zzir zzirVar) {
        zzkg zzkgVar = (zzkg) zzkmVar;
        int zzj = zzj(bArr, i2, zzirVar);
        int i3 = zzirVar.zza + zzj;
        while (zzj < i3) {
            zzj = zzj(bArr, zzj, zzirVar);
            zzkgVar.zzh(zzirVar.zza);
        }
        if (zzj == i3) {
            return zzj;
        }
        throw zzkp.zzf();
    }

    public static int zzg(byte[] bArr, int i2, zzir zzirVar) {
        int zzj = zzj(bArr, i2, zzirVar);
        int i3 = zzirVar.zza;
        if (i3 >= 0) {
            if (i3 == 0) {
                zzirVar.zzc = "";
                return zzj;
            }
            zzirVar.zzc = new String(bArr, zzj, i3, zzkn.zzb);
            return zzj + i3;
        }
        throw zzkp.zzd();
    }

    public static int zzh(byte[] bArr, int i2, zzir zzirVar) {
        int zzj = zzj(bArr, i2, zzirVar);
        int i3 = zzirVar.zza;
        if (i3 >= 0) {
            if (i3 == 0) {
                zzirVar.zzc = "";
                return zzj;
            }
            zzirVar.zzc = zznd.zzd(bArr, zzj, i3);
            return zzj + i3;
        }
        throw zzkp.zzd();
    }

    public static int zzi(int i2, byte[] bArr, int i3, int i4, zzmp zzmpVar, zzir zzirVar) {
        if ((i2 >>> 3) != 0) {
            int i5 = i2 & 7;
            if (i5 == 0) {
                int zzm = zzm(bArr, i3, zzirVar);
                zzmpVar.zzj(i2, Long.valueOf(zzirVar.zzb));
                return zzm;
            } else if (i5 == 1) {
                zzmpVar.zzj(i2, Long.valueOf(zzp(bArr, i3)));
                return i3 + 8;
            } else if (i5 == 2) {
                int zzj = zzj(bArr, i3, zzirVar);
                int i6 = zzirVar.zza;
                if (i6 >= 0) {
                    if (i6 <= bArr.length - zzj) {
                        if (i6 == 0) {
                            zzmpVar.zzj(i2, zzje.zzb);
                        } else {
                            zzmpVar.zzj(i2, zzje.zzl(bArr, zzj, i6));
                        }
                        return zzj + i6;
                    }
                    throw zzkp.zzf();
                }
                throw zzkp.zzd();
            } else if (i5 != 3) {
                if (i5 == 5) {
                    zzmpVar.zzj(i2, Integer.valueOf(zzb(bArr, i3)));
                    return i3 + 4;
                }
                throw zzkp.zzb();
            } else {
                int i7 = (i2 & (-8)) | 4;
                zzmp zzf = zzmp.zzf();
                int i8 = 0;
                while (true) {
                    if (i3 >= i4) {
                        break;
                    }
                    int zzj2 = zzj(bArr, i3, zzirVar);
                    int i9 = zzirVar.zza;
                    if (i9 == i7) {
                        i8 = i9;
                        i3 = zzj2;
                        break;
                    }
                    i8 = i9;
                    i3 = zzi(i9, bArr, zzj2, i4, zzf, zzirVar);
                }
                if (i3 <= i4 && i8 == i7) {
                    zzmpVar.zzj(i2, zzf);
                    return i3;
                }
                throw zzkp.zze();
            }
        }
        throw zzkp.zzb();
    }

    public static int zzj(byte[] bArr, int i2, zzir zzirVar) {
        int i3 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzirVar.zza = b;
            return i3;
        }
        return zzk(b, bArr, i3, zzirVar);
    }

    public static int zzk(int i2, byte[] bArr, int i3, zzir zzirVar) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b = bArr[i3];
        if (b >= 0) {
            zzirVar.zza = i4 | (b << 7);
            return i5;
        }
        int i6 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i7 = i5 + 1;
        byte b2 = bArr[i5];
        if (b2 >= 0) {
            zzirVar.zza = i6 | (b2 << 14);
            return i7;
        }
        int i8 = i6 | ((b2 & Byte.MAX_VALUE) << 14);
        int i9 = i7 + 1;
        byte b3 = bArr[i7];
        if (b3 >= 0) {
            zzirVar.zza = i8 | (b3 << 21);
            return i9;
        }
        int i10 = i8 | ((b3 & Byte.MAX_VALUE) << 21);
        int i11 = i9 + 1;
        byte b4 = bArr[i9];
        if (b4 >= 0) {
            zzirVar.zza = i10 | (b4 << 28);
            return i11;
        }
        int i12 = i10 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                zzirVar.zza = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static int zzl(int i2, byte[] bArr, int i3, int i4, zzkm zzkmVar, zzir zzirVar) {
        zzkg zzkgVar = (zzkg) zzkmVar;
        int zzj = zzj(bArr, i3, zzirVar);
        zzkgVar.zzh(zzirVar.zza);
        while (zzj < i4) {
            int zzj2 = zzj(bArr, zzj, zzirVar);
            if (i2 != zzirVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzirVar);
            zzkgVar.zzh(zzirVar.zza);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i2, zzir zzirVar) {
        byte b;
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            zzirVar.zzb = j2;
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
        zzirVar.zzb = j3;
        return i4;
    }

    public static int zzn(Object obj, zzlx zzlxVar, byte[] bArr, int i2, int i3, int i4, zzir zzirVar) {
        int zzc = ((zzlp) zzlxVar).zzc(obj, bArr, i2, i3, i4, zzirVar);
        zzirVar.zzc = obj;
        return zzc;
    }

    public static int zzo(Object obj, zzlx zzlxVar, byte[] bArr, int i2, int i3, zzir zzirVar) {
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            i4 = zzk(i5, bArr, i4, zzirVar);
            i5 = zzirVar.zza;
        }
        int i6 = i4;
        if (i5 >= 0 && i5 <= i3 - i6) {
            int i7 = i5 + i6;
            zzlxVar.zzh(obj, bArr, i6, i7, zzirVar);
            zzirVar.zzc = obj;
            return i7;
        }
        throw zzkp.zzf();
    }

    public static long zzp(byte[] bArr, int i2) {
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }
}
