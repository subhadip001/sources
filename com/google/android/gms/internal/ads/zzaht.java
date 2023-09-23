package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaht implements zzahs {
    private final zzyv zza;
    private final zzzz zzb;
    private final zzahv zzc;
    private final zzad zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaht(zzyv zzyvVar, zzzz zzzzVar, zzahv zzahvVar, String str, int i2) {
        this.zza = zzyvVar;
        this.zzb = zzzzVar;
        this.zzc = zzahvVar;
        int i3 = (zzahvVar.zzb * zzahvVar.zze) / 8;
        int i4 = zzahvVar.zzd;
        if (i4 == i3) {
            int i5 = zzahvVar.zzc * i3;
            int i6 = i5 * 8;
            int max = Math.max(i3, i5 / 10);
            this.zze = max;
            zzab zzabVar = new zzab();
            zzabVar.zzS(str);
            zzabVar.zzv(i6);
            zzabVar.zzO(i6);
            zzabVar.zzL(max);
            zzabVar.zzw(zzahvVar.zzb);
            zzabVar.zzT(zzahvVar.zzc);
            zzabVar.zzN(i2);
            this.zzd = zzabVar.zzY();
            return;
        }
        throw zzbp.zza("Expected block size: " + i3 + "; got: " + i4, null);
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final void zza(int i2, long j2) {
        this.zza.zzL(new zzahy(this.zzc, 1, i2, j2));
        this.zzb.zzk(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final void zzb(long j2) {
        this.zzf = j2;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final boolean zzc(zzyt zzytVar, long j2) {
        int i2;
        zzahv zzahvVar;
        int i3;
        int i4;
        long j3 = j2;
        while (true) {
            i2 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i2 <= 0 || (i3 = this.zzg) >= (i4 = this.zze)) {
                break;
            }
            int zza = zzzx.zza(this.zzb, zzytVar, (int) Math.min(i4 - i3, j3), true);
            if (zza == -1) {
                j3 = 0;
            } else {
                this.zzg += zza;
                j3 -= zza;
            }
        }
        int i5 = this.zzc.zzd;
        int i6 = this.zzg / i5;
        if (i6 > 0) {
            long j4 = this.zzf;
            long zzw = zzeg.zzw(this.zzh, 1000000L, zzahvVar.zzc);
            int i7 = i6 * i5;
            int i8 = this.zzg - i7;
            this.zzb.zzs(j4 + zzw, 1, i7, i8, null);
            this.zzh += i6;
            this.zzg = i8;
        }
        return i2 <= 0;
    }
}
