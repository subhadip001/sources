package com.google.android.gms.internal.ads;

import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import java.io.EOFException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzatu {
    private static final byte[] zza = new byte[4096];
    private final zzayi zzb;
    private final long zzc;
    private long zzd;
    private byte[] zze = new byte[LogFileManager.MAX_LOG_SIZE];
    private int zzf;
    private int zzg;

    public zzatu(zzayi zzayiVar, long j2, long j3) {
        this.zzb = zzayiVar;
        this.zzd = j2;
        this.zzc = j3;
    }

    private final int zzj(byte[] bArr, int i2, int i3, int i4, boolean z) {
        if (!Thread.interrupted()) {
            int zza2 = this.zzb.zza(bArr, i2 + i4, i3 - i4);
            if (zza2 == -1) {
                if (i4 == 0 && z) {
                    return -1;
                }
                throw new EOFException();
            }
            return i4 + zza2;
        }
        throw new InterruptedException();
    }

    private final int zzk(byte[] bArr, int i2, int i3) {
        int i4 = this.zzg;
        if (i4 == 0) {
            return 0;
        }
        int min = Math.min(i4, i3);
        System.arraycopy(this.zze, 0, bArr, i2, min);
        zzn(min);
        return min;
    }

    private final int zzl(int i2) {
        int min = Math.min(this.zzg, i2);
        zzn(min);
        return min;
    }

    private final void zzm(int i2) {
        if (i2 != -1) {
            this.zzd += i2;
        }
    }

    private final void zzn(int i2) {
        int i3 = this.zzg - i2;
        this.zzg = i3;
        this.zzf = 0;
        byte[] bArr = this.zze;
        byte[] bArr2 = i3 < bArr.length + (-524288) ? new byte[LogFileManager.MAX_LOG_SIZE + i3] : bArr;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.zze = bArr2;
    }

    public final int zza(byte[] bArr, int i2, int i3) {
        int zzk = zzk(bArr, i2, i3);
        if (zzk == 0) {
            zzk = zzj(bArr, i2, i3, 0, true);
        }
        zzm(zzk);
        return zzk;
    }

    public final int zzb(int i2) {
        int zzl = zzl(i2);
        if (zzl == 0) {
            zzl = zzj(zza, 0, Math.min(i2, 4096), 0, true);
        }
        zzm(zzl);
        return zzl;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzd;
    }

    public final void zze() {
        this.zzf = 0;
    }

    public final boolean zzf(int i2, boolean z) {
        int i3 = this.zzf + i2;
        int length = this.zze.length;
        if (i3 > length) {
            this.zze = Arrays.copyOf(this.zze, zzazn.zze(length + length, LogFileManager.MAX_LOG_SIZE + i3, i3 + 524288));
        }
        int min = Math.min(this.zzg - this.zzf, i2);
        while (min < i2) {
            min = zzj(this.zze, this.zzf, i2, min, false);
            if (min == -1) {
                return false;
            }
        }
        int i4 = this.zzf + i2;
        this.zzf = i4;
        this.zzg = Math.max(this.zzg, i4);
        return true;
    }

    public final boolean zzg(byte[] bArr, int i2, int i3, boolean z) {
        if (zzf(i3, false)) {
            System.arraycopy(this.zze, this.zzf - i3, bArr, i2, i3);
            return true;
        }
        return false;
    }

    public final boolean zzh(byte[] bArr, int i2, int i3, boolean z) {
        int zzk = zzk(bArr, i2, i3);
        while (zzk < i3 && zzk != -1) {
            zzk = zzj(bArr, i2, i3, zzk, z);
        }
        zzm(zzk);
        return zzk != -1;
    }

    public final boolean zzi(int i2, boolean z) {
        int zzl = zzl(i2);
        while (zzl < i2 && zzl != -1) {
            zzl = zzj(zza, -zzl, Math.min(i2, zzl + 4096), zzl, false);
        }
        zzm(zzl);
        return zzl != -1;
    }
}
