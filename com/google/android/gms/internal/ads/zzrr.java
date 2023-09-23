package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzrr implements zzer {
    private final zzer zza;
    private final int zzb;
    private final zzrq zzc;
    private final byte[] zzd;
    private int zze;

    public zzrr(zzer zzerVar, int i2, zzrq zzrqVar) {
        zzcw.zzd(i2 > 0);
        this.zza = zzerVar;
        this.zzb = i2;
        this.zzc = zzrqVar;
        this.zzd = new byte[1];
        this.zze = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i2, int i3) {
        int i4 = this.zze;
        if (i4 == 0) {
            int i5 = 0;
            if (this.zza.zza(this.zzd, 0, 1) != -1) {
                int i6 = (this.zzd[0] & 255) << 4;
                if (i6 != 0) {
                    byte[] bArr2 = new byte[i6];
                    int i7 = i6;
                    while (i7 > 0) {
                        int zza = this.zza.zza(bArr2, i5, i7);
                        if (zza != -1) {
                            i5 += zza;
                            i7 -= zza;
                        }
                    }
                    while (i6 > 0) {
                        int i8 = i6 - 1;
                        if (bArr2[i8] != 0) {
                            break;
                        }
                        i6 = i8;
                    }
                    if (i6 > 0) {
                        this.zzc.zza(new zzdy(bArr2, i6));
                    }
                }
                i4 = this.zzb;
                this.zze = i4;
            }
            return -1;
        }
        int zza2 = this.zza.zza(bArr, i2, Math.min(i4, i3));
        if (zza2 != -1) {
            this.zze -= zza2;
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final long zzb(zzew zzewVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzer, com.google.android.gms.internal.ads.zzfo
    public final Map zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final void zzf(zzft zzftVar) {
        Objects.requireNonNull(zzftVar);
        this.zza.zzf(zzftVar);
    }
}
