package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzadi {
    private final zzdy zza = new zzdy(8);
    private int zzb;

    private final long zzb(zzyt zzytVar) {
        zzym zzymVar = (zzym) zzytVar;
        int i2 = 0;
        zzymVar.zzm(this.zza.zzH(), 0, 1, false);
        int i3 = this.zza.zzH()[0] & 255;
        if (i3 != 0) {
            int i4 = 128;
            int i5 = 0;
            while ((i3 & i4) == 0) {
                i4 >>= 1;
                i5++;
            }
            int i6 = i3 & (~i4);
            zzymVar.zzm(this.zza.zzH(), 1, i5, false);
            while (i2 < i5) {
                i2++;
                i6 = (this.zza.zzH()[i2] & 255) + (i6 << 8);
            }
            this.zzb = i5 + 1 + this.zzb;
            return i6;
        }
        return Long.MIN_VALUE;
    }

    public final boolean zza(zzyt zzytVar) {
        long zzb;
        int i2;
        long zzd = zzytVar.zzd();
        long j2 = 1024;
        int i3 = (zzd > (-1L) ? 1 : (zzd == (-1L) ? 0 : -1));
        if (i3 != 0 && zzd <= 1024) {
            j2 = zzd;
        }
        int i4 = (int) j2;
        zzym zzymVar = (zzym) zzytVar;
        zzymVar.zzm(this.zza.zzH(), 0, 4, false);
        long zzs = this.zza.zzs();
        this.zzb = 4;
        while (zzs != 440786851) {
            int i5 = this.zzb + 1;
            this.zzb = i5;
            if (i5 == i4) {
                return false;
            }
            zzymVar.zzm(this.zza.zzH(), 0, 1, false);
            zzs = ((zzs << 8) & (-256)) | (this.zza.zzH()[0] & 255);
        }
        long zzb2 = zzb(zzytVar);
        long j3 = this.zzb;
        if (zzb2 != Long.MIN_VALUE && (i3 == 0 || j3 + zzb2 < zzd)) {
            while (true) {
                int i6 = (this.zzb > (j3 + zzb2) ? 1 : (this.zzb == (j3 + zzb2) ? 0 : -1));
                if (i6 < 0) {
                    if (zzb(zzytVar) == Long.MIN_VALUE || (zzb = zzb(zzytVar)) < 0) {
                        return false;
                    }
                    if (i2 != 0) {
                        int i7 = (int) zzb;
                        zzymVar.zzl(i7, false);
                        this.zzb += i7;
                    }
                } else if (i6 == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
