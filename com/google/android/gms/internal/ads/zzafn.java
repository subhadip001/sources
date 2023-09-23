package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzafn extends zzafl {
    private zzafm zza;
    private int zzb;
    private boolean zzc;
    private zzaae zzd;
    private zzaac zze;

    @Override // com.google.android.gms.internal.ads.zzafl
    public final long zza(zzdy zzdyVar) {
        if ((zzdyVar.zzH()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzdyVar.zzH()[0];
        zzafm zzafmVar = this.zza;
        zzcw.zzb(zzafmVar);
        int i2 = !zzafmVar.zzd[(b >> 1) & (255 >>> (8 - zzafmVar.zze))].zza ? zzafmVar.zza.zze : zzafmVar.zza.zzf;
        long j2 = this.zzc ? (this.zzb + i2) / 4 : 0;
        if (zzdyVar.zzb() < zzdyVar.zzd() + 4) {
            byte[] copyOf = Arrays.copyOf(zzdyVar.zzH(), zzdyVar.zzd() + 4);
            zzdyVar.zzD(copyOf, copyOf.length);
        } else {
            zzdyVar.zzE(zzdyVar.zzd() + 4);
        }
        byte[] zzH = zzdyVar.zzH();
        zzH[zzdyVar.zzd() - 4] = (byte) (j2 & 255);
        zzH[zzdyVar.zzd() - 3] = (byte) ((j2 >>> 8) & 255);
        zzH[zzdyVar.zzd() - 2] = (byte) ((j2 >>> 16) & 255);
        zzH[zzdyVar.zzd() - 1] = (byte) ((j2 >>> 24) & 255);
        this.zzc = true;
        this.zzb = i2;
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final boolean zzc(zzdy zzdyVar, long j2, zzafi zzafiVar) {
        zzafm zzafmVar;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.zza != null) {
            Objects.requireNonNull(zzafiVar.zza);
            return false;
        }
        zzaae zzaaeVar = this.zzd;
        if (zzaaeVar == null) {
            zzaaf.zzd(1, zzdyVar, false);
            int zzh = zzdyVar.zzh();
            int zzk = zzdyVar.zzk();
            int zzh2 = zzdyVar.zzh();
            int zzg = zzdyVar.zzg();
            int i7 = zzg <= 0 ? -1 : zzg;
            int zzg2 = zzdyVar.zzg();
            int i8 = zzg2 <= 0 ? -1 : zzg2;
            int zzg3 = zzdyVar.zzg();
            int i9 = zzg3 <= 0 ? -1 : zzg3;
            int zzk2 = zzdyVar.zzk();
            this.zzd = new zzaae(zzh, zzk, zzh2, i7, i8, i9, (int) Math.pow(2.0d, zzk2 & 15), (int) Math.pow(2.0d, (zzk2 & 240) >> 4), 1 == (zzdyVar.zzk() & 1), Arrays.copyOf(zzdyVar.zzH(), zzdyVar.zzd()));
        } else {
            zzaac zzaacVar = this.zze;
            if (zzaacVar == null) {
                this.zze = zzaaf.zzc(zzdyVar, true, true);
            } else {
                byte[] bArr = new byte[zzdyVar.zzd()];
                System.arraycopy(zzdyVar.zzH(), 0, bArr, 0, zzdyVar.zzd());
                int i10 = zzaaeVar.zza;
                int i11 = 5;
                zzaaf.zzd(5, zzdyVar, false);
                int zzk3 = zzdyVar.zzk() + 1;
                zzaab zzaabVar = new zzaab(zzdyVar.zzH());
                zzaabVar.zzc(zzdyVar.zzc() * 8);
                int i12 = 0;
                while (i12 < zzk3) {
                    if (zzaabVar.zzb(24) == 5653314) {
                        int zzb = zzaabVar.zzb(16);
                        int zzb2 = zzaabVar.zzb(24);
                        long[] jArr = new long[zzb2];
                        long j3 = 0;
                        if (!zzaabVar.zzd()) {
                            boolean zzd = zzaabVar.zzd();
                            int i13 = 0;
                            while (i13 < zzb2) {
                                if (zzd) {
                                    if (zzaabVar.zzd()) {
                                        i6 = zzk3;
                                        jArr[i13] = zzaabVar.zzb(i11) + 1;
                                    } else {
                                        i6 = zzk3;
                                        jArr[i13] = 0;
                                    }
                                } else {
                                    i6 = zzk3;
                                    jArr[i13] = zzaabVar.zzb(5) + 1;
                                }
                                i13++;
                                zzk3 = i6;
                                i11 = 5;
                            }
                            i5 = zzk3;
                        } else {
                            i5 = zzk3;
                            int zzb3 = zzaabVar.zzb(5) + 1;
                            int i14 = 0;
                            while (i14 < zzb2) {
                                int zzb4 = zzaabVar.zzb(zzaaf.zza(zzb2 - i14));
                                int i15 = 0;
                                while (i15 < zzb4 && i14 < zzb2) {
                                    jArr[i14] = zzb3;
                                    i14++;
                                    i15++;
                                    zzaacVar = zzaacVar;
                                    bArr = bArr;
                                }
                                zzb3++;
                                zzaacVar = zzaacVar;
                                bArr = bArr;
                            }
                        }
                        zzaac zzaacVar2 = zzaacVar;
                        byte[] bArr2 = bArr;
                        int zzb5 = zzaabVar.zzb(4);
                        if (zzb5 > 2) {
                            throw zzbp.zza("lookup type greater than 2 not decodable: " + zzb5, null);
                        }
                        if (zzb5 != 1) {
                            if (zzb5 == 2) {
                                zzb5 = 2;
                            } else {
                                i12++;
                                zzaacVar = zzaacVar2;
                                zzk3 = i5;
                                bArr = bArr2;
                                i11 = 5;
                            }
                        }
                        zzaabVar.zzc(32);
                        zzaabVar.zzc(32);
                        int zzb6 = zzaabVar.zzb(4) + 1;
                        zzaabVar.zzc(1);
                        if (zzb5 != 1) {
                            j3 = zzb2 * zzb;
                        } else if (zzb != 0) {
                            j3 = (long) Math.floor(Math.pow(zzb2, 1.0d / zzb));
                        }
                        zzaabVar.zzc((int) (zzb6 * j3));
                        i12++;
                        zzaacVar = zzaacVar2;
                        zzk3 = i5;
                        bArr = bArr2;
                        i11 = 5;
                    } else {
                        throw zzbp.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzaabVar.zza(), null);
                    }
                }
                zzaac zzaacVar3 = zzaacVar;
                byte[] bArr3 = bArr;
                int i16 = 6;
                int zzb7 = zzaabVar.zzb(6) + 1;
                for (int i17 = 0; i17 < zzb7; i17++) {
                    if (zzaabVar.zzb(16) != 0) {
                        throw zzbp.zza("placeholder of time domain transforms not zeroed out", null);
                    }
                }
                int i18 = 1;
                int zzb8 = zzaabVar.zzb(6) + 1;
                int i19 = 0;
                while (true) {
                    int i20 = 3;
                    if (i19 < zzb8) {
                        int zzb9 = zzaabVar.zzb(16);
                        if (zzb9 == 0) {
                            int i21 = 8;
                            zzaabVar.zzc(8);
                            zzaabVar.zzc(16);
                            zzaabVar.zzc(16);
                            zzaabVar.zzc(6);
                            zzaabVar.zzc(8);
                            int zzb10 = zzaabVar.zzb(4) + 1;
                            int i22 = 0;
                            while (i22 < zzb10) {
                                zzaabVar.zzc(i21);
                                i22++;
                                i21 = 8;
                            }
                        } else if (zzb9 != i18) {
                            throw zzbp.zza("floor type greater than 1 not decodable: " + zzb9, null);
                        } else {
                            int zzb11 = zzaabVar.zzb(5);
                            int[] iArr = new int[zzb11];
                            int i23 = -1;
                            for (int i24 = 0; i24 < zzb11; i24++) {
                                int zzb12 = zzaabVar.zzb(4);
                                iArr[i24] = zzb12;
                                if (zzb12 > i23) {
                                    i23 = zzb12;
                                }
                            }
                            int i25 = i23 + 1;
                            int[] iArr2 = new int[i25];
                            int i26 = 0;
                            while (i26 < i25) {
                                iArr2[i26] = zzaabVar.zzb(i20) + 1;
                                int zzb13 = zzaabVar.zzb(2);
                                if (zzb13 > 0) {
                                    i4 = 8;
                                    zzaabVar.zzc(8);
                                } else {
                                    i4 = 8;
                                }
                                int i27 = 0;
                                for (int i28 = 1; i27 < (i28 << zzb13); i28 = 1) {
                                    zzaabVar.zzc(i4);
                                    i27++;
                                    i4 = 8;
                                }
                                i26++;
                                i20 = 3;
                            }
                            zzaabVar.zzc(2);
                            int zzb14 = zzaabVar.zzb(4);
                            int i29 = 0;
                            int i30 = 0;
                            for (int i31 = 0; i31 < zzb11; i31++) {
                                i29 += iArr2[iArr[i31]];
                                while (i30 < i29) {
                                    zzaabVar.zzc(zzb14);
                                    i30++;
                                }
                            }
                        }
                        i19++;
                        i16 = 6;
                        i18 = 1;
                    } else {
                        int i32 = 1;
                        int zzb15 = zzaabVar.zzb(i16) + 1;
                        int i33 = 0;
                        while (i33 < zzb15) {
                            if (zzaabVar.zzb(16) <= 2) {
                                zzaabVar.zzc(24);
                                zzaabVar.zzc(24);
                                zzaabVar.zzc(24);
                                int zzb16 = zzaabVar.zzb(i16) + i32;
                                int i34 = 8;
                                zzaabVar.zzc(8);
                                int[] iArr3 = new int[zzb16];
                                for (int i35 = 0; i35 < zzb16; i35++) {
                                    iArr3[i35] = ((zzaabVar.zzd() ? zzaabVar.zzb(5) : 0) * 8) + zzaabVar.zzb(3);
                                }
                                int i36 = 0;
                                while (i36 < zzb16) {
                                    int i37 = 0;
                                    while (i37 < i34) {
                                        if ((iArr3[i36] & (1 << i37)) != 0) {
                                            zzaabVar.zzc(i34);
                                        }
                                        i37++;
                                        i34 = 8;
                                    }
                                    i36++;
                                    i34 = 8;
                                }
                                i33++;
                                i16 = 6;
                                i32 = 1;
                            } else {
                                throw zzbp.zza("residueType greater than 2 is not decodable", null);
                            }
                        }
                        int zzb17 = zzaabVar.zzb(i16) + 1;
                        for (int i38 = 0; i38 < zzb17; i38++) {
                            int zzb18 = zzaabVar.zzb(16);
                            if (zzb18 != 0) {
                                Log.e("VorbisUtil", "mapping type other than 0 not supported: " + zzb18);
                            } else {
                                if (zzaabVar.zzd()) {
                                    i2 = 1;
                                    i3 = zzaabVar.zzb(4) + 1;
                                } else {
                                    i2 = 1;
                                    i3 = 1;
                                }
                                if (zzaabVar.zzd()) {
                                    int zzb19 = zzaabVar.zzb(8) + i2;
                                    for (int i39 = 0; i39 < zzb19; i39++) {
                                        int i40 = i10 - 1;
                                        zzaabVar.zzc(zzaaf.zza(i40));
                                        zzaabVar.zzc(zzaaf.zza(i40));
                                    }
                                }
                                if (zzaabVar.zzb(2) != 0) {
                                    throw zzbp.zza("to reserved bits must be zero after mapping coupling steps", null);
                                }
                                if (i3 > 1) {
                                    for (int i41 = 0; i41 < i10; i41++) {
                                        zzaabVar.zzc(4);
                                    }
                                }
                                for (int i42 = 0; i42 < i3; i42++) {
                                    zzaabVar.zzc(8);
                                    zzaabVar.zzc(8);
                                    zzaabVar.zzc(8);
                                }
                            }
                        }
                        int zzb20 = zzaabVar.zzb(6) + 1;
                        zzaad[] zzaadVarArr = new zzaad[zzb20];
                        for (int i43 = 0; i43 < zzb20; i43++) {
                            zzaadVarArr[i43] = new zzaad(zzaabVar.zzd(), zzaabVar.zzb(16), zzaabVar.zzb(16), zzaabVar.zzb(8));
                        }
                        if (zzaabVar.zzd()) {
                            zzafmVar = new zzafm(zzaaeVar, zzaacVar3, bArr3, zzaadVarArr, zzaaf.zza(zzb20 - 1));
                        } else {
                            throw zzbp.zza("framing bit after modes not set as expected", null);
                        }
                    }
                }
            }
        }
        zzafmVar = null;
        this.zza = zzafmVar;
        if (zzafmVar == null) {
            return true;
        }
        zzaae zzaaeVar2 = zzafmVar.zza;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzaaeVar2.zzg);
        arrayList.add(zzafmVar.zzc);
        zzbl zzb21 = zzaaf.zzb(zzfrh.zzn(zzafmVar.zzb.zzb));
        zzab zzabVar = new zzab();
        zzabVar.zzS("audio/vorbis");
        zzabVar.zzv(zzaaeVar2.zzd);
        zzabVar.zzO(zzaaeVar2.zzc);
        zzabVar.zzw(zzaaeVar2.zza);
        zzabVar.zzT(zzaaeVar2.zzb);
        zzabVar.zzI(arrayList);
        zzabVar.zzM(zzb21);
        zzafiVar.zza = zzabVar.zzY();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final void zzi(long j2) {
        super.zzi(j2);
        this.zzc = j2 != 0;
        zzaae zzaaeVar = this.zzd;
        this.zzb = zzaaeVar != null ? zzaaeVar.zze : 0;
    }
}
