package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzst extends zzrk {
    private static final zzbb zza;
    private final zzsd[] zzb;
    private final zzci[] zzc;
    private final ArrayList zzd;
    private final Map zze;
    private final zzfsd zzf;
    private int zzg;
    private long[][] zzh;
    private zzss zzi;
    private final zzrm zzj;

    static {
        zzah zzahVar = new zzah();
        zzahVar.zza("MergingMediaSource");
        zza = zzahVar.zzc();
    }

    public zzst(boolean z, boolean z2, zzsd... zzsdVarArr) {
        zzrm zzrmVar = new zzrm();
        this.zzb = zzsdVarArr;
        this.zzj = zzrmVar;
        this.zzd = new ArrayList(Arrays.asList(zzsdVarArr));
        this.zzg = -1;
        this.zzc = new zzci[zzsdVarArr.length];
        this.zzh = new long[0];
        this.zze = new HashMap();
        this.zzf = zzfsk.zzb(8).zzb(2).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzB(zzrz zzrzVar) {
        zzsr zzsrVar = (zzsr) zzrzVar;
        int i2 = 0;
        while (true) {
            zzsd[] zzsdVarArr = this.zzb;
            if (i2 >= zzsdVarArr.length) {
                return;
            }
            zzsdVarArr[i2].zzB(zzsrVar.zzn(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final zzrz zzD(zzsb zzsbVar, zzvw zzvwVar, long j2) {
        int length = this.zzb.length;
        zzrz[] zzrzVarArr = new zzrz[length];
        int zza2 = this.zzc[0].zza(zzsbVar.zza);
        for (int i2 = 0; i2 < length; i2++) {
            zzrzVarArr[i2] = this.zzb[i2].zzD(zzsbVar.zzc(this.zzc[i2].zzf(zza2)), zzvwVar, j2 - this.zzh[zza2][i2]);
        }
        return new zzsr(this.zzj, this.zzh[zza2], zzrzVarArr, null);
    }

    @Override // com.google.android.gms.internal.ads.zzrk, com.google.android.gms.internal.ads.zzrc
    public final void zzn(zzft zzftVar) {
        super.zzn(zzftVar);
        for (int i2 = 0; i2 < this.zzb.length; i2++) {
            zzy(Integer.valueOf(i2), this.zzb[i2]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrk, com.google.android.gms.internal.ads.zzrc
    public final void zzq() {
        super.zzq();
        Arrays.fill(this.zzc, (Object) null);
        this.zzg = -1;
        this.zzi = null;
        this.zzd.clear();
        Collections.addAll(this.zzd, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzrk
    public final /* bridge */ /* synthetic */ zzsb zzv(Object obj, zzsb zzsbVar) {
        if (((Integer) obj).intValue() == 0) {
            return zzsbVar;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzrk, com.google.android.gms.internal.ads.zzsd
    public final void zzw() {
        zzss zzssVar = this.zzi;
        if (zzssVar == null) {
            super.zzw();
            return;
        }
        throw zzssVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrk
    public final /* bridge */ /* synthetic */ void zzx(Object obj, zzsd zzsdVar, zzci zzciVar) {
        int i2;
        if (this.zzi != null) {
            return;
        }
        if (this.zzg == -1) {
            i2 = zzciVar.zzb();
            this.zzg = i2;
        } else {
            int zzb = zzciVar.zzb();
            int i3 = this.zzg;
            if (zzb != i3) {
                this.zzi = new zzss(0);
                return;
            }
            i2 = i3;
        }
        if (this.zzh.length == 0) {
            this.zzh = (long[][]) Array.newInstance(long.class, i2, this.zzc.length);
        }
        this.zzd.remove(zzsdVar);
        this.zzc[((Integer) obj).intValue()] = zzciVar;
        if (this.zzd.isEmpty()) {
            zzo(this.zzc[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final zzbb zzz() {
        zzsd[] zzsdVarArr = this.zzb;
        return zzsdVarArr.length > 0 ? zzsdVarArr[0].zzz() : zza;
    }
}
