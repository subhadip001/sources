package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzagp {
    public byte[] zza;
    public int zzb;
    private final int zzc;
    private boolean zzd;
    private boolean zze;

    public zzagp(int i2, int i3) {
        this.zzc = i2;
        byte[] bArr = new byte[131];
        this.zza = bArr;
        bArr[2] = 1;
    }

    public final void zza(byte[] bArr, int i2, int i3) {
        if (this.zzd) {
            int i4 = i3 - i2;
            byte[] bArr2 = this.zza;
            int length = bArr2.length;
            int i5 = this.zzb + i4;
            if (length < i5) {
                this.zza = Arrays.copyOf(bArr2, i5 + i5);
            }
            System.arraycopy(bArr, i2, this.zza, this.zzb, i4);
            this.zzb += i4;
        }
    }

    public final void zzb() {
        this.zzd = false;
        this.zze = false;
    }

    public final void zzc(int i2) {
        zzcw.zzf(!this.zzd);
        boolean z = i2 == this.zzc;
        this.zzd = z;
        if (z) {
            this.zzb = 3;
            this.zze = false;
        }
    }

    public final boolean zzd(int i2) {
        if (this.zzd) {
            this.zzb -= i2;
            this.zzd = false;
            this.zze = true;
            return true;
        }
        return false;
    }

    public final boolean zze() {
        return this.zze;
    }
}
