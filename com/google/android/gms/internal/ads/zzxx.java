package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzxx {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i2 = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
            return i2 + i2;
        }
        byte b = bArr[4];
        return zzf((b & 192) >> 6, b & 63);
    }

    public static zzad zzc(zzdy zzdyVar, String str, String str2, zzv zzvVar) {
        int i2 = zzc[(zzdyVar.zzk() & 192) >> 6];
        int zzk = zzdyVar.zzk();
        int i3 = zze[(zzk & 56) >> 3];
        if ((zzk & 4) != 0) {
            i3++;
        }
        zzab zzabVar = new zzab();
        zzabVar.zzH(str);
        zzabVar.zzS("audio/ac3");
        zzabVar.zzw(i3);
        zzabVar.zzT(i2);
        zzabVar.zzB(zzvVar);
        zzabVar.zzK(str2);
        return zzabVar.zzY();
    }

    public static zzad zzd(zzdy zzdyVar, String str, String str2, zzv zzvVar) {
        zzdyVar.zzG(2);
        int i2 = zzc[(zzdyVar.zzk() & 192) >> 6];
        int zzk = zzdyVar.zzk();
        int i3 = zze[(zzk & 14) >> 1];
        if ((zzk & 1) != 0) {
            i3++;
        }
        if (((zzdyVar.zzk() & 30) >> 1) > 0 && (2 & zzdyVar.zzk()) != 0) {
            i3 += 2;
        }
        String str3 = (zzdyVar.zza() <= 0 || (zzdyVar.zzk() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc";
        zzab zzabVar = new zzab();
        zzabVar.zzH(str);
        zzabVar.zzS(str3);
        zzabVar.zzw(i3);
        zzabVar.zzT(i2);
        zzabVar.zzB(zzvVar);
        zzabVar.zzK(str2);
        return zzabVar.zzY();
    }

    public static zzxw zze(zzdx zzdxVar) {
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int zzc2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int zzb2 = zzdxVar.zzb();
        zzdxVar.zzj(40);
        int zzc3 = zzdxVar.zzc(5);
        zzdxVar.zzh(zzb2);
        int i12 = -1;
        if (zzc3 > 10) {
            zzdxVar.zzj(16);
            int zzc4 = zzdxVar.zzc(2);
            if (zzc4 == 0) {
                i12 = 0;
            } else if (zzc4 == 1) {
                i12 = 1;
            } else if (zzc4 == 2) {
                i12 = 2;
            }
            zzdxVar.zzj(3);
            int zzc5 = zzdxVar.zzc(11) + 1;
            int i13 = zzc5 + zzc5;
            int zzc6 = zzdxVar.zzc(2);
            if (zzc6 == 3) {
                i8 = zzd[zzdxVar.zzc(2)];
                zzc2 = 3;
                i7 = 6;
            } else {
                zzc2 = zzdxVar.zzc(2);
                i7 = zzb[zzc2];
                i8 = zzc[zzc6];
            }
            int i14 = i7 * 256;
            int zzc7 = zzdxVar.zzc(3);
            boolean zzl = zzdxVar.zzl();
            int i15 = zze[zzc7] + (zzl ? 1 : 0);
            zzdxVar.zzj(10);
            if (zzdxVar.zzl()) {
                zzdxVar.zzj(8);
            }
            if (zzc7 == 0) {
                zzdxVar.zzj(5);
                if (zzdxVar.zzl()) {
                    zzdxVar.zzj(8);
                }
                i9 = 0;
                zzc7 = 0;
            } else {
                i9 = zzc7;
            }
            if (i12 == 1) {
                if (zzdxVar.zzl()) {
                    zzdxVar.zzj(16);
                }
                i10 = 1;
            } else {
                i10 = i12;
            }
            if (zzdxVar.zzl()) {
                if (i9 > 2) {
                    zzdxVar.zzj(2);
                }
                if ((i9 & 1) != 0 && i9 > 2) {
                    zzdxVar.zzj(6);
                }
                if ((i9 & 4) != 0) {
                    zzdxVar.zzj(6);
                }
                if (zzl && zzdxVar.zzl()) {
                    zzdxVar.zzj(5);
                }
                if (i10 == 0) {
                    if (zzdxVar.zzl()) {
                        zzdxVar.zzj(6);
                    }
                    if (i9 == 0 && zzdxVar.zzl()) {
                        zzdxVar.zzj(6);
                    }
                    if (zzdxVar.zzl()) {
                        zzdxVar.zzj(6);
                    }
                    int zzc8 = zzdxVar.zzc(2);
                    if (zzc8 == 1) {
                        zzdxVar.zzj(5);
                    } else if (zzc8 == 2) {
                        zzdxVar.zzj(12);
                    } else if (zzc8 == 3) {
                        int zzc9 = zzdxVar.zzc(5);
                        if (zzdxVar.zzl()) {
                            zzdxVar.zzj(5);
                            if (zzdxVar.zzl()) {
                                zzdxVar.zzj(4);
                            }
                            if (zzdxVar.zzl()) {
                                zzdxVar.zzj(4);
                            }
                            if (zzdxVar.zzl()) {
                                zzdxVar.zzj(4);
                            }
                            if (zzdxVar.zzl()) {
                                zzdxVar.zzj(4);
                            }
                            if (zzdxVar.zzl()) {
                                zzdxVar.zzj(4);
                            }
                            if (zzdxVar.zzl()) {
                                zzdxVar.zzj(4);
                            }
                            if (zzdxVar.zzl()) {
                                zzdxVar.zzj(4);
                            }
                            if (zzdxVar.zzl()) {
                                if (zzdxVar.zzl()) {
                                    zzdxVar.zzj(4);
                                }
                                if (zzdxVar.zzl()) {
                                    zzdxVar.zzj(4);
                                }
                            }
                        }
                        if (zzdxVar.zzl()) {
                            zzdxVar.zzj(5);
                            if (zzdxVar.zzl()) {
                                zzdxVar.zzj(7);
                                if (zzdxVar.zzl()) {
                                    zzdxVar.zzj(8);
                                    zzdxVar.zzj((zzc9 + 2) * 8);
                                    zzdxVar.zzd();
                                }
                            }
                        }
                        zzdxVar.zzj((zzc9 + 2) * 8);
                        zzdxVar.zzd();
                    }
                    if (i9 < 2) {
                        if (zzdxVar.zzl()) {
                            zzdxVar.zzj(14);
                        }
                        if (zzc7 == 0 && zzdxVar.zzl()) {
                            zzdxVar.zzj(14);
                        }
                    }
                    if (zzdxVar.zzl()) {
                        if (zzc2 == 0) {
                            zzdxVar.zzj(5);
                            i10 = 0;
                            zzc2 = 0;
                        } else {
                            for (int i16 = 0; i16 < i7; i16++) {
                                if (zzdxVar.zzl()) {
                                    zzdxVar.zzj(5);
                                }
                            }
                        }
                    }
                    i10 = 0;
                }
            }
            if (zzdxVar.zzl()) {
                zzdxVar.zzj(5);
                if (i9 == 2) {
                    zzdxVar.zzj(4);
                    i9 = 2;
                }
                if (i9 >= 6) {
                    zzdxVar.zzj(2);
                }
                if (zzdxVar.zzl()) {
                    i11 = 8;
                    zzdxVar.zzj(8);
                } else {
                    i11 = 8;
                }
                if (i9 == 0 && zzdxVar.zzl()) {
                    zzdxVar.zzj(i11);
                }
                if (zzc6 < 3) {
                    zzdxVar.zzi();
                }
            }
            if (i10 == 0 && zzc2 != 3) {
                zzdxVar.zzi();
            }
            if (i10 == 2 && (zzc2 == 3 || zzdxVar.zzl())) {
                zzdxVar.zzj(6);
            }
            str = (zzdxVar.zzl() && zzdxVar.zzc(6) == 1 && zzdxVar.zzc(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i5 = i12;
            i2 = i13;
            i6 = i14;
            i3 = i8;
            i4 = i15;
        } else {
            zzdxVar.zzj(32);
            int zzc10 = zzdxVar.zzc(2);
            String str2 = zzc10 == 3 ? null : "audio/ac3";
            int zzf2 = zzf(zzc10, zzdxVar.zzc(6));
            zzdxVar.zzj(8);
            int zzc11 = zzdxVar.zzc(3);
            if ((zzc11 & 1) != 0 && zzc11 != 1) {
                zzdxVar.zzj(2);
            }
            if ((zzc11 & 4) != 0) {
                zzdxVar.zzj(2);
            }
            if (zzc11 == 2) {
                zzdxVar.zzj(2);
            }
            str = str2;
            i2 = zzf2;
            i3 = zzc10 < 3 ? zzc[zzc10] : -1;
            i4 = zze[zzc11] + (zzdxVar.zzl() ? 1 : 0);
            i5 = -1;
            i6 = 1536;
        }
        return new zzxw(str, i5, i4, i3, i2, i6, null);
    }

    private static int zzf(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0 || i2 >= 3 || i3 < 0 || i4 >= 19) {
            return -1;
        }
        int i5 = zzc[i2];
        if (i5 == 44100) {
            int i6 = zzg[i4] + (i3 & 1);
            return i6 + i6;
        }
        int i7 = zzf[i4];
        return i5 == 32000 ? i7 * 6 : i7 * 4;
    }
}
