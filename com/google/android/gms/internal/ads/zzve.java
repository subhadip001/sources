package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzve extends zzvb {
    private final boolean zze;
    private final zzuu zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final boolean zzo;
    private final boolean zzp;
    private final int zzq;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzve(int r5, com.google.android.gms.internal.ads.zzck r6, int r7, com.google.android.gms.internal.ads.zzuu r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzve.<init>(int, com.google.android.gms.internal.ads.zzck, int, com.google.android.gms.internal.ads.zzuu, int, int, boolean):void");
    }

    public static /* synthetic */ int zza(zzve zzveVar, zzve zzveVar2) {
        zzfsp zzfspVar;
        zzfsp zza;
        zzfsp zzfspVar2;
        if (zzveVar.zze && zzveVar.zzh) {
            zza = zzvf.zzb;
        } else {
            zzfspVar = zzvf.zzb;
            zza = zzfspVar.zza();
        }
        zzfqw zzj = zzfqw.zzj();
        Integer valueOf = Integer.valueOf(zzveVar.zzi);
        Integer valueOf2 = Integer.valueOf(zzveVar2.zzi);
        boolean z = zzveVar.zzf.zzy;
        zzfspVar2 = zzvf.zzc;
        return zzj.zzc(valueOf, valueOf2, zzfspVar2).zzc(Integer.valueOf(zzveVar.zzj), Integer.valueOf(zzveVar2.zzj), zza).zzc(Integer.valueOf(zzveVar.zzi), Integer.valueOf(zzveVar2.zzi), zza).zza();
    }

    public static /* synthetic */ int zzd(zzve zzveVar, zzve zzveVar2) {
        zzfqw zzc = zzfqw.zzj().zzd(zzveVar.zzh, zzveVar2.zzh).zzb(zzveVar.zzl, zzveVar2.zzl).zzd(true, true).zzd(zzveVar.zze, zzveVar2.zze).zzd(zzveVar.zzg, zzveVar2.zzg).zzc(Integer.valueOf(zzveVar.zzk), Integer.valueOf(zzveVar2.zzk), zzfsp.zzc().zza());
        boolean z = zzveVar.zzo;
        zzfqw zzd = zzc.zzd(z, zzveVar2.zzo);
        boolean z2 = zzveVar.zzp;
        zzfqw zzd2 = zzd.zzd(z2, zzveVar2.zzp);
        if (z && z2) {
            zzd2 = zzd2.zzb(zzveVar.zzq, zzveVar2.zzq);
        }
        return zzd2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final int zzb() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final /* bridge */ /* synthetic */ boolean zzc(zzvb zzvbVar) {
        zzve zzveVar = (zzve) zzvbVar;
        if (zzeg.zzS(this.zzd.zzm, zzveVar.zzd.zzm)) {
            boolean z = this.zzf.zzJ;
            return this.zzo == zzveVar.zzo && this.zzp == zzveVar.zzp;
        }
        return false;
    }
}
