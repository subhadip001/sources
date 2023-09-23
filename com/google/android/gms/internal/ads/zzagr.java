package com.google.android.gms.internal.ads;

import android.util.Log;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzagr implements zzahn {
    private final zzaga zza;
    private final zzdx zzb = new zzdx(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzee zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzagr(zzaga zzagaVar) {
        this.zza = zzagaVar;
    }

    private final void zzd(int i2) {
        this.zzc = i2;
        this.zzd = 0;
    }

    private final boolean zze(zzdy zzdyVar, byte[] bArr, int i2) {
        int min = Math.min(zzdyVar.zza(), i2 - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzdyVar.zzG(min);
        } else {
            zzdyVar.zzB(bArr, this.zzd, min);
        }
        int i3 = this.zzd + min;
        this.zzd = i3;
        return i3 == i2;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zza(zzdy zzdyVar, int i2) {
        int i3;
        long j2;
        zzcw.zzb(this.zze);
        int i4 = -1;
        int i5 = 2;
        if ((i2 & 1) != 0) {
            int i6 = this.zzc;
            if (i6 != 0 && i6 != 1) {
                if (i6 != 2) {
                    int i7 = this.zzj;
                    if (i7 != -1) {
                        Log.w("PesReader", "Unexpected start indicator: expected " + i7 + " more bytes");
                    }
                    this.zza.zzc();
                } else {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zzd(1);
        }
        while (zzdyVar.zza() > 0) {
            int i8 = this.zzc;
            if (i8 != 0) {
                if (i8 == 1) {
                    if (zze(zzdyVar, this.zzb.zza, 9)) {
                        int i9 = 0;
                        this.zzb.zzh(0);
                        int zzc = this.zzb.zzc(24);
                        if (zzc != 1) {
                            a.O("Unexpected start code prefix: ", zzc, "PesReader");
                            i3 = -1;
                            this.zzj = -1;
                        } else {
                            this.zzb.zzj(8);
                            int zzc2 = this.zzb.zzc(16);
                            this.zzb.zzj(5);
                            this.zzk = this.zzb.zzl();
                            this.zzb.zzj(2);
                            this.zzf = this.zzb.zzl();
                            this.zzg = this.zzb.zzl();
                            this.zzb.zzj(6);
                            int zzc3 = this.zzb.zzc(8);
                            this.zzi = zzc3;
                            if (zzc2 == 0) {
                                this.zzj = -1;
                            } else {
                                int i10 = (zzc2 - 3) - zzc3;
                                this.zzj = i10;
                                if (i10 < 0) {
                                    a.O("Found negative packet payload size: ", i10, "PesReader");
                                    i3 = -1;
                                    this.zzj = -1;
                                    i9 = 2;
                                }
                            }
                            i3 = -1;
                            i9 = 2;
                        }
                        zzd(i9);
                        i4 = i3;
                    }
                    i4 = -1;
                } else if (i8 != i5) {
                    int zza = zzdyVar.zza();
                    int i11 = this.zzj;
                    int i12 = i11 != i4 ? zza - i11 : 0;
                    if (i12 > 0) {
                        zza -= i12;
                        zzdyVar.zzE(zzdyVar.zzc() + zza);
                    }
                    this.zza.zza(zzdyVar);
                    int i13 = this.zzj;
                    if (i13 != i4) {
                        int i14 = i13 - zza;
                        this.zzj = i14;
                        if (i14 == 0) {
                            this.zza.zzc();
                            zzd(1);
                        }
                    }
                } else {
                    if (zze(zzdyVar, this.zzb.zza, Math.min(10, this.zzi)) && zze(zzdyVar, null, this.zzi)) {
                        this.zzb.zzh(0);
                        if (this.zzf) {
                            this.zzb.zzj(4);
                            int zzc4 = this.zzb.zzc(3);
                            this.zzb.zzj(1);
                            int zzc5 = this.zzb.zzc(15);
                            this.zzb.zzj(1);
                            long zzc6 = (zzc4 << 30) | (zzc5 << 15) | this.zzb.zzc(15);
                            this.zzb.zzj(1);
                            if (!this.zzh && this.zzg) {
                                this.zzb.zzj(4);
                                int zzc7 = this.zzb.zzc(3);
                                this.zzb.zzj(1);
                                int zzc8 = this.zzb.zzc(15);
                                this.zzb.zzj(1);
                                int zzc9 = this.zzb.zzc(15);
                                this.zzb.zzj(1);
                                this.zze.zzb((zzc8 << 15) | (zzc7 << 30) | zzc9);
                                this.zzh = true;
                            }
                            j2 = this.zze.zzb(zzc6);
                        } else {
                            j2 = -9223372036854775807L;
                        }
                        i2 |= true != this.zzk ? 0 : 4;
                        this.zza.zzd(j2, i2);
                        zzd(3);
                        i4 = -1;
                    }
                }
            } else {
                zzdyVar.zzG(zzdyVar.zza());
            }
            i5 = 2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzb(zzee zzeeVar, zzyv zzyvVar, zzahm zzahmVar) {
        this.zze = zzeeVar;
        this.zza.zzb(zzyvVar, zzahmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }
}
