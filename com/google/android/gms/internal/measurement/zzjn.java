package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class zzjn implements zzng {
    private final zzjm zza;

    private zzjn(zzjm zzjmVar) {
        zzkn.zzf(zzjmVar, "output");
        this.zza = zzjmVar;
        zzjmVar.zza = this;
    }

    public static zzjn zza(zzjm zzjmVar) {
        zzjn zzjnVar = zzjmVar.zza;
        return zzjnVar != null ? zzjnVar : new zzjn(zzjmVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzA(int i2, int i3) {
        this.zza.zzp(i2, (i3 >> 31) ^ (i3 + i3));
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzB(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzo(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                int intValue = ((Integer) list.get(i5)).intValue();
                i4 += zzjm.zzA((intValue >> 31) ^ (intValue + intValue));
            }
            this.zza.zzq(i4);
            while (i3 < list.size()) {
                zzjm zzjmVar = this.zza;
                int intValue2 = ((Integer) list.get(i3)).intValue();
                zzjmVar.zzq((intValue2 >> 31) ^ (intValue2 + intValue2));
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            zzjm zzjmVar2 = this.zza;
            int intValue3 = ((Integer) list.get(i3)).intValue();
            zzjmVar2.zzp(i2, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzC(int i2, long j2) {
        this.zza.zzr(i2, (j2 >> 63) ^ (j2 + j2));
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzD(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzo(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                long longValue = ((Long) list.get(i5)).longValue();
                i4 += zzjm.zzB((longValue >> 63) ^ (longValue + longValue));
            }
            this.zza.zzq(i4);
            while (i3 < list.size()) {
                zzjm zzjmVar = this.zza;
                long longValue2 = ((Long) list.get(i3)).longValue();
                zzjmVar.zzs((longValue2 >> 63) ^ (longValue2 + longValue2));
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            zzjm zzjmVar2 = this.zza;
            long longValue3 = ((Long) list.get(i3)).longValue();
            zzjmVar2.zzr(i2, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    @Deprecated
    public final void zzE(int i2) {
        this.zza.zzo(i2, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzF(int i2, String str) {
        this.zza.zzm(i2, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzG(int i2, List list) {
        int i3 = 0;
        if (list instanceof zzku) {
            zzku zzkuVar = (zzku) list;
            while (i3 < list.size()) {
                Object zzf = zzkuVar.zzf(i3);
                if (zzf instanceof String) {
                    this.zza.zzm(i2, (String) zzf);
                } else {
                    this.zza.zze(i2, (zzje) zzf);
                }
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzm(i2, (String) list.get(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzH(int i2, int i3) {
        this.zza.zzp(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzI(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzo(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzjm.zzA(((Integer) list.get(i5)).intValue());
            }
            this.zza.zzq(i4);
            while (i3 < list.size()) {
                this.zza.zzq(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzp(i2, ((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzJ(int i2, long j2) {
        this.zza.zzr(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzK(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzo(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzjm.zzB(((Long) list.get(i5)).longValue());
            }
            this.zza.zzq(i4);
            while (i3 < list.size()) {
                this.zza.zzs(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzr(i2, ((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzb(int i2, boolean z) {
        this.zza.zzd(i2, z);
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzc(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzo(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Boolean) list.get(i5)).booleanValue();
                i4++;
            }
            this.zza.zzq(i4);
            while (i3 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzd(i2, ((Boolean) list.get(i3)).booleanValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzd(int i2, zzje zzjeVar) {
        this.zza.zze(i2, zzjeVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zze(int i2, List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.zza.zze(i2, (zzje) list.get(i3));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzf(int i2, double d2) {
        this.zza.zzh(i2, Double.doubleToRawLongBits(d2));
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzg(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzo(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Double) list.get(i5)).doubleValue();
                i4 += 8;
            }
            this.zza.zzq(i4);
            while (i3 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzh(i2, Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    @Deprecated
    public final void zzh(int i2) {
        this.zza.zzo(i2, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzi(int i2, int i3) {
        this.zza.zzj(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzj(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzo(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzjm.zzv(((Integer) list.get(i5)).intValue());
            }
            this.zza.zzq(i4);
            while (i3 < list.size()) {
                this.zza.zzk(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzj(i2, ((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzk(int i2, int i3) {
        this.zza.zzf(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzl(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzo(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Integer) list.get(i5)).intValue();
                i4 += 4;
            }
            this.zza.zzq(i4);
            while (i3 < list.size()) {
                this.zza.zzg(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzf(i2, ((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzm(int i2, long j2) {
        this.zza.zzh(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzn(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzo(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Long) list.get(i5)).longValue();
                i4 += 8;
            }
            this.zza.zzq(i4);
            while (i3 < list.size()) {
                this.zza.zzi(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzh(i2, ((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzo(int i2, float f2) {
        this.zza.zzf(i2, Float.floatToRawIntBits(f2));
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzp(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzo(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Float) list.get(i5)).floatValue();
                i4 += 4;
            }
            this.zza.zzq(i4);
            while (i3 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzf(i2, Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzq(int i2, Object obj, zzlx zzlxVar) {
        zzjm zzjmVar = this.zza;
        zzjmVar.zzo(i2, 3);
        zzlxVar.zzi((zzlm) obj, zzjmVar.zza);
        zzjmVar.zzo(i2, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzr(int i2, int i3) {
        this.zza.zzj(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzs(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzo(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzjm.zzv(((Integer) list.get(i5)).intValue());
            }
            this.zza.zzq(i4);
            while (i3 < list.size()) {
                this.zza.zzk(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzj(i2, ((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzt(int i2, long j2) {
        this.zza.zzr(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzu(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzo(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzjm.zzB(((Long) list.get(i5)).longValue());
            }
            this.zza.zzq(i4);
            while (i3 < list.size()) {
                this.zza.zzs(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzr(i2, ((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzv(int i2, Object obj, zzlx zzlxVar) {
        zzlm zzlmVar = (zzlm) obj;
        zzjj zzjjVar = (zzjj) this.zza;
        zzjjVar.zzq((i2 << 3) | 2);
        zzjjVar.zzq(((zzio) zzlmVar).zzbr(zzlxVar));
        zzlxVar.zzi(zzlmVar, zzjjVar.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzw(int i2, int i3) {
        this.zza.zzf(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzx(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzo(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Integer) list.get(i5)).intValue();
                i4 += 4;
            }
            this.zza.zzq(i4);
            while (i3 < list.size()) {
                this.zza.zzg(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzf(i2, ((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzy(int i2, long j2) {
        this.zza.zzh(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final void zzz(int i2, List list, boolean z) {
        int i3 = 0;
        if (z) {
            this.zza.zzo(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Long) list.get(i5)).longValue();
                i4 += 8;
            }
            this.zza.zzq(i4);
            while (i3 < list.size()) {
                this.zza.zzi(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zzh(i2, ((Long) list.get(i3)).longValue());
            i3++;
        }
    }
}
