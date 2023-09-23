package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgjw {
    private final zzgjv zza;

    private zzgjw(zzgjv zzgjvVar) {
        zzgky.zzf(zzgjvVar, "output");
        this.zza = zzgjvVar;
        zzgjvVar.zze = this;
    }

    public static zzgjw zza(zzgjv zzgjvVar) {
        zzgjw zzgjwVar = zzgjvVar.zze;
        return zzgjwVar != null ? zzgjwVar : new zzgjw(zzgjvVar);
    }

    public final void zzA(int i2, int i3) {
        this.zza.zzr(i2, (i3 >> 31) ^ (i3 + i3));
    }

    public final void zzB(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzq(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                int intValue = ((Integer) list.get(i5)).intValue();
                i4 += zzgjv.zzE((intValue >> 31) ^ (intValue + intValue));
            }
            this.zza.zzs(i4);
            while (i3 < list.size()) {
                zzgjv zzgjvVar = this.zza;
                int intValue2 = ((Integer) list.get(i3)).intValue();
                zzgjvVar.zzs((intValue2 >> 31) ^ (intValue2 + intValue2));
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            zzgjv zzgjvVar2 = this.zza;
            int intValue3 = ((Integer) list.get(i3)).intValue();
            zzgjvVar2.zzr(i2, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i3++;
        }
    }

    public final void zzC(int i2, long j2) {
        this.zza.zzt(i2, (j2 >> 63) ^ (j2 + j2));
    }

    public final void zzD(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzq(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                long longValue = ((Long) list.get(i5)).longValue();
                i4 += zzgjv.zzF((longValue >> 63) ^ (longValue + longValue));
            }
            this.zza.zzs(i4);
            while (i3 < list.size()) {
                zzgjv zzgjvVar = this.zza;
                long longValue2 = ((Long) list.get(i3)).longValue();
                zzgjvVar.zzu((longValue2 >> 63) ^ (longValue2 + longValue2));
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            zzgjv zzgjvVar2 = this.zza;
            long longValue3 = ((Long) list.get(i3)).longValue();
            zzgjvVar2.zzt(i2, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i3++;
        }
    }

    @Deprecated
    public final void zzE(int i2) {
        this.zza.zzq(i2, 3);
    }

    public final void zzF(int i2, String str) {
        this.zza.zzo(i2, str);
    }

    public final void zzG(int i2, List list) {
        int i3 = 0;
        if (list instanceof zzglg) {
            zzglg zzglgVar = (zzglg) list;
            while (i3 < list.size()) {
                Object zzf = zzglgVar.zzf(i3);
                if (zzf instanceof String) {
                    this.zza.zzo(i2, (String) zzf);
                } else {
                    this.zza.zzQ(i2, (zzgjg) zzf);
                }
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzo(i2, (String) list.get(i3));
            i3++;
        }
    }

    public final void zzH(int i2, int i3) {
        this.zza.zzr(i2, i3);
    }

    public final void zzI(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzq(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzgjv.zzE(((Integer) list.get(i5)).intValue());
            }
            this.zza.zzs(i4);
            while (i3 < list.size()) {
                this.zza.zzs(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzr(i2, ((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public final void zzJ(int i2, long j2) {
        this.zza.zzt(i2, j2);
    }

    public final void zzK(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzq(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzgjv.zzF(((Long) list.get(i5)).longValue());
            }
            this.zza.zzs(i4);
            while (i3 < list.size()) {
                this.zza.zzu(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzt(i2, ((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public final void zzb(int i2, boolean z) {
        this.zza.zzP(i2, z);
    }

    public final void zzc(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzq(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Boolean) list.get(i5)).booleanValue();
                i4++;
            }
            this.zza.zzs(i4);
            while (i3 < list.size()) {
                this.zza.zzO(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzP(i2, ((Boolean) list.get(i3)).booleanValue());
            i3++;
        }
    }

    public final void zzd(int i2, zzgjg zzgjgVar) {
        this.zza.zzQ(i2, zzgjgVar);
    }

    public final void zze(int i2, List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.zza.zzQ(i2, (zzgjg) list.get(i3));
        }
    }

    public final void zzf(int i2, double d2) {
        this.zza.zzj(i2, Double.doubleToRawLongBits(d2));
    }

    public final void zzg(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzq(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Double) list.get(i5)).doubleValue();
                i4 += 8;
            }
            this.zza.zzs(i4);
            while (i3 < list.size()) {
                this.zza.zzk(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzj(i2, Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
            i3++;
        }
    }

    @Deprecated
    public final void zzh(int i2) {
        this.zza.zzq(i2, 4);
    }

    public final void zzi(int i2, int i3) {
        this.zza.zzl(i2, i3);
    }

    public final void zzj(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzq(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzgjv.zzy(((Integer) list.get(i5)).intValue());
            }
            this.zza.zzs(i4);
            while (i3 < list.size()) {
                this.zza.zzm(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzl(i2, ((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public final void zzk(int i2, int i3) {
        this.zza.zzh(i2, i3);
    }

    public final void zzl(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzq(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Integer) list.get(i5)).intValue();
                i4 += 4;
            }
            this.zza.zzs(i4);
            while (i3 < list.size()) {
                this.zza.zzi(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzh(i2, ((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public final void zzm(int i2, long j2) {
        this.zza.zzj(i2, j2);
    }

    public final void zzn(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzq(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Long) list.get(i5)).longValue();
                i4 += 8;
            }
            this.zza.zzs(i4);
            while (i3 < list.size()) {
                this.zza.zzk(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzj(i2, ((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public final void zzo(int i2, float f2) {
        this.zza.zzh(i2, Float.floatToRawIntBits(f2));
    }

    public final void zzp(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzq(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Float) list.get(i5)).floatValue();
                i4 += 4;
            }
            this.zza.zzs(i4);
            while (i3 < list.size()) {
                this.zza.zzi(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzh(i2, Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
            i3++;
        }
    }

    public final void zzq(int i2, Object obj, zzgmr zzgmrVar) {
        zzgjv zzgjvVar = this.zza;
        zzgjvVar.zzq(i2, 3);
        zzgmrVar.zzn((zzgly) obj, zzgjvVar.zze);
        zzgjvVar.zzq(i2, 4);
    }

    public final void zzr(int i2, int i3) {
        this.zza.zzl(i2, i3);
    }

    public final void zzs(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzq(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzgjv.zzy(((Integer) list.get(i5)).intValue());
            }
            this.zza.zzs(i4);
            while (i3 < list.size()) {
                this.zza.zzm(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzl(i2, ((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public final void zzt(int i2, long j2) {
        this.zza.zzt(i2, j2);
    }

    public final void zzu(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzq(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzgjv.zzF(((Long) list.get(i5)).longValue());
            }
            this.zza.zzs(i4);
            while (i3 < list.size()) {
                this.zza.zzu(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzt(i2, ((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public final void zzv(int i2, Object obj, zzgmr zzgmrVar) {
        this.zza.zzn(i2, (zzgly) obj, zzgmrVar);
    }

    public final void zzw(int i2, int i3) {
        this.zza.zzh(i2, i3);
    }

    public final void zzx(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzq(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Integer) list.get(i5)).intValue();
                i4 += 4;
            }
            this.zza.zzs(i4);
            while (i3 < list.size()) {
                this.zza.zzi(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzh(i2, ((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public final void zzy(int i2, long j2) {
        this.zza.zzj(i2, j2);
    }

    public final void zzz(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzq(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Long) list.get(i5)).longValue();
                i4 += 8;
            }
            this.zza.zzs(i4);
            while (i3 < list.size()) {
                this.zza.zzk(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzj(i2, ((Long) list.get(i3)).longValue());
            i3++;
        }
    }
}
