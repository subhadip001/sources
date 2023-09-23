package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgjt extends zzgjq {
    private final OutputStream zzf;

    public zzgjt(OutputStream outputStream, int i2) {
        super(i2);
        this.zzf = outputStream;
    }

    private final void zzL() {
        this.zzf.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzM(int i2) {
        if (this.zzb - this.zzc < i2) {
            zzL();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzN() {
        if (this.zzc > 0) {
            zzL();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzO(byte b) {
        if (this.zzc == this.zzb) {
            zzL();
        }
        zzc(b);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzP(int i2, boolean z) {
        zzM(11);
        zzf(i2 << 3);
        zzc(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzQ(int i2, zzgjg zzgjgVar) {
        zzs((i2 << 3) | 2);
        zzs(zzgjgVar.zzd());
        zzgjgVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv, com.google.android.gms.internal.ads.zzgiv
    public final void zza(byte[] bArr, int i2, int i3) {
        zzp(bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzh(int i2, int i3) {
        zzM(14);
        zzf((i2 << 3) | 5);
        zzd(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzi(int i2) {
        zzM(4);
        zzd(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzj(int i2, long j2) {
        zzM(18);
        zzf((i2 << 3) | 1);
        zze(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzk(long j2) {
        zzM(8);
        zze(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzl(int i2, int i3) {
        zzM(20);
        zzf(i2 << 3);
        if (i3 >= 0) {
            zzf(i3);
        } else {
            zzg(i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzm(int i2) {
        if (i2 >= 0) {
            zzs(i2);
        } else {
            zzu(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzn(int i2, zzgly zzglyVar, zzgmr zzgmrVar) {
        zzs((i2 << 3) | 2);
        zzgip zzgipVar = (zzgip) zzglyVar;
        int zzap = zzgipVar.zzap();
        if (zzap == -1) {
            zzap = zzgmrVar.zza(zzgipVar);
            zzgipVar.zzas(zzap);
        }
        zzs(zzap);
        zzgmrVar.zzn(zzglyVar, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzo(int i2, String str) {
        zzs((i2 << 3) | 2);
        zzv(str);
    }

    public final void zzp(byte[] bArr, int i2, int i3) {
        int i4 = this.zzb;
        int i5 = this.zzc;
        int i6 = i4 - i5;
        if (i6 >= i3) {
            System.arraycopy(bArr, i2, this.zza, i5, i3);
            this.zzc += i3;
            this.zzd += i3;
            return;
        }
        System.arraycopy(bArr, i2, this.zza, i5, i6);
        int i7 = i2 + i6;
        int i8 = i3 - i6;
        this.zzc = this.zzb;
        this.zzd += i6;
        zzL();
        if (i8 <= this.zzb) {
            System.arraycopy(bArr, i7, this.zza, 0, i8);
            this.zzc = i8;
        } else {
            this.zzf.write(bArr, i7, i8);
        }
        this.zzd += i8;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzq(int i2, int i3) {
        zzs((i2 << 3) | i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzr(int i2, int i3) {
        zzM(20);
        zzf(i2 << 3);
        zzf(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzs(int i2) {
        zzM(5);
        zzf(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzt(int i2, long j2) {
        zzM(20);
        zzf(i2 << 3);
        zzg(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzu(long j2) {
        zzM(10);
        zzg(j2);
    }

    public final void zzv(String str) {
        int zze;
        try {
            int length = str.length() * 3;
            int zzE = zzgjv.zzE(length);
            int i2 = zzE + length;
            int i3 = this.zzb;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int zzd = zzgnx.zzd(str, bArr, 0, length);
                zzs(zzd);
                zzp(bArr, 0, zzd);
                return;
            }
            if (i2 > i3 - this.zzc) {
                zzL();
            }
            int zzE2 = zzgjv.zzE(str.length());
            int i4 = this.zzc;
            try {
                if (zzE2 == zzE) {
                    int i5 = i4 + zzE2;
                    this.zzc = i5;
                    int zzd2 = zzgnx.zzd(str, this.zza, i5, this.zzb - i5);
                    this.zzc = i4;
                    zze = (zzd2 - i4) - zzE2;
                    zzf(zze);
                    this.zzc = zzd2;
                } else {
                    zze = zzgnx.zze(str);
                    zzf(zze);
                    this.zzc = zzgnx.zzd(str, this.zza, this.zzc, zze);
                }
                this.zzd += zze;
            } catch (zzgnw e2) {
                this.zzd -= this.zzc - i4;
                this.zzc = i4;
                throw e2;
            } catch (ArrayIndexOutOfBoundsException e3) {
                throw new zzgjs(e3);
            }
        } catch (zzgnw e4) {
            zzJ(str, e4);
        }
    }
}
