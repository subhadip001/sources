package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzagk {
    private final zzzz zza;
    private long zzb;
    private boolean zzc;
    private int zzd;
    private long zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private boolean zzm;

    public zzagk(zzzz zzzzVar) {
        this.zza = zzzzVar;
    }

    private final void zze(int i2) {
        long j2 = this.zzl;
        if (j2 == -9223372036854775807L) {
            return;
        }
        boolean z = this.zzm;
        long j3 = this.zzb;
        long j4 = this.zzk;
        this.zza.zzs(j2, z ? 1 : 0, (int) (j3 - j4), i2, null);
    }

    public final void zza(long j2, int i2, boolean z) {
        if (this.zzj && this.zzg) {
            this.zzm = this.zzc;
            this.zzj = false;
        } else if (this.zzh || this.zzg) {
            if (z && this.zzi) {
                zze(i2 + ((int) (j2 - this.zzb)));
            }
            this.zzk = this.zzb;
            this.zzl = this.zze;
            this.zzm = this.zzc;
            this.zzi = true;
        }
    }

    public final void zzb(byte[] bArr, int i2, int i3) {
        if (this.zzf) {
            int i4 = this.zzd;
            int i5 = (i2 + 2) - i4;
            if (i5 >= i3) {
                this.zzd = (i3 - i2) + i4;
                return;
            }
            this.zzg = (bArr[i5] & 128) != 0;
            this.zzf = false;
        }
    }

    public final void zzc() {
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = false;
        this.zzj = false;
    }

    public final void zzd(long j2, int i2, int i3, long j3, boolean z) {
        boolean z2 = false;
        this.zzg = false;
        this.zzh = false;
        this.zze = j3;
        this.zzd = 0;
        this.zzb = j2;
        if (i3 >= 32 && i3 != 40) {
            if (this.zzi && !this.zzj) {
                if (z) {
                    zze(i2);
                }
                this.zzi = false;
            }
            if (i3 <= 35 || i3 == 39) {
                this.zzh = !this.zzj;
                this.zzj = true;
            }
        }
        boolean z3 = i3 >= 16 && i3 <= 21;
        this.zzc = z3;
        this.zzf = (z3 || i3 <= 9) ? true : true;
    }
}
