package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzauo {
    private final zzazg zza = new zzazg(8);
    private int zzb;

    private final long zzb(zzatu zzatuVar) {
        int i2 = 0;
        zzatuVar.zzg(this.zza.zza, 0, 1, false);
        int i3 = this.zza.zza[0] & 255;
        if (i3 != 0) {
            int i4 = 128;
            int i5 = 0;
            while ((i3 & i4) == 0) {
                i4 >>= 1;
                i5++;
            }
            int i6 = i3 & (~i4);
            zzatuVar.zzg(this.zza.zza, 1, i5, false);
            while (i2 < i5) {
                i2++;
                i6 = (this.zza.zza[i2] & 255) + (i6 << 8);
            }
            this.zzb = i5 + 1 + this.zzb;
            return i6;
        }
        return Long.MIN_VALUE;
    }

    public final boolean zza(zzatu zzatuVar) {
        long zzb;
        int i2;
        long zzc = zzatuVar.zzc();
        long j2 = 1024;
        int i3 = (zzc > (-1L) ? 1 : (zzc == (-1L) ? 0 : -1));
        if (i3 != 0 && zzc <= 1024) {
            j2 = zzc;
        }
        int i4 = (int) j2;
        zzatuVar.zzg(this.zza.zza, 0, 4, false);
        long zzm = this.zza.zzm();
        this.zzb = 4;
        while (zzm != 440786851) {
            int i5 = this.zzb + 1;
            this.zzb = i5;
            if (i5 == i4) {
                return false;
            }
            zzatuVar.zzg(this.zza.zza, 0, 1, false);
            zzm = ((zzm << 8) & (-256)) | (this.zza.zza[0] & 255);
        }
        long zzb2 = zzb(zzatuVar);
        long j3 = this.zzb;
        if (zzb2 != Long.MIN_VALUE && (i3 == 0 || j3 + zzb2 < zzc)) {
            while (true) {
                int i6 = (this.zzb > (j3 + zzb2) ? 1 : (this.zzb == (j3 + zzb2) ? 0 : -1));
                if (i6 < 0) {
                    if (zzb(zzatuVar) == Long.MIN_VALUE || (zzb = zzb(zzatuVar)) < 0) {
                        return false;
                    }
                    if (i2 != 0) {
                        zzatuVar.zzf((int) zzb, false);
                        this.zzb = (int) (this.zzb + zzb);
                    }
                } else if (i6 == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
