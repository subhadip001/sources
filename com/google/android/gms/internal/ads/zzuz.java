package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzuz extends zzvb implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzuz(int i2, zzck zzckVar, int i3, zzuu zzuuVar, int i4, String str) {
        super(i2, zzckVar, i3);
        zzfrh zzfrhVar;
        int i5;
        int i6 = 0;
        this.zzf = zzvf.zzi(i4, false);
        int i7 = this.zzd.zze;
        int i8 = zzuuVar.zzF;
        this.zzg = 1 == (i7 & 1);
        this.zzh = (i7 & 2) != 0;
        if (zzuuVar.zzv.isEmpty()) {
            zzfrhVar = zzfrh.zzp("");
        } else {
            zzfrhVar = zzuuVar.zzv;
        }
        int i9 = 0;
        while (true) {
            if (i9 >= zzfrhVar.size()) {
                i9 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                i5 = 0;
                break;
            }
            i5 = zzvf.zza(this.zzd, (String) zzfrhVar.get(i9), false);
            if (i5 > 0) {
                break;
            }
            i9++;
        }
        this.zzi = i9;
        this.zzj = i5;
        int i10 = this.zzd.zzf;
        int bitCount = Integer.bitCount(0);
        this.zzk = bitCount;
        int i11 = this.zzd.zzf;
        this.zzm = false;
        int zza = zzvf.zza(this.zzd, str, zzvf.zzf(str) == null);
        this.zzl = zza;
        boolean z = i5 > 0 || (zzuuVar.zzv.isEmpty() && bitCount > 0) || this.zzg || (this.zzh && zza > 0);
        if (zzvf.zzi(i4, zzuuVar.zzP) && z) {
            i6 = 1;
        }
        this.zze = i6;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzuz zzuzVar) {
        zzfqw zzb = zzfqw.zzj().zzd(this.zzf, zzuzVar.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzuzVar.zzi), zzfsp.zzc().zza()).zzb(this.zzj, zzuzVar.zzj).zzb(this.zzk, zzuzVar.zzk).zzd(this.zzg, zzuzVar.zzg).zzc(Boolean.valueOf(this.zzh), Boolean.valueOf(zzuzVar.zzh), this.zzj == 0 ? zzfsp.zzc() : zzfsp.zzc().zza()).zzb(this.zzl, zzuzVar.zzl);
        if (this.zzk == 0) {
            zzb = zzb.zze(false, false);
        }
        return zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final /* bridge */ /* synthetic */ boolean zzc(zzvb zzvbVar) {
        zzuz zzuzVar = (zzuz) zzvbVar;
        return false;
    }
}
