package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaup {
    private static final long[] zza = {128, 64, 32, 16, 8, 4, 2, 1};
    private final byte[] zzb = new byte[8];
    private int zzc;
    private int zzd;

    public static int zzb(int i2) {
        int i3 = 0;
        while (i3 < 8) {
            int i4 = ((zza[i3] & i2) > 0L ? 1 : ((zza[i3] & i2) == 0L ? 0 : -1));
            i3++;
            if (i4 != 0) {
                return i3;
            }
        }
        return -1;
    }

    public static long zzc(byte[] bArr, int i2, boolean z) {
        long j2 = bArr[0] & 255;
        if (z) {
            j2 &= ~zza[i2 - 1];
        }
        for (int i3 = 1; i3 < i2; i3++) {
            j2 = (j2 << 8) | (bArr[i3] & 255);
        }
        return j2;
    }

    public final int zza() {
        return this.zzd;
    }

    public final void zzd() {
        this.zzc = 0;
        this.zzd = 0;
    }

    public final long zze(zzatu zzatuVar, boolean z, boolean z2, int i2) {
        if (this.zzc == 0) {
            if (!zzatuVar.zzh(this.zzb, 0, 1, z)) {
                return -1L;
            }
            int zzb = zzb(this.zzb[0] & 255);
            this.zzd = zzb;
            if (zzb != -1) {
                this.zzc = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i3 = this.zzd;
        if (i3 > i2) {
            this.zzc = 0;
            return -2L;
        }
        if (i3 != 1) {
            zzatuVar.zzh(this.zzb, 1, i3 - 1, false);
        }
        this.zzc = 0;
        return zzc(this.zzb, this.zzd, z2);
    }
}
