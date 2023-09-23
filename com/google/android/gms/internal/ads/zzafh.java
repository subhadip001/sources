package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzafh extends zzafl {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};

    public static boolean zzd(zzdy zzdyVar) {
        return zzk(zzdyVar, zza);
    }

    private static boolean zzk(zzdy zzdyVar, byte[] bArr) {
        if (zzdyVar.zza() < 8) {
            return false;
        }
        int zzc = zzdyVar.zzc();
        byte[] bArr2 = new byte[8];
        zzdyVar.zzB(bArr2, 0, 8);
        zzdyVar.zzF(zzc);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final long zza(zzdy zzdyVar) {
        byte[] zzH = zzdyVar.zzH();
        int i2 = zzH[0] & 255;
        int i3 = i2 & 3;
        int i4 = 2;
        if (i3 == 0) {
            i4 = 1;
        } else if (i3 != 1 && i3 != 2) {
            i4 = zzH[1] & 63;
        }
        int i5 = i2 >> 3;
        int i6 = i5 & 3;
        return zzg(i4 * (i5 >= 16 ? 2500 << i6 : i5 >= 12 ? 10000 << (i6 & 1) : i6 == 3 ? 60000 : 10000 << i6));
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final boolean zzc(zzdy zzdyVar, long j2, zzafi zzafiVar) {
        if (zzk(zzdyVar, zza)) {
            byte[] copyOf = Arrays.copyOf(zzdyVar.zzH(), zzdyVar.zzd());
            int i2 = copyOf[9] & 255;
            List zza2 = zzzq.zza(copyOf);
            zzcw.zzf(zzafiVar.zza == null);
            zzab zzabVar = new zzab();
            zzabVar.zzS("audio/opus");
            zzabVar.zzw(i2);
            zzabVar.zzT(48000);
            zzabVar.zzI(zza2);
            zzafiVar.zza = zzabVar.zzY();
            return true;
        } else if (zzk(zzdyVar, zzb)) {
            zzcw.zzb(zzafiVar.zza);
            zzdyVar.zzG(8);
            zzbl zzb2 = zzaaf.zzb(zzfrh.zzn(zzaaf.zzc(zzdyVar, false, false).zzb));
            if (zzb2 == null) {
                return true;
            }
            zzab zzb3 = zzafiVar.zza.zzb();
            zzb3.zzM(zzb2.zzd(zzafiVar.zza.zzk));
            zzafiVar.zza = zzb3.zzY();
            return true;
        } else {
            zzcw.zzb(zzafiVar.zza);
            return false;
        }
    }
}
