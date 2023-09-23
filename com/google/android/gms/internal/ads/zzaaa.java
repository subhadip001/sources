package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaaa {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza(zzzz zzzzVar, zzzy zzzyVar) {
        if (this.zzc > 0) {
            zzzzVar.zzs(this.zzd, this.zze, this.zzf, this.zzg, zzzyVar);
            this.zzc = 0;
        }
    }

    public final void zzb() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzc(zzzz zzzzVar, long j2, int i2, int i3, int i4, zzzy zzzyVar) {
        if (this.zzg > i3 + i4) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.zzb) {
            int i5 = this.zzc;
            int i6 = i5 + 1;
            this.zzc = i6;
            if (i5 == 0) {
                this.zzd = j2;
                this.zze = i2;
                this.zzf = 0;
            }
            this.zzf += i3;
            this.zzg = i4;
            if (i6 >= 16) {
                zza(zzzzVar, zzzyVar);
            }
        }
    }

    public final void zzd(zzyt zzytVar) {
        if (this.zzb) {
            return;
        }
        zzytVar.zzh(this.zza, 0, 10);
        zzytVar.zzj();
        byte[] bArr = this.zza;
        int i2 = zzxx.zza;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }
}
