package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzafb extends zzafl {
    private zzzf zza;
    private zzafa zzb;

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final long zza(zzdy zzdyVar) {
        if (zzd(zzdyVar.zzH())) {
            int i2 = (zzdyVar.zzH()[2] & 255) >> 4;
            if (i2 != 6) {
                if (i2 == 7) {
                    i2 = 7;
                }
                int zza = zzzb.zza(zzdyVar, i2);
                zzdyVar.zzF(0);
                return zza;
            }
            zzdyVar.zzG(4);
            zzdyVar.zzu();
            int zza2 = zzzb.zza(zzdyVar, i2);
            zzdyVar.zzF(0);
            return zza2;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final boolean zzc(zzdy zzdyVar, long j2, zzafi zzafiVar) {
        byte[] zzH = zzdyVar.zzH();
        zzzf zzzfVar = this.zza;
        if (zzzfVar == null) {
            zzzf zzzfVar2 = new zzzf(zzH, 17);
            this.zza = zzzfVar2;
            zzafiVar.zza = zzzfVar2.zzc(Arrays.copyOfRange(zzH, 9, zzdyVar.zzd()), null);
            return true;
        } else if ((zzH[0] & Byte.MAX_VALUE) == 3) {
            zzze zzb = zzzc.zzb(zzdyVar);
            zzzf zzf = zzzfVar.zzf(zzb);
            this.zza = zzf;
            this.zzb = new zzafa(zzf, zzb);
            return true;
        } else if (zzd(zzH)) {
            zzafa zzafaVar = this.zzb;
            if (zzafaVar != null) {
                zzafaVar.zza(j2);
                zzafiVar.zzb = this.zzb;
            }
            Objects.requireNonNull(zzafiVar.zza);
            return false;
        } else {
            return true;
        }
    }
}
