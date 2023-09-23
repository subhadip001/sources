package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzckj implements zzer {
    private final zzer zza;
    private final long zzb;
    private final zzer zzc;
    private long zzd;
    private Uri zze;

    public zzckj(zzer zzerVar, int i2, zzer zzerVar2) {
        this.zza = zzerVar;
        this.zzb = i2;
        this.zzc = zzerVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzp
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

    @Override // com.google.android.gms.internal.ads.zzer
    public final long zzb(zzew zzewVar) {
        zzew zzewVar2;
        this.zze = zzewVar.zza;
        long j2 = zzewVar.zzf;
        long j3 = this.zzb;
        zzew zzewVar3 = null;
        if (j2 >= j3) {
            zzewVar2 = null;
        } else {
            long j4 = zzewVar.zzg;
            zzewVar2 = new zzew(zzewVar.zza, null, j2, j2, j4 != -1 ? Math.min(j4, j3 - j2) : j3 - j2, null, 0);
        }
        long j5 = zzewVar.zzg;
        if (j5 == -1 || zzewVar.zzf + j5 > this.zzb) {
            long max = Math.max(this.zzb, zzewVar.zzf);
            long j6 = zzewVar.zzg;
            zzewVar3 = new zzew(zzewVar.zza, null, max, max, j6 != -1 ? Math.min(j6, (zzewVar.zzf + j6) - this.zzb) : -1L, null, 0);
        }
        long zzb = zzewVar2 != null ? this.zza.zzb(zzewVar2) : 0L;
        long zzb2 = zzewVar3 != null ? this.zzc.zzb(zzewVar3) : 0L;
        this.zzd = zzewVar.zzf;
        if (zzb == -1 || zzb2 == -1) {
            return -1L;
        }
        return zzb + zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final void zzd() {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzer, com.google.android.gms.internal.ads.zzfo
    public final Map zze() {
        return zzfrk.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final void zzf(zzft zzftVar) {
    }
}
