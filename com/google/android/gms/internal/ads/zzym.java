package com.google.android.gms.internal.ads;

import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzym implements zzyt {
    private final zzp zzb;
    private final long zzc;
    private long zzd;
    private int zzf;
    private int zzg;
    private byte[] zze = new byte[LogFileManager.MAX_LOG_SIZE];
    private final byte[] zza = new byte[4096];

    static {
        zzbc.zzb("media3.extractor");
    }

    public zzym(zzp zzpVar, long j2, long j3) {
        this.zzb = zzpVar;
        this.zzd = j2;
        this.zzc = j3;
    }

    private final int zzp(byte[] bArr, int i2, int i3) {
        int i4 = this.zzg;
        if (i4 == 0) {
            return 0;
        }
        int min = Math.min(i4, i3);
        System.arraycopy(this.zze, 0, bArr, i2, min);
        zzu(min);
        return min;
    }

    private final int zzq(byte[] bArr, int i2, int i3, int i4, boolean z) {
        if (!Thread.interrupted()) {
            int zza = this.zzb.zza(bArr, i2 + i4, i3 - i4);
            if (zza == -1) {
                if (i4 == 0 && z) {
                    return -1;
                }
                throw new EOFException();
            }
            return i4 + zza;
        }
        throw new InterruptedIOException();
    }

    private final int zzr(int i2) {
        int min = Math.min(this.zzg, i2);
        zzu(min);
        return min;
    }

    private final void zzs(int i2) {
        if (i2 != -1) {
            this.zzd += i2;
        }
    }

    private final void zzt(int i2) {
        int i3 = this.zzf + i2;
        int length = this.zze.length;
        if (i3 > length) {
            this.zze = Arrays.copyOf(this.zze, zzeg.zzf(length + length, LogFileManager.MAX_LOG_SIZE + i3, i3 + 524288));
        }
    }

    private final void zzu(int i2) {
        int i3 = this.zzg - i2;
        this.zzg = i3;
        this.zzf = 0;
        byte[] bArr = this.zze;
        byte[] bArr2 = i3 < bArr.length + (-524288) ? new byte[LogFileManager.MAX_LOG_SIZE + i3] : bArr;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.zze = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzyt, com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i2, int i3) {
        int zzp = zzp(bArr, i2, i3);
        if (zzp == 0) {
            zzp = zzq(bArr, i2, i3, 0, true);
        }
        zzs(zzp);
        return zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final int zzb(byte[] bArr, int i2, int i3) {
        int min;
        zzt(i3);
        int i4 = this.zzg;
        int i5 = this.zzf;
        int i6 = i4 - i5;
        if (i6 == 0) {
            min = zzq(this.zze, i5, i3, 0, true);
            if (min == -1) {
                return -1;
            }
            this.zzg += min;
        } else {
            min = Math.min(i3, i6);
        }
        System.arraycopy(this.zze, this.zzf, bArr, i2, min);
        this.zzf += min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final int zzc(int i2) {
        int zzr = zzr(1);
        if (zzr == 0) {
            zzr = zzq(this.zza, 0, Math.min(1, 4096), 0, true);
        }
        zzs(zzr);
        return zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final long zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final long zze() {
        return this.zzd + this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final long zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final void zzg(int i2) {
        zzl(i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final void zzh(byte[] bArr, int i2, int i3) {
        zzm(bArr, i2, i3, false);
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final void zzi(byte[] bArr, int i2, int i3) {
        zzn(bArr, i2, i3, false);
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final void zzj() {
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final void zzk(int i2) {
        zzo(i2, false);
    }

    public final boolean zzl(int i2, boolean z) {
        zzt(i2);
        int i3 = this.zzg - this.zzf;
        while (i3 < i2) {
            i3 = zzq(this.zze, this.zzf, i2, i3, z);
            if (i3 == -1) {
                return false;
            }
            this.zzg = this.zzf + i3;
        }
        this.zzf += i2;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final boolean zzm(byte[] bArr, int i2, int i3, boolean z) {
        if (zzl(i3, z)) {
            System.arraycopy(this.zze, this.zzf - i3, bArr, i2, i3);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final boolean zzn(byte[] bArr, int i2, int i3, boolean z) {
        int zzp = zzp(bArr, i2, i3);
        while (zzp < i3 && zzp != -1) {
            zzp = zzq(bArr, i2, i3, zzp, z);
        }
        zzs(zzp);
        return zzp != -1;
    }

    public final boolean zzo(int i2, boolean z) {
        int zzr = zzr(i2);
        while (zzr < i2 && zzr != -1) {
            zzr = zzq(this.zza, -zzr, Math.min(i2, zzr + 4096), zzr, false);
        }
        zzs(zzr);
        return zzr != -1;
    }
}
