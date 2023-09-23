package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcja implements zzayi {
    private final zzayi zza;
    private final long zzb;
    private final zzayi zzc;
    private long zzd;
    private Uri zze;

    public zzcja(zzayi zzayiVar, int i2, zzayi zzayiVar2) {
        this.zza = zzayiVar;
        this.zzb = i2;
        this.zzc = zzayiVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final int zza(byte[] bArr, int i2, int i3) {
        int i4;
        long j2 = this.zzd;
        long j3 = this.zzb;
        if (j2 < j3) {
            int zza = this.zza.zza(bArr, i2, (int) Math.min(i3, j3 - j2));
            long j4 = this.zzd + zza;
            this.zzd = j4;
            i4 = zza;
            j2 = j4;
        } else {
            i4 = 0;
        }
        if (j2 >= this.zzb) {
            int zza2 = this.zzc.zza(bArr, i2 + i4, i3 - i4);
            this.zzd += zza2;
            return i4 + zza2;
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final long zzb(zzayk zzaykVar) {
        zzayk zzaykVar2;
        this.zze = zzaykVar.zza;
        long j2 = zzaykVar.zzc;
        long j3 = this.zzb;
        zzayk zzaykVar3 = null;
        if (j2 >= j3) {
            zzaykVar2 = null;
        } else {
            long j4 = zzaykVar.zzd;
            zzaykVar2 = new zzayk(zzaykVar.zza, null, j2, j2, j4 != -1 ? Math.min(j4, j3 - j2) : j3 - j2, null, 0);
        }
        long j5 = zzaykVar.zzd;
        if (j5 == -1 || zzaykVar.zzc + j5 > this.zzb) {
            long max = Math.max(this.zzb, zzaykVar.zzc);
            long j6 = zzaykVar.zzd;
            zzaykVar3 = new zzayk(zzaykVar.zza, null, max, max, j6 != -1 ? Math.min(j6, (zzaykVar.zzc + j6) - this.zzb) : -1L, null, 0);
        }
        long zzb = zzaykVar2 != null ? this.zza.zzb(zzaykVar2) : 0L;
        long zzb2 = zzaykVar3 != null ? this.zzc.zzb(zzaykVar3) : 0L;
        this.zzd = zzaykVar.zzc;
        if (zzb2 == -1) {
            return -1L;
        }
        return zzb + zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zzd() {
        this.zza.zzd();
        this.zzc.zzd();
    }
}
