package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzuq extends zzvb implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzuu zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    public zzuq(int i2, zzck zzckVar, int i3, zzuu zzuuVar, int i4, boolean z) {
        super(i2, zzckVar, i3);
        int i5;
        int i6;
        int i7;
        boolean z2;
        this.zzh = zzuuVar;
        this.zzg = zzvf.zzf(this.zzd.zzd);
        int i8 = 0;
        this.zzi = zzvf.zzi(i4, false);
        int i9 = 0;
        while (true) {
            int size = zzuuVar.zzq.size();
            i5 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (i9 >= size) {
                i9 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                i6 = 0;
                break;
            }
            i6 = zzvf.zza(this.zzd, (String) zzuuVar.zzq.get(i9), false);
            if (i6 > 0) {
                break;
            }
            i9++;
        }
        this.zzk = i9;
        this.zzj = i6;
        int i10 = this.zzd.zzf;
        this.zzl = Integer.bitCount(0);
        zzad zzadVar = this.zzd;
        int i11 = zzadVar.zzf;
        this.zzm = true;
        this.zzp = 1 == (zzadVar.zze & 1);
        this.zzq = zzadVar.zzz;
        this.zzr = zzadVar.zzA;
        this.zzs = zzadVar.zzi;
        this.zzf = true;
        String[] zzae = zzeg.zzae();
        int i12 = 0;
        while (true) {
            if (i12 >= zzae.length) {
                i12 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                i7 = 0;
                break;
            }
            i7 = zzvf.zza(this.zzd, zzae[i12], false);
            if (i7 > 0) {
                break;
            }
            i12++;
        }
        this.zzn = i12;
        this.zzo = i7;
        int i13 = 0;
        while (true) {
            if (i13 < zzuuVar.zzu.size()) {
                String str = this.zzd.zzm;
                if (str != null && str.equals(zzuuVar.zzu.get(i13))) {
                    i5 = i13;
                    break;
                }
                i13++;
            } else {
                break;
            }
        }
        this.zzt = i5;
        this.zzu = (i4 & 128) == 128;
        this.zzv = (i4 & 64) == 64;
        zzuu zzuuVar2 = this.zzh;
        if (zzvf.zzi(i4, zzuuVar2.zzP) && ((z2 = this.zzf) || zzuuVar2.zzK)) {
            i8 = (!zzvf.zzi(i4, false) || !z2 || this.zzd.zzi == -1 || (!zzuuVar2.zzR && z)) ? 1 : 2;
        }
        this.zze = i8;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzuq zzuqVar) {
        zzfsp zzfspVar;
        zzfsp zza;
        zzfsp zzfspVar2;
        if (this.zzf && this.zzi) {
            zza = zzvf.zzb;
        } else {
            zzfspVar = zzvf.zzb;
            zza = zzfspVar.zza();
        }
        zzfqw zzc = zzfqw.zzj().zzd(this.zzi, zzuqVar.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzuqVar.zzk), zzfsp.zzc().zza()).zzb(this.zzj, zzuqVar.zzj).zzb(this.zzl, zzuqVar.zzl).zzd(this.zzp, zzuqVar.zzp).zzd(true, true).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzuqVar.zzn), zzfsp.zzc().zza()).zzb(this.zzo, zzuqVar.zzo).zzd(this.zzf, zzuqVar.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzuqVar.zzt), zzfsp.zzc().zza());
        Integer valueOf = Integer.valueOf(this.zzs);
        Integer valueOf2 = Integer.valueOf(zzuqVar.zzs);
        boolean z = this.zzh.zzy;
        zzfspVar2 = zzvf.zzc;
        zzfqw zzc2 = zzc.zzc(valueOf, valueOf2, zzfspVar2).zzd(this.zzu, zzuqVar.zzu).zzd(this.zzv, zzuqVar.zzv).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzuqVar.zzq), zza).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzuqVar.zzr), zza);
        Integer valueOf3 = Integer.valueOf(this.zzs);
        Integer valueOf4 = Integer.valueOf(zzuqVar.zzs);
        if (!zzeg.zzS(this.zzg, zzuqVar.zzg)) {
            zza = zzvf.zzc;
        }
        return zzc2.zzc(valueOf3, valueOf4, zza).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final /* bridge */ /* synthetic */ boolean zzc(zzvb zzvbVar) {
        String str;
        zzuq zzuqVar = (zzuq) zzvbVar;
        boolean z = this.zzh.zzN;
        zzad zzadVar = this.zzd;
        int i2 = zzadVar.zzz;
        if (i2 != -1) {
            zzad zzadVar2 = zzuqVar.zzd;
            if (i2 == zzadVar2.zzz && (str = zzadVar.zzm) != null && TextUtils.equals(str, zzadVar2.zzm)) {
                boolean z2 = this.zzh.zzM;
                int i3 = this.zzd.zzA;
                return i3 != -1 && i3 == zzuqVar.zzd.zzA && this.zzu == zzuqVar.zzu && this.zzv == zzuqVar.zzv;
            }
            return false;
        }
        return false;
    }
}
