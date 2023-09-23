package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzzf {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzze zzk;
    private final zzbl zzl;

    private zzzf(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, zzze zzzeVar, zzbl zzblVar) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
        this.zzf = zzi(i6);
        this.zzg = i7;
        this.zzh = i8;
        this.zzi = zzh(i8);
        this.zzj = j2;
        this.zzk = zzzeVar;
        this.zzl = zzblVar;
    }

    public zzzf(byte[] bArr, int i2) {
        zzdx zzdxVar = new zzdx(bArr, bArr.length);
        zzdxVar.zzh(i2 * 8);
        this.zza = zzdxVar.zzc(16);
        this.zzb = zzdxVar.zzc(16);
        this.zzc = zzdxVar.zzc(24);
        this.zzd = zzdxVar.zzc(24);
        int zzc = zzdxVar.zzc(20);
        this.zze = zzc;
        this.zzf = zzi(zzc);
        this.zzg = zzdxVar.zzc(3) + 1;
        int zzc2 = zzdxVar.zzc(5) + 1;
        this.zzh = zzc2;
        this.zzi = zzh(zzc2);
        this.zzj = zzeg.zzy(zzdxVar.zzc(4), zzdxVar.zzc(32));
        this.zzk = null;
        this.zzl = null;
    }

    private static int zzh(int i2) {
        if (i2 != 8) {
            if (i2 != 12) {
                if (i2 != 16) {
                    if (i2 != 20) {
                        return i2 != 24 ? -1 : 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    private static int zzi(int i2) {
        switch (i2) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long zza() {
        long j2 = this.zzj;
        if (j2 == 0) {
            return -9223372036854775807L;
        }
        return (j2 * 1000000) / this.zze;
    }

    public final long zzb(long j2) {
        return zzeg.zzr((j2 * this.zze) / 1000000, 0L, this.zzj - 1);
    }

    public final zzad zzc(byte[] bArr, zzbl zzblVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i2 = this.zzd;
        if (i2 <= 0) {
            i2 = -1;
        }
        zzbl zzd = zzd(zzblVar);
        zzab zzabVar = new zzab();
        zzabVar.zzS("audio/flac");
        zzabVar.zzL(i2);
        zzabVar.zzw(this.zzg);
        zzabVar.zzT(this.zze);
        zzabVar.zzI(Collections.singletonList(bArr));
        zzabVar.zzM(zzd);
        return zzabVar.zzY();
    }

    public final zzbl zzd(zzbl zzblVar) {
        zzbl zzblVar2 = this.zzl;
        return zzblVar2 == null ? zzblVar : zzblVar2.zzd(zzblVar);
    }

    public final zzzf zze(List list) {
        return new zzzf(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(new zzbl(list)));
    }

    public final zzzf zzf(zzze zzzeVar) {
        return new zzzf(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzzeVar, this.zzl);
    }

    public final zzzf zzg(List list) {
        return new zzzf(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzaaf.zzb(list)));
    }
}
