package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgjk extends zzgjo {
    private final Iterable zze;
    private final Iterator zzf;
    private ByteBuffer zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;

    public /* synthetic */ zzgjk(Iterable iterable, int i2, boolean z, zzgjj zzgjjVar) {
        super(null);
        this.zzj = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzh = i2;
        this.zze = iterable;
        this.zzf = iterable.iterator();
        this.zzl = 0;
        if (i2 == 0) {
            this.zzg = zzgky.zze;
            this.zzm = 0L;
            this.zzn = 0L;
            this.zzo = 0L;
            return;
        }
        zzN();
    }

    private final int zzJ() {
        return (int) (((this.zzh - this.zzl) - this.zzm) + this.zzn);
    }

    private final void zzK() {
        if (this.zzf.hasNext()) {
            zzN();
            return;
        }
        throw zzgla.zzj();
    }

    private final void zzL(byte[] bArr, int i2, int i3) {
        if (i3 > zzJ()) {
            if (i3 > 0) {
                throw zzgla.zzj();
            }
            return;
        }
        int i4 = i3;
        while (i4 > 0) {
            if (this.zzo - this.zzm == 0) {
                zzK();
            }
            int min = Math.min(i4, (int) (this.zzo - this.zzm));
            long j2 = min;
            zzgns.zzo(this.zzm, bArr, i3 - i4, j2);
            i4 -= min;
            this.zzm += j2;
        }
    }

    private final void zzM() {
        int i2 = this.zzh + this.zzi;
        this.zzh = i2;
        int i3 = this.zzj;
        if (i2 <= i3) {
            this.zzi = 0;
            return;
        }
        int i4 = i2 - i3;
        this.zzi = i4;
        this.zzh = i2 - i4;
    }

    private final void zzN() {
        ByteBuffer byteBuffer = (ByteBuffer) this.zzf.next();
        this.zzg = byteBuffer;
        this.zzl += (int) (this.zzm - this.zzn);
        long position = byteBuffer.position();
        this.zzm = position;
        this.zzn = position;
        this.zzo = this.zzg.limit();
        long zze = zzgns.zze(this.zzg);
        this.zzm += zze;
        this.zzn += zze;
        this.zzo += zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final void zzA(int i2) {
        this.zzj = i2;
        zzM();
    }

    public final void zzB(int i2) {
        if (i2 < 0 || i2 > ((this.zzh - this.zzl) - this.zzm) + this.zzn) {
            if (i2 < 0) {
                throw zzgla.zzf();
            }
            throw zzgla.zzj();
        }
        while (i2 > 0) {
            if (this.zzo - this.zzm == 0) {
                zzK();
            }
            int min = Math.min(i2, (int) (this.zzo - this.zzm));
            i2 -= min;
            this.zzm += min;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final boolean zzC() {
        return (((long) this.zzl) + this.zzm) - this.zzn == ((long) this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final boolean zzD() {
        return zzr() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final boolean zzE(int i2) {
        int zzm;
        int i3 = i2 & 7;
        if (i3 == 0) {
            for (int i4 = 0; i4 < 10; i4++) {
                if (zza() >= 0) {
                    return true;
                }
            }
            throw zzgla.zze();
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
        if (this.zzo - this.zzm == 0) {
            zzK();
        }
        long j2 = this.zzm;
        this.zzm = 1 + j2;
        return zzgns.zza(j2);
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
        return (int) ((this.zzl + this.zzm) - this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final int zze(int i2) {
        if (i2 >= 0) {
            int zzd = zzd() + i2;
            int i3 = this.zzj;
            if (zzd <= i3) {
                this.zzj = zzd;
                zzM();
                return i3;
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
        int zza;
        byte zza2;
        long j2 = this.zzo;
        long j3 = this.zzm;
        if (j2 - j3 >= 4) {
            this.zzm = 4 + j3;
            zza = (zzgns.zza(j3) & 255) | ((zzgns.zza(1 + j3) & 255) << 8) | ((zzgns.zza(2 + j3) & 255) << 16);
            zza2 = zzgns.zza(j3 + 3);
        } else {
            zza = (zza() & 255) | ((zza() & 255) << 8) | ((zza() & 255) << 16);
            zza2 = zza();
        }
        return zza | ((zza2 & 255) << 24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (com.google.android.gms.internal.ads.zzgns.zza(r4) >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzj() {
        /*
            r10 = this;
            long r0 = r10.zzm
            long r2 = r10.zzo
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto La
            goto L8c
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.android.gms.internal.ads.zzgns.zza(r0)
            if (r0 < 0) goto L1a
            long r4 = r10.zzm
            long r4 = r4 + r2
            r10.zzm = r4
            return r0
        L1a:
            long r6 = r10.zzo
            long r8 = r10.zzm
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L8c
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgns.zza(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L33
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L89
        L33:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgns.zza(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L42
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L40:
            r6 = r4
            goto L89
        L42:
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgns.zza(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L52
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L89
        L52:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgns.zza(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgns.zza(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgns.zza(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgns.zza(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgns.zza(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgns.zza(r4)
            if (r1 < 0) goto L8c
        L89:
            r10.zzm = r6
            return r0
        L8c:
            long r0 = r10.zzs()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgjk.zzj():int");
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
            this.zzk = 0;
            return 0;
        }
        int zzj = zzj();
        this.zzk = zzj;
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
        long zza;
        byte zza2;
        long j2 = this.zzo;
        long j3 = this.zzm;
        if (j2 - j3 >= 8) {
            this.zzm = 8 + j3;
            zza = (zzgns.zza(j3) & 255) | ((zzgns.zza(1 + j3) & 255) << 8) | ((zzgns.zza(2 + j3) & 255) << 16) | ((zzgns.zza(3 + j3) & 255) << 24) | ((zzgns.zza(4 + j3) & 255) << 32) | ((zzgns.zza(5 + j3) & 255) << 40) | ((zzgns.zza(6 + j3) & 255) << 48);
            zza2 = zzgns.zza(j3 + 7);
        } else {
            zza = (zza() & 255) | ((zza() & 255) << 8) | ((zza() & 255) << 16) | ((zza() & 255) << 24) | ((zza() & 255) << 32) | ((zza() & 255) << 40) | ((zza() & 255) << 48);
            zza2 = zza();
        }
        return zza | ((zza2 & 255) << 56);
    }

    public final long zzr() {
        long zza;
        long j2;
        long j3;
        int i2;
        long j4 = this.zzm;
        if (this.zzo != j4) {
            long j5 = j4 + 1;
            byte zza2 = zzgns.zza(j4);
            if (zza2 >= 0) {
                this.zzm++;
                return zza2;
            } else if (this.zzo - this.zzm >= 10) {
                long j6 = j5 + 1;
                int zza3 = zza2 ^ (zzgns.zza(j5) << 7);
                if (zza3 >= 0) {
                    long j7 = j6 + 1;
                    int zza4 = zza3 ^ (zzgns.zza(j6) << 14);
                    if (zza4 >= 0) {
                        zza = zza4 ^ 16256;
                    } else {
                        j6 = j7 + 1;
                        int zza5 = zza4 ^ (zzgns.zza(j7) << 21);
                        if (zza5 < 0) {
                            i2 = zza5 ^ (-2080896);
                        } else {
                            j7 = j6 + 1;
                            long zza6 = zza5 ^ (zzgns.zza(j6) << 28);
                            if (zza6 < 0) {
                                long j8 = j7 + 1;
                                long zza7 = zza6 ^ (zzgns.zza(j7) << 35);
                                if (zza7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j7 = j8 + 1;
                                    zza6 = zza7 ^ (zzgns.zza(j8) << 42);
                                    if (zza6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j8 = j7 + 1;
                                        zza7 = zza6 ^ (zzgns.zza(j7) << 49);
                                        if (zza7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j7 = j8 + 1;
                                            zza = (zza7 ^ (zzgns.zza(j8) << 56)) ^ 71499008037633920L;
                                            if (zza < 0) {
                                                long j9 = 1 + j7;
                                                if (zzgns.zza(j7) >= 0) {
                                                    j6 = j9;
                                                    this.zzm = j6;
                                                    return zza;
                                                }
                                            }
                                        }
                                    }
                                }
                                zza = zza7 ^ j2;
                                j6 = j8;
                                this.zzm = j6;
                                return zza;
                            }
                            j3 = 266354560;
                            zza = zza6 ^ j3;
                        }
                    }
                    j6 = j7;
                    this.zzm = j6;
                    return zza;
                }
                i2 = zza3 ^ (-128);
                zza = i2;
                this.zzm = j6;
                return zza;
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
            long j2 = zzj;
            long j3 = this.zzo;
            long j4 = this.zzm;
            if (j2 <= j3 - j4) {
                byte[] bArr = new byte[zzj];
                zzgns.zzo(j4, bArr, 0L, j2);
                this.zzm += j2;
                return zzgjg.zzz(bArr);
            }
        }
        if (zzj > 0 && zzj <= zzJ()) {
            byte[] bArr2 = new byte[zzj];
            zzL(bArr2, 0, zzj);
            return zzgjg.zzz(bArr2);
        } else if (zzj == 0) {
            return zzgjg.zzb;
        } else {
            if (zzj < 0) {
                throw zzgla.zzf();
            }
            throw zzgla.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final String zzx() {
        int zzj = zzj();
        if (zzj > 0) {
            long j2 = zzj;
            long j3 = this.zzo;
            long j4 = this.zzm;
            if (j2 <= j3 - j4) {
                byte[] bArr = new byte[zzj];
                zzgns.zzo(j4, bArr, 0L, j2);
                String str = new String(bArr, zzgky.zzb);
                this.zzm += j2;
                return str;
            }
        }
        if (zzj > 0 && zzj <= zzJ()) {
            byte[] bArr2 = new byte[zzj];
            zzL(bArr2, 0, zzj);
            return new String(bArr2, zzgky.zzb);
        } else if (zzj == 0) {
            return "";
        } else {
            if (zzj < 0) {
                throw zzgla.zzf();
            }
            throw zzgla.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final String zzy() {
        int zzj = zzj();
        if (zzj > 0) {
            long j2 = zzj;
            long j3 = this.zzo;
            long j4 = this.zzm;
            if (j2 <= j3 - j4) {
                String zzg = zzgnx.zzg(this.zzg, (int) (j4 - this.zzn), zzj);
                this.zzm += j2;
                return zzg;
            }
        }
        if (zzj >= 0 && zzj <= zzJ()) {
            byte[] bArr = new byte[zzj];
            zzL(bArr, 0, zzj);
            return zzgnx.zzh(bArr, 0, zzj);
        } else if (zzj == 0) {
            return "";
        } else {
            if (zzj <= 0) {
                throw zzgla.zzf();
            }
            throw zzgla.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjo
    public final void zzz(int i2) {
        if (this.zzk != i2) {
            throw zzgla.zzb();
        }
    }
}
