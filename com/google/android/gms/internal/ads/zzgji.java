package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgji extends zzgjo {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final int zzi;
    private int zzj;
    private int zzk;

    public /* synthetic */ zzgji(byte[] bArr, int i2, int i3, boolean z, zzgjh zzgjhVar) {
        super(null);
        this.zzk = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zze = bArr;
        this.zzf = i3 + i2;
        this.zzh = i2;
        this.zzi = i2;
    }

    private final void zzJ() {
        int i2 = this.zzf + this.zzg;
        this.zzf = i2;
        int i3 = i2 - this.zzi;
        int i4 = this.zzk;
        if (i3 <= i4) {
            this.zzg = 0;
            return;
        }
        int i5 = i3 - i4;
        this.zzg = i5;
        this.zzf = i2 - i5;
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final void zzA(int i2) {
        this.zzk = i2;
        zzJ();
    }

    public final void zzB(int i2) {
        if (i2 >= 0) {
            int i3 = this.zzf;
            int i4 = this.zzh;
            if (i2 <= i3 - i4) {
                this.zzh = i4 + i2;
                return;
            }
        }
        if (i2 < 0) {
            throw zzgla.zzf();
        }
        throw zzgla.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final boolean zzC() {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final boolean zzD() {
        return zzr() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final boolean zzE(int i2) {
        int zzm;
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 == 0) {
            if (this.zzf - this.zzh >= 10) {
                while (i4 < 10) {
                    byte[] bArr = this.zze;
                    int i5 = this.zzh;
                    this.zzh = i5 + 1;
                    if (bArr[i5] < 0) {
                        i4++;
                    }
                }
                throw zzgla.zze();
            }
            while (i4 < 10) {
                if (zza() < 0) {
                    i4++;
                }
            }
            throw zzgla.zze();
            return true;
        } else if (i3 == 1) {
            zzB(8);
            return true;
        } else if (i3 == 2) {
            zzB(zzj());
            return true;
        } else if (i3 != 3) {
            if (i3 != 4) {
                if (i3 == 5) {
                    zzB(4);
                    return true;
                }
                throw zzgla.zza();
            }
            return false;
        } else {
            do {
                zzm = zzm();
                if (zzm == 0) {
                    break;
                }
            } while (zzE(zzm));
            zzz(((i2 >>> 3) << 3) | 4);
            return true;
        }
    }

    public final byte zza() {
        int i2 = this.zzh;
        if (i2 != this.zzf) {
            byte[] bArr = this.zze;
            this.zzh = i2 + 1;
            return bArr[i2];
        }
        throw zzgla.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final double zzb() {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final float zzc() {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final int zzd() {
        return this.zzh - this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final int zze(int i2) {
        if (i2 >= 0) {
            int i3 = (this.zzh - this.zzi) + i2;
            if (i3 >= 0) {
                int i4 = this.zzk;
                if (i3 <= i4) {
                    this.zzk = i3;
                    zzJ();
                    return i4;
                }
                throw zzgla.zzj();
            }
            throw zzgla.zzg();
        }
        throw zzgla.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final int zzf() {
        return zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final int zzg() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final int zzh() {
        return zzj();
    }

    public final int zzi() {
        int i2 = this.zzh;
        if (this.zzf - i2 >= 4) {
            byte[] bArr = this.zze;
            this.zzh = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }
        throw zzgla.zzj();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzj() {
        /*
            r5 = this;
            int r0 = r5.zzh
            int r1 = r5.zzf
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.zze
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.zzh = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6c
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L69
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L69
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L69
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6c
        L69:
            r5.zzh = r1
            return r0
        L6c:
            long r0 = r5.zzs()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgji.zzj():int");
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final int zzk() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final int zzl() {
        return zzgjo.zzF(zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final int zzm() {
        if (zzC()) {
            this.zzj = 0;
            return 0;
        }
        int zzj = zzj();
        this.zzj = zzj;
        if ((zzj >>> 3) != 0) {
            return zzj;
        }
        throw zzgla.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final int zzn() {
        return zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final long zzo() {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final long zzp() {
        return zzr();
    }

    public final long zzq() {
        int i2 = this.zzh;
        if (this.zzf - i2 >= 8) {
            byte[] bArr = this.zze;
            this.zzh = i2 + 8;
            return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
        }
        throw zzgla.zzj();
    }

    public final long zzr() {
        long j2;
        long j3;
        long j4;
        long j5;
        int i2;
        int i3 = this.zzh;
        int i4 = this.zzf;
        if (i4 != i3) {
            byte[] bArr = this.zze;
            int i5 = i3 + 1;
            byte b = bArr[i3];
            if (b >= 0) {
                this.zzh = i5;
                return b;
            } else if (i4 - i5 >= 9) {
                int i6 = i5 + 1;
                int i7 = b ^ (bArr[i5] << 7);
                if (i7 >= 0) {
                    int i8 = i6 + 1;
                    int i9 = i7 ^ (bArr[i6] << 14);
                    if (i9 >= 0) {
                        j2 = i9 ^ 16256;
                    } else {
                        i6 = i8 + 1;
                        int i10 = i9 ^ (bArr[i8] << 21);
                        if (i10 < 0) {
                            i2 = i10 ^ (-2080896);
                        } else {
                            i8 = i6 + 1;
                            long j6 = (bArr[i6] << 28) ^ i10;
                            if (j6 < 0) {
                                int i11 = i8 + 1;
                                long j7 = j6 ^ (bArr[i8] << 35);
                                if (j7 < 0) {
                                    j4 = -34093383808L;
                                } else {
                                    i8 = i11 + 1;
                                    j6 = j7 ^ (bArr[i11] << 42);
                                    if (j6 >= 0) {
                                        j5 = 4363953127296L;
                                    } else {
                                        i11 = i8 + 1;
                                        j7 = j6 ^ (bArr[i8] << 49);
                                        if (j7 < 0) {
                                            j4 = -558586000294016L;
                                        } else {
                                            i8 = i11 + 1;
                                            j2 = (j7 ^ (bArr[i11] << 56)) ^ 71499008037633920L;
                                            if (j2 < 0) {
                                                i11 = i8 + 1;
                                                if (bArr[i8] >= 0) {
                                                    j3 = j2;
                                                    i6 = i11;
                                                    this.zzh = i6;
                                                    return j3;
                                                }
                                            }
                                        }
                                    }
                                }
                                j3 = j4 ^ j7;
                                i6 = i11;
                                this.zzh = i6;
                                return j3;
                            }
                            j5 = 266354560;
                            j2 = j6 ^ j5;
                        }
                    }
                    i6 = i8;
                    j3 = j2;
                    this.zzh = i6;
                    return j3;
                }
                i2 = i7 ^ (-128);
                j3 = i2;
                this.zzh = i6;
                return j3;
            }
        }
        return zzs();
    }

    public final long zzs() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte zza = zza();
            j2 |= (zza & Byte.MAX_VALUE) << i2;
            if ((zza & 128) == 0) {
                return j2;
            }
        }
        throw zzgla.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final long zzt() {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final long zzu() {
        return zzgjo.zzG(zzr());
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final long zzv() {
        return zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final zzgjg zzw() {
        int zzj = zzj();
        if (zzj > 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (zzj <= i2 - i3) {
                zzgjg zzw = zzgjg.zzw(this.zze, i3, zzj);
                this.zzh += zzj;
                return zzw;
            }
        }
        if (zzj != 0) {
            if (zzj > 0) {
                int i4 = this.zzf;
                int i5 = this.zzh;
                if (zzj <= i4 - i5) {
                    int i6 = zzj + i5;
                    this.zzh = i6;
                    return zzgjg.zzz(Arrays.copyOfRange(this.zze, i5, i6));
                }
            }
            if (zzj <= 0) {
                throw zzgla.zzf();
            }
            throw zzgla.zzj();
        }
        return zzgjg.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final String zzx() {
        int zzj = zzj();
        if (zzj > 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (zzj <= i2 - i3) {
                String str = new String(this.zze, i3, zzj, zzgky.zzb);
                this.zzh += zzj;
                return str;
            }
        }
        if (zzj == 0) {
            return "";
        }
        if (zzj < 0) {
            throw zzgla.zzf();
        }
        throw zzgla.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final String zzy() {
        int zzj = zzj();
        if (zzj > 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (zzj <= i2 - i3) {
                String zzh = zzgnx.zzh(this.zze, i3, zzj);
                this.zzh += zzj;
                return zzh;
            }
        }
        if (zzj == 0) {
            return "";
        }
        if (zzj <= 0) {
            throw zzgla.zzf();
        }
        throw zzgla.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final void zzz(int i2) {
        if (this.zzj != i2) {
            throw zzgla.zzb();
        }
    }
}
