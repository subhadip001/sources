package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import f.a.b.a.a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgjm extends zzgjo {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zzgjm(InputStream inputStream, int i2, zzgjl zzgjlVar) {
        super(null);
        this.zzl = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        zzgky.zzf(inputStream, "input");
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List zzJ(int i2) {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int min = Math.min(i2, 4096);
            byte[] bArr = new byte[min];
            int i3 = 0;
            while (i3 < min) {
                int read = this.zze.read(bArr, i3, min - i3);
                if (read == -1) {
                    throw zzgla.zzj();
                }
                this.zzk += read;
                i3 += read;
            }
            i2 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzK() {
        int i2 = this.zzg + this.zzh;
        this.zzg = i2;
        int i3 = this.zzk + i2;
        int i4 = this.zzl;
        if (i3 <= i4) {
            this.zzh = 0;
            return;
        }
        int i5 = i3 - i4;
        this.zzh = i5;
        this.zzg = i2 - i5;
    }

    private final void zzL(int i2) {
        if (zzM(i2)) {
            return;
        }
        if (i2 > (Api.BaseClientBuilder.API_PRIORITY_OTHER - this.zzk) - this.zzi) {
            throw zzgla.zzi();
        }
        throw zzgla.zzj();
    }

    private final boolean zzM(int i2) {
        int i3 = this.zzi;
        int i4 = this.zzg;
        if (i3 + i2 > i4) {
            int i5 = this.zzk;
            if (i2 <= (Api.BaseClientBuilder.API_PRIORITY_OTHER - i5) - i3 && i5 + i3 + i2 <= this.zzl) {
                if (i3 > 0) {
                    if (i4 > i3) {
                        byte[] bArr = this.zzf;
                        System.arraycopy(bArr, i3, bArr, 0, i4 - i3);
                    }
                    i5 = this.zzk + i3;
                    this.zzk = i5;
                    i4 = this.zzg - i3;
                    this.zzg = i4;
                    this.zzi = 0;
                }
                try {
                    int read = this.zze.read(this.zzf, i4, Math.min(4096 - i4, (Api.BaseClientBuilder.API_PRIORITY_OTHER - i5) - i4));
                    if (read == 0 || read < -1 || read > 4096) {
                        throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                    } else if (read > 0) {
                        this.zzg += read;
                        zzK();
                        if (this.zzg >= i2) {
                            return true;
                        }
                        return zzM(i2);
                    } else {
                        return false;
                    }
                } catch (zzgla e2) {
                    e2.zzk();
                    throw e2;
                }
            }
            return false;
        }
        throw new IllegalStateException(a.j("refillBuffer() called when ", i2, " bytes were already available in buffer"));
    }

    private final byte[] zzN(int i2, boolean z) {
        byte[] zzO = zzO(i2);
        if (zzO != null) {
            return zzO;
        }
        int i3 = this.zzi;
        int i4 = this.zzg;
        int i5 = i4 - i3;
        this.zzk += i4;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzJ = zzJ(i2 - i5);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.zzf, i3, bArr, 0, i5);
        for (byte[] bArr2 : zzJ) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return bArr;
    }

    private final byte[] zzO(int i2) {
        if (i2 == 0) {
            return zzgky.zzd;
        }
        if (i2 >= 0) {
            int i3 = this.zzk;
            int i4 = this.zzi;
            int i5 = i3 + i4 + i2;
            if ((-2147483647) + i5 <= 0) {
                int i6 = this.zzl;
                if (i5 <= i6) {
                    int i7 = this.zzg - i4;
                    int i8 = i2 - i7;
                    if (i8 >= 4096) {
                        try {
                            if (i8 > this.zze.available()) {
                                return null;
                            }
                        } catch (zzgla e2) {
                            e2.zzk();
                            throw e2;
                        }
                    }
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.zzf, this.zzi, bArr, 0, i7);
                    this.zzk += this.zzg;
                    this.zzi = 0;
                    this.zzg = 0;
                    while (i7 < i2) {
                        try {
                            int read = this.zze.read(bArr, i7, i2 - i7);
                            if (read == -1) {
                                throw zzgla.zzj();
                            }
                            this.zzk += read;
                            i7 += read;
                        } catch (zzgla e3) {
                            e3.zzk();
                            throw e3;
                        }
                    }
                    return bArr;
                }
                zzB((i6 - i3) - i4);
                throw zzgla.zzj();
            }
            throw zzgla.zzi();
        }
        throw zzgla.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final void zzA(int i2) {
        this.zzl = i2;
        zzK();
    }

    public final void zzB(int i2) {
        int i3 = this.zzg;
        int i4 = this.zzi;
        int i5 = i3 - i4;
        if (i2 <= i5 && i2 >= 0) {
            this.zzi = i4 + i2;
        } else if (i2 >= 0) {
            int i6 = this.zzk;
            int i7 = i6 + i4;
            int i8 = this.zzl;
            if (i7 + i2 <= i8) {
                this.zzk = i7;
                this.zzg = 0;
                this.zzi = 0;
                while (i5 < i2) {
                    try {
                        long j2 = i2 - i5;
                        try {
                            long skip = this.zze.skip(j2);
                            int i9 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                            if (i9 < 0 || skip > j2) {
                                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            } else if (i9 == 0) {
                                break;
                            } else {
                                i5 += (int) skip;
                            }
                        } catch (zzgla e2) {
                            e2.zzk();
                            throw e2;
                        }
                    } finally {
                        this.zzk += i5;
                        zzK();
                    }
                }
                if (i5 >= i2) {
                    return;
                }
                int i10 = this.zzg;
                int i11 = i10 - this.zzi;
                this.zzi = i10;
                zzL(1);
                while (true) {
                    int i12 = i2 - i11;
                    int i13 = this.zzg;
                    if (i12 <= i13) {
                        this.zzi = i12;
                        return;
                    }
                    i11 += i13;
                    this.zzi = i13;
                    zzL(1);
                }
            } else {
                zzB((i8 - i6) - i4);
                throw zzgla.zzj();
            }
        } else {
            throw zzgla.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final boolean zzC() {
        return this.zzi == this.zzg && !zzM(1);
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
            if (this.zzg - this.zzi >= 10) {
                while (i4 < 10) {
                    byte[] bArr = this.zzf;
                    int i5 = this.zzi;
                    this.zzi = i5 + 1;
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
        if (this.zzi == this.zzg) {
            zzL(1);
        }
        byte[] bArr = this.zzf;
        int i2 = this.zzi;
        this.zzi = i2 + 1;
        return bArr[i2];
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
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final int zze(int i2) {
        if (i2 >= 0) {
            int i3 = this.zzk + this.zzi + i2;
            int i4 = this.zzl;
            if (i3 <= i4) {
                this.zzl = i3;
                zzK();
                return i4;
            }
            throw zzgla.zzj();
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
        int i2 = this.zzi;
        if (this.zzg - i2 < 4) {
            zzL(4);
            i2 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
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
            int r0 = r5.zzi
            int r1 = r5.zzg
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.zzf
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.zzi = r3
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
            r5.zzi = r1
            return r0
        L6c:
            long r0 = r5.zzs()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgjm.zzj():int");
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
        int i2 = this.zzi;
        if (this.zzg - i2 < 8) {
            zzL(8);
            i2 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i2 + 8;
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    public final long zzr() {
        long j2;
        long j3;
        long j4;
        long j5;
        int i2;
        int i3 = this.zzi;
        int i4 = this.zzg;
        if (i4 != i3) {
            byte[] bArr = this.zzf;
            int i5 = i3 + 1;
            byte b = bArr[i3];
            if (b >= 0) {
                this.zzi = i5;
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
                                                    this.zzi = i6;
                                                    return j3;
                                                }
                                            }
                                        }
                                    }
                                }
                                j3 = j4 ^ j7;
                                i6 = i11;
                                this.zzi = i6;
                                return j3;
                            }
                            j5 = 266354560;
                            j2 = j6 ^ j5;
                        }
                    }
                    i6 = i8;
                    j3 = j2;
                    this.zzi = i6;
                    return j3;
                }
                i2 = i7 ^ (-128);
                j3 = i2;
                this.zzi = i6;
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
        int i2 = this.zzg;
        int i3 = this.zzi;
        if (zzj <= i2 - i3 && zzj > 0) {
            zzgjg zzw = zzgjg.zzw(this.zzf, i3, zzj);
            this.zzi += zzj;
            return zzw;
        } else if (zzj != 0) {
            byte[] zzO = zzO(zzj);
            if (zzO != null) {
                return zzgjg.zzv(zzO);
            }
            int i4 = this.zzi;
            int i5 = this.zzg;
            int i6 = i5 - i4;
            this.zzk += i5;
            this.zzi = 0;
            this.zzg = 0;
            List<byte[]> zzJ = zzJ(zzj - i6);
            byte[] bArr = new byte[zzj];
            System.arraycopy(this.zzf, i4, bArr, 0, i6);
            for (byte[] bArr2 : zzJ) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i6, length);
                i6 += length;
            }
            return zzgjg.zzz(bArr);
        } else {
            return zzgjg.zzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final String zzx() {
        int zzj = zzj();
        if (zzj > 0) {
            int i2 = this.zzg;
            int i3 = this.zzi;
            if (zzj <= i2 - i3) {
                String str = new String(this.zzf, i3, zzj, zzgky.zzb);
                this.zzi += zzj;
                return str;
            }
        }
        if (zzj == 0) {
            return "";
        }
        if (zzj <= this.zzg) {
            zzL(zzj);
            String str2 = new String(this.zzf, this.zzi, zzj, zzgky.zzb);
            this.zzi += zzj;
            return str2;
        }
        return new String(zzN(zzj, false), zzgky.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final String zzy() {
        byte[] zzN;
        int zzj = zzj();
        int i2 = this.zzi;
        int i3 = this.zzg;
        if (zzj <= i3 - i2 && zzj > 0) {
            zzN = this.zzf;
            this.zzi = i2 + zzj;
        } else if (zzj == 0) {
            return "";
        } else {
            if (zzj <= i3) {
                zzL(zzj);
                zzN = this.zzf;
                this.zzi = zzj;
            } else {
                zzN = zzN(zzj, false);
            }
            i2 = 0;
        }
        return zzgnx.zzh(zzN, i2, zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final void zzz(int i2) {
        if (this.zzj != i2) {
            throw zzgla.zzb();
        }
    }
}
