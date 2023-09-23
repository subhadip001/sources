package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.firebase.database.core.ValidationPath;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzafw implements zzaga {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzdx zzc = new zzdx(new byte[7], 7);
    private final zzdy zzd = new zzdy(Arrays.copyOf(zza, 10));
    private final String zze;
    private String zzf;
    private zzzz zzg;
    private zzzz zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private zzzz zzu;
    private long zzv;

    public zzafw(boolean z, String str) {
        zzh();
        this.zzn = -1;
        this.zzo = -1;
        this.zzr = -9223372036854775807L;
        this.zzt = -9223372036854775807L;
        this.zzb = z;
        this.zze = str;
    }

    public static boolean zzf(int i2) {
        return (i2 & 65526) == 65520;
    }

    private final void zzg() {
        this.zzm = false;
        zzh();
    }

    private final void zzh() {
        this.zzi = 0;
        this.zzj = 0;
        this.zzk = 256;
    }

    private final void zzi() {
        this.zzi = 3;
        this.zzj = 0;
    }

    private final void zzj(zzzz zzzzVar, long j2, int i2, int i3) {
        this.zzi = 4;
        this.zzj = i2;
        this.zzu = zzzzVar;
        this.zzv = j2;
        this.zzs = i3;
    }

    private final boolean zzk(zzdy zzdyVar, byte[] bArr, int i2) {
        int min = Math.min(zzdyVar.zza(), i2 - this.zzj);
        zzdyVar.zzB(bArr, this.zzj, min);
        int i3 = this.zzj + min;
        this.zzj = i3;
        return i3 == i2;
    }

    private static final boolean zzl(byte b, byte b2) {
        return zzf((b2 & 255) | 65280);
    }

    private static final boolean zzm(zzdy zzdyVar, byte[] bArr, int i2) {
        if (zzdyVar.zza() < i2) {
            return false;
        }
        zzdyVar.zzB(bArr, 0, i2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zza(zzdy zzdyVar) {
        int i2;
        int i3;
        int i4;
        Objects.requireNonNull(this.zzg);
        int i5 = zzeg.zza;
        while (zzdyVar.zza() > 0) {
            int i6 = this.zzi;
            int i7 = 13;
            int i8 = 2;
            if (i6 == 0) {
                byte[] zzH = zzdyVar.zzH();
                int zzc = zzdyVar.zzc();
                int zzd = zzdyVar.zzd();
                while (true) {
                    if (zzc < zzd) {
                        i2 = zzc + 1;
                        i3 = zzH[zzc] & 255;
                        if (this.zzk == 512 && zzl((byte) -1, (byte) i3)) {
                            if (!this.zzm) {
                                int i9 = i2 - 2;
                                zzdyVar.zzF(i9 + 1);
                                if (zzm(zzdyVar, this.zzc.zza, 1)) {
                                    this.zzc.zzh(4);
                                    int zzc2 = this.zzc.zzc(1);
                                    int i10 = this.zzn;
                                    if (i10 == -1 || zzc2 == i10) {
                                        if (this.zzo != -1) {
                                            if (!zzm(zzdyVar, this.zzc.zza, 1)) {
                                                break;
                                            }
                                            this.zzc.zzh(i8);
                                            if (this.zzc.zzc(4) == this.zzo) {
                                                zzdyVar.zzF(i9 + 2);
                                            }
                                        }
                                        if (!zzm(zzdyVar, this.zzc.zza, 4)) {
                                            break;
                                        }
                                        this.zzc.zzh(14);
                                        int zzc3 = this.zzc.zzc(i7);
                                        if (zzc3 >= 7) {
                                            byte[] zzH2 = zzdyVar.zzH();
                                            int zzd2 = zzdyVar.zzd();
                                            int i11 = i9 + zzc3;
                                            if (i11 < zzd2) {
                                                byte b = zzH2[i11];
                                                if (b != -1) {
                                                    if (b == 73) {
                                                        int i12 = i11 + 1;
                                                        if (i12 == zzd2) {
                                                            break;
                                                        } else if (zzH2[i12] == 68) {
                                                            int i13 = i11 + 2;
                                                            if (i13 == zzd2) {
                                                                break;
                                                            } else if (zzH2[i13] == 51) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int i14 = i11 + 1;
                                                    if (i14 == zzd2) {
                                                        break;
                                                    }
                                                    byte b2 = zzH2[i14];
                                                    if (zzl((byte) -1, b2) && ((b2 & 8) >> 3) == zzc2) {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        int i15 = this.zzk;
                        int i16 = i15 | i3;
                        if (i16 == 329) {
                            i4 = ValidationPath.MAX_PATH_LENGTH_BYTES;
                        } else if (i16 == 511) {
                            i4 = 512;
                        } else if (i16 == 836) {
                            i4 = 1024;
                        } else if (i16 == 1075) {
                            this.zzi = 2;
                            this.zzj = 3;
                            this.zzs = 0;
                            this.zzd.zzF(0);
                            zzdyVar.zzF(i2);
                            break;
                        } else if (i15 != 256) {
                            this.zzk = 256;
                            zzc = i2 - 1;
                            i7 = 13;
                            i8 = 2;
                        } else {
                            zzc = i2;
                            i7 = 13;
                            i8 = 2;
                        }
                        this.zzk = i4;
                        zzc = i2;
                        i7 = 13;
                        i8 = 2;
                    } else {
                        zzdyVar.zzF(zzc);
                        break;
                    }
                }
                this.zzp = (i3 & 8) >> 3;
                this.zzl = 1 == ((i3 & 1) ^ 1);
                if (this.zzm) {
                    zzi();
                } else {
                    this.zzi = 1;
                    this.zzj = 0;
                }
                zzdyVar.zzF(i2);
            } else if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        int min = Math.min(zzdyVar.zza(), this.zzs - this.zzj);
                        this.zzu.zzq(zzdyVar, min);
                        int i17 = this.zzj + min;
                        this.zzj = i17;
                        int i18 = this.zzs;
                        if (i17 == i18) {
                            long j2 = this.zzt;
                            if (j2 != -9223372036854775807L) {
                                this.zzu.zzs(j2, 1, i18, 0, null);
                                this.zzt += this.zzv;
                            }
                            zzh();
                        }
                    } else {
                        if (zzk(zzdyVar, this.zzc.zza, true != this.zzl ? 5 : 7)) {
                            this.zzc.zzh(0);
                            if (!this.zzq) {
                                int zzc4 = this.zzc.zzc(2) + 1;
                                if (zzc4 != 2) {
                                    Log.w("AdtsReader", "Detected audio object type: " + zzc4 + ", but assuming AAC LC.");
                                }
                                this.zzc.zzj(5);
                                int zzc5 = this.zzc.zzc(3);
                                int i19 = this.zzo;
                                byte[] bArr = {(byte) (((i19 >> 1) & 7) | 16), (byte) (((zzc5 << 3) & 120) | ((i19 << 7) & 128))};
                                zzxt zza2 = zzxu.zza(bArr);
                                zzab zzabVar = new zzab();
                                zzabVar.zzH(this.zzf);
                                zzabVar.zzS("audio/mp4a-latm");
                                zzabVar.zzx(zza2.zzc);
                                zzabVar.zzw(zza2.zzb);
                                zzabVar.zzT(zza2.zza);
                                zzabVar.zzI(Collections.singletonList(bArr));
                                zzabVar.zzK(this.zze);
                                zzad zzY = zzabVar.zzY();
                                this.zzr = 1024000000 / zzY.zzA;
                                this.zzg.zzk(zzY);
                                this.zzq = true;
                            } else {
                                this.zzc.zzj(10);
                            }
                            this.zzc.zzj(4);
                            int zzc6 = this.zzc.zzc(13) - 7;
                            if (this.zzl) {
                                zzc6 -= 2;
                            }
                            zzj(this.zzg, this.zzr, 0, zzc6);
                        }
                    }
                } else if (zzk(zzdyVar, this.zzd.zzH(), 10)) {
                    this.zzh.zzq(this.zzd, 10);
                    this.zzd.zzF(6);
                    zzj(this.zzh, 0L, 10, 10 + this.zzd.zzj());
                }
            } else if (zzdyVar.zza() != 0) {
                zzdx zzdxVar = this.zzc;
                zzdxVar.zza[0] = zzdyVar.zzH()[zzdyVar.zzc()];
                zzdxVar.zzh(2);
                int zzc7 = this.zzc.zzc(4);
                int i20 = this.zzo;
                if (i20 != -1 && zzc7 != i20) {
                    zzg();
                } else {
                    if (!this.zzm) {
                        this.zzm = true;
                        this.zzn = this.zzp;
                        this.zzo = zzc7;
                    }
                    zzi();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyv zzyvVar, zzahm zzahmVar) {
        zzahmVar.zzc();
        this.zzf = zzahmVar.zzb();
        zzzz zzv = zzyvVar.zzv(zzahmVar.zza(), 1);
        this.zzg = zzv;
        this.zzu = zzv;
        if (!this.zzb) {
            this.zzh = new zzyr();
            return;
        }
        zzahmVar.zzc();
        zzzz zzv2 = zzyvVar.zzv(zzahmVar.zza(), 5);
        this.zzh = zzv2;
        zzab zzabVar = new zzab();
        zzabVar.zzH(zzahmVar.zzb());
        zzabVar.zzS("application/id3");
        zzv2.zzk(zzabVar.zzY());
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.zzt = j2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        this.zzt = -9223372036854775807L;
        zzg();
    }
}
