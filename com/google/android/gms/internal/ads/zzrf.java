package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzrf implements zztr {
    public final zztr zza;
    public final /* synthetic */ zzrg zzb;
    private boolean zzc;

    public zzrf(zzrg zzrgVar, zztr zztrVar) {
        this.zzb = zzrgVar;
        this.zza = zztrVar;
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final int zza(zzja zzjaVar, zzgc zzgcVar, int i2) {
        if (this.zzb.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzgcVar.zzc(4);
            return -4;
        }
        int zza = this.zza.zza(zzjaVar, zzgcVar, i2);
        if (zza == -5) {
            zzad zzadVar = zzjaVar.zza;
            Objects.requireNonNull(zzadVar);
            int i3 = zzadVar.zzC;
            if (i3 == 0) {
                if (zzadVar.zzD != 0) {
                    i3 = 0;
                }
                return -5;
            }
            int i4 = this.zzb.zzb == Long.MIN_VALUE ? zzadVar.zzD : 0;
            zzab zzb = zzadVar.zzb();
            zzb.zzC(i3);
            zzb.zzD(i4);
            zzjaVar.zza = zzb.zzY();
            return -5;
        }
        zzrg zzrgVar = this.zzb;
        long j2 = zzrgVar.zzb;
        if (j2 == Long.MIN_VALUE || ((zza != -4 || zzgcVar.zzd < j2) && !(zza == -3 && zzrgVar.zzb() == Long.MIN_VALUE && !zzgcVar.zzc))) {
            return zza;
        }
        zzgcVar.zzb();
        zzgcVar.zzc(4);
        this.zzc = true;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final int zzb(long j2) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j2);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final void zzd() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}
