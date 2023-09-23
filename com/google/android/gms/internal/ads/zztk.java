package com.google.android.gms.internal.ads;

import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zztk {
    private final zzdy zza = new zzdy(32);
    private zztj zzb;
    private zztj zzc;
    private zztj zzd;
    private long zze;
    private final zzvw zzf;

    public zztk(zzvw zzvwVar, byte[] bArr) {
        this.zzf = zzvwVar;
        zztj zztjVar = new zztj(0L, LogFileManager.MAX_LOG_SIZE);
        this.zzb = zztjVar;
        this.zzc = zztjVar;
        this.zzd = zztjVar;
    }

    private final int zzi(int i2) {
        zztj zztjVar = this.zzd;
        if (zztjVar.zzc == null) {
            zzvp zzb = this.zzf.zzb();
            zztj zztjVar2 = new zztj(this.zzd.zzb, LogFileManager.MAX_LOG_SIZE);
            zztjVar.zzc = zzb;
            zztjVar.zzd = zztjVar2;
        }
        return Math.min(i2, (int) (this.zzd.zzb - this.zze));
    }

    private static zztj zzj(zztj zztjVar, long j2) {
        while (j2 >= zztjVar.zzb) {
            zztjVar = zztjVar.zzd;
        }
        return zztjVar;
    }

    private static zztj zzk(zztj zztjVar, long j2, ByteBuffer byteBuffer, int i2) {
        zztj zzj = zzj(zztjVar, j2);
        while (i2 > 0) {
            int min = Math.min(i2, (int) (zzj.zzb - j2));
            byteBuffer.put(zzj.zzc.zza, zzj.zza(j2), min);
            i2 -= min;
            j2 += min;
            if (j2 == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zztj zzl(zztj zztjVar, long j2, byte[] bArr, int i2) {
        zztj zzj = zzj(zztjVar, j2);
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(i3, (int) (zzj.zzb - j2));
            System.arraycopy(zzj.zzc.zza, zzj.zza(j2), bArr, i2 - i3, min);
            i3 -= min;
            j2 += min;
            if (j2 == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zztj zzm(zztj zztjVar, zzgc zzgcVar, zztm zztmVar, zzdy zzdyVar) {
        zztj zztjVar2;
        int i2;
        if (zzgcVar.zzk()) {
            long j2 = zztmVar.zzb;
            zzdyVar.zzC(1);
            zztj zzl = zzl(zztjVar, j2, zzdyVar.zzH(), 1);
            long j3 = j2 + 1;
            byte b = zzdyVar.zzH()[0];
            int i3 = b & 128;
            int i4 = b & Byte.MAX_VALUE;
            zzfz zzfzVar = zzgcVar.zza;
            byte[] bArr = zzfzVar.zza;
            if (bArr == null) {
                zzfzVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            zztjVar2 = zzl(zzl, j3, zzfzVar.zza, i4);
            long j4 = j3 + i4;
            if (i3 != 0) {
                zzdyVar.zzC(2);
                zztjVar2 = zzl(zztjVar2, j4, zzdyVar.zzH(), 2);
                j4 += 2;
                i2 = zzdyVar.zzo();
            } else {
                i2 = 1;
            }
            int[] iArr = zzfzVar.zzd;
            if (iArr == null || iArr.length < i2) {
                iArr = new int[i2];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzfzVar.zze;
            if (iArr3 == null || iArr3.length < i2) {
                iArr3 = new int[i2];
            }
            int[] iArr4 = iArr3;
            if (i3 != 0) {
                int i5 = i2 * 6;
                zzdyVar.zzC(i5);
                zztjVar2 = zzl(zztjVar2, j4, zzdyVar.zzH(), i5);
                j4 += i5;
                zzdyVar.zzF(0);
                for (int i6 = 0; i6 < i2; i6++) {
                    iArr2[i6] = zzdyVar.zzo();
                    iArr4[i6] = zzdyVar.zzn();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zztmVar.zza - ((int) (j4 - zztmVar.zzb));
            }
            zzzy zzzyVar = zztmVar.zzc;
            int i7 = zzeg.zza;
            zzfzVar.zzc(i2, iArr2, iArr4, zzzyVar.zzb, zzfzVar.zza, zzzyVar.zza, zzzyVar.zzc, zzzyVar.zzd);
            long j5 = zztmVar.zzb;
            int i8 = (int) (j4 - j5);
            zztmVar.zzb = j5 + i8;
            zztmVar.zza -= i8;
        } else {
            zztjVar2 = zztjVar;
        }
        if (zzgcVar.zze()) {
            zzdyVar.zzC(4);
            zztj zzl2 = zzl(zztjVar2, zztmVar.zzb, zzdyVar.zzH(), 4);
            int zzn = zzdyVar.zzn();
            zztmVar.zzb += 4;
            zztmVar.zza -= 4;
            zzgcVar.zzi(zzn);
            zztj zzk = zzk(zzl2, zztmVar.zzb, zzgcVar.zzb, zzn);
            zztmVar.zzb += zzn;
            int i9 = zztmVar.zza - zzn;
            zztmVar.zza = i9;
            ByteBuffer byteBuffer = zzgcVar.zze;
            if (byteBuffer != null && byteBuffer.capacity() >= i9) {
                zzgcVar.zze.clear();
            } else {
                zzgcVar.zze = ByteBuffer.allocate(i9);
            }
            return zzk(zzk, zztmVar.zzb, zzgcVar.zze, zztmVar.zza);
        }
        zzgcVar.zzi(zztmVar.zza);
        return zzk(zztjVar2, zztmVar.zzb, zzgcVar.zzb, zztmVar.zza);
    }

    private final void zzn(int i2) {
        long j2 = this.zze + i2;
        this.zze = j2;
        zztj zztjVar = this.zzd;
        if (j2 == zztjVar.zzb) {
            this.zzd = zztjVar.zzd;
        }
    }

    public final int zza(zzp zzpVar, int i2, boolean z) {
        int zzi = zzi(i2);
        zztj zztjVar = this.zzd;
        int zza = zzpVar.zza(zztjVar.zzc.zza, zztjVar.zza(this.zze), zzi);
        if (zza != -1) {
            zzn(zza);
            return zza;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j2) {
        zztj zztjVar;
        if (j2 != -1) {
            while (true) {
                zztjVar = this.zzb;
                if (j2 < zztjVar.zzb) {
                    break;
                }
                this.zzf.zzc(zztjVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zztjVar.zza) {
                this.zzc = zztjVar;
            }
        }
    }

    public final void zzd(zzgc zzgcVar, zztm zztmVar) {
        zzm(this.zzc, zzgcVar, zztmVar, this.zza);
    }

    public final void zze(zzgc zzgcVar, zztm zztmVar) {
        this.zzc = zzm(this.zzc, zzgcVar, zztmVar, this.zza);
    }

    public final void zzf() {
        zztj zztjVar = this.zzb;
        if (zztjVar.zzc != null) {
            this.zzf.zzd(zztjVar);
            zztjVar.zzb();
        }
        this.zzb.zze(0L, LogFileManager.MAX_LOG_SIZE);
        zztj zztjVar2 = this.zzb;
        this.zzc = zztjVar2;
        this.zzd = zztjVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzdy zzdyVar, int i2) {
        while (i2 > 0) {
            int zzi = zzi(i2);
            zztj zztjVar = this.zzd;
            zzdyVar.zzB(zztjVar.zzc.zza, zztjVar.zza(this.zze), zzi);
            i2 -= zzi;
            zzn(zzi);
        }
    }
}
