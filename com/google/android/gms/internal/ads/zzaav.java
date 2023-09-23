package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaav implements zzys {
    private zzyv zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzacs zzg;
    private zzyt zzh;
    private zzaay zzi;
    private zzaeo zzj;
    private final zzdy zza = new zzdy(6);
    private long zzf = -1;

    private final int zze(zzyt zzytVar) {
        this.zza.zzC(2);
        ((zzym) zzytVar).zzm(this.zza.zzH(), 0, 2, false);
        return this.zza.zzo();
    }

    private final void zzf() {
        zzg(new zzbk[0]);
        zzyv zzyvVar = this.zzb;
        Objects.requireNonNull(zzyvVar);
        zzyvVar.zzB();
        this.zzb.zzL(new zzzu(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    private final void zzg(zzbk... zzbkVarArr) {
        zzyv zzyvVar = this.zzb;
        Objects.requireNonNull(zzyvVar);
        zzzz zzv = zzyvVar.zzv(1024, 4);
        zzab zzabVar = new zzab();
        zzabVar.zzz("image/jpeg");
        zzabVar.zzM(new zzbl(zzbkVarArr));
        zzv.zzk(zzabVar.zzY());
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x015e  */
    @Override // com.google.android.gms.internal.ads.zzys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzyt r24, com.google.android.gms.internal.ads.zzzs r25) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaav.zza(com.google.android.gms.internal.ads.zzyt, com.google.android.gms.internal.ads.zzzs):int");
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzb(zzyv zzyvVar) {
        this.zzb = zzyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzc(long j2, long j3) {
        if (j2 == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzaeo zzaeoVar = this.zzj;
            Objects.requireNonNull(zzaeoVar);
            zzaeoVar.zzc(j2, j3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final boolean zzd(zzyt zzytVar) {
        if (zze(zzytVar) != 65496) {
            return false;
        }
        int zze = zze(zzytVar);
        this.zzd = zze;
        if (zze == 65504) {
            this.zza.zzC(2);
            zzym zzymVar = (zzym) zzytVar;
            zzymVar.zzm(this.zza.zzH(), 0, 2, false);
            zzymVar.zzl(this.zza.zzo() - 2, false);
            zze = zze(zzytVar);
            this.zzd = zze;
        }
        if (zze == 65505) {
            zzym zzymVar2 = (zzym) zzytVar;
            zzymVar2.zzl(2, false);
            this.zza.zzC(6);
            zzymVar2.zzm(this.zza.zzH(), 0, 6, false);
            if (this.zza.zzs() == 1165519206 && this.zza.zzo() == 0) {
                return true;
            }
        }
        return false;
    }
}
