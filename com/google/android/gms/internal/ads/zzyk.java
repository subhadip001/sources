package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzyk implements zzzv {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzyk(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
            return;
        }
        int i2 = length - 1;
        this.zzf = jArr2[i2] + jArr3[i2];
    }

    public final String toString() {
        int i2 = this.zza;
        String arrays = Arrays.toString(this.zzb);
        String arrays2 = Arrays.toString(this.zzc);
        String arrays3 = Arrays.toString(this.zze);
        String arrays4 = Arrays.toString(this.zzd);
        StringBuilder sb = new StringBuilder();
        sb.append("ChunkIndex(length=");
        sb.append(i2);
        sb.append(", sizes=");
        sb.append(arrays);
        sb.append(", offsets=");
        a.R(sb, arrays2, ", timeUs=", arrays3, ", durationsUs=");
        return a.u(sb, arrays4, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final long zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzt zzg(long j2) {
        int zzd = zzeg.zzd(this.zze, j2, true, true);
        zzzw zzzwVar = new zzzw(this.zze[zzd], this.zzc[zzd]);
        if (zzzwVar.zzb < j2 && zzd != this.zza - 1) {
            int i2 = zzd + 1;
            return new zzzt(zzzwVar, new zzzw(this.zze[i2], this.zzc[i2]));
        }
        return new zzzt(zzzwVar, zzzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final boolean zzh() {
        return true;
    }
}
